package com.amba.service.mfa.JSONObjects;

public class DeviceDataJson {
	
	private BindingTypeJson bindingType;
	private String deviceTokenCookie;
	private String deviceTokenFSO;
	private String lookupLabel;
	private String newLabel;
	
	public BindingTypeJson getBindingType() {
		return bindingType;
	}
	public void setBindingType(BindingTypeJson bindingType) {
		this.bindingType = bindingType;
	}
	public String getDeviceTokenCookie() {
		return deviceTokenCookie;
	}
	public void setDeviceTokenCookie(String deviceTokenCookie) {
		this.deviceTokenCookie = deviceTokenCookie;
	}
	public String getDeviceTokenFSO() {
		return deviceTokenFSO;
	}
	public void setDeviceTokenFSO(String deviceTokenFSO) {
		this.deviceTokenFSO = deviceTokenFSO;
	}
	public String getLookupLabel() {
		return lookupLabel;
	}
	public void setLookupLabel(String lookupLabel) {
		this.lookupLabel = lookupLabel;
	}
	public String getNewLabel() {
		return newLabel;
	}
	public void setNewLabel(String newLabel) {
		this.newLabel = newLabel;
	}

}
