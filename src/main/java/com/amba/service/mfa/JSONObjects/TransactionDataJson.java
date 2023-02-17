package com.amba.service.mfa.JSONObjects;

public class TransactionDataJson {
	
	private AmountJson amount;
	private String dueDate;
	private String estimatedDeliveryDate;
	private ExecutionSpeedJson executionSpeed;
	private AccountDataJson myAccountData;
	private OtherAccountBankTypeJson otherAccountBankType;
	private AccountDataJson otherAccountData;
	private OtherAccountOwnershipTypeJson otherAccountOwnershipType;
	private OtherAccountTypeJson otherAccountType;
	private AmountJson previousAmount;
	private Integer recurringFrequency;
	private ScheduleJson schedule;
	private TransferMediumTypeJson transferMediumType;
	
	public AmountJson getAmount() {
		return amount;
	}
	public void setAmount(AmountJson amount) {
		this.amount = amount;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}
	public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}
	public ExecutionSpeedJson getExecutionSpeed() {
		return executionSpeed;
	}
	public void setExecutionSpeed(ExecutionSpeedJson executionSpeed) {
		this.executionSpeed = executionSpeed;
	}
	public AccountDataJson getMyAccountData() {
		return myAccountData;
	}
	public void setMyAccountData(AccountDataJson myAccountData) {
		this.myAccountData = myAccountData;
	}
	public OtherAccountBankTypeJson getOtherAccountBankType() {
		return otherAccountBankType;
	}
	public void setOtherAccountBankType(OtherAccountBankTypeJson otherAccountBankType) {
		this.otherAccountBankType = otherAccountBankType;
	}
	public AccountDataJson getOtherAccountData() {
		return otherAccountData;
	}
	public void setOtherAccountData(AccountDataJson otherAccountData) {
		this.otherAccountData = otherAccountData;
	}
	public OtherAccountOwnershipTypeJson getOtherAccountOwnershipType() {
		return otherAccountOwnershipType;
	}
	public void setOtherAccountOwnershipType(OtherAccountOwnershipTypeJson otherAccountOwnershipType) {
		this.otherAccountOwnershipType = otherAccountOwnershipType;
	}
	public OtherAccountTypeJson getOtherAccountType() {
		return otherAccountType;
	}
	public void setOtherAccountType(OtherAccountTypeJson otherAccountType) {
		this.otherAccountType = otherAccountType;
	}
	public AmountJson getPreviousAmount() {
		return previousAmount;
	}
	public void setPreviousAmount(AmountJson previousAmount) {
		this.previousAmount = previousAmount;
	}
	public Integer getRecurringFrequency() {
		return recurringFrequency;
	}
	public void setRecurringFrequency(Integer recurringFrequency) {
		this.recurringFrequency = recurringFrequency;
	}
	public ScheduleJson getSchedule() {
		return schedule;
	}
	public void setSchedule(ScheduleJson schedule) {
		this.schedule = schedule;
	}
	public TransferMediumTypeJson getTransferMediumType() {
		return transferMediumType;
	}
	public void setTransferMediumType(TransferMediumTypeJson transferMediumType) {
		this.transferMediumType = transferMediumType;
	}

}
