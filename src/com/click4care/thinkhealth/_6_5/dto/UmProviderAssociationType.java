
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for um_provider_association_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="um_provider_association_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}provider_association_type">
 *       &lt;sequence>
 *         &lt;element name="medicalServiceProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="performingProvider" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="primaryProvider" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requestingProvider" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="umId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="umUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "um_provider_association_type", propOrder = {
    "medicalServiceProviderId",
    "performingProvider",
    "primaryProvider",
    "requestingProvider",
    "umId",
    "umUniversalId"
})
public class UmProviderAssociationType
    extends ProviderAssociationType
{

    protected BigInteger medicalServiceProviderId;
    protected Boolean performingProvider;
    protected Boolean primaryProvider;
    protected Boolean requestingProvider;
    protected BigInteger umId;
    protected String umUniversalId;

    /**
     * Gets the value of the medicalServiceProviderId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMedicalServiceProviderId() {
        return medicalServiceProviderId;
    }

    /**
     * Sets the value of the medicalServiceProviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMedicalServiceProviderId(BigInteger value) {
        this.medicalServiceProviderId = value;
    }

    /**
     * Gets the value of the performingProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformingProvider() {
        return performingProvider;
    }

    /**
     * Sets the value of the performingProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformingProvider(Boolean value) {
        this.performingProvider = value;
    }

    /**
     * Gets the value of the primaryProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryProvider() {
        return primaryProvider;
    }

    /**
     * Sets the value of the primaryProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryProvider(Boolean value) {
        this.primaryProvider = value;
    }

    /**
     * Gets the value of the requestingProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestingProvider() {
        return requestingProvider;
    }

    /**
     * Sets the value of the requestingProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestingProvider(Boolean value) {
        this.requestingProvider = value;
    }

    /**
     * Gets the value of the umId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUmId() {
        return umId;
    }

    /**
     * Sets the value of the umId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmId(BigInteger value) {
        this.umId = value;
    }

    /**
     * Gets the value of the umUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmUniversalId() {
        return umUniversalId;
    }

    /**
     * Sets the value of the umUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmUniversalId(String value) {
        this.umUniversalId = value;
    }

}
