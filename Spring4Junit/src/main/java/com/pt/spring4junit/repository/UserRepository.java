package com.pt.spring4junit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pt.spring4junit.PtSpring4Junit;
import com.pt.spring4junit.data.User;

public interface UserRepository extends MongoRepository<User, String>, PtSpring4Junit {
	
	public User findById(String id);
	

}
