package com.amba.service.mfa.JSONObjects;

import java.util.ArrayList;
import java.util.List;

public class ChallengeQuestionActionTypeListJson extends ActionTypeListJson {
	
	private List<ChallengeQuestionActionTypeJson> challengeQuestionActionType;

	public List<ChallengeQuestionActionTypeJson> getChallengeQuestionActionType() {
		 if (challengeQuestionActionType == null) {
	            challengeQuestionActionType = new ArrayList<ChallengeQuestionActionTypeJson>();
	        }
	        return this.challengeQuestionActionType;
	}

	public void setChallengeQuestionActionType(List<ChallengeQuestionActionTypeJson> challengeQuestionActionType) {
		this.challengeQuestionActionType = challengeQuestionActionType;
	}

}
