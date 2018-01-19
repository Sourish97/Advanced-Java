package com.onkar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connectionDB {
	Connection connect;
    PreparedStatement pstatement;
    boolean i;
    public connectionDB(){
    	try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");   	
        } catch (SQLException ex) {
            //Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("While Connect" + ex);
        }
    }
        
//        public void insert(String name,String email,String password,String phone){
//        	try {
//				pstatement=connect.prepareStatement("insert into personalinfo values(?,?,?,?);");
//				pstatement.setString(1, name);
//        		pstatement.setString(2, email);
//        		pstatement.setString(3, phone);
//        		pstatement.setString(4, password);
//				pstatement.execute();
//        	} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//        	
//        }
        
        public ResultSet check(String username)
        {
			ResultSet rs = null;	
        	try {
					pstatement=connect.prepareStatement("select * from studentinfo where name=?");
					pstatement.setString(1, username);
					rs=pstatement.executeQuery();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return rs;
        }
        
        public void updateDB(ResultSet rs2,String email,String password,String phone)
        {	
					try {
						pstatement=connect.prepareStatement("Update personalinfo set email=?,phone=?,password=? where name=? and password=?;");
						pstatement.setString(1, email);
						pstatement.setString(2, phone);
						pstatement.setString(3, password);
						pstatement.setString(4, rs2.getString(1));
						pstatement.setString(5, rs2.getString(4));
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
