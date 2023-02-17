
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAuthStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAuthStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}GenericResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="credentialAuthStatusResponse" type="{http://ws.csd.rsa.com}CredentialAuthStatusResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAuthStatusResponse", propOrder = {
    "credentialAuthStatusResponse"
})
public class QueryAuthStatusResponse2
    extends GenericResponse
{

    protected CredentialAuthStatusResponse credentialAuthStatusResponse;

    /**
     * Gets the value of the credentialAuthStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialAuthStatusResponse }
     *     
     */
    public CredentialAuthStatusResponse getCredentialAuthStatusResponse() {
        return credentialAuthStatusResponse;
    }

    /**
     * Sets the value of the credentialAuthStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialAuthStatusResponse }
     *     
     */
    public void setCredentialAuthStatusResponse(CredentialAuthStatusResponse value) {
        this.credentialAuthStatusResponse = value;
    }

}
