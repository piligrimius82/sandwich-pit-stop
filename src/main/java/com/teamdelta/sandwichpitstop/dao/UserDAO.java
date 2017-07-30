package com.teamdelta.sandwichpitstop.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.teamdelta.sandwichpitstop.dm.User;

@Service
public interface UserDAO extends CrudRepository<User, Integer> {
	
	@Query("SELECT u FROM User u WHERE u.username=:username AND u.password=:password")
	User findUser(@Param("username") String username, @Param("password") String password);

}
