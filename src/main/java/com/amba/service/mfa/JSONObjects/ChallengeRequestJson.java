package com.amba.service.mfa.JSONObjects;

public class ChallengeRequestJson extends GenericRequestJson {
	
	private CredentialChallengeRequestListJson credentialChallengeRequestList;
    private DeviceManagementRequestPayloadJson deviceManagementRequest;
    private EventDataListJson eventDataList;
    private UserDataJson userData;
    private ChannelIndicatorTypeJson channelIndicator;
    private String clientDefinedChannelIndicator;
	public CredentialChallengeRequestListJson getCredentialChallengeRequestList() {
		return credentialChallengeRequestList;
	}
	public void setCredentialChallengeRequestList(CredentialChallengeRequestListJson credentialChallengeRequestList) {
		this.credentialChallengeRequestList = credentialChallengeRequestList;
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
	public UserDataJson getUserData() {
		return userData;
	}
	public void setUserData(UserDataJson userData) {
		this.userData = userData;
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
