
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfAppealableState;
import com.click4care.thinkhealth.core.dto.TypeOfDetermination;


/**
 * <p>Java class for appealable_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appealable_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="actualUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="actualUnitsDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualUnitsDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualUnitsUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appeals" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="appeal" type="{http://www.click4care.com/thinkhealth/6.5/dto}appeal_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="approvedDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="approvedDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="approvedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="approvedUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="approvedUnitsDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvedUnitsDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvedUnitsUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clinicalDataEntryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateWritten" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="decisionPriority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="decisionPriorityDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decisionPriorityDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decisionPriorityUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="denialReason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="denialReasonDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denialReasonDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denialReasonUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deniedDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deniedDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deniedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deniedUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deniedUnitsDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deniedUnitsDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deniedUnitsUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="determination" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDetermination" minOccurs="0"/>
 *         &lt;element name="determinationDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="determinationReason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="determinationReasonDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="determinationReasonDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="determinationReasonUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="isError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastFillDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="memberId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="memberUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referralCategory" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="referralCategoryDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referralCategoryDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referralCategoryModifier" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="referralCategoryModifierDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referralCategoryModifierDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referralCategoryModifierUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referralCategoryUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refills" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="requestedDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="requestedDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="requestedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="requestedUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="requestedUnitsDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedUnitsDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedUnitsUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfAppealableState" minOccurs="0"/>
 *         &lt;element name="substitutionDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="substitutionDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="substitutionId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="substitutionUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="turnaroundTimes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="turnaroundTime" type="{http://www.click4care.com/thinkhealth/6.5/dto}turnaround_time_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "appealable_type", propOrder = {
    "actualDateFrom",
    "actualDateTo",
    "actualQuantity",
    "actualUnits",
    "actualUnitsDropDownListItemLabel",
    "actualUnitsDropDownListName",
    "actualUnitsUniversalId",
    "appeals",
    "approvedDateFrom",
    "approvedDateTo",
    "approvedQuantity",
    "approvedUnits",
    "approvedUnitsDropDownListItemLabel",
    "approvedUnitsDropDownListName",
    "approvedUnitsUniversalId",
    "authorizationId",
    "c4CId",
    "clinicalDataEntryId",
    "comment",
    "createdDate",
    "dateWritten",
    "decisionPriority",
    "decisionPriorityDropDownListItemLabel",
    "decisionPriorityDropDownListName",
    "decisionPriorityUniversalId",
    "deletedDate",
    "denialReason",
    "denialReasonDropDownListItemLabel",
    "denialReasonDropDownListName",
    "denialReasonUniversalId",
    "deniedDateFrom",
    "deniedDateTo",
    "deniedQuantity",
    "deniedUnits",
    "deniedUnitsDropDownListItemLabel",
    "deniedUnitsDropDownListName",
    "deniedUnitsUniversalId",
    "determination",
    "determinationDueDate",
    "determinationReason",
    "determinationReasonDropDownListItemLabel",
    "determinationReasonDropDownListName",
    "determinationReasonUniversalId",
    "errorText",
    "id",
    "isError",
    "lastActionDate",
    "lastFillDate",
    "memberId",
    "memberUniversalId",
    "referralCategory",
    "referralCategoryDropDownListItemLabel",
    "referralCategoryDropDownListName",
    "referralCategoryModifier",
    "referralCategoryModifierDropDownListItemLabel",
    "referralCategoryModifierDropDownListName",
    "referralCategoryModifierUniversalId",
    "referralCategoryUniversalId",
    "refills",
    "requestedDateFrom",
    "requestedDateTo",
    "requestedQuantity",
    "requestedUnits",
    "requestedUnitsDropDownListItemLabel",
    "requestedUnitsDropDownListName",
    "requestedUnitsUniversalId",
    "state",
    "substitutionDropDownListItemLabel",
    "substitutionDropDownListName",
    "substitutionId",
    "substitutionUniversalId",
    "turnaroundTimes",
    "universalId",
    "version"
})
@XmlSeeAlso({
    MedicalServiceType.class
})
public abstract class AppealableType {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDateTo;
    protected BigInteger actualQuantity;
    protected BigInteger actualUnits;
    protected String actualUnitsDropDownListItemLabel;
    protected String actualUnitsDropDownListName;
    protected String actualUnitsUniversalId;
    protected AppealableType.Appeals appeals;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvedDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvedDateTo;
    protected BigInteger approvedQuantity;
    protected BigInteger approvedUnits;
    protected String approvedUnitsDropDownListItemLabel;
    protected String approvedUnitsDropDownListName;
    protected String approvedUnitsUniversalId;
    protected String authorizationId;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected Long clinicalDataEntryId;
    protected String comment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateWritten;
    protected BigInteger decisionPriority;
    protected String decisionPriorityDropDownListItemLabel;
    protected String decisionPriorityDropDownListName;
    protected String decisionPriorityUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected BigInteger denialReason;
    protected String denialReasonDropDownListItemLabel;
    protected String denialReasonDropDownListName;
    protected String denialReasonUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deniedDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deniedDateTo;
    protected BigInteger deniedQuantity;
    protected BigInteger deniedUnits;
    protected String deniedUnitsDropDownListItemLabel;
    protected String deniedUnitsDropDownListName;
    protected String deniedUnitsUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfDetermination determination;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar determinationDueDate;
    protected BigInteger determinationReason;
    protected String determinationReasonDropDownListItemLabel;
    protected String determinationReasonDropDownListName;
    protected String determinationReasonUniversalId;
    protected String errorText;
    protected BigInteger id;
    protected Boolean isError;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastFillDate;
    protected BigInteger memberId;
    protected String memberUniversalId;
    protected BigInteger referralCategory;
    protected String referralCategoryDropDownListItemLabel;
    protected String referralCategoryDropDownListName;
    protected BigInteger referralCategoryModifier;
    protected String referralCategoryModifierDropDownListItemLabel;
    protected String referralCategoryModifierDropDownListName;
    protected String referralCategoryModifierUniversalId;
    protected String referralCategoryUniversalId;
    protected BigInteger refills;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestedDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestedDateTo;
    protected BigInteger requestedQuantity;
    protected BigInteger requestedUnits;
    protected String requestedUnitsDropDownListItemLabel;
    protected String requestedUnitsDropDownListName;
    protected String requestedUnitsUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfAppealableState state;
    protected String substitutionDropDownListItemLabel;
    protected String substitutionDropDownListName;
    protected BigInteger substitutionId;
    protected String substitutionUniversalId;
    protected AppealableType.TurnaroundTimes turnaroundTimes;
    protected String universalId;
    protected BigInteger version;

    /**
     * Gets the value of the actualDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDateFrom() {
        return actualDateFrom;
    }

    /**
     * Sets the value of the actualDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDateFrom(XMLGregorianCalendar value) {
        this.actualDateFrom = value;
    }

    /**
     * Gets the value of the actualDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDateTo() {
        return actualDateTo;
    }

    /**
     * Sets the value of the actualDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDateTo(XMLGregorianCalendar value) {
        this.actualDateTo = value;
    }

    /**
     * Gets the value of the actualQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActualQuantity() {
        return actualQuantity;
    }

    /**
     * Sets the value of the actualQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActualQuantity(BigInteger value) {
        this.actualQuantity = value;
    }

    /**
     * Gets the value of the actualUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActualUnits() {
        return actualUnits;
    }

    /**
     * Sets the value of the actualUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActualUnits(BigInteger value) {
        this.actualUnits = value;
    }

    /**
     * Gets the value of the actualUnitsDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualUnitsDropDownListItemLabel() {
        return actualUnitsDropDownListItemLabel;
    }

    /**
     * Sets the value of the actualUnitsDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualUnitsDropDownListItemLabel(String value) {
        this.actualUnitsDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the actualUnitsDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualUnitsDropDownListName() {
        return actualUnitsDropDownListName;
    }

    /**
     * Sets the value of the actualUnitsDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualUnitsDropDownListName(String value) {
        this.actualUnitsDropDownListName = value;
    }

    /**
     * Gets the value of the actualUnitsUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualUnitsUniversalId() {
        return actualUnitsUniversalId;
    }

    /**
     * Sets the value of the actualUnitsUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualUnitsUniversalId(String value) {
        this.actualUnitsUniversalId = value;
    }

    /**
     * Gets the value of the appeals property.
     * 
     * @return
     *     possible object is
     *     {@link AppealableType.Appeals }
     *     
     */
    public AppealableType.Appeals getAppeals() {
        return appeals;
    }

    /**
     * Sets the value of the appeals property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppealableType.Appeals }
     *     
     */
    public void setAppeals(AppealableType.Appeals value) {
        this.appeals = value;
    }

    /**
     * Gets the value of the approvedDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovedDateFrom() {
        return approvedDateFrom;
    }

    /**
     * Sets the value of the approvedDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovedDateFrom(XMLGregorianCalendar value) {
        this.approvedDateFrom = value;
    }

    /**
     * Gets the value of the approvedDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovedDateTo() {
        return approvedDateTo;
    }

    /**
     * Sets the value of the approvedDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovedDateTo(XMLGregorianCalendar value) {
        this.approvedDateTo = value;
    }

    /**
     * Gets the value of the approvedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApprovedQuantity() {
        return approvedQuantity;
    }

    /**
     * Sets the value of the approvedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApprovedQuantity(BigInteger value) {
        this.approvedQuantity = value;
    }

    /**
     * Gets the value of the approvedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApprovedUnits() {
        return approvedUnits;
    }

    /**
     * Sets the value of the approvedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApprovedUnits(BigInteger value) {
        this.approvedUnits = value;
    }

    /**
     * Gets the value of the approvedUnitsDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedUnitsDropDownListItemLabel() {
        return approvedUnitsDropDownListItemLabel;
    }

    /**
     * Sets the value of the approvedUnitsDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedUnitsDropDownListItemLabel(String value) {
        this.approvedUnitsDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the approvedUnitsDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedUnitsDropDownListName() {
        return approvedUnitsDropDownListName;
    }

    /**
     * Sets the value of the approvedUnitsDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedUnitsDropDownListName(String value) {
        this.approvedUnitsDropDownListName = value;
    }

    /**
     * Gets the value of the approvedUnitsUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedUnitsUniversalId() {
        return approvedUnitsUniversalId;
    }

    /**
     * Sets the value of the approvedUnitsUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedUnitsUniversalId(String value) {
        this.approvedUnitsUniversalId = value;
    }

    /**
     * Gets the value of the authorizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationId() {
        return authorizationId;
    }

    /**
     * Sets the value of the authorizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationId(String value) {
        this.authorizationId = value;
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
     * Gets the value of the clinicalDataEntryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClinicalDataEntryId() {
        return clinicalDataEntryId;
    }

    /**
     * Sets the value of the clinicalDataEntryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClinicalDataEntryId(Long value) {
        this.clinicalDataEntryId = value;
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
     * Gets the value of the dateWritten property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateWritten() {
        return dateWritten;
    }

    /**
     * Sets the value of the dateWritten property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateWritten(XMLGregorianCalendar value) {
        this.dateWritten = value;
    }

    /**
     * Gets the value of the decisionPriority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecisionPriority() {
        return decisionPriority;
    }

    /**
     * Sets the value of the decisionPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecisionPriority(BigInteger value) {
        this.decisionPriority = value;
    }

    /**
     * Gets the value of the decisionPriorityDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionPriorityDropDownListItemLabel() {
        return decisionPriorityDropDownListItemLabel;
    }

    /**
     * Sets the value of the decisionPriorityDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionPriorityDropDownListItemLabel(String value) {
        this.decisionPriorityDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the decisionPriorityDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionPriorityDropDownListName() {
        return decisionPriorityDropDownListName;
    }

    /**
     * Sets the value of the decisionPriorityDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionPriorityDropDownListName(String value) {
        this.decisionPriorityDropDownListName = value;
    }

    /**
     * Gets the value of the decisionPriorityUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionPriorityUniversalId() {
        return decisionPriorityUniversalId;
    }

    /**
     * Sets the value of the decisionPriorityUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionPriorityUniversalId(String value) {
        this.decisionPriorityUniversalId = value;
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
     * Gets the value of the denialReason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDenialReason() {
        return denialReason;
    }

    /**
     * Sets the value of the denialReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDenialReason(BigInteger value) {
        this.denialReason = value;
    }

    /**
     * Gets the value of the denialReasonDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenialReasonDropDownListItemLabel() {
        return denialReasonDropDownListItemLabel;
    }

    /**
     * Sets the value of the denialReasonDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenialReasonDropDownListItemLabel(String value) {
        this.denialReasonDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the denialReasonDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenialReasonDropDownListName() {
        return denialReasonDropDownListName;
    }

    /**
     * Sets the value of the denialReasonDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenialReasonDropDownListName(String value) {
        this.denialReasonDropDownListName = value;
    }

    /**
     * Gets the value of the denialReasonUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenialReasonUniversalId() {
        return denialReasonUniversalId;
    }

    /**
     * Sets the value of the denialReasonUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenialReasonUniversalId(String value) {
        this.denialReasonUniversalId = value;
    }

    /**
     * Gets the value of the deniedDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeniedDateFrom() {
        return deniedDateFrom;
    }

    /**
     * Sets the value of the deniedDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeniedDateFrom(XMLGregorianCalendar value) {
        this.deniedDateFrom = value;
    }

    /**
     * Gets the value of the deniedDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeniedDateTo() {
        return deniedDateTo;
    }

    /**
     * Sets the value of the deniedDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeniedDateTo(XMLGregorianCalendar value) {
        this.deniedDateTo = value;
    }

    /**
     * Gets the value of the deniedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeniedQuantity() {
        return deniedQuantity;
    }

    /**
     * Sets the value of the deniedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeniedQuantity(BigInteger value) {
        this.deniedQuantity = value;
    }

    /**
     * Gets the value of the deniedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeniedUnits() {
        return deniedUnits;
    }

    /**
     * Sets the value of the deniedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeniedUnits(BigInteger value) {
        this.deniedUnits = value;
    }

    /**
     * Gets the value of the deniedUnitsDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeniedUnitsDropDownListItemLabel() {
        return deniedUnitsDropDownListItemLabel;
    }

    /**
     * Sets the value of the deniedUnitsDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeniedUnitsDropDownListItemLabel(String value) {
        this.deniedUnitsDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the deniedUnitsDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeniedUnitsDropDownListName() {
        return deniedUnitsDropDownListName;
    }

    /**
     * Sets the value of the deniedUnitsDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeniedUnitsDropDownListName(String value) {
        this.deniedUnitsDropDownListName = value;
    }

    /**
     * Gets the value of the deniedUnitsUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeniedUnitsUniversalId() {
        return deniedUnitsUniversalId;
    }

    /**
     * Sets the value of the deniedUnitsUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeniedUnitsUniversalId(String value) {
        this.deniedUnitsUniversalId = value;
    }

    /**
     * Gets the value of the determination property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDetermination }
     *     
     */
    public TypeOfDetermination getDetermination() {
        return determination;
    }

    /**
     * Sets the value of the determination property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDetermination }
     *     
     */
    public void setDetermination(TypeOfDetermination value) {
        this.determination = value;
    }

    /**
     * Gets the value of the determinationDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeterminationDueDate() {
        return determinationDueDate;
    }

    /**
     * Sets the value of the determinationDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeterminationDueDate(XMLGregorianCalendar value) {
        this.determinationDueDate = value;
    }

    /**
     * Gets the value of the determinationReason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeterminationReason() {
        return determinationReason;
    }

    /**
     * Sets the value of the determinationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeterminationReason(BigInteger value) {
        this.determinationReason = value;
    }

    /**
     * Gets the value of the determinationReasonDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeterminationReasonDropDownListItemLabel() {
        return determinationReasonDropDownListItemLabel;
    }

    /**
     * Sets the value of the determinationReasonDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminationReasonDropDownListItemLabel(String value) {
        this.determinationReasonDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the determinationReasonDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeterminationReasonDropDownListName() {
        return determinationReasonDropDownListName;
    }

    /**
     * Sets the value of the determinationReasonDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminationReasonDropDownListName(String value) {
        this.determinationReasonDropDownListName = value;
    }

    /**
     * Gets the value of the determinationReasonUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeterminationReasonUniversalId() {
        return determinationReasonUniversalId;
    }

    /**
     * Sets the value of the determinationReasonUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminationReasonUniversalId(String value) {
        this.determinationReasonUniversalId = value;
    }

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
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
     * Gets the value of the isError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsError() {
        return isError;
    }

    /**
     * Sets the value of the isError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsError(Boolean value) {
        this.isError = value;
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
     * Gets the value of the lastFillDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastFillDate() {
        return lastFillDate;
    }

    /**
     * Sets the value of the lastFillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastFillDate(XMLGregorianCalendar value) {
        this.lastFillDate = value;
    }

    /**
     * Gets the value of the memberId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMemberId() {
        return memberId;
    }

    /**
     * Sets the value of the memberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMemberId(BigInteger value) {
        this.memberId = value;
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
     * Gets the value of the referralCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferralCategory() {
        return referralCategory;
    }

    /**
     * Sets the value of the referralCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferralCategory(BigInteger value) {
        this.referralCategory = value;
    }

    /**
     * Gets the value of the referralCategoryDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralCategoryDropDownListItemLabel() {
        return referralCategoryDropDownListItemLabel;
    }

    /**
     * Sets the value of the referralCategoryDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralCategoryDropDownListItemLabel(String value) {
        this.referralCategoryDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the referralCategoryDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralCategoryDropDownListName() {
        return referralCategoryDropDownListName;
    }

    /**
     * Sets the value of the referralCategoryDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralCategoryDropDownListName(String value) {
        this.referralCategoryDropDownListName = value;
    }

    /**
     * Gets the value of the referralCategoryModifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferralCategoryModifier() {
        return referralCategoryModifier;
    }

    /**
     * Sets the value of the referralCategoryModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferralCategoryModifier(BigInteger value) {
        this.referralCategoryModifier = value;
    }

    /**
     * Gets the value of the referralCategoryModifierDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralCategoryModifierDropDownListItemLabel() {
        return referralCategoryModifierDropDownListItemLabel;
    }

    /**
     * Sets the value of the referralCategoryModifierDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralCategoryModifierDropDownListItemLabel(String value) {
        this.referralCategoryModifierDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the referralCategoryModifierDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralCategoryModifierDropDownListName() {
        return referralCategoryModifierDropDownListName;
    }

    /**
     * Sets the value of the referralCategoryModifierDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralCategoryModifierDropDownListName(String value) {
        this.referralCategoryModifierDropDownListName = value;
    }

    /**
     * Gets the value of the referralCategoryModifierUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralCategoryModifierUniversalId() {
        return referralCategoryModifierUniversalId;
    }

    /**
     * Sets the value of the referralCategoryModifierUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralCategoryModifierUniversalId(String value) {
        this.referralCategoryModifierUniversalId = value;
    }

    /**
     * Gets the value of the referralCategoryUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralCategoryUniversalId() {
        return referralCategoryUniversalId;
    }

    /**
     * Sets the value of the referralCategoryUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralCategoryUniversalId(String value) {
        this.referralCategoryUniversalId = value;
    }

    /**
     * Gets the value of the refills property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefills() {
        return refills;
    }

    /**
     * Sets the value of the refills property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefills(BigInteger value) {
        this.refills = value;
    }

    /**
     * Gets the value of the requestedDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedDateFrom() {
        return requestedDateFrom;
    }

    /**
     * Sets the value of the requestedDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedDateFrom(XMLGregorianCalendar value) {
        this.requestedDateFrom = value;
    }

    /**
     * Gets the value of the requestedDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedDateTo() {
        return requestedDateTo;
    }

    /**
     * Sets the value of the requestedDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedDateTo(XMLGregorianCalendar value) {
        this.requestedDateTo = value;
    }

    /**
     * Gets the value of the requestedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestedQuantity() {
        return requestedQuantity;
    }

    /**
     * Sets the value of the requestedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestedQuantity(BigInteger value) {
        this.requestedQuantity = value;
    }

    /**
     * Gets the value of the requestedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestedUnits() {
        return requestedUnits;
    }

    /**
     * Sets the value of the requestedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestedUnits(BigInteger value) {
        this.requestedUnits = value;
    }

    /**
     * Gets the value of the requestedUnitsDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedUnitsDropDownListItemLabel() {
        return requestedUnitsDropDownListItemLabel;
    }

    /**
     * Sets the value of the requestedUnitsDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedUnitsDropDownListItemLabel(String value) {
        this.requestedUnitsDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the requestedUnitsDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedUnitsDropDownListName() {
        return requestedUnitsDropDownListName;
    }

    /**
     * Sets the value of the requestedUnitsDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedUnitsDropDownListName(String value) {
        this.requestedUnitsDropDownListName = value;
    }

    /**
     * Gets the value of the requestedUnitsUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedUnitsUniversalId() {
        return requestedUnitsUniversalId;
    }

    /**
     * Sets the value of the requestedUnitsUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedUnitsUniversalId(String value) {
        this.requestedUnitsUniversalId = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAppealableState }
     *     
     */
    public TypeOfAppealableState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAppealableState }
     *     
     */
    public void setState(TypeOfAppealableState value) {
        this.state = value;
    }

    /**
     * Gets the value of the substitutionDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstitutionDropDownListItemLabel() {
        return substitutionDropDownListItemLabel;
    }

    /**
     * Sets the value of the substitutionDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstitutionDropDownListItemLabel(String value) {
        this.substitutionDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the substitutionDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstitutionDropDownListName() {
        return substitutionDropDownListName;
    }

    /**
     * Sets the value of the substitutionDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstitutionDropDownListName(String value) {
        this.substitutionDropDownListName = value;
    }

    /**
     * Gets the value of the substitutionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubstitutionId() {
        return substitutionId;
    }

    /**
     * Sets the value of the substitutionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubstitutionId(BigInteger value) {
        this.substitutionId = value;
    }

    /**
     * Gets the value of the substitutionUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstitutionUniversalId() {
        return substitutionUniversalId;
    }

    /**
     * Sets the value of the substitutionUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstitutionUniversalId(String value) {
        this.substitutionUniversalId = value;
    }

    /**
     * Gets the value of the turnaroundTimes property.
     * 
     * @return
     *     possible object is
     *     {@link AppealableType.TurnaroundTimes }
     *     
     */
    public AppealableType.TurnaroundTimes getTurnaroundTimes() {
        return turnaroundTimes;
    }

    /**
     * Sets the value of the turnaroundTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppealableType.TurnaroundTimes }
     *     
     */
    public void setTurnaroundTimes(AppealableType.TurnaroundTimes value) {
        this.turnaroundTimes = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="appeal" type="{http://www.click4care.com/thinkhealth/6.5/dto}appeal_type" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "appeal"
    })
    public static class Appeals {

        protected List<AppealType> appeal;

        /**
         * Gets the value of the appeal property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the appeal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAppeal().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AppealType }
         * 
         * 
         */
        public List<AppealType> getAppeal() {
            if (appeal == null) {
                appeal = new ArrayList<AppealType>();
            }
            return this.appeal;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="turnaroundTime" type="{http://www.click4care.com/thinkhealth/6.5/dto}turnaround_time_type" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "turnaroundTime"
    })
    public static class TurnaroundTimes {

        protected List<TurnaroundTimeType> turnaroundTime;

        /**
         * Gets the value of the turnaroundTime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the turnaroundTime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTurnaroundTime().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TurnaroundTimeType }
         * 
         * 
         */
        public List<TurnaroundTimeType> getTurnaroundTime() {
            if (turnaroundTime == null) {
                turnaroundTime = new ArrayList<TurnaroundTimeType>();
            }
            return this.turnaroundTime;
        }

    }

}
