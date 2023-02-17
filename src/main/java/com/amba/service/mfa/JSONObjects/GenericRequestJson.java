package com.amba.service.mfa.JSONObjects;

public abstract class GenericRequestJson {
	
	private GenericActionTypeListJson actionTypeList;
	private ConfigurationHeaderJson configurationHeader;
	private DeviceRequestJson deviceRequest;
	private IdentificationDataJson identificationData;
	private MessageHeaderJson messageHeader;
	private SecurityHeaderJson securityHeader;
	
	public GenericActionTypeListJson getActionTypeList() {
		return actionTypeList;
	}
	public void setActionTypeList(GenericActionTypeListJson actionTypeList) {
		this.actionTypeList = actionTypeList;
	}
	public ConfigurationHeaderJson getConfigurationHeader() {
		return configurationHeader;
	}
	public void setConfigurationHeader(ConfigurationHeaderJson configurationHeader) {
		this.configurationHeader = configurationHeader;
	}
	public DeviceRequestJson getDeviceRequest() {
		return deviceRequest;
	}
	public void setDeviceRequest(DeviceRequestJson deviceRequest) {
		this.deviceRequest = deviceRequest;
	}
	public IdentificationDataJson getIdentificationData() {
		return identificationData;
	}
	public void setIdentificationData(IdentificationDataJson identificationData) {
		this.identificationData = identificationData;
	}
	public MessageHeaderJson getMessageHeader() {
		return messageHeader;
	}
	public void setMessageHeader(MessageHeaderJson messageHeader) {
		this.messageHeader = messageHeader;
	}
	public SecurityHeaderJson getSecurityHeader() {
		return securityHeader;
	}
	public void setSecurityHeader(SecurityHeaderJson securityHeader) {
		this.securityHeader = securityHeader;
	}

}
