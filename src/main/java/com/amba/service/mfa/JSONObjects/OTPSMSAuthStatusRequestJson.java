package com.amba.service.mfa.JSONObjects;

import com.amba.service.mfa.stub.client.AcspAuthStatusRequest;

public class OTPSMSAuthStatusRequestJson

		extends AcspAuthStatusRequestJson {

	private String otp;

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}
	
	

}
