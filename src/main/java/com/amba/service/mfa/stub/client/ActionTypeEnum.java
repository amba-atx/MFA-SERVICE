
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADD_USER"/&gt;
 *     &lt;enumeration value="DELETE_USER_DETAILS"/&gt;
 *     &lt;enumeration value="GET_USER_DETAILS"/&gt;
 *     &lt;enumeration value="UPDATE_PHONE_NUMBER"/&gt;
 *     &lt;enumeration value="UPDATE_LANGUAGE"/&gt;
 *     &lt;enumeration value="UPDATE_PHONE_NUMBER_AND_LANGUAGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionTypeEnum", namespace = "http://ws.gen.rsaaa.plugin.telesign.com")
@XmlEnum
public enum ActionTypeEnum {

    ADD_USER,
    DELETE_USER_DETAILS,
    GET_USER_DETAILS,
    UPDATE_PHONE_NUMBER,
    UPDATE_LANGUAGE,
    UPDATE_PHONE_NUMBER_AND_LANGUAGE;

    public String value() {
        return name();
    }

    public static ActionTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
