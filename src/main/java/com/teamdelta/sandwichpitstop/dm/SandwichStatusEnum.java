package com.teamdelta.sandwichpitstop.dm;

import java.util.HashMap;
import java.util.Map;

public enum SandwichStatusEnum {
	NEW_ORDER("NO","New Order"),PREPARING("PR","Preparing"),CANCEL("CL","Cancel"),COMPLETE("CT","Complete");
	
	private String id;
	private String name;
	private static Map<String, SandwichStatusEnum> enumId = new HashMap<String, SandwichStatusEnum>();
	
	static {
		for (SandwichStatusEnum type: values()) {
			enumId.put(type.getId(),type);
		}
	}
	
	private SandwichStatusEnum(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static SandwichStatusEnum findById(String id) {
		return enumId.get(id);
	}
	
	public static SandwichStatusEnum findByName(String name) {
		for (SandwichStatusEnum type: values()) {
			if (type.getName().equals(name)) {
				return type;
			}
		}
		return null;
	}

}
