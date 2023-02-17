package com.amba.service.mfa.JSONObjects;

public enum LoginFailureTypeJson {
	
	CARD_ON_BLACKLIST,
	CARD_EXPIRED,
	CARD_LOST,
	CARD_NONEXISTENT,
	INCORRECT_PIN,    
	INCORRECT_CVV;    
	
	public String value() {
		return name();
		}
	
	public static LoginFailureTypeJson fromValue(String v) {
		return valueOf(v);    }

}
