package com.amba.service.mfa.postmanRequest;

import com.amba.service.mfa.stub.client.ChannelIndicatorType;
import com.amba.service.mfa.stub.client.ConfigurationHeader;
import com.amba.service.mfa.stub.client.CredentialManagementRequestList;
import com.amba.service.mfa.stub.client.DeviceManagementRequestPayload;
import com.amba.service.mfa.stub.client.DeviceRequest;
import com.amba.service.mfa.stub.client.GenericActionTypeList;
import com.amba.service.mfa.stub.client.IdentificationData;
import com.amba.service.mfa.stub.client.MessageHeader;

public class QueryRequestPostman {
	
	private GenericActionTypeList genericActionTypeList;
	private ConfigurationHeader configurationHeader;
	private DeviceRequest deviceRequest;
	private IdentificationData identificationData;
	private MessageHeader messageHeader;
	private CredentialManagementRequestList credentialManagementRequestList;
	private DeviceManagementRequestPayload deviceManagementRequest;
	private ChannelIndicatorType channelIndicator;
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
	public CredentialManagementRequestList getCredentialManagementRequestList() {
		return credentialManagementRequestList;
	}
	public void setCredentialManagementRequestList(CredentialManagementRequestList credentialManagementRequestList) {
		this.credentialManagementRequestList = credentialManagementRequestList;
	}
	public DeviceManagementRequestPayload getDeviceManagementRequest() {
		return deviceManagementRequest;
	}
	public void setDeviceManagementRequest(DeviceManagementRequestPayload deviceManagementRequest) {
		this.deviceManagementRequest = deviceManagementRequest;
	}
	public ChannelIndicatorType getChannelIndicator() {
		return channelIndicator;
	}
	public void setChannelIndicator(ChannelIndicatorType channelIndicator) {
		this.channelIndicator = channelIndicator;
	}
	public String getClientDefinedChannelIndicator() {
		return clientDefinedChannelIndicator;
	}
	public void setClientDefinedChannelIndicator(String clientDefinedChannelIndicator) {
		this.clientDefinedChannelIndicator = clientDefinedChannelIndicator;
	}

}
