
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MARKET"/&gt;
 *     &lt;enumeration value="BRACKETED_FIXED"/&gt;
 *     &lt;enumeration value="BRACKETED_POINTS"/&gt;
 *     &lt;enumeration value="BRACKETED_PERCENTAGES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriceType")
@XmlEnum
public enum PriceType {

    MARKET,
    BRACKETED_FIXED,
    BRACKETED_POINTS,
    BRACKETED_PERCENTAGES;

    public String value() {
        return name();
    }

    public static PriceType fromValue(String v) {
        return valueOf(v);
    }

}
