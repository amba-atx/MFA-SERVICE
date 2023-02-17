package com.amba.service.mfa.JSONObjects;

public enum ActionTypeEnumJson {
	
	ADD_USER,
    DELETE_USER_DETAILS,
    GET_USER_DETAILS,
    UPDATE_PHONE_NUMBER,
    UPDATE_LANGUAGE,
    UPDATE_PHONE_NUMBER_AND_LANGUAGE;

    public String value() {
        return name();
    }

    public static ActionTypeEnumJson fromValue(String v) {
        return valueOf(v);
    }

}
