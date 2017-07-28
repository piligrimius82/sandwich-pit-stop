package com.teamdelta.sandwichpitstop.services;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.teamdelta.sandwichpitstop.dao.OrderDAO;
import com.teamdelta.sandwichpitstop.dm.Order;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceImpTest {
	
	@InjectMocks
	private OrderServiceImp orderService;
	
	@Mock
	private OrderDAO orderDAO;
	
	@Test
	public void findOpenOrders() {
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
		
		when(orderDAO.findOpenOreders()).thenReturn(orders);
		
		// Test
		Iterable<Order> result = orderService.findOpenOrders();
		
		// Verify
		assertEquals(orders, result);
	}

}
