package com.teamdelta.sandwichpitstop.dm;

import static org.junit.Assert.*;
import static com.teamdelta.sandwichpitstop.dm.UserRoleEnum.*;

import org.junit.Test;

public class UserRoleEnumTest {

	@Test
	public void findById_Null() {
		// Setup
		String id = null;
		
		// Test
		UserRoleEnum userRole = UserRoleEnum.findById(id);

		// Verify
		assertEquals(null, userRole);
	}

	@Test
	public void findById_ADMIN() {
		// Setup
		String id = "AD";

		// Test
		UserRoleEnum userRole = UserRoleEnum.findById(id);

		// Verify
		assertEquals(ADMIN, userRole);
	}

	@Test
	public void findById_COOK() {
		// Setup
		String id = "CK";

		// Test
		UserRoleEnum userRole = UserRoleEnum.findById(id);

		// Verify
		assertEquals(COOK, userRole);
	}
	
	@Test
	public void findByName_Null() {
		// Setup
		String name = null;

		// Test
		UserRoleEnum userRole = UserRoleEnum.findByName(name);

		// Verify
		assertEquals(null, userRole);
	}

	@Test
	public void findByName_ADMIN() {
		// Setup
		String name = "Admin";

		// Test
		UserRoleEnum userRole = UserRoleEnum.findByName(name);

		// Verify
		assertEquals(ADMIN, userRole);
	}

	@Test
	public void findByName_COOK() {
		// Setup
		String name = "Cook";

		// Test
		UserRoleEnum userRole = UserRoleEnum.findByName(name);

		// Verify
		assertEquals(COOK, userRole);
	}
}
