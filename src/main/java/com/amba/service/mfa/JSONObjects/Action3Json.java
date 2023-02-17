package com.amba.service.mfa.JSONObjects;

public enum Action3Json {
	
	ADD,
    UPDATE,
    DELETE,
    GET,
    RESET;

    public String value() {
        return name();
    }

    public static Action3Json fromValue(String v) {
        return valueOf(v);
    }

}
