package com.teamdelta.sandwichpitstop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamdelta.sandwichpitstop.dm.Order;
import com.teamdelta.sandwichpitstop.dm.Sandwich;
import com.teamdelta.sandwichpitstop.services.OrderService;

import lombok.Getter;

@RestController
@RequestMapping("api/order-processing")
public class OrderController {
	 
	@Autowired
	@Getter
	private OrderService orderService;
	
	@GetMapping(value={"","/"})
	public Iterable<Order> findOpenOrders() {
		Iterable<Order> orders = orderService.findOpenOrders();
		for(Order order: orders) {
			for (Sandwich sandwich: order.getSandwiches()) {
				sandwich.convertEnumIdsToFullStrings();
				
			}
		}
		return orders;
	}
	
	@PostMapping(value={"","/"})
	public Order submitOrder(@RequestBody Order order) {
		return orderService.submitOrder(order);
	}

}
