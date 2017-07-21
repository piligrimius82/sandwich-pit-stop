package com.teamdelta.sandwichpitstop.services;

import java.util.List;

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
	
	

}
