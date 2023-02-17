package com.amba.service.mfa.JSONObjects;

import java.math.BigDecimal;

public class GeoLocationJson {
	
	private BigDecimal longitude;
	private BigDecimal latitude;
	private BigDecimal horizontalAccuracy;
	private BigDecimal altitude;
	private BigDecimal altitudeAccuracy;
	private BigDecimal heading;
	private BigDecimal speed;
	private Long timestamp;
	private Integer statusCode;
	
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
	public BigDecimal getHorizontalAccuracy() {
		return horizontalAccuracy;
	}
	public void setHorizontalAccuracy(BigDecimal horizontalAccuracy) {
		this.horizontalAccuracy = horizontalAccuracy;
	}
	public BigDecimal getAltitude() {
		return altitude;
	}
	public void setAltitude(BigDecimal altitude) {
		this.altitude = altitude;
	}
	public BigDecimal getAltitudeAccuracy() {
		return altitudeAccuracy;
	}
	public void setAltitudeAccuracy(BigDecimal altitudeAccuracy) {
		this.altitudeAccuracy = altitudeAccuracy;
	}
	public BigDecimal getHeading() {
		return heading;
	}
	public void setHeading(BigDecimal heading) {
		this.heading = heading;
	}
	public BigDecimal getSpeed() {
		return speed;
	}
	public void setSpeed(BigDecimal speed) {
		this.speed = speed;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

}
