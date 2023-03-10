
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAuthStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAuthStatusRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}GenericRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="credentialAuthStatusRequest" type="{http://ws.csd.rsa.com}CredentialAuthStatusRequest" minOccurs="0"/&gt;
 *         &lt;element name="channelIndicator" type="{http://ws.csd.rsa.com}ChannelIndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="clientDefinedChannelIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAuthStatusRequest", propOrder = {
    "credentialAuthStatusRequest",
    "channelIndicator",
    "clientDefinedChannelIndicator"
})
public class QueryAuthStatusRequest
    extends GenericRequest
{

    protected CredentialAuthStatusRequest credentialAuthStatusRequest;
    @XmlSchemaType(name = "string")
    protected ChannelIndicatorType channelIndicator;
    protected String clientDefinedChannelIndicator;

    /**
     * Gets the value of the credentialAuthStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialAuthStatusRequest }
     *     
     */
    public CredentialAuthStatusRequest getCredentialAuthStatusRequest() {
        return credentialAuthStatusRequest;
    }

    /**
     * Sets the value of the credentialAuthStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialAuthStatusRequest }
     *     
     */
    public void setCredentialAuthStatusRequest(CredentialAuthStatusRequest value) {
        this.credentialAuthStatusRequest = value;
    }

    /**
     * Gets the value of the channelIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelIndicatorType }
     *     
     */
    public ChannelIndicatorType getChannelIndicator() {
        return channelIndicator;
    }

    /**
     * Sets the value of the channelIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelIndicatorType }
     *     
     */
    public void setChannelIndicator(ChannelIndicatorType value) {
        this.channelIndicator = value;
    }

    /**
     * Gets the value of the clientDefinedChannelIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientDefinedChannelIndicator() {
        return clientDefinedChannelIndicator;
    }

    /**
     * Sets the value of the clientDefinedChannelIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientDefinedChannelIndicator(String value) {
        this.clientDefinedChannelIndicator = value;
    }

}
