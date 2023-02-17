
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorizationMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorizationMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PASSWORD"/&gt;
 *     &lt;enumeration value="SECRET_HMAC_SHA1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthorizationMethod")
@XmlEnum
public enum AuthorizationMethod {

    PASSWORD("PASSWORD"),
    @XmlEnumValue("SECRET_HMAC_SHA1")
    SECRET_HMAC_SHA_1("SECRET_HMAC_SHA1");
    private final String value;

    AuthorizationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorizationMethod fromValue(String v) {
        for (AuthorizationMethod c: AuthorizationMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
