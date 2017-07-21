package com.teamdelta.sandwichpitstop.dao;

import org.springframework.data.repository.CrudRepository;

import com.teamdelta.sandwichpitstop.dm.Sandwich;

public interface SandwichDAO extends CrudRepository<Sandwich, Integer> {

}
