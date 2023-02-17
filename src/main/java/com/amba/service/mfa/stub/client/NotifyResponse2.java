
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotifyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}GenericResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceManagementResponse" type="{http://ws.csd.rsa.com}DeviceManagementResponsePayload" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyResponse", propOrder = {
    "deviceManagementResponse"
})
public class NotifyResponse2
    extends GenericResponse
{

    protected DeviceManagementResponsePayload deviceManagementResponse;

    /**
     * Gets the value of the deviceManagementResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceManagementResponsePayload }
     *     
     */
    public DeviceManagementResponsePayload getDeviceManagementResponse() {
        return deviceManagementResponse;
    }

    /**
     * Sets the value of the deviceManagementResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceManagementResponsePayload }
     *     
     */
    public void setDeviceManagementResponse(DeviceManagementResponsePayload value) {
        this.deviceManagementResponse = value;
    }

}
