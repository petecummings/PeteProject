
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfNoteState;


/**
 * <p>Java class for note_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="note_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="callDispositionDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callDispositionDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callDispositionId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="callDispositionUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callDuration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="callDurationUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="callDurationUnitsDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callDurationUnitsDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callDurationUnitsUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callOutcomeAttempt" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="callOutcomeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callOutcomeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callOutcomeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="callOutcomeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clinicalDataEntryId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contactId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customFields" type="{http://www.click4care.com/thinkhealth/6.5/dto}customFields_type" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="errorComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numberDialed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="priorityDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorityDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorityUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reasonUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sourceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfNoteState" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "note_type", propOrder = {
    "c4CId",
    "callDateTime",
    "callDispositionDropDownListItemLabel",
    "callDispositionDropDownListName",
    "callDispositionId",
    "callDispositionUniversalId",
    "callDuration",
    "callDurationUnits",
    "callDurationUnitsDropDownListItemLabel",
    "callDurationUnitsDropDownListName",
    "callDurationUnitsUniversalId",
    "callOutcomeAttempt",
    "callOutcomeDropDownListItemLabel",
    "callOutcomeDropDownListName",
    "callOutcomeId",
    "callOutcomeUniversalId",
    "callRecipient",
    "caller",
    "clinicalDataEntryId",
    "contactId",
    "createdDate",
    "customFields",
    "deletedDate",
    "errorComment",
    "group",
    "id",
    "lastActionDate",
    "numberDialed",
    "priority",
    "priorityDropDownListItemLabel",
    "priorityDropDownListName",
    "priorityUniversalId",
    "reasonDropDownListItemLabel",
    "reasonDropDownListName",
    "reasonId",
    "reasonUniversalId",
    "sourceDropDownListItemLabel",
    "sourceDropDownListName",
    "sourceId",
    "sourceUniversalId",
    "state",
    "subject",
    "text",
    "universalId",
    "version"
})
@XmlSeeAlso({
    CareManagementProjectNoteType.class,
    UmEventNoteType.class,
    MemberNoteType.class,
    ProviderNoteType.class,
    MemberGroupNoteType.class,
    MedicalServiceNoteType.class,
    CaseNoteType.class,
    SentTaskNoteType.class,
    UmDiagnosisNoteType.class,
    CareplanNoteType.class
})
public abstract class NoteType {

    @XmlElement(name = "c4cId")
    protected String c4CId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callDateTime;
    protected String callDispositionDropDownListItemLabel;
    protected String callDispositionDropDownListName;
    protected BigInteger callDispositionId;
    protected String callDispositionUniversalId;
    protected BigInteger callDuration;
    protected BigInteger callDurationUnits;
    protected String callDurationUnitsDropDownListItemLabel;
    protected String callDurationUnitsDropDownListName;
    protected String callDurationUnitsUniversalId;
    protected BigInteger callOutcomeAttempt;
    protected String callOutcomeDropDownListItemLabel;
    protected String callOutcomeDropDownListName;
    protected BigInteger callOutcomeId;
    protected String callOutcomeUniversalId;
    protected String callRecipient;
    protected String caller;
    protected BigInteger clinicalDataEntryId;
    protected BigInteger contactId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected CustomFieldsType customFields;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected String errorComment;
    protected BigInteger group;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected String numberDialed;
    protected BigInteger priority;
    protected String priorityDropDownListItemLabel;
    protected String priorityDropDownListName;
    protected String priorityUniversalId;
    protected String reasonDropDownListItemLabel;
    protected String reasonDropDownListName;
    protected BigInteger reasonId;
    protected String reasonUniversalId;
    protected String sourceDropDownListItemLabel;
    protected String sourceDropDownListName;
    protected BigInteger sourceId;
    protected String sourceUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfNoteState state;
    protected String subject;
    protected String text;
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
     * Gets the value of the callDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallDateTime() {
        return callDateTime;
    }

    /**
     * Sets the value of the callDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallDateTime(XMLGregorianCalendar value) {
        this.callDateTime = value;
    }

    /**
     * Gets the value of the callDispositionDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallDispositionDropDownListItemLabel() {
        return callDispositionDropDownListItemLabel;
    }

    /**
     * Sets the value of the callDispositionDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallDispositionDropDownListItemLabel(String value) {
        this.callDispositionDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the callDispositionDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallDispositionDropDownListName() {
        return callDispositionDropDownListName;
    }

    /**
     * Sets the value of the callDispositionDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallDispositionDropDownListName(String value) {
        this.callDispositionDropDownListName = value;
    }

    /**
     * Gets the value of the callDispositionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCallDispositionId() {
        return callDispositionId;
    }

    /**
     * Sets the value of the callDispositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCallDispositionId(BigInteger value) {
        this.callDispositionId = value;
    }

    /**
     * Gets the value of the callDispositionUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallDispositionUniversalId() {
        return callDispositionUniversalId;
    }

    /**
     * Sets the value of the callDispositionUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallDispositionUniversalId(String value) {
        this.callDispositionUniversalId = value;
    }

    /**
     * Gets the value of the callDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCallDuration() {
        return callDuration;
    }

    /**
     * Sets the value of the callDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCallDuration(BigInteger value) {
        this.callDuration = value;
    }

    /**
     * Gets the value of the callDurationUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCallDurationUnits() {
        return callDurationUnits;
    }

    /**
     * Sets the value of the callDurationUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCallDurationUnits(BigInteger value) {
        this.callDurationUnits = value;
    }

    /**
     * Gets the value of the callDurationUnitsDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallDurationUnitsDropDownListItemLabel() {
        return callDurationUnitsDropDownListItemLabel;
    }

    /**
     * Sets the value of the callDurationUnitsDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallDurationUnitsDropDownListItemLabel(String value) {
        this.callDurationUnitsDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the callDurationUnitsDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallDurationUnitsDropDownListName() {
        return callDurationUnitsDropDownListName;
    }

    /**
     * Sets the value of the callDurationUnitsDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallDurationUnitsDropDownListName(String value) {
        this.callDurationUnitsDropDownListName = value;
    }

    /**
     * Gets the value of the callDurationUnitsUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallDurationUnitsUniversalId() {
        return callDurationUnitsUniversalId;
    }

    /**
     * Sets the value of the callDurationUnitsUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallDurationUnitsUniversalId(String value) {
        this.callDurationUnitsUniversalId = value;
    }

    /**
     * Gets the value of the callOutcomeAttempt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCallOutcomeAttempt() {
        return callOutcomeAttempt;
    }

    /**
     * Sets the value of the callOutcomeAttempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCallOutcomeAttempt(BigInteger value) {
        this.callOutcomeAttempt = value;
    }

    /**
     * Gets the value of the callOutcomeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallOutcomeDropDownListItemLabel() {
        return callOutcomeDropDownListItemLabel;
    }

    /**
     * Sets the value of the callOutcomeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallOutcomeDropDownListItemLabel(String value) {
        this.callOutcomeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the callOutcomeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallOutcomeDropDownListName() {
        return callOutcomeDropDownListName;
    }

    /**
     * Sets the value of the callOutcomeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallOutcomeDropDownListName(String value) {
        this.callOutcomeDropDownListName = value;
    }

    /**
     * Gets the value of the callOutcomeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCallOutcomeId() {
        return callOutcomeId;
    }

    /**
     * Sets the value of the callOutcomeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCallOutcomeId(BigInteger value) {
        this.callOutcomeId = value;
    }

    /**
     * Gets the value of the callOutcomeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallOutcomeUniversalId() {
        return callOutcomeUniversalId;
    }

    /**
     * Sets the value of the callOutcomeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallOutcomeUniversalId(String value) {
        this.callOutcomeUniversalId = value;
    }

    /**
     * Gets the value of the callRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallRecipient() {
        return callRecipient;
    }

    /**
     * Sets the value of the callRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallRecipient(String value) {
        this.callRecipient = value;
    }

    /**
     * Gets the value of the caller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaller() {
        return caller;
    }

    /**
     * Sets the value of the caller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaller(String value) {
        this.caller = value;
    }

    /**
     * Gets the value of the clinicalDataEntryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClinicalDataEntryId() {
        return clinicalDataEntryId;
    }

    /**
     * Sets the value of the clinicalDataEntryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClinicalDataEntryId(BigInteger value) {
        this.clinicalDataEntryId = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContactId(BigInteger value) {
        this.contactId = value;
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
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroup(BigInteger value) {
        this.group = value;
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
     * Gets the value of the numberDialed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberDialed() {
        return numberDialed;
    }

    /**
     * Sets the value of the numberDialed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberDialed(String value) {
        this.numberDialed = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the priorityDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityDropDownListItemLabel() {
        return priorityDropDownListItemLabel;
    }

    /**
     * Sets the value of the priorityDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityDropDownListItemLabel(String value) {
        this.priorityDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the priorityDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityDropDownListName() {
        return priorityDropDownListName;
    }

    /**
     * Sets the value of the priorityDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityDropDownListName(String value) {
        this.priorityDropDownListName = value;
    }

    /**
     * Gets the value of the priorityUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityUniversalId() {
        return priorityUniversalId;
    }

    /**
     * Sets the value of the priorityUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityUniversalId(String value) {
        this.priorityUniversalId = value;
    }

    /**
     * Gets the value of the reasonDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonDropDownListItemLabel() {
        return reasonDropDownListItemLabel;
    }

    /**
     * Sets the value of the reasonDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonDropDownListItemLabel(String value) {
        this.reasonDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the reasonDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonDropDownListName() {
        return reasonDropDownListName;
    }

    /**
     * Sets the value of the reasonDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonDropDownListName(String value) {
        this.reasonDropDownListName = value;
    }

    /**
     * Gets the value of the reasonId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReasonId() {
        return reasonId;
    }

    /**
     * Sets the value of the reasonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReasonId(BigInteger value) {
        this.reasonId = value;
    }

    /**
     * Gets the value of the reasonUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonUniversalId() {
        return reasonUniversalId;
    }

    /**
     * Sets the value of the reasonUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonUniversalId(String value) {
        this.reasonUniversalId = value;
    }

    /**
     * Gets the value of the sourceDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDropDownListItemLabel() {
        return sourceDropDownListItemLabel;
    }

    /**
     * Sets the value of the sourceDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDropDownListItemLabel(String value) {
        this.sourceDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the sourceDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDropDownListName() {
        return sourceDropDownListName;
    }

    /**
     * Sets the value of the sourceDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDropDownListName(String value) {
        this.sourceDropDownListName = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceId(BigInteger value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the sourceUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUniversalId() {
        return sourceUniversalId;
    }

    /**
     * Sets the value of the sourceUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUniversalId(String value) {
        this.sourceUniversalId = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfNoteState }
     *     
     */
    public TypeOfNoteState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfNoteState }
     *     
     */
    public void setState(TypeOfNoteState value) {
        this.state = value;
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
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
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
