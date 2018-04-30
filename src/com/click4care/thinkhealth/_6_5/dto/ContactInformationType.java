
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
import com.click4care.thinkhealth.core.dto.EmailAddressType;
import com.click4care.thinkhealth.core.dto.PhoneNumberType;


/**
 * <p>Java class for contactInformation_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactInformation_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="address" type="{http://www.click4care.com/thinkhealth/6.5/dto}address_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactMethod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contactMethodDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactMethodDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactMethodUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="doNotContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emailAddresses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="emailAddress" type="{http://www.click4care.com/thinkhealth/core/dto}emailAddress_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="emailContactPreference" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="emailContactPreferenceDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailContactPreferenceDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailContactPreferenceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="mailContactPreference" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="mailContactPreferenceDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailContactPreferenceDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailContactPreferenceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officeHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerContactInformation" type="{http://www.click4care.com/thinkhealth/6.5/dto}payerContactInformation_type" minOccurs="0"/>
 *         &lt;element name="phoneContactPreference" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="phoneContactPreferenceDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneContactPreferenceDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneContactPreferenceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumbers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="phoneNumber" type="{http://www.click4care.com/thinkhealth/core/dto}phoneNumber_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactInformation_type", propOrder = {
    "addresses",
    "c4CId",
    "contactMethod",
    "contactMethodDropDownListItemLabel",
    "contactMethodDropDownListName",
    "contactMethodUniversalId",
    "createdDate",
    "deletedDate",
    "doNotContact",
    "emailAddresses",
    "emailContactPreference",
    "emailContactPreferenceDropDownListItemLabel",
    "emailContactPreferenceDropDownListName",
    "emailContactPreferenceUniversalId",
    "id",
    "lastActionDate",
    "mailContactPreference",
    "mailContactPreferenceDropDownListItemLabel",
    "mailContactPreferenceDropDownListName",
    "mailContactPreferenceUniversalId",
    "officeHours",
    "payerContactInformation",
    "phoneContactPreference",
    "phoneContactPreferenceDropDownListItemLabel",
    "phoneContactPreferenceDropDownListName",
    "phoneContactPreferenceUniversalId",
    "phoneNumbers",
    "universalId",
    "version",
    "website"
})
public class ContactInformationType {

    protected ContactInformationType.Addresses addresses;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected BigInteger contactMethod;
    protected String contactMethodDropDownListItemLabel;
    protected String contactMethodDropDownListName;
    protected String contactMethodUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected Boolean doNotContact;
    protected ContactInformationType.EmailAddresses emailAddresses;
    protected BigInteger emailContactPreference;
    protected String emailContactPreferenceDropDownListItemLabel;
    protected String emailContactPreferenceDropDownListName;
    protected String emailContactPreferenceUniversalId;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected BigInteger mailContactPreference;
    protected String mailContactPreferenceDropDownListItemLabel;
    protected String mailContactPreferenceDropDownListName;
    protected String mailContactPreferenceUniversalId;
    protected String officeHours;
    protected PayerContactInformationType payerContactInformation;
    protected BigInteger phoneContactPreference;
    protected String phoneContactPreferenceDropDownListItemLabel;
    protected String phoneContactPreferenceDropDownListName;
    protected String phoneContactPreferenceUniversalId;
    protected ContactInformationType.PhoneNumbers phoneNumbers;
    protected String universalId;
    protected BigInteger version;
    protected String website;

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType.Addresses }
     *     
     */
    public ContactInformationType.Addresses getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType.Addresses }
     *     
     */
    public void setAddresses(ContactInformationType.Addresses value) {
        this.addresses = value;
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
     * Gets the value of the contactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContactMethod() {
        return contactMethod;
    }

    /**
     * Sets the value of the contactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContactMethod(BigInteger value) {
        this.contactMethod = value;
    }

    /**
     * Gets the value of the contactMethodDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMethodDropDownListItemLabel() {
        return contactMethodDropDownListItemLabel;
    }

    /**
     * Sets the value of the contactMethodDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMethodDropDownListItemLabel(String value) {
        this.contactMethodDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the contactMethodDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMethodDropDownListName() {
        return contactMethodDropDownListName;
    }

    /**
     * Sets the value of the contactMethodDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMethodDropDownListName(String value) {
        this.contactMethodDropDownListName = value;
    }

    /**
     * Gets the value of the contactMethodUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMethodUniversalId() {
        return contactMethodUniversalId;
    }

    /**
     * Sets the value of the contactMethodUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMethodUniversalId(String value) {
        this.contactMethodUniversalId = value;
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
     * Gets the value of the doNotContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoNotContact() {
        return doNotContact;
    }

    /**
     * Sets the value of the doNotContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoNotContact(Boolean value) {
        this.doNotContact = value;
    }

    /**
     * Gets the value of the emailAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType.EmailAddresses }
     *     
     */
    public ContactInformationType.EmailAddresses getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Sets the value of the emailAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType.EmailAddresses }
     *     
     */
    public void setEmailAddresses(ContactInformationType.EmailAddresses value) {
        this.emailAddresses = value;
    }

    /**
     * Gets the value of the emailContactPreference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmailContactPreference() {
        return emailContactPreference;
    }

    /**
     * Sets the value of the emailContactPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmailContactPreference(BigInteger value) {
        this.emailContactPreference = value;
    }

    /**
     * Gets the value of the emailContactPreferenceDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailContactPreferenceDropDownListItemLabel() {
        return emailContactPreferenceDropDownListItemLabel;
    }

    /**
     * Sets the value of the emailContactPreferenceDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailContactPreferenceDropDownListItemLabel(String value) {
        this.emailContactPreferenceDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the emailContactPreferenceDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailContactPreferenceDropDownListName() {
        return emailContactPreferenceDropDownListName;
    }

    /**
     * Sets the value of the emailContactPreferenceDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailContactPreferenceDropDownListName(String value) {
        this.emailContactPreferenceDropDownListName = value;
    }

    /**
     * Gets the value of the emailContactPreferenceUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailContactPreferenceUniversalId() {
        return emailContactPreferenceUniversalId;
    }

    /**
     * Sets the value of the emailContactPreferenceUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailContactPreferenceUniversalId(String value) {
        this.emailContactPreferenceUniversalId = value;
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
     * Gets the value of the mailContactPreference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMailContactPreference() {
        return mailContactPreference;
    }

    /**
     * Sets the value of the mailContactPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMailContactPreference(BigInteger value) {
        this.mailContactPreference = value;
    }

    /**
     * Gets the value of the mailContactPreferenceDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailContactPreferenceDropDownListItemLabel() {
        return mailContactPreferenceDropDownListItemLabel;
    }

    /**
     * Sets the value of the mailContactPreferenceDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailContactPreferenceDropDownListItemLabel(String value) {
        this.mailContactPreferenceDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the mailContactPreferenceDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailContactPreferenceDropDownListName() {
        return mailContactPreferenceDropDownListName;
    }

    /**
     * Sets the value of the mailContactPreferenceDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailContactPreferenceDropDownListName(String value) {
        this.mailContactPreferenceDropDownListName = value;
    }

    /**
     * Gets the value of the mailContactPreferenceUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailContactPreferenceUniversalId() {
        return mailContactPreferenceUniversalId;
    }

    /**
     * Sets the value of the mailContactPreferenceUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailContactPreferenceUniversalId(String value) {
        this.mailContactPreferenceUniversalId = value;
    }

    /**
     * Gets the value of the officeHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeHours() {
        return officeHours;
    }

    /**
     * Sets the value of the officeHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeHours(String value) {
        this.officeHours = value;
    }

    /**
     * Gets the value of the payerContactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PayerContactInformationType }
     *     
     */
    public PayerContactInformationType getPayerContactInformation() {
        return payerContactInformation;
    }

    /**
     * Sets the value of the payerContactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerContactInformationType }
     *     
     */
    public void setPayerContactInformation(PayerContactInformationType value) {
        this.payerContactInformation = value;
    }

    /**
     * Gets the value of the phoneContactPreference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhoneContactPreference() {
        return phoneContactPreference;
    }

    /**
     * Sets the value of the phoneContactPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhoneContactPreference(BigInteger value) {
        this.phoneContactPreference = value;
    }

    /**
     * Gets the value of the phoneContactPreferenceDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneContactPreferenceDropDownListItemLabel() {
        return phoneContactPreferenceDropDownListItemLabel;
    }

    /**
     * Sets the value of the phoneContactPreferenceDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneContactPreferenceDropDownListItemLabel(String value) {
        this.phoneContactPreferenceDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the phoneContactPreferenceDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneContactPreferenceDropDownListName() {
        return phoneContactPreferenceDropDownListName;
    }

    /**
     * Sets the value of the phoneContactPreferenceDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneContactPreferenceDropDownListName(String value) {
        this.phoneContactPreferenceDropDownListName = value;
    }

    /**
     * Gets the value of the phoneContactPreferenceUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneContactPreferenceUniversalId() {
        return phoneContactPreferenceUniversalId;
    }

    /**
     * Sets the value of the phoneContactPreferenceUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneContactPreferenceUniversalId(String value) {
        this.phoneContactPreferenceUniversalId = value;
    }

    /**
     * Gets the value of the phoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType.PhoneNumbers }
     *     
     */
    public ContactInformationType.PhoneNumbers getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Sets the value of the phoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType.PhoneNumbers }
     *     
     */
    public void setPhoneNumbers(ContactInformationType.PhoneNumbers value) {
        this.phoneNumbers = value;
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
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
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
     *         &lt;element name="address" type="{http://www.click4care.com/thinkhealth/6.5/dto}address_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "address"
    })
    public static class Addresses {

        protected List<AddressType> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddressType }
         * 
         * 
         */
        public List<AddressType> getAddress() {
            if (address == null) {
                address = new ArrayList<AddressType>();
            }
            return this.address;
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
     *         &lt;element name="emailAddress" type="{http://www.click4care.com/thinkhealth/core/dto}emailAddress_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "emailAddress"
    })
    public static class EmailAddresses {

        protected List<EmailAddressType> emailAddress;

        /**
         * Gets the value of the emailAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the emailAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmailAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EmailAddressType }
         * 
         * 
         */
        public List<EmailAddressType> getEmailAddress() {
            if (emailAddress == null) {
                emailAddress = new ArrayList<EmailAddressType>();
            }
            return this.emailAddress;
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
     *         &lt;element name="phoneNumber" type="{http://www.click4care.com/thinkhealth/core/dto}phoneNumber_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "phoneNumber"
    })
    public static class PhoneNumbers {

        protected List<PhoneNumberType> phoneNumber;

        /**
         * Gets the value of the phoneNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoneNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PhoneNumberType }
         * 
         * 
         */
        public List<PhoneNumberType> getPhoneNumber() {
            if (phoneNumber == null) {
                phoneNumber = new ArrayList<PhoneNumberType>();
            }
            return this.phoneNumber;
        }

    }

}
