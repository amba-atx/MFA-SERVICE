package com.amba.service.mfa.JSONObjects;

public class OobPhoneManagementRequestJson {

	
    private CredentialProvisioningStatusJson credentialProvisioningStatus;
    private PhoneManagementRequestPayloadJson payload;
	public CredentialProvisioningStatusJson getCredentialProvisioningStatus() {
		return credentialProvisioningStatus;
	}
	public void setCredentialProvisioningStatus(CredentialProvisioningStatusJson credentialProvisioningStatus) {
		this.credentialProvisioningStatus = credentialProvisioningStatus;
	}
	public PhoneManagementRequestPayloadJson getPayload() {
		return payload;
	}
	public void setPayload(PhoneManagementRequestPayloadJson payload) {
		this.payload = payload;
	}

    
    
}
