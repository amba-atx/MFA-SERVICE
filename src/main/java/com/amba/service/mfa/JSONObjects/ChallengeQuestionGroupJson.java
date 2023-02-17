package com.amba.service.mfa.JSONObjects;

import java.util.List;

public class ChallengeQuestionGroupJson {
	
	private List<ChallengeQuestionJson> challengeQuestion;
	private String groupName;
	private Boolean retired;
	 
	public List<ChallengeQuestionJson> getChallengeQuestion() {
		return challengeQuestion;
	}
	public void setChallengeQuestion(List<ChallengeQuestionJson> challengeQuestion) {
		this.challengeQuestion = challengeQuestion;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Boolean getRetired() {
		return retired;
	}
	public void setRetired(Boolean retired) {
		this.retired = retired;
	}

}
