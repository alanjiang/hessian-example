package com.agilean.dao;

import org.springframework.stereotype.Component;

import com.agilean.entity.User;

@Component("userDao")
public class UserDao {
   
	public User findUser() {
		User user=new User();
		user.setUserName("Hellen");
		user.setPassWord("Hellen");
		user.setMobile("13980008976");
		user.setEnabled("y");
		return   user;
	}
}
