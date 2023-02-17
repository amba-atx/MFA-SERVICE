package com.amba.service.mfa.JSONObjects;

public class TriggeredRuleJson {
	
	private ActionCodeJson actionCode;
	private String actionName;
	private ActionApplyTypeJson actionType;
	private FactListJson clientFactList;
	private String ruleId;
	private String ruleName;
	
	public ActionCodeJson getActionCode() {
		return actionCode;
	}
	public void setActionCode(ActionCodeJson actionCode) {
		this.actionCode = actionCode;
	}
	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	public ActionApplyTypeJson getActionType() {
		return actionType;
	}
	public void setActionType(ActionApplyTypeJson actionType) {
		this.actionType = actionType;
	}
	public FactListJson getClientFactList() {
		return clientFactList;
	}
	public void setClientFactList(FactListJson clientFactList) {
		this.clientFactList = clientFactList;
	}
	public String getRuleId() {
		return ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

}
