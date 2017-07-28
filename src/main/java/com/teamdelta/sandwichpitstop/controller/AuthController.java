package com.teamdelta.sandwichpitstop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamdelta.sandwichpitstop.dm.User;
import com.teamdelta.sandwichpitstop.services.UserService;

import lombok.Getter;

@RestController
@RequestMapping("api/login")
public class AuthController {
	
	@Autowired
	@Getter
	private UserService userService;
	
	@GetMapping(value={"","/"})
	public User login(String username, String password) {
		return userService.findUser(username, password);
	}

}
