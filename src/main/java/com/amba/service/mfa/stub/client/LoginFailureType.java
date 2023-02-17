
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginFailureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoginFailureType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CARD_ON_BLACKLIST"/&gt;
 *     &lt;enumeration value="CARD_EXPIRED"/&gt;
 *     &lt;enumeration value="CARD_LOST"/&gt;
 *     &lt;enumeration value="CARD_NONEXISTENT"/&gt;
 *     &lt;enumeration value="INCORRECT_PIN"/&gt;
 *     &lt;enumeration value="INCORRECT_CVV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoginFailureType")
@XmlEnum
public enum LoginFailureType {

    CARD_ON_BLACKLIST,
    CARD_EXPIRED,
    CARD_LOST,
    CARD_NONEXISTENT,
    INCORRECT_PIN,
    INCORRECT_CVV;

    public String value() {
        return name();
    }

    public static LoginFailureType fromValue(String v) {
        return valueOf(v);
    }

}
