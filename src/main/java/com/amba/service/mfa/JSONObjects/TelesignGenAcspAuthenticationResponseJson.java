package com.amba.service.mfa.JSONObjects;

public abstract class TelesignGenAcspAuthenticationResponseJson extends AcspAuthenticationResponseJson {

	private VerifyStateEnumJson telesignVerifyState;

	public VerifyStateEnumJson getTelesignVerifyState() {
		return telesignVerifyState;
	}

	public void setTelesignVerifyState(VerifyStateEnumJson telesignVerifyState) {
		this.telesignVerifyState = telesignVerifyState;
	}
	
}
