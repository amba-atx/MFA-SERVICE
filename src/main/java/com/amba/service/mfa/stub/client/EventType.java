
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NULL"/&gt;
 *     &lt;enumeration value="SESSION_SIGNIN"/&gt;
 *     &lt;enumeration value="FAILED_LOGIN_ATTEMPT"/&gt;
 *     &lt;enumeration value="ENROLL"/&gt;
 *     &lt;enumeration value="UPDATE_USER"/&gt;
 *     &lt;enumeration value="CREATE_USER"/&gt;
 *     &lt;enumeration value="OLB_ENROLL"/&gt;
 *     &lt;enumeration value="FAILED_OLB_ENROLL_ATTEMPT"/&gt;
 *     &lt;enumeration value="ACTIVATE_CARD"/&gt;
 *     &lt;enumeration value="OPEN_NEW_ACCOUNT"/&gt;
 *     &lt;enumeration value="REQUEST_CREDIT"/&gt;
 *     &lt;enumeration value="ADD_PAYEE"/&gt;
 *     &lt;enumeration value="EDIT_PAYEE"/&gt;
 *     &lt;enumeration value="PAYMENT"/&gt;
 *     &lt;enumeration value="DEPOSIT"/&gt;
 *     &lt;enumeration value="STOCK_TRADE"/&gt;
 *     &lt;enumeration value="OPTIONS_TRADE"/&gt;
 *     &lt;enumeration value="CHANGE_LOGIN_ID"/&gt;
 *     &lt;enumeration value="CHANGE_EMAIL"/&gt;
 *     &lt;enumeration value="CHANGE_PHONE"/&gt;
 *     &lt;enumeration value="CHANGE_ADDRESS"/&gt;
 *     &lt;enumeration value="CHANGE_PASSWORD"/&gt;
 *     &lt;enumeration value="CHANGE_LIFE_QUESTIONS"/&gt;
 *     &lt;enumeration value="FAILED_CHANGE_PASSWORD_ATTEMPT"/&gt;
 *     &lt;enumeration value="CHANGE_ALERT_SETTINGS"/&gt;
 *     &lt;enumeration value="CHANGE_STATEMENT_SETTINGS"/&gt;
 *     &lt;enumeration value="CHANGE_AUTH_DATA"/&gt;
 *     &lt;enumeration value="SEND_SECURE_MESSAGE"/&gt;
 *     &lt;enumeration value="READ_SECURE_MESSAGE"/&gt;
 *     &lt;enumeration value="VIEW_CHECK"/&gt;
 *     &lt;enumeration value="VIEW_STATEMENT"/&gt;
 *     &lt;enumeration value="REQUEST_CHECK_COPY"/&gt;
 *     &lt;enumeration value="REQUEST_STATEMENT_COPY"/&gt;
 *     &lt;enumeration value="REQUEST_CHECKS"/&gt;
 *     &lt;enumeration value="REQUEST_NEW_CARD"/&gt;
 *     &lt;enumeration value="REQUEST_NEW_PIN"/&gt;
 *     &lt;enumeration value="EXTRA_AUTH"/&gt;
 *     &lt;enumeration value="USER_DETAILS"/&gt;
 *     &lt;enumeration value="CLIENT_DEFINED"/&gt;
 *     &lt;enumeration value="WITHDRAW"/&gt;
 *     &lt;enumeration value="CARD_PIN_CHANGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventType")
@XmlEnum
public enum EventType {

    NULL,
    SESSION_SIGNIN,
    FAILED_LOGIN_ATTEMPT,
    ENROLL,
    UPDATE_USER,
    CREATE_USER,
    OLB_ENROLL,
    FAILED_OLB_ENROLL_ATTEMPT,
    ACTIVATE_CARD,
    OPEN_NEW_ACCOUNT,
    REQUEST_CREDIT,
    ADD_PAYEE,
    EDIT_PAYEE,
    PAYMENT,
    DEPOSIT,
    STOCK_TRADE,
    OPTIONS_TRADE,
    CHANGE_LOGIN_ID,
    CHANGE_EMAIL,
    CHANGE_PHONE,
    CHANGE_ADDRESS,
    CHANGE_PASSWORD,
    CHANGE_LIFE_QUESTIONS,
    FAILED_CHANGE_PASSWORD_ATTEMPT,
    CHANGE_ALERT_SETTINGS,
    CHANGE_STATEMENT_SETTINGS,
    CHANGE_AUTH_DATA,
    SEND_SECURE_MESSAGE,
    READ_SECURE_MESSAGE,
    VIEW_CHECK,
    VIEW_STATEMENT,
    REQUEST_CHECK_COPY,
    REQUEST_STATEMENT_COPY,
    REQUEST_CHECKS,
    REQUEST_NEW_CARD,
    REQUEST_NEW_PIN,
    EXTRA_AUTH,
    USER_DETAILS,
    CLIENT_DEFINED,
    WITHDRAW,
    CARD_PIN_CHANGE;

    public String value() {
        return name();
    }

    public static EventType fromValue(String v) {
        return valueOf(v);
    }

}
