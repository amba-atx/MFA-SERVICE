
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherAccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OtherAccountType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BILLER"/&gt;
 *     &lt;enumeration value="PERSONAL_ACCOUNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OtherAccountType")
@XmlEnum
public enum OtherAccountType {

    BILLER,
    PERSONAL_ACCOUNT;

    public String value() {
        return name();
    }

    public static OtherAccountType fromValue(String v) {
        return valueOf(v);
    }

}
