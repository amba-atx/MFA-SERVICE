
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CREDIT_CARD"/&gt;
 *     &lt;enumeration value="DEBIT_CARD"/&gt;
 *     &lt;enumeration value="CHECKING"/&gt;
 *     &lt;enumeration value="CHECKING_WITH_OVERDRAFT"/&gt;
 *     &lt;enumeration value="BROKERAGE"/&gt;
 *     &lt;enumeration value="SAVINGS"/&gt;
 *     &lt;enumeration value="CD"/&gt;
 *     &lt;enumeration value="LINE_OF_CREDIT"/&gt;
 *     &lt;enumeration value="RETIREMENT"/&gt;
 *     &lt;enumeration value="MORTGAGE"/&gt;
 *     &lt;enumeration value="USER_DEFINED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountType")
@XmlEnum
public enum AccountType {

    CREDIT_CARD,
    DEBIT_CARD,
    CHECKING,
    CHECKING_WITH_OVERDRAFT,
    BROKERAGE,
    SAVINGS,
    CD,
    LINE_OF_CREDIT,
    RETIREMENT,
    MORTGAGE,
    USER_DEFINED;

    public String value() {
        return name();
    }

    public static AccountType fromValue(String v) {
        return valueOf(v);
    }

}
