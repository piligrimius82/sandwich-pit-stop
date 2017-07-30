package com.teamdelta.sandwichpitstop.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.teamdelta.sandwichpitstop.dm.User;
import com.teamdelta.sandwichpitstop.services.UserService;

@RunWith(MockitoJUnitRunner.class)
public class AuthControllerTest {
	
	private MockMvc mockMvc;
	
	private ObjectMapper objectMapper;
	
	@InjectMocks
	private AuthController authController;
	
	@Mock
	private UserService userService;
	
	@Before
	public void setup() throws Exception {
		this.mockMvc = MockMvcBuilders.standaloneSetup(authController)
				.build();
		
		this.objectMapper = new ObjectMapper();
	}
	
	@Test
	@Ignore
	public void login() throws Exception {
		// Setup
		String username = "username";
		String password = "password";
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		when(userService.findUser(username, password)).thenReturn(user);
		
		// Test
		String json = mockMvc.perform(get("/api/login/"))
				
		// Verify
			.andExpect(status().isOk())
			.andReturn().getResponse().getContentAsString();
		
		User result = this.objectMapper.readValue(json, User.class);
		
		assertEquals(user, result);
	}

}
