package com.amba.service.mfa.JSONObjects;

public class EventDataJson {
	
	private AuthenticationLevelJson authenticationLevel;
	private FactListJson clientDefinedAttributeList;
	private String clientDefinedEventType;
	private String eventDescription;
	private String eventId;
	private String eventReferenceId;
	private EventTypeJson eventType;
	private UserDataJson newUserData;
	private StockTradeDataJson stockTradeData;
	private String timeOfOccurrence;
	private TransactionDataJson transactionData;
	
	public AuthenticationLevelJson getAuthenticationLevel() {
		return authenticationLevel;
	}
	public void setAuthenticationLevel(AuthenticationLevelJson authenticationLevel) {
		this.authenticationLevel = authenticationLevel;
	}
	public FactListJson getClientDefinedAttributeList() {
		return clientDefinedAttributeList;
	}
	public void setClientDefinedAttributeList(FactListJson clientDefinedAttributeList) {
		this.clientDefinedAttributeList = clientDefinedAttributeList;
	}
	public String getClientDefinedEventType() {
		return clientDefinedEventType;
	}
	public void setClientDefinedEventType(String clientDefinedEventType) {
		this.clientDefinedEventType = clientDefinedEventType;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventReferenceId() {
		return eventReferenceId;
	}
	public void setEventReferenceId(String eventReferenceId) {
		this.eventReferenceId = eventReferenceId;
	}
	public EventTypeJson getEventType() {
		return eventType;
	}
	public void setEventType(EventTypeJson eventType) {
		this.eventType = eventType;
	}
	public UserDataJson getNewUserData() {
		return newUserData;
	}
	public void setNewUserData(UserDataJson newUserData) {
		this.newUserData = newUserData;
	}
	public StockTradeDataJson getStockTradeData() {
		return stockTradeData;
	}
	public void setStockTradeData(StockTradeDataJson stockTradeData) {
		this.stockTradeData = stockTradeData;
	}
	public String getTimeOfOccurrence() {
		return timeOfOccurrence;
	}
	public void setTimeOfOccurrence(String timeOfOccurrence) {
		this.timeOfOccurrence = timeOfOccurrence;
	}
	public TransactionDataJson getTransactionData() {
		return transactionData;
	}
	public void setTransactionData(TransactionDataJson transactionData) {
		this.transactionData = transactionData;
	}

}
