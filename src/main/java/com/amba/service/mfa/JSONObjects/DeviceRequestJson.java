package com.amba.service.mfa.JSONObjects;

import java.util.List;

public class DeviceRequestJson {
	
	private String beaconId;
	private String devicePrint;
	private String deviceTokenCookie;
	private String deviceTokenFSO;
	private String httpAccept;
	private String httpAcceptChars;
	private String httpAcceptEncoding;
	private String httpAcceptLanguage;
	private String httpReferrer;
	private String ipAddress;
	private String userAgent;
	private String geoLocation;
	private String domElements;
	private String jsEvents;
	private String pageId;
	private List<DeviceIdentifierJson> deviceIdentifier;
	
	public String getBeaconId() {
		return beaconId;
	}
	public void setBeaconId(String beaconId) {
		this.beaconId = beaconId;
	}
	public String getDevicePrint() {
		return devicePrint;
	}
	public void setDevicePrint(String devicePrint) {
		this.devicePrint = devicePrint;
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
	public String getHttpAccept() {
		return httpAccept;
	}
	public void setHttpAccept(String httpAccept) {
		this.httpAccept = httpAccept;
	}
	public String getHttpAcceptChars() {
		return httpAcceptChars;
	}
	public void setHttpAcceptChars(String httpAcceptChars) {
		this.httpAcceptChars = httpAcceptChars;
	}
	public String getHttpAcceptEncoding() {
		return httpAcceptEncoding;
	}
	public void setHttpAcceptEncoding(String httpAcceptEncoding) {
		this.httpAcceptEncoding = httpAcceptEncoding;
	}
	public String getHttpAcceptLanguage() {
		return httpAcceptLanguage;
	}
	public void setHttpAcceptLanguage(String httpAcceptLanguage) {
		this.httpAcceptLanguage = httpAcceptLanguage;
	}
	public String getHttpReferrer() {
		return httpReferrer;
	}
	public void setHttpReferrer(String httpReferrer) {
		this.httpReferrer = httpReferrer;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public String getGeoLocation() {
		return geoLocation;
	}
	public void setGeoLocation(String geoLocation) {
		this.geoLocation = geoLocation;
	}
	public String getDomElements() {
		return domElements;
	}
	public void setDomElements(String domElements) {
		this.domElements = domElements;
	}
	public String getJsEvents() {
		return jsEvents;
	}
	public void setJsEvents(String jsEvents) {
		this.jsEvents = jsEvents;
	}
	public String getPageId() {
		return pageId;
	}
	public void setPageId(String pageId) {
		this.pageId = pageId;
	}
	public List<DeviceIdentifierJson> getDeviceIdentifier() {
		return deviceIdentifier;
	}
	public void setDeviceIdentifier(List<DeviceIdentifierJson> deviceIdentifier) {
		this.deviceIdentifier = deviceIdentifier;
	}
	
}
