package com.teamdelta.sandwichpitstop.dm;

import java.util.HashMap;
import java.util.Map;

public enum DressingEnum {
	RANCH("RC","Ranch"),BLUE_CHEESE("BC","Blue Cheese"),MUSTARD("MT","Mustard"),KETCHUP("KP","Ketchup");
	
	private String id;
	private String name;
	private static Map<String, DressingEnum> enumId = new HashMap<String, DressingEnum>();

	static {
		for (DressingEnum type: values()) {
			enumId.put(type.getId(),type);
		}
	}
	
	private DressingEnum(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static DressingEnum findById(String id) {
		return enumId.get(id);
	}
	
	public static DressingEnum findByName(String name) {
		for (DressingEnum type: values()) {
			if (type.getName().equals(name)) {
				return type;
			}
		}
		return null;
	}
}
