package com.teamdelta.sandwichpitstop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teamdelta.sandwichpitstop.dm.Order;
import com.teamdelta.sandwichpitstop.services.OrderService;

import lombok.Getter;

@RestController
@RequestMapping("api/order-processing")
public class OrderController {
	
	@Autowired
	@Getter
	private OrderService orderService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Order> findOpenOrders() {
		return orderService.findOpenOrders();
	}

}
