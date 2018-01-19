package com.sourish.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sourish.classes.Info;
import com.sourish.dao.StudentDao;

public class StudentService {
StudentDao connect;
public StudentService(){
	connect=new StudentDao();
}
public ArrayList<Info> requestUser(String username) throws SQLException{
	ResultSet rs=connect.getData(username);
	Info obj;
	ArrayList<Info> a=new ArrayList<Info>();
	if(rs.next()){
		obj=new Info();
		obj.name="Name";
		obj.value=rs.getString(1);
		a.add(obj);
		obj=new Info();
		obj.name="Physics";
		obj.value=rs.getInt(2)+"";
		a.add(obj);
		obj=new Info();
		obj.name="Chemistry";
		obj.value=rs.getInt(3)+"";
		a.add(obj);
		obj=new Info();
		obj.name="Maths";
		obj.value=rs.getInt(4)+"";
		a.add(obj);
	}
	return a;
}
}
