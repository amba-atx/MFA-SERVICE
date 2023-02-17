
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChannelIndicatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WEB"/&gt;
 *     &lt;enumeration value="IVR"/&gt;
 *     &lt;enumeration value="CALL_CENTER"/&gt;
 *     &lt;enumeration value="BRANCH"/&gt;
 *     &lt;enumeration value="MOBILE"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChannelIndicatorType")
@XmlEnum
public enum ChannelIndicatorType {

    WEB,
    IVR,
    CALL_CENTER,
    BRANCH,
    MOBILE,
    OTHER;

    public String value() {
        return name();
    }

    public static ChannelIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
