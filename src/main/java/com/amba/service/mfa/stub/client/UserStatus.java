
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOTENROLLED"/&gt;
 *     &lt;enumeration value="UNVERIFIED"/&gt;
 *     &lt;enumeration value="VERIFIED"/&gt;
 *     &lt;enumeration value="DELETE"/&gt;
 *     &lt;enumeration value="LOCKOUT"/&gt;
 *     &lt;enumeration value="UNLOCKED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserStatus")
@XmlEnum
public enum UserStatus {

    NOTENROLLED,
    UNVERIFIED,
    VERIFIED,
    DELETE,
    LOCKOUT,
    UNLOCKED;

    public String value() {
        return name();
    }

    public static UserStatus fromValue(String v) {
        return valueOf(v);
    }

}
