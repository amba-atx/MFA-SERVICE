package com.amba.service.mfa.JSONObjects;

import java.util.ArrayList;
import java.util.List;

public class DeviceManagementResponsePayloadJson {
	
	private String acspAccountId;
	private CallStatusJson callStatus;
	private List<DeviceDataJson> deviceData;
	
	public String getAcspAccountId() {
		return acspAccountId;
	}
	public void setAcspAccountId(String acspAccountId) {
		this.acspAccountId = acspAccountId;
	}
	public CallStatusJson getCallStatus() {
		return callStatus;
	}
	public void setCallStatus(CallStatusJson callStatus) {
		this.callStatus = callStatus;
	}
	public List<DeviceDataJson> getDeviceData() {
		if (deviceData == null) {
			deviceData = new ArrayList<DeviceDataJson>();
			}
		return this.deviceData;
	}
	
	public void setDeviceData(List<DeviceDataJson> deviceData) {
		this.deviceData = deviceData;
	}

}
