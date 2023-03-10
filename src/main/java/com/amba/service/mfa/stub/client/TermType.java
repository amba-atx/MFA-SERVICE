
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TermType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TermType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GOOD_FOR_DAY"/&gt;
 *     &lt;enumeration value="GOOD_UNTIL_CANCELLED"/&gt;
 *     &lt;enumeration value="IMMEDIATE_OR_CANCEL"/&gt;
 *     &lt;enumeration value="FILL_OR_KILL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TermType")
@XmlEnum
public enum TermType {

    GOOD_FOR_DAY,
    GOOD_UNTIL_CANCELLED,
    IMMEDIATE_OR_CANCEL,
    FILL_OR_KILL;

    public String value() {
        return name();
    }

    public static TermType fromValue(String v) {
        return valueOf(v);
    }

}
