package com.teamdelta.sandwichpitstop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.teamdelta.sandwichpitstop.dm.User;

@Service
public interface UserDAO extends CrudRepository<User, Integer> {

}
