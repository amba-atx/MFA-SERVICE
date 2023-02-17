package com.amba.service.mfa.JSONObjects;

public enum WSUserTypeJson {
	
	PERSISTENT,
	NONPERSISTENT,
	BAIT;
	
	public String value() {
		return name();
		}
	
	public static WSUserTypeJson fromValue(String v) {
		return valueOf(v);
		}

}
