
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfObjectState;
import com.click4care.thinkhealth.core.dto.TypeOfVisibility;


/**
 * <p>Java class for LetterheadForLetters_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LetterheadForLetters_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="authorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentBottomMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contentContainsImage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contentContainsLetterhead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contentContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="contentDat1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentDat2" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contentHeight" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contentLeftMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentPageSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contentRightMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contentTopMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contentWidth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deactivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ownerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfObjectState" minOccurs="0"/>
 *         &lt;element name="subtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfVisibility" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LetterheadForLetters_type", propOrder = {
    "author",
    "authorUniversalId",
    "c4CId",
    "comment",
    "contentBottomMargin",
    "contentContainsImage",
    "contentContainsLetterhead",
    "contentContent",
    "contentDat1",
    "contentDat2",
    "contentHeight",
    "contentLeftMargin",
    "contentName",
    "contentPageSize",
    "contentRightMargin",
    "contentTopMargin",
    "contentWidth",
    "createdDate",
    "deactivationDate",
    "deletedDate",
    "id",
    "lastActionDate",
    "name",
    "owner",
    "ownerUniversalId",
    "status",
    "subtype1DropDownListItemLabel",
    "subtype2DropDownListItemLabel",
    "subtype3DropDownListItemLabel",
    "typeDropDownListItemLabel",
    "typeSubtype",
    "typeSubtypeUniversalId",
    "universalId",
    "version",
    "visibility"
})
public class LetterheadForLettersType {

    protected BigInteger author;
    protected String authorUniversalId;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected String comment;
    protected BigInteger contentBottomMargin;
    protected Boolean contentContainsImage;
    protected Boolean contentContainsLetterhead;
    protected byte[] contentContent;
    protected String contentDat1;
    protected BigInteger contentDat2;
    protected BigInteger contentHeight;
    protected BigInteger contentLeftMargin;
    protected String contentName;
    protected BigInteger contentPageSize;
    protected BigInteger contentRightMargin;
    protected BigInteger contentTopMargin;
    protected BigInteger contentWidth;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactivationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected String name;
    protected BigInteger owner;
    protected String ownerUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfObjectState status;
    protected String subtype1DropDownListItemLabel;
    protected String subtype2DropDownListItemLabel;
    protected String subtype3DropDownListItemLabel;
    protected String typeDropDownListItemLabel;
    protected BigInteger typeSubtype;
    protected String typeSubtypeUniversalId;
    protected String universalId;
    protected BigInteger version;
    @XmlSchemaType(name = "string")
    protected TypeOfVisibility visibility;

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
     * Gets the value of the contentBottomMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContentBottomMargin() {
        return contentBottomMargin;
    }

    /**
     * Sets the value of the contentBottomMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContentBottomMargin(BigInteger value) {
        this.contentBottomMargin = value;
    }

    /**
     * Gets the value of the contentContainsImage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContentContainsImage() {
        return contentContainsImage;
    }

    /**
     * Sets the value of the contentContainsImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContentContainsImage(Boolean value) {
        this.contentContainsImage = value;
    }

    /**
     * Gets the value of the contentContainsLetterhead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContentContainsLetterhead() {
        return contentContainsLetterhead;
    }

    /**
     * Sets the value of the contentContainsLetterhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContentContainsLetterhead(Boolean value) {
        this.contentContainsLetterhead = value;
    }

    /**
     * Gets the value of the contentContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContentContent() {
        return contentContent;
    }

    /**
     * Sets the value of the contentContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContentContent(byte[] value) {
        this.contentContent = value;
    }

    /**
     * Gets the value of the contentDat1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentDat1() {
        return contentDat1;
    }

    /**
     * Sets the value of the contentDat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentDat1(String value) {
        this.contentDat1 = value;
    }

    /**
     * Gets the value of the contentDat2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContentDat2() {
        return contentDat2;
    }

    /**
     * Sets the value of the contentDat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContentDat2(BigInteger value) {
        this.contentDat2 = value;
    }

    /**
     * Gets the value of the contentHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContentHeight() {
        return contentHeight;
    }

    /**
     * Sets the value of the contentHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContentHeight(BigInteger value) {
        this.contentHeight = value;
    }

    /**
     * Gets the value of the contentLeftMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContentLeftMargin() {
        return contentLeftMargin;
    }

    /**
     * Sets the value of the contentLeftMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContentLeftMargin(BigInteger value) {
        this.contentLeftMargin = value;
    }

    /**
     * Gets the value of the contentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentName() {
        return contentName;
    }

    /**
     * Sets the value of the contentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentName(String value) {
        this.contentName = value;
    }

    /**
     * Gets the value of the contentPageSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContentPageSize() {
        return contentPageSize;
    }

    /**
     * Sets the value of the contentPageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContentPageSize(BigInteger value) {
        this.contentPageSize = value;
    }

    /**
     * Gets the value of the contentRightMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContentRightMargin() {
        return contentRightMargin;
    }

    /**
     * Sets the value of the contentRightMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContentRightMargin(BigInteger value) {
        this.contentRightMargin = value;
    }

    /**
     * Gets the value of the contentTopMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContentTopMargin() {
        return contentTopMargin;
    }

    /**
     * Sets the value of the contentTopMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContentTopMargin(BigInteger value) {
        this.contentTopMargin = value;
    }

    /**
     * Gets the value of the contentWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContentWidth() {
        return contentWidth;
    }

    /**
     * Sets the value of the contentWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContentWidth(BigInteger value) {
        this.contentWidth = value;
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
     * Gets the value of the deactivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeactivationDate() {
        return deactivationDate;
    }

    /**
     * Sets the value of the deactivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeactivationDate(XMLGregorianCalendar value) {
        this.deactivationDate = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfObjectState }
     *     
     */
    public TypeOfObjectState getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfObjectState }
     *     
     */
    public void setStatus(TypeOfObjectState value) {
        this.status = value;
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

}
