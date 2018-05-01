
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for code_restriction_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="code_restriction_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}data_access_restriction_type">
 *       &lt;sequence>
 *         &lt;element name="codeRestrictionId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="serviceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "code_restriction_type", propOrder = {
    "codeRestrictionId",
    "serviceId",
    "serviceUniversalId"
})
public class CodeRestrictionType
    extends DataAccessRestrictionType
{

    protected BigInteger codeRestrictionId;
    protected BigInteger serviceId;
    protected String serviceUniversalId;

    /**
     * Gets the value of the codeRestrictionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodeRestrictionId() {
        return codeRestrictionId;
    }

    /**
     * Sets the value of the codeRestrictionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodeRestrictionId(BigInteger value) {
        this.codeRestrictionId = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServiceId(BigInteger value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the serviceUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUniversalId() {
        return serviceUniversalId;
    }

    /**
     * Sets the value of the serviceUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUniversalId(String value) {
        this.serviceUniversalId = value;
    }

}
