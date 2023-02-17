package com.amba.service.mfa.JSONObjects;

public class DeviceManagementRequestPayloadJson {
	
	private DeviceActionTypeListJson actionTypeList;
	private DeviceDataJson deviceData;
	
	public DeviceActionTypeListJson getActionTypeList() {
		return actionTypeList;
	}
	public void setActionTypeList(DeviceActionTypeListJson actionTypeList) {
		this.actionTypeList = actionTypeList;
	}
	public DeviceDataJson getDeviceData() {
		return deviceData;
	}
	public void setDeviceData(DeviceDataJson deviceData) {
		this.deviceData = deviceData;
	}

}
