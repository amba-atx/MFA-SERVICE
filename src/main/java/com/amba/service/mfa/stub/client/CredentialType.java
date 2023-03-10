
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CredentialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CredentialType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QUESTION"/&gt;
 *     &lt;enumeration value="OOBPHONE"/&gt;
 *     &lt;enumeration value="OOBEMAIL"/&gt;
 *     &lt;enumeration value="USER_DEFINED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CredentialType")
@XmlEnum
public enum CredentialType {

    QUESTION,
    OOBPHONE,
    OOBEMAIL,
    USER_DEFINED;

    public String value() {
        return name();
    }

    public static CredentialType fromValue(String v) {
        return valueOf(v);
    }

}
