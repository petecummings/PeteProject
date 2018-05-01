
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for notice_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notice_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="affiliatedCareManagementId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="affiliatedCareManagementUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliatedMemberId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="affiliatedMemberUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliatedUmEventId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="affiliatedUmEventRequestId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="affiliatedUmEventRequestUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliatedUmEventUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstSentToId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="firstSentToUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastSentToId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastSentToUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sentAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sentById" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sentByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "notice_type", propOrder = {
    "affiliatedCareManagementId",
    "affiliatedCareManagementUniversalId",
    "affiliatedMemberId",
    "affiliatedMemberUniversalId",
    "affiliatedUmEventId",
    "affiliatedUmEventRequestId",
    "affiliatedUmEventRequestUniversalId",
    "affiliatedUmEventUniversalId",
    "c4CId",
    "createdDate",
    "deletedDate",
    "firstSentToId",
    "firstSentToUniversalId",
    "id",
    "lastActionDate",
    "lastSentToId",
    "lastSentToUniversalId",
    "receivedAt",
    "sentAt",
    "sentById",
    "sentByUniversalId",
    "subtype1DropDownListItemLabel",
    "subtype2DropDownListItemLabel",
    "subtype3DropDownListItemLabel",
    "text",
    "type",
    "typeDropDownListItemLabel",
    "typeSubtype",
    "typeSubtypeUniversalId",
    "typeUniversalId",
    "universalId",
    "version"
})
public class NoticeType {

    protected BigInteger affiliatedCareManagementId;
    protected String affiliatedCareManagementUniversalId;
    protected BigInteger affiliatedMemberId;
    protected String affiliatedMemberUniversalId;
    protected BigInteger affiliatedUmEventId;
    protected BigInteger affiliatedUmEventRequestId;
    protected String affiliatedUmEventRequestUniversalId;
    protected String affiliatedUmEventUniversalId;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected BigInteger firstSentToId;
    protected String firstSentToUniversalId;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected BigInteger lastSentToId;
    protected String lastSentToUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedAt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentAt;
    protected BigInteger sentById;
    protected String sentByUniversalId;
    protected String subtype1DropDownListItemLabel;
    protected String subtype2DropDownListItemLabel;
    protected String subtype3DropDownListItemLabel;
    protected String text;
    protected BigInteger type;
    protected String typeDropDownListItemLabel;
    protected BigInteger typeSubtype;
    protected String typeSubtypeUniversalId;
    protected String typeUniversalId;
    protected String universalId;
    protected BigInteger version;

    /**
     * Gets the value of the affiliatedCareManagementId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliatedCareManagementId() {
        return affiliatedCareManagementId;
    }

    /**
     * Sets the value of the affiliatedCareManagementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliatedCareManagementId(BigInteger value) {
        this.affiliatedCareManagementId = value;
    }

    /**
     * Gets the value of the affiliatedCareManagementUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliatedCareManagementUniversalId() {
        return affiliatedCareManagementUniversalId;
    }

    /**
     * Sets the value of the affiliatedCareManagementUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliatedCareManagementUniversalId(String value) {
        this.affiliatedCareManagementUniversalId = value;
    }

    /**
     * Gets the value of the affiliatedMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliatedMemberId() {
        return affiliatedMemberId;
    }

    /**
     * Sets the value of the affiliatedMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliatedMemberId(BigInteger value) {
        this.affiliatedMemberId = value;
    }

    /**
     * Gets the value of the affiliatedMemberUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliatedMemberUniversalId() {
        return affiliatedMemberUniversalId;
    }

    /**
     * Sets the value of the affiliatedMemberUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliatedMemberUniversalId(String value) {
        this.affiliatedMemberUniversalId = value;
    }

    /**
     * Gets the value of the affiliatedUmEventId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliatedUmEventId() {
        return affiliatedUmEventId;
    }

    /**
     * Sets the value of the affiliatedUmEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliatedUmEventId(BigInteger value) {
        this.affiliatedUmEventId = value;
    }

    /**
     * Gets the value of the affiliatedUmEventRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliatedUmEventRequestId() {
        return affiliatedUmEventRequestId;
    }

    /**
     * Sets the value of the affiliatedUmEventRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliatedUmEventRequestId(BigInteger value) {
        this.affiliatedUmEventRequestId = value;
    }

    /**
     * Gets the value of the affiliatedUmEventRequestUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliatedUmEventRequestUniversalId() {
        return affiliatedUmEventRequestUniversalId;
    }

    /**
     * Sets the value of the affiliatedUmEventRequestUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliatedUmEventRequestUniversalId(String value) {
        this.affiliatedUmEventRequestUniversalId = value;
    }

    /**
     * Gets the value of the affiliatedUmEventUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliatedUmEventUniversalId() {
        return affiliatedUmEventUniversalId;
    }

    /**
     * Sets the value of the affiliatedUmEventUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliatedUmEventUniversalId(String value) {
        this.affiliatedUmEventUniversalId = value;
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
     * Gets the value of the firstSentToId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstSentToId() {
        return firstSentToId;
    }

    /**
     * Sets the value of the firstSentToId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstSentToId(BigInteger value) {
        this.firstSentToId = value;
    }

    /**
     * Gets the value of the firstSentToUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstSentToUniversalId() {
        return firstSentToUniversalId;
    }

    /**
     * Sets the value of the firstSentToUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstSentToUniversalId(String value) {
        this.firstSentToUniversalId = value;
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
     * Gets the value of the lastSentToId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastSentToId() {
        return lastSentToId;
    }

    /**
     * Sets the value of the lastSentToId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastSentToId(BigInteger value) {
        this.lastSentToId = value;
    }

    /**
     * Gets the value of the lastSentToUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSentToUniversalId() {
        return lastSentToUniversalId;
    }

    /**
     * Sets the value of the lastSentToUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSentToUniversalId(String value) {
        this.lastSentToUniversalId = value;
    }

    /**
     * Gets the value of the receivedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedAt() {
        return receivedAt;
    }

    /**
     * Sets the value of the receivedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedAt(XMLGregorianCalendar value) {
        this.receivedAt = value;
    }

    /**
     * Gets the value of the sentAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentAt() {
        return sentAt;
    }

    /**
     * Sets the value of the sentAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentAt(XMLGregorianCalendar value) {
        this.sentAt = value;
    }

    /**
     * Gets the value of the sentById property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSentById() {
        return sentById;
    }

    /**
     * Sets the value of the sentById property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSentById(BigInteger value) {
        this.sentById = value;
    }

    /**
     * Gets the value of the sentByUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentByUniversalId() {
        return sentByUniversalId;
    }

    /**
     * Sets the value of the sentByUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentByUniversalId(String value) {
        this.sentByUniversalId = value;
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
     * Gets the value of the typeSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeSubtype() {
        return typeSubtype;
    }

    /**
     * Sets the value of the typeSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeSubtype(BigInteger value) {
        this.typeSubtype = value;
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
