
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CredentialStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CredentialStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="DISABLED"/&gt;
 *     &lt;enumeration value="LOCKED"/&gt;
 *     &lt;enumeration value="UNLOCKED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CredentialStatus")
@XmlEnum
public enum CredentialStatus {

    ACTIVE,
    DISABLED,
    LOCKED,
    UNLOCKED;

    public String value() {
        return name();
    }

    public static CredentialStatus fromValue(String v) {
        return valueOf(v);
    }

}
