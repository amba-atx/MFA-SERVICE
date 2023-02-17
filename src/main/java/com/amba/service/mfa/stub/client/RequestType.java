
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ANALYZE"/&gt;
 *     &lt;enumeration value="AUTHENTICATE"/&gt;
 *     &lt;enumeration value="CHALLENGE"/&gt;
 *     &lt;enumeration value="CREATEUSER"/&gt;
 *     &lt;enumeration value="NOTIFY"/&gt;
 *     &lt;enumeration value="QUERY"/&gt;
 *     &lt;enumeration value="QUERYAUTHSTATUS"/&gt;
 *     &lt;enumeration value="UPDATEUSER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestType")
@XmlEnum
public enum RequestType {

    ANALYZE,
    AUTHENTICATE,
    CHALLENGE,
    CREATEUSER,
    NOTIFY,
    QUERY,
    QUERYAUTHSTATUS,
    UPDATEUSER;

    public String value() {
        return name();
    }

    public static RequestType fromValue(String v) {
        return valueOf(v);
    }

}
