
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfAlertRecipient;
import com.click4care.thinkhealth.core.dto.TypeOfDeadline;
import com.click4care.thinkhealth.core.dto.TypeOfDeadlineAction;
import com.click4care.thinkhealth.core.dto.TypeOfDeadlineSelection;
import com.click4care.thinkhealth.core.dto.TypeOfTimeOrigin;
import com.click4care.thinkhealth.core.dto.TypeOfTimeUnit;


/**
 * <p>Java class for carebean_task_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carebean_task_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carebeanRepititions" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="carebeanTaskFileId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="carebeanTaskFileUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carebeanTaskRepetitionPatternUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carebeanTaskTemplateId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="carebeanTaskTemplateUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customFields" type="{http://www.click4care.com/thinkhealth/6.5/dto}customFields_type" minOccurs="0"/>
 *         &lt;element name="deadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deadlineAction" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDeadlineAction"/>
 *         &lt;element name="deadlineAlertRecipient" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfAlertRecipient" minOccurs="0"/>
 *         &lt;element name="deadlineAmt" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deadlineBeforeNextIteration" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDeadline" minOccurs="0"/>
 *         &lt;element name="deadlineSelection" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDeadlineSelection" minOccurs="0"/>
 *         &lt;element name="deadlineUnits" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTimeUnit" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="durationUnits" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTimeUnit" minOccurs="0"/>
 *         &lt;element name="goalId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="goalUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="indexId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ownerId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ownerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reminderProceedWithUnits" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTimeUnit" minOccurs="0"/>
 *         &lt;element name="reminderTimeofOrigin" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTimeOrigin" minOccurs="0"/>
 *         &lt;element name="scheduledAt" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sentLetterAlertRecipient" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfAlertRecipient" minOccurs="0"/>
 *         &lt;element name="startBlockAmt" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="startBlockUnits" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTimeUnit" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startNoLaterThanAction" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDeadlineAction" minOccurs="0"/>
 *         &lt;element name="startNoLaterThanDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startNoLaterThanTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype1DropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype2DropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype3DropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="typeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeSubtypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
@XmlType(name = "carebean_task_type", propOrder = {
    "c4CId",
    "carebeanRepititions",
    "carebeanTaskFileId",
    "carebeanTaskFileUniversalId",
    "carebeanTaskRepetitionPatternUniversalId",
    "carebeanTaskTemplateId",
    "carebeanTaskTemplateUniversalId",
    "createdDate",
    "customFields",
    "deadline",
    "deadlineAction",
    "deadlineAlertRecipient",
    "deadlineAmt",
    "deadlineBeforeNextIteration",
    "deadlineSelection",
    "deadlineUnits",
    "deletedDate",
    "description",
    "duration",
    "durationUnits",
    "goalId",
    "goalUniversalId",
    "id",
    "indexId",
    "lastActionDate",
    "name",
    "ownerId",
    "ownerUniversalId",
    "personal",
    "reminderProceedWithUnits",
    "reminderTimeofOrigin",
    "scheduledAt",
    "sentLetterAlertRecipient",
    "startBlockAmt",
    "startBlockUnits",
    "startDate",
    "startNoLaterThanAction",
    "startNoLaterThanDate",
    "startNoLaterThanTask",
    "subject",
    "subtype1DropDownListItemLabel",
    "subtype1DropDownListName",
    "subtype2DropDownListItemLabel",
    "subtype2DropDownListName",
    "subtype3DropDownListItemLabel",
    "subtype3DropDownListName",
    "taskNumber",
    "typeDropDownListItemLabel",
    "typeDropDownListName",
    "typeSubtypeId",
    "typeSubtypeUniversalId",
    "universalId",
    "version"
})
public class CarebeanTaskType {

    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected BigInteger carebeanRepititions;
    protected BigInteger carebeanTaskFileId;
    protected String carebeanTaskFileUniversalId;
    protected String carebeanTaskRepetitionPatternUniversalId;
    @XmlElement(required = true)
    protected BigInteger carebeanTaskTemplateId;
    protected String carebeanTaskTemplateUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected CustomFieldsType customFields;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deadline;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfDeadlineAction deadlineAction;
    @XmlSchemaType(name = "string")
    protected TypeOfAlertRecipient deadlineAlertRecipient;
    protected BigInteger deadlineAmt;
    @XmlSchemaType(name = "string")
    protected TypeOfDeadline deadlineBeforeNextIteration;
    @XmlSchemaType(name = "string")
    protected TypeOfDeadlineSelection deadlineSelection;
    @XmlSchemaType(name = "string")
    protected TypeOfTimeUnit deadlineUnits;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected String description;
    protected BigInteger duration;
    @XmlSchemaType(name = "string")
    protected TypeOfTimeUnit durationUnits;
    @XmlElement(required = true)
    protected BigInteger goalId;
    protected String goalUniversalId;
    protected BigInteger id;
    protected BigInteger indexId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected BigInteger ownerId;
    protected String ownerUniversalId;
    protected Boolean personal;
    @XmlSchemaType(name = "string")
    protected TypeOfTimeUnit reminderProceedWithUnits;
    @XmlSchemaType(name = "string")
    protected TypeOfTimeOrigin reminderTimeofOrigin;
    protected BigInteger scheduledAt;
    @XmlSchemaType(name = "string")
    protected TypeOfAlertRecipient sentLetterAlertRecipient;
    protected BigInteger startBlockAmt;
    @XmlSchemaType(name = "string")
    protected TypeOfTimeUnit startBlockUnits;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "string")
    protected TypeOfDeadlineAction startNoLaterThanAction;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startNoLaterThanDate;
    protected Boolean startNoLaterThanTask;
    protected String subject;
    protected String subtype1DropDownListItemLabel;
    protected String subtype1DropDownListName;
    protected String subtype2DropDownListItemLabel;
    protected String subtype2DropDownListName;
    protected String subtype3DropDownListItemLabel;
    protected String subtype3DropDownListName;
    @XmlElement(required = true)
    protected BigInteger taskNumber;
    protected String typeDropDownListItemLabel;
    protected String typeDropDownListName;
    protected BigInteger typeSubtypeId;
    protected String typeSubtypeUniversalId;
    protected String universalId;
    protected BigInteger version;

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
     * Gets the value of the carebeanRepititions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCarebeanRepititions() {
        return carebeanRepititions;
    }

    /**
     * Sets the value of the carebeanRepititions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCarebeanRepititions(BigInteger value) {
        this.carebeanRepititions = value;
    }

    /**
     * Gets the value of the carebeanTaskFileId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCarebeanTaskFileId() {
        return carebeanTaskFileId;
    }

    /**
     * Sets the value of the carebeanTaskFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCarebeanTaskFileId(BigInteger value) {
        this.carebeanTaskFileId = value;
    }

    /**
     * Gets the value of the carebeanTaskFileUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarebeanTaskFileUniversalId() {
        return carebeanTaskFileUniversalId;
    }

    /**
     * Sets the value of the carebeanTaskFileUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarebeanTaskFileUniversalId(String value) {
        this.carebeanTaskFileUniversalId = value;
    }

    /**
     * Gets the value of the carebeanTaskRepetitionPatternUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarebeanTaskRepetitionPatternUniversalId() {
        return carebeanTaskRepetitionPatternUniversalId;
    }

    /**
     * Sets the value of the carebeanTaskRepetitionPatternUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarebeanTaskRepetitionPatternUniversalId(String value) {
        this.carebeanTaskRepetitionPatternUniversalId = value;
    }

    /**
     * Gets the value of the carebeanTaskTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCarebeanTaskTemplateId() {
        return carebeanTaskTemplateId;
    }

    /**
     * Sets the value of the carebeanTaskTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCarebeanTaskTemplateId(BigInteger value) {
        this.carebeanTaskTemplateId = value;
    }

    /**
     * Gets the value of the carebeanTaskTemplateUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarebeanTaskTemplateUniversalId() {
        return carebeanTaskTemplateUniversalId;
    }

    /**
     * Sets the value of the carebeanTaskTemplateUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarebeanTaskTemplateUniversalId(String value) {
        this.carebeanTaskTemplateUniversalId = value;
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
     * Gets the value of the deadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeadline() {
        return deadline;
    }

    /**
     * Sets the value of the deadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeadline(XMLGregorianCalendar value) {
        this.deadline = value;
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
     * Gets the value of the deadlineAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeadlineAmt() {
        return deadlineAmt;
    }

    /**
     * Sets the value of the deadlineAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeadlineAmt(BigInteger value) {
        this.deadlineAmt = value;
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
     * Gets the value of the deadlineUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTimeUnit }
     *     
     */
    public TypeOfTimeUnit getDeadlineUnits() {
        return deadlineUnits;
    }

    /**
     * Sets the value of the deadlineUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTimeUnit }
     *     
     */
    public void setDeadlineUnits(TypeOfTimeUnit value) {
        this.deadlineUnits = value;
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
     * Gets the value of the goalId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGoalId() {
        return goalId;
    }

    /**
     * Sets the value of the goalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGoalId(BigInteger value) {
        this.goalId = value;
    }

    /**
     * Gets the value of the goalUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalUniversalId() {
        return goalUniversalId;
    }

    /**
     * Sets the value of the goalUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalUniversalId(String value) {
        this.goalUniversalId = value;
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
     * Gets the value of the indexId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndexId() {
        return indexId;
    }

    /**
     * Sets the value of the indexId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndexId(BigInteger value) {
        this.indexId = value;
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
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOwnerId(BigInteger value) {
        this.ownerId = value;
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
     * Gets the value of the reminderTimeofOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTimeOrigin }
     *     
     */
    public TypeOfTimeOrigin getReminderTimeofOrigin() {
        return reminderTimeofOrigin;
    }

    /**
     * Sets the value of the reminderTimeofOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTimeOrigin }
     *     
     */
    public void setReminderTimeofOrigin(TypeOfTimeOrigin value) {
        this.reminderTimeofOrigin = value;
    }

    /**
     * Gets the value of the scheduledAt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScheduledAt() {
        return scheduledAt;
    }

    /**
     * Sets the value of the scheduledAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScheduledAt(BigInteger value) {
        this.scheduledAt = value;
    }

    /**
     * Gets the value of the sentLetterAlertRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAlertRecipient }
     *     
     */
    public TypeOfAlertRecipient getSentLetterAlertRecipient() {
        return sentLetterAlertRecipient;
    }

    /**
     * Sets the value of the sentLetterAlertRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAlertRecipient }
     *     
     */
    public void setSentLetterAlertRecipient(TypeOfAlertRecipient value) {
        this.sentLetterAlertRecipient = value;
    }

    /**
     * Gets the value of the startBlockAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartBlockAmt() {
        return startBlockAmt;
    }

    /**
     * Sets the value of the startBlockAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartBlockAmt(BigInteger value) {
        this.startBlockAmt = value;
    }

    /**
     * Gets the value of the startBlockUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTimeUnit }
     *     
     */
    public TypeOfTimeUnit getStartBlockUnits() {
        return startBlockUnits;
    }

    /**
     * Sets the value of the startBlockUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTimeUnit }
     *     
     */
    public void setStartBlockUnits(TypeOfTimeUnit value) {
        this.startBlockUnits = value;
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
     *     {@link TypeOfDeadlineAction }
     *     
     */
    public TypeOfDeadlineAction getStartNoLaterThanAction() {
        return startNoLaterThanAction;
    }

    /**
     * Sets the value of the startNoLaterThanAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDeadlineAction }
     *     
     */
    public void setStartNoLaterThanAction(TypeOfDeadlineAction value) {
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
     * Gets the value of the startNoLaterThanTask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartNoLaterThanTask() {
        return startNoLaterThanTask;
    }

    /**
     * Sets the value of the startNoLaterThanTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartNoLaterThanTask(Boolean value) {
        this.startNoLaterThanTask = value;
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
     * Gets the value of the subtype1DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype1DropDownListItemLabel() {
        return subtype1DropDownListItemLabel;
    }

    /**
     * Sets the value of the subtype1DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype1DropDownListItemLabel(String value) {
        this.subtype1DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the subtype1DropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype1DropDownListName() {
        return subtype1DropDownListName;
    }

    /**
     * Sets the value of the subtype1DropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype1DropDownListName(String value) {
        this.subtype1DropDownListName = value;
    }

    /**
     * Gets the value of the subtype2DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype2DropDownListItemLabel() {
        return subtype2DropDownListItemLabel;
    }

    /**
     * Sets the value of the subtype2DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype2DropDownListItemLabel(String value) {
        this.subtype2DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the subtype2DropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype2DropDownListName() {
        return subtype2DropDownListName;
    }

    /**
     * Sets the value of the subtype2DropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype2DropDownListName(String value) {
        this.subtype2DropDownListName = value;
    }

    /**
     * Gets the value of the subtype3DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype3DropDownListItemLabel() {
        return subtype3DropDownListItemLabel;
    }

    /**
     * Sets the value of the subtype3DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype3DropDownListItemLabel(String value) {
        this.subtype3DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the subtype3DropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype3DropDownListName() {
        return subtype3DropDownListName;
    }

    /**
     * Sets the value of the subtype3DropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype3DropDownListName(String value) {
        this.subtype3DropDownListName = value;
    }

    /**
     * Gets the value of the taskNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaskNumber() {
        return taskNumber;
    }

    /**
     * Sets the value of the taskNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaskNumber(BigInteger value) {
        this.taskNumber = value;
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
     * Gets the value of the typeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDropDownListName() {
        return typeDropDownListName;
    }

    /**
     * Sets the value of the typeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDropDownListName(String value) {
        this.typeDropDownListName = value;
    }

    /**
     * Gets the value of the typeSubtypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeSubtypeId() {
        return typeSubtypeId;
    }

    /**
     * Sets the value of the typeSubtypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeSubtypeId(BigInteger value) {
        this.typeSubtypeId = value;
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
