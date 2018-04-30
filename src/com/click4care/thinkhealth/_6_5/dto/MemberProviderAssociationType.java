
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for member_provider_association_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="member_provider_association_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}provider_association_type">
 *       &lt;sequence>
 *         &lt;element name="drugClaimId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="medicalClaimId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="member" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "member_provider_association_type", propOrder = {
    "drugClaimId",
    "medicalClaimId",
    "member"
})
public class MemberProviderAssociationType
    extends ProviderAssociationType
{

    protected BigInteger drugClaimId;
    protected BigInteger medicalClaimId;
    protected BigInteger member;

    /**
     * Gets the value of the drugClaimId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDrugClaimId() {
        return drugClaimId;
    }

    /**
     * Sets the value of the drugClaimId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDrugClaimId(BigInteger value) {
        this.drugClaimId = value;
    }

    /**
     * Gets the value of the medicalClaimId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMedicalClaimId() {
        return medicalClaimId;
    }

    /**
     * Sets the value of the medicalClaimId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMedicalClaimId(BigInteger value) {
        this.medicalClaimId = value;
    }

    /**
     * Gets the value of the member property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMember() {
        return member;
    }

    /**
     * Sets the value of the member property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMember(BigInteger value) {
        this.member = value;
    }

}
