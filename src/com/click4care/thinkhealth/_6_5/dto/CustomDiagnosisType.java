
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for custom_diagnosis_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="custom_diagnosis_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}diagnosis_type">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creatorUserId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deactivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstActivatedByUserId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="firstActivatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastActivatedByUserId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActivatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastDeactivatedByUserId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastDeactivatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "custom_diagnosis_type", propOrder = {
    "comment",
    "creatorUserId",
    "deactivationDate",
    "firstActivatedByUserId",
    "firstActivatedDate",
    "lastActivatedByUserId",
    "lastActivatedDate",
    "lastDeactivatedByUserId",
    "lastDeactivatedDate",
    "name",
    "subtype1DropDownListItemLabel",
    "subtype2DropDownListItemLabel",
    "subtype3DropDownListItemLabel",
    "typeDropDownListItemLabel",
    "typeSubtype",
    "typeSubtypeUniversalId"
})
public class CustomDiagnosisType
    extends DiagnosisType
{

    protected String comment;
    protected BigInteger creatorUserId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactivationDate;
    protected BigInteger firstActivatedByUserId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstActivatedDate;
    protected BigInteger lastActivatedByUserId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActivatedDate;
    protected BigInteger lastDeactivatedByUserId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastDeactivatedDate;
    protected String name;
    protected String subtype1DropDownListItemLabel;
    protected String subtype2DropDownListItemLabel;
    protected String subtype3DropDownListItemLabel;
    protected String typeDropDownListItemLabel;
    protected BigInteger typeSubtype;
    protected String typeSubtypeUniversalId;

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
     * Gets the value of the creatorUserId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCreatorUserId() {
        return creatorUserId;
    }

    /**
     * Sets the value of the creatorUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCreatorUserId(BigInteger value) {
        this.creatorUserId = value;
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
     * Gets the value of the firstActivatedByUserId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstActivatedByUserId() {
        return firstActivatedByUserId;
    }

    /**
     * Sets the value of the firstActivatedByUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstActivatedByUserId(BigInteger value) {
        this.firstActivatedByUserId = value;
    }

    /**
     * Gets the value of the firstActivatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstActivatedDate() {
        return firstActivatedDate;
    }

    /**
     * Sets the value of the firstActivatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstActivatedDate(XMLGregorianCalendar value) {
        this.firstActivatedDate = value;
    }

    /**
     * Gets the value of the lastActivatedByUserId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastActivatedByUserId() {
        return lastActivatedByUserId;
    }

    /**
     * Sets the value of the lastActivatedByUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastActivatedByUserId(BigInteger value) {
        this.lastActivatedByUserId = value;
    }

    /**
     * Gets the value of the lastActivatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastActivatedDate() {
        return lastActivatedDate;
    }

    /**
     * Sets the value of the lastActivatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastActivatedDate(XMLGregorianCalendar value) {
        this.lastActivatedDate = value;
    }

    /**
     * Gets the value of the lastDeactivatedByUserId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastDeactivatedByUserId() {
        return lastDeactivatedByUserId;
    }

    /**
     * Sets the value of the lastDeactivatedByUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastDeactivatedByUserId(BigInteger value) {
        this.lastDeactivatedByUserId = value;
    }

    /**
     * Gets the value of the lastDeactivatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDeactivatedDate() {
        return lastDeactivatedDate;
    }

    /**
     * Sets the value of the lastDeactivatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDeactivatedDate(XMLGregorianCalendar value) {
        this.lastDeactivatedDate = value;
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

}
