
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfAlertRecipient;
import com.click4care.thinkhealth.core.dto.TypeOfDeadline;
import com.click4care.thinkhealth.core.dto.TypeOfDeadlineAction;
import com.click4care.thinkhealth.core.dto.TypeOfDeadlineSelection;
import com.click4care.thinkhealth.core.dto.TypeOfSource;
import com.click4care.thinkhealth.core.dto.TypeOfStartNoLaterThanAction;
import com.click4care.thinkhealth.core.dto.TypeOfTaskStatus;
import com.click4care.thinkhealth.core.dto.TypeOfTimeOrigin;
import com.click4care.thinkhealth.core.dto.TypeOfTimeUnit;


/**
 * <p>Java class for sent_task_base_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sent_task_base_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="absoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="assessmentCareCalculatorId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="assessmentCareCalculatorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="careManagementAffiliationId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="careManagementAffiliationUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="completeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customFields" type="{http://www.click4care.com/thinkhealth/6.5/dto}customFields_type" minOccurs="0"/>
 *         &lt;element name="deadlineAction" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDeadlineAction" minOccurs="0"/>
 *         &lt;element name="deadlineAlertRecipient" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfAlertRecipient" minOccurs="0"/>
 *         &lt;element name="deadlineBeforeNextIteration" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDeadline" minOccurs="0"/>
 *         &lt;element name="deadlineSelection" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDeadlineSelection" minOccurs="0"/>
 *         &lt;element name="deadlineTimeBlockAmount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deadlineTimeBlockUnits" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTimeUnit" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="durationUnits" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTimeUnit" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="memberAffiliationId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="memberAffiliationUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalRecipient" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="originalRecipientUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outcome" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ownerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patientIdQueryId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="patientIdQueryUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="providerAffiliationId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="providerAffiliationUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reminderProceedWithAmount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reminderProceedWithUnits" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTimeUnit" minOccurs="0"/>
 *         &lt;element name="reminderTimeOrigin" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTimeOrigin" minOccurs="0"/>
 *         &lt;element name="repetitionPattern" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="scheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sourceType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfSource" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startNoLaterThanAction" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfStartNoLaterThanAction" minOccurs="0"/>
 *         &lt;element name="startNoLaterThanDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taknasmtccBase" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="taskStatus" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTaskStatus" minOccurs="0"/>
 *         &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="templateUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="typeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="umEventAffiliationId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="umEventAffiliationUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="umEventId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="umEventRequestAffiliationId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="umEventRequestAffiliationUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="umEventUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "sent_task_base_type", propOrder = {
    "absoluteDeadline",
    "assessmentCareCalculatorId",
    "assessmentCareCalculatorUniversalId",
    "c4CId",
    "careManagementAffiliationId",
    "careManagementAffiliationUniversalId",
    "comment",
    "completeDate",
    "createdDate",
    "customFields",
    "deadlineAction",
    "deadlineAlertRecipient",
    "deadlineBeforeNextIteration",
    "deadlineSelection",
    "deadlineTimeBlockAmount",
    "deadlineTimeBlockUnits",
    "deletedDate",
    "description",
    "duration",
    "durationUnits",
    "groupId",
    "id",
    "lastActionDate",
    "memberAffiliationId",
    "memberAffiliationUniversalId",
    "name",
    "originalRecipient",
    "originalRecipientUniversalId",
    "outcome",
    "owner",
    "ownerUniversalId",
    "patientIdQueryId",
    "patientIdQueryUniversalId",
    "personal",
    "providerAffiliationId",
    "providerAffiliationUniversalId",
    "reminderProceedWithAmount",
    "reminderProceedWithUnits",
    "reminderTimeOrigin",
    "repetitionPattern",
    "scheduled",
    "sentDate",
    "sourceType",
    "startDate",
    "startNoLaterThanAction",
    "startNoLaterThanDate",
    "startedDate",
    "subject",
    "taknasmtccBase",
    "taskStatus",
    "templateId",
    "templateUniversalId",
    "terminatedDate",
    "typeDropDownListItemLabel",
    "typeSubtype",
    "typeSubtypeUniversalId",
    "umEventAffiliationId",
    "umEventAffiliationUniversalId",
    "umEventId",
    "umEventRequestAffiliationId",
    "umEventRequestAffiliationUniversalId",
    "umEventUniversalId",
    "universalId",
    "version"
})
@XmlSeeAlso({
    SentTaskType.class,
    SentCarebeanTaskType.class
})
public abstract class SentTaskBaseType {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar absoluteDeadline;
    protected BigInteger assessmentCareCalculatorId;
    protected String assessmentCareCalculatorUniversalId;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected BigInteger careManagementAffiliationId;
    protected String careManagementAffiliationUniversalId;
    protected String comment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completeDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected CustomFieldsType customFields;
    @XmlSchemaType(name = "string")
    protected TypeOfDeadlineAction deadlineAction;
    @XmlSchemaType(name = "string")
    protected TypeOfAlertRecipient deadlineAlertRecipient;
    @XmlSchemaType(name = "string")
    protected TypeOfDeadline deadlineBeforeNextIteration;
    @XmlSchemaType(name = "string")
    protected TypeOfDeadlineSelection deadlineSelection;
    protected BigInteger deadlineTimeBlockAmount;
    @XmlSchemaType(name = "string")
    protected TypeOfTimeUnit deadlineTimeBlockUnits;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected String description;
    protected BigInteger duration;
    @XmlSchemaType(name = "string")
    protected TypeOfTimeUnit durationUnits;
    protected BigInteger groupId;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected BigInteger memberAffiliationId;
    protected String memberAffiliationUniversalId;
    protected String name;
    protected BigInteger originalRecipient;
    protected String originalRecipientUniversalId;
    protected BigInteger outcome;
    protected BigInteger owner;
    protected String ownerUniversalId;
    protected BigInteger patientIdQueryId;
    protected String patientIdQueryUniversalId;
    protected Boolean personal;
    protected BigInteger providerAffiliationId;
    protected String providerAffiliationUniversalId;
    protected BigInteger reminderProceedWithAmount;
    @XmlSchemaType(name = "string")
    protected TypeOfTimeUnit reminderProceedWithUnits;
    @XmlSchemaType(name = "string")
    protected TypeOfTimeOrigin reminderTimeOrigin;
    protected BigInteger repetitionPattern;
    protected Boolean scheduled;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentDate;
    @XmlSchemaType(name = "string")
    protected TypeOfSource sourceType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "string")
    protected TypeOfStartNoLaterThanAction startNoLaterThanAction;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startNoLaterThanDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startedDate;
    protected String subject;
    protected BigInteger taknasmtccBase;
    @XmlSchemaType(name = "string")
    protected TypeOfTaskStatus taskStatus;
    protected BigInteger templateId;
    protected String templateUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar terminatedDate;
    protected String typeDropDownListItemLabel;
    protected BigInteger typeSubtype;
    protected String typeSubtypeUniversalId;
    protected BigInteger umEventAffiliationId;
    protected String umEventAffiliationUniversalId;
    protected BigInteger umEventId;
    protected BigInteger umEventRequestAffiliationId;
    protected String umEventRequestAffiliationUniversalId;
    protected String umEventUniversalId;
    protected String universalId;
    protected BigInteger version;

    /**
     * Gets the value of the absoluteDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAbsoluteDeadline() {
        return absoluteDeadline;
    }

    /**
     * Sets the value of the absoluteDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAbsoluteDeadline(XMLGregorianCalendar value) {
        this.absoluteDeadline = value;
    }

    /**
     * Gets the value of the assessmentCareCalculatorId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssessmentCareCalculatorId() {
        return assessmentCareCalculatorId;
    }

    /**
     * Sets the value of the assessmentCareCalculatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssessmentCareCalculatorId(BigInteger value) {
        this.assessmentCareCalculatorId = value;
    }

    /**
     * Gets the value of the assessmentCareCalculatorUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentCareCalculatorUniversalId() {
        return assessmentCareCalculatorUniversalId;
    }

    /**
     * Sets the value of the assessmentCareCalculatorUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentCareCalculatorUniversalId(String value) {
        this.assessmentCareCalculatorUniversalId = value;
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
     * Gets the value of the careManagementAffiliationId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCareManagementAffiliationId() {
        return careManagementAffiliationId;
    }

    /**
     * Sets the value of the careManagementAffiliationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCareManagementAffiliationId(BigInteger value) {
        this.careManagementAffiliationId = value;
    }

    /**
     * Gets the value of the careManagementAffiliationUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareManagementAffiliationUniversalId() {
        return careManagementAffiliationUniversalId;
    }

    /**
     * Sets the value of the careManagementAffiliationUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareManagementAffiliationUniversalId(String value) {
        this.careManagementAffiliationUniversalId = value;
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
     * Gets the value of the completeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompleteDate() {
        return completeDate;
    }

    /**
     * Sets the value of the completeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompleteDate(XMLGregorianCalendar value) {
        this.completeDate = value;
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
     * Gets the value of the deadlineAction property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDeadlineAction }
     *     
     */
    public TypeOfDeadlineAction getDeadlineAction() {
        return deadlineAction;
    }

    /**
     * Sets the value of the deadlineAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDeadlineAction }
     *     
     */
    public void setDeadlineAction(TypeOfDeadlineAction value) {
        this.deadlineAction = value;
    }

    /**
     * Gets the value of the deadlineAlertRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAlertRecipient }
     *     
     */
    public TypeOfAlertRecipient getDeadlineAlertRecipient() {
        return deadlineAlertRecipient;
    }

    /**
     * Sets the value of the deadlineAlertRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAlertRecipient }
     *     
     */
    public void setDeadlineAlertRecipient(TypeOfAlertRecipient value) {
        this.deadlineAlertRecipient = value;
    }

    /**
     * Gets the value of the deadlineBeforeNextIteration property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDeadline }
     *     
     */
    public TypeOfDeadline getDeadlineBeforeNextIteration() {
        return deadlineBeforeNextIteration;
    }

    /**
     * Sets the value of the deadlineBeforeNextIteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDeadline }
     *     
     */
    public void setDeadlineBeforeNextIteration(TypeOfDeadline value) {
        this.deadlineBeforeNextIteration = value;
    }

    /**
     * Gets the value of the deadlineSelection property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDeadlineSelection }
     *     
     */
    public TypeOfDeadlineSelection getDeadlineSelection() {
        return deadlineSelection;
    }

    /**
     * Sets the value of the deadlineSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDeadlineSelection }
     *     
     */
    public void setDeadlineSelection(TypeOfDeadlineSelection value) {
        this.deadlineSelection = value;
    }

    /**
     * Gets the value of the deadlineTimeBlockAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeadlineTimeBlockAmount() {
        return deadlineTimeBlockAmount;
    }

    /**
     * Sets the value of the deadlineTimeBlockAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeadlineTimeBlockAmount(BigInteger value) {
        this.deadlineTimeBlockAmount = value;
    }

    /**
     * Gets the value of the deadlineTimeBlockUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTimeUnit }
     *     
     */
    public TypeOfTimeUnit getDeadlineTimeBlockUnits() {
        return deadlineTimeBlockUnits;
    }

    /**
     * Sets the value of the deadlineTimeBlockUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTimeUnit }
     *     
     */
    public void setDeadlineTimeBlockUnits(TypeOfTimeUnit value) {
        this.deadlineTimeBlockUnits = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDuration(BigInteger value) {
        this.duration = value;
    }

    /**
     * Gets the value of the durationUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTimeUnit }
     *     
     */
    public TypeOfTimeUnit getDurationUnits() {
        return durationUnits;
    }

    /**
     * Sets the value of the durationUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTimeUnit }
     *     
     */
    public void setDurationUnits(TypeOfTimeUnit value) {
        this.durationUnits = value;
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
     * Gets the value of the memberAffiliationId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMemberAffiliationId() {
        return memberAffiliationId;
    }

    /**
     * Sets the value of the memberAffiliationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMemberAffiliationId(BigInteger value) {
        this.memberAffiliationId = value;
    }

    /**
     * Gets the value of the memberAffiliationUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberAffiliationUniversalId() {
        return memberAffiliationUniversalId;
    }

    /**
     * Sets the value of the memberAffiliationUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberAffiliationUniversalId(String value) {
        this.memberAffiliationUniversalId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the originalRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginalRecipient() {
        return originalRecipient;
    }

    /**
     * Sets the value of the originalRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginalRecipient(BigInteger value) {
        this.originalRecipient = value;
    }

    /**
     * Gets the value of the originalRecipientUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalRecipientUniversalId() {
        return originalRecipientUniversalId;
    }

    /**
     * Sets the value of the originalRecipientUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalRecipientUniversalId(String value) {
        this.originalRecipientUniversalId = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutcome(BigInteger value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOwner(BigInteger value) {
        this.owner = value;
    }

    /**
     * Gets the value of the ownerUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerUniversalId() {
        return ownerUniversalId;
    }

    /**
     * Sets the value of the ownerUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerUniversalId(String value) {
        this.ownerUniversalId = value;
    }

    /**
     * Gets the value of the patientIdQueryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPatientIdQueryId() {
        return patientIdQueryId;
    }

    /**
     * Sets the value of the patientIdQueryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPatientIdQueryId(BigInteger value) {
        this.patientIdQueryId = value;
    }

    /**
     * Gets the value of the patientIdQueryUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientIdQueryUniversalId() {
        return patientIdQueryUniversalId;
    }

    /**
     * Sets the value of the patientIdQueryUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientIdQueryUniversalId(String value) {
        this.patientIdQueryUniversalId = value;
    }

    /**
     * Gets the value of the personal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonal() {
        return personal;
    }

    /**
     * Sets the value of the personal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonal(Boolean value) {
        this.personal = value;
    }

    /**
     * Gets the value of the providerAffiliationId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProviderAffiliationId() {
        return providerAffiliationId;
    }

    /**
     * Sets the value of the providerAffiliationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProviderAffiliationId(BigInteger value) {
        this.providerAffiliationId = value;
    }

    /**
     * Gets the value of the providerAffiliationUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderAffiliationUniversalId() {
        return providerAffiliationUniversalId;
    }

    /**
     * Sets the value of the providerAffiliationUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderAffiliationUniversalId(String value) {
        this.providerAffiliationUniversalId = value;
    }

    /**
     * Gets the value of the reminderProceedWithAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReminderProceedWithAmount() {
        return reminderProceedWithAmount;
    }

    /**
     * Sets the value of the reminderProceedWithAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReminderProceedWithAmount(BigInteger value) {
        this.reminderProceedWithAmount = value;
    }

    /**
     * Gets the value of the reminderProceedWithUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTimeUnit }
     *     
     */
    public TypeOfTimeUnit getReminderProceedWithUnits() {
        return reminderProceedWithUnits;
    }

    /**
     * Sets the value of the reminderProceedWithUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTimeUnit }
     *     
     */
    public void setReminderProceedWithUnits(TypeOfTimeUnit value) {
        this.reminderProceedWithUnits = value;
    }

    /**
     * Gets the value of the reminderTimeOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTimeOrigin }
     *     
     */
    public TypeOfTimeOrigin getReminderTimeOrigin() {
        return reminderTimeOrigin;
    }

    /**
     * Sets the value of the reminderTimeOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTimeOrigin }
     *     
     */
    public void setReminderTimeOrigin(TypeOfTimeOrigin value) {
        this.reminderTimeOrigin = value;
    }

    /**
     * Gets the value of the repetitionPattern property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRepetitionPattern() {
        return repetitionPattern;
    }

    /**
     * Sets the value of the repetitionPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRepetitionPattern(BigInteger value) {
        this.repetitionPattern = value;
    }

    /**
     * Gets the value of the scheduled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheduled() {
        return scheduled;
    }

    /**
     * Sets the value of the scheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduled(Boolean value) {
        this.scheduled = value;
    }

    /**
     * Gets the value of the sentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentDate() {
        return sentDate;
    }

    /**
     * Sets the value of the sentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentDate(XMLGregorianCalendar value) {
        this.sentDate = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfSource }
     *     
     */
    public TypeOfSource getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfSource }
     *     
     */
    public void setSourceType(TypeOfSource value) {
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
     * Gets the value of the startNoLaterThanAction property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfStartNoLaterThanAction }
     *     
     */
    public TypeOfStartNoLaterThanAction getStartNoLaterThanAction() {
        return startNoLaterThanAction;
    }

    /**
     * Sets the value of the startNoLaterThanAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfStartNoLaterThanAction }
     *     
     */
    public void setStartNoLaterThanAction(TypeOfStartNoLaterThanAction value) {
        this.startNoLaterThanAction = value;
    }

    /**
     * Gets the value of the startNoLaterThanDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartNoLaterThanDate() {
        return startNoLaterThanDate;
    }

    /**
     * Sets the value of the startNoLaterThanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartNoLaterThanDate(XMLGregorianCalendar value) {
        this.startNoLaterThanDate = value;
    }

    /**
     * Gets the value of the startedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartedDate() {
        return startedDate;
    }

    /**
     * Sets the value of the startedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartedDate(XMLGregorianCalendar value) {
        this.startedDate = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the taknasmtccBase property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaknasmtccBase() {
        return taknasmtccBase;
    }

    /**
     * Sets the value of the taknasmtccBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaknasmtccBase(BigInteger value) {
        this.taknasmtccBase = value;
    }

    /**
     * Gets the value of the taskStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTaskStatus }
     *     
     */
    public TypeOfTaskStatus getTaskStatus() {
        return taskStatus;
    }

    /**
     * Sets the value of the taskStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTaskStatus }
     *     
     */
    public void setTaskStatus(TypeOfTaskStatus value) {
        this.taskStatus = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTemplateId(BigInteger value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the templateUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateUniversalId() {
        return templateUniversalId;
    }

    /**
     * Sets the value of the templateUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateUniversalId(String value) {
        this.templateUniversalId = value;
    }

    /**
     * Gets the value of the terminatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminatedDate() {
        return terminatedDate;
    }

    /**
     * Sets the value of the terminatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminatedDate(XMLGregorianCalendar value) {
        this.terminatedDate = value;
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
     * Gets the value of the umEventAffiliationId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUmEventAffiliationId() {
        return umEventAffiliationId;
    }

    /**
     * Sets the value of the umEventAffiliationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmEventAffiliationId(BigInteger value) {
        this.umEventAffiliationId = value;
    }

    /**
     * Gets the value of the umEventAffiliationUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmEventAffiliationUniversalId() {
        return umEventAffiliationUniversalId;
    }

    /**
     * Sets the value of the umEventAffiliationUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmEventAffiliationUniversalId(String value) {
        this.umEventAffiliationUniversalId = value;
    }

    /**
     * Gets the value of the umEventId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUmEventId() {
        return umEventId;
    }

    /**
     * Sets the value of the umEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmEventId(BigInteger value) {
        this.umEventId = value;
    }

    /**
     * Gets the value of the umEventRequestAffiliationId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUmEventRequestAffiliationId() {
        return umEventRequestAffiliationId;
    }

    /**
     * Sets the value of the umEventRequestAffiliationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmEventRequestAffiliationId(BigInteger value) {
        this.umEventRequestAffiliationId = value;
    }

    /**
     * Gets the value of the umEventRequestAffiliationUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmEventRequestAffiliationUniversalId() {
        return umEventRequestAffiliationUniversalId;
    }

    /**
     * Sets the value of the umEventRequestAffiliationUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmEventRequestAffiliationUniversalId(String value) {
        this.umEventRequestAffiliationUniversalId = value;
    }

    /**
     * Gets the value of the umEventUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmEventUniversalId() {
        return umEventUniversalId;
    }

    /**
     * Sets the value of the umEventUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmEventUniversalId(String value) {
        this.umEventUniversalId = value;
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
