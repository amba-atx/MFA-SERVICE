
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the contents of NOTIFY request
 * 
 * <p>Java class for NotifyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}GenericRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autoCreateUserFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deviceManagementRequest" type="{http://ws.csd.rsa.com}DeviceManagementRequestPayload" minOccurs="0"/&gt;
 *         &lt;element name="eventDataList" type="{http://ws.csd.rsa.com}EventDataList"/&gt;
 *         &lt;element name="userData" type="{http://ws.csd.rsa.com}UserData" minOccurs="0"/&gt;
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
@XmlType(name = "NotifyRequest", propOrder = {
    "autoCreateUserFlag",
    "deviceManagementRequest",
    "eventDataList",
    "userData",
    "channelIndicator",
    "clientDefinedChannelIndicator"
})
public class NotifyRequest
    extends GenericRequest
{

    protected Boolean autoCreateUserFlag;
    protected DeviceManagementRequestPayload deviceManagementRequest;
    @XmlElement(required = true)
    protected EventDataList eventDataList;
    protected UserData userData;
    @XmlSchemaType(name = "string")
    protected ChannelIndicatorType channelIndicator;
    protected String clientDefinedChannelIndicator;

    /**
     * Gets the value of the autoCreateUserFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCreateUserFlag() {
        return autoCreateUserFlag;
    }

    /**
     * Sets the value of the autoCreateUserFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCreateUserFlag(Boolean value) {
        this.autoCreateUserFlag = value;
    }

    /**
     * Gets the value of the deviceManagementRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceManagementRequestPayload }
     *     
     */
    public DeviceManagementRequestPayload getDeviceManagementRequest() {
        return deviceManagementRequest;
    }

    /**
     * Sets the value of the deviceManagementRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceManagementRequestPayload }
     *     
     */
    public void setDeviceManagementRequest(DeviceManagementRequestPayload value) {
        this.deviceManagementRequest = value;
    }

    /**
     * Gets the value of the eventDataList property.
     * 
     * @return
     *     possible object is
     *     {@link EventDataList }
     *     
     */
    public EventDataList getEventDataList() {
        return eventDataList;
    }

    /**
     * Sets the value of the eventDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDataList }
     *     
     */
    public void setEventDataList(EventDataList value) {
        this.eventDataList = value;
    }

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link UserData }
     *     
     */
    public UserData getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserData }
     *     
     */
    public void setUserData(UserData value) {
        this.userData = value;
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
