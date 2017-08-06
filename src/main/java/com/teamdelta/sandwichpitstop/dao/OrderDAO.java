package com.teamdelta.sandwichpitstop.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.teamdelta.sandwichpitstop.dm.Order;

@Service
public interface OrderDAO extends CrudRepository<Order, Integer> {
	
	@Query("SELECT o FROM Order o WHERE o.completeTimestamp IS NULL")
	Iterable<Order> findOpenOreders();
	
	@Query("SELECT o FROM Order o left join o.sandwiches as s where s.sandwichId=:sandwichId")
	Order findOrderBySandwichId(@Param("sandwichId") Integer id);
}
