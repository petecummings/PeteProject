
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
import com.click4care.thinkhealth.core.dto.TypeOfClinicalDataEntryContext;


/**
 * <p>Java class for clinicalDataEntry_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clinicalDataEntry_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMProjectId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CMProjectRequestId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CMProjectRequestUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMProjectUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="captureMethodDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="captureMethodId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="captureMethodUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="caseRequestId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="caseRequestUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clinicalDataDefinitionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="context" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfClinicalDataEntryContext" minOccurs="0"/>
 *         &lt;element name="contextId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="creatorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceMakerDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceMakerId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deviceMakerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceModelDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceModelId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deviceModelUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="errorComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="freeTextNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="measureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="memberId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="memberUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observerDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observerId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="observerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sourceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="umEventId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="umEventRequestId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="umEventRequestUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="umEventUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="values" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.click4care.com/thinkhealth/6.5/dto}clinicalDataValue_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clinicalDataEntry_type", propOrder = {
    "cmProjectId",
    "cmProjectRequestId",
    "cmProjectRequestUniversalId",
    "cmProjectUniversalId",
    "captureMethodDropDownListItemLabel",
    "captureMethodId",
    "captureMethodUniversalId",
    "caseId",
    "caseRequestId",
    "caseRequestUniversalId",
    "caseUniversalId",
    "clinicalDataDefinitionName",
    "context",
    "contextId",
    "creatorId",
    "creatorUniversalId",
    "deviceMakerDropDownListItemLabel",
    "deviceMakerId",
    "deviceMakerUniversalId",
    "deviceModelDropDownListItemLabel",
    "deviceModelId",
    "deviceModelUniversalId",
    "enabled",
    "entryDate",
    "errorComment",
    "errorFlag",
    "freeTextNote",
    "id",
    "lastModifiedDate",
    "measureDate",
    "memberId",
    "memberUniversalId",
    "observerDropDownListItemLabel",
    "observerId",
    "observerUniversalId",
    "owner",
    "sourceDropDownListItemLabel",
    "sourceId",
    "sourceUniversalId",
    "umEventId",
    "umEventRequestId",
    "umEventRequestUniversalId",
    "umEventUniversalId",
    "universalId",
    "values"
})
public class ClinicalDataEntryType {

    @XmlElement(name = "CMProjectId")
    protected BigInteger cmProjectId;
    @XmlElement(name = "CMProjectRequestId")
    protected BigInteger cmProjectRequestId;
    @XmlElement(name = "CMProjectRequestUniversalId")
    protected String cmProjectRequestUniversalId;
    @XmlElement(name = "CMProjectUniversalId")
    protected String cmProjectUniversalId;
    protected String captureMethodDropDownListItemLabel;
    protected BigInteger captureMethodId;
    protected String captureMethodUniversalId;
    protected BigInteger caseId;
    protected BigInteger caseRequestId;
    protected String caseRequestUniversalId;
    protected String caseUniversalId;
    @XmlElement(required = true)
    protected String clinicalDataDefinitionName;
    @XmlSchemaType(name = "string")
    protected TypeOfClinicalDataEntryContext context;
    protected BigInteger contextId;
    protected BigInteger creatorId;
    protected String creatorUniversalId;
    protected String deviceMakerDropDownListItemLabel;
    protected BigInteger deviceMakerId;
    protected String deviceMakerUniversalId;
    protected String deviceModelDropDownListItemLabel;
    protected BigInteger deviceModelId;
    protected String deviceModelUniversalId;
    protected boolean enabled;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entryDate;
    protected String errorComment;
    protected boolean errorFlag;
    protected String freeTextNote;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measureDate;
    protected BigInteger memberId;
    protected String memberUniversalId;
    protected String observerDropDownListItemLabel;
    protected BigInteger observerId;
    protected String observerUniversalId;
    protected String owner;
    protected String sourceDropDownListItemLabel;
    protected BigInteger sourceId;
    protected String sourceUniversalId;
    protected BigInteger umEventId;
    protected BigInteger umEventRequestId;
    protected String umEventRequestUniversalId;
    protected String umEventUniversalId;
    protected String universalId;
    protected ClinicalDataEntryType.Values values;

    /**
     * Gets the value of the cmProjectId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCMProjectId() {
        return cmProjectId;
    }

    /**
     * Sets the value of the cmProjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCMProjectId(BigInteger value) {
        this.cmProjectId = value;
    }

    /**
     * Gets the value of the cmProjectRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCMProjectRequestId() {
        return cmProjectRequestId;
    }

    /**
     * Sets the value of the cmProjectRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCMProjectRequestId(BigInteger value) {
        this.cmProjectRequestId = value;
    }

    /**
     * Gets the value of the cmProjectRequestUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMProjectRequestUniversalId() {
        return cmProjectRequestUniversalId;
    }

    /**
     * Sets the value of the cmProjectRequestUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMProjectRequestUniversalId(String value) {
        this.cmProjectRequestUniversalId = value;
    }

    /**
     * Gets the value of the cmProjectUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMProjectUniversalId() {
        return cmProjectUniversalId;
    }

    /**
     * Sets the value of the cmProjectUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMProjectUniversalId(String value) {
        this.cmProjectUniversalId = value;
    }

    /**
     * Gets the value of the captureMethodDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureMethodDropDownListItemLabel() {
        return captureMethodDropDownListItemLabel;
    }

    /**
     * Sets the value of the captureMethodDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureMethodDropDownListItemLabel(String value) {
        this.captureMethodDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the captureMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCaptureMethodId() {
        return captureMethodId;
    }

    /**
     * Sets the value of the captureMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCaptureMethodId(BigInteger value) {
        this.captureMethodId = value;
    }

    /**
     * Gets the value of the captureMethodUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureMethodUniversalId() {
        return captureMethodUniversalId;
    }

    /**
     * Sets the value of the captureMethodUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureMethodUniversalId(String value) {
        this.captureMethodUniversalId = value;
    }

    /**
     * Gets the value of the caseId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCaseId() {
        return caseId;
    }

    /**
     * Sets the value of the caseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCaseId(BigInteger value) {
        this.caseId = value;
    }

    /**
     * Gets the value of the caseRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCaseRequestId() {
        return caseRequestId;
    }

    /**
     * Sets the value of the caseRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCaseRequestId(BigInteger value) {
        this.caseRequestId = value;
    }

    /**
     * Gets the value of the caseRequestUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseRequestUniversalId() {
        return caseRequestUniversalId;
    }

    /**
     * Sets the value of the caseRequestUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseRequestUniversalId(String value) {
        this.caseRequestUniversalId = value;
    }

    /**
     * Gets the value of the caseUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseUniversalId() {
        return caseUniversalId;
    }

    /**
     * Sets the value of the caseUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseUniversalId(String value) {
        this.caseUniversalId = value;
    }

    /**
     * Gets the value of the clinicalDataDefinitionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicalDataDefinitionName() {
        return clinicalDataDefinitionName;
    }

    /**
     * Sets the value of the clinicalDataDefinitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicalDataDefinitionName(String value) {
        this.clinicalDataDefinitionName = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfClinicalDataEntryContext }
     *     
     */
    public TypeOfClinicalDataEntryContext getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfClinicalDataEntryContext }
     *     
     */
    public void setContext(TypeOfClinicalDataEntryContext value) {
        this.context = value;
    }

    /**
     * Gets the value of the contextId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContextId() {
        return contextId;
    }

    /**
     * Sets the value of the contextId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContextId(BigInteger value) {
        this.contextId = value;
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
     * Gets the value of the deviceMakerDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceMakerDropDownListItemLabel() {
        return deviceMakerDropDownListItemLabel;
    }

    /**
     * Sets the value of the deviceMakerDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceMakerDropDownListItemLabel(String value) {
        this.deviceMakerDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the deviceMakerId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeviceMakerId() {
        return deviceMakerId;
    }

    /**
     * Sets the value of the deviceMakerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeviceMakerId(BigInteger value) {
        this.deviceMakerId = value;
    }

    /**
     * Gets the value of the deviceMakerUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceMakerUniversalId() {
        return deviceMakerUniversalId;
    }

    /**
     * Sets the value of the deviceMakerUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceMakerUniversalId(String value) {
        this.deviceMakerUniversalId = value;
    }

    /**
     * Gets the value of the deviceModelDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceModelDropDownListItemLabel() {
        return deviceModelDropDownListItemLabel;
    }

    /**
     * Sets the value of the deviceModelDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceModelDropDownListItemLabel(String value) {
        this.deviceModelDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the deviceModelId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeviceModelId() {
        return deviceModelId;
    }

    /**
     * Sets the value of the deviceModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeviceModelId(BigInteger value) {
        this.deviceModelId = value;
    }

    /**
     * Gets the value of the deviceModelUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceModelUniversalId() {
        return deviceModelUniversalId;
    }

    /**
     * Sets the value of the deviceModelUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceModelUniversalId(String value) {
        this.deviceModelUniversalId = value;
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
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
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
     * Gets the value of the errorFlag property.
     * 
     */
    public boolean isErrorFlag() {
        return errorFlag;
    }

    /**
     * Sets the value of the errorFlag property.
     * 
     */
    public void setErrorFlag(boolean value) {
        this.errorFlag = value;
    }

    /**
     * Gets the value of the freeTextNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeTextNote() {
        return freeTextNote;
    }

    /**
     * Sets the value of the freeTextNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeTextNote(String value) {
        this.freeTextNote = value;
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
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the measureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasureDate() {
        return measureDate;
    }

    /**
     * Sets the value of the measureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasureDate(XMLGregorianCalendar value) {
        this.measureDate = value;
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
     * Gets the value of the observerDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObserverDropDownListItemLabel() {
        return observerDropDownListItemLabel;
    }

    /**
     * Sets the value of the observerDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObserverDropDownListItemLabel(String value) {
        this.observerDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the observerId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getObserverId() {
        return observerId;
    }

    /**
     * Sets the value of the observerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setObserverId(BigInteger value) {
        this.observerId = value;
    }

    /**
     * Gets the value of the observerUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObserverUniversalId() {
        return observerUniversalId;
    }

    /**
     * Sets the value of the observerUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObserverUniversalId(String value) {
        this.observerUniversalId = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
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
     * Gets the value of the umEventRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUmEventRequestId() {
        return umEventRequestId;
    }

    /**
     * Sets the value of the umEventRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmEventRequestId(BigInteger value) {
        this.umEventRequestId = value;
    }

    /**
     * Gets the value of the umEventRequestUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmEventRequestUniversalId() {
        return umEventRequestUniversalId;
    }

    /**
     * Sets the value of the umEventRequestUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmEventRequestUniversalId(String value) {
        this.umEventRequestUniversalId = value;
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
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalDataEntryType.Values }
     *     
     */
    public ClinicalDataEntryType.Values getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalDataEntryType.Values }
     *     
     */
    public void setValues(ClinicalDataEntryType.Values value) {
        this.values = value;
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
     *         &lt;element name="value" type="{http://www.click4care.com/thinkhealth/6.5/dto}clinicalDataValue_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "value"
    })
    public static class Values {

        protected List<ClinicalDataValueType> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClinicalDataValueType }
         * 
         * 
         */
        public List<ClinicalDataValueType> getValue() {
            if (value == null) {
                value = new ArrayList<ClinicalDataValueType>();
            }
            return this.value;
        }

    }

}
