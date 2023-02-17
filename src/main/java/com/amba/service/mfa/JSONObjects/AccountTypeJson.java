package com.amba.service.mfa.JSONObjects;

import com.amba.service.mfa.stub.client.AccountType;

public enum AccountTypeJson {
	
	CREDIT_CARD,
    DEBIT_CARD,
    CHECKING,
    CHECKING_WITH_OVERDRAFT,
    BROKERAGE,
    SAVINGS,
    CD,
    LINE_OF_CREDIT,
    RETIREMENT,
    MORTGAGE,
    USER_DEFINED;
	
	public String value() {
        return name();
    }

    public static AccountTypeJson fromValue(String v) {
        return valueOf(v);
    }

}
