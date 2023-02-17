package com.amba.service.mfa.JSONObjects;


public class ChallengeQuestionConfigJson {
	
	private ChallengeQuestionIdListJson excludeQuestionList;
    private Boolean excludeUserQuestions;
    private Integer groupCount;
    private Boolean includeRetired;
    private Integer questionCount;
	public ChallengeQuestionIdListJson getExcludeQuestionList() {
		return excludeQuestionList;
	}
	public void setExcludeQuestionList(ChallengeQuestionIdListJson excludeQuestionList) {
		this.excludeQuestionList = excludeQuestionList;
	}
	public Boolean getExcludeUserQuestions() {
		return excludeUserQuestions;
	}
	public void setExcludeUserQuestions(Boolean excludeUserQuestions) {
		this.excludeUserQuestions = excludeUserQuestions;
	}
	public Integer getGroupCount() {
		return groupCount;
	}
	public void setGroupCount(Integer groupCount) {
		this.groupCount = groupCount;
	}
	public Boolean getIncludeRetired() {
		return includeRetired;
	}
	public void setIncludeRetired(Boolean includeRetired) {
		this.includeRetired = includeRetired;
	}
	public Integer getQuestionCount() {
		return questionCount;
	}
	public void setQuestionCount(Integer questionCount) {
		this.questionCount = questionCount;
	}

}
