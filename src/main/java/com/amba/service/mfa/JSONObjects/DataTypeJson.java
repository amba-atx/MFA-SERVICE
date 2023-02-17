package com.amba.service.mfa.JSONObjects;

public enum DataTypeJson {
	
	STRING,
	BOOLEAN,
	FLOAT,
	DOUBLE,
	INTEGER,
	DATE,
	IP;
	
	public String value() {
		return name();
		}
	
	public static DataTypeJson fromValue(String v) {
		return valueOf(v);
		}

}
