package com.amba.service.mfa.JSONObjects;

public enum RequestTypeJson {

	
	 ANALYZE,
	 AUTHENTICATE,
	 CHALLENGE,
	 CREATEUSER,
	 NOTIFY,
	 QUERY,
	 QUERYAUTHSTATUS,
	 UPDATEUSER;

	
	 public String value() {
	        return name();
	    }

	    public static RequestTypeJson fromValue(String v) {
	        return valueOf(v);
	    }


}
