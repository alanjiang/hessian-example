package com.agilean.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agilean.dao.UserDao;
import com.agilean.entity.User;
import com.agilean.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
    @Override
    public boolean login(String userName,String password) {
    	User user=userDao.findUser();
    	System.out.println(">>>user="+user.toString());
        return (userName.equals(user.getUserName()) && password.equals(user.getPassWord()));
       
    }
	
    
    
}
