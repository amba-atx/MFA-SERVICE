
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Action.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Action"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="UPDATE"/&gt;
 *     &lt;enumeration value="DELETE"/&gt;
 *     &lt;enumeration value="GET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Action", namespace = "http://ws.kba.csd.rsa.com")
@XmlEnum
public enum Action {

    ADD,
    UPDATE,
    DELETE,
    GET;

    public String value() {
        return name();
    }

    public static Action fromValue(String v) {
        return valueOf(v);
    }

}
