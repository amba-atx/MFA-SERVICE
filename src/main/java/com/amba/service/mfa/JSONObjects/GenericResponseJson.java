package com.amba.service.mfa.JSONObjects;

public abstract class GenericResponseJson {
	
	private DeviceResultJson deviceResult;
	private IdentificationDataJson identificationData;
	private MessageHeaderJson messageHeader;
	private StatusHeaderJson statusHeader;
	
	public DeviceResultJson getDeviceResult() {
		return deviceResult;
	}
	public void setDeviceResult(DeviceResultJson deviceResult) {
		this.deviceResult = deviceResult;
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
	public StatusHeaderJson getStatusHeader() {
		return statusHeader;
	}
	public void setStatusHeader(StatusHeaderJson statusHeader) {
		this.statusHeader = statusHeader;
	}

}
