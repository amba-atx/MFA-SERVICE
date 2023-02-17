package com.amba.service.mfa.JSONObjects;

import java.util.ArrayList;
import java.util.List;

public class ChallengeQuestionListJson {
	
	private List<ChallengeQuestionJson> challengeQuestion;

	public List<ChallengeQuestionJson> getChallengeQuestion() {
		if (challengeQuestion == null) {
            challengeQuestion = new ArrayList<ChallengeQuestionJson>();
        }
        return this.challengeQuestion;
	}

	public void setChallengeQuestion(List<ChallengeQuestionJson> challengeQuestion) {
		this.challengeQuestion = challengeQuestion;
	}

}
