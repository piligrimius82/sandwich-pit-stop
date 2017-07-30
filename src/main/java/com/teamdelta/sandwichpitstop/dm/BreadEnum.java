package com.teamdelta.sandwichpitstop.dm;

import java.util.HashMap;
import java.util.Map;

public enum BreadEnum {
	WHITE("WH","White"),WHEAT("WT","Wheat"),ITALIAN("IT","Italian");
	
	private String id;
	private String name;
	private static Map<String, BreadEnum> enumId = new HashMap<String, BreadEnum>();

	static {
		for (BreadEnum type: values()) {
			enumId.put(type.getId(),type);
		}
	}
	
	private BreadEnum(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static BreadEnum findById(String id) {
		return enumId.get(id);
	}
	
	public static BreadEnum findByName(String name) {
		for (BreadEnum type: values()) {
			if (type.getName().equals(name)) {
				return type;
			}
		}
		return null;
	}
}
