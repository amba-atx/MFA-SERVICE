
package com.amba.service.mfa.stub.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceActionTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceActionTypeList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}ActionTypeList"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceActionTypes" type="{http://ws.csd.rsa.com}DeviceActionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceActionTypeList", propOrder = {
    "deviceActionTypes"
})
public class DeviceActionTypeList
    extends ActionTypeList
{

    @XmlSchemaType(name = "string")
    protected List<DeviceActionType> deviceActionTypes;

    /**
     * Gets the value of the deviceActionTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceActionTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceActionTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceActionType }
     * 
     * 
     */
    public List<DeviceActionType> getDeviceActionTypes() {
        if (deviceActionTypes == null) {
            deviceActionTypes = new ArrayList<DeviceActionType>();
        }
        return this.deviceActionTypes;
    }

}
