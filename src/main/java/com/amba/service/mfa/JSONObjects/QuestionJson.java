package com.amba.service.mfa.JSONObjects;

import java.util.List;

public class QuestionJson {
	
	  private Long questionId;
	    private String text;
	    private List<ChoiceJson> choices;
		public Long getQuestionId() {
			return questionId;
		}
		public void setQuestionId(Long questionId) {
			this.questionId = questionId;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public List<ChoiceJson> getChoices() {
			return choices;
		}
		public void setChoices(List<ChoiceJson> choices) {
			this.choices = choices;
		}


}
