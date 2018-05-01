
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for member_diagnosis_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="member_diagnosis_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}diagnosis_instance_type">
 *       &lt;sequence>
 *         &lt;element name="causedById" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="customFields" type="{http://www.click4care.com/thinkhealth/6.5/dto}customFields_type" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="medicalClaimUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerUserId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="previousOwnerUserId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="previousSenderUserId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sourceAssessmentCareCalculatorId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sourcePatientIdQueryId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="takenAssessmentId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "member_diagnosis_type", propOrder = {
    "causedById",
    "customFields",
    "groupId",
    "medicalClaimUniversalId",
    "ownerUserId",
    "previousOwnerUserId",
    "previousSenderUserId",
    "sourceAssessmentCareCalculatorId",
    "sourcePatientIdQueryId",
    "takenAssessmentId"
})
public class MemberDiagnosisType
    extends DiagnosisInstanceType
{

    protected BigInteger causedById;
    protected CustomFieldsType customFields;
    protected BigInteger groupId;
    protected String medicalClaimUniversalId;
    protected BigInteger ownerUserId;
    protected BigInteger previousOwnerUserId;
    protected BigInteger previousSenderUserId;
    protected BigInteger sourceAssessmentCareCalculatorId;
    protected BigInteger sourcePatientIdQueryId;
    protected BigInteger takenAssessmentId;

    /**
     * Gets the value of the causedById property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCausedById() {
        return causedById;
    }

    /**
     * Sets the value of the causedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCausedById(BigInteger value) {
        this.causedById = value;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldsType }
     *     
     */
    public CustomFieldsType getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldsType }
     *     
     */
    public void setCustomFields(CustomFieldsType value) {
        this.customFields = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroupId(BigInteger value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the medicalClaimUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalClaimUniversalId() {
        return medicalClaimUniversalId;
    }

    /**
     * Sets the value of the medicalClaimUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalClaimUniversalId(String value) {
        this.medicalClaimUniversalId = value;
    }

    /**
     * Gets the value of the ownerUserId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOwnerUserId() {
        return ownerUserId;
    }

    /**
     * Sets the value of the ownerUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOwnerUserId(BigInteger value) {
        this.ownerUserId = value;
    }

    /**
     * Gets the value of the previousOwnerUserId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPreviousOwnerUserId() {
        return previousOwnerUserId;
    }

    /**
     * Sets the value of the previousOwnerUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPreviousOwnerUserId(BigInteger value) {
        this.previousOwnerUserId = value;
    }

    /**
     * Gets the value of the previousSenderUserId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPreviousSenderUserId() {
        return previousSenderUserId;
    }

    /**
     * Sets the value of the previousSenderUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPreviousSenderUserId(BigInteger value) {
        this.previousSenderUserId = value;
    }

    /**
     * Gets the value of the sourceAssessmentCareCalculatorId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceAssessmentCareCalculatorId() {
        return sourceAssessmentCareCalculatorId;
    }

    /**
     * Sets the value of the sourceAssessmentCareCalculatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceAssessmentCareCalculatorId(BigInteger value) {
        this.sourceAssessmentCareCalculatorId = value;
    }

    /**
     * Gets the value of the sourcePatientIdQueryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourcePatientIdQueryId() {
        return sourcePatientIdQueryId;
    }

    /**
     * Sets the value of the sourcePatientIdQueryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourcePatientIdQueryId(BigInteger value) {
        this.sourcePatientIdQueryId = value;
    }

    /**
     * Gets the value of the takenAssessmentId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTakenAssessmentId() {
        return takenAssessmentId;
    }

    /**
     * Sets the value of the takenAssessmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTakenAssessmentId(BigInteger value) {
        this.takenAssessmentId = value;
    }

}
