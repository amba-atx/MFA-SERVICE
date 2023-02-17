package com.amba.service.mfa.JSONObjects;

public class QueryAuthStatusResponse2Json extends GenericResponseJson {
	
	
    private CredentialAuthStatusResponseJson credentialAuthStatusResponse;

	public CredentialAuthStatusResponseJson getCredentialAuthStatusResponse() {
		return credentialAuthStatusResponse;
	}

	public void setCredentialAuthStatusResponse(CredentialAuthStatusResponseJson credentialAuthStatusResponse) {
		this.credentialAuthStatusResponse = credentialAuthStatusResponse;
	}


}
