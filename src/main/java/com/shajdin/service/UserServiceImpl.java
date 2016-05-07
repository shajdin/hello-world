package com.shajdin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shajdin.model.User;
import com.shajdin.repository.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	private void addUser(){
		User u = new User();
		u.setUsername("u");
		u.setPassword("p");
		userRepository.save(u);
	}

	@Override
	public List<User> getAllUsers() {	
		addUser();
		return userRepository.findAll();
	}

}
