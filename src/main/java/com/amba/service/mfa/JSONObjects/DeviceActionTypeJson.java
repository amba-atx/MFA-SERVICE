package com.amba.service.mfa.JSONObjects;

public enum DeviceActionTypeJson {
	
	BROWSE_DEVICES,
	UPDATE_DEVICE,
	UNBIND_ALL_DEVICES;
	
	public String value() {
		return name();
		}
	
	public static DeviceActionTypeJson fromValue(String v) {
		return valueOf(v);
		}

}
