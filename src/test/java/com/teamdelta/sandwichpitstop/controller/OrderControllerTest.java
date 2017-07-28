package com.teamdelta.sandwichpitstop.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.teamdelta.sandwichpitstop.dm.Order;
import com.teamdelta.sandwichpitstop.services.OrderService;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {
	
	private MockMvc mockMvc;
	
	private ObjectMapper objectMapper;
	
	@InjectMocks
	private OrderController orderController;
	
	@Mock
	private OrderService orderService;
	
	@Before
	public void setup() throws Exception {
		this.mockMvc = MockMvcBuilders.standaloneSetup(orderController)
				.build();
		
		this.objectMapper = new ObjectMapper();
	}
	
	@Test
	@Ignore("This will work but Order needs .equals() and .hashCode()")
	public void findOpenOrders() throws Exception {
		// Setup
		List<Order> orders = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			Order order = new Order();
			order.setCompleteTimestamp(null);
			order.setCustomerName("Customer " + i);
			order.setOrderId(i);
			order.setPlacedTimestamp(new Date());
			order.setSandwiches(null);
			
			orders.add(order);
		}
		when(orderService.findOpenOrders()).thenReturn(orders);
		
		// Test
		String json = mockMvc.perform(get("/api/order-processing"))
				
				
		// Verify
			.andExpect(status().isOk())
			.andReturn().getResponse().getContentAsString();
		
		Iterable<Order> result = this.objectMapper.readValue(json, new TypeReference<Iterable<Order>>() {
		});
		
		assertEquals(orders, result);
	}
}
