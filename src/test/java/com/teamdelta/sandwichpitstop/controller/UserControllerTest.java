package com.teamdelta.sandwichpitstop.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.teamdelta.sandwichpitstop.dm.User;
import com.teamdelta.sandwichpitstop.dm.UserRoleEnum;
import com.teamdelta.sandwichpitstop.services.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
	
	private MockMvc mockMvc;
	
	private ObjectMapper objectMapper;
	
	@InjectMocks
	private UserController userController;
	
	@Mock
	private UserService userService;
	
	@Before
	public void setup() throws Exception {
		this.mockMvc = MockMvcBuilders.standaloneSetup(userController)
				.build();
		
		this.objectMapper = new ObjectMapper();
	}
	
	@Test
	public void findAllUsers() throws Exception {
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
		when(userService.findAllUsers()).thenReturn(users);
		
		// Test
		String json = mockMvc.perform(get("/api/user"))
				
				
		// Verify
			.andExpect(status().isOk())
			.andReturn().getResponse().getContentAsString();
		
		Iterable<User> result = this.objectMapper.readValue(json, new TypeReference<Iterable<User>>() {
		});
		
		assertEquals(users, result);
	}
}
