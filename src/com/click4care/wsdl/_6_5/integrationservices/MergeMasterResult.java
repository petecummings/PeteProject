
package com.click4care.wsdl._6_5.integrationservices;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mergeMasterId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="mergeMasterUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mergeMasterId",
    "mergeMasterUniversalId"
})
@XmlRootElement(name = "mergeMasterResult")
public class MergeMasterResult {

    protected BigInteger mergeMasterId;
    protected String mergeMasterUniversalId;

    /**
     * Gets the value of the mergeMasterId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMergeMasterId() {
        return mergeMasterId;
    }

    /**
     * Sets the value of the mergeMasterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMergeMasterId(BigInteger value) {
        this.mergeMasterId = value;
    }

    /**
     * Gets the value of the mergeMasterUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMergeMasterUniversalId() {
        return mergeMasterUniversalId;
    }

    /**
     * Sets the value of the mergeMasterUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMergeMasterUniversalId(String value) {
        this.mergeMasterUniversalId = value;
    }

}
