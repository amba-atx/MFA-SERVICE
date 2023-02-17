package com.amba.service.mfa.JSONObjects;

import java.util.List;

public class DeviceActionTypeListJson extends ActionTypeListJson {
	
	private List<DeviceActionTypeJson> deviceActionTypes;

	public List<DeviceActionTypeJson> getDeviceActionTypes() {
		return deviceActionTypes;
	}

	public void setDeviceActionTypes(List<DeviceActionTypeJson> deviceActionTypes) {
		this.deviceActionTypes = deviceActionTypes;
	}

}
