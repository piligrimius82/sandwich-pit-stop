package com.teamdelta.sandwichpitstop.dao;

import org.springframework.data.repository.CrudRepository;

import com.teamdelta.sandwichpitstop.dm.Order;

public interface OrderDAO extends CrudRepository<Order, Integer> {

}
