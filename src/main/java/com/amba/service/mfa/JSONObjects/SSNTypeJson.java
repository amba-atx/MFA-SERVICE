package com.amba.service.mfa.JSONObjects;

public enum SSNTypeJson {

    SSN_4("SSN4"),
    SSN_9("SSN9"),
    SSN_5("SSN5"),
    OTHER("OTHER"),
    NOSSN("NOSSN");
	
	private final String value;

    SSNTypeJson(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SSNTypeJson fromValue(String v) {
        for (SSNTypeJson c: SSNTypeJson.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

	
	
}