package com.shajdin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shajdin.model.User;
import com.shajdin.service.UserService;


@RestController
public class HelloWorldController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello world vvebthnzmu !!!";
	}
	
	@RequestMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();		
	}

}
