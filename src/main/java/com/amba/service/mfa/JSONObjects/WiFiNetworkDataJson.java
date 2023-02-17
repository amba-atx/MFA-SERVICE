package com.amba.service.mfa.JSONObjects;

public class WiFiNetworkDataJson {
	
	private String stationName;
	private String bbsId;
	private Integer signalStrength;
	private String channel;
	private String ssId;
	
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getBbsId() {
		return bbsId;
	}
	public void setBbsId(String bbsId) {
		this.bbsId = bbsId;
	}
	public Integer getSignalStrength() {
		return signalStrength;
	}
	public void setSignalStrength(Integer signalStrength) {
		this.signalStrength = signalStrength;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getSsId() {
		return ssId;
	}
	public void setSsId(String ssId) {
		this.ssId = ssId;
	}

}
