package com.amba.service.mfa.JSONObjects;

import com.amba.service.mfa.stub.client.ChannelIndicatorType;
import com.amba.service.mfa.stub.client.ClientReturnData;
import com.amba.service.mfa.stub.client.CollectionRequest;
import com.amba.service.mfa.stub.client.CredentialDataList;
import com.amba.service.mfa.stub.client.DeviceIdentifier;
import com.amba.service.mfa.stub.client.DeviceManagementRequestPayload;
import com.amba.service.mfa.stub.client.EventDataList;
import com.amba.service.mfa.stub.client.RunRiskType;
import com.amba.service.mfa.stub.client.UserData;

public class AnalyzeRequestJson extends GenericRequestJson {
	
	private DeviceIdentifierJson channel;
	private Boolean autoCreateUserFlag;
	private ClientReturnDataJson clientReturnData;
	private CollectionRequestJson collectionRequest;
	private CredentialDataListJson credentialDataList;
	private DeviceManagementRequestPayloadJson deviceManagementRequest;
	private EventDataListJson eventDataList;
	private RunRiskTypeJson runRiskType;
	private UserDataJson userData;
	private ChannelIndicatorTypeJson channelIndicator;
	private String clientDefinedChannelIndicator;
	
	public DeviceIdentifierJson getChannel() {
		return channel;
	}
	public void setChannel(DeviceIdentifierJson channel) {
		this.channel = channel;
	}
	public Boolean getAutoCreateUserFlag() {
		return autoCreateUserFlag;
	}
	public void setAutoCreateUserFlag(Boolean autoCreateUserFlag) {
		this.autoCreateUserFlag = autoCreateUserFlag;
	}
	public ClientReturnDataJson getClientReturnData() {
		return clientReturnData;
	}
	public void setClientReturnData(ClientReturnDataJson clientReturnData) {
		this.clientReturnData = clientReturnData;
	}
	public CollectionRequestJson getCollectionRequest() {
		return collectionRequest;
	}
	public void setCollectionRequest(CollectionRequestJson collectionRequest) {
		this.collectionRequest = collectionRequest;
	}
	public CredentialDataListJson getCredentialDataList() {
		return credentialDataList;
	}
	public void setCredentialDataList(CredentialDataListJson credentialDataList) {
		this.credentialDataList = credentialDataList;
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
