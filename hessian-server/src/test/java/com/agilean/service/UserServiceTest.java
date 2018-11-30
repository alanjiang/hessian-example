package com.agilean.service;

import com.agilean.service.UserService;
import com.caucho.hessian.client.HessianProxyFactory;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.net.MalformedURLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/resources/applicationContext.xml")
public class UserServiceTest {

   @Autowired
   private  HessianProxyFactory  hessianProxyFactory;
   @Autowired
   private  UserService  userService;
   @Autowired
   Environment env;
   @Test
   public void test() throws Exception{
	   
	     UserService proxyUserservice = (UserService) hessianProxyFactory.create(UserService.class,
       		env.getProperty("service.login.url"));
         System.out.println(proxyUserservice.login("Alan", "Alan"));
         
         System.out.println("real:"+proxyUserservice.login("Alan", "Alan"));
   }
   
    /*@Test
    public void test(){
        HessianProxyFactory factory = new HessianProxyFactory();
        String url = "http://localhost:8080/hessian-server/service/login";
        try {
            UserService userService = (UserService) factory.create(UserService.class, url);
            System.out.println(userService.login("Alan", "Alan"));
            
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }*/

}
