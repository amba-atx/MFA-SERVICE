package com.amba.service.mfa.JSONObjects;

public class PayloadJson {
	private String amount;
    private String currency;
    private String dueDate;
    private String recurringFrequency;
    private String fromAccountNickname;
    private String fromAccountNumber;
    private String payeeName;
    private String payeeAccountNumber;
    private String internationalAccountNumber;
    private String payeeRoutingCode;
    private String payeeAccountCountry;
    private String payeeReferenceCode;
    private String customField;
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getRecurringFrequency() {
		return recurringFrequency;
	}
	public void setRecurringFrequency(String recurringFrequency) {
		this.recurringFrequency = recurringFrequency;
	}
	public String getFromAccountNickname() {
		return fromAccountNickname;
	}
	public void setFromAccountNickname(String fromAccountNickname) {
		this.fromAccountNickname = fromAccountNickname;
	}
	public String getFromAccountNumber() {
		return fromAccountNumber;
	}
	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public String getPayeeAccountNumber() {
		return payeeAccountNumber;
	}
	public void setPayeeAccountNumber(String payeeAccountNumber) {
		this.payeeAccountNumber = payeeAccountNumber;
	}
	public String getInternationalAccountNumber() {
		return internationalAccountNumber;
	}
	public void setInternationalAccountNumber(String internationalAccountNumber) {
		this.internationalAccountNumber = internationalAccountNumber;
	}
	public String getPayeeRoutingCode() {
		return payeeRoutingCode;
	}
	public void setPayeeRoutingCode(String payeeRoutingCode) {
		this.payeeRoutingCode = payeeRoutingCode;
	}
	public String getPayeeAccountCountry() {
		return payeeAccountCountry;
	}
	public void setPayeeAccountCountry(String payeeAccountCountry) {
		this.payeeAccountCountry = payeeAccountCountry;
	}
	public String getPayeeReferenceCode() {
		return payeeReferenceCode;
	}
	public void setPayeeReferenceCode(String payeeReferenceCode) {
		this.payeeReferenceCode = payeeReferenceCode;
	}
	public String getCustomField() {
		return customField;
	}
	public void setCustomField(String customField) {
		this.customField = customField;
	}


}
