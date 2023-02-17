package com.amba.service.mfa.postmanRequest;

import com.amba.service.mfa.stub.client.ChannelIndicatorType;
import com.amba.service.mfa.stub.client.ConfigurationHeader;
import com.amba.service.mfa.stub.client.CredentialManagementRequestList;
import com.amba.service.mfa.stub.client.DeviceManagementRequestPayload;
import com.amba.service.mfa.stub.client.DeviceRequest;
import com.amba.service.mfa.stub.client.EventDataList;
import com.amba.service.mfa.stub.client.GenericActionTypeList;
import com.amba.service.mfa.stub.client.IdentificationData;
import com.amba.service.mfa.stub.client.MessageHeader;
import com.amba.service.mfa.stub.client.RunRiskType;
import com.amba.service.mfa.stub.client.UserData;
import com.amba.service.mfa.stub.client.UserPreference;

public class UpdateUserRequestPostman {
	
	private GenericActionTypeList genericActionTypeList;
	private DeviceRequest deviceRequest;
	private IdentificationData identificationData;
	private MessageHeader messageHeader;
	private EventDataList eventDataList;
	private RunRiskType runRiskType;
	private ConfigurationHeader configurationHeader;
	private CredentialManagementRequestList credentialManagementRequestList;
	private DeviceManagementRequestPayload deviceManagementRequestPayload;
	private UserData userData;
	private UserPreference userPreference;
	private ChannelIndicatorType channelIndicatorType;
	private String clientDefinedChannelIndicator;
	
	public GenericActionTypeList getGenericActionTypeList() {
		return genericActionTypeList;
	}
	public void setGenericActionTypeList(GenericActionTypeList genericActionTypeList) {
		this.genericActionTypeList = genericActionTypeList;
	}
	public DeviceRequest getDeviceRequest() {
		return deviceRequest;
	}
	public void setDeviceRequest(DeviceRequest deviceRequest) {
		this.deviceRequest = deviceRequest;
	}
	public IdentificationData getIdentificationData() {
		return identificationData;
	}
	public void setIdentificationData(IdentificationData identificationData) {
		this.identificationData = identificationData;
	}
	public MessageHeader getMessageHeader() {
		return messageHeader;
	}
	public void setMessageHeader(MessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}
	public EventDataList getEventDataList() {
		return eventDataList;
	}
	public void setEventDataList(EventDataList eventDataList) {
		this.eventDataList = eventDataList;
	}
	public RunRiskType getRunRiskType() {
		return runRiskType;
	}
	public void setRunRiskType(RunRiskType runRiskType) {
		this.runRiskType = runRiskType;
	}
	public ConfigurationHeader getConfigurationHeader() {
		return configurationHeader;
	}
	public void setConfigurationHeader(ConfigurationHeader configurationHeader) {
		this.configurationHeader = configurationHeader;
	}
	public CredentialManagementRequestList getCredentialManagementRequestList() {
		return credentialManagementRequestList;
	}
	public void setCredentialManagementRequestList(CredentialManagementRequestList credentialManagementRequestList) {
		this.credentialManagementRequestList = credentialManagementRequestList;
	}
	public DeviceManagementRequestPayload getDeviceManagementRequestPayload() {
		return deviceManagementRequestPayload;
	}
	public void setDeviceManagementRequestPayload(DeviceManagementRequestPayload deviceManagementRequestPayload) {
		this.deviceManagementRequestPayload = deviceManagementRequestPayload;
	}
	public UserData getUserData() {
		return userData;
	}
	public void setUserData(UserData userData) {
		this.userData = userData;
	}
	public UserPreference getUserPreference() {
		return userPreference;
	}
	public void setUserPreference(UserPreference userPreference) {
		this.userPreference = userPreference;
	}
	public ChannelIndicatorType getChannelIndicatorType() {
		return channelIndicatorType;
	}
	public void setChannelIndicatorType(ChannelIndicatorType channelIndicatorType) {
		this.channelIndicatorType = channelIndicatorType;
	}
	public String getClientDefinedChannelIndicator() {
		return clientDefinedChannelIndicator;
	}
	public void setClientDefinedChannelIndicator(String clientDefinedChannelIndicator) {
		this.clientDefinedChannelIndicator = clientDefinedChannelIndicator;
	}

}
