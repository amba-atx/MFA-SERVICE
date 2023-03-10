
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the contents of a Generic Response
 * 
 * <p>Java class for GenericResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceResult" type="{http://ws.csd.rsa.com}DeviceResult" minOccurs="0"/&gt;
 *         &lt;element name="identificationData" type="{http://ws.csd.rsa.com}IdentificationData" minOccurs="0"/&gt;
 *         &lt;element name="messageHeader" type="{http://ws.csd.rsa.com}MessageHeader"/&gt;
 *         &lt;element name="statusHeader" type="{http://ws.csd.rsa.com}StatusHeader"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericResponse", propOrder = {
    "deviceResult",
    "identificationData",
    "messageHeader",
    "statusHeader"
})
@XmlSeeAlso({
    NotifyResponse2 .class,
    QueryResponse2 .class,
    AnalyzeResponse2 .class,
    AuthenticateResponse2 .class,
    ChallengeResponse2 .class,
    CreateUserResponse2 .class,
    QueryAuthStatusResponse2 .class,
    UpdateUserResponse2 .class
})
public abstract class GenericResponse {

    protected DeviceResult deviceResult;
    protected IdentificationData identificationData;
    @XmlElement(required = true)
    protected MessageHeader messageHeader;
    @XmlElement(required = true)
    protected StatusHeader statusHeader;

    /**
     * Gets the value of the deviceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceResult }
     *     
     */
    public DeviceResult getDeviceResult() {
        return deviceResult;
    }

    /**
     * Sets the value of the deviceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceResult }
     *     
     */
    public void setDeviceResult(DeviceResult value) {
        this.deviceResult = value;
    }

    /**
     * Gets the value of the identificationData property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationData }
     *     
     */
    public IdentificationData getIdentificationData() {
        return identificationData;
    }

    /**
     * Sets the value of the identificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationData }
     *     
     */
    public void setIdentificationData(IdentificationData value) {
        this.identificationData = value;
    }

    /**
     * Gets the value of the messageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader }
     *     
     */
    public MessageHeader getMessageHeader() {
        return messageHeader;
    }

    /**
     * Sets the value of the messageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader }
     *     
     */
    public void setMessageHeader(MessageHeader value) {
        this.messageHeader = value;
    }

    /**
     * Gets the value of the statusHeader property.
     * 
     * @return
     *     possible object is
     *     {@link StatusHeader }
     *     
     */
    public StatusHeader getStatusHeader() {
        return statusHeader;
    }

    /**
     * Sets the value of the statusHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusHeader }
     *     
     */
    public void setStatusHeader(StatusHeader value) {
        this.statusHeader = value;
    }

}
