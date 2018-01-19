package com.sourish.spring.bo;

import com.sourish.spring.dao.UserProfileDao;
import com.sourish.spring.dto.UserProfile;

public class UserProfileBOImpl implements UserProfileBO{
	private final UserProfileDao dao;
	public UserProfileBOImpl(UserProfileDao dao){
		this.dao=dao;
	}
	
	@Override
	public int updateUserProfile(UserProfile userProfile){
		return dao.updateProfile(userProfile);
	}
}
