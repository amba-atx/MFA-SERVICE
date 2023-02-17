package com.amba.service.mfa.JSONObjects;

public class AmountJson {
	
	private Long amount;
    private Long amountInUSD;
    private String currency;
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Long getAmountInUSD() {
		return amountInUSD;
	}
	public void setAmountInUSD(Long amountInUSD) {
		this.amountInUSD = amountInUSD;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
