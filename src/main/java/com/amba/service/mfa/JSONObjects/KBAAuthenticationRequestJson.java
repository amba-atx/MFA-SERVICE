package com.amba.service.mfa.JSONObjects;

import java.util.ArrayList;
import java.util.List;

public class KBAAuthenticationRequestJson extends AcspAuthenticationRequestJson {
	
	private List<AnswerJson> answers;

	public List<AnswerJson> getAnswers() {
		if (answers == null) {
			answers = new ArrayList<AnswerJson>();
		}
		return this.answers;
	}

	public void setAnswers(List<AnswerJson> answers) {
		this.answers = answers;
	}

}
