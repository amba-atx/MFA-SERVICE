package com.amba.service.mfa.JSONObjects;

public class CredentialJson {
	
	private CredentialStatusJson credentialStatus;
    private CredentialTypeJson credentialType;
    private String genericCredentialType;
    
	public CredentialStatusJson getCredentialStatus() {
		return credentialStatus;
	}
	public void setCredentialStatus(CredentialStatusJson credentialStatus) {
		this.credentialStatus = credentialStatus;
	}
	public CredentialTypeJson getCredentialType() {
		return credentialType;
	}
	public void setCredentialType(CredentialTypeJson credentialType) {
		this.credentialType = credentialType;
	}
	public String getGenericCredentialType() {
		return genericCredentialType;
	}
	public void setGenericCredentialType(String genericCredentialType) {
		this.genericCredentialType = genericCredentialType;
	}

}
