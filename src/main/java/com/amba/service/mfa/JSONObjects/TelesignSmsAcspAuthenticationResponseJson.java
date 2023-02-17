package com.amba.service.mfa.JSONObjects;

public class TelesignSmsAcspAuthenticationResponseJson extends TelesignGenAcspAuthenticationResponseJson {    

	private StatusCodeEnum2Json telesignStatusCode;

	public StatusCodeEnum2Json getTelesignStatusCode() {
		return telesignStatusCode;
	}

	public void setTelesignStatusCode(StatusCodeEnum2Json telesignStatusCode) {
		this.telesignStatusCode = telesignStatusCode;
	}

}
