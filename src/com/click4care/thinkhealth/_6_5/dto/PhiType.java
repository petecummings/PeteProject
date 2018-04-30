
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfPhi;


/**
 * <p>Java class for phi_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phi_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authDisclosureRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authPurposeDDLItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="authPurposeDDLItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authPurposeDDLItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authPurposeDDLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authSourceDDLItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="authSourceDDLItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authSourceDDLItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authSourceDDLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authTypeDDLItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="authTypeDDLItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authTypeDDLItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authTypeDDLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confidentialCommunicationTypeDDLItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="confidentialCommunicationTypeDDLItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confidentialCommunicationTypeDDLItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confidentialCommunicationTypeDDLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastAction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastActionBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionByLoggedIn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalTypeDDLItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="legalTypeDDLItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalTypeDDLItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalTypeDDLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="memberUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="originalCreatorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phiType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfPhi" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneTypeDDLItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="phoneTypeDDLItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneTypeDDLItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneTypeDDLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationshipDDLItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="relationshipDDLItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationshipDDLItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationshipDDLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="representativeAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="representativeCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="representativeCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="representativeTypeDDLItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="representativeTypeDDLItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="representativeTypeDDLItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="representativeTypeDDLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="representativeZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "phi_type", propOrder = {
    "authDisclosureRecipient",
    "authPurposeDDLItemId",
    "authPurposeDDLItemLabel",
    "authPurposeDDLItemUniversalId",
    "authPurposeDDLName",
    "authSourceDDLItemId",
    "authSourceDDLItemLabel",
    "authSourceDDLItemUniversalId",
    "authSourceDDLName",
    "authTypeDDLItemId",
    "authTypeDDLItemLabel",
    "authTypeDDLItemUniversalId",
    "authTypeDDLName",
    "c4CId",
    "confidentialCommunicationTypeDDLItemId",
    "confidentialCommunicationTypeDDLItemLabel",
    "confidentialCommunicationTypeDDLItemUniversalId",
    "confidentialCommunicationTypeDDLName",
    "createdDate",
    "deletedDate",
    "email",
    "endDate",
    "firstName",
    "id",
    "lastAction",
    "lastActionBy",
    "lastActionByLoggedIn",
    "lastActionDate",
    "lastName",
    "legalTypeDDLItemId",
    "legalTypeDDLItemLabel",
    "legalTypeDDLItemUniversalId",
    "legalTypeDDLName",
    "memberId",
    "memberUniversalId",
    "objectState",
    "originalCreatorId",
    "phiType",
    "phoneNumber",
    "phoneTypeDDLItemId",
    "phoneTypeDDLItemLabel",
    "phoneTypeDDLItemUniversalId",
    "phoneTypeDDLName",
    "relationshipDDLItemId",
    "relationshipDDLItemLabel",
    "relationshipDDLItemUniversalId",
    "relationshipDDLName",
    "representativeAddress",
    "representativeCity",
    "representativeCountry",
    "representativeTypeDDLItemId",
    "representativeTypeDDLItemLabel",
    "representativeTypeDDLItemUniversalId",
    "representativeTypeDDLName",
    "representativeZipCode",
    "scope",
    "signStartDate",
    "startDate",
    "universalId",
    "version"
})
public class PhiType {

    protected String authDisclosureRecipient;
    protected BigInteger authPurposeDDLItemId;
    protected String authPurposeDDLItemLabel;
    protected String authPurposeDDLItemUniversalId;
    protected String authPurposeDDLName;
    protected BigInteger authSourceDDLItemId;
    protected String authSourceDDLItemLabel;
    protected String authSourceDDLItemUniversalId;
    protected String authSourceDDLName;
    protected BigInteger authTypeDDLItemId;
    protected String authTypeDDLItemLabel;
    protected String authTypeDDLItemUniversalId;
    protected String authTypeDDLName;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected BigInteger confidentialCommunicationTypeDDLItemId;
    protected String confidentialCommunicationTypeDDLItemLabel;
    protected String confidentialCommunicationTypeDDLItemUniversalId;
    protected String confidentialCommunicationTypeDDLName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected String email;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String firstName;
    protected BigInteger id;
    protected Integer lastAction;
    protected BigInteger lastActionBy;
    protected BigInteger lastActionByLoggedIn;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected String lastName;
    protected BigInteger legalTypeDDLItemId;
    protected String legalTypeDDLItemLabel;
    protected String legalTypeDDLItemUniversalId;
    protected String legalTypeDDLName;
    protected BigInteger memberId;
    protected String memberUniversalId;
    protected Integer objectState;
    protected Long originalCreatorId;
    @XmlSchemaType(name = "string")
    protected TypeOfPhi phiType;
    protected String phoneNumber;
    protected BigInteger phoneTypeDDLItemId;
    protected String phoneTypeDDLItemLabel;
    protected String phoneTypeDDLItemUniversalId;
    protected String phoneTypeDDLName;
    protected BigInteger relationshipDDLItemId;
    protected String relationshipDDLItemLabel;
    protected String relationshipDDLItemUniversalId;
    protected String relationshipDDLName;
    protected String representativeAddress;
    protected String representativeCity;
    protected String representativeCountry;
    protected BigInteger representativeTypeDDLItemId;
    protected String representativeTypeDDLItemLabel;
    protected String representativeTypeDDLItemUniversalId;
    protected String representativeTypeDDLName;
    protected String representativeZipCode;
    protected String scope;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signStartDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected String universalId;
    protected BigInteger version;

    /**
     * Gets the value of the authDisclosureRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthDisclosureRecipient() {
        return authDisclosureRecipient;
    }

    /**
     * Sets the value of the authDisclosureRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthDisclosureRecipient(String value) {
        this.authDisclosureRecipient = value;
    }

    /**
     * Gets the value of the authPurposeDDLItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthPurposeDDLItemId() {
        return authPurposeDDLItemId;
    }

    /**
     * Sets the value of the authPurposeDDLItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthPurposeDDLItemId(BigInteger value) {
        this.authPurposeDDLItemId = value;
    }

    /**
     * Gets the value of the authPurposeDDLItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthPurposeDDLItemLabel() {
        return authPurposeDDLItemLabel;
    }

    /**
     * Sets the value of the authPurposeDDLItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthPurposeDDLItemLabel(String value) {
        this.authPurposeDDLItemLabel = value;
    }

    /**
     * Gets the value of the authPurposeDDLItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthPurposeDDLItemUniversalId() {
        return authPurposeDDLItemUniversalId;
    }

    /**
     * Sets the value of the authPurposeDDLItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthPurposeDDLItemUniversalId(String value) {
        this.authPurposeDDLItemUniversalId = value;
    }

    /**
     * Gets the value of the authPurposeDDLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthPurposeDDLName() {
        return authPurposeDDLName;
    }

    /**
     * Sets the value of the authPurposeDDLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthPurposeDDLName(String value) {
        this.authPurposeDDLName = value;
    }

    /**
     * Gets the value of the authSourceDDLItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthSourceDDLItemId() {
        return authSourceDDLItemId;
    }

    /**
     * Sets the value of the authSourceDDLItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthSourceDDLItemId(BigInteger value) {
        this.authSourceDDLItemId = value;
    }

    /**
     * Gets the value of the authSourceDDLItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthSourceDDLItemLabel() {
        return authSourceDDLItemLabel;
    }

    /**
     * Sets the value of the authSourceDDLItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthSourceDDLItemLabel(String value) {
        this.authSourceDDLItemLabel = value;
    }

    /**
     * Gets the value of the authSourceDDLItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthSourceDDLItemUniversalId() {
        return authSourceDDLItemUniversalId;
    }

    /**
     * Sets the value of the authSourceDDLItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthSourceDDLItemUniversalId(String value) {
        this.authSourceDDLItemUniversalId = value;
    }

    /**
     * Gets the value of the authSourceDDLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthSourceDDLName() {
        return authSourceDDLName;
    }

    /**
     * Sets the value of the authSourceDDLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthSourceDDLName(String value) {
        this.authSourceDDLName = value;
    }

    /**
     * Gets the value of the authTypeDDLItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthTypeDDLItemId() {
        return authTypeDDLItemId;
    }

    /**
     * Sets the value of the authTypeDDLItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthTypeDDLItemId(BigInteger value) {
        this.authTypeDDLItemId = value;
    }

    /**
     * Gets the value of the authTypeDDLItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthTypeDDLItemLabel() {
        return authTypeDDLItemLabel;
    }

    /**
     * Sets the value of the authTypeDDLItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthTypeDDLItemLabel(String value) {
        this.authTypeDDLItemLabel = value;
    }

    /**
     * Gets the value of the authTypeDDLItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthTypeDDLItemUniversalId() {
        return authTypeDDLItemUniversalId;
    }

    /**
     * Sets the value of the authTypeDDLItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthTypeDDLItemUniversalId(String value) {
        this.authTypeDDLItemUniversalId = value;
    }

    /**
     * Gets the value of the authTypeDDLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthTypeDDLName() {
        return authTypeDDLName;
    }

    /**
     * Sets the value of the authTypeDDLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthTypeDDLName(String value) {
        this.authTypeDDLName = value;
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
     * Gets the value of the confidentialCommunicationTypeDDLItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConfidentialCommunicationTypeDDLItemId() {
        return confidentialCommunicationTypeDDLItemId;
    }

    /**
     * Sets the value of the confidentialCommunicationTypeDDLItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConfidentialCommunicationTypeDDLItemId(BigInteger value) {
        this.confidentialCommunicationTypeDDLItemId = value;
    }

    /**
     * Gets the value of the confidentialCommunicationTypeDDLItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidentialCommunicationTypeDDLItemLabel() {
        return confidentialCommunicationTypeDDLItemLabel;
    }

    /**
     * Sets the value of the confidentialCommunicationTypeDDLItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidentialCommunicationTypeDDLItemLabel(String value) {
        this.confidentialCommunicationTypeDDLItemLabel = value;
    }

    /**
     * Gets the value of the confidentialCommunicationTypeDDLItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidentialCommunicationTypeDDLItemUniversalId() {
        return confidentialCommunicationTypeDDLItemUniversalId;
    }

    /**
     * Sets the value of the confidentialCommunicationTypeDDLItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidentialCommunicationTypeDDLItemUniversalId(String value) {
        this.confidentialCommunicationTypeDDLItemUniversalId = value;
    }

    /**
     * Gets the value of the confidentialCommunicationTypeDDLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidentialCommunicationTypeDDLName() {
        return confidentialCommunicationTypeDDLName;
    }

    /**
     * Sets the value of the confidentialCommunicationTypeDDLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidentialCommunicationTypeDDLName(String value) {
        this.confidentialCommunicationTypeDDLName = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
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
     * Gets the value of the lastAction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastAction() {
        return lastAction;
    }

    /**
     * Sets the value of the lastAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastAction(Integer value) {
        this.lastAction = value;
    }

    /**
     * Gets the value of the lastActionBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastActionBy() {
        return lastActionBy;
    }

    /**
     * Sets the value of the lastActionBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastActionBy(BigInteger value) {
        this.lastActionBy = value;
    }

    /**
     * Gets the value of the lastActionByLoggedIn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastActionByLoggedIn() {
        return lastActionByLoggedIn;
    }

    /**
     * Sets the value of the lastActionByLoggedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastActionByLoggedIn(BigInteger value) {
        this.lastActionByLoggedIn = value;
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
     * Gets the value of the legalTypeDDLItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLegalTypeDDLItemId() {
        return legalTypeDDLItemId;
    }

    /**
     * Sets the value of the legalTypeDDLItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLegalTypeDDLItemId(BigInteger value) {
        this.legalTypeDDLItemId = value;
    }

    /**
     * Gets the value of the legalTypeDDLItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalTypeDDLItemLabel() {
        return legalTypeDDLItemLabel;
    }

    /**
     * Sets the value of the legalTypeDDLItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalTypeDDLItemLabel(String value) {
        this.legalTypeDDLItemLabel = value;
    }

    /**
     * Gets the value of the legalTypeDDLItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalTypeDDLItemUniversalId() {
        return legalTypeDDLItemUniversalId;
    }

    /**
     * Sets the value of the legalTypeDDLItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalTypeDDLItemUniversalId(String value) {
        this.legalTypeDDLItemUniversalId = value;
    }

    /**
     * Gets the value of the legalTypeDDLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalTypeDDLName() {
        return legalTypeDDLName;
    }

    /**
     * Sets the value of the legalTypeDDLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalTypeDDLName(String value) {
        this.legalTypeDDLName = value;
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
     * Gets the value of the objectState property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectState() {
        return objectState;
    }

    /**
     * Sets the value of the objectState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectState(Integer value) {
        this.objectState = value;
    }

    /**
     * Gets the value of the originalCreatorId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginalCreatorId() {
        return originalCreatorId;
    }

    /**
     * Sets the value of the originalCreatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginalCreatorId(Long value) {
        this.originalCreatorId = value;
    }

    /**
     * Gets the value of the phiType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPhi }
     *     
     */
    public TypeOfPhi getPhiType() {
        return phiType;
    }

    /**
     * Sets the value of the phiType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPhi }
     *     
     */
    public void setPhiType(TypeOfPhi value) {
        this.phiType = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the phoneTypeDDLItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhoneTypeDDLItemId() {
        return phoneTypeDDLItemId;
    }

    /**
     * Sets the value of the phoneTypeDDLItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhoneTypeDDLItemId(BigInteger value) {
        this.phoneTypeDDLItemId = value;
    }

    /**
     * Gets the value of the phoneTypeDDLItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneTypeDDLItemLabel() {
        return phoneTypeDDLItemLabel;
    }

    /**
     * Sets the value of the phoneTypeDDLItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneTypeDDLItemLabel(String value) {
        this.phoneTypeDDLItemLabel = value;
    }

    /**
     * Gets the value of the phoneTypeDDLItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneTypeDDLItemUniversalId() {
        return phoneTypeDDLItemUniversalId;
    }

    /**
     * Sets the value of the phoneTypeDDLItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneTypeDDLItemUniversalId(String value) {
        this.phoneTypeDDLItemUniversalId = value;
    }

    /**
     * Gets the value of the phoneTypeDDLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneTypeDDLName() {
        return phoneTypeDDLName;
    }

    /**
     * Sets the value of the phoneTypeDDLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneTypeDDLName(String value) {
        this.phoneTypeDDLName = value;
    }

    /**
     * Gets the value of the relationshipDDLItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRelationshipDDLItemId() {
        return relationshipDDLItemId;
    }

    /**
     * Sets the value of the relationshipDDLItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRelationshipDDLItemId(BigInteger value) {
        this.relationshipDDLItemId = value;
    }

    /**
     * Gets the value of the relationshipDDLItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipDDLItemLabel() {
        return relationshipDDLItemLabel;
    }

    /**
     * Sets the value of the relationshipDDLItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipDDLItemLabel(String value) {
        this.relationshipDDLItemLabel = value;
    }

    /**
     * Gets the value of the relationshipDDLItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipDDLItemUniversalId() {
        return relationshipDDLItemUniversalId;
    }

    /**
     * Sets the value of the relationshipDDLItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipDDLItemUniversalId(String value) {
        this.relationshipDDLItemUniversalId = value;
    }

    /**
     * Gets the value of the relationshipDDLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipDDLName() {
        return relationshipDDLName;
    }

    /**
     * Sets the value of the relationshipDDLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipDDLName(String value) {
        this.relationshipDDLName = value;
    }

    /**
     * Gets the value of the representativeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentativeAddress() {
        return representativeAddress;
    }

    /**
     * Sets the value of the representativeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentativeAddress(String value) {
        this.representativeAddress = value;
    }

    /**
     * Gets the value of the representativeCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentativeCity() {
        return representativeCity;
    }

    /**
     * Sets the value of the representativeCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentativeCity(String value) {
        this.representativeCity = value;
    }

    /**
     * Gets the value of the representativeCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentativeCountry() {
        return representativeCountry;
    }

    /**
     * Sets the value of the representativeCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentativeCountry(String value) {
        this.representativeCountry = value;
    }

    /**
     * Gets the value of the representativeTypeDDLItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRepresentativeTypeDDLItemId() {
        return representativeTypeDDLItemId;
    }

    /**
     * Sets the value of the representativeTypeDDLItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRepresentativeTypeDDLItemId(BigInteger value) {
        this.representativeTypeDDLItemId = value;
    }

    /**
     * Gets the value of the representativeTypeDDLItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentativeTypeDDLItemLabel() {
        return representativeTypeDDLItemLabel;
    }

    /**
     * Sets the value of the representativeTypeDDLItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentativeTypeDDLItemLabel(String value) {
        this.representativeTypeDDLItemLabel = value;
    }

    /**
     * Gets the value of the representativeTypeDDLItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentativeTypeDDLItemUniversalId() {
        return representativeTypeDDLItemUniversalId;
    }

    /**
     * Sets the value of the representativeTypeDDLItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentativeTypeDDLItemUniversalId(String value) {
        this.representativeTypeDDLItemUniversalId = value;
    }

    /**
     * Gets the value of the representativeTypeDDLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentativeTypeDDLName() {
        return representativeTypeDDLName;
    }

    /**
     * Sets the value of the representativeTypeDDLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentativeTypeDDLName(String value) {
        this.representativeTypeDDLName = value;
    }

    /**
     * Gets the value of the representativeZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentativeZipCode() {
        return representativeZipCode;
    }

    /**
     * Sets the value of the representativeZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentativeZipCode(String value) {
        this.representativeZipCode = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the signStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignStartDate() {
        return signStartDate;
    }

    /**
     * Sets the value of the signStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignStartDate(XMLGregorianCalendar value) {
        this.signStartDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
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
