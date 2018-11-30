package com.agilean.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.agilean.service.UserService;

public class DemoClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService.login("Alan", "Alan"));


    }
}
