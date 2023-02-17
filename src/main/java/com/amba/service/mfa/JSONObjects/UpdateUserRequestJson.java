package com.amba.service.mfa.JSONObjects;

public class UpdateUserRequestJson extends GenericRequestJson {
	
	private CredentialManagementRequestListJson credentialManagementRequestList;
	private DeviceManagementRequestPayloadJson deviceManagementRequest;
	private EventDataListJson eventDataList;
	private RunRiskTypeJson runRiskType;
	private UserDataJson userData;
	private UserPreferenceJson userPreference;
	private ChannelIndicatorTypeJson channelIndicator;
	private String clientDefinedChannelIndicator;
	
	public CredentialManagementRequestListJson getCredentialManagementRequestList() {
		return credentialManagementRequestList;
	}
	public void setCredentialManagementRequestList(CredentialManagementRequestListJson credentialManagementRequestList) {
		this.credentialManagementRequestList = credentialManagementRequestList;
	}
	public DeviceManagementRequestPayloadJson getDeviceManagementRequest() {
		return deviceManagementRequest;
	}
	public void setDeviceManagementRequest(DeviceManagementRequestPayloadJson deviceManagementRequest) {
		this.deviceManagementRequest = deviceManagementRequest;
	}
	public EventDataListJson getEventDataList() {
		return eventDataList;
	}
	public void setEventDataList(EventDataListJson eventDataList) {
		this.eventDataList = eventDataList;
	}
	public RunRiskTypeJson getRunRiskType() {
		return runRiskType;
	}
	public void setRunRiskType(RunRiskTypeJson runRiskType) {
		this.runRiskType = runRiskType;
	}
	public UserDataJson getUserData() {
		return userData;
	}
	public void setUserData(UserDataJson userData) {
		this.userData = userData;
	}
	public UserPreferenceJson getUserPreference() {
		return userPreference;
	}
	public void setUserPreference(UserPreferenceJson userPreference) {
		this.userPreference = userPreference;
	}
	public ChannelIndicatorTypeJson getChannelIndicator() {
		return channelIndicator;
	}
	public void setChannelIndicator(ChannelIndicatorTypeJson channelIndicator) {
		this.channelIndicator = channelIndicator;
	}
	public String getClientDefinedChannelIndicator() {
		return clientDefinedChannelIndicator;
	}
	public void setClientDefinedChannelIndicator(String clientDefinedChannelIndicator) {
		this.clientDefinedChannelIndicator = clientDefinedChannelIndicator;
	}

}
