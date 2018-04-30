
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
 * <p>Java class for clinicalDataDefinition_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clinicalDataDefinition_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachmentsDisplayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="calculationDisplayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="calculationFormatDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculationFormatId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="calculationFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculationUnitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculationUnitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="captureMethodDisplayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="valueDefinitions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="valueDefinition" type="{http://www.click4care.com/thinkhealth/6.5/dto}clinicalDataValueDefinition_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="creatorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceMakerDisplayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deviceModelDisplayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="educationalContentIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="educationalContentId" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="educationalContentUniversalIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="educationalContentUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="explanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="freeTextNoteDisplayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observerDisplayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="showExplanationDisplayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sourceDisplayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="typeSubtype1DropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeSubtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeSubtype2DropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeSubtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeSubtype3DropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeSubtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeSubtypeDropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeSubtypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clinicalDataDefinition_type", propOrder = {
    "attachmentsDisplayed",
    "calculationDisplayed",
    "calculationFormatDropDownListItemLabel",
    "calculationFormatId",
    "calculationFormula",
    "calculationLabel",
    "calculationUnitTypeDropDownListItemLabel",
    "calculationUnitTypeId",
    "captureMethodDisplayed",
    "valueDefinitions",
    "creationDate",
    "creatorId",
    "creatorUniversalId",
    "deviceMakerDisplayed",
    "deviceModelDisplayed",
    "educationalContentIds",
    "educationalContentUniversalIds",
    "enabled",
    "explanation",
    "freeTextNoteDisplayed",
    "id",
    "name",
    "observerDisplayed",
    "showExplanationDisplayed",
    "sourceDisplayed",
    "typeSubtype1DropDownListItemId",
    "typeSubtype1DropDownListItemLabel",
    "typeSubtype2DropDownListItemId",
    "typeSubtype2DropDownListItemLabel",
    "typeSubtype3DropDownListItemId",
    "typeSubtype3DropDownListItemLabel",
    "typeSubtypeDropDownListItemId",
    "typeSubtypeDropDownListItemLabel",
    "universalId"
})
public class ClinicalDataDefinitionType {

    protected boolean attachmentsDisplayed;
    protected boolean calculationDisplayed;
    protected String calculationFormatDropDownListItemLabel;
    protected BigInteger calculationFormatId;
    protected String calculationFormula;
    protected String calculationLabel;
    protected String calculationUnitTypeDropDownListItemLabel;
    protected BigInteger calculationUnitTypeId;
    protected boolean captureMethodDisplayed;
    protected ClinicalDataDefinitionType.ValueDefinitions valueDefinitions;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected BigInteger creatorId;
    protected String creatorUniversalId;
    protected boolean deviceMakerDisplayed;
    protected boolean deviceModelDisplayed;
    protected ClinicalDataDefinitionType.EducationalContentIds educationalContentIds;
    protected ClinicalDataDefinitionType.EducationalContentUniversalIds educationalContentUniversalIds;
    protected boolean enabled;
    protected String explanation;
    protected boolean freeTextNoteDisplayed;
    protected BigInteger id;
    protected String name;
    protected boolean observerDisplayed;
    protected boolean showExplanationDisplayed;
    protected boolean sourceDisplayed;
    protected BigInteger typeSubtype1DropDownListItemId;
    protected String typeSubtype1DropDownListItemLabel;
    protected BigInteger typeSubtype2DropDownListItemId;
    protected String typeSubtype2DropDownListItemLabel;
    protected BigInteger typeSubtype3DropDownListItemId;
    protected String typeSubtype3DropDownListItemLabel;
    protected BigInteger typeSubtypeDropDownListItemId;
    protected String typeSubtypeDropDownListItemLabel;
    protected String universalId;

    /**
     * Gets the value of the attachmentsDisplayed property.
     * 
     */
    public boolean isAttachmentsDisplayed() {
        return attachmentsDisplayed;
    }

    /**
     * Sets the value of the attachmentsDisplayed property.
     * 
     */
    public void setAttachmentsDisplayed(boolean value) {
        this.attachmentsDisplayed = value;
    }

    /**
     * Gets the value of the calculationDisplayed property.
     * 
     */
    public boolean isCalculationDisplayed() {
        return calculationDisplayed;
    }

    /**
     * Sets the value of the calculationDisplayed property.
     * 
     */
    public void setCalculationDisplayed(boolean value) {
        this.calculationDisplayed = value;
    }

    /**
     * Gets the value of the calculationFormatDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationFormatDropDownListItemLabel() {
        return calculationFormatDropDownListItemLabel;
    }

    /**
     * Sets the value of the calculationFormatDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationFormatDropDownListItemLabel(String value) {
        this.calculationFormatDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the calculationFormatId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCalculationFormatId() {
        return calculationFormatId;
    }

    /**
     * Sets the value of the calculationFormatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCalculationFormatId(BigInteger value) {
        this.calculationFormatId = value;
    }

    /**
     * Gets the value of the calculationFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationFormula() {
        return calculationFormula;
    }

    /**
     * Sets the value of the calculationFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationFormula(String value) {
        this.calculationFormula = value;
    }

    /**
     * Gets the value of the calculationLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationLabel() {
        return calculationLabel;
    }

    /**
     * Sets the value of the calculationLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationLabel(String value) {
        this.calculationLabel = value;
    }

    /**
     * Gets the value of the calculationUnitTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationUnitTypeDropDownListItemLabel() {
        return calculationUnitTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the calculationUnitTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationUnitTypeDropDownListItemLabel(String value) {
        this.calculationUnitTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the calculationUnitTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCalculationUnitTypeId() {
        return calculationUnitTypeId;
    }

    /**
     * Sets the value of the calculationUnitTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCalculationUnitTypeId(BigInteger value) {
        this.calculationUnitTypeId = value;
    }

    /**
     * Gets the value of the captureMethodDisplayed property.
     * 
     */
    public boolean isCaptureMethodDisplayed() {
        return captureMethodDisplayed;
    }

    /**
     * Sets the value of the captureMethodDisplayed property.
     * 
     */
    public void setCaptureMethodDisplayed(boolean value) {
        this.captureMethodDisplayed = value;
    }

    /**
     * Gets the value of the valueDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalDataDefinitionType.ValueDefinitions }
     *     
     */
    public ClinicalDataDefinitionType.ValueDefinitions getValueDefinitions() {
        return valueDefinitions;
    }

    /**
     * Sets the value of the valueDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalDataDefinitionType.ValueDefinitions }
     *     
     */
    public void setValueDefinitions(ClinicalDataDefinitionType.ValueDefinitions value) {
        this.valueDefinitions = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the creatorId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCreatorId() {
        return creatorId;
    }

    /**
     * Sets the value of the creatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCreatorId(BigInteger value) {
        this.creatorId = value;
    }

    /**
     * Gets the value of the creatorUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorUniversalId() {
        return creatorUniversalId;
    }

    /**
     * Sets the value of the creatorUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorUniversalId(String value) {
        this.creatorUniversalId = value;
    }

    /**
     * Gets the value of the deviceMakerDisplayed property.
     * 
     */
    public boolean isDeviceMakerDisplayed() {
        return deviceMakerDisplayed;
    }

    /**
     * Sets the value of the deviceMakerDisplayed property.
     * 
     */
    public void setDeviceMakerDisplayed(boolean value) {
        this.deviceMakerDisplayed = value;
    }

    /**
     * Gets the value of the deviceModelDisplayed property.
     * 
     */
    public boolean isDeviceModelDisplayed() {
        return deviceModelDisplayed;
    }

    /**
     * Sets the value of the deviceModelDisplayed property.
     * 
     */
    public void setDeviceModelDisplayed(boolean value) {
        this.deviceModelDisplayed = value;
    }

    /**
     * Gets the value of the educationalContentIds property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalDataDefinitionType.EducationalContentIds }
     *     
     */
    public ClinicalDataDefinitionType.EducationalContentIds getEducationalContentIds() {
        return educationalContentIds;
    }

    /**
     * Sets the value of the educationalContentIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalDataDefinitionType.EducationalContentIds }
     *     
     */
    public void setEducationalContentIds(ClinicalDataDefinitionType.EducationalContentIds value) {
        this.educationalContentIds = value;
    }

    /**
     * Gets the value of the educationalContentUniversalIds property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalDataDefinitionType.EducationalContentUniversalIds }
     *     
     */
    public ClinicalDataDefinitionType.EducationalContentUniversalIds getEducationalContentUniversalIds() {
        return educationalContentUniversalIds;
    }

    /**
     * Sets the value of the educationalContentUniversalIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalDataDefinitionType.EducationalContentUniversalIds }
     *     
     */
    public void setEducationalContentUniversalIds(ClinicalDataDefinitionType.EducationalContentUniversalIds value) {
        this.educationalContentUniversalIds = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
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
     * Gets the value of the freeTextNoteDisplayed property.
     * 
     */
    public boolean isFreeTextNoteDisplayed() {
        return freeTextNoteDisplayed;
    }

    /**
     * Sets the value of the freeTextNoteDisplayed property.
     * 
     */
    public void setFreeTextNoteDisplayed(boolean value) {
        this.freeTextNoteDisplayed = value;
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
     * Gets the value of the observerDisplayed property.
     * 
     */
    public boolean isObserverDisplayed() {
        return observerDisplayed;
    }

    /**
     * Sets the value of the observerDisplayed property.
     * 
     */
    public void setObserverDisplayed(boolean value) {
        this.observerDisplayed = value;
    }

    /**
     * Gets the value of the showExplanationDisplayed property.
     * 
     */
    public boolean isShowExplanationDisplayed() {
        return showExplanationDisplayed;
    }

    /**
     * Sets the value of the showExplanationDisplayed property.
     * 
     */
    public void setShowExplanationDisplayed(boolean value) {
        this.showExplanationDisplayed = value;
    }

    /**
     * Gets the value of the sourceDisplayed property.
     * 
     */
    public boolean isSourceDisplayed() {
        return sourceDisplayed;
    }

    /**
     * Sets the value of the sourceDisplayed property.
     * 
     */
    public void setSourceDisplayed(boolean value) {
        this.sourceDisplayed = value;
    }

    /**
     * Gets the value of the typeSubtype1DropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeSubtype1DropDownListItemId() {
        return typeSubtype1DropDownListItemId;
    }

    /**
     * Sets the value of the typeSubtype1DropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeSubtype1DropDownListItemId(BigInteger value) {
        this.typeSubtype1DropDownListItemId = value;
    }

    /**
     * Gets the value of the typeSubtype1DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSubtype1DropDownListItemLabel() {
        return typeSubtype1DropDownListItemLabel;
    }

    /**
     * Sets the value of the typeSubtype1DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSubtype1DropDownListItemLabel(String value) {
        this.typeSubtype1DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the typeSubtype2DropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeSubtype2DropDownListItemId() {
        return typeSubtype2DropDownListItemId;
    }

    /**
     * Sets the value of the typeSubtype2DropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeSubtype2DropDownListItemId(BigInteger value) {
        this.typeSubtype2DropDownListItemId = value;
    }

    /**
     * Gets the value of the typeSubtype2DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSubtype2DropDownListItemLabel() {
        return typeSubtype2DropDownListItemLabel;
    }

    /**
     * Sets the value of the typeSubtype2DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSubtype2DropDownListItemLabel(String value) {
        this.typeSubtype2DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the typeSubtype3DropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeSubtype3DropDownListItemId() {
        return typeSubtype3DropDownListItemId;
    }

    /**
     * Sets the value of the typeSubtype3DropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeSubtype3DropDownListItemId(BigInteger value) {
        this.typeSubtype3DropDownListItemId = value;
    }

    /**
     * Gets the value of the typeSubtype3DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSubtype3DropDownListItemLabel() {
        return typeSubtype3DropDownListItemLabel;
    }

    /**
     * Sets the value of the typeSubtype3DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSubtype3DropDownListItemLabel(String value) {
        this.typeSubtype3DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the typeSubtypeDropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeSubtypeDropDownListItemId() {
        return typeSubtypeDropDownListItemId;
    }

    /**
     * Sets the value of the typeSubtypeDropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeSubtypeDropDownListItemId(BigInteger value) {
        this.typeSubtypeDropDownListItemId = value;
    }

    /**
     * Gets the value of the typeSubtypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSubtypeDropDownListItemLabel() {
        return typeSubtypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the typeSubtypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSubtypeDropDownListItemLabel(String value) {
        this.typeSubtypeDropDownListItemLabel = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="educationalContentId" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
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
        "educationalContentId"
    })
    public static class EducationalContentIds {

        protected List<BigInteger> educationalContentId;

        /**
         * Gets the value of the educationalContentId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the educationalContentId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEducationalContentId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getEducationalContentId() {
            if (educationalContentId == null) {
                educationalContentId = new ArrayList<BigInteger>();
            }
            return this.educationalContentId;
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
     *         &lt;element name="educationalContentUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "educationalContentUniversalId"
    })
    public static class EducationalContentUniversalIds {

        @XmlElement(nillable = true)
        protected List<String> educationalContentUniversalId;

        /**
         * Gets the value of the educationalContentUniversalId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the educationalContentUniversalId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEducationalContentUniversalId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEducationalContentUniversalId() {
            if (educationalContentUniversalId == null) {
                educationalContentUniversalId = new ArrayList<String>();
            }
            return this.educationalContentUniversalId;
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
     *         &lt;element name="valueDefinition" type="{http://www.click4care.com/thinkhealth/6.5/dto}clinicalDataValueDefinition_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "valueDefinition"
    })
    public static class ValueDefinitions {

        protected List<ClinicalDataValueDefinitionType> valueDefinition;

        /**
         * Gets the value of the valueDefinition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the valueDefinition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValueDefinition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClinicalDataValueDefinitionType }
         * 
         * 
         */
        public List<ClinicalDataValueDefinitionType> getValueDefinition() {
            if (valueDefinition == null) {
                valueDefinition = new ArrayList<ClinicalDataValueDefinitionType>();
            }
            return this.valueDefinition;
        }

    }

}
