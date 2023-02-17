package com.amba.service.mfa.JSONObjects;

public enum GenderJson {
	
	MALE,
	FEMALE;
	
	public String value() {
		return name();
		}
	
	public static GenderJson fromValue(String v) {
		return valueOf(v);
		}

}
