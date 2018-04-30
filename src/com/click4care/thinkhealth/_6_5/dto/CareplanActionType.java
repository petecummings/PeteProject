
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for careplanAction_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="careplanAction_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessment" type="{http://www.click4care.com/thinkhealth/6.5/dto}assessment_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="barriers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="barrier" type="{http://www.click4care.com/thinkhealth/6.5/dto}careplanBarrier_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categories" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="category" type="{http://www.click4care.com/thinkhealth/6.5/dto}category_typesubtype" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="clinicalDataDefinitions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="clinicalDataDefinition" type="{http://www.click4care.com/thinkhealth/6.5/dto}clinicalDataDefinition_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="dropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropDownListItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="educationalContents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="educationalContent" type="{http://www.click4care.com/thinkhealth/6.5/dto}educational_content_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="httpContents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="httpContent" type="{http://www.click4care.com/thinkhealth/6.5/dto}http_content_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="note" type="{http://www.click4care.com/thinkhealth/6.5/dto}careplan_note_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="outcome" type="{http://www.click4care.com/thinkhealth/6.5/dto}careplanOutcome_type" minOccurs="0"/>
 *         &lt;element name="sentTaskId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sentTaskUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="statusDropDownListId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="statusDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusDropDownListItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="templateUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "careplanAction_type", propOrder = {
    "assessments",
    "barriers",
    "c4CId",
    "categories",
    "clinicalDataDefinitions",
    "comments",
    "createdDate",
    "deletedDate",
    "description",
    "dropDownListItemId",
    "dropDownListItemLabel",
    "dropDownListItemUniversalId",
    "educationalContents",
    "end",
    "httpContents",
    "id",
    "lastActionDate",
    "name",
    "notes",
    "outcome",
    "sentTaskId",
    "sentTaskUniversalId",
    "start",
    "statusDropDownListId",
    "statusDropDownListItemLabel",
    "statusDropDownListItemUniversalId",
    "templateId",
    "templateUniversalId",
    "universalId",
    "version"
})
public class CareplanActionType {

    protected CareplanActionType.Assessments assessments;
    protected CareplanActionType.Barriers barriers;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected CareplanActionType.Categories categories;
    protected CareplanActionType.ClinicalDataDefinitions clinicalDataDefinitions;
    protected String comments;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected String description;
    protected BigInteger dropDownListItemId;
    protected String dropDownListItemLabel;
    protected String dropDownListItemUniversalId;
    protected CareplanActionType.EducationalContents educationalContents;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    protected CareplanActionType.HttpContents httpContents;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected String name;
    protected CareplanActionType.Notes notes;
    protected CareplanOutcomeType outcome;
    protected BigInteger sentTaskId;
    protected String sentTaskUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    protected BigInteger statusDropDownListId;
    protected String statusDropDownListItemLabel;
    protected String statusDropDownListItemUniversalId;
    protected BigInteger templateId;
    protected String templateUniversalId;
    protected String universalId;
    protected BigInteger version;

    /**
     * Gets the value of the assessments property.
     * 
     * @return
     *     possible object is
     *     {@link CareplanActionType.Assessments }
     *     
     */
    public CareplanActionType.Assessments getAssessments() {
        return assessments;
    }

    /**
     * Sets the value of the assessments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareplanActionType.Assessments }
     *     
     */
    public void setAssessments(CareplanActionType.Assessments value) {
        this.assessments = value;
    }

    /**
     * Gets the value of the barriers property.
     * 
     * @return
     *     possible object is
     *     {@link CareplanActionType.Barriers }
     *     
     */
    public CareplanActionType.Barriers getBarriers() {
        return barriers;
    }

    /**
     * Sets the value of the barriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareplanActionType.Barriers }
     *     
     */
    public void setBarriers(CareplanActionType.Barriers value) {
        this.barriers = value;
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
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link CareplanActionType.Categories }
     *     
     */
    public CareplanActionType.Categories getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareplanActionType.Categories }
     *     
     */
    public void setCategories(CareplanActionType.Categories value) {
        this.categories = value;
    }

    /**
     * Gets the value of the clinicalDataDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link CareplanActionType.ClinicalDataDefinitions }
     *     
     */
    public CareplanActionType.ClinicalDataDefinitions getClinicalDataDefinitions() {
        return clinicalDataDefinitions;
    }

    /**
     * Sets the value of the clinicalDataDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareplanActionType.ClinicalDataDefinitions }
     *     
     */
    public void setClinicalDataDefinitions(CareplanActionType.ClinicalDataDefinitions value) {
        this.clinicalDataDefinitions = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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
     * Gets the value of the dropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDropDownListItemId() {
        return dropDownListItemId;
    }

    /**
     * Sets the value of the dropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDropDownListItemId(BigInteger value) {
        this.dropDownListItemId = value;
    }

    /**
     * Gets the value of the dropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropDownListItemLabel() {
        return dropDownListItemLabel;
    }

    /**
     * Sets the value of the dropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropDownListItemLabel(String value) {
        this.dropDownListItemLabel = value;
    }

    /**
     * Gets the value of the dropDownListItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropDownListItemUniversalId() {
        return dropDownListItemUniversalId;
    }

    /**
     * Sets the value of the dropDownListItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropDownListItemUniversalId(String value) {
        this.dropDownListItemUniversalId = value;
    }

    /**
     * Gets the value of the educationalContents property.
     * 
     * @return
     *     possible object is
     *     {@link CareplanActionType.EducationalContents }
     *     
     */
    public CareplanActionType.EducationalContents getEducationalContents() {
        return educationalContents;
    }

    /**
     * Sets the value of the educationalContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareplanActionType.EducationalContents }
     *     
     */
    public void setEducationalContents(CareplanActionType.EducationalContents value) {
        this.educationalContents = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * Gets the value of the httpContents property.
     * 
     * @return
     *     possible object is
     *     {@link CareplanActionType.HttpContents }
     *     
     */
    public CareplanActionType.HttpContents getHttpContents() {
        return httpContents;
    }

    /**
     * Sets the value of the httpContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareplanActionType.HttpContents }
     *     
     */
    public void setHttpContents(CareplanActionType.HttpContents value) {
        this.httpContents = value;
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
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link CareplanActionType.Notes }
     *     
     */
    public CareplanActionType.Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareplanActionType.Notes }
     *     
     */
    public void setNotes(CareplanActionType.Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link CareplanOutcomeType }
     *     
     */
    public CareplanOutcomeType getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareplanOutcomeType }
     *     
     */
    public void setOutcome(CareplanOutcomeType value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the sentTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSentTaskId() {
        return sentTaskId;
    }

    /**
     * Sets the value of the sentTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSentTaskId(BigInteger value) {
        this.sentTaskId = value;
    }

    /**
     * Gets the value of the sentTaskUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentTaskUniversalId() {
        return sentTaskUniversalId;
    }

    /**
     * Sets the value of the sentTaskUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentTaskUniversalId(String value) {
        this.sentTaskUniversalId = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the statusDropDownListId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatusDropDownListId() {
        return statusDropDownListId;
    }

    /**
     * Sets the value of the statusDropDownListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatusDropDownListId(BigInteger value) {
        this.statusDropDownListId = value;
    }

    /**
     * Gets the value of the statusDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDropDownListItemLabel() {
        return statusDropDownListItemLabel;
    }

    /**
     * Sets the value of the statusDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDropDownListItemLabel(String value) {
        this.statusDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the statusDropDownListItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDropDownListItemUniversalId() {
        return statusDropDownListItemUniversalId;
    }

    /**
     * Sets the value of the statusDropDownListItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDropDownListItemUniversalId(String value) {
        this.statusDropDownListItemUniversalId = value;
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
     *         &lt;element name="assessment" type="{http://www.click4care.com/thinkhealth/6.5/dto}assessment_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "assessment"
    })
    public static class Assessments {

        @XmlElement(nillable = true)
        protected List<AssessmentType> assessment;

        /**
         * Gets the value of the assessment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentType }
         * 
         * 
         */
        public List<AssessmentType> getAssessment() {
            if (assessment == null) {
                assessment = new ArrayList<AssessmentType>();
            }
            return this.assessment;
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
     *         &lt;element name="barrier" type="{http://www.click4care.com/thinkhealth/6.5/dto}careplanBarrier_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "barrier"
    })
    public static class Barriers {

        @XmlElement(nillable = true)
        protected List<CareplanBarrierType> barrier;

        /**
         * Gets the value of the barrier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the barrier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBarrier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CareplanBarrierType }
         * 
         * 
         */
        public List<CareplanBarrierType> getBarrier() {
            if (barrier == null) {
                barrier = new ArrayList<CareplanBarrierType>();
            }
            return this.barrier;
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
     *         &lt;element name="category" type="{http://www.click4care.com/thinkhealth/6.5/dto}category_typesubtype" maxOccurs="unbounded" minOccurs="0"/>
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
        "category"
    })
    public static class Categories {

        @XmlElement(nillable = true)
        protected List<CategoryTypesubtype> category;

        /**
         * Gets the value of the category property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the category property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CategoryTypesubtype }
         * 
         * 
         */
        public List<CategoryTypesubtype> getCategory() {
            if (category == null) {
                category = new ArrayList<CategoryTypesubtype>();
            }
            return this.category;
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
     *         &lt;element name="clinicalDataDefinition" type="{http://www.click4care.com/thinkhealth/6.5/dto}clinicalDataDefinition_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "clinicalDataDefinition"
    })
    public static class ClinicalDataDefinitions {

        @XmlElement(nillable = true)
        protected List<ClinicalDataDefinitionType> clinicalDataDefinition;

        /**
         * Gets the value of the clinicalDataDefinition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clinicalDataDefinition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClinicalDataDefinition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClinicalDataDefinitionType }
         * 
         * 
         */
        public List<ClinicalDataDefinitionType> getClinicalDataDefinition() {
            if (clinicalDataDefinition == null) {
                clinicalDataDefinition = new ArrayList<ClinicalDataDefinitionType>();
            }
            return this.clinicalDataDefinition;
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
     *         &lt;element name="educationalContent" type="{http://www.click4care.com/thinkhealth/6.5/dto}educational_content_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "educationalContent"
    })
    public static class EducationalContents {

        @XmlElement(nillable = true)
        protected List<EducationalContentType> educationalContent;

        /**
         * Gets the value of the educationalContent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the educationalContent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEducationalContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EducationalContentType }
         * 
         * 
         */
        public List<EducationalContentType> getEducationalContent() {
            if (educationalContent == null) {
                educationalContent = new ArrayList<EducationalContentType>();
            }
            return this.educationalContent;
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
     *         &lt;element name="httpContent" type="{http://www.click4care.com/thinkhealth/6.5/dto}http_content_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "httpContent"
    })
    public static class HttpContents {

        @XmlElement(nillable = true)
        protected List<HttpContentType> httpContent;

        /**
         * Gets the value of the httpContent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the httpContent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHttpContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HttpContentType }
         * 
         * 
         */
        public List<HttpContentType> getHttpContent() {
            if (httpContent == null) {
                httpContent = new ArrayList<HttpContentType>();
            }
            return this.httpContent;
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
     *         &lt;element name="note" type="{http://www.click4care.com/thinkhealth/6.5/dto}careplan_note_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "note"
    })
    public static class Notes {

        protected List<CareplanNoteType> note;

        /**
         * Gets the value of the note property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the note property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CareplanNoteType }
         * 
         * 
         */
        public List<CareplanNoteType> getNote() {
            if (note == null) {
                note = new ArrayList<CareplanNoteType>();
            }
            return this.note;
        }

    }

}
