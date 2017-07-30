package com.teamdelta.sandwichpitstop.dm;

import static com.teamdelta.sandwichpitstop.dm.DressingEnum.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DressingEnumTest {
	@Test
	public void findById_Null() {
		// Setup
		String id = null;
		
		// Test
		DressingEnum substance = DressingEnum.findById(id);

		// Verify
		assertEquals(null, substance);
	}

	@Test
	public void findById_RANCH() {
		// Setup
		String id = "RC";

		// Test
		DressingEnum substance = DressingEnum.findById(id);

		// Verify
		assertEquals(RANCH, substance);
	}

	@Test
	public void findById_BLUE_CHEESE() {
		// Setup
		String id = "BC";

		// Test
		DressingEnum substance = DressingEnum.findById(id);

		// Verify
		assertEquals(BLUE_CHEESE, substance);
	}
	
	@Test
	public void findById_MUSTARD() {
		// Setup
		String id = "MT";

		// Test
		DressingEnum substance = DressingEnum.findById(id);

		// Verify
		assertEquals(MUSTARD, substance);
	}

	@Test
	public void findById_KETCHUP() {
		// Setup
		String id = "KP";

		// Test
		DressingEnum substance = DressingEnum.findById(id);

		// Verify
		assertEquals(KETCHUP, substance);
	}
	
	@Test
	public void findByName_Null() {
		// Setup
		String name = null;

		// Test
		DressingEnum substance = DressingEnum.findByName(name);

		// Verify
		assertEquals(null, substance);
	}

	@Test
	public void findByName_RANCH() {
		// Setup
		String name = "Ranch";

		// Test
		DressingEnum substance = DressingEnum.findByName(name);

		// Verify
		assertEquals(RANCH, substance);
	}

	@Test
	public void findByName_BLUE_CHEESE() {
		// Setup
		String name = "Blue Cheese";

		// Test
		DressingEnum substance = DressingEnum.findByName(name);

		// Verify
		assertEquals(BLUE_CHEESE, substance);
	}
	
	@Test
	public void findByName_MUSTARD() {
		// Setup
		String name = "Mustard";

		// Test
		DressingEnum substance = DressingEnum.findByName(name);

		// Verify
		assertEquals(MUSTARD, substance);
	}

	@Test
	public void findByName_KETCHUP() {
		// Setup
		String name = "Ketchup";

		// Test
		DressingEnum substance = DressingEnum.findByName(name);

		// Verify
		assertEquals(KETCHUP, substance);
	}
}
