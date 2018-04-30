
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for care_management_provider_association_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="care_management_provider_association_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}provider_association_type">
 *       &lt;sequence>
 *         &lt;element name="careManagementId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="careManagementUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryCareProvider" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "care_management_provider_association_type", propOrder = {
    "careManagementId",
    "careManagementUniversalId",
    "primaryCareProvider"
})
public class CareManagementProviderAssociationType
    extends ProviderAssociationType
{

    protected BigInteger careManagementId;
    protected String careManagementUniversalId;
    protected Boolean primaryCareProvider;

    /**
     * Gets the value of the careManagementId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCareManagementId() {
        return careManagementId;
    }

    /**
     * Sets the value of the careManagementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCareManagementId(BigInteger value) {
        this.careManagementId = value;
    }

    /**
     * Gets the value of the careManagementUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareManagementUniversalId() {
        return careManagementUniversalId;
    }

    /**
     * Sets the value of the careManagementUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareManagementUniversalId(String value) {
        this.careManagementUniversalId = value;
    }

    /**
     * Gets the value of the primaryCareProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryCareProvider() {
        return primaryCareProvider;
    }

    /**
     * Sets the value of the primaryCareProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryCareProvider(Boolean value) {
        this.primaryCareProvider = value;
    }

}
