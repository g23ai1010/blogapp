package com.blogmanagement.services;

import java.util.List;

import com.blogmanagement.payloads.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer userId);
	
	
}
