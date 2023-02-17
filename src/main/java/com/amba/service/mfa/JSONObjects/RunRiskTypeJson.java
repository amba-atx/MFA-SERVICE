package com.amba.service.mfa.JSONObjects;

public enum RunRiskTypeJson {

	
	  RISK_ONLY,
	    ALL,
	    NONE,
	    DEVICE_ONLY;
	
	  public String value() {
	        return name();
	    }

	    public static RunRiskTypeJson fromValue(String v) {
	        return valueOf(v);
	    }

}
