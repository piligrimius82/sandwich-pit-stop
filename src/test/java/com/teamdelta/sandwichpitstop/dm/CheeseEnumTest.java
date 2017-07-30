package com.teamdelta.sandwichpitstop.dm;

import static com.teamdelta.sandwichpitstop.dm.CheeseEnum.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheeseEnumTest {
	@Test
	public void findById_Null() {
		// Setup
		String id = null;
		
		// Test
		CheeseEnum substance = CheeseEnum.findById(id);

		// Verify
		assertEquals(null, substance);
	}

	@Test
	public void findById_AMERICAN_W() {
		// Setup
		String id = "AW";

		// Test
		CheeseEnum substance = CheeseEnum.findById(id);

		// Verify
		assertEquals(AMERICAN_W, substance);
	}

	@Test
	public void findById_AMERICAN_Y() {
		// Setup
		String id = "AY";

		// Test
		CheeseEnum substance = CheeseEnum.findById(id);

		// Verify
		assertEquals(AMERICAN_Y, substance);
	}
	
	@Test
	public void findById_SWISS() {
		// Setup
		String id = "SW";

		// Test
		CheeseEnum substance = CheeseEnum.findById(id);

		// Verify
		assertEquals(SWISS, substance);
	}

	@Test
	public void findById_PROVOLONE() {
		// Setup
		String id = "PR";

		// Test
		CheeseEnum substance = CheeseEnum.findById(id);

		// Verify
		assertEquals(PROVOLONE, substance);
	}
	
	@Test
	public void findByName_Null() {
		// Setup
		String name = null;

		// Test
		CheeseEnum substance = CheeseEnum.findByName(name);

		// Verify
		assertEquals(null, substance);
	}

	@Test
	public void findByName_AMERICAN_W() {
		// Setup
		String name = "American White";

		// Test
		CheeseEnum substance = CheeseEnum.findByName(name);

		// Verify
		assertEquals(AMERICAN_W, substance);
	}

	@Test
	public void findByName_AMERICAN_Y() {
		// Setup
		String name = "American Yellow";

		// Test
		CheeseEnum substance = CheeseEnum.findByName(name);

		// Verify
		assertEquals(AMERICAN_Y, substance);
	}
	
	@Test
	public void findByName_SWISS() {
		// Setup
		String name = "Swiss";

		// Test
		CheeseEnum substance = CheeseEnum.findByName(name);

		// Verify
		assertEquals(SWISS, substance);
	}

	@Test
	public void findByName_PROVOLONE() {
		// Setup
		String name = "Provolone";

		// Test
		CheeseEnum substance = CheeseEnum.findByName(name);

		// Verify
		assertEquals(PROVOLONE, substance);
	}
}
