package com.amba.service.mfa.JSONObjects;

public class AnalyzeResponse2Json extends GenericResponseJson {
	
	private CollectableCredentialListJson collectableCredentialList;
    private CredentialAuthResultListJson credentialAuthResultList;
    private DeviceManagementResponsePayloadJson deviceManagementResponse;
    private RequiredCredentialListJson requiredCredentialList;
    private RiskResultJson riskResult;
    private ServerRedirectDataJson serverRedirectData;
	public CollectableCredentialListJson getCollectableCredentialList() {
		return collectableCredentialList;
	}
	public void setCollectableCredentialList(CollectableCredentialListJson collectableCredentialList) {
		this.collectableCredentialList = collectableCredentialList;
	}
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
	public RiskResultJson getRiskResult() {
		return riskResult;
	}
	public void setRiskResult(RiskResultJson riskResult) {
		this.riskResult = riskResult;
	}
	public ServerRedirectDataJson getServerRedirectData() {
		return serverRedirectData;
	}
	public void setServerRedirectData(ServerRedirectDataJson serverRedirectData) {
		this.serverRedirectData = serverRedirectData;
	}

}
