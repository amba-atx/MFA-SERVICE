package com.amba.service.mfa.JSONObjects;

public enum TradeTypeJson {
	
	BUY,
	SELL,
	SELL_SHORT,
	BUY_TO_COVER;
	
	public String value() {
		return name();
		}
	
	public static TradeTypeJson fromValue(String v) {
		return valueOf(v);
		}

}
