package com.amba.service.mfa.JSONObjects;

public enum EventTypeJson {
	
	NULL,
	SESSION_SIGNIN,
	FAILED_LOGIN_ATTEMPT,
	ENROLL,
	UPDATE_USER,
	CREATE_USER,
	OLB_ENROLL,
	FAILED_OLB_ENROLL_ATTEMPT,
	ACTIVATE_CARD,
	OPEN_NEW_ACCOUNT,
	REQUEST_CREDIT,
	ADD_PAYEE,
	EDIT_PAYEE,
	PAYMENT,
	DEPOSIT,
	STOCK_TRADE,
	OPTIONS_TRADE,
	CHANGE_LOGIN_ID,
	CHANGE_EMAIL,
	CHANGE_PHONE,
	CHANGE_ADDRESS,
	CHANGE_PASSWORD,
	CHANGE_LIFE_QUESTIONS,
	FAILED_CHANGE_PASSWORD_ATTEMPT,
	CHANGE_ALERT_SETTINGS,
	CHANGE_STATEMENT_SETTINGS,
	CHANGE_AUTH_DATA,
	SEND_SECURE_MESSAGE,
	READ_SECURE_MESSAGE,
	VIEW_CHECK,
	VIEW_STATEMENT,
	REQUEST_CHECK_COPY,
	REQUEST_STATEMENT_COPY,
	REQUEST_CHECKS,
	REQUEST_NEW_CARD,
	REQUEST_NEW_PIN,
	EXTRA_AUTH,
	USER_DETAILS,
	CLIENT_DEFINED,
	WITHDRAW,
	CARD_PIN_CHANGE;
	
	public String value() {
		return name();
		}
	
	public static EventTypeJson fromValue(String v) {
		return valueOf(v);
		}

}