package com.amba.service.mfa.JSONObjects;

public class ConfigurationHeaderJson {
	
	private String application;
    private String instanceId;
    private String ruleSet;
    
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getInstanceId() {
		return instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	public String getRuleSet() {
		return ruleSet;
	}
	public void setRuleSet(String ruleSet) {
		this.ruleSet = ruleSet;
	}

}
