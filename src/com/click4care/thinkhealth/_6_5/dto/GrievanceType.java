
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for grievance_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="grievance_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="callDuration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="callRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="errorComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grievanceSubType1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grievanceSubType2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grievanceSubType3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grievanceType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="grievanceTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grievanceTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grvcClinicalDataEntryId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="markedAsGrievanceByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markedGrievanceBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="markedResolvedBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="markedResolvedByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberDialed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedProvider" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="relatedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resolutionComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resolvedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "grievance_type", propOrder = {
    "c4CId",
    "callDateTime",
    "callDuration",
    "callRecipient",
    "caller",
    "createdDate",
    "deletedDate",
    "errorComment",
    "grievanceSubType1DropDownListItemLabel",
    "grievanceSubType2DropDownListItemLabel",
    "grievanceSubType3DropDownListItemLabel",
    "grievanceType",
    "grievanceTypeDropDownListItemLabel",
    "grievanceTypeUniversalId",
    "grvcClinicalDataEntryId",
    "id",
    "lastActionDate",
    "markedAsGrievanceByUniversalId",
    "markedGrievanceBy",
    "markedResolvedBy",
    "markedResolvedByUniversalId",
    "numberDialed",
    "relatedProvider",
    "relatedProviderUniversalId",
    "resolutionComment",
    "resolvedDate",
    "text",
    "universalId",
    "version"
})
@XmlSeeAlso({
    MemberGrievanceType.class,
    UmeventGrievanceType.class,
    CaseGrievanceType.class,
    ProviderGrievanceType.class
})
public abstract class GrievanceType {

    @XmlElement(name = "c4cId")
    protected String c4CId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callDateTime;
    protected BigInteger callDuration;
    protected String callRecipient;
    protected String caller;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected String errorComment;
    protected String grievanceSubType1DropDownListItemLabel;
    protected String grievanceSubType2DropDownListItemLabel;
    protected String grievanceSubType3DropDownListItemLabel;
    protected BigInteger grievanceType;
    protected String grievanceTypeDropDownListItemLabel;
    protected String grievanceTypeUniversalId;
    protected BigInteger grvcClinicalDataEntryId;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected String markedAsGrievanceByUniversalId;
    protected BigInteger markedGrievanceBy;
    protected BigInteger markedResolvedBy;
    protected String markedResolvedByUniversalId;
    protected String numberDialed;
    protected BigInteger relatedProvider;
    protected String relatedProviderUniversalId;
    protected String resolutionComment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resolvedDate;
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
     * Gets the value of the grievanceSubType1DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrievanceSubType1DropDownListItemLabel() {
        return grievanceSubType1DropDownListItemLabel;
    }

    /**
     * Sets the value of the grievanceSubType1DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrievanceSubType1DropDownListItemLabel(String value) {
        this.grievanceSubType1DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the grievanceSubType2DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrievanceSubType2DropDownListItemLabel() {
        return grievanceSubType2DropDownListItemLabel;
    }

    /**
     * Sets the value of the grievanceSubType2DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrievanceSubType2DropDownListItemLabel(String value) {
        this.grievanceSubType2DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the grievanceSubType3DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrievanceSubType3DropDownListItemLabel() {
        return grievanceSubType3DropDownListItemLabel;
    }

    /**
     * Sets the value of the grievanceSubType3DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrievanceSubType3DropDownListItemLabel(String value) {
        this.grievanceSubType3DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the grievanceType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGrievanceType() {
        return grievanceType;
    }

    /**
     * Sets the value of the grievanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGrievanceType(BigInteger value) {
        this.grievanceType = value;
    }

    /**
     * Gets the value of the grievanceTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrievanceTypeDropDownListItemLabel() {
        return grievanceTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the grievanceTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrievanceTypeDropDownListItemLabel(String value) {
        this.grievanceTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the grievanceTypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrievanceTypeUniversalId() {
        return grievanceTypeUniversalId;
    }

    /**
     * Sets the value of the grievanceTypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrievanceTypeUniversalId(String value) {
        this.grievanceTypeUniversalId = value;
    }

    /**
     * Gets the value of the grvcClinicalDataEntryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGrvcClinicalDataEntryId() {
        return grvcClinicalDataEntryId;
    }

    /**
     * Sets the value of the grvcClinicalDataEntryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGrvcClinicalDataEntryId(BigInteger value) {
        this.grvcClinicalDataEntryId = value;
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
     * Gets the value of the markedAsGrievanceByUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkedAsGrievanceByUniversalId() {
        return markedAsGrievanceByUniversalId;
    }

    /**
     * Sets the value of the markedAsGrievanceByUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkedAsGrievanceByUniversalId(String value) {
        this.markedAsGrievanceByUniversalId = value;
    }

    /**
     * Gets the value of the markedGrievanceBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarkedGrievanceBy() {
        return markedGrievanceBy;
    }

    /**
     * Sets the value of the markedGrievanceBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarkedGrievanceBy(BigInteger value) {
        this.markedGrievanceBy = value;
    }

    /**
     * Gets the value of the markedResolvedBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarkedResolvedBy() {
        return markedResolvedBy;
    }

    /**
     * Sets the value of the markedResolvedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarkedResolvedBy(BigInteger value) {
        this.markedResolvedBy = value;
    }

    /**
     * Gets the value of the markedResolvedByUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkedResolvedByUniversalId() {
        return markedResolvedByUniversalId;
    }

    /**
     * Sets the value of the markedResolvedByUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkedResolvedByUniversalId(String value) {
        this.markedResolvedByUniversalId = value;
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
     * Gets the value of the relatedProvider property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRelatedProvider() {
        return relatedProvider;
    }

    /**
     * Sets the value of the relatedProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRelatedProvider(BigInteger value) {
        this.relatedProvider = value;
    }

    /**
     * Gets the value of the relatedProviderUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedProviderUniversalId() {
        return relatedProviderUniversalId;
    }

    /**
     * Sets the value of the relatedProviderUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedProviderUniversalId(String value) {
        this.relatedProviderUniversalId = value;
    }

    /**
     * Gets the value of the resolutionComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolutionComment() {
        return resolutionComment;
    }

    /**
     * Sets the value of the resolutionComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolutionComment(String value) {
        this.resolutionComment = value;
    }

    /**
     * Gets the value of the resolvedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolvedDate() {
        return resolvedDate;
    }

    /**
     * Sets the value of the resolvedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolvedDate(XMLGregorianCalendar value) {
        this.resolvedDate = value;
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
