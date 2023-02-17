package com.amba.service.mfa.JSONObjects;

public enum OOBActionTypeJson {

	ADD_OOB, GET_OOB, DELETE_OOB, UPDATE_OOB, RESET_OOB;

	public String value() {
		return name();
	}

	public static OOBActionTypeJson fromValue(String v) {
		return valueOf(v);
	}

}
