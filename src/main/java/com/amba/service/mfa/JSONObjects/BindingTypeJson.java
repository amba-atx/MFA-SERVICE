package com.amba.service.mfa.JSONObjects;

public enum BindingTypeJson {
	
	HARD_BIND,
    NONE;

    public String value() {
        return name();
    }

    public static BindingTypeJson fromValue(String v) {
        return valueOf(v);
    }

}
