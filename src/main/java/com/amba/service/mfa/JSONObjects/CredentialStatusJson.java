package com.amba.service.mfa.JSONObjects;

public enum CredentialStatusJson {
	
	ACTIVE,
	DISABLED,
	LOCKED,
	UNLOCKED;
	
	public String value() {
		return name();
		}
	
	public static CredentialStatusJson fromValue(String v) {
		return valueOf(v);
		}

}
