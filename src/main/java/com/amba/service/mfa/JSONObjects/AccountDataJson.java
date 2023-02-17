package com.amba.service.mfa.JSONObjects;

import javax.xml.bind.annotation.XmlSchemaType;

import com.amba.service.mfa.stub.client.AccountOwnershipType;
import com.amba.service.mfa.stub.client.AccountRelationType;
import com.amba.service.mfa.stub.client.AccountType;
import com.amba.service.mfa.stub.client.Amount;

public class AccountDataJson {
	
	private AmountJson accountBalance;
	private String accountCategory;
	private String accountCountry;
	private AmountJson accountCreditLimit;
    private AmountJson accountCreditsTurnover;
    private AmountJson accountCreditsUsed;
    private AmountJson accountDailyLimit;
    private String accountLastCreditGrantDate;
    private String accountName;
    private String accountNickName;
    private String accountNumber;
    private String internationalAccountNumber;
    private String accountOpenedDate;
    private AccountOwnershipTypeJson accountOwnershipType;
    private AccountRelationTypeJson accountRelationType;
    private AccountTypeJson accountType;
    private String clientDefinedAccountType;
    private Integer externalRiskScore;
    private Boolean liquid;
    private String nextLiquidDate;
    private String referenceCode;
    private String routingCode;
    private String swiftCode;
	public AmountJson getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(AmountJson accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountCategory() {
		return accountCategory;
	}
	public void setAccountCategory(String accountCategory) {
		this.accountCategory = accountCategory;
	}
	public String getAccountCountry() {
		return accountCountry;
	}
	public void setAccountCountry(String accountCountry) {
		this.accountCountry = accountCountry;
	}
	public AmountJson getAccountCreditLimit() {
		return accountCreditLimit;
	}
	public void setAccountCreditLimit(AmountJson accountCreditLimit) {
		this.accountCreditLimit = accountCreditLimit;
	}
	public AmountJson getAccountCreditsTurnover() {
		return accountCreditsTurnover;
	}
	public void setAccountCreditsTurnover(AmountJson accountCreditsTurnover) {
		this.accountCreditsTurnover = accountCreditsTurnover;
	}
	public AmountJson getAccountCreditsUsed() {
		return accountCreditsUsed;
	}
	public void setAccountCreditsUsed(AmountJson accountCreditsUsed) {
		this.accountCreditsUsed = accountCreditsUsed;
	}
	public AmountJson getAccountDailyLimit() {
		return accountDailyLimit;
	}
	public void setAccountDailyLimit(AmountJson accountDailyLimit) {
		this.accountDailyLimit = accountDailyLimit;
	}
	public String getAccountLastCreditGrantDate() {
		return accountLastCreditGrantDate;
	}
	public void setAccountLastCreditGrantDate(String accountLastCreditGrantDate) {
		this.accountLastCreditGrantDate = accountLastCreditGrantDate;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountNickName() {
		return accountNickName;
	}
	public void setAccountNickName(String accountNickName) {
		this.accountNickName = accountNickName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getInternationalAccountNumber() {
		return internationalAccountNumber;
	}
	public void setInternationalAccountNumber(String internationalAccountNumber) {
		this.internationalAccountNumber = internationalAccountNumber;
	}
	public String getAccountOpenedDate() {
		return accountOpenedDate;
	}
	public void setAccountOpenedDate(String accountOpenedDate) {
		this.accountOpenedDate = accountOpenedDate;
	}
	public AccountOwnershipTypeJson getAccountOwnershipType() {
		return accountOwnershipType;
	}
	public void setAccountOwnershipType(AccountOwnershipTypeJson accountOwnershipType) {
		this.accountOwnershipType = accountOwnershipType;
	}
	public AccountRelationTypeJson getAccountRelationType() {
		return accountRelationType;
	}
	public void setAccountRelationType(AccountRelationTypeJson accountRelationType) {
		this.accountRelationType = accountRelationType;
	}
	public AccountTypeJson getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountTypeJson accountType) {
		this.accountType = accountType;
	}
	public String getClientDefinedAccountType() {
		return clientDefinedAccountType;
	}
	public void setClientDefinedAccountType(String clientDefinedAccountType) {
		this.clientDefinedAccountType = clientDefinedAccountType;
	}
	public Integer getExternalRiskScore() {
		return externalRiskScore;
	}
	public void setExternalRiskScore(Integer externalRiskScore) {
		this.externalRiskScore = externalRiskScore;
	}
	public Boolean getLiquid() {
		return liquid;
	}
	public void setLiquid(Boolean liquid) {
		this.liquid = liquid;
	}
	public String getNextLiquidDate() {
		return nextLiquidDate;
	}
	public void setNextLiquidDate(String nextLiquidDate) {
		this.nextLiquidDate = nextLiquidDate;
	}
	public String getReferenceCode() {
		return referenceCode;
	}
	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}
	public String getRoutingCode() {
		return routingCode;
	}
	public void setRoutingCode(String routingCode) {
		this.routingCode = routingCode;
	}
	public String getSwiftCode() {
		return swiftCode;
	}
	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

}
