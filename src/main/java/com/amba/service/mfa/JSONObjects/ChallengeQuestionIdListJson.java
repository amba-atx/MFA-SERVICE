package com.amba.service.mfa.JSONObjects;

import java.util.ArrayList;
import java.util.List;

public class ChallengeQuestionIdListJson {
	
	private List<String> questionId;

	public List<String> getQuestionId() {
		if (questionId == null) {
            questionId = new ArrayList<String>();
        }
        return this.questionId;
	}

	public void setQuestionId(List<String> questionId) {
		this.questionId = questionId;
	}
	
	

}
