
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherAccountOwnershipType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OtherAccountOwnershipType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ME_TO_ME"/&gt;
 *     &lt;enumeration value="ME_TO_YOU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OtherAccountOwnershipType")
@XmlEnum
public enum OtherAccountOwnershipType {

    ME_TO_ME,
    ME_TO_YOU;

    public String value() {
        return name();
    }

    public static OtherAccountOwnershipType fromValue(String v) {
        return valueOf(v);
    }

}
