package com.amba.service.mfa.JSONObjects;

public enum ApiTypeJson {
	
	 	WEB_REDIRECT,
	    DIRECT_SOAP_API,
	    ANALYZE_ONLY;

	    public String value() {
	        return name();
	    }

	    public static ApiTypeJson fromValue(String v) {
	        return valueOf(v);
	    }

}
