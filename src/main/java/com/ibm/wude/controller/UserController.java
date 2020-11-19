package com.ibm.wude.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.wude.model.UserModel;
import com.ibm.wude.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/getAllUser")
	public List<UserModel> getAllUser(){
		List<UserModel> list = userService.getAllUser();
		return list;
	}
	@GetMapping("/addUser")
	public int addUser(@RequestBody UserModel user) {
		return userService.addUser(user);
		
	}
	
}
