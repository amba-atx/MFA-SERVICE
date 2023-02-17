
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusCodeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CALL_ANSWERED"/&gt;
 *     &lt;enumeration value="NOT_ANSWERED"/&gt;
 *     &lt;enumeration value="DISCONNECT_OCCURRED_BEFORE_MESSAGE_COMPLETED"/&gt;
 *     &lt;enumeration value="CALL_IN_PROGRESS"/&gt;
 *     &lt;enumeration value="WRONG_OR_INVALID_PHONE_NUMBER"/&gt;
 *     &lt;enumeration value="CALL_NOT_HANDLED_YET"/&gt;
 *     &lt;enumeration value="CALL_FAILED"/&gt;
 *     &lt;enumeration value="LINE_BUSY"/&gt;
 *     &lt;enumeration value="TRANSACTION_NOT_ATTEMPTED"/&gt;
 *     &lt;enumeration value="NOT_AUTHORIZED"/&gt;
 *     &lt;enumeration value="STATUS_NOT_AVAILABLE"/&gt;
 *     &lt;enumeration value="CALL_BLOCKED_BY_CUSTOMER_REQUEST"/&gt;
 *     &lt;enumeration value="CALL_BLOCKED_BY_TELESIGN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusCodeEnum", namespace = "http://ws.call.rsaaa.plugin.telesign.com")
@XmlEnum
public enum StatusCodeEnum {

    CALL_ANSWERED,
    NOT_ANSWERED,
    DISCONNECT_OCCURRED_BEFORE_MESSAGE_COMPLETED,
    CALL_IN_PROGRESS,
    WRONG_OR_INVALID_PHONE_NUMBER,
    CALL_NOT_HANDLED_YET,
    CALL_FAILED,
    LINE_BUSY,
    TRANSACTION_NOT_ATTEMPTED,
    NOT_AUTHORIZED,
    STATUS_NOT_AVAILABLE,
    CALL_BLOCKED_BY_CUSTOMER_REQUEST,
    CALL_BLOCKED_BY_TELESIGN;

    public String value() {
        return name();
    }

    public static StatusCodeEnum fromValue(String v) {
        return valueOf(v);
    }

}
