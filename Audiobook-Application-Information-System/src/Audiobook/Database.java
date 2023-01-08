package Audiobook;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
public class Database {

    public Connection connection;
	public Database() throws Exception{
    	SQLConnection SQLconnection = new SQLConnection();
    	connection = SQLconnection.getConnection();
    }
	
	public String userLogin(String userName, String password) throws Exception{
		String ssn, psswd;
		String query = "SELECT ssn, psswd FROM users WHERE nickname = ?";
		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setString(1, userName);
		ResultSet result = pstmt.executeQuery();
		
		if(!result.next()) {
			return null; 
		}else {
			psswd = result.getString(2);
			if(psswd.compareTo(password)==0) {
				ssn = result.getString(1);
				return ssn;
			}
		}
		return null;
		
	}
	
	public boolean userRegister(String fname,String lname,String userName,String mail,String psswd, int day, int month, int year) throws Exception {
		String query = "SELECT ssn, psswd FROM users WHERE nickname = ?";
		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setString(1, userName);
		ResultSet result = pstmt.executeQuery();
		
		if(!result.next()) {
			String query2 = "INSERT INTO users (ssn, fname, lname, nickname, mail, psswd, bdate) VALUES (nextval('userseq'), ?, ? ,? ,?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(query2);
			
			String date = year + "-" + month + "-" + day;
			java.sql.Date bdate = java.sql.Date.valueOf(date);
		    
			stmt.setString(1,fname);
			stmt.setString(2,lname);
			stmt.setString(3,userName);
			stmt.setString(4,mail);
			stmt.setString(5,psswd);
			stmt.setDate(6,bdate);
			stmt.executeUpdate();
			return true;
		}else {
			System.out.println("A user with this username already exists");
			return false;
		}
		
	}
	
	public int rental(String user_ssn, String bookid, int dayLimit) throws Exception{
		CallableStatement cstmt = connection.prepareCall("{? = call calculateprice(?,?)}");
		cstmt.registerOutParameter(1, Types.INTEGER);
		cstmt.setInt(2, dayLimit);
		cstmt.setString(3, bookid);
		cstmt.execute();
		int price = cstmt.getInt(1);
		long millis=System.currentTimeMillis();  
	    java.sql.Date date = new java.sql.Date(millis);  

		String query2 = "INSERT INTO rental (id, ussn, bookid, rentday, daylimit, price) VALUES (nextval('rentalseq'), ?, ? ,? ,?, ?)";
		PreparedStatement stmt = connection.prepareStatement(query2);
		stmt.setString(1,user_ssn);
		stmt.setString(2,bookid);
		stmt.setDate(3,date);
		stmt.setInt(4,dayLimit);
		stmt.setInt(5,price);
		return stmt.executeUpdate(); //1 se eklendi 0 sa eklenemedi
		
	}
	
	public ArrayList<String> listCategories() throws Exception{
		ArrayList<String> list = new ArrayList<String>();
		String query = "select distinct category from  books order by category";
		PreparedStatement pstmt = connection.prepareStatement(query);
		ResultSet result = pstmt.executeQuery();
	
		while(result.next()) {
			list.add(result.getString(1));
		}
		return list;
	}
	
	public void deleteAccount(String user_ssn) throws Exception{
		String query = "delete from users where ssn = ?";
		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setString(1, user_ssn);
		pstmt.executeUpdate();
	}
	
	public ArrayList<Record>  searchBook(String bookName) throws Exception{
		CallableStatement cstmt = connection.prepareCall("{? = call SearchBook(?)}");
		cstmt.registerOutParameter(1,2003);
		cstmt.setString(2, bookName);
		cstmt.execute();
		java.sql.Array type = (java.sql.Array) cstmt.getObject(1);
		ResultSet rs = type.getResultSet();
		ArrayList<Record> records = new ArrayList<Record>();
		while(rs.next()) {
			Record rec = new Record();
			String line = rs.getString(2);
			String line2 = line.substring(1, line.length()-1);
			String[] arrStr = line2.split(",");
			rec.bookName = arrStr[0];
			rec.author = arrStr[1].substring(1, arrStr[1].length()-1);
			rec.narrator = arrStr[2] + " " +arrStr[3];
			rec.time = Integer.parseInt(arrStr[4]);
			records.add(rec);
		}
		
		return records;
	}
	//sadece kategori adýný döndürdüm ona sonra tekrar bakarýz belki numarayý da döndürelim mi diye
	// sql tarafýndaki fonksiyonda havingde fname deðil ssn kontrol edicek þekilde deðiþiklik yaptým elimizde ssn olduðu için
	public String favCategory(String user_ssn) throws SQLException {
		CallableStatement cstmt = connection.prepareCall("{call favCategory(?,?,?)}");
		cstmt.registerOutParameter(2, Types.INTEGER);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(1,user_ssn);
		cstmt.execute();
		int num = cstmt.getInt(2);
		String category = cstmt.getString(3);
		return category;
		
	}
	
	public void increaseBalance(int amonut,String user_ssn) throws SQLException{
		CallableStatement cstmt = connection.prepareCall("{call increaseBalance(?,?)}");
		cstmt.setInt(1, amonut);
		cstmt.setString(2,user_ssn);
		cstmt.execute();
	}
	
	public void createView(String user_ssn) throws SQLException{
        CallableStatement cstmt = connection.prepareCall("{call createView(?)}");
        cstmt.setString(1, user_ssn);
        cstmt.execute();
    }


}
