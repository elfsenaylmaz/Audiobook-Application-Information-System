package Audiobook;

import java.sql.*;
import java.time.LocalDate;

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
			stmt.setString(1,fname);
			stmt.setString(2,lname);
			stmt.setString(3,userName);
			stmt.setString(4,mail);
			stmt.setString(5,psswd);
			
			LocalDate localDate = LocalDate.of(year, month, day);
		    java.sql.Date date = Date.valueOf(localDate);
		    
			stmt.setDate(6,date);
			stmt.executeUpdate();
			return true;
		}else {
			System.out.println("A user with this username already exists");
			return false;
		}
		
	}
	
	
	public int rental(String user_ssn, String bookid, java.sql.Date rentDay, int dayLimit) throws Exception{
		//daha bitmedi
		CallableStatement cstmt = connection.prepareCall("begin ? := calculateprice(?,?); end;");
		
		cstmt.registerOutParameter(1, Types.INTEGER);
		
		cstmt.setInt(2, dayLimit);
		cstmt.setString(3, bookid);
		cstmt.execute();
		int result = cstmt.getInt(1);
		System.out.print("Result: " + result);
		return result;
	}

}
