package com.amba.service.mfa.JSONObjects;

public class ChallengeQuestionManagementRequestPayloadJson {
	
	private ChallengeQuestionActionTypeListJson actionTypeList;
    private ChallengeQuestionConfigJson challengeQuestionConfig;
    private ChallengeQuestionListJson challengeQuestionList;
	public ChallengeQuestionActionTypeListJson getActionTypeList() {
		return actionTypeList;
	}
	public void setActionTypeList(ChallengeQuestionActionTypeListJson actionTypeList) {
		this.actionTypeList = actionTypeList;
	}
	public ChallengeQuestionConfigJson getChallengeQuestionConfig() {
		return challengeQuestionConfig;
	}
	public void setChallengeQuestionConfig(ChallengeQuestionConfigJson challengeQuestionConfig) {
		this.challengeQuestionConfig = challengeQuestionConfig;
	}
	public ChallengeQuestionListJson getChallengeQuestionList() {
		return challengeQuestionList;
	}
	public void setChallengeQuestionList(ChallengeQuestionListJson challengeQuestionList) {
		this.challengeQuestionList = challengeQuestionList;
	}

}
