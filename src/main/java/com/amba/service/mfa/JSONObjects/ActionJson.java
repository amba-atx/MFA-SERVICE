package com.amba.service.mfa.JSONObjects;

public enum ActionJson {
	
	ADD,
    UPDATE,
    DELETE,
    GET;

    public String value() {
        return name();
    }

    public static ActionJson fromValue(String v) {
        return valueOf(v);
    }

}
