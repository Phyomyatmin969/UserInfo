package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;
import com.example.demo.model.UserDto;

public interface userService {
	List<User>getAllUser();
	User getUserById(long id);
	void deleteUserById(long id);
	void createUser(UserDto UserDto);
	void editUser(long id, UserDto userDto);

}
