package com.amba.service.mfa.JSONObjects;

import java.math.BigInteger;

public class ATMJson {
	
	private String timezone;
    private ATMOwnerTypeJson atmOwner;
    private String atmID;
    private ATMLocationTypesJson locationType;
    private String cardIssueDate;
    private String atmLanguage;
    private ATMLocationJson location;
    private String atmIP;
    private GenderJson userGender;
    private BigInteger atmExternalScore;
    private LoginFailureTypeJson loginFailureReason;
    private BigInteger numberOfFailedLogins;
    private BigInteger userYearOfBirth;
    private String cardPINChangeDate;
    private String atmModel;
    private String atmOS;
    private String atmOwnerOther;
    private String cardIssuerID;
    private String cardType;
    private AmountJson atmDailyLimit;
    private AmountJson cardDailyLimit;
    
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public ATMOwnerTypeJson getAtmOwner() {
		return atmOwner;
	}
	public void setAtmOwner(ATMOwnerTypeJson atmOwner) {
		this.atmOwner = atmOwner;
	}
	public String getAtmID() {
		return atmID;
	}
	public void setAtmID(String atmID) {
		this.atmID = atmID;
	}
	public ATMLocationTypesJson getLocationType() {
		return locationType;
	}
	public void setLocationType(ATMLocationTypesJson locationType) {
		this.locationType = locationType;
	}
	public String getCardIssueDate() {
		return cardIssueDate;
	}
	public void setCardIssueDate(String cardIssueDate) {
		this.cardIssueDate = cardIssueDate;
	}
	public String getAtmLanguage() {
		return atmLanguage;
	}
	public void setAtmLanguage(String atmLanguage) {
		this.atmLanguage = atmLanguage;
	}
	public ATMLocationJson getLocation() {
		return location;
	}
	public void setLocation(ATMLocationJson location) {
		this.location = location;
	}
	public String getAtmIP() {
		return atmIP;
	}
	public void setAtmIP(String atmIP) {
		this.atmIP = atmIP;
	}
	public GenderJson getUserGender() {
		return userGender;
	}
	public void setUserGender(GenderJson userGender) {
		this.userGender = userGender;
	}
	public BigInteger getAtmExternalScore() {
		return atmExternalScore;
	}
	public void setAtmExternalScore(BigInteger atmExternalScore) {
		this.atmExternalScore = atmExternalScore;
	}
	public LoginFailureTypeJson getLoginFailureReason() {
		return loginFailureReason;
	}
	public void setLoginFailureReason(LoginFailureTypeJson loginFailureReason) {
		this.loginFailureReason = loginFailureReason;
	}
	public BigInteger getNumberOfFailedLogins() {
		return numberOfFailedLogins;
	}
	public void setNumberOfFailedLogins(BigInteger numberOfFailedLogins) {
		this.numberOfFailedLogins = numberOfFailedLogins;
	}
	public BigInteger getUserYearOfBirth() {
		return userYearOfBirth;
	}
	public void setUserYearOfBirth(BigInteger userYearOfBirth) {
		this.userYearOfBirth = userYearOfBirth;
	}
	public String getCardPINChangeDate() {
		return cardPINChangeDate;
	}
	public void setCardPINChangeDate(String cardPINChangeDate) {
		this.cardPINChangeDate = cardPINChangeDate;
	}
	public String getAtmModel() {
		return atmModel;
	}
	public void setAtmModel(String atmModel) {
		this.atmModel = atmModel;
	}
	public String getAtmOS() {
		return atmOS;
	}
	public void setAtmOS(String atmOS) {
		this.atmOS = atmOS;
	}
	public String getAtmOwnerOther() {
		return atmOwnerOther;
	}
	public void setAtmOwnerOther(String atmOwnerOther) {
		this.atmOwnerOther = atmOwnerOther;
	}
	public String getCardIssuerID() {
		return cardIssuerID;
	}
	public void setCardIssuerID(String cardIssuerID) {
		this.cardIssuerID = cardIssuerID;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public AmountJson getAtmDailyLimit() {
		return atmDailyLimit;
	}
	public void setAtmDailyLimit(AmountJson atmDailyLimit) {
		this.atmDailyLimit = atmDailyLimit;
	}
	public AmountJson getCardDailyLimit() {
		return cardDailyLimit;
	}
	public void setCardDailyLimit(AmountJson cardDailyLimit) {
		this.cardDailyLimit = cardDailyLimit;
	}

}
