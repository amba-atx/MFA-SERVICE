package com.amba.service.mfa.JSONObjects;

public enum ATMLocationTypesJson {
	
	BANK_BRANCH,
    PETROL_STATION,
    PUBLIC_TRANSPORT,
    STREET,
    CONVENIENCE_STORE,
    SUPERMARKET,
    LEISURE_FACILITY,
    DRIVE_THRU,
    ENTERTAINMENT_VENUE,
    TRANSPORT_TERMINAL,
    POST_OFFICE,
    RETAIL_OUTLET,
    CASINO,
    GOVERNMENT_OFFICE,
    OTHER;

    public String value() {
        return name();
    }

    public static ATMLocationTypesJson fromValue(String v) {
        return valueOf(v);
    }

}
