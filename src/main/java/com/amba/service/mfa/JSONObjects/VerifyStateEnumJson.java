package com.amba.service.mfa.JSONObjects;

public enum VerifyStateEnumJson {
	
	VALID,
	INVALID,
	UNKNOWN;
	
	public String value() {
		return name();
		}
	
	public static VerifyStateEnumJson fromValue(String v) {
		return valueOf(v);
		}

}
