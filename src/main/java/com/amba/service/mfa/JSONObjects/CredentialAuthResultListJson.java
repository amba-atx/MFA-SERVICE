package com.amba.service.mfa.JSONObjects;

public class CredentialAuthResultListJson extends CredentialResponseListJson {
	
	private ChallengeQuestionAuthResultJson challengeQuestionAuthResult;
	private OobEmailAuthResultJson oobEmailAuthResult;
	private OobPhoneAuthResultJson oobPhoneAuthResult;
	private AcspAuthenticationResponseDataJson acspAuthenticationResponseData;
	
	public ChallengeQuestionAuthResultJson getChallengeQuestionAuthResult() {
		return challengeQuestionAuthResult;
	}
	public void setChallengeQuestionAuthResult(ChallengeQuestionAuthResultJson challengeQuestionAuthResult) {
		this.challengeQuestionAuthResult = challengeQuestionAuthResult;
	}
	public OobEmailAuthResultJson getOobEmailAuthResult() {
		return oobEmailAuthResult;
	}
	public void setOobEmailAuthResult(OobEmailAuthResultJson oobEmailAuthResult) {
		this.oobEmailAuthResult = oobEmailAuthResult;
	}
	public OobPhoneAuthResultJson getOobPhoneAuthResult() {
		return oobPhoneAuthResult;
	}
	public void setOobPhoneAuthResult(OobPhoneAuthResultJson oobPhoneAuthResult) {
		this.oobPhoneAuthResult = oobPhoneAuthResult;
	}
	public AcspAuthenticationResponseDataJson getAcspAuthenticationResponseData() {
		return acspAuthenticationResponseData;
	}
	public void setAcspAuthenticationResponseData(AcspAuthenticationResponseDataJson acspAuthenticationResponseData) {
		this.acspAuthenticationResponseData = acspAuthenticationResponseData;
	}

}
