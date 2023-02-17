
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollectionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OPTIONAL_COLLECTION"/&gt;
 *     &lt;enumeration value="REQUIRED_COLLECTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollectionType")
@XmlEnum
public enum CollectionType {

    OPTIONAL_COLLECTION,
    REQUIRED_COLLECTION;

    public String value() {
        return name();
    }

    public static CollectionType fromValue(String v) {
        return valueOf(v);
    }

}
