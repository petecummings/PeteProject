
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfVisibility;


/**
 * <p>Java class for automation_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="automation_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="authorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configuredGroup" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="configuredGroupUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="originalCreatorId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="originalCreatorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supressContraindicated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supressRedundant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "automation_type", propOrder = {
    "author",
    "authorUniversalId",
    "c4CId",
    "configuredGroup",
    "configuredGroupUniversalId",
    "createdDate",
    "deletedDate",
    "id",
    "lastActionDate",
    "originalCreatorId",
    "originalCreatorUniversalId",
    "supressContraindicated",
    "supressRedundant",
    "universalId",
    "version",
    "visibility"
})
public class AutomationType {

    protected BigInteger author;
    protected String authorUniversalId;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected BigInteger configuredGroup;
    protected String configuredGroupUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected BigInteger originalCreatorId;
    protected String originalCreatorUniversalId;
    protected Boolean supressContraindicated;
    protected Boolean supressRedundant;
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
     * Gets the value of the configuredGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConfiguredGroup() {
        return configuredGroup;
    }

    /**
     * Sets the value of the configuredGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConfiguredGroup(BigInteger value) {
        this.configuredGroup = value;
    }

    /**
     * Gets the value of the configuredGroupUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguredGroupUniversalId() {
        return configuredGroupUniversalId;
    }

    /**
     * Sets the value of the configuredGroupUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguredGroupUniversalId(String value) {
        this.configuredGroupUniversalId = value;
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
     * Gets the value of the originalCreatorUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCreatorUniversalId() {
        return originalCreatorUniversalId;
    }

    /**
     * Sets the value of the originalCreatorUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCreatorUniversalId(String value) {
        this.originalCreatorUniversalId = value;
    }

    /**
     * Gets the value of the supressContraindicated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupressContraindicated() {
        return supressContraindicated;
    }

    /**
     * Sets the value of the supressContraindicated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupressContraindicated(Boolean value) {
        this.supressContraindicated = value;
    }

    /**
     * Gets the value of the supressRedundant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupressRedundant() {
        return supressRedundant;
    }

    /**
     * Sets the value of the supressRedundant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupressRedundant(Boolean value) {
        this.supressRedundant = value;
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
