/**
 * 
 */
package com.pt.spring4junit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.spring4junit.data.User;
import com.pt.spring4junit.repository.UserRepository;
import com.pt.spring4junit.service.UserService;

/**
 * @author govardhan
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	/**
	 * 
	 */
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return new User();
	}

	@Override
	public Long getUserCount() {
		// TODO Auto-generated method stub
		return userRepository.count();
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

}
