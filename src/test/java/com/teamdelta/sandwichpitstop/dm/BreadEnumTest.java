package com.teamdelta.sandwichpitstop.dm;

import static com.teamdelta.sandwichpitstop.dm.BreadEnum.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BreadEnumTest {
	@Test
	public void findById_Null() {
		// Setup
		String id = null;
		
		// Test
		BreadEnum substance = BreadEnum.findById(id);

		// Verify
		assertEquals(null, substance);
	}

	@Test
	public void findById_WHITE() {
		// Setup
		String id = "WH";

		// Test
		BreadEnum substance = BreadEnum.findById(id);

		// Verify
		assertEquals(WHITE, substance);
	}

	@Test
	public void findById_WHEAT() {
		// Setup
		String id = "WT";

		// Test
		BreadEnum substance = BreadEnum.findById(id);

		// Verify
		assertEquals(WHEAT, substance);
	}
	
	@Test
	public void findById_ITALIAN() {
		// Setup
		String id = "IT";

		// Test
		BreadEnum substance = BreadEnum.findById(id);

		// Verify
		assertEquals(ITALIAN, substance);
	}

	@Test
	public void findByName_Null() {
		// Setup
		String name = null;

		// Test
		BreadEnum substance = BreadEnum.findByName(name);

		// Verify
		assertEquals(null, substance);
	}

	@Test
	public void findByName_WHITE() {
		// Setup
		String name = "White";

		// Test
		BreadEnum substance = BreadEnum.findByName(name);

		// Verify
		assertEquals(WHITE, substance);
	}

	@Test
	public void findByName_WHEAT() {
		// Setup
		String name = "Wheat";

		// Test
		BreadEnum substance = BreadEnum.findByName(name);

		// Verify
		assertEquals(WHEAT, substance);
	}
	
	@Test
	public void findByName_ITALIAN() {
		// Setup
		String name = "Italian";

		// Test
		BreadEnum substance = BreadEnum.findByName(name);

		// Verify
		assertEquals(ITALIAN, substance);
	}

}
