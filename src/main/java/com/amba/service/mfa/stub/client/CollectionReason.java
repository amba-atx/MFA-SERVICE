
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollectionReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollectionReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CSR_REQUESTED"/&gt;
 *     &lt;enumeration value="USER_SETTINGS"/&gt;
 *     &lt;enumeration value="FIRST_COLLECTION"/&gt;
 *     &lt;enumeration value="REFRESH_AFTER_FAILURE"/&gt;
 *     &lt;enumeration value="ADDITIONAL_COLLECTION"/&gt;
 *     &lt;enumeration value="REFRESH_COLLECTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollectionReason")
@XmlEnum
public enum CollectionReason {

    CSR_REQUESTED,
    USER_SETTINGS,
    FIRST_COLLECTION,
    REFRESH_AFTER_FAILURE,
    ADDITIONAL_COLLECTION,
    REFRESH_COLLECTION;

    public String value() {
        return name();
    }

    public static CollectionReason fromValue(String v) {
        return valueOf(v);
    }

}
