
package com.amba.service.mfa.stub.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FactList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FactList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fact" type="{http://ws.csd.rsa.com}ClientDefinedFact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FactList", propOrder = {
    "fact"
})
public class FactList {

    protected List<ClientDefinedFact> fact;

    /**
     * Gets the value of the fact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientDefinedFact }
     * 
     * 
     */
    public List<ClientDefinedFact> getFact() {
        if (fact == null) {
            fact = new ArrayList<ClientDefinedFact>();
        }
        return this.fact;
    }

	public void setFact(List<ClientDefinedFact> listClient) {
		// TODO Auto-generated method stub
		this.fact = listClient;
	}

}
