package com.amba.service.mfa.JSONObjects;

public enum TransferMediumTypeJson {
	
	INTERNAL,
	BILLPAY_MAIL,
	BILLPAY_ELEC,
	BALANCE_TRANSFER,
	ACH,
	WIRE,
	INTL_WIRE,
	CHECK;
	
	public String value() {
		return name();
		}
	
	public static TransferMediumTypeJson fromValue(String v) {
		return valueOf(v);
		}

}
