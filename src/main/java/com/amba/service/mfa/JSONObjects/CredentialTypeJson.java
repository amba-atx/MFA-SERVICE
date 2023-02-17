package com.amba.service.mfa.JSONObjects;

public enum CredentialTypeJson {
	
	QUESTION,
	OOBPHONE,
	OOBEMAIL,
	USER_DEFINED;
	
	public String value() {
		return name();
		}
	
	public static CredentialTypeJson fromValue(String v) {
		return valueOf(v);
		}

}
