package com.amba.service.mfa.JSONObjects;

public enum CollectionInitiatorJson {
	
	USER_INITIATED,
    CSR_INITIATED,
    AUTO_INITIATED;

    public String value() {
        return name();
    }

    public static CollectionInitiatorJson fromValue(String v) {
        return valueOf(v);
    }

}
