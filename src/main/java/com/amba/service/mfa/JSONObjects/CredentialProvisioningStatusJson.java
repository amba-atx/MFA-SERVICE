package com.amba.service.mfa.JSONObjects;

public enum CredentialProvisioningStatusJson {
	
	ACTIVE,
	DISABLED;
	
	public String value() {
		return name();    
		}
	
	public static CredentialProvisioningStatusJson fromValue(String v) {
		return valueOf(v);
		}

}
