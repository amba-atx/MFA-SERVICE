package com.amba.service.mfa.JSONObjects;

public enum ChannelIndicatorTypeJson {
	
	WEB,
    IVR,
    CALL_CENTER,
    BRANCH,
    MOBILE,
    OTHER;

    public String value() {
        return name();
    }

    public static ChannelIndicatorTypeJson fromValue(String v) {
        return valueOf(v);
    }

}
