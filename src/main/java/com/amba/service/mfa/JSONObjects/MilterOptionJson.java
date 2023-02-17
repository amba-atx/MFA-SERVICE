package com.amba.service.mfa.JSONObjects;


public enum MilterOptionJson {

	    DISABLED,
	    PHRASE_ENABLED;

		 public String value() {
		        return name();
		    }

		    public static MilterOptionJson fromValue(String v) {
		        return valueOf(v);
		    }

		}

