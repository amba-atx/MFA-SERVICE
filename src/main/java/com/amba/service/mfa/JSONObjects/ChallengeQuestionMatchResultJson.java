package com.amba.service.mfa.JSONObjects;

public class ChallengeQuestionMatchResultJson {
	
	private Integer failCount;
    private Integer matchCount;
    private Integer authFailCount;
    private Boolean shouldBlock;
	public Integer getFailCount() {
		return failCount;
	}
	public void setFailCount(Integer failCount) {
		this.failCount = failCount;
	}
	public Integer getMatchCount() {
		return matchCount;
	}
	public void setMatchCount(Integer matchCount) {
		this.matchCount = matchCount;
	}
	public Integer getAuthFailCount() {
		return authFailCount;
	}
	public void setAuthFailCount(Integer authFailCount) {
		this.authFailCount = authFailCount;
	}
	public Boolean getShouldBlock() {
		return shouldBlock;
	}
	public void setShouldBlock(Boolean shouldBlock) {
		this.shouldBlock = shouldBlock;
	}

}
