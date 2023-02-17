package com.amba.service.mfa.JSONObjects;

import com.amba.service.mfa.stub.client.ActionApplyType;

public enum ActionApplyTypeJson {
	
	STRICT,
    LIGHT,
    OVERRIDE,
    LOG,
    NONE;

    public String value() {
        return name();
    }

    public static ActionApplyTypeJson fromValue(String v) {
        return valueOf(v);
    }
   

}
