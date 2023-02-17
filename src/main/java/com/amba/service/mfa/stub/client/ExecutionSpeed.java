
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExecutionSpeed.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecutionSpeed"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SEVERAL_DAYS"/&gt;
 *     &lt;enumeration value="OVER_NIGHT"/&gt;
 *     &lt;enumeration value="FEW_HOURS"/&gt;
 *     &lt;enumeration value="REAL_TIME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExecutionSpeed")
@XmlEnum
public enum ExecutionSpeed {

    SEVERAL_DAYS,
    OVER_NIGHT,
    FEW_HOURS,
    REAL_TIME;

    public String value() {
        return name();
    }

    public static ExecutionSpeed fromValue(String v) {
        return valueOf(v);
    }

}
