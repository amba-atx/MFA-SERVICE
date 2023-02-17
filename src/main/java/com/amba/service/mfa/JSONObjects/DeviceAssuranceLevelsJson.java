package com.amba.service.mfa.JSONObjects;

public enum DeviceAssuranceLevelsJson {
	
	LOW,
	LOW_MEDIUM,
	MEDIUM,
	MEDIUM_HIGH,
	HIGH;
	
	public String value() {
		return name();
		}
	
	public static DeviceAssuranceLevelsJson fromValue(String v) {
		return valueOf(v);
		}

}
