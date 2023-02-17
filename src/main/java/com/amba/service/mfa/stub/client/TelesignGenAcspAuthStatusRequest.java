
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelesignGenAcspAuthStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelesignGenAcspAuthStatusRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}AcspAuthStatusRequest"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelesignGenAcspAuthStatusRequest", namespace = "http://ws.gen.rsaaa.plugin.telesign.com")
@XmlSeeAlso({
    TelesignCallAcspAuthStatusRequest.class,
    TelesignSmsAcspAuthStatusRequest.class
})
public class TelesignGenAcspAuthStatusRequest
    extends AcspAuthStatusRequest
{


}
