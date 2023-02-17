package com.amba.service.mfa.JSONObjects;

public enum RedirectReasonJson {

	
	 COLLECT,
	    REFRESH;
	

    public String value() {
        return name();
    }

    public static RedirectReasonJson fromValue(String v) {
        return valueOf(v);
    }

}

