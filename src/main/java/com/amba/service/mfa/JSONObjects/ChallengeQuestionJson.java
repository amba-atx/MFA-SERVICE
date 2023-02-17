package com.amba.service.mfa.JSONObjects;

public class ChallengeQuestionJson {
	
	private String actualAnswer;
    private String actualAnswerOnFile;
    private String questionId;
    private String questionText;
    private String userAnswer;
	public String getActualAnswer() {
		return actualAnswer;
	}
	public void setActualAnswer(String actualAnswer) {
		this.actualAnswer = actualAnswer;
	}
	public String getActualAnswerOnFile() {
		return actualAnswerOnFile;
	}
	public void setActualAnswerOnFile(String actualAnswerOnFile) {
		this.actualAnswerOnFile = actualAnswerOnFile;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public String getUserAnswer() {
		return userAnswer;
	}
	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}

}
