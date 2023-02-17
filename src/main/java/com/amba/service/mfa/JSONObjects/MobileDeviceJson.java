package com.amba.service.mfa.JSONObjects;


	public class MobileDeviceJson
    extends DeviceIdentifierJson
{

    private String simId;
    private String otherId;
    private String hardwareId;
    private GeoLocationJson geoLocation;
    private String deviceModel;
    private String deviceMultiTaskingSupported;
    private String deviceName;
    private String deviceSystemName;
    private String deviceSystemVersion;
    private String languages;
    private String wiFiMacAddress;
    private WiFiNetworkDataJson wiFiNetworksData;
    private String cellTowerID;
    private String locationAreaCode;
    private String screenSize;
    private Integer numberOfAddressBookEntries;
    private String rsaApplicationkey;
    private String wapClientID;
    private String vendorClientID;
    public String getSimId() {
		return simId;
	}
	public void setSimId(String simId) {
		this.simId = simId;
	}
	public String getOtherId() {
		return otherId;
	}
	public void setOtherId(String otherId) {
		this.otherId = otherId;
	}
	public String getHardwareId() {
		return hardwareId;
	}
	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}
	public GeoLocationJson getGeoLocation() {
		return geoLocation;
	}
	public void setGeoLocation(GeoLocationJson geoLocation) {
		this.geoLocation = geoLocation;
	}
	public String getDeviceModel() {
		return deviceModel;
	}
	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}
	public String getDeviceMultiTaskingSupported() {
		return deviceMultiTaskingSupported;
	}
	public void setDeviceMultiTaskingSupported(String deviceMultiTaskingSupported) {
		this.deviceMultiTaskingSupported = deviceMultiTaskingSupported;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceSystemName() {
		return deviceSystemName;
	}
	public void setDeviceSystemName(String deviceSystemName) {
		this.deviceSystemName = deviceSystemName;
	}
	public String getDeviceSystemVersion() {
		return deviceSystemVersion;
	}
	public void setDeviceSystemVersion(String deviceSystemVersion) {
		this.deviceSystemVersion = deviceSystemVersion;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getWiFiMacAddress() {
		return wiFiMacAddress;
	}
	public void setWiFiMacAddress(String wiFiMacAddress) {
		this.wiFiMacAddress = wiFiMacAddress;
	}
	public WiFiNetworkDataJson getWiFiNetworksData() {
		return wiFiNetworksData;
	}
	public void setWiFiNetworksData(WiFiNetworkDataJson wiFiNetworksData) {
		this.wiFiNetworksData = wiFiNetworksData;
	}
	public String getCellTowerID() {
		return cellTowerID;
	}
	public void setCellTowerID(String cellTowerID) {
		this.cellTowerID = cellTowerID;
	}
	public String getLocationAreaCode() {
		return locationAreaCode;
	}
	public void setLocationAreaCode(String locationAreaCode) {
		this.locationAreaCode = locationAreaCode;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public Integer getNumberOfAddressBookEntries() {
		return numberOfAddressBookEntries;
	}
	public void setNumberOfAddressBookEntries(Integer numberOfAddressBookEntries) {
		this.numberOfAddressBookEntries = numberOfAddressBookEntries;
	}
	public String getRsaApplicationkey() {
		return rsaApplicationkey;
	}
	public void setRsaApplicationkey(String rsaApplicationkey) {
		this.rsaApplicationkey = rsaApplicationkey;
	}
	public String getWapClientID() {
		return wapClientID;
	}
	public void setWapClientID(String wapClientID) {
		this.wapClientID = wapClientID;
	}
	public String getVendorClientID() {
		return vendorClientID;
	}
	public void setVendorClientID(String vendorClientID) {
		this.vendorClientID = vendorClientID;
	}
	public String getMcc() {
		return mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}
	public String getMnc() {
		return mnc;
	}
	public void setMnc(String mnc) {
		this.mnc = mnc;
	}
	public String getOsId() {
		return osId;
	}
	public void setOsId(String osId) {
		this.osId = osId;
	}
	public String getMobileSdkData() {
		return mobileSdkData;
	}
	public void setMobileSdkData(String mobileSdkData) {
		this.mobileSdkData = mobileSdkData;
	}
	public Integer getCompromised() {
		return compromised;
	}
	public void setCompromised(Integer compromised) {
		this.compromised = compromised;
	}
	public Integer getEmulator() {
		return emulator;
	}
	public void setEmulator(Integer emulator) {
		this.emulator = emulator;
	}
	private String mcc;
    private String mnc;
    private String osId;
    private String mobileSdkData;
    private Integer compromised;
    private Integer emulator;

}
