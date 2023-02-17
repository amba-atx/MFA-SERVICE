package com.amba.service.mfa.JSONObjects;

public class ChallengeQuestionAuthResultPayloadJson {
	
	private AuthenticationResultJson authenticationResult;
    private CallStatusJson callStatus;
    private ChallengeQuestionMatchResultJson challengeQuestionMatchResult;
    
	public AuthenticationResultJson getAuthenticationResult() {
		return authenticationResult;
	}
	public void setAuthenticationResult(AuthenticationResultJson authenticationResult) {
		this.authenticationResult = authenticationResult;
	}
	public CallStatusJson getCallStatus() {
		return callStatus;
	}
	public void setCallStatus(CallStatusJson callStatus) {
		this.callStatus = callStatus;
	}
	public ChallengeQuestionMatchResultJson getChallengeQuestionMatchResult() {
		return challengeQuestionMatchResult;
	}
	public void setChallengeQuestionMatchResult(ChallengeQuestionMatchResultJson challengeQuestionMatchResult) {
		this.challengeQuestionMatchResult = challengeQuestionMatchResult;
	}

}
