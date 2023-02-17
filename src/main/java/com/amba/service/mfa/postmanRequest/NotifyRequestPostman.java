package com.amba.service.mfa.postmanRequest;

import com.amba.service.mfa.stub.client.ChannelIndicatorType;
import com.amba.service.mfa.stub.client.ConfigurationHeader;
import com.amba.service.mfa.stub.client.DeviceManagementRequestPayload;
import com.amba.service.mfa.stub.client.DeviceRequest;
import com.amba.service.mfa.stub.client.EventDataList;
import com.amba.service.mfa.stub.client.GenericActionTypeList;
import com.amba.service.mfa.stub.client.IdentificationData;
import com.amba.service.mfa.stub.client.MessageHeader;
import com.amba.service.mfa.stub.client.UserData;

public class NotifyRequestPostman {
	
	private GenericActionTypeList genericActionTypeList;
	private ConfigurationHeader configurationHeader;
	private DeviceRequest deviceRequest;
	private IdentificationData identificationData;
	private MessageHeader messageHeader;
	private Boolean autoCreateUserFlag;
	private DeviceManagementRequestPayload deviceManagementRequestPayload;
	private EventDataList eventDataList;
	private UserData userData;
	private ChannelIndicatorType channelIndicatorType;
	private String clientDefinedChannelIndicator;
	
	public GenericActionTypeList getGenericActionTypeList() {
		return genericActionTypeList;
	}
	public void setGenericActionTypeList(GenericActionTypeList genericActionTypeList) {
		this.genericActionTypeList = genericActionTypeList;
	}
	public ConfigurationHeader getConfigurationHeader() {
		return configurationHeader;
	}
	public void setConfigurationHeader(ConfigurationHeader configurationHeader) {
		this.configurationHeader = configurationHeader;
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
	public Boolean getAutoCreateUserFlag() {
		return autoCreateUserFlag;
	}
	public void setAutoCreateUserFlag(Boolean autoCreateUserFlag) {
		this.autoCreateUserFlag = autoCreateUserFlag;
	}
	public DeviceManagementRequestPayload getDeviceManagementRequestPayload() {
		return deviceManagementRequestPayload;
	}
	public void setDeviceManagementRequestPayload(DeviceManagementRequestPayload deviceManagementRequestPayload) {
		this.deviceManagementRequestPayload = deviceManagementRequestPayload;
	}
	public EventDataList getEventDataList() {
		return eventDataList;
	}
	public void setEventDataList(EventDataList eventDataList) {
		this.eventDataList = eventDataList;
	}
	public UserData getUserData() {
		return userData;
	}
	public void setUserData(UserData userData) {
		this.userData = userData;
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
