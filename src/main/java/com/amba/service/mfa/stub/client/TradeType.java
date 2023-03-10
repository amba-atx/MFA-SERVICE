
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUY"/&gt;
 *     &lt;enumeration value="SELL"/&gt;
 *     &lt;enumeration value="SELL_SHORT"/&gt;
 *     &lt;enumeration value="BUY_TO_COVER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradeType")
@XmlEnum
public enum TradeType {

    BUY,
    SELL,
    SELL_SHORT,
    BUY_TO_COVER;

    public String value() {
        return name();
    }

    public static TradeType fromValue(String v) {
        return valueOf(v);
    }

}
