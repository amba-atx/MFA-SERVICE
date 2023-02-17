package com.amba.service.mfa.JSONObjects;

public enum TermTypeJson {
	
	GOOD_FOR_DAY,
	GOOD_UNTIL_CANCELLED,
	IMMEDIATE_OR_CANCEL,
	FILL_OR_KILL;
	
	public String value() {
		return name();
		}
	
	public static TermTypeJson fromValue(String v) {
		return valueOf(v);
	}

}
