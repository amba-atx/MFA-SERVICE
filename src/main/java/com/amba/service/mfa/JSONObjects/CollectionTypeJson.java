package com.amba.service.mfa.JSONObjects;

public enum CollectionTypeJson {
	
	OPTIONAL_COLLECTION,
    REQUIRED_COLLECTION;

    public String value() {
        return name();
    }

    public static CollectionTypeJson fromValue(String v) {
        return valueOf(v);
    }

}
