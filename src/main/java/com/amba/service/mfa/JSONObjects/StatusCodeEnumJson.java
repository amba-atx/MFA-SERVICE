package com.amba.service.mfa.JSONObjects;

public enum StatusCodeEnumJson {

	 CALL_ANSWERED,
	    NOT_ANSWERED,
	    DISCONNECT_OCCURRED_BEFORE_MESSAGE_COMPLETED,
	    CALL_IN_PROGRESS,
	    WRONG_OR_INVALID_PHONE_NUMBER,
	    CALL_NOT_HANDLED_YET,
	    CALL_FAILED,
	    LINE_BUSY,
	    TRANSACTION_NOT_ATTEMPTED,
	    NOT_AUTHORIZED,
	    STATUS_NOT_AVAILABLE,
	    CALL_BLOCKED_BY_CUSTOMER_REQUEST,
	    CALL_BLOCKED_BY_TELESIGN;

	    public String value() {
	        return name();
	    }

	    public static StatusCodeEnumJson fromValue(String v) {
	        return valueOf(v);
	    }

	}

