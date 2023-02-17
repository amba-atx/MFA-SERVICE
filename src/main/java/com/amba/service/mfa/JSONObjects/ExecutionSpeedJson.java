package com.amba.service.mfa.JSONObjects;

public enum ExecutionSpeedJson {
	
	SEVERAL_DAYS,
	OVER_NIGHT,
	FEW_HOURS,
	REAL_TIME;
	
	public String value() {
		return name();
		}
	
	public static ExecutionSpeedJson fromValue(String v) {
		return valueOf(v);
		}

}
