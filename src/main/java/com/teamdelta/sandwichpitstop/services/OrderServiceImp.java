package com.teamdelta.sandwichpitstop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamdelta.sandwichpitstop.dao.OrderDAO;
import com.teamdelta.sandwichpitstop.dm.Order;
import com.teamdelta.sandwichpitstop.dm.Sandwich;

@Service
public class OrderServiceImp implements OrderService {
	
	@Autowired
	private OrderDAO orderDAO;

	@Override
	public Iterable<Order> findOpenOrders() {
		return orderDAO.findOpenOreders();
	}
	
	@Override
	public Order submitOrder(Order order) {
		for (Sandwich sandwich: order.getSandwiches()) {
			sandwich.convertToEnumIds();
		}
		return orderDAO.save(order);
	}
	

}
