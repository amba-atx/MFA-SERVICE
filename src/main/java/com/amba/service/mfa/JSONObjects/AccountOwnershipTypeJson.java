package com.amba.service.mfa.JSONObjects;

import com.amba.service.mfa.stub.client.AccountOwnershipType;

public enum AccountOwnershipTypeJson {
	
	INDIVIDUAL,
    JOINT,
    TRUST,
    CUSTODIAL,
    BUSINESS;
	
	public String value() {
        return name();
    }

    public static AccountOwnershipTypeJson fromValue(String v) {
        return valueOf(v);
    }

}
