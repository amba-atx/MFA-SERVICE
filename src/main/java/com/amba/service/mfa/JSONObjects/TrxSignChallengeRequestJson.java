package com.amba.service.mfa.JSONObjects;

public class TrxSignChallengeRequestJson extends AcspChallengeRequestJson {
	
	private PayloadJson payload;

	public PayloadJson getPayload() {
		return payload;
	}

	public void setPayload(PayloadJson payload) {
		this.payload = payload;
	}

}
