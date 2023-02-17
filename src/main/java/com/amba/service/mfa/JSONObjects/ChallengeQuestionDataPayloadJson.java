package com.amba.service.mfa.JSONObjects;

import java.util.List;

public class ChallengeQuestionDataPayloadJson {
	
	private List<ChallengeQuestionJson> challengeQuestion;

	public List<ChallengeQuestionJson> getChallengeQuestion() {
		return challengeQuestion;
	}

	public void setChallengeQuestion(List<ChallengeQuestionJson> challengeQuestion) {
		this.challengeQuestion = challengeQuestion;
	}

}
