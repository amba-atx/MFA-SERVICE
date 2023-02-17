package com.amba.service.mfa.JSONObjects;

public enum UserStatusJson {
	
	NOTENROLLED,
	UNVERIFIED,
	VERIFIED,
	DELETE,
	LOCKOUT,
	UNLOCKED;
	
	public String value() {
		return name();
		}
	
	public static UserStatusJson fromValue(String v) {
		return valueOf(v);
		}

}
