package com.amba.service.mfa.JSONObjects;

import java.util.List;

public class KBAAuthenticationResponseJson extends AcspAuthenticationResponseJson {
	
	private ResultStatusJson resultStatus;
	private List<QuestionJson> questions;
	
	public ResultStatusJson getResultStatus() {
		return resultStatus;
	}
	public void setResultStatus(ResultStatusJson resultStatus) {
		this.resultStatus = resultStatus;
	}
	public List<QuestionJson> getQuestions() {
		return questions;
	}
	public void setQuestions(List<QuestionJson> questions) {
		this.questions = questions;
	}

}
