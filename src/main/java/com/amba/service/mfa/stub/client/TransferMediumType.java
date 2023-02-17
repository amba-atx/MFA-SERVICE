
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferMediumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferMediumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTERNAL"/&gt;
 *     &lt;enumeration value="BILLPAY_MAIL"/&gt;
 *     &lt;enumeration value="BILLPAY_ELEC"/&gt;
 *     &lt;enumeration value="BALANCE_TRANSFER"/&gt;
 *     &lt;enumeration value="ACH"/&gt;
 *     &lt;enumeration value="WIRE"/&gt;
 *     &lt;enumeration value="INTL_WIRE"/&gt;
 *     &lt;enumeration value="CHECK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransferMediumType")
@XmlEnum
public enum TransferMediumType {

    INTERNAL,
    BILLPAY_MAIL,
    BILLPAY_ELEC,
    BALANCE_TRANSFER,
    ACH,
    WIRE,
    INTL_WIRE,
    CHECK;

    public String value() {
        return name();
    }

    public static TransferMediumType fromValue(String v) {
        return valueOf(v);
    }

}
