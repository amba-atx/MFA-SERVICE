package com.amba.service.mfa.JSONObjects;

public class TelesignCallAcspChallengeResponseJson extends TelesignGenAcspChallengeResponseJson {
	
	private StatusCodeEnumJson telesignStatusCode;

	public StatusCodeEnumJson getTelesignStatusCode() {
		return telesignStatusCode;
	}

	public void setTelesignStatusCode(StatusCodeEnumJson telesignStatusCode) {
		this.telesignStatusCode = telesignStatusCode;
	}
	
}
