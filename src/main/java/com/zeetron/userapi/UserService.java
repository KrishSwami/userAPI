package com.zeetron.userapi;

import java.util.List;

import com.zeetron.userapi.model.User;


public interface UserService {

	List<User> getAllUsers();

	void saveUser(User user);

}
