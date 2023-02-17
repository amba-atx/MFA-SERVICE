package com.amba.service.mfa.JSONObjects;

public enum Action2Json {
	
	ADD,
    UPDATE,
    DELETE,
    GET,
    RESET;

    public String value() {
        return name();
    }

    public static Action2Json fromValue(String v) {
        return valueOf(v);
    }

}
