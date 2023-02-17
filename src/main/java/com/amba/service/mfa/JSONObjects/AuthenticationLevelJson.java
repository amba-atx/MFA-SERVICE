package com.amba.service.mfa.JSONObjects;

public class AuthenticationLevelJson {
	
	private Integer attemptsTryCount;
    private Integer level;
    private Boolean successful;
    
	public Integer getAttemptsTryCount() {
		return attemptsTryCount;
	}
	public void setAttemptsTryCount(Integer attemptsTryCount) {
		this.attemptsTryCount = attemptsTryCount;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Boolean getSuccessful() {
		return successful;
	}
	public void setSuccessful(Boolean successful) {
		this.successful = successful;
	}

}
