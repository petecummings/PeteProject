
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfTableForForeignKey;
import com.click4care.thinkhealth.core.dto.TypeOfTableForNoteTo;


/**
 * <p>Java class for turnaround_time_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="turnaround_time_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="completed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="determinationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="due" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="explanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extPriorityId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="extPriorityUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extRsnId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="extRsnUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extStatusId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="extStatusUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fkey" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="fkeyTableType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTableForForeignKey" minOccurs="0"/>
 *         &lt;element name="fkeyUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionByLoggedIn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="noteToId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="noteToTableType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTableForNoteTo" minOccurs="0"/>
 *         &lt;element name="noteToUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notificationReasonId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="notificationReasonUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalCreator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="originalCreatorLoggedIn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="parentUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="received" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="recipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="recipientTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestInformationUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedInformationId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verbalNotificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="writtenNotificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "turnaround_time_type", propOrder = {
    "c4CId",
    "completed",
    "createdDate",
    "deletedDate",
    "determinationStatus",
    "due",
    "explanation",
    "extPriorityId",
    "extPriorityUniversalId",
    "extRsnId",
    "extRsnUniversalId",
    "extStatusId",
    "extStatusUniversalId",
    "fkey",
    "fkeyTableType",
    "fkeyUniversalId",
    "id",
    "lastActionBy",
    "lastActionByLoggedIn",
    "lastActionDate",
    "noteToId",
    "noteToTableType",
    "noteToUniversalId",
    "notificationReasonId",
    "notificationReasonUniversalId",
    "originalCreator",
    "originalCreatorLoggedIn",
    "parentId",
    "parentUniversalId",
    "received",
    "recipient",
    "recipientTypeId",
    "recipientTypeUniversalId",
    "requestInformationUniversalId",
    "requestedInformationId",
    "state",
    "type",
    "typeDropDownListItemLabel",
    "typeDropDownListName",
    "typeUniversalId",
    "universalId",
    "verbalNotificationDate",
    "version",
    "writtenNotificationDate"
})
public class TurnaroundTimeType {

    @XmlElement(name = "c4cId")
    protected String c4CId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completed;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected String determinationStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar due;
    protected String explanation;
    protected BigInteger extPriorityId;
    protected String extPriorityUniversalId;
    protected BigInteger extRsnId;
    protected String extRsnUniversalId;
    protected BigInteger extStatusId;
    protected String extStatusUniversalId;
    protected BigInteger fkey;
    @XmlSchemaType(name = "string")
    protected TypeOfTableForForeignKey fkeyTableType;
    protected String fkeyUniversalId;
    protected BigInteger id;
    protected BigInteger lastActionBy;
    protected BigInteger lastActionByLoggedIn;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected BigInteger noteToId;
    @XmlSchemaType(name = "string")
    protected TypeOfTableForNoteTo noteToTableType;
    protected String noteToUniversalId;
    protected BigInteger notificationReasonId;
    protected String notificationReasonUniversalId;
    protected BigInteger originalCreator;
    protected BigInteger originalCreatorLoggedIn;
    protected BigInteger parentId;
    protected String parentUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar received;
    protected String recipient;
    protected BigInteger recipientTypeId;
    protected String recipientTypeUniversalId;
    protected String requestInformationUniversalId;
    protected BigInteger requestedInformationId;
    protected BigInteger state;
    protected BigInteger type;
    protected String typeDropDownListItemLabel;
    protected String typeDropDownListName;
    protected String typeUniversalId;
    protected String universalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar verbalNotificationDate;
    protected BigInteger version;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar writtenNotificationDate;

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
     * Gets the value of the completed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompleted() {
        return completed;
    }

    /**
     * Sets the value of the completed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompleted(XMLGregorianCalendar value) {
        this.completed = value;
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
     * Gets the value of the determinationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeterminationStatus() {
        return determinationStatus;
    }

    /**
     * Sets the value of the determinationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminationStatus(String value) {
        this.determinationStatus = value;
    }

    /**
     * Gets the value of the due property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDue() {
        return due;
    }

    /**
     * Sets the value of the due property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDue(XMLGregorianCalendar value) {
        this.due = value;
    }

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanation(String value) {
        this.explanation = value;
    }

    /**
     * Gets the value of the extPriorityId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtPriorityId() {
        return extPriorityId;
    }

    /**
     * Sets the value of the extPriorityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtPriorityId(BigInteger value) {
        this.extPriorityId = value;
    }

    /**
     * Gets the value of the extPriorityUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtPriorityUniversalId() {
        return extPriorityUniversalId;
    }

    /**
     * Sets the value of the extPriorityUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtPriorityUniversalId(String value) {
        this.extPriorityUniversalId = value;
    }

    /**
     * Gets the value of the extRsnId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtRsnId() {
        return extRsnId;
    }

    /**
     * Sets the value of the extRsnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtRsnId(BigInteger value) {
        this.extRsnId = value;
    }

    /**
     * Gets the value of the extRsnUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtRsnUniversalId() {
        return extRsnUniversalId;
    }

    /**
     * Sets the value of the extRsnUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtRsnUniversalId(String value) {
        this.extRsnUniversalId = value;
    }

    /**
     * Gets the value of the extStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtStatusId() {
        return extStatusId;
    }

    /**
     * Sets the value of the extStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtStatusId(BigInteger value) {
        this.extStatusId = value;
    }

    /**
     * Gets the value of the extStatusUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtStatusUniversalId() {
        return extStatusUniversalId;
    }

    /**
     * Sets the value of the extStatusUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtStatusUniversalId(String value) {
        this.extStatusUniversalId = value;
    }

    /**
     * Gets the value of the fkey property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFkey() {
        return fkey;
    }

    /**
     * Sets the value of the fkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFkey(BigInteger value) {
        this.fkey = value;
    }

    /**
     * Gets the value of the fkeyTableType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTableForForeignKey }
     *     
     */
    public TypeOfTableForForeignKey getFkeyTableType() {
        return fkeyTableType;
    }

    /**
     * Sets the value of the fkeyTableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTableForForeignKey }
     *     
     */
    public void setFkeyTableType(TypeOfTableForForeignKey value) {
        this.fkeyTableType = value;
    }

    /**
     * Gets the value of the fkeyUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkeyUniversalId() {
        return fkeyUniversalId;
    }

    /**
     * Sets the value of the fkeyUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkeyUniversalId(String value) {
        this.fkeyUniversalId = value;
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
     * Gets the value of the lastActionBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastActionBy() {
        return lastActionBy;
    }

    /**
     * Sets the value of the lastActionBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastActionBy(BigInteger value) {
        this.lastActionBy = value;
    }

    /**
     * Gets the value of the lastActionByLoggedIn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastActionByLoggedIn() {
        return lastActionByLoggedIn;
    }

    /**
     * Sets the value of the lastActionByLoggedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastActionByLoggedIn(BigInteger value) {
        this.lastActionByLoggedIn = value;
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
     * Gets the value of the noteToId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoteToId() {
        return noteToId;
    }

    /**
     * Sets the value of the noteToId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoteToId(BigInteger value) {
        this.noteToId = value;
    }

    /**
     * Gets the value of the noteToTableType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTableForNoteTo }
     *     
     */
    public TypeOfTableForNoteTo getNoteToTableType() {
        return noteToTableType;
    }

    /**
     * Sets the value of the noteToTableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTableForNoteTo }
     *     
     */
    public void setNoteToTableType(TypeOfTableForNoteTo value) {
        this.noteToTableType = value;
    }

    /**
     * Gets the value of the noteToUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteToUniversalId() {
        return noteToUniversalId;
    }

    /**
     * Sets the value of the noteToUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteToUniversalId(String value) {
        this.noteToUniversalId = value;
    }

    /**
     * Gets the value of the notificationReasonId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNotificationReasonId() {
        return notificationReasonId;
    }

    /**
     * Sets the value of the notificationReasonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNotificationReasonId(BigInteger value) {
        this.notificationReasonId = value;
    }

    /**
     * Gets the value of the notificationReasonUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationReasonUniversalId() {
        return notificationReasonUniversalId;
    }

    /**
     * Sets the value of the notificationReasonUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationReasonUniversalId(String value) {
        this.notificationReasonUniversalId = value;
    }

    /**
     * Gets the value of the originalCreator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginalCreator() {
        return originalCreator;
    }

    /**
     * Sets the value of the originalCreator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginalCreator(BigInteger value) {
        this.originalCreator = value;
    }

    /**
     * Gets the value of the originalCreatorLoggedIn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginalCreatorLoggedIn() {
        return originalCreatorLoggedIn;
    }

    /**
     * Sets the value of the originalCreatorLoggedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginalCreatorLoggedIn(BigInteger value) {
        this.originalCreatorLoggedIn = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentId(BigInteger value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the parentUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentUniversalId() {
        return parentUniversalId;
    }

    /**
     * Sets the value of the parentUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentUniversalId(String value) {
        this.parentUniversalId = value;
    }

    /**
     * Gets the value of the received property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceived() {
        return received;
    }

    /**
     * Sets the value of the received property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceived(XMLGregorianCalendar value) {
        this.received = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipient(String value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the recipientTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecipientTypeId() {
        return recipientTypeId;
    }

    /**
     * Sets the value of the recipientTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecipientTypeId(BigInteger value) {
        this.recipientTypeId = value;
    }

    /**
     * Gets the value of the recipientTypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientTypeUniversalId() {
        return recipientTypeUniversalId;
    }

    /**
     * Sets the value of the recipientTypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientTypeUniversalId(String value) {
        this.recipientTypeUniversalId = value;
    }

    /**
     * Gets the value of the requestInformationUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestInformationUniversalId() {
        return requestInformationUniversalId;
    }

    /**
     * Sets the value of the requestInformationUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestInformationUniversalId(String value) {
        this.requestInformationUniversalId = value;
    }

    /**
     * Gets the value of the requestedInformationId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestedInformationId() {
        return requestedInformationId;
    }

    /**
     * Sets the value of the requestedInformationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestedInformationId(BigInteger value) {
        this.requestedInformationId = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setState(BigInteger value) {
        this.state = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setType(BigInteger value) {
        this.type = value;
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
     * Gets the value of the typeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeUniversalId() {
        return typeUniversalId;
    }

    /**
     * Sets the value of the typeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeUniversalId(String value) {
        this.typeUniversalId = value;
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
     * Gets the value of the verbalNotificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVerbalNotificationDate() {
        return verbalNotificationDate;
    }

    /**
     * Sets the value of the verbalNotificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVerbalNotificationDate(XMLGregorianCalendar value) {
        this.verbalNotificationDate = value;
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

    /**
     * Gets the value of the writtenNotificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWrittenNotificationDate() {
        return writtenNotificationDate;
    }

    /**
     * Sets the value of the writtenNotificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWrittenNotificationDate(XMLGregorianCalendar value) {
        this.writtenNotificationDate = value;
    }

}
