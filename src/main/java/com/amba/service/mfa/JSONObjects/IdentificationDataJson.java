package com.amba.service.mfa.JSONObjects;

public class IdentificationDataJson {
	
	private String clientSessionId;
	private String clientTransactionId;
	private Boolean delegated;
	private String tenantId;
	private String groupName;
	private String newUserName;
	private String orgName;
	private String sessionId;
	private String transactionId;
	private String userCountry;
	private String userLanguage;
	private String userLoginName;
	private String userName;
	private UserStatusJson userStatus;
	private WSUserTypeJson userType;
	private String adminID;
	
	public String getClientSessionId() {
		return clientSessionId;
	}
	public void setClientSessionId(String clientSessionId) {
		this.clientSessionId = clientSessionId;
	}
	public String getClientTransactionId() {
		return clientTransactionId;
	}
	public void setClientTransactionId(String clientTransactionId) {
		this.clientTransactionId = clientTransactionId;
	}
	public Boolean getDelegated() {
		return delegated;
	}
	public void setDelegated(Boolean delegated) {
		this.delegated = delegated;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getNewUserName() {
		return newUserName;
	}
	public void setNewUserName(String newUserName) {
		this.newUserName = newUserName;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	public String getUserLanguage() {
		return userLanguage;
	}
	public void setUserLanguage(String userLanguage) {
		this.userLanguage = userLanguage;
	}
	public String getUserLoginName() {
		return userLoginName;
	}
	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public UserStatusJson getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(UserStatusJson userStatus) {
		this.userStatus = userStatus;
	}
	public WSUserTypeJson getUserType() {
		return userType;
	}
	public void setUserType(WSUserTypeJson userType) {
		this.userType = userType;
	}
	public String getAdminID() {
		return adminID;
	}
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}

}
