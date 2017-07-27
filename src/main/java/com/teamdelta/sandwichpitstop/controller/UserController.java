package com.teamdelta.sandwichpitstop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamdelta.sandwichpitstop.dm.User;
import com.teamdelta.sandwichpitstop.dm.UserRoleEnum;
import com.teamdelta.sandwichpitstop.services.UserService;

import lombok.Getter;

@RestController
@RequestMapping("api/user")
public class UserController {
	
	@Autowired
	@Getter
	private UserService userService;
	
	@GetMapping(value={"","/"})
	public Iterable<User> findAllUsers() {
		return userService.findAllUsers();
	}

}
