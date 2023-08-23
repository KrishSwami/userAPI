package com.zeetron.userapi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeetron.userapi.UserService;
import com.zeetron.userapi.model.User;
import com.zeetron.userapi.repo.UserRespository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRespository userRespository;
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRespository.findAll();
	}

	@Override
	public void saveUser(User user) {
		
		userRespository.save(user);
		
	}
	
}
