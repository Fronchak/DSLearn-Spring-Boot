package com.fronchak.DSLearn.entities.enums;

public enum ResourceType {

	LESSON_ONLY(1),
	LESSON_TASK(2),
	FORUM(3),
	EXTERNAL_LINK(4);
	
	private Integer code;
	
	private ResourceType(Integer code) {
		this.code = code;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public static ResourceType toEnum(Integer code) {
		for(ResourceType type : ResourceType.values()) {
			if(type.code.equals(code)) return type;
		}
		throw new IllegalArgumentException();
	}
}
