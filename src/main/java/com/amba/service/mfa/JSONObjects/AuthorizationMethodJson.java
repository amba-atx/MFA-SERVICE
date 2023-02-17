package com.amba.service.mfa.JSONObjects;

public enum AuthorizationMethodJson {
	
	PASSWORD("PASSWORD"),
    SECRET_HMAC_SHA_1("SECRET_HMAC_SHA1");
    private final String value;

    AuthorizationMethodJson(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorizationMethodJson fromValue(String v) {
        for (AuthorizationMethodJson c: AuthorizationMethodJson.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
