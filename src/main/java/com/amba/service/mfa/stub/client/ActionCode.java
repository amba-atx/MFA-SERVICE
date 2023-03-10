
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="ALLOW"/&gt;
 *     &lt;enumeration value="REVIEW"/&gt;
 *     &lt;enumeration value="DELAY_AND_REVIEW"/&gt;
 *     &lt;enumeration value="STOP_AND_REVIEW"/&gt;
 *     &lt;enumeration value="ELEVATE_SECURITY"/&gt;
 *     &lt;enumeration value="REDIRECT_CHALLENGE"/&gt;
 *     &lt;enumeration value="REDIRECT_COLLECT"/&gt;
 *     &lt;enumeration value="CHALLENGE"/&gt;
 *     &lt;enumeration value="COLLECT"/&gt;
 *     &lt;enumeration value="DENY"/&gt;
 *     &lt;enumeration value="BLOCK"/&gt;
 *     &lt;enumeration value="LOCKED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionCode")
@XmlEnum
public enum ActionCode {

    NONE,
    ALLOW,
    REVIEW,
    DELAY_AND_REVIEW,
    STOP_AND_REVIEW,
    ELEVATE_SECURITY,
    REDIRECT_CHALLENGE,
    REDIRECT_COLLECT,
    CHALLENGE,
    COLLECT,
    DENY,
    BLOCK,
    LOCKED;

    public String value() {
        return name();
    }

    public static ActionCode fromValue(String v) {
        return valueOf(v);
    }

}
