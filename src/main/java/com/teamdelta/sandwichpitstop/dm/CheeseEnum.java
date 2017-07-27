package com.teamdelta.sandwichpitstop.dm;

import java.util.HashMap;
import java.util.Map;

public enum CheeseEnum {
	AMERICAN_W("AW","American White"),AMERICAN_Y("AY","American Yellow"),SWISS("SW","Swiss"),PROVOLONE("PR","Provolone");
	
	private String id;
	private String name;
	private static Map<String, CheeseEnum> enumId = new HashMap<String, CheeseEnum>();

	static {
		for (CheeseEnum type: values()) {
			enumId.put(type.getId(),type);
		}
	}
	
	private CheeseEnum(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static CheeseEnum findById(String id) {
		return enumId.get(id);
	}
	
	public static CheeseEnum findByName(String name) {
		for (CheeseEnum type: values()) {
			if (type.getName().equals(name)) {
				return type;
			}
		}
		return null;
	}
}
