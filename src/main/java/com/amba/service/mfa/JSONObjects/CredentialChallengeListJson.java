package com.amba.service.mfa.JSONObjects;

public class CredentialChallengeListJson extends CredentialResponseListJson {
	
	private ChallengeQuestionChallengeJson challengeQuestionChallenge;
	private OobEmailChallengeJson oobEmailChallenge;
	private OobPhoneChallengeJson oobPhoneChallenge;
	private AcspChallengeResponseDataJson acspChallengeResponseData;
	
	public ChallengeQuestionChallengeJson getChallengeQuestionChallenge() {
		return challengeQuestionChallenge;
	}
	public void setChallengeQuestionChallenge(ChallengeQuestionChallengeJson challengeQuestionChallenge) {
		this.challengeQuestionChallenge = challengeQuestionChallenge;
	}
	public OobEmailChallengeJson getOobEmailChallenge() {
		return oobEmailChallenge;
	}
	public void setOobEmailChallenge(OobEmailChallengeJson oobEmailChallenge) {
		this.oobEmailChallenge = oobEmailChallenge;
	}
	public OobPhoneChallengeJson getOobPhoneChallenge() {
		return oobPhoneChallenge;
	}
	public void setOobPhoneChallenge(OobPhoneChallengeJson oobPhoneChallenge) {
		this.oobPhoneChallenge = oobPhoneChallenge;
	}
	public AcspChallengeResponseDataJson getAcspChallengeResponseData() {
		return acspChallengeResponseData;
	}
	public void setAcspChallengeResponseData(AcspChallengeResponseDataJson acspChallengeResponseData) {
		this.acspChallengeResponseData = acspChallengeResponseData;
	}

}
