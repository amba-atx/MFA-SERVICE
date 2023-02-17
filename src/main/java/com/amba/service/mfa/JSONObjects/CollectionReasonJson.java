package com.amba.service.mfa.JSONObjects;

public enum CollectionReasonJson {
	
	CSR_REQUESTED,
    USER_SETTINGS,
    FIRST_COLLECTION,
    REFRESH_AFTER_FAILURE,
    ADDITIONAL_COLLECTION,
    REFRESH_COLLECTION;

    public String value() {
        return name();
    }

    public static CollectionReasonJson fromValue(String v) {
        return valueOf(v);
    }

}
