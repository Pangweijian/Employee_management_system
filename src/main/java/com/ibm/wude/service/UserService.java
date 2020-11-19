package com.ibm.wude.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.wude.mapper.UserMapper;
import com.ibm.wude.model.UserModel;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;
	public List<UserModel> getAllUser() {
		return userMapper.getAllUser();
	}
	
	public int  addUser(UserModel user) {
		return userMapper.addUser(user);
	}
	
}
