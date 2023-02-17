
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type defines the transaction payload
 * 
 * <p>Java class for Payload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payload"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recurringFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromAccountNickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payeeAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="internationalAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payeeRoutingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payeeAccountCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payeeReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payload", namespace = "http://axis.ws.trxsign.acsp.rsa.com", propOrder = {
    "amount",
    "currency",
    "dueDate",
    "recurringFrequency",
    "fromAccountNickname",
    "fromAccountNumber",
    "payeeName",
    "payeeAccountNumber",
    "internationalAccountNumber",
    "payeeRoutingCode",
    "payeeAccountCountry",
    "payeeReferenceCode",
    "customField"
})
public class Payload {

    protected String amount;
    protected String currency;
    protected String dueDate;
    protected String recurringFrequency;
    protected String fromAccountNickname;
    protected String fromAccountNumber;
    protected String payeeName;
    protected String payeeAccountNumber;
    protected String internationalAccountNumber;
    protected String payeeRoutingCode;
    protected String payeeAccountCountry;
    protected String payeeReferenceCode;
    protected String customField;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the recurringFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringFrequency() {
        return recurringFrequency;
    }

    /**
     * Sets the value of the recurringFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringFrequency(String value) {
        this.recurringFrequency = value;
    }

    /**
     * Gets the value of the fromAccountNickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAccountNickname() {
        return fromAccountNickname;
    }

    /**
     * Sets the value of the fromAccountNickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAccountNickname(String value) {
        this.fromAccountNickname = value;
    }

    /**
     * Gets the value of the fromAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    /**
     * Sets the value of the fromAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAccountNumber(String value) {
        this.fromAccountNumber = value;
    }

    /**
     * Gets the value of the payeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * Sets the value of the payeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeName(String value) {
        this.payeeName = value;
    }

    /**
     * Gets the value of the payeeAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeAccountNumber() {
        return payeeAccountNumber;
    }

    /**
     * Sets the value of the payeeAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeAccountNumber(String value) {
        this.payeeAccountNumber = value;
    }

    /**
     * Gets the value of the internationalAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalAccountNumber() {
        return internationalAccountNumber;
    }

    /**
     * Sets the value of the internationalAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalAccountNumber(String value) {
        this.internationalAccountNumber = value;
    }

    /**
     * Gets the value of the payeeRoutingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeRoutingCode() {
        return payeeRoutingCode;
    }

    /**
     * Sets the value of the payeeRoutingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeRoutingCode(String value) {
        this.payeeRoutingCode = value;
    }

    /**
     * Gets the value of the payeeAccountCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeAccountCountry() {
        return payeeAccountCountry;
    }

    /**
     * Sets the value of the payeeAccountCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeAccountCountry(String value) {
        this.payeeAccountCountry = value;
    }

    /**
     * Gets the value of the payeeReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeReferenceCode() {
        return payeeReferenceCode;
    }

    /**
     * Sets the value of the payeeReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeReferenceCode(String value) {
        this.payeeReferenceCode = value;
    }

    /**
     * Gets the value of the customField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomField() {
        return customField;
    }

    /**
     * Sets the value of the customField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomField(String value) {
        this.customField = value;
    }

}
