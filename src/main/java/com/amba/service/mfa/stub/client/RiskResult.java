
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the risk result information
 * 
 * <p>Java class for RiskResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="riskScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="riskScoreBand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="triggeredRule" type="{http://ws.csd.rsa.com}TriggeredRule" minOccurs="0"/&gt;
 *         &lt;element name="triggeredTestRule" type="{http://ws.csd.rsa.com}TriggeredRule" minOccurs="0"/&gt;
 *         &lt;element name="deviceAssuranceLevel" type="{http://ws.csd.rsa.com}DeviceAssuranceLevels" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskResult", propOrder = {
    "riskScore",
    "riskScoreBand",
    "triggeredRule",
    "triggeredTestRule",
    "deviceAssuranceLevel"
})
public class RiskResult {

    protected Integer riskScore;
    protected String riskScoreBand;
    protected TriggeredRule triggeredRule;
    protected TriggeredRule triggeredTestRule;
    @XmlSchemaType(name = "string")
    protected DeviceAssuranceLevels deviceAssuranceLevel;

    /**
     * Gets the value of the riskScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRiskScore() {
        return riskScore;
    }

    /**
     * Sets the value of the riskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRiskScore(Integer value) {
        this.riskScore = value;
    }

    /**
     * Gets the value of the riskScoreBand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskScoreBand() {
        return riskScoreBand;
    }

    /**
     * Sets the value of the riskScoreBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskScoreBand(String value) {
        this.riskScoreBand = value;
    }

    /**
     * Gets the value of the triggeredRule property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeredRule }
     *     
     */
    public TriggeredRule getTriggeredRule() {
        return triggeredRule;
    }

    /**
     * Sets the value of the triggeredRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeredRule }
     *     
     */
    public void setTriggeredRule(TriggeredRule value) {
        this.triggeredRule = value;
    }

    /**
     * Gets the value of the triggeredTestRule property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeredRule }
     *     
     */
    public TriggeredRule getTriggeredTestRule() {
        return triggeredTestRule;
    }

    /**
     * Sets the value of the triggeredTestRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeredRule }
     *     
     */
    public void setTriggeredTestRule(TriggeredRule value) {
        this.triggeredTestRule = value;
    }

    /**
     * Gets the value of the deviceAssuranceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceAssuranceLevels }
     *     
     */
    public DeviceAssuranceLevels getDeviceAssuranceLevel() {
        return deviceAssuranceLevel;
    }

    /**
     * Sets the value of the deviceAssuranceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceAssuranceLevels }
     *     
     */
    public void setDeviceAssuranceLevel(DeviceAssuranceLevels value) {
        this.deviceAssuranceLevel = value;
    }

}
