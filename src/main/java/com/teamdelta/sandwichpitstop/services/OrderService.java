package com.teamdelta.sandwichpitstop.services;

import com.teamdelta.sandwichpitstop.dm.Order;

public interface OrderService {
	
	Iterable<Order> findOpenOrders();
	
	Order submitOrder(Order order);

}
