package com.teamdelta.sandwichpitstop.dm;

import static com.teamdelta.sandwichpitstop.dm.SandwichStatusEnum.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SandwichStatusEnumTest {
	@Test
	public void findById_Null() {
		// Setup
		String id = null;
		
		// Test
		SandwichStatusEnum substance = SandwichStatusEnum.findById(id);

		// Verify
		assertEquals(null, substance);
	}

	@Test
	public void findById_NEW_ORDER() {
		// Setup
		String id = "NO";

		// Test
		SandwichStatusEnum substance = SandwichStatusEnum.findById(id);

		// Verify
		assertEquals(NEW_ORDER, substance);
	}

	@Test
	public void findById_PREPARING() {
		// Setup
		String id = "PR";

		// Test
		SandwichStatusEnum substance = SandwichStatusEnum.findById(id);

		// Verify
		assertEquals(PREPARING, substance);
	}
	
	@Test
	public void findById_CANCEL() {
		// Setup
		String id = "CL";

		// Test
		SandwichStatusEnum substance = SandwichStatusEnum.findById(id);

		// Verify
		assertEquals(CANCEL, substance);
	}

	@Test
	public void findById_COMPLETE() {
		// Setup
		String id = "CT";

		// Test
		SandwichStatusEnum substance = SandwichStatusEnum.findById(id);

		// Verify
		assertEquals(COMPLETE, substance);
	}
	
	@Test
	public void findByName_Null() {
		// Setup
		String name = null;

		// Test
		SandwichStatusEnum substance = SandwichStatusEnum.findByName(name);

		// Verify
		assertEquals(null, substance);
	}

	@Test
	public void findByName_NEW_ORDER() {
		// Setup
		String name = "New Order";

		// Test
		SandwichStatusEnum substance = SandwichStatusEnum.findByName(name);

		// Verify
		assertEquals(NEW_ORDER, substance);
	}

	@Test
	public void findByName_PREPARING() {
		// Setup
		String name = "Preparing";

		// Test
		SandwichStatusEnum substance = SandwichStatusEnum.findByName(name);

		// Verify
		assertEquals(PREPARING, substance);
	}
	
	@Test
	public void findByName_CANCEL() {
		// Setup
		String name = "Cancel";

		// Test
		SandwichStatusEnum substance = SandwichStatusEnum.findByName(name);

		// Verify
		assertEquals(CANCEL, substance);
	}

	@Test
	public void findByName_COMPLETE() {
		// Setup
		String name = "Complete";

		// Test
		SandwichStatusEnum substance = SandwichStatusEnum.findByName(name);

		// Verify
		assertEquals(COMPLETE, substance);
	}
}
