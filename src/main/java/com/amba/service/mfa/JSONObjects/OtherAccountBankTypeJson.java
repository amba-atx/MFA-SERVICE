package com.amba.service.mfa.JSONObjects;

public enum OtherAccountBankTypeJson {

	SAME_BANK, OTHER_BANK;

	public String value() {
		return name();
	}

	public static OtherAccountBankTypeJson fromValue(String v) {
		return valueOf(v);
	}

}
