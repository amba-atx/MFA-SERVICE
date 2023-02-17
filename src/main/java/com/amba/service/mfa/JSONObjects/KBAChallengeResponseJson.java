package com.amba.service.mfa.JSONObjects;

import java.util.List;

public class KBAChallengeResponseJson extends AcspChallengeResponseJson {
	
	private List<QuestionJson> questions;

	public List<QuestionJson> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionJson> questions) {
		this.questions = questions;
	}

}
