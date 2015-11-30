package com.pt.spring4junit.service;

import com.pt.spring4junit.PtSpring4Junit;
import com.pt.spring4junit.data.User;

public interface UserService extends PtSpring4Junit{
	
	public User getUser();
	
	public Long getUserCount();
	
	public User saveUser(User user);

}
