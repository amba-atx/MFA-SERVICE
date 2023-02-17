package com.amba.service.mfa.JSONObjects;

public class ChallengeQuestionManagementRequestJson {
	
	private CredentialProvisioningStatusJson credentialProvisioningStatus;
    private ChallengeQuestionManagementRequestPayloadJson payload;
    
	public CredentialProvisioningStatusJson getCredentialProvisioningStatus() {
		return credentialProvisioningStatus;
	}
	public void setCredentialProvisioningStatus(CredentialProvisioningStatusJson credentialProvisioningStatus) {
		this.credentialProvisioningStatus = credentialProvisioningStatus;
	}
	public ChallengeQuestionManagementRequestPayloadJson getPayload() {
		return payload;
	}
	public void setPayload(ChallengeQuestionManagementRequestPayloadJson payload) {
		this.payload = payload;
	}

}
