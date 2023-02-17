package com.amba.service.mfa.JSONObjects;

public class CredentialChallengeRequestListJson extends CredentialRequestListJson {
	
	private ChallengeQuestionChallengeRequestJson challengeQuestionChallengeRequest;
	private OobEmailChallengeRequestJson oobEmailChallengeRequest;
	private OobPhoneChallengeRequestJson oobPhoneChallengeRequest;
	private AcspChallengeRequestDataJson acspChallengeRequestData;
	
	public ChallengeQuestionChallengeRequestJson getChallengeQuestionChallengeRequest() {
		return challengeQuestionChallengeRequest;
	}
	public void setChallengeQuestionChallengeRequest(
			ChallengeQuestionChallengeRequestJson challengeQuestionChallengeRequest) {
		this.challengeQuestionChallengeRequest = challengeQuestionChallengeRequest;
	}
	public OobEmailChallengeRequestJson getOobEmailChallengeRequest() {
		return oobEmailChallengeRequest;
	}
	public void setOobEmailChallengeRequest(OobEmailChallengeRequestJson oobEmailChallengeRequest) {
		this.oobEmailChallengeRequest = oobEmailChallengeRequest;
	}
	public OobPhoneChallengeRequestJson getOobPhoneChallengeRequest() {
		return oobPhoneChallengeRequest;
	}
	public void setOobPhoneChallengeRequest(OobPhoneChallengeRequestJson oobPhoneChallengeRequest) {
		this.oobPhoneChallengeRequest = oobPhoneChallengeRequest;
	}
	public AcspChallengeRequestDataJson getAcspChallengeRequestData() {
		return acspChallengeRequestData;
	}
	public void setAcspChallengeRequestData(AcspChallengeRequestDataJson acspChallengeRequestData) {
		this.acspChallengeRequestData = acspChallengeRequestData;
	}

}
