
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Schedule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Schedule"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IMMEDIATE"/&gt;
 *     &lt;enumeration value="SCHEDULED"/&gt;
 *     &lt;enumeration value="RECURRING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Schedule")
@XmlEnum
public enum Schedule {

    IMMEDIATE,
    SCHEDULED,
    RECURRING;

    public String value() {
        return name();
    }

    public static Schedule fromValue(String v) {
        return valueOf(v);
    }

}
