package com.amba.service.mfa.JSONObjects;

public class ChallengeQuestionManagementResponsePayloadJson {
	
	private String acspAccountId;
    private ChallengeQuestionGroupListJson browsableChallQuesGroupList;
    private CallStatusJson callStatus;
    private ChallengeQuestionListJson userChallQuesDataList;
	public String getAcspAccountId() {
		return acspAccountId;
	}
	public void setAcspAccountId(String acspAccountId) {
		this.acspAccountId = acspAccountId;
	}
	public ChallengeQuestionGroupListJson getBrowsableChallQuesGroupList() {
		return browsableChallQuesGroupList;
	}
	public void setBrowsableChallQuesGroupList(ChallengeQuestionGroupListJson browsableChallQuesGroupList) {
		this.browsableChallQuesGroupList = browsableChallQuesGroupList;
	}
	public CallStatusJson getCallStatus() {
		return callStatus;
	}
	public void setCallStatus(CallStatusJson callStatus) {
		this.callStatus = callStatus;
	}
	public ChallengeQuestionListJson getUserChallQuesDataList() {
		return userChallQuesDataList;
	}
	public void setUserChallQuesDataList(ChallengeQuestionListJson userChallQuesDataList) {
		this.userChallQuesDataList = userChallQuesDataList;
	}
    
}
