package com.amba.service.mfa.JSONObjects;

import java.math.BigDecimal;

public class CoordinatesJson {
	
	private BigDecimal longitude;
    private BigDecimal latitude;
    private BigDecimal altitude;
	public BigDecimal getLongitude() {
		return longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	public BigDecimal getAltitude() {
		return altitude;
	}
	public void setAltitude(BigDecimal altitude) {
		this.altitude = altitude;
	}

}
