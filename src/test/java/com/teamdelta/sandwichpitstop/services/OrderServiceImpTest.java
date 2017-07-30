package com.teamdelta.sandwichpitstop.services;

import static com.teamdelta.sandwichpitstop.util.DataUtil.getRandomSandwiches;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
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
	
	@Captor
	private ArgumentCaptor<Order> orderCaptor;
	
	@Test
	public void findOpenOrders() {
		// Setup
		List<Order> orders = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			Order order = new Order();
			order.setCustomerName("Customer " + i);
			order.setOrderId(i);
			order.setPlacedTimestamp(new Date());
			order.setSandwiches(getRandomSandwiches());
			
			orders.add(order);
		}
		
		when(orderDAO.findOpenOreders()).thenReturn(orders);
		
		// Test
		Iterable<Order> result = orderService.findOpenOrders();
		
		// Verify
		assertEquals(orders, result);
	}

	@Test
	public void submitOrder() {
		// Setup
		Order order = new Order();
		order.setCustomerName("Customer 1");
		order.setPlacedTimestamp(new Date());
		order.setSandwiches(getRandomSandwiches());
		
		when(orderDAO.save(orderCaptor.capture())).thenReturn(order);

		// Test
		Order result = orderService.submitOrder(order);
		
		// Verify
		assertEquals(order, orderCaptor.getValue());
		assertEquals(order, result);
	}
	
	
}
