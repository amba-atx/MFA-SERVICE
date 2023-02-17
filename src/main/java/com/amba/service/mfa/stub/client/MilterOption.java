
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MilterOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MilterOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISABLED"/&gt;
 *     &lt;enumeration value="PHRASE_ENABLED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MilterOption")
@XmlEnum
public enum MilterOption {

    DISABLED,
    PHRASE_ENABLED;

    public String value() {
        return name();
    }

    public static MilterOption fromValue(String v) {
        return valueOf(v);
    }

}
