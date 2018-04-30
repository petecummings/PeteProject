
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfAssessmentResponse;
import com.click4care.thinkhealth.core.dto.TypeOfMultiChoiceQuestionFormat;
import com.click4care.thinkhealth.core.dto.TypeOfObjectState;
import com.click4care.thinkhealth.core.dto.TypeOfVisibility;


/**
 * <p>Java class for assessmentQuestion_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentQuestion_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertFormulaId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="alertFormulaUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="assessmentUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="authorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carebeanFormulaId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="carebeanFormulaUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="choiceAsList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="diagnosisFormulaId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="diagnosisFormulaUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="inPool" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="multiMaxSelected" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="multiMustSelect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="objectState" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfObjectState" minOccurs="0"/>
 *         &lt;element name="openTextLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="originalCreatorId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="originalQuestionId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="originalQuestionUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="problemFormulaId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="problemFormulaUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prompt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="questionFormulaId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="questionFormulaUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="questionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportFormulaId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reportFormulaUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseFormat" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfMultiChoiceQuestionFormat" minOccurs="0"/>
 *         &lt;element name="responseType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfAssessmentResponse" minOccurs="0"/>
 *         &lt;element name="scrollbarId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="scrollbarUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="skipFormulaId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="skipFormulaUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusFormulaId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="statusFormulaUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype1DropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype2DropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype3DropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskFormulaId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="taskFormulaUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeSubtypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfVisibility" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentQuestion_type", propOrder = {
    "alertFormulaId",
    "alertFormulaUniversalId",
    "assessmentId",
    "assessmentUniversalId",
    "author",
    "authorUniversalId",
    "c4CId",
    "carebeanFormulaId",
    "carebeanFormulaUniversalId",
    "choiceAsList",
    "createdDate",
    "deletedDate",
    "diagnosisFormulaId",
    "diagnosisFormulaUniversalId",
    "id",
    "inPool",
    "lastActionDate",
    "mandatory",
    "multiMaxSelected",
    "multiMustSelect",
    "objectState",
    "openTextLimit",
    "orderId",
    "originalCreatorId",
    "originalQuestionId",
    "originalQuestionUniversalId",
    "problemFormulaId",
    "problemFormulaUniversalId",
    "prompt",
    "questionFormulaId",
    "questionFormulaUniversalId",
    "questionText",
    "reportFormulaId",
    "reportFormulaUniversalId",
    "responseFormat",
    "responseType",
    "scrollbarId",
    "scrollbarUniversalId",
    "skipFormulaId",
    "skipFormulaUniversalId",
    "statusFormulaId",
    "statusFormulaUniversalId",
    "subtype1DropDownListItemLabel",
    "subtype1DropDownListName",
    "subtype2DropDownListItemLabel",
    "subtype2DropDownListName",
    "subtype3DropDownListItemLabel",
    "subtype3DropDownListName",
    "taskFormulaId",
    "taskFormulaUniversalId",
    "textFormat",
    "typeDropDownListItemLabel",
    "typeDropDownListName",
    "typeSubtypeId",
    "typeSubtypeUniversalId",
    "universalId",
    "valueFormat",
    "version",
    "visibility",
    "weight"
})
public class AssessmentQuestionType {

    protected BigInteger alertFormulaId;
    protected String alertFormulaUniversalId;
    protected BigInteger assessmentId;
    protected String assessmentUniversalId;
    protected BigInteger author;
    protected String authorUniversalId;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected BigInteger carebeanFormulaId;
    protected String carebeanFormulaUniversalId;
    protected Boolean choiceAsList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected BigInteger diagnosisFormulaId;
    protected String diagnosisFormulaUniversalId;
    protected BigInteger id;
    protected Boolean inPool;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected Boolean mandatory;
    protected BigInteger multiMaxSelected;
    protected Boolean multiMustSelect;
    @XmlSchemaType(name = "string")
    protected TypeOfObjectState objectState;
    protected BigInteger openTextLimit;
    protected BigInteger orderId;
    protected BigInteger originalCreatorId;
    protected BigInteger originalQuestionId;
    protected String originalQuestionUniversalId;
    protected BigInteger problemFormulaId;
    protected String problemFormulaUniversalId;
    protected Boolean prompt;
    protected BigInteger questionFormulaId;
    protected String questionFormulaUniversalId;
    protected String questionText;
    protected BigInteger reportFormulaId;
    protected String reportFormulaUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfMultiChoiceQuestionFormat responseFormat;
    @XmlSchemaType(name = "string")
    protected TypeOfAssessmentResponse responseType;
    protected BigInteger scrollbarId;
    protected String scrollbarUniversalId;
    protected BigInteger skipFormulaId;
    protected String skipFormulaUniversalId;
    protected BigInteger statusFormulaId;
    protected String statusFormulaUniversalId;
    protected String subtype1DropDownListItemLabel;
    protected String subtype1DropDownListName;
    protected String subtype2DropDownListItemLabel;
    protected String subtype2DropDownListName;
    protected String subtype3DropDownListItemLabel;
    protected String subtype3DropDownListName;
    protected BigInteger taskFormulaId;
    protected String taskFormulaUniversalId;
    protected String textFormat;
    protected String typeDropDownListItemLabel;
    protected String typeDropDownListName;
    protected BigInteger typeSubtypeId;
    protected String typeSubtypeUniversalId;
    protected String universalId;
    protected String valueFormat;
    protected BigInteger version;
    @XmlSchemaType(name = "string")
    protected TypeOfVisibility visibility;
    protected Double weight;

    /**
     * Gets the value of the alertFormulaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAlertFormulaId() {
        return alertFormulaId;
    }

    /**
     * Sets the value of the alertFormulaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAlertFormulaId(BigInteger value) {
        this.alertFormulaId = value;
    }

    /**
     * Gets the value of the alertFormulaUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertFormulaUniversalId() {
        return alertFormulaUniversalId;
    }

    /**
     * Sets the value of the alertFormulaUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertFormulaUniversalId(String value) {
        this.alertFormulaUniversalId = value;
    }

    /**
     * Gets the value of the assessmentId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssessmentId() {
        return assessmentId;
    }

    /**
     * Sets the value of the assessmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssessmentId(BigInteger value) {
        this.assessmentId = value;
    }

    /**
     * Gets the value of the assessmentUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentUniversalId() {
        return assessmentUniversalId;
    }

    /**
     * Sets the value of the assessmentUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentUniversalId(String value) {
        this.assessmentUniversalId = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthor(BigInteger value) {
        this.author = value;
    }

    /**
     * Gets the value of the authorUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorUniversalId() {
        return authorUniversalId;
    }

    /**
     * Sets the value of the authorUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorUniversalId(String value) {
        this.authorUniversalId = value;
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
     * Gets the value of the carebeanFormulaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCarebeanFormulaId() {
        return carebeanFormulaId;
    }

    /**
     * Sets the value of the carebeanFormulaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCarebeanFormulaId(BigInteger value) {
        this.carebeanFormulaId = value;
    }

    /**
     * Gets the value of the carebeanFormulaUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarebeanFormulaUniversalId() {
        return carebeanFormulaUniversalId;
    }

    /**
     * Sets the value of the carebeanFormulaUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarebeanFormulaUniversalId(String value) {
        this.carebeanFormulaUniversalId = value;
    }

    /**
     * Gets the value of the choiceAsList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChoiceAsList() {
        return choiceAsList;
    }

    /**
     * Sets the value of the choiceAsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChoiceAsList(Boolean value) {
        this.choiceAsList = value;
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
     * Gets the value of the diagnosisFormulaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiagnosisFormulaId() {
        return diagnosisFormulaId;
    }

    /**
     * Sets the value of the diagnosisFormulaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiagnosisFormulaId(BigInteger value) {
        this.diagnosisFormulaId = value;
    }

    /**
     * Gets the value of the diagnosisFormulaUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosisFormulaUniversalId() {
        return diagnosisFormulaUniversalId;
    }

    /**
     * Sets the value of the diagnosisFormulaUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosisFormulaUniversalId(String value) {
        this.diagnosisFormulaUniversalId = value;
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
     * Gets the value of the inPool property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInPool() {
        return inPool;
    }

    /**
     * Sets the value of the inPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInPool(Boolean value) {
        this.inPool = value;
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
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatory(Boolean value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the multiMaxSelected property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMultiMaxSelected() {
        return multiMaxSelected;
    }

    /**
     * Sets the value of the multiMaxSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMultiMaxSelected(BigInteger value) {
        this.multiMaxSelected = value;
    }

    /**
     * Gets the value of the multiMustSelect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiMustSelect() {
        return multiMustSelect;
    }

    /**
     * Sets the value of the multiMustSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiMustSelect(Boolean value) {
        this.multiMustSelect = value;
    }

    /**
     * Gets the value of the objectState property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfObjectState }
     *     
     */
    public TypeOfObjectState getObjectState() {
        return objectState;
    }

    /**
     * Sets the value of the objectState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfObjectState }
     *     
     */
    public void setObjectState(TypeOfObjectState value) {
        this.objectState = value;
    }

    /**
     * Gets the value of the openTextLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenTextLimit() {
        return openTextLimit;
    }

    /**
     * Sets the value of the openTextLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenTextLimit(BigInteger value) {
        this.openTextLimit = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderId(BigInteger value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the originalCreatorId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginalCreatorId() {
        return originalCreatorId;
    }

    /**
     * Sets the value of the originalCreatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginalCreatorId(BigInteger value) {
        this.originalCreatorId = value;
    }

    /**
     * Gets the value of the originalQuestionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginalQuestionId() {
        return originalQuestionId;
    }

    /**
     * Sets the value of the originalQuestionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginalQuestionId(BigInteger value) {
        this.originalQuestionId = value;
    }

    /**
     * Gets the value of the originalQuestionUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalQuestionUniversalId() {
        return originalQuestionUniversalId;
    }

    /**
     * Sets the value of the originalQuestionUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalQuestionUniversalId(String value) {
        this.originalQuestionUniversalId = value;
    }

    /**
     * Gets the value of the problemFormulaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProblemFormulaId() {
        return problemFormulaId;
    }

    /**
     * Sets the value of the problemFormulaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProblemFormulaId(BigInteger value) {
        this.problemFormulaId = value;
    }

    /**
     * Gets the value of the problemFormulaUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemFormulaUniversalId() {
        return problemFormulaUniversalId;
    }

    /**
     * Sets the value of the problemFormulaUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemFormulaUniversalId(String value) {
        this.problemFormulaUniversalId = value;
    }

    /**
     * Gets the value of the prompt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrompt() {
        return prompt;
    }

    /**
     * Sets the value of the prompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrompt(Boolean value) {
        this.prompt = value;
    }

    /**
     * Gets the value of the questionFormulaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuestionFormulaId() {
        return questionFormulaId;
    }

    /**
     * Sets the value of the questionFormulaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuestionFormulaId(BigInteger value) {
        this.questionFormulaId = value;
    }

    /**
     * Gets the value of the questionFormulaUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionFormulaUniversalId() {
        return questionFormulaUniversalId;
    }

    /**
     * Sets the value of the questionFormulaUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionFormulaUniversalId(String value) {
        this.questionFormulaUniversalId = value;
    }

    /**
     * Gets the value of the questionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * Sets the value of the questionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionText(String value) {
        this.questionText = value;
    }

    /**
     * Gets the value of the reportFormulaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReportFormulaId() {
        return reportFormulaId;
    }

    /**
     * Sets the value of the reportFormulaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReportFormulaId(BigInteger value) {
        this.reportFormulaId = value;
    }

    /**
     * Gets the value of the reportFormulaUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportFormulaUniversalId() {
        return reportFormulaUniversalId;
    }

    /**
     * Sets the value of the reportFormulaUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportFormulaUniversalId(String value) {
        this.reportFormulaUniversalId = value;
    }

    /**
     * Gets the value of the responseFormat property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfMultiChoiceQuestionFormat }
     *     
     */
    public TypeOfMultiChoiceQuestionFormat getResponseFormat() {
        return responseFormat;
    }

    /**
     * Sets the value of the responseFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfMultiChoiceQuestionFormat }
     *     
     */
    public void setResponseFormat(TypeOfMultiChoiceQuestionFormat value) {
        this.responseFormat = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAssessmentResponse }
     *     
     */
    public TypeOfAssessmentResponse getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAssessmentResponse }
     *     
     */
    public void setResponseType(TypeOfAssessmentResponse value) {
        this.responseType = value;
    }

    /**
     * Gets the value of the scrollbarId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScrollbarId() {
        return scrollbarId;
    }

    /**
     * Sets the value of the scrollbarId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScrollbarId(BigInteger value) {
        this.scrollbarId = value;
    }

    /**
     * Gets the value of the scrollbarUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScrollbarUniversalId() {
        return scrollbarUniversalId;
    }

    /**
     * Sets the value of the scrollbarUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScrollbarUniversalId(String value) {
        this.scrollbarUniversalId = value;
    }

    /**
     * Gets the value of the skipFormulaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSkipFormulaId() {
        return skipFormulaId;
    }

    /**
     * Sets the value of the skipFormulaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSkipFormulaId(BigInteger value) {
        this.skipFormulaId = value;
    }

    /**
     * Gets the value of the skipFormulaUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkipFormulaUniversalId() {
        return skipFormulaUniversalId;
    }

    /**
     * Sets the value of the skipFormulaUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkipFormulaUniversalId(String value) {
        this.skipFormulaUniversalId = value;
    }

    /**
     * Gets the value of the statusFormulaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatusFormulaId() {
        return statusFormulaId;
    }

    /**
     * Sets the value of the statusFormulaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatusFormulaId(BigInteger value) {
        this.statusFormulaId = value;
    }

    /**
     * Gets the value of the statusFormulaUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusFormulaUniversalId() {
        return statusFormulaUniversalId;
    }

    /**
     * Sets the value of the statusFormulaUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusFormulaUniversalId(String value) {
        this.statusFormulaUniversalId = value;
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
     * Gets the value of the taskFormulaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaskFormulaId() {
        return taskFormulaId;
    }

    /**
     * Sets the value of the taskFormulaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaskFormulaId(BigInteger value) {
        this.taskFormulaId = value;
    }

    /**
     * Gets the value of the taskFormulaUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskFormulaUniversalId() {
        return taskFormulaUniversalId;
    }

    /**
     * Sets the value of the taskFormulaUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskFormulaUniversalId(String value) {
        this.taskFormulaUniversalId = value;
    }

    /**
     * Gets the value of the textFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextFormat() {
        return textFormat;
    }

    /**
     * Sets the value of the textFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextFormat(String value) {
        this.textFormat = value;
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
     * Gets the value of the valueFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueFormat() {
        return valueFormat;
    }

    /**
     * Sets the value of the valueFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueFormat(String value) {
        this.valueFormat = value;
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
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfVisibility }
     *     
     */
    public TypeOfVisibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfVisibility }
     *     
     */
    public void setVisibility(TypeOfVisibility value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

}
