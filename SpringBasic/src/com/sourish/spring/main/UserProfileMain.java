package com.sourish.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sourish.spring.bo.UserProfileBO;
import com.sourish.spring.dto.UserProfile;

public class UserProfileMain {
	public static void main(String[] args){
		ApplicationContext appContext=new ClassPathXmlApplicationContext("/applicationContext.xml");
		UserProfileBO bo=(UserProfileBO) appContext.getBean("UserProfileBOImpl");
		
		System.out.println("Updated result:  "+bo.updateUserProfile(getUserProfileData()));
	}
	
	private static UserProfile getUserProfileData(){
		UserProfile newUser = new UserProfile();
		
		newUser.setUsername("sourish.vaghulade");
		newUser.setEmail("sourishvaghulade@gmail.com");
		newUser.setType("student");
		
		return newUser;
	}
}
