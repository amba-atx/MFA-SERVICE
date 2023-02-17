package com.amba.service.mfa.JSONObjects;

public class RiskResultJson {

	
	

    private Integer riskScore;
    private String riskScoreBand;
    private TriggeredRuleJson triggeredRule;
    private TriggeredRuleJson triggeredTestRule;
    private DeviceAssuranceLevelsJson deviceAssuranceLevel;
	public Integer getRiskScore() {
		return riskScore;
	}
	public void setRiskScore(Integer riskScore) {
		this.riskScore = riskScore;
	}
	public String getRiskScoreBand() {
		return riskScoreBand;
	}
	public void setRiskScoreBand(String riskScoreBand) {
		this.riskScoreBand = riskScoreBand;
	}
	public TriggeredRuleJson getTriggeredRule() {
		return triggeredRule;
	}
	public void setTriggeredRule(TriggeredRuleJson triggeredRule) {
		this.triggeredRule = triggeredRule;
	}
	public TriggeredRuleJson getTriggeredTestRule() {
		return triggeredTestRule;
	}
	public void setTriggeredTestRule(TriggeredRuleJson triggeredTestRule) {
		this.triggeredTestRule = triggeredTestRule;
	}
	public DeviceAssuranceLevelsJson getDeviceAssuranceLevel() {
		return deviceAssuranceLevel;
	}
	public void setDeviceAssuranceLevel(DeviceAssuranceLevelsJson deviceAssuranceLevel) {
		this.deviceAssuranceLevel = deviceAssuranceLevel;
	}
    
    
    
}
