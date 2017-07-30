package com.teamdelta.sandwichpitstop.dm;

import static com.teamdelta.sandwichpitstop.dm.SubstanceEnum.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubstanceEnumTest {
	@Test
	public void findById_Null() {
		// Setup
		String id = null;
		
		// Test
		SubstanceEnum substance = SubstanceEnum.findById(id);

		// Verify
		assertEquals(null, substance);
	}

	@Test
	public void findById_STEAK() {
		// Setup
		String id = "ST";

		// Test
		SubstanceEnum substance = SubstanceEnum.findById(id);

		// Verify
		assertEquals(STEAK, substance);
	}

	@Test
	public void findById_CHICKEN() {
		// Setup
		String id = "CN";

		// Test
		SubstanceEnum substance = SubstanceEnum.findById(id);

		// Verify
		assertEquals(CHICKEN, substance);
	}
	
	@Test
	public void findById_HAM() {
		// Setup
		String id = "HM";

		// Test
		SubstanceEnum substance = SubstanceEnum.findById(id);

		// Verify
		assertEquals(HAM, substance);
	}

	@Test
	public void findById_EGGS() {
		// Setup
		String id = "EG";

		// Test
		SubstanceEnum substance = SubstanceEnum.findById(id);

		// Verify
		assertEquals(EGGS, substance);
	}
	
	@Test
	public void findByName_Null() {
		// Setup
		String name = null;

		// Test
		SubstanceEnum substance = SubstanceEnum.findByName(name);

		// Verify
		assertEquals(null, substance);
	}

	@Test
	public void findByName_STEAK() {
		// Setup
		String name = "Steak";

		// Test
		SubstanceEnum substance = SubstanceEnum.findByName(name);

		// Verify
		assertEquals(STEAK, substance);
	}

	@Test
	public void findByName_CHICKEN() {
		// Setup
		String name = "Chicken";

		// Test
		SubstanceEnum substance = SubstanceEnum.findByName(name);

		// Verify
		assertEquals(CHICKEN, substance);
	}
	
	@Test
	public void findByName_HAM() {
		// Setup
		String name = "Ham";

		// Test
		SubstanceEnum substance = SubstanceEnum.findByName(name);

		// Verify
		assertEquals(HAM, substance);
	}

	@Test
	public void findByName_EGGS() {
		// Setup
		String name = "Eggs";

		// Test
		SubstanceEnum substance = SubstanceEnum.findByName(name);

		// Verify
		assertEquals(EGGS, substance);
	}
}
