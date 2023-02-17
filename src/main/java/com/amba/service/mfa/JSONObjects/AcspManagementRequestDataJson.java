package com.amba.service.mfa.JSONObjects;

import com.amba.service.mfa.stub.client.AcspManagementRequest;
import com.amba.service.mfa.stub.client.CredentialProvisioningStatus;

public class AcspManagementRequestDataJson {
	
	private CredentialProvisioningStatusJson credentialProvisioningStatus;
    private AcspManagementRequestJson payload;
	public CredentialProvisioningStatusJson getCredentialProvisioningStatus() {
		return credentialProvisioningStatus;
	}
	public void setCredentialProvisioningStatus(CredentialProvisioningStatusJson credentialProvisioningStatus) {
		this.credentialProvisioningStatus = credentialProvisioningStatus;
	}
	public AcspManagementRequestJson getPayload() {
		return payload;
	}
	public void setPayload(AcspManagementRequestJson payload) {
		this.payload = payload;
	}

}
