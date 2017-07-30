package com.teamdelta.sandwichpitstop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.teamdelta.sandwichpitstop.dm.Sandwich;

@Service
public interface SandwichDAO extends CrudRepository<Sandwich, Integer> {

}
