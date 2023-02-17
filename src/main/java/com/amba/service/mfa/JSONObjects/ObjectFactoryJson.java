package com.amba.service.mfa.JSONObjects;

public class ObjectFactoryJson {
	private final static QName _UpdateUserReturn_QNAME = new QName("http://ws.csd.rsa.com", "updateUserReturn");
	private final static QName _SoapFault_QNAME = new QName("http://ws.csd.rsa.com", "SoapFault");

	public static QName getUpdateuserreturnQname() {
		return _UpdateUserReturn_QNAME;
	}

	public static QName getSoapfaultQname() {
		return _SoapFault_QNAME;
	}

}
