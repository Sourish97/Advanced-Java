package com.onkar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionDB {

	//String query = "insert into basic_info values(?,?,?)";
    Connection connect;
    PreparedStatement pstatement;
	
    public ConnectionDB(){
    	try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/FirstDB", "root", "neebal123");   	
        } catch (SQLException ex) {
            //Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("While Connect" + ex);
        }
    }
        
        public void insert(String username,int age){
        	try {
				pstatement=connect.prepareStatement("insert into studentinfo values(?,?);");
				pstatement.setString(1, username);
        		pstatement.setInt(2, age);
				pstatement.execute();
        	} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
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
