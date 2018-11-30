package com.agilean.config;

import java.net.MalformedURLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.agilean.service.UserService;
import com.caucho.hessian.client.HessianProxyFactory;

@Configuration
@PropertySource("classpath:/common.properties")
@ComponentScan(value= {"com.agilean"})
public class CommonConfig {
	  @Autowired
	  Environment env;
	  @Bean
	  HessianProxyFactory  hessianProxyFactory () {
		  return new HessianProxyFactory();
	  }
	  

	 
	     
}
