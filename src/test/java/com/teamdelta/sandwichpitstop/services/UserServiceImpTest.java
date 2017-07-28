package com.teamdelta.sandwichpitstop.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.teamdelta.sandwichpitstop.dao.UserDAO;
import com.teamdelta.sandwichpitstop.dm.User;
import com.teamdelta.sandwichpitstop.dm.UserRoleEnum;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImpTest {

	@InjectMocks
	private UserServiceImp userService;

	@Mock
	private UserDAO userDAO;

	@Test
	public void findAllUsers() {
		// Setup
		List<User> users = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			User user = new User();
			user.setPassword(null);
			user.setSandwiches(null);
			user.setType(Math.random() < 0.5 ? UserRoleEnum.ADMIN : UserRoleEnum.COOK);
			user.setUserId(i);
			user.setUsername("User " + i);
		}
		when(userDAO.findAll()).thenReturn(users);

		// Test
		Iterable<User> result = userService.findAllUsers();

		// Verify
		assertEquals(users, result);
	}

	@Test
	public void findUser() {
		// Setup
		String username = "username";
		String password = "password";
		
		User user = new User();
		user.setPassword(password);
		user.setUsername(username);
		
		when(userDAO.findUser(username, password)).thenReturn(user);

		// Test
		User result = userService.findUser(username, password);

		// Verify
		assertEquals(username, result.getUsername());
	}
}
