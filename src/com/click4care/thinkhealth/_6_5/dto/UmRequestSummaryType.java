
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for umRequest_summary_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="umRequest_summary_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}um_summary_type">
 *       &lt;sequence>
 *         &lt;element name="denialReason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="denialReasonDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denialReasonDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denialReasonUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstSubmittedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstSubmittedBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="firstSubmittedByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastReview" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastRoutedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastRoutedTo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastRoutedToUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastSubmittedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastSubmittedBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastSubmittedByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="okAfterDeadline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ownerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientTracking" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="rejectionComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectionReason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="rejectionReasonDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectionReasonDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectionReasonUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "umRequest_summary_type", propOrder = {
    "denialReason",
    "denialReasonDropDownListItemLabel",
    "denialReasonDropDownListName",
    "denialReasonUniversalId",
    "firstSubmittedAt",
    "firstSubmittedBy",
    "firstSubmittedByUniversalId",
    "lastReview",
    "lastRoutedAt",
    "lastRoutedTo",
    "lastRoutedToUniversalId",
    "lastSubmittedAt",
    "lastSubmittedBy",
    "lastSubmittedByUniversalId",
    "okAfterDeadline",
    "owner",
    "ownerUniversalId",
    "recipientTracking",
    "rejectionComment",
    "rejectionReason",
    "rejectionReasonDropDownListItemLabel",
    "rejectionReasonDropDownListName",
    "rejectionReasonUniversalId"
})
@XmlSeeAlso({
    UmRequestType.class
})
public class UmRequestSummaryType
    extends UmSummaryType
{

    protected BigInteger denialReason;
    protected String denialReasonDropDownListItemLabel;
    protected String denialReasonDropDownListName;
    protected String denialReasonUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstSubmittedAt;
    protected BigInteger firstSubmittedBy;
    protected String firstSubmittedByUniversalId;
    protected BigInteger lastReview;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastRoutedAt;
    protected BigInteger lastRoutedTo;
    protected String lastRoutedToUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSubmittedAt;
    protected BigInteger lastSubmittedBy;
    protected String lastSubmittedByUniversalId;
    protected Boolean okAfterDeadline;
    protected BigInteger owner;
    protected String ownerUniversalId;
    protected BigInteger recipientTracking;
    protected String rejectionComment;
    protected BigInteger rejectionReason;
    protected String rejectionReasonDropDownListItemLabel;
    protected String rejectionReasonDropDownListName;
    protected String rejectionReasonUniversalId;

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
     * Gets the value of the firstSubmittedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstSubmittedAt() {
        return firstSubmittedAt;
    }

    /**
     * Sets the value of the firstSubmittedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstSubmittedAt(XMLGregorianCalendar value) {
        this.firstSubmittedAt = value;
    }

    /**
     * Gets the value of the firstSubmittedBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstSubmittedBy() {
        return firstSubmittedBy;
    }

    /**
     * Sets the value of the firstSubmittedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstSubmittedBy(BigInteger value) {
        this.firstSubmittedBy = value;
    }

    /**
     * Gets the value of the firstSubmittedByUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstSubmittedByUniversalId() {
        return firstSubmittedByUniversalId;
    }

    /**
     * Sets the value of the firstSubmittedByUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstSubmittedByUniversalId(String value) {
        this.firstSubmittedByUniversalId = value;
    }

    /**
     * Gets the value of the lastReview property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastReview() {
        return lastReview;
    }

    /**
     * Sets the value of the lastReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastReview(BigInteger value) {
        this.lastReview = value;
    }

    /**
     * Gets the value of the lastRoutedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRoutedAt() {
        return lastRoutedAt;
    }

    /**
     * Sets the value of the lastRoutedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRoutedAt(XMLGregorianCalendar value) {
        this.lastRoutedAt = value;
    }

    /**
     * Gets the value of the lastRoutedTo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastRoutedTo() {
        return lastRoutedTo;
    }

    /**
     * Sets the value of the lastRoutedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastRoutedTo(BigInteger value) {
        this.lastRoutedTo = value;
    }

    /**
     * Gets the value of the lastRoutedToUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRoutedToUniversalId() {
        return lastRoutedToUniversalId;
    }

    /**
     * Sets the value of the lastRoutedToUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRoutedToUniversalId(String value) {
        this.lastRoutedToUniversalId = value;
    }

    /**
     * Gets the value of the lastSubmittedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSubmittedAt() {
        return lastSubmittedAt;
    }

    /**
     * Sets the value of the lastSubmittedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSubmittedAt(XMLGregorianCalendar value) {
        this.lastSubmittedAt = value;
    }

    /**
     * Gets the value of the lastSubmittedBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastSubmittedBy() {
        return lastSubmittedBy;
    }

    /**
     * Sets the value of the lastSubmittedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastSubmittedBy(BigInteger value) {
        this.lastSubmittedBy = value;
    }

    /**
     * Gets the value of the lastSubmittedByUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSubmittedByUniversalId() {
        return lastSubmittedByUniversalId;
    }

    /**
     * Sets the value of the lastSubmittedByUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSubmittedByUniversalId(String value) {
        this.lastSubmittedByUniversalId = value;
    }

    /**
     * Gets the value of the okAfterDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOkAfterDeadline() {
        return okAfterDeadline;
    }

    /**
     * Sets the value of the okAfterDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOkAfterDeadline(Boolean value) {
        this.okAfterDeadline = value;
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
     * Gets the value of the recipientTracking property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecipientTracking() {
        return recipientTracking;
    }

    /**
     * Sets the value of the recipientTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecipientTracking(BigInteger value) {
        this.recipientTracking = value;
    }

    /**
     * Gets the value of the rejectionComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionComment() {
        return rejectionComment;
    }

    /**
     * Sets the value of the rejectionComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionComment(String value) {
        this.rejectionComment = value;
    }

    /**
     * Gets the value of the rejectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRejectionReason() {
        return rejectionReason;
    }

    /**
     * Sets the value of the rejectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRejectionReason(BigInteger value) {
        this.rejectionReason = value;
    }

    /**
     * Gets the value of the rejectionReasonDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionReasonDropDownListItemLabel() {
        return rejectionReasonDropDownListItemLabel;
    }

    /**
     * Sets the value of the rejectionReasonDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionReasonDropDownListItemLabel(String value) {
        this.rejectionReasonDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the rejectionReasonDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionReasonDropDownListName() {
        return rejectionReasonDropDownListName;
    }

    /**
     * Sets the value of the rejectionReasonDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionReasonDropDownListName(String value) {
        this.rejectionReasonDropDownListName = value;
    }

    /**
     * Gets the value of the rejectionReasonUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionReasonUniversalId() {
        return rejectionReasonUniversalId;
    }

    /**
     * Sets the value of the rejectionReasonUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionReasonUniversalId(String value) {
        this.rejectionReasonUniversalId = value;
    }

}
