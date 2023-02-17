package com.amba.service.mfa.JSONObjects;

public class ATMLocationJson {
	
	private String country;
    private String state;
    private String city;
    private String address;
    private String zip;
    private CoordinatesJson geoCoordinates;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public CoordinatesJson getGeoCoordinates() {
		return geoCoordinates;
	}
	public void setGeoCoordinates(CoordinatesJson geoCoordinates) {
		this.geoCoordinates = geoCoordinates;
	}

}
