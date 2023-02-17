
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GenericActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GET_USER_STATUS"/&gt;
 *     &lt;enumeration value="GET_USER_PREFERENCE"/&gt;
 *     &lt;enumeration value="GET_USER_GROUP"/&gt;
 *     &lt;enumeration value="GET_SYSTEM_CREDENTIAL"/&gt;
 *     &lt;enumeration value="GET_USER_CREDENTIAL"/&gt;
 *     &lt;enumeration value="GET_SYSTEM_CREDENTIAL_EXTENDED"/&gt;
 *     &lt;enumeration value="GET_USER_CREDENTIAL_EXTENDED"/&gt;
 *     &lt;enumeration value="BROWSE_USER_GROUP"/&gt;
 *     &lt;enumeration value="SET_USER_GROUP"/&gt;
 *     &lt;enumeration value="UPDATE_USER_NAME"/&gt;
 *     &lt;enumeration value="SET_USER_STATUS"/&gt;
 *     &lt;enumeration value="SET_USER_PREFERENCE"/&gt;
 *     &lt;enumeration value="OPEN_SESSION"/&gt;
 *     &lt;enumeration value="CLOSE_SESSION"/&gt;
 *     &lt;enumeration value="COMMIT"/&gt;
 *     &lt;enumeration value="CANCEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GenericActionType")
@XmlEnum
public enum GenericActionType {

    GET_USER_STATUS,
    GET_USER_PREFERENCE,
    GET_USER_GROUP,
    GET_SYSTEM_CREDENTIAL,
    GET_USER_CREDENTIAL,
    GET_SYSTEM_CREDENTIAL_EXTENDED,
    GET_USER_CREDENTIAL_EXTENDED,
    BROWSE_USER_GROUP,
    SET_USER_GROUP,
    UPDATE_USER_NAME,
    SET_USER_STATUS,
    SET_USER_PREFERENCE,
    OPEN_SESSION,
    CLOSE_SESSION,
    COMMIT,
    CANCEL;

    public String value() {
        return name();
    }

    public static GenericActionType fromValue(String v) {
        return valueOf(v);
    }

}
