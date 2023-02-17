package com.amba.service.mfa.JSONObjects;

public abstract class TelesignGenAcspAuthenticationRequestJson extends AcspAuthenticationRequestJson {
	
	private String verifyCode;

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

}
