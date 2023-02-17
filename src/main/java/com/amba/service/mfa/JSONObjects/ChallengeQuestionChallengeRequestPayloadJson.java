package com.amba.service.mfa.JSONObjects;

public class ChallengeQuestionChallengeRequestPayloadJson {
	
	private ChallengeQuestionIdListJson excludeQuestions;
    private Integer numberOfQuestion;
    
	public ChallengeQuestionIdListJson getExcludeQuestions() {
		return excludeQuestions;
	}
	public void setExcludeQuestions(ChallengeQuestionIdListJson excludeQuestions) {
		this.excludeQuestions = excludeQuestions;
	}
	public Integer getNumberOfQuestion() {
		return numberOfQuestion;
	}
	public void setNumberOfQuestion(Integer numberOfQuestion) {
		this.numberOfQuestion = numberOfQuestion;
	}
    
}
