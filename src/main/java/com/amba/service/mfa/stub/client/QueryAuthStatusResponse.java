
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryAuthStatusReturn" type="{http://ws.csd.rsa.com}QueryAuthStatusResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queryAuthStatusReturn"
})
@XmlRootElement(name = "queryAuthStatusResponse")
public class QueryAuthStatusResponse {

    @XmlElement(required = true)
    protected QueryAuthStatusResponse2 queryAuthStatusReturn;

    /**
     * Gets the value of the queryAuthStatusReturn property.
     * 
     * @return
     *     possible object is
     *     {@link QueryAuthStatusResponse2 }
     *     
     */
    public QueryAuthStatusResponse2 getQueryAuthStatusReturn() {
        return queryAuthStatusReturn;
    }

    /**
     * Sets the value of the queryAuthStatusReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryAuthStatusResponse2 }
     *     
     */
    public void setQueryAuthStatusReturn(QueryAuthStatusResponse2 value) {
        this.queryAuthStatusReturn = value;
    }

}
