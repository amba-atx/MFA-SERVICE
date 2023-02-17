package com.amba.service.mfa.JSONObjects;

public class CredentialAuthStatusRequestJson extends CredentialRequestListJson {
	
	private ChallengeQuestionAuthStatusRequestJson challengeQuestionAuthStatusRequest;
	private OobEmailAuthStatusRequestJson oobEmailAuthStatusRequest;
	private OobPhoneAuthStatusRequestJson oobPhoneAuthStatusRequest;
	private AcspAuthStatusRequestDataJson acspAuthStatusRequestData;
	
	public ChallengeQuestionAuthStatusRequestJson getChallengeQuestionAuthStatusRequest() {
		return challengeQuestionAuthStatusRequest;
	}
	public void setChallengeQuestionAuthStatusRequest(
			ChallengeQuestionAuthStatusRequestJson challengeQuestionAuthStatusRequest) {
		this.challengeQuestionAuthStatusRequest = challengeQuestionAuthStatusRequest;
	}
	public OobEmailAuthStatusRequestJson getOobEmailAuthStatusRequest() {
		return oobEmailAuthStatusRequest;
	}
	public void setOobEmailAuthStatusRequest(OobEmailAuthStatusRequestJson oobEmailAuthStatusRequest) {
		this.oobEmailAuthStatusRequest = oobEmailAuthStatusRequest;
	}
	public OobPhoneAuthStatusRequestJson getOobPhoneAuthStatusRequest() {
		return oobPhoneAuthStatusRequest;
	}
	public void setOobPhoneAuthStatusRequest(OobPhoneAuthStatusRequestJson oobPhoneAuthStatusRequest) {
		this.oobPhoneAuthStatusRequest = oobPhoneAuthStatusRequest;
	}
	public AcspAuthStatusRequestDataJson getAcspAuthStatusRequestData() {
		return acspAuthStatusRequestData;
	}
	public void setAcspAuthStatusRequestData(AcspAuthStatusRequestDataJson acspAuthStatusRequestData) {
		this.acspAuthStatusRequestData = acspAuthStatusRequestData;
	}

}
