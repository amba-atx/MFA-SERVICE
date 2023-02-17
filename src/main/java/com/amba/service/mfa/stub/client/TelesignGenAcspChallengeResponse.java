
package com.amba.service.mfa.stub.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelesignGenAcspChallengeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelesignGenAcspChallengeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.csd.rsa.com}AcspChallengeResponse"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelesignGenAcspChallengeResponse", namespace = "http://ws.gen.rsaaa.plugin.telesign.com")
@XmlSeeAlso({
    TelesignCallAcspChallengeResponse.class,
    TelesignSmsAcspChallengeResponse.class
})
public abstract class TelesignGenAcspChallengeResponse
    extends AcspChallengeResponse
{


}
