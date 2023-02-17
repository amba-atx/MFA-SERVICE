

package com.amba.service.mfa.JSONObjects;

import com.amba.service.mfa.stub.client.ActionCode;

public enum ActionCodeJson {
	
	NONE,
    ALLOW,
    REVIEW,
    DELAY_AND_REVIEW,
    STOP_AND_REVIEW,
    ELEVATE_SECURITY,
    REDIRECT_CHALLENGE,
    REDIRECT_COLLECT,
    CHALLENGE,
    COLLECT,
    DENY,
    BLOCK,
    LOCKED;

    public String value() {
        return name();
    }

    public static ActionCodeJson fromValue(String v) {
        return valueOf(v);
    }

}
