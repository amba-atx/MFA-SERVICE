package com.amba.service.mfa.JSONObjects;

public class ClientGenCookieJson extends DeviceIdentifierJson {
	
	private String clientGenCookie;
    private String clientFSOCookie;
    
	public String getClientGenCookie() {
		return clientGenCookie;
	}
	public void setClientGenCookie(String clientGenCookie) {
		this.clientGenCookie = clientGenCookie;
	}
	public String getClientFSOCookie() {
		return clientFSOCookie;
	}
	public void setClientFSOCookie(String clientFSOCookie) {
		this.clientFSOCookie = clientFSOCookie;
	}

}
