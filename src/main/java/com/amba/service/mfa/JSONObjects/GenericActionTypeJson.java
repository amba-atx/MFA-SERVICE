package com.amba.service.mfa.JSONObjects;

public enum GenericActionTypeJson {
	
	GET_USER_STATUS,
	GET_USER_PREFERENCE,
	GET_USER_GROUP,
	GET_SYSTEM_CREDENTIAL,
	GET_USER_CREDENTIAL,
	GET_SYSTEM_CREDENTIAL_EXTENDED,
	GET_USER_CREDENTIAL_EXTENDED,
	BROWSE_USER_GROUP,
	SET_USER_GROUP,
	UPDATE_USER_NAME,
	SET_USER_STATUS,
	SET_USER_PREFERENCE,
	OPEN_SESSION,
	CLOSE_SESSION,
	COMMIT,
	CANCEL;
	
	public String value() {
		return name();
		}
	
	public static GenericActionTypeJson fromValue(String v) {
		return valueOf(v);
		}

}
