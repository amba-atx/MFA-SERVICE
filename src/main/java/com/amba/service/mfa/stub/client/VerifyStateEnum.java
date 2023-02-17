
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerifyStateEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VerifyStateEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VALID"/&gt;
 *     &lt;enumeration value="INVALID"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VerifyStateEnum", namespace = "http://ws.gen.rsaaa.plugin.telesign.com")
@XmlEnum
public enum VerifyStateEnum {

    VALID,
    INVALID,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static VerifyStateEnum fromValue(String v) {
        return valueOf(v);
    }

}
