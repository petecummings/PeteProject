
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfGender;
import com.click4care.thinkhealth.core.dto.TypeOfUserState;


/**
 * <p>Java class for user_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactInformation" type="{http://www.click4care.com/thinkhealth/6.5/dto}contactInformation_type" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customFields" type="{http://www.click4care.com/thinkhealth/6.5/dto}customFields_type" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ethnicityCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ethnicityCodeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ethnicityCodeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ethnicityCodeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genderType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfGender" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mergeMasterUserId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="mergeMasterUserUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namePrefixCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="namePrefixCodeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namePrefixCodeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namePrefixCodeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameSuffixCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="nameSuffixCodeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameSuffixCodeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameSuffixCodeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryLanguageCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="primaryLanguageCodeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userState" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfUserState" minOccurs="0"/>
 *         &lt;element name="userSubmitDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "user_type", propOrder = {
    "c4CId",
    "contactInformation",
    "createdDate",
    "customFields",
    "deletedDate",
    "ethnicityCode",
    "ethnicityCodeDropDownListItemLabel",
    "ethnicityCodeDropDownListName",
    "ethnicityCodeUniversalId",
    "firstName",
    "genderType",
    "id",
    "lastActionDate",
    "lastName",
    "mergeMasterUserId",
    "mergeMasterUserUniversalId",
    "middleName",
    "namePrefixCode",
    "namePrefixCodeDropDownListItemLabel",
    "namePrefixCodeDropDownListName",
    "namePrefixCodeUniversalId",
    "nameSuffixCode",
    "nameSuffixCodeDropDownListItemLabel",
    "nameSuffixCodeDropDownListName",
    "nameSuffixCodeUniversalId",
    "primaryLanguage",
    "primaryLanguageCode",
    "primaryLanguageCodeUniversalId",
    "universalId",
    "userState",
    "userSubmitDate",
    "version"
})
@XmlSeeAlso({
    PayerType.class,
    MemberType.class,
    FriendsAndFamilyType.class,
    ProviderType.class
})
public abstract class UserType {

    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected ContactInformationType contactInformation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected CustomFieldsType customFields;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected BigInteger ethnicityCode;
    protected String ethnicityCodeDropDownListItemLabel;
    protected String ethnicityCodeDropDownListName;
    protected String ethnicityCodeUniversalId;
    protected String firstName;
    @XmlSchemaType(name = "string")
    protected TypeOfGender genderType;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    @XmlElement(required = true)
    protected String lastName;
    protected BigInteger mergeMasterUserId;
    protected String mergeMasterUserUniversalId;
    protected String middleName;
    protected BigInteger namePrefixCode;
    protected String namePrefixCodeDropDownListItemLabel;
    protected String namePrefixCodeDropDownListName;
    protected String namePrefixCodeUniversalId;
    protected BigInteger nameSuffixCode;
    protected String nameSuffixCodeDropDownListItemLabel;
    protected String nameSuffixCodeDropDownListName;
    protected String nameSuffixCodeUniversalId;
    protected String primaryLanguage;
    protected BigInteger primaryLanguageCode;
    protected String primaryLanguageCodeUniversalId;
    protected String universalId;
    @XmlSchemaType(name = "string")
    protected TypeOfUserState userState;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar userSubmitDate;
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
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType }
     *     
     */
    public ContactInformationType getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType }
     *     
     */
    public void setContactInformation(ContactInformationType value) {
        this.contactInformation = value;
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
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldsType }
     *     
     */
    public CustomFieldsType getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldsType }
     *     
     */
    public void setCustomFields(CustomFieldsType value) {
        this.customFields = value;
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
     * Gets the value of the ethnicityCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEthnicityCode() {
        return ethnicityCode;
    }

    /**
     * Sets the value of the ethnicityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEthnicityCode(BigInteger value) {
        this.ethnicityCode = value;
    }

    /**
     * Gets the value of the ethnicityCodeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnicityCodeDropDownListItemLabel() {
        return ethnicityCodeDropDownListItemLabel;
    }

    /**
     * Sets the value of the ethnicityCodeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnicityCodeDropDownListItemLabel(String value) {
        this.ethnicityCodeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the ethnicityCodeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnicityCodeDropDownListName() {
        return ethnicityCodeDropDownListName;
    }

    /**
     * Sets the value of the ethnicityCodeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnicityCodeDropDownListName(String value) {
        this.ethnicityCodeDropDownListName = value;
    }

    /**
     * Gets the value of the ethnicityCodeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnicityCodeUniversalId() {
        return ethnicityCodeUniversalId;
    }

    /**
     * Sets the value of the ethnicityCodeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnicityCodeUniversalId(String value) {
        this.ethnicityCodeUniversalId = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the genderType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfGender }
     *     
     */
    public TypeOfGender getGenderType() {
        return genderType;
    }

    /**
     * Sets the value of the genderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfGender }
     *     
     */
    public void setGenderType(TypeOfGender value) {
        this.genderType = value;
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
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the mergeMasterUserId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMergeMasterUserId() {
        return mergeMasterUserId;
    }

    /**
     * Sets the value of the mergeMasterUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMergeMasterUserId(BigInteger value) {
        this.mergeMasterUserId = value;
    }

    /**
     * Gets the value of the mergeMasterUserUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMergeMasterUserUniversalId() {
        return mergeMasterUserUniversalId;
    }

    /**
     * Sets the value of the mergeMasterUserUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMergeMasterUserUniversalId(String value) {
        this.mergeMasterUserUniversalId = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the namePrefixCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNamePrefixCode() {
        return namePrefixCode;
    }

    /**
     * Sets the value of the namePrefixCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNamePrefixCode(BigInteger value) {
        this.namePrefixCode = value;
    }

    /**
     * Gets the value of the namePrefixCodeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePrefixCodeDropDownListItemLabel() {
        return namePrefixCodeDropDownListItemLabel;
    }

    /**
     * Sets the value of the namePrefixCodeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePrefixCodeDropDownListItemLabel(String value) {
        this.namePrefixCodeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the namePrefixCodeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePrefixCodeDropDownListName() {
        return namePrefixCodeDropDownListName;
    }

    /**
     * Sets the value of the namePrefixCodeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePrefixCodeDropDownListName(String value) {
        this.namePrefixCodeDropDownListName = value;
    }

    /**
     * Gets the value of the namePrefixCodeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePrefixCodeUniversalId() {
        return namePrefixCodeUniversalId;
    }

    /**
     * Sets the value of the namePrefixCodeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePrefixCodeUniversalId(String value) {
        this.namePrefixCodeUniversalId = value;
    }

    /**
     * Gets the value of the nameSuffixCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNameSuffixCode() {
        return nameSuffixCode;
    }

    /**
     * Sets the value of the nameSuffixCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNameSuffixCode(BigInteger value) {
        this.nameSuffixCode = value;
    }

    /**
     * Gets the value of the nameSuffixCodeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSuffixCodeDropDownListItemLabel() {
        return nameSuffixCodeDropDownListItemLabel;
    }

    /**
     * Sets the value of the nameSuffixCodeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSuffixCodeDropDownListItemLabel(String value) {
        this.nameSuffixCodeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the nameSuffixCodeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSuffixCodeDropDownListName() {
        return nameSuffixCodeDropDownListName;
    }

    /**
     * Sets the value of the nameSuffixCodeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSuffixCodeDropDownListName(String value) {
        this.nameSuffixCodeDropDownListName = value;
    }

    /**
     * Gets the value of the nameSuffixCodeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSuffixCodeUniversalId() {
        return nameSuffixCodeUniversalId;
    }

    /**
     * Sets the value of the nameSuffixCodeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSuffixCodeUniversalId(String value) {
        this.nameSuffixCodeUniversalId = value;
    }

    /**
     * Gets the value of the primaryLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLanguage() {
        return primaryLanguage;
    }

    /**
     * Sets the value of the primaryLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLanguage(String value) {
        this.primaryLanguage = value;
    }

    /**
     * Gets the value of the primaryLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrimaryLanguageCode() {
        return primaryLanguageCode;
    }

    /**
     * Sets the value of the primaryLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrimaryLanguageCode(BigInteger value) {
        this.primaryLanguageCode = value;
    }

    /**
     * Gets the value of the primaryLanguageCodeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLanguageCodeUniversalId() {
        return primaryLanguageCodeUniversalId;
    }

    /**
     * Sets the value of the primaryLanguageCodeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLanguageCodeUniversalId(String value) {
        this.primaryLanguageCodeUniversalId = value;
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
     * Gets the value of the userState property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfUserState }
     *     
     */
    public TypeOfUserState getUserState() {
        return userState;
    }

    /**
     * Sets the value of the userState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfUserState }
     *     
     */
    public void setUserState(TypeOfUserState value) {
        this.userState = value;
    }

    /**
     * Gets the value of the userSubmitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUserSubmitDate() {
        return userSubmitDate;
    }

    /**
     * Sets the value of the userSubmitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUserSubmitDate(XMLGregorianCalendar value) {
        this.userSubmitDate = value;
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
