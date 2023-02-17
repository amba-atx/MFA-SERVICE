
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
 *     &lt;enumeration value="DELIVERED_TO_HANDSET"/&gt;
 *     &lt;enumeration value="DELIVERED_TO_GATEWAY"/&gt;
 *     &lt;enumeration value="ERROR_DELIVERING_SMS_TO_HANDSET"/&gt;
 *     &lt;enumeration value="TEMPORARY_PHONE_ERROR"/&gt;
 *     &lt;enumeration value="PERMANENT_PHONE_ERROR"/&gt;
 *     &lt;enumeration value="GATEWAY_OR_NETWORK_CANNOT_ROUTE_MESSAGE"/&gt;
 *     &lt;enumeration value="MESSAGE_EXPIRED_BEFORE_DELIVERY"/&gt;
 *     &lt;enumeration value="SMS_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="MESSAGE_BLOCKED_BY_TELESIGN"/&gt;
 *     &lt;enumeration value="MESSAGE_BLOCKED_BY_CUSTOMER_REQUEST"/&gt;
 *     &lt;enumeration value="INVALID_OR_UNSUPPORTED_MESSAGE_CONTENT"/&gt;
 *     &lt;enumeration value="FINAL_STATUS_UNKNOWN"/&gt;
 *     &lt;enumeration value="MESSAGE_IN_PROGRESS"/&gt;
 *     &lt;enumeration value="QUEUED_BY_TELESIGN"/&gt;
 *     &lt;enumeration value="QUEUED_AT_GATEWAY"/&gt;
 *     &lt;enumeration value="STATUS_DELAYED"/&gt;
 *     &lt;enumeration value="TRANSACTION_NOT_ATTEMPTED"/&gt;
 *     &lt;enumeration value="NOT_AUTHORIZED"/&gt;
 *     &lt;enumeration value="STATUS_NOT_AVAILABLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusCodeEnum", namespace = "http://ws.sms.rsaaa.plugin.telesign.com")
@XmlEnum
public enum StatusCodeEnum2 {

    DELIVERED_TO_HANDSET,
    DELIVERED_TO_GATEWAY,
    ERROR_DELIVERING_SMS_TO_HANDSET,
    TEMPORARY_PHONE_ERROR,
    PERMANENT_PHONE_ERROR,
    GATEWAY_OR_NETWORK_CANNOT_ROUTE_MESSAGE,
    MESSAGE_EXPIRED_BEFORE_DELIVERY,
    SMS_NOT_SUPPORTED,
    MESSAGE_BLOCKED_BY_TELESIGN,
    MESSAGE_BLOCKED_BY_CUSTOMER_REQUEST,
    INVALID_OR_UNSUPPORTED_MESSAGE_CONTENT,
    FINAL_STATUS_UNKNOWN,
    MESSAGE_IN_PROGRESS,
    QUEUED_BY_TELESIGN,
    QUEUED_AT_GATEWAY,
    STATUS_DELAYED,
    TRANSACTION_NOT_ATTEMPTED,
    NOT_AUTHORIZED,
    STATUS_NOT_AVAILABLE;

    public String value() {
        return name();
    }

    public static StatusCodeEnum2 fromValue(String v) {
        return valueOf(v);
    }

}
