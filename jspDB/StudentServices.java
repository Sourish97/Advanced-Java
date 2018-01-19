package com.onkar.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.onkar.classes.info;
import com.onkar.dao.connectionDB;

public class StudentServices {
connectionDB connect;
ResultSet rs;
ArrayList<info> a;
info inf;
public StudentServices(){
	connect=new connectionDB();
	
}

public ArrayList<info> requestInfo(String username)
{
	a=new ArrayList<info>();
	
	rs=connect.check(username);
	try {
		rs.next();
		inf=new info();
		inf.value=rs.getString(1);
		inf.name="Name";
		a.add(inf);
		inf=new info();
		inf.value=rs.getString(2);
		inf.name="Physics";
		a.add(inf);
		inf=new info();
		inf.value=rs.getString(3);
		inf.name="Chemistry";
		a.add(inf);
		inf=new info();
		inf.value=rs.getString(4);
		inf.name="Maths";
		a.add(inf);
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return a;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
