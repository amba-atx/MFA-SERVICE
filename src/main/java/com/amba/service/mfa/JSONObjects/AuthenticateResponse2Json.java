package com.amba.service.mfa.JSONObjects;

public class AuthenticateResponse2Json {
	
	private CredentialAuthResultListJson credentialAuthResultList;
    private DeviceManagementResponsePayloadJson deviceManagementResponse;
    private RequiredCredentialListJson requiredCredentialList;
	public CredentialAuthResultListJson getCredentialAuthResultList() {
		return credentialAuthResultList;
	}
	public void setCredentialAuthResultList(CredentialAuthResultListJson credentialAuthResultList) {
		this.credentialAuthResultList = credentialAuthResultList;
	}
	public DeviceManagementResponsePayloadJson getDeviceManagementResponse() {
		return deviceManagementResponse;
	}
	public void setDeviceManagementResponse(DeviceManagementResponsePayloadJson deviceManagementResponse) {
		this.deviceManagementResponse = deviceManagementResponse;
	}
	public RequiredCredentialListJson getRequiredCredentialList() {
		return requiredCredentialList;
	}
	public void setRequiredCredentialList(RequiredCredentialListJson requiredCredentialList) {
		this.requiredCredentialList = requiredCredentialList;
	}

}
