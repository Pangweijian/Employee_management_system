package com.ibm.wude.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ibm.wude.model.UserModel;

@Mapper
public interface UserMapper {

	public List<UserModel> getAllUser();
	public int addUser(UserModel user);
}
