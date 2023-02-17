package com.amba.service.mfa.JSONObjects;

public class DeviceResultJson {
	
	private AuthenticationResultJson authenticationResult;
	private CallStatusJson callStatus;
	private DeviceDataJson deviceData;
	
	public AuthenticationResultJson getAuthenticationResult() {
		return authenticationResult;
	}
	public void setAuthenticationResult(AuthenticationResultJson authenticationResult) {
		this.authenticationResult = authenticationResult;
	}
	public CallStatusJson getCallStatus() {
		return callStatus;
	}
	public void setCallStatus(CallStatusJson callStatus) {
		this.callStatus = callStatus;
	}
	public DeviceDataJson getDeviceData() {
		return deviceData;
	}
	public void setDeviceData(DeviceDataJson deviceData) {
		this.deviceData = deviceData;
	}
	
}
