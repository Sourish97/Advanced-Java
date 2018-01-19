package com.sourish.spring.dao;

import javax.sql.DataSource;

import com.sourish.spring.dto.UserProfile;

public class UserProfileDaoImpl implements UserProfileDao{
	DataSource dataSource;
 public int updateProfile(UserProfile userprofile){
	 return 1;
 }
 public void setDataSource(DataSource dataSource){
	 this.dataSource=dataSource;
 }
}
