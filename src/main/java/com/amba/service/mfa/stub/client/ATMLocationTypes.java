
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMLocationTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMLocationTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BANK_BRANCH"/&gt;
 *     &lt;enumeration value="PETROL_STATION"/&gt;
 *     &lt;enumeration value="PUBLIC_TRANSPORT"/&gt;
 *     &lt;enumeration value="STREET"/&gt;
 *     &lt;enumeration value="CONVENIENCE_STORE"/&gt;
 *     &lt;enumeration value="SUPERMARKET"/&gt;
 *     &lt;enumeration value="LEISURE_FACILITY"/&gt;
 *     &lt;enumeration value="DRIVE_THRU"/&gt;
 *     &lt;enumeration value="ENTERTAINMENT_VENUE"/&gt;
 *     &lt;enumeration value="TRANSPORT_TERMINAL"/&gt;
 *     &lt;enumeration value="POST_OFFICE"/&gt;
 *     &lt;enumeration value="RETAIL_OUTLET"/&gt;
 *     &lt;enumeration value="CASINO"/&gt;
 *     &lt;enumeration value="GOVERNMENT_OFFICE"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMLocationTypes")
@XmlEnum
public enum ATMLocationTypes {

    BANK_BRANCH,
    PETROL_STATION,
    PUBLIC_TRANSPORT,
    STREET,
    CONVENIENCE_STORE,
    SUPERMARKET,
    LEISURE_FACILITY,
    DRIVE_THRU,
    ENTERTAINMENT_VENUE,
    TRANSPORT_TERMINAL,
    POST_OFFICE,
    RETAIL_OUTLET,
    CASINO,
    GOVERNMENT_OFFICE,
    OTHER;

    public String value() {
        return name();
    }

    public static ATMLocationTypes fromValue(String v) {
        return valueOf(v);
    }

}
