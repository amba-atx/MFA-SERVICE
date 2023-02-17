
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceAssuranceLevels.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceAssuranceLevels"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOW"/&gt;
 *     &lt;enumeration value="LOW_MEDIUM"/&gt;
 *     &lt;enumeration value="MEDIUM"/&gt;
 *     &lt;enumeration value="MEDIUM_HIGH"/&gt;
 *     &lt;enumeration value="HIGH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceAssuranceLevels")
@XmlEnum
public enum DeviceAssuranceLevels {

    LOW,
    LOW_MEDIUM,
    MEDIUM,
    MEDIUM_HIGH,
    HIGH;

    public String value() {
        return name();
    }

    public static DeviceAssuranceLevels fromValue(String v) {
        return valueOf(v);
    }

}
