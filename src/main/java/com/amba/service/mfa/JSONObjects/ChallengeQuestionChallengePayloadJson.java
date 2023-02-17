package com.amba.service.mfa.JSONObjects;


public class ChallengeQuestionChallengePayloadJson {
	
	private CallStatusJson callStatus;
    private ChallengeQuestionListJson challengeQuestions;
    
	public CallStatusJson getCallStatus() {
		return callStatus;
	}
	public void setCallStatus(CallStatusJson callStatus) {
		this.callStatus = callStatus;
	}
	public ChallengeQuestionListJson getChallengeQuestions() {
		return challengeQuestions;
	}
	public void setChallengeQuestions(ChallengeQuestionListJson challengeQuestions) {
		this.challengeQuestions = challengeQuestions;
	}
    
    

}
