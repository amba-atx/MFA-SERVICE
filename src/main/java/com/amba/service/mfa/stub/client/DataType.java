
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STRING"/&gt;
 *     &lt;enumeration value="BOOLEAN"/&gt;
 *     &lt;enumeration value="FLOAT"/&gt;
 *     &lt;enumeration value="DOUBLE"/&gt;
 *     &lt;enumeration value="INTEGER"/&gt;
 *     &lt;enumeration value="DATE"/&gt;
 *     &lt;enumeration value="IP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataType")
@XmlEnum
public enum DataType {

    STRING,
    BOOLEAN,
    FLOAT,
    DOUBLE,
    INTEGER,
    DATE,
    IP;

    public String value() {
        return name();
    }

    public static DataType fromValue(String v) {
        return valueOf(v);
    }

}
