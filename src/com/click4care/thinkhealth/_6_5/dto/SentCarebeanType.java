
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
import com.click4care.thinkhealth.core.dto.TypeOfSource;


/**
 * <p>Java class for sent_carebean_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sent_carebean_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="affiliationCm" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="affiliationMember" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="affiliationProvider" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="affiliationUmEvent" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="affiliationUmEventRequest" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="affiliationUmExtension" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="causedBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="configuredCarebeanId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="conversationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customFields" type="{http://www.click4care.com/thinkhealth/6.5/dto}customFields_type" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="gatekeeperOutcome" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastGatekeeper" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastRoutedToGatekeeperAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalRecipient" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="outcome" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipients" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="recipient" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recommended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="senderSpecifiedDates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sent" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sentCarebeanGroup" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sourcePatientIdQuery" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sourceType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfSource" minOccurs="0"/>
 *         &lt;element name="started" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="stcbSrcAsmtcarecalc" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="takenAssessmentCC" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="takenAssessmentCCBase" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="terminated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="transfer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="welcomeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastGatekeeperActionAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sent_carebean_type", propOrder = {
    "affiliationCm",
    "affiliationMember",
    "affiliationProvider",
    "affiliationUmEvent",
    "affiliationUmEventRequest",
    "affiliationUmExtension",
    "c4CId",
    "causedBy",
    "configuredCarebeanId",
    "conversationId",
    "createdDate",
    "customFields",
    "deletedDate",
    "gatekeeperOutcome",
    "id",
    "lastActionDate",
    "lastGatekeeper",
    "lastRoutedToGatekeeperAt",
    "name",
    "originalRecipient",
    "outcome",
    "owner",
    "purpose",
    "recipients",
    "recommended",
    "senderSpecifiedDates",
    "sent",
    "sentCarebeanGroup",
    "sourcePatientIdQuery",
    "sourceType",
    "started",
    "stcbSrcAsmtcarecalc",
    "takenAssessmentCC",
    "takenAssessmentCCBase",
    "terminated",
    "transfer",
    "universalId",
    "version",
    "welcomeText",
    "lastGatekeeperActionAt"
})
public class SentCarebeanType {

    protected BigInteger affiliationCm;
    protected BigInteger affiliationMember;
    protected BigInteger affiliationProvider;
    protected BigInteger affiliationUmEvent;
    protected BigInteger affiliationUmEventRequest;
    protected BigInteger affiliationUmExtension;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected BigInteger causedBy;
    @XmlElement(required = true)
    protected BigInteger configuredCarebeanId;
    protected String conversationId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected CustomFieldsType customFields;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected BigInteger gatekeeperOutcome;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected BigInteger lastGatekeeper;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastRoutedToGatekeeperAt;
    protected String name;
    protected BigInteger originalRecipient;
    protected BigInteger outcome;
    protected BigInteger owner;
    protected String purpose;
    protected SentCarebeanType.Recipients recipients;
    protected Boolean recommended;
    protected Boolean senderSpecifiedDates;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sent;
    protected BigInteger sentCarebeanGroup;
    protected BigInteger sourcePatientIdQuery;
    @XmlSchemaType(name = "string")
    protected TypeOfSource sourceType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar started;
    protected BigInteger stcbSrcAsmtcarecalc;
    protected BigInteger takenAssessmentCC;
    protected BigInteger takenAssessmentCCBase;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar terminated;
    protected BigInteger transfer;
    protected String universalId;
    protected BigInteger version;
    protected String welcomeText;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastGatekeeperActionAt;

    /**
     * Gets the value of the affiliationCm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliationCm() {
        return affiliationCm;
    }

    /**
     * Sets the value of the affiliationCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliationCm(BigInteger value) {
        this.affiliationCm = value;
    }

    /**
     * Gets the value of the affiliationMember property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliationMember() {
        return affiliationMember;
    }

    /**
     * Sets the value of the affiliationMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliationMember(BigInteger value) {
        this.affiliationMember = value;
    }

    /**
     * Gets the value of the affiliationProvider property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliationProvider() {
        return affiliationProvider;
    }

    /**
     * Sets the value of the affiliationProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliationProvider(BigInteger value) {
        this.affiliationProvider = value;
    }

    /**
     * Gets the value of the affiliationUmEvent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliationUmEvent() {
        return affiliationUmEvent;
    }

    /**
     * Sets the value of the affiliationUmEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliationUmEvent(BigInteger value) {
        this.affiliationUmEvent = value;
    }

    /**
     * Gets the value of the affiliationUmEventRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliationUmEventRequest() {
        return affiliationUmEventRequest;
    }

    /**
     * Sets the value of the affiliationUmEventRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliationUmEventRequest(BigInteger value) {
        this.affiliationUmEventRequest = value;
    }

    /**
     * Gets the value of the affiliationUmExtension property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliationUmExtension() {
        return affiliationUmExtension;
    }

    /**
     * Sets the value of the affiliationUmExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliationUmExtension(BigInteger value) {
        this.affiliationUmExtension = value;
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
     * Gets the value of the causedBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCausedBy() {
        return causedBy;
    }

    /**
     * Sets the value of the causedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCausedBy(BigInteger value) {
        this.causedBy = value;
    }

    /**
     * Gets the value of the configuredCarebeanId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConfiguredCarebeanId() {
        return configuredCarebeanId;
    }

    /**
     * Sets the value of the configuredCarebeanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConfiguredCarebeanId(BigInteger value) {
        this.configuredCarebeanId = value;
    }

    /**
     * Gets the value of the conversationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversationId() {
        return conversationId;
    }

    /**
     * Sets the value of the conversationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversationId(String value) {
        this.conversationId = value;
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
     * Gets the value of the gatekeeperOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGatekeeperOutcome() {
        return gatekeeperOutcome;
    }

    /**
     * Sets the value of the gatekeeperOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGatekeeperOutcome(BigInteger value) {
        this.gatekeeperOutcome = value;
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
     * Gets the value of the lastGatekeeper property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastGatekeeper() {
        return lastGatekeeper;
    }

    /**
     * Sets the value of the lastGatekeeper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastGatekeeper(BigInteger value) {
        this.lastGatekeeper = value;
    }

    /**
     * Gets the value of the lastRoutedToGatekeeperAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRoutedToGatekeeperAt() {
        return lastRoutedToGatekeeperAt;
    }

    /**
     * Sets the value of the lastRoutedToGatekeeperAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRoutedToGatekeeperAt(XMLGregorianCalendar value) {
        this.lastRoutedToGatekeeperAt = value;
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
     * Gets the value of the originalRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginalRecipient() {
        return originalRecipient;
    }

    /**
     * Sets the value of the originalRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginalRecipient(BigInteger value) {
        this.originalRecipient = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutcome(BigInteger value) {
        this.outcome = value;
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
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * @return
     *     possible object is
     *     {@link SentCarebeanType.Recipients }
     *     
     */
    public SentCarebeanType.Recipients getRecipients() {
        return recipients;
    }

    /**
     * Sets the value of the recipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link SentCarebeanType.Recipients }
     *     
     */
    public void setRecipients(SentCarebeanType.Recipients value) {
        this.recipients = value;
    }

    /**
     * Gets the value of the recommended property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecommended() {
        return recommended;
    }

    /**
     * Sets the value of the recommended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecommended(Boolean value) {
        this.recommended = value;
    }

    /**
     * Gets the value of the senderSpecifiedDates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSenderSpecifiedDates() {
        return senderSpecifiedDates;
    }

    /**
     * Sets the value of the senderSpecifiedDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSenderSpecifiedDates(Boolean value) {
        this.senderSpecifiedDates = value;
    }

    /**
     * Gets the value of the sent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSent() {
        return sent;
    }

    /**
     * Sets the value of the sent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSent(XMLGregorianCalendar value) {
        this.sent = value;
    }

    /**
     * Gets the value of the sentCarebeanGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSentCarebeanGroup() {
        return sentCarebeanGroup;
    }

    /**
     * Sets the value of the sentCarebeanGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSentCarebeanGroup(BigInteger value) {
        this.sentCarebeanGroup = value;
    }

    /**
     * Gets the value of the sourcePatientIdQuery property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourcePatientIdQuery() {
        return sourcePatientIdQuery;
    }

    /**
     * Sets the value of the sourcePatientIdQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourcePatientIdQuery(BigInteger value) {
        this.sourcePatientIdQuery = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfSource }
     *     
     */
    public TypeOfSource getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfSource }
     *     
     */
    public void setSourceType(TypeOfSource value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the started property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStarted() {
        return started;
    }

    /**
     * Sets the value of the started property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStarted(XMLGregorianCalendar value) {
        this.started = value;
    }

    /**
     * Gets the value of the stcbSrcAsmtcarecalc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStcbSrcAsmtcarecalc() {
        return stcbSrcAsmtcarecalc;
    }

    /**
     * Sets the value of the stcbSrcAsmtcarecalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStcbSrcAsmtcarecalc(BigInteger value) {
        this.stcbSrcAsmtcarecalc = value;
    }

    /**
     * Gets the value of the takenAssessmentCC property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTakenAssessmentCC() {
        return takenAssessmentCC;
    }

    /**
     * Sets the value of the takenAssessmentCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTakenAssessmentCC(BigInteger value) {
        this.takenAssessmentCC = value;
    }

    /**
     * Gets the value of the takenAssessmentCCBase property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTakenAssessmentCCBase() {
        return takenAssessmentCCBase;
    }

    /**
     * Sets the value of the takenAssessmentCCBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTakenAssessmentCCBase(BigInteger value) {
        this.takenAssessmentCCBase = value;
    }

    /**
     * Gets the value of the terminated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminated() {
        return terminated;
    }

    /**
     * Sets the value of the terminated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminated(XMLGregorianCalendar value) {
        this.terminated = value;
    }

    /**
     * Gets the value of the transfer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransfer() {
        return transfer;
    }

    /**
     * Sets the value of the transfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransfer(BigInteger value) {
        this.transfer = value;
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
     * Gets the value of the welcomeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWelcomeText() {
        return welcomeText;
    }

    /**
     * Sets the value of the welcomeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWelcomeText(String value) {
        this.welcomeText = value;
    }

    /**
     * Gets the value of the lastGatekeeperActionAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastGatekeeperActionAt() {
        return lastGatekeeperActionAt;
    }

    /**
     * Sets the value of the lastGatekeeperActionAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastGatekeeperActionAt(XMLGregorianCalendar value) {
        this.lastGatekeeperActionAt = value;
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
     *         &lt;element name="recipient" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
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
        "recipient"
    })
    public static class Recipients {

        protected List<BigInteger> recipient;

        /**
         * Gets the value of the recipient property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recipient property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecipient().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getRecipient() {
            if (recipient == null) {
                recipient = new ArrayList<BigInteger>();
            }
            return this.recipient;
        }

    }

}
