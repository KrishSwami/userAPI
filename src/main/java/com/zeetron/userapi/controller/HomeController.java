package com.zeetron.userapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zeetron.userapi.UserService;
import com.zeetron.userapi.model.User;

@RestController
public class HomeController {

	@Autowired
	private UserService userService;
	
	  @GetMapping ("/getuser")
	  public List<User> getUser()
	  {
		  return userService.getAllUsers();
	  }
	  
	  @PostMapping ("/saveuser")
	  public String saveUser(@RequestBody User user)
	  {
		  userService.saveUser(user);
		  return "success";
	  }
}
