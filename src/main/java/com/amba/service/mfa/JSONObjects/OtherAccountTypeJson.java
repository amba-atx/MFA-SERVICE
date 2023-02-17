package com.amba.service.mfa.JSONObjects;


public enum OtherAccountTypeJson {
	 BILLER,
	    PERSONAL_ACCOUNT;

	    public String value() {
	        return name();
	    }

	    public static OtherAccountTypeJson fromValue(String v) {
	        return valueOf(v);
	    }

	}
