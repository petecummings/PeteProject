
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diagnosis_restriction_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diagnosis_restriction_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}data_access_restriction_type">
 *       &lt;sequence>
 *         &lt;element name="diagnosisId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="diagnosisRestrictionId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="diagnosisUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diagnosis_restriction_type", propOrder = {
    "diagnosisId",
    "diagnosisRestrictionId",
    "diagnosisUniversalId"
})
public class DiagnosisRestrictionType
    extends DataAccessRestrictionType
{

    protected BigInteger diagnosisId;
    protected BigInteger diagnosisRestrictionId;
    protected String diagnosisUniversalId;

    /**
     * Gets the value of the diagnosisId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiagnosisId() {
        return diagnosisId;
    }

    /**
     * Sets the value of the diagnosisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiagnosisId(BigInteger value) {
        this.diagnosisId = value;
    }

    /**
     * Gets the value of the diagnosisRestrictionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiagnosisRestrictionId() {
        return diagnosisRestrictionId;
    }

    /**
     * Sets the value of the diagnosisRestrictionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiagnosisRestrictionId(BigInteger value) {
        this.diagnosisRestrictionId = value;
    }

    /**
     * Gets the value of the diagnosisUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosisUniversalId() {
        return diagnosisUniversalId;
    }

    /**
     * Sets the value of the diagnosisUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosisUniversalId(String value) {
        this.diagnosisUniversalId = value;
    }

}
