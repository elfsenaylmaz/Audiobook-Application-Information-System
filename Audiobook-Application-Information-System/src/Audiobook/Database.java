package Audiobook;

import java.sql.*;

public class Database {

    public Connection connection;

	public Database() throws Exception{
    	SQLConnection SQLconnection = new SQLConnection();
    	connection = SQLconnection.getConnection();
    }
	
	public String userLogin(String userName, String password) throws Exception{
		String ssn, psswd;
		String query = "SELECT ssn, psswd FROM users WHERE userName = ?";
		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setString(1, userName);
		ResultSet result = pstmt.executeQuery();
		
		if(!result.next()) {
			return null; //
		}else {
			psswd = result.getString(2);
			if(psswd.compareTo(password)==0) {
				ssn = result.getString(2);
				return ssn;
			}
		}
		return null;
		
	}
	

	
	

}
