package com.teamdelta.sandwichpitstop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamdelta.sandwichpitstop.dao.UserDAO;
import com.teamdelta.sandwichpitstop.dm.User;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public Iterable<User> findAllUsers() {
		return userDAO.findAll();
	}

	@Override
	public User findUser(String username, String password) {
		return userDAO.findUser(username, password);
	}


}
