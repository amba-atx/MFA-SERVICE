package com.amba.service.mfa.JSONObjects;

import java.util.List;

public class AnswerJson {
	
	 private Long questionId;
	 private List<Long> choiceIds;
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public List<Long> getChoiceIds() {
		return choiceIds;
	}
	public void setChoiceIds(List<Long> choiceIds) {
		this.choiceIds = choiceIds;
	}

}
