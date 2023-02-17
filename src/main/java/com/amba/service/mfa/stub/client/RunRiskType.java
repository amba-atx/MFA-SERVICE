
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RunRiskType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RunRiskType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RISK_ONLY"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="DEVICE_ONLY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RunRiskType")
@XmlEnum
public enum RunRiskType {

    RISK_ONLY,
    ALL,
    NONE,
    DEVICE_ONLY;

    public String value() {
        return name();
    }

    public static RunRiskType fromValue(String v) {
        return valueOf(v);
    }

}
