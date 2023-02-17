package com.amba.service.mfa.postmanRequest;

import com.amba.service.mfa.stub.client.DeviceRequest;
import com.amba.service.mfa.stub.client.EventDataList;
import com.amba.service.mfa.stub.client.GenericActionTypeList;
import com.amba.service.mfa.stub.client.IdentificationData;
import com.amba.service.mfa.stub.client.MessageHeader;
import com.amba.service.mfa.stub.client.RunRiskType;

public class AnalyzeRequestPostman {
	
	private GenericActionTypeList genericActionTypeList;
	private DeviceRequest deviceRequest;
	private IdentificationData identificationData;
	private MessageHeader messageHeader;
	private EventDataList eventDataList;
	private Boolean autoCreateUserFlag;
	private RunRiskType runRiskType;
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
	public Boolean getAutoCreateUserFlag() {
		return autoCreateUserFlag;
	}
	public void setAutoCreateUserFlag(Boolean autoCreateUserFlag) {
		this.autoCreateUserFlag = autoCreateUserFlag;
	}
	public RunRiskType getRunRiskType() {
		return runRiskType;
	}
	public void setRunRiskType(RunRiskType runRiskType) {
		this.runRiskType = runRiskType;
	}
	
	

}
