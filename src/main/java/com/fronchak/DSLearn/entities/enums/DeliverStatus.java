package com.fronchak.DSLearn.entities.enums;

public enum DeliverStatus {

	PENDING(1),
	ACCEPTED(2),
	REJECTED(3);
	
	private Integer code;
	
	private DeliverStatus(Integer code) {
		this.code = code;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public static DeliverStatus toEnum(Integer code) {
		if(code != null) {
			for(DeliverStatus status : DeliverStatus.values()) {
				if(status.code.equals(code)) return status;
			}
		}
		throw new IllegalArgumentException();
	}
}
