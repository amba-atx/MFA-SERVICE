package com.amba.service.mfa.JSONObjects;

public class TelesignSmsAcspChallengeResponseJson extends TelesignGenAcspChallengeResponseJson {
	
	private StatusCodeEnum2Json telesignStatusCode;

	public StatusCodeEnum2Json getTelesignStatusCode() {
		return telesignStatusCode;
	}

	public void setTelesignStatusCode(StatusCodeEnum2Json telesignStatusCode) {
		this.telesignStatusCode = telesignStatusCode;
	}
	
}
