package com.pt.spring4junit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pt.spring4junit.service.UserService;
import com.pt.spring4junit.service.impl.UserServiceImpl;

@Configuration
public class Spring4JunitServiceConfigTest {

	public Spring4JunitServiceConfigTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean
	public UserService userService(){
		return new UserServiceImpl();
	}

}
