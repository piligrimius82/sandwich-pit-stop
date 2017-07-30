package com.teamdelta.sandwichpitstop.controller;

import static com.teamdelta.sandwichpitstop.util.DataUtil.getRandomSandwiches;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
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

	@Captor
	private ArgumentCaptor<Order> orderCaptor;

	@Before
	public void setup() throws Exception {
		this.mockMvc = MockMvcBuilders.standaloneSetup(orderController).build();

		this.objectMapper = new ObjectMapper();
	}

	@Test
	public void findOpenOrders() throws Exception {
		// Setup
		List<Order> orders = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Order order = new Order();
			order.setCompleteTimestamp(null);
			order.setCustomerName("Customer " + i);
			order.setOrderId(i);
			order.setPlacedTimestamp(new Date());
			order.setSandwiches(getRandomSandwiches());

			orders.add(order);
		}
		when(orderService.findOpenOrders()).thenReturn(orders);

		// Test
		String json = mockMvc.perform(get("/api/order-processing"))

				// Verify
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();

		Iterable<Order> result = this.objectMapper.readValue(json, new TypeReference<Iterable<Order>>() {
		});

		assertEquals(orders, result);
	}

	@Test
	public void submitOrder() throws Exception {
		// Setup
		Order order = new Order();
		order.setCustomerName("Customer 1");
		order.setPlacedTimestamp(new Date());
		order.setSandwiches(getRandomSandwiches());

		when(orderService.submitOrder(order)).thenReturn(order);
		
		String orderJson = this.objectMapper.writeValueAsString(order);

		// Test
		String json = mockMvc.perform(post("/api/order-processing")
				.content(orderJson)
				.contentType(MediaType.APPLICATION_JSON))

				// Verify
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
		
		Order result = this.objectMapper.readValue(json, Order.class);
		
		assertEquals(order, result);
	}
}
