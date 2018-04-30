
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfMedicationSourceType;
import com.click4care.thinkhealth.core.dto.TypeOfMedicationState;


/**
 * <p>Java class for medication_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medication_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="affiliatedRecordCareManagement" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="affiliatedRecordCareManagementUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliatedRecordMember" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="affiliatedRecordMemberUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliatedRecordUmEvent" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="affiliatedRecordUmEventRequest" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="affiliatedRecordUmEventRequestUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliatedRecordUmEventUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dosage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dosageUnit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="dosageUnitDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dosageUnitUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="drugClaim" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="drugClaimUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="errorComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filledBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="filledByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="isGeneric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastFilledDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="medicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="member" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="memberUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ndcCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ndcCodeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prescriptedBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="prescriptedByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceAssessmentCareCalculatorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfMedicationSourceType" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfMedicationState" minOccurs="0"/>
 *         &lt;element name="typeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medication_type", propOrder = {
    "affiliatedRecordCareManagement",
    "affiliatedRecordCareManagementUniversalId",
    "affiliatedRecordMember",
    "affiliatedRecordMemberUniversalId",
    "affiliatedRecordUmEvent",
    "affiliatedRecordUmEventRequest",
    "affiliatedRecordUmEventRequestUniversalId",
    "affiliatedRecordUmEventUniversalId",
    "c4CId",
    "comment",
    "createdDate",
    "deletedDate",
    "dosage",
    "dosageUnit",
    "dosageUnitDropDownListItemLabel",
    "dosageUnitUniversalId",
    "drugClaim",
    "drugClaimUniversalId",
    "endDate",
    "errorComment",
    "filledBy",
    "filledByUniversalId",
    "frequency",
    "id",
    "isGeneric",
    "lastActionDate",
    "lastFilledDate",
    "medicationName",
    "member",
    "memberUniversalId",
    "ndcCode",
    "ndcCodeUniversalId",
    "prescriptedBy",
    "prescriptedByUniversalId",
    "sourceAssessmentCareCalculatorUniversalId",
    "sourceType",
    "startDate",
    "state",
    "typeDropDownListItemLabel",
    "typeSubtype",
    "typeSubtypeUniversalId",
    "universalId",
    "version"
})
public class MedicationType {

    protected BigInteger affiliatedRecordCareManagement;
    protected String affiliatedRecordCareManagementUniversalId;
    protected BigInteger affiliatedRecordMember;
    protected String affiliatedRecordMemberUniversalId;
    protected BigInteger affiliatedRecordUmEvent;
    protected BigInteger affiliatedRecordUmEventRequest;
    protected String affiliatedRecordUmEventRequestUniversalId;
    protected String affiliatedRecordUmEventUniversalId;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected String comment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected String dosage;
    protected BigInteger dosageUnit;
    protected String dosageUnitDropDownListItemLabel;
    protected String dosageUnitUniversalId;
    protected BigInteger drugClaim;
    protected String drugClaimUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String errorComment;
    protected BigInteger filledBy;
    protected String filledByUniversalId;
    protected String frequency;
    protected BigInteger id;
    protected Boolean isGeneric;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastFilledDate;
    protected String medicationName;
    protected BigInteger member;
    protected String memberUniversalId;
    protected BigInteger ndcCode;
    protected String ndcCodeUniversalId;
    protected BigInteger prescriptedBy;
    protected String prescriptedByUniversalId;
    protected String sourceAssessmentCareCalculatorUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfMedicationSourceType sourceType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "string")
    protected TypeOfMedicationState state;
    protected String typeDropDownListItemLabel;
    protected BigInteger typeSubtype;
    protected String typeSubtypeUniversalId;
    protected String universalId;
    protected BigInteger version;

    /**
     * Gets the value of the affiliatedRecordCareManagement property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliatedRecordCareManagement() {
        return affiliatedRecordCareManagement;
    }

    /**
     * Sets the value of the affiliatedRecordCareManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliatedRecordCareManagement(BigInteger value) {
        this.affiliatedRecordCareManagement = value;
    }

    /**
     * Gets the value of the affiliatedRecordCareManagementUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliatedRecordCareManagementUniversalId() {
        return affiliatedRecordCareManagementUniversalId;
    }

    /**
     * Sets the value of the affiliatedRecordCareManagementUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliatedRecordCareManagementUniversalId(String value) {
        this.affiliatedRecordCareManagementUniversalId = value;
    }

    /**
     * Gets the value of the affiliatedRecordMember property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliatedRecordMember() {
        return affiliatedRecordMember;
    }

    /**
     * Sets the value of the affiliatedRecordMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliatedRecordMember(BigInteger value) {
        this.affiliatedRecordMember = value;
    }

    /**
     * Gets the value of the affiliatedRecordMemberUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliatedRecordMemberUniversalId() {
        return affiliatedRecordMemberUniversalId;
    }

    /**
     * Sets the value of the affiliatedRecordMemberUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliatedRecordMemberUniversalId(String value) {
        this.affiliatedRecordMemberUniversalId = value;
    }

    /**
     * Gets the value of the affiliatedRecordUmEvent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliatedRecordUmEvent() {
        return affiliatedRecordUmEvent;
    }

    /**
     * Sets the value of the affiliatedRecordUmEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliatedRecordUmEvent(BigInteger value) {
        this.affiliatedRecordUmEvent = value;
    }

    /**
     * Gets the value of the affiliatedRecordUmEventRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliatedRecordUmEventRequest() {
        return affiliatedRecordUmEventRequest;
    }

    /**
     * Sets the value of the affiliatedRecordUmEventRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliatedRecordUmEventRequest(BigInteger value) {
        this.affiliatedRecordUmEventRequest = value;
    }

    /**
     * Gets the value of the affiliatedRecordUmEventRequestUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliatedRecordUmEventRequestUniversalId() {
        return affiliatedRecordUmEventRequestUniversalId;
    }

    /**
     * Sets the value of the affiliatedRecordUmEventRequestUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliatedRecordUmEventRequestUniversalId(String value) {
        this.affiliatedRecordUmEventRequestUniversalId = value;
    }

    /**
     * Gets the value of the affiliatedRecordUmEventUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliatedRecordUmEventUniversalId() {
        return affiliatedRecordUmEventUniversalId;
    }

    /**
     * Sets the value of the affiliatedRecordUmEventUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliatedRecordUmEventUniversalId(String value) {
        this.affiliatedRecordUmEventUniversalId = value;
    }

    /**
     * Gets the value of the c4CId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC4CId() {
        return c4CId;
    }

    /**
     * Sets the value of the c4CId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC4CId(String value) {
        this.c4CId = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the deletedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeletedDate() {
        return deletedDate;
    }

    /**
     * Sets the value of the deletedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeletedDate(XMLGregorianCalendar value) {
        this.deletedDate = value;
    }

    /**
     * Gets the value of the dosage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosage() {
        return dosage;
    }

    /**
     * Sets the value of the dosage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosage(String value) {
        this.dosage = value;
    }

    /**
     * Gets the value of the dosageUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDosageUnit() {
        return dosageUnit;
    }

    /**
     * Sets the value of the dosageUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDosageUnit(BigInteger value) {
        this.dosageUnit = value;
    }

    /**
     * Gets the value of the dosageUnitDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosageUnitDropDownListItemLabel() {
        return dosageUnitDropDownListItemLabel;
    }

    /**
     * Sets the value of the dosageUnitDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosageUnitDropDownListItemLabel(String value) {
        this.dosageUnitDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the dosageUnitUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosageUnitUniversalId() {
        return dosageUnitUniversalId;
    }

    /**
     * Sets the value of the dosageUnitUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosageUnitUniversalId(String value) {
        this.dosageUnitUniversalId = value;
    }

    /**
     * Gets the value of the drugClaim property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDrugClaim() {
        return drugClaim;
    }

    /**
     * Sets the value of the drugClaim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDrugClaim(BigInteger value) {
        this.drugClaim = value;
    }

    /**
     * Gets the value of the drugClaimUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugClaimUniversalId() {
        return drugClaimUniversalId;
    }

    /**
     * Sets the value of the drugClaimUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugClaimUniversalId(String value) {
        this.drugClaimUniversalId = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the errorComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorComment() {
        return errorComment;
    }

    /**
     * Sets the value of the errorComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorComment(String value) {
        this.errorComment = value;
    }

    /**
     * Gets the value of the filledBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFilledBy() {
        return filledBy;
    }

    /**
     * Sets the value of the filledBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFilledBy(BigInteger value) {
        this.filledBy = value;
    }

    /**
     * Gets the value of the filledByUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilledByUniversalId() {
        return filledByUniversalId;
    }

    /**
     * Sets the value of the filledByUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilledByUniversalId(String value) {
        this.filledByUniversalId = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the isGeneric property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGeneric() {
        return isGeneric;
    }

    /**
     * Sets the value of the isGeneric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGeneric(Boolean value) {
        this.isGeneric = value;
    }

    /**
     * Gets the value of the lastActionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastActionDate() {
        return lastActionDate;
    }

    /**
     * Sets the value of the lastActionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastActionDate(XMLGregorianCalendar value) {
        this.lastActionDate = value;
    }

    /**
     * Gets the value of the lastFilledDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastFilledDate() {
        return lastFilledDate;
    }

    /**
     * Sets the value of the lastFilledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastFilledDate(XMLGregorianCalendar value) {
        this.lastFilledDate = value;
    }

    /**
     * Gets the value of the medicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicationName() {
        return medicationName;
    }

    /**
     * Sets the value of the medicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicationName(String value) {
        this.medicationName = value;
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

    /**
     * Gets the value of the memberUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberUniversalId() {
        return memberUniversalId;
    }

    /**
     * Sets the value of the memberUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberUniversalId(String value) {
        this.memberUniversalId = value;
    }

    /**
     * Gets the value of the ndcCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNdcCode() {
        return ndcCode;
    }

    /**
     * Sets the value of the ndcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNdcCode(BigInteger value) {
        this.ndcCode = value;
    }

    /**
     * Gets the value of the ndcCodeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdcCodeUniversalId() {
        return ndcCodeUniversalId;
    }

    /**
     * Sets the value of the ndcCodeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdcCodeUniversalId(String value) {
        this.ndcCodeUniversalId = value;
    }

    /**
     * Gets the value of the prescriptedBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrescriptedBy() {
        return prescriptedBy;
    }

    /**
     * Sets the value of the prescriptedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrescriptedBy(BigInteger value) {
        this.prescriptedBy = value;
    }

    /**
     * Gets the value of the prescriptedByUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptedByUniversalId() {
        return prescriptedByUniversalId;
    }

    /**
     * Sets the value of the prescriptedByUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptedByUniversalId(String value) {
        this.prescriptedByUniversalId = value;
    }

    /**
     * Gets the value of the sourceAssessmentCareCalculatorUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAssessmentCareCalculatorUniversalId() {
        return sourceAssessmentCareCalculatorUniversalId;
    }

    /**
     * Sets the value of the sourceAssessmentCareCalculatorUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAssessmentCareCalculatorUniversalId(String value) {
        this.sourceAssessmentCareCalculatorUniversalId = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfMedicationSourceType }
     *     
     */
    public TypeOfMedicationSourceType getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfMedicationSourceType }
     *     
     */
    public void setSourceType(TypeOfMedicationSourceType value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfMedicationState }
     *     
     */
    public TypeOfMedicationState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfMedicationState }
     *     
     */
    public void setState(TypeOfMedicationState value) {
        this.state = value;
    }

    /**
     * Gets the value of the typeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDropDownListItemLabel() {
        return typeDropDownListItemLabel;
    }

    /**
     * Sets the value of the typeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDropDownListItemLabel(String value) {
        this.typeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the typeSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeSubtype() {
        return typeSubtype;
    }

    /**
     * Sets the value of the typeSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeSubtype(BigInteger value) {
        this.typeSubtype = value;
    }

    /**
     * Gets the value of the typeSubtypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSubtypeUniversalId() {
        return typeSubtypeUniversalId;
    }

    /**
     * Sets the value of the typeSubtypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSubtypeUniversalId(String value) {
        this.typeSubtypeUniversalId = value;
    }

    /**
     * Gets the value of the universalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalId() {
        return universalId;
    }

    /**
     * Sets the value of the universalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalId(String value) {
        this.universalId = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

}
