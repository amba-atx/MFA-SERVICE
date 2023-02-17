package com.amba.service.mfa.JSONObjects;

public enum ATMOwnerTypeJson {
	
	FI,
    OTHER;

    public String value() {
        return name();
    }

    public static ATMOwnerTypeJson fromValue(String v) {
        return valueOf(v);
    }

}
