package com.amba.service.mfa.JSONObjects;

public class UserDataJson {
	
	private Boolean vip;
	private Boolean business;
	private String lastAccountOpenDate;
	private String lastOnlineServicePasswordChangeDate;
	private String onlineServiceEnrollDate;
	private AmountJson totalAvailableBalance;
	private AmountJson totalCreditLimit;
	private AmountJson totalCreditsUsed;
	private UserAddressJson userAddress;
	private UserNameJson userNameData;
	private String lastPhoneChangeDate;
	private String lastEmailChangeDate;
	
	public Boolean getVip() {
		return vip;
	}
	public void setVip(Boolean vip) {
		this.vip = vip;
	}
	public Boolean getBusiness() {
		return business;
	}
	public void setBusiness(Boolean business) {
		this.business = business;
	}
	public String getLastAccountOpenDate() {
		return lastAccountOpenDate;
	}
	public void setLastAccountOpenDate(String lastAccountOpenDate) {
		this.lastAccountOpenDate = lastAccountOpenDate;
	}
	public String getLastOnlineServicePasswordChangeDate() {
		return lastOnlineServicePasswordChangeDate;
	}
	public void setLastOnlineServicePasswordChangeDate(String lastOnlineServicePasswordChangeDate) {
		this.lastOnlineServicePasswordChangeDate = lastOnlineServicePasswordChangeDate;
	}
	public String getOnlineServiceEnrollDate() {
		return onlineServiceEnrollDate;
	}
	public void setOnlineServiceEnrollDate(String onlineServiceEnrollDate) {
		this.onlineServiceEnrollDate = onlineServiceEnrollDate;
	}
	public AmountJson getTotalAvailableBalance() {
		return totalAvailableBalance;
	}
	public void setTotalAvailableBalance(AmountJson totalAvailableBalance) {
		this.totalAvailableBalance = totalAvailableBalance;
	}
	public AmountJson getTotalCreditLimit() {
		return totalCreditLimit;
	}
	public void setTotalCreditLimit(AmountJson totalCreditLimit) {
		this.totalCreditLimit = totalCreditLimit;
	}
	public AmountJson getTotalCreditsUsed() {
		return totalCreditsUsed;
	}
	public void setTotalCreditsUsed(AmountJson totalCreditsUsed) {
		this.totalCreditsUsed = totalCreditsUsed;
	}
	public UserAddressJson getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(UserAddressJson userAddress) {
		this.userAddress = userAddress;
	}
	public UserNameJson getUserNameData() {
		return userNameData;
	}
	public void setUserNameData(UserNameJson userNameData) {
		this.userNameData = userNameData;
	}
	public String getLastPhoneChangeDate() {
		return lastPhoneChangeDate;
	}
	public void setLastPhoneChangeDate(String lastPhoneChangeDate) {
		this.lastPhoneChangeDate = lastPhoneChangeDate;
	}
	public String getLastEmailChangeDate() {
		return lastEmailChangeDate;
	}
	public void setLastEmailChangeDate(String lastEmailChangeDate) {
		this.lastEmailChangeDate = lastEmailChangeDate;
	}

}
