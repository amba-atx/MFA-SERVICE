
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OOBActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OOBActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADD_OOB"/&gt;
 *     &lt;enumeration value="GET_OOB"/&gt;
 *     &lt;enumeration value="DELETE_OOB"/&gt;
 *     &lt;enumeration value="UPDATE_OOB"/&gt;
 *     &lt;enumeration value="RESET_OOB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OOBActionType")
@XmlEnum
public enum OOBActionType {

    ADD_OOB,
    GET_OOB,
    DELETE_OOB,
    UPDATE_OOB,
    RESET_OOB;

    public String value() {
        return name();
    }

    public static OOBActionType fromValue(String v) {
        return valueOf(v);
    }

}
