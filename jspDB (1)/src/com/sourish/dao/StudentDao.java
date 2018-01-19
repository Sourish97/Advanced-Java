package com.sourish.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {
	java.sql.Connection connect;
    PreparedStatement pstatement;
    
    public StudentDao(){
    	try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "");   	
        } catch (SQLException ex) {
            //Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("While Connect" + ex);
        }
    }
  
   
    public boolean check(String username,String password) throws SQLException{
    	pstatement=(PreparedStatement) connect.prepareStatement("select Username,Password from user where Username=? and Password=?;");
    	pstatement.setString(1,username);
    	pstatement.setString(2,password);
    	ResultSet rs=pstatement.executeQuery();
    	//String n=r.getString(0);
    	//String p=r.getString(2);
    	
    	if(rs.next())
		{
		
			return true;
		}
		
		else{
			return false;
		}
    		
    } 
    public ResultSet getData(String username) throws SQLException{
    	pstatement=(PreparedStatement) connect.prepareStatement("select * from marks where Name=?;");
    	pstatement.setString(1,username);
    	ResultSet rs=pstatement.executeQuery();
    	return rs;
    }
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {

        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
