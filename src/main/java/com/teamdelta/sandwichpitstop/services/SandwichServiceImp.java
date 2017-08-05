package com.teamdelta.sandwichpitstop.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teamdelta.sandwichpitstop.dao.OrderDAO;
import com.teamdelta.sandwichpitstop.dao.SandwichDAO;
import com.teamdelta.sandwichpitstop.dm.Order;
import com.teamdelta.sandwichpitstop.dm.Sandwich;
import com.teamdelta.sandwichpitstop.dm.SandwichStatusEnum;

@Service
public class SandwichServiceImp implements SandwichService {
	
	@Autowired
	private SandwichDAO sandwichDAO;
	
	@Autowired
	private OrderDAO orderDAO;

	@Override
	@Transactional
	public Sandwich updateSandwich(Sandwich sandwich) {
		sandwich.setStatus(SandwichStatusEnum.findByName(sandwich.getStatus()).getId());
		Sandwich sandwch = sandwichDAO.save(sandwich);
		Order order = orderDAO.findOne(sandwch.getSandwichId());
		order.getSandwiches().size();
		boolean complete = true;
		for (Sandwich sandw : order.getSandwiches()) {
			if(sandw.getCompleteTimestamp()==null) {
				complete = false;
				break;
			}
		}
		if (complete) {
			order.setCompleteTimestamp(new Date());
			orderDAO.save(order);
		}
		return sandwch;
	}

}
