
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionApplyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionApplyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STRICT"/&gt;
 *     &lt;enumeration value="LIGHT"/&gt;
 *     &lt;enumeration value="OVERRIDE"/&gt;
 *     &lt;enumeration value="LOG"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionApplyType")
@XmlEnum
public enum ActionApplyType {

    STRICT,
    LIGHT,
    OVERRIDE,
    LOG,
    NONE;

    public String value() {
        return name();
    }

    public static ActionApplyType fromValue(String v) {
        return valueOf(v);
    }

}
