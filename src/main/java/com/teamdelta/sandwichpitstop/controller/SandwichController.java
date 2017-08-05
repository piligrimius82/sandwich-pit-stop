package com.teamdelta.sandwichpitstop.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamdelta.sandwichpitstop.dm.Sandwich;
import com.teamdelta.sandwichpitstop.dm.SandwichStatusEnum;
import com.teamdelta.sandwichpitstop.services.SandwichService;

import lombok.Getter;

@RestController
@RequestMapping("api/sandwich")
public class SandwichController {
	
	@Autowired
	@Getter
	private SandwichService sandwichService;
	
	@PutMapping(value={"","/"})
	public Sandwich updateSandwich(@RequestBody Sandwich sandwich) {
		SandwichStatusEnum statusEnum = SandwichStatusEnum.findByName(sandwich.getStatus()); 
		if(statusEnum==SandwichStatusEnum.CANCEL||statusEnum==SandwichStatusEnum.COMPLETE) {
			sandwich.setCompleteTimestamp(new Date());
		}
		return sandwichService.updateSandwich(sandwich);
	}

}
