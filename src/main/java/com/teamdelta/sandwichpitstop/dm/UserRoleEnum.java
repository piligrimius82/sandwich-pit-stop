package com.teamdelta.sandwichpitstop.dm;

import java.util.HashMap;
import java.util.Map;

public enum UserRoleEnum {
	ADMIN("AD","Admin"),COOK("CK","Cook");
	private String id;
	private String name;
	private static Map<String, UserRoleEnum> enumId = new HashMap<String, UserRoleEnum>();
	
	static {
		for (UserRoleEnum type: values()) {
			enumId.put(type.getId(), type);
		}
	}
	
	private UserRoleEnum(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static UserRoleEnum findById(String id) {
		return enumId.get(id);
	}
	
	public static UserRoleEnum findByName(String name) {
		for(UserRoleEnum type: values()) {
			if (type.getName().equals(name)) {
				return type;
			}
		}
		return null;
	}
}
