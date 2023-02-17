package com.amba.service.mfa.JSONObjects;

public class UpdateUserResponse2Json extends GenericResponseJson {
	
	private CredentialManagementResponseListJson credentialManagementResponseList;
	private DeviceManagementResponsePayloadJson deviceManagementResponse;
	private RiskResultJson riskResult;
	
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

}
