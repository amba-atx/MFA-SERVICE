package com.amba.service.mfa.JSONObjects;


public class CreateUserResponse2Json extends GenericResponseJson {
	
	private CredentialManagementResponseListJson credentialManagementResponseList;
    private DeviceManagementResponsePayloadJson deviceManagementResponse;
    private RiskResultJson riskResult;
    private CredentialListJson systemCredentials;
    
	public CredentialManagementResponseListJson getCredentialManagementResponseList() {
		return credentialManagementResponseList;
	}
	public void setCredentialManagementResponseList(CredentialManagementResponseListJson credentialManagementResponseList) {
		this.credentialManagementResponseList = credentialManagementResponseList;
	}
	public DeviceManagementResponsePayloadJson getDeviceManagementResponse() {
		return deviceManagementResponse;
	}
	public void setDeviceManagementResponse(DeviceManagementResponsePayloadJson deviceManagementResponse) {
		this.deviceManagementResponse = deviceManagementResponse;
	}
	public RiskResultJson getRiskResult() {
		return riskResult;
	}
	public void setRiskResult(RiskResultJson riskResult) {
		this.riskResult = riskResult;
	}
	public CredentialListJson getSystemCredentials() {
		return systemCredentials;
	}
	public void setSystemCredentials(CredentialListJson systemCredentials) {
		this.systemCredentials = systemCredentials;
	}

}
