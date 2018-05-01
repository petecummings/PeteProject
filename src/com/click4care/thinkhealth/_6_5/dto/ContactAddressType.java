
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
 * <p>Java class for contact_address_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contact_address_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="authorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityOrTownId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="cityOrTownString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="countyId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="countyString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="stateString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfVisibility" minOccurs="0"/>
 *         &lt;element name="zipCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contact_address_type", propOrder = {
    "author",
    "authorUniversalId",
    "c4CId",
    "cityOrTownId",
    "cityOrTownString",
    "companyName",
    "countryId",
    "countyId",
    "countyString",
    "createdDate",
    "deletedDate",
    "description",
    "fax",
    "id",
    "lastActionDate",
    "phone",
    "phoneExtension",
    "stateId",
    "stateString",
    "streetAddress1",
    "streetAddress2",
    "streetAddress3",
    "title",
    "universalId",
    "version",
    "visibility",
    "zipCode4",
    "zipCode5"
})
public class ContactAddressType {

    protected BigInteger author;
    protected String authorUniversalId;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected BigInteger cityOrTownId;
    protected String cityOrTownString;
    protected String companyName;
    protected BigInteger countryId;
    protected BigInteger countyId;
    protected String countyString;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected String description;
    protected String fax;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected String phone;
    protected String phoneExtension;
    protected BigInteger stateId;
    protected String stateString;
    protected String streetAddress1;
    protected String streetAddress2;
    protected String streetAddress3;
    protected String title;
    protected String universalId;
    protected BigInteger version;
    @XmlSchemaType(name = "string")
    protected TypeOfVisibility visibility;
    protected String zipCode4;
    protected String zipCode5;

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
     * Gets the value of the cityOrTownId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCityOrTownId() {
        return cityOrTownId;
    }

    /**
     * Sets the value of the cityOrTownId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCityOrTownId(BigInteger value) {
        this.cityOrTownId = value;
    }

    /**
     * Gets the value of the cityOrTownString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOrTownString() {
        return cityOrTownString;
    }

    /**
     * Sets the value of the cityOrTownString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOrTownString(String value) {
        this.cityOrTownString = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountryId(BigInteger value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the countyId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountyId() {
        return countyId;
    }

    /**
     * Sets the value of the countyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountyId(BigInteger value) {
        this.countyId = value;
    }

    /**
     * Gets the value of the countyString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyString() {
        return countyString;
    }

    /**
     * Sets the value of the countyString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyString(String value) {
        this.countyString = value;
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
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
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
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the phoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneExtension() {
        return phoneExtension;
    }

    /**
     * Sets the value of the phoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneExtension(String value) {
        this.phoneExtension = value;
    }

    /**
     * Gets the value of the stateId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStateId() {
        return stateId;
    }

    /**
     * Sets the value of the stateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStateId(BigInteger value) {
        this.stateId = value;
    }

    /**
     * Gets the value of the stateString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateString() {
        return stateString;
    }

    /**
     * Sets the value of the stateString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateString(String value) {
        this.stateString = value;
    }

    /**
     * Gets the value of the streetAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress1() {
        return streetAddress1;
    }

    /**
     * Sets the value of the streetAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress1(String value) {
        this.streetAddress1 = value;
    }

    /**
     * Gets the value of the streetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress2() {
        return streetAddress2;
    }

    /**
     * Sets the value of the streetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress2(String value) {
        this.streetAddress2 = value;
    }

    /**
     * Gets the value of the streetAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress3() {
        return streetAddress3;
    }

    /**
     * Sets the value of the streetAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress3(String value) {
        this.streetAddress3 = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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

    /**
     * Gets the value of the zipCode4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode4() {
        return zipCode4;
    }

    /**
     * Sets the value of the zipCode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode4(String value) {
        this.zipCode4 = value;
    }

    /**
     * Gets the value of the zipCode5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode5() {
        return zipCode5;
    }

    /**
     * Sets the value of the zipCode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode5(String value) {
        this.zipCode5 = value;
    }

}
