package com.amba.service.mfa.JSONObjects;

public class PersonInfoJson {

	 private SSNInfoJson ssnInfo;
	    private NameInfoJson nameInfo;
	    private AddressInfoJson addressInfo;
	    private BirthdayInfoJson birthdayInfo;
	    private String languageInfo;
	    
	    
		public SSNInfoJson getSsnInfo() {
			return ssnInfo;
		}
		public void setSsnInfo(SSNInfoJson ssnInfo) {
			this.ssnInfo = ssnInfo;
		}
		public NameInfoJson getNameInfo() {
			return nameInfo;
		}
		public void setNameInfo(NameInfoJson nameInfo) {
			this.nameInfo = nameInfo;
		}
		public AddressInfoJson getAddressInfo() {
			return addressInfo;
		}
		public void setAddressInfo(AddressInfoJson addressInfo) {
			this.addressInfo = addressInfo;
		}
		public BirthdayInfoJson getBirthdayInfo() {
			return birthdayInfo;
		}
		public void setBirthdayInfo(BirthdayInfoJson birthdayInfo) {
			this.birthdayInfo = birthdayInfo;
		}
		public String getLanguageInfo() {
			return languageInfo;
		}
		public void setLanguageInfo(String languageInfo) {
			this.languageInfo = languageInfo;
		}
	    
	    

}
