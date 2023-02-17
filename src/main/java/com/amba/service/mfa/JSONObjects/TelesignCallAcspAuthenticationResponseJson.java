package com.amba.service.mfa.JSONObjects;

public class TelesignCallAcspAuthenticationResponseJson extends TelesignGenAcspAuthenticationResponseJson {
	
	private StatusCodeEnumJson telesignStatusCode;
	private String callForwarding;
	
	public StatusCodeEnumJson getTelesignStatusCode() {
		return telesignStatusCode;
	}
	public void setTelesignStatusCode(StatusCodeEnumJson telesignStatusCode) {
		this.telesignStatusCode = telesignStatusCode;
	}
	public String getCallForwarding() {
		return callForwarding;
	}
	public void setCallForwarding(String callForwarding) {
		this.callForwarding = callForwarding;
	}
	
}
