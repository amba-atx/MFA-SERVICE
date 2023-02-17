package com.amba.service.mfa.JSONObjects;

import com.amba.service.mfa.stub.client.AccountRelationType;

public enum AccountRelationTypeJson {
	
	PRIMARY_OWNER,
    CO_OWNER,
    AUTHORIZED_USER;
	
	public String value() {
        return name();
    }

    public static AccountRelationTypeJson fromValue(String v) {
        return valueOf(v);
    }

}
