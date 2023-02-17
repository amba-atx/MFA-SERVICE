
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherAccountBankType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OtherAccountBankType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SAME_BANK"/&gt;
 *     &lt;enumeration value="OTHER_BANK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OtherAccountBankType")
@XmlEnum
public enum OtherAccountBankType {

    SAME_BANK,
    OTHER_BANK;

    public String value() {
        return name();
    }

    public static OtherAccountBankType fromValue(String v) {
        return valueOf(v);
    }

}
