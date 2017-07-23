package com.teamdelta.sandwichpitstop.services;

import com.teamdelta.sandwichpitstop.dm.User;

public interface UserService {
	Iterable<User> findAllUsers();
	
	User findUser(String username, String password);
}
