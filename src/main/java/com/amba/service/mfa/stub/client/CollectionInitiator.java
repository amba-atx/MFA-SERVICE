
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollectionInitiator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollectionInitiator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="USER_INITIATED"/&gt;
 *     &lt;enumeration value="CSR_INITIATED"/&gt;
 *     &lt;enumeration value="AUTO_INITIATED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollectionInitiator")
@XmlEnum
public enum CollectionInitiator {

    USER_INITIATED,
    CSR_INITIATED,
    AUTO_INITIATED;

    public String value() {
        return name();
    }

    public static CollectionInitiator fromValue(String v) {
        return valueOf(v);
    }

}
