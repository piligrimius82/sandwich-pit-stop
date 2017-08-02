package com.teamdelta.sandwichpitstop.dm;

import java.util.HashMap;
import java.util.Map;

public enum SubstanceEnum {
	STEAK("ST", "Steak"), CHICKEN("CN", "Chicken"), HAM("HM", "Ham"), EGGS("EG", "Eggs"), TURKEY("TU", "Turkey");

	private String id;
	private String name;
	private static Map<String, SubstanceEnum> enumId = new HashMap<String, SubstanceEnum>();

	static {
		for (SubstanceEnum type : values()) {
			enumId.put(type.getId(), type);
		}
	}

	private SubstanceEnum(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public static SubstanceEnum findById(String id) {
		return enumId.get(id);
	}

	public static SubstanceEnum findByName(String name) {
		for (SubstanceEnum type : values()) {
			if (type.getName().equals(name)) {
				return type;
			}
		}
		return null;
	}
}
