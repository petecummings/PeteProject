
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insurance_purchaser_group_restriction_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insurance_purchaser_group_restriction_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}data_access_restriction_type">
 *       &lt;sequence>
 *         &lt;element name="insurancePurchaserGroupId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="insurancePurchaserGroupRestrictionId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="insurancePurchaserGroupUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insurance_purchaser_group_restriction_type", propOrder = {
    "insurancePurchaserGroupId",
    "insurancePurchaserGroupRestrictionId",
    "insurancePurchaserGroupUniversalId"
})
public class InsurancePurchaserGroupRestrictionType
    extends DataAccessRestrictionType
{

    protected BigInteger insurancePurchaserGroupId;
    protected BigInteger insurancePurchaserGroupRestrictionId;
    protected String insurancePurchaserGroupUniversalId;

    /**
     * Gets the value of the insurancePurchaserGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInsurancePurchaserGroupId() {
        return insurancePurchaserGroupId;
    }

    /**
     * Sets the value of the insurancePurchaserGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInsurancePurchaserGroupId(BigInteger value) {
        this.insurancePurchaserGroupId = value;
    }

    /**
     * Gets the value of the insurancePurchaserGroupRestrictionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInsurancePurchaserGroupRestrictionId() {
        return insurancePurchaserGroupRestrictionId;
    }

    /**
     * Sets the value of the insurancePurchaserGroupRestrictionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInsurancePurchaserGroupRestrictionId(BigInteger value) {
        this.insurancePurchaserGroupRestrictionId = value;
    }

    /**
     * Gets the value of the insurancePurchaserGroupUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurancePurchaserGroupUniversalId() {
        return insurancePurchaserGroupUniversalId;
    }

    /**
     * Sets the value of the insurancePurchaserGroupUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurancePurchaserGroupUniversalId(String value) {
        this.insurancePurchaserGroupUniversalId = value;
    }

}
