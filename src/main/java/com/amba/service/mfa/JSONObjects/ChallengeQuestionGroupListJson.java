package com.amba.service.mfa.JSONObjects;

import java.util.ArrayList;
import java.util.List;

public class ChallengeQuestionGroupListJson {
	
	private List<ChallengeQuestionGroupJson> questionGroup;

	public List<ChallengeQuestionGroupJson> getQuestionGroup() {
		if (questionGroup == null) {
            questionGroup = new ArrayList<ChallengeQuestionGroupJson>();
        }
        return this.questionGroup;
	}

	public void setQuestionGroup(List<ChallengeQuestionGroupJson> questionGroup) {
		this.questionGroup = questionGroup;
	}

}
