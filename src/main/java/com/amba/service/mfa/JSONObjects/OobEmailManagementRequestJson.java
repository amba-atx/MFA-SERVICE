package com.amba.service.mfa.JSONObjects;

public class OobEmailManagementRequestJson {

	  private CredentialProvisioningStatusJson credentialProvisioningStatus;
	    private EmailManagementRequestPayloadJson payload;
		public CredentialProvisioningStatusJson getCredentialProvisioningStatus() {
			return credentialProvisioningStatus;
		}
		public void setCredentialProvisioningStatus(CredentialProvisioningStatusJson credentialProvisioningStatus) {
			this.credentialProvisioningStatus = credentialProvisioningStatus;
		}
		public EmailManagementRequestPayloadJson getPayload() {
			return payload;
		}
		public void setPayload(EmailManagementRequestPayloadJson payload) {
			this.payload = payload;
		}

}
