package com.amba.service.mfa.JSONObjects;

public class NotifyResponse2Json extends GenericResponseJson {

	private DeviceManagementResponsePayloadJson deviceManagementResponse;

	public DeviceManagementResponsePayloadJson getDeviceManagementResponse() {
		return deviceManagementResponse;
	}

	public void setDeviceManagementResponse(DeviceManagementResponsePayloadJson deviceManagementResponse) {
		this.deviceManagementResponse = deviceManagementResponse;
	}
}
