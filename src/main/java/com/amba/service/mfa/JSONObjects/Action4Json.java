package com.amba.service.mfa.JSONObjects;

public enum Action4Json {
	
	ADD,
    UPDATE,
    DELETE,
    GET,
    RESET;

    public String value() {
        return name();
    }

    public static Action4Json fromValue(String v) {
        return valueOf(v);
    }

}
