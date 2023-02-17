package com.amba.service.mfa.JSONObjects;

public enum PriceTypeJson {

	MARKET, BRACKETED_FIXED, BRACKETED_POINTS, BRACKETED_PERCENTAGES;

	public String value() {
		return name();
	}

	public static PriceTypeJson fromValue(String v) {
		return valueOf(v);
	}

}
