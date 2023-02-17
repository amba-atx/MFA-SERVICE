package com.amba.service.mfa.JSONObjects;

public class ChallengeResponse2Json extends GenericResponseJson {
	
	private CredentialChallengeListJson credentialChallengeList;
    private DeviceManagementResponsePayloadJson deviceManagementResponse;
    
	public CredentialChallengeListJson getCredentialChallengeList() {
		return credentialChallengeList;
	}
	public void setCredentialChallengeList(CredentialChallengeListJson credentialChallengeList) {
		this.credentialChallengeList = credentialChallengeList;
	}
	public DeviceManagementResponsePayloadJson getDeviceManagementResponse() {
		return deviceManagementResponse;
	}
	public void setDeviceManagementResponse(DeviceManagementResponsePayloadJson deviceManagementResponse) {
		this.deviceManagementResponse = deviceManagementResponse;
	}
    
    

}
