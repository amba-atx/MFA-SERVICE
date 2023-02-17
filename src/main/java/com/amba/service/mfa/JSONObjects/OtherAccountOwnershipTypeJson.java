package com.amba.service.mfa.JSONObjects;

public enum OtherAccountOwnershipTypeJson {

	   ME_TO_ME,
	    ME_TO_YOU;
	
	  public String value() {
	        return name();
	    }

	    public static OtherAccountOwnershipTypeJson fromValue(String v) {
	        return valueOf(v);
	    }

	}
