
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
import com.click4care.thinkhealth.core.dto.TypeOfLetterStatus;


/**
 * <p>Java class for sentLetter_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sentLetter_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="affiliatedAppeal" type="{http://www.click4care.com/thinkhealth/6.5/dto}appeal_type" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="affiliatedCase" type="{http://www.click4care.com/thinkhealth/6.5/dto}case_type"/>
 *           &lt;element name="affiliatedCaseRequest" type="{http://www.click4care.com/thinkhealth/6.5/dto}case_request_type"/>
 *           &lt;element name="affiliatedCareManagementProject" type="{http://www.click4care.com/thinkhealth/6.5/dto}care_management_project_type"/>
 *           &lt;element name="affiliatedCareManagementProjectRequest" type="{http://www.click4care.com/thinkhealth/6.5/dto}careManagementProjectRequest_type"/>
 *         &lt;/choice>
 *         &lt;element name="affiliatedMedicalService" type="{http://www.click4care.com/thinkhealth/6.5/dto}medicalService_type" minOccurs="0"/>
 *         &lt;element name="affiliatedMember" type="{http://www.click4care.com/thinkhealth/6.5/dto}member_type" minOccurs="0"/>
 *         &lt;element name="affiliatedProvider" type="{http://www.click4care.com/thinkhealth/6.5/dto}provider_type" minOccurs="0"/>
 *         &lt;element name="affiliatedUmDiagnosis" type="{http://www.click4care.com/thinkhealth/6.5/dto}um_diagnosis_type" minOccurs="0"/>
 *         &lt;element name="affiliatedUmEvent" type="{http://www.click4care.com/thinkhealth/6.5/dto}umEvent_type" minOccurs="0"/>
 *         &lt;element name="affiliatedUmEventRequest" type="{http://www.click4care.com/thinkhealth/6.5/dto}umRequest_type" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.click4care.com/thinkhealth/6.5/dto}wpContent_type" minOccurs="0"/>
 *         &lt;element name="contentBottomMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contentContainsImage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contentContainsLetterhead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contentHeight" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contentLeftMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentPageSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contentRightMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contentTopMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contentWidth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="envelopebackBottomMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="envelopebackContainsImage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="envelopebackContainsLetterhead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="envelopebackContent" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="envelopebackHeight" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="envelopebackLeftMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="envelopebackName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="envelopebackPageSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="envelopebackRightMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="envelopebackTopMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="envelopebackWidth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="envelopefrontBottomMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="envelopefrontContainsImage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="envelopefrontContainsLetterhead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="envelopefrontContent" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="envelopefrontHeight" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="envelopefrontLeftMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="envelopefrontName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="envelopefrontPageSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="envelopefrontRightMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="envelopefrontTopMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="envelopefrontWidth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="faxCoverpageBottomMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="faxCoverpageContainsImage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="faxCoverpageContainsLetterhead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="faxCoverpageContent" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="faxCoverpageHeight" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="faxCoverpageLeftMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="faxCoverpageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faxCoverpagePageSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="faxCoverpageRightMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="faxCoverpageTopMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="faxCoverpageWidth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lblBottomMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lblContainsImage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lblContainsLetterhead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lblContent" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lblHeight" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lblLeftMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lblName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lblPageSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lblRightMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lblTopMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lblWidth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="recipients" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="recipient" type="{http://www.click4care.com/thinkhealth/6.5/dto}letterRecipient_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sender" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sentTask" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfLetterStatus" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="virtualQueueC4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="virtualQueueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="virtualQueueUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sentLetter_type", propOrder = {
    "affiliatedAppeal",
    "affiliatedCase",
    "affiliatedCaseRequest",
    "affiliatedCareManagementProject",
    "affiliatedCareManagementProjectRequest",
    "affiliatedMedicalService",
    "affiliatedMember",
    "affiliatedProvider",
    "affiliatedUmDiagnosis",
    "affiliatedUmEvent",
    "affiliatedUmEventRequest",
    "c4CId",
    "content",
    "contentBottomMargin",
    "contentContainsImage",
    "contentContainsLetterhead",
    "contentHeight",
    "contentLeftMargin",
    "contentName",
    "contentPageSize",
    "contentRightMargin",
    "contentTopMargin",
    "contentWidth",
    "createdDate",
    "deletedDate",
    "envelopebackBottomMargin",
    "envelopebackContainsImage",
    "envelopebackContainsLetterhead",
    "envelopebackContent",
    "envelopebackHeight",
    "envelopebackLeftMargin",
    "envelopebackName",
    "envelopebackPageSize",
    "envelopebackRightMargin",
    "envelopebackTopMargin",
    "envelopebackWidth",
    "envelopefrontBottomMargin",
    "envelopefrontContainsImage",
    "envelopefrontContainsLetterhead",
    "envelopefrontContent",
    "envelopefrontHeight",
    "envelopefrontLeftMargin",
    "envelopefrontName",
    "envelopefrontPageSize",
    "envelopefrontRightMargin",
    "envelopefrontTopMargin",
    "envelopefrontWidth",
    "faxCoverpageBottomMargin",
    "faxCoverpageContainsImage",
    "faxCoverpageContainsLetterhead",
    "faxCoverpageContent",
    "faxCoverpageHeight",
    "faxCoverpageLeftMargin",
    "faxCoverpageName",
    "faxCoverpagePageSize",
    "faxCoverpageRightMargin",
    "faxCoverpageTopMargin",
    "faxCoverpageWidth",
    "id",
    "lastActionDate",
    "lblBottomMargin",
    "lblContainsImage",
    "lblContainsLetterhead",
    "lblContent",
    "lblHeight",
    "lblLeftMargin",
    "lblName",
    "lblPageSize",
    "lblRightMargin",
    "lblTopMargin",
    "lblWidth",
    "recipients",
    "sender",
    "sentTask",
    "status",
    "subject",
    "universalId",
    "version",
    "virtualQueueC4CId",
    "virtualQueueName",
    "virtualQueueUniversalId",
    "visibility"
})
public class SentLetterType {

    protected AppealType affiliatedAppeal;
    protected CaseType affiliatedCase;
    protected CaseRequestType affiliatedCaseRequest;
    protected CareManagementProjectType affiliatedCareManagementProject;
    protected CareManagementProjectRequestType affiliatedCareManagementProjectRequest;
    protected MedicalServiceType affiliatedMedicalService;
    protected MemberType affiliatedMember;
    protected ProviderType affiliatedProvider;
    protected UmDiagnosisType affiliatedUmDiagnosis;
    protected UmEventType affiliatedUmEvent;
    protected UmRequestType affiliatedUmEventRequest;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected WpContentType content;
    protected BigInteger contentBottomMargin;
    protected Boolean contentContainsImage;
    protected Boolean contentContainsLetterhead;
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
    protected XMLGregorianCalendar deletedDate;
    protected BigInteger envelopebackBottomMargin;
    protected Boolean envelopebackContainsImage;
    protected Boolean envelopebackContainsLetterhead;
    protected BigInteger envelopebackContent;
    protected BigInteger envelopebackHeight;
    protected BigInteger envelopebackLeftMargin;
    protected String envelopebackName;
    protected BigInteger envelopebackPageSize;
    protected BigInteger envelopebackRightMargin;
    protected BigInteger envelopebackTopMargin;
    protected BigInteger envelopebackWidth;
    protected BigInteger envelopefrontBottomMargin;
    protected Boolean envelopefrontContainsImage;
    protected Boolean envelopefrontContainsLetterhead;
    protected BigInteger envelopefrontContent;
    protected BigInteger envelopefrontHeight;
    protected BigInteger envelopefrontLeftMargin;
    protected String envelopefrontName;
    protected BigInteger envelopefrontPageSize;
    protected BigInteger envelopefrontRightMargin;
    protected BigInteger envelopefrontTopMargin;
    protected BigInteger envelopefrontWidth;
    protected BigInteger faxCoverpageBottomMargin;
    protected Boolean faxCoverpageContainsImage;
    protected Boolean faxCoverpageContainsLetterhead;
    protected BigInteger faxCoverpageContent;
    protected BigInteger faxCoverpageHeight;
    protected BigInteger faxCoverpageLeftMargin;
    protected String faxCoverpageName;
    protected BigInteger faxCoverpagePageSize;
    protected BigInteger faxCoverpageRightMargin;
    protected BigInteger faxCoverpageTopMargin;
    protected BigInteger faxCoverpageWidth;
    @XmlElement(required = true)
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected BigInteger lblBottomMargin;
    protected Boolean lblContainsImage;
    protected Boolean lblContainsLetterhead;
    protected BigInteger lblContent;
    protected BigInteger lblHeight;
    protected BigInteger lblLeftMargin;
    protected String lblName;
    protected BigInteger lblPageSize;
    protected BigInteger lblRightMargin;
    protected BigInteger lblTopMargin;
    protected BigInteger lblWidth;
    protected SentLetterType.Recipients recipients;
    protected BigInteger sender;
    protected BigInteger sentTask;
    @XmlSchemaType(name = "string")
    protected TypeOfLetterStatus status;
    protected String subject;
    protected String universalId;
    protected BigInteger version;
    @XmlElement(name = "virtualQueueC4cId")
    protected String virtualQueueC4CId;
    protected String virtualQueueName;
    protected String virtualQueueUniversalId;
    protected BigInteger visibility;

    /**
     * Gets the value of the affiliatedAppeal property.
     * 
     * @return
     *     possible object is
     *     {@link AppealType }
     *     
     */
    public AppealType getAffiliatedAppeal() {
        return affiliatedAppeal;
    }

    /**
     * Sets the value of the affiliatedAppeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppealType }
     *     
     */
    public void setAffiliatedAppeal(AppealType value) {
        this.affiliatedAppeal = value;
    }

    /**
     * Gets the value of the affiliatedCase property.
     * 
     * @return
     *     possible object is
     *     {@link CaseType }
     *     
     */
    public CaseType getAffiliatedCase() {
        return affiliatedCase;
    }

    /**
     * Sets the value of the affiliatedCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseType }
     *     
     */
    public void setAffiliatedCase(CaseType value) {
        this.affiliatedCase = value;
    }

    /**
     * Gets the value of the affiliatedCaseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CaseRequestType }
     *     
     */
    public CaseRequestType getAffiliatedCaseRequest() {
        return affiliatedCaseRequest;
    }

    /**
     * Sets the value of the affiliatedCaseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseRequestType }
     *     
     */
    public void setAffiliatedCaseRequest(CaseRequestType value) {
        this.affiliatedCaseRequest = value;
    }

    /**
     * Gets the value of the affiliatedCareManagementProject property.
     * 
     * @return
     *     possible object is
     *     {@link CareManagementProjectType }
     *     
     */
    public CareManagementProjectType getAffiliatedCareManagementProject() {
        return affiliatedCareManagementProject;
    }

    /**
     * Sets the value of the affiliatedCareManagementProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareManagementProjectType }
     *     
     */
    public void setAffiliatedCareManagementProject(CareManagementProjectType value) {
        this.affiliatedCareManagementProject = value;
    }

    /**
     * Gets the value of the affiliatedCareManagementProjectRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CareManagementProjectRequestType }
     *     
     */
    public CareManagementProjectRequestType getAffiliatedCareManagementProjectRequest() {
        return affiliatedCareManagementProjectRequest;
    }

    /**
     * Sets the value of the affiliatedCareManagementProjectRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareManagementProjectRequestType }
     *     
     */
    public void setAffiliatedCareManagementProjectRequest(CareManagementProjectRequestType value) {
        this.affiliatedCareManagementProjectRequest = value;
    }

    /**
     * Gets the value of the affiliatedMedicalService property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalServiceType }
     *     
     */
    public MedicalServiceType getAffiliatedMedicalService() {
        return affiliatedMedicalService;
    }

    /**
     * Sets the value of the affiliatedMedicalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalServiceType }
     *     
     */
    public void setAffiliatedMedicalService(MedicalServiceType value) {
        this.affiliatedMedicalService = value;
    }

    /**
     * Gets the value of the affiliatedMember property.
     * 
     * @return
     *     possible object is
     *     {@link MemberType }
     *     
     */
    public MemberType getAffiliatedMember() {
        return affiliatedMember;
    }

    /**
     * Sets the value of the affiliatedMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberType }
     *     
     */
    public void setAffiliatedMember(MemberType value) {
        this.affiliatedMember = value;
    }

    /**
     * Gets the value of the affiliatedProvider property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderType }
     *     
     */
    public ProviderType getAffiliatedProvider() {
        return affiliatedProvider;
    }

    /**
     * Sets the value of the affiliatedProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderType }
     *     
     */
    public void setAffiliatedProvider(ProviderType value) {
        this.affiliatedProvider = value;
    }

    /**
     * Gets the value of the affiliatedUmDiagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link UmDiagnosisType }
     *     
     */
    public UmDiagnosisType getAffiliatedUmDiagnosis() {
        return affiliatedUmDiagnosis;
    }

    /**
     * Sets the value of the affiliatedUmDiagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link UmDiagnosisType }
     *     
     */
    public void setAffiliatedUmDiagnosis(UmDiagnosisType value) {
        this.affiliatedUmDiagnosis = value;
    }

    /**
     * Gets the value of the affiliatedUmEvent property.
     * 
     * @return
     *     possible object is
     *     {@link UmEventType }
     *     
     */
    public UmEventType getAffiliatedUmEvent() {
        return affiliatedUmEvent;
    }

    /**
     * Sets the value of the affiliatedUmEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link UmEventType }
     *     
     */
    public void setAffiliatedUmEvent(UmEventType value) {
        this.affiliatedUmEvent = value;
    }

    /**
     * Gets the value of the affiliatedUmEventRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UmRequestType }
     *     
     */
    public UmRequestType getAffiliatedUmEventRequest() {
        return affiliatedUmEventRequest;
    }

    /**
     * Sets the value of the affiliatedUmEventRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UmRequestType }
     *     
     */
    public void setAffiliatedUmEventRequest(UmRequestType value) {
        this.affiliatedUmEventRequest = value;
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
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link WpContentType }
     *     
     */
    public WpContentType getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link WpContentType }
     *     
     */
    public void setContent(WpContentType value) {
        this.content = value;
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
     * Gets the value of the envelopebackBottomMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnvelopebackBottomMargin() {
        return envelopebackBottomMargin;
    }

    /**
     * Sets the value of the envelopebackBottomMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnvelopebackBottomMargin(BigInteger value) {
        this.envelopebackBottomMargin = value;
    }

    /**
     * Gets the value of the envelopebackContainsImage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnvelopebackContainsImage() {
        return envelopebackContainsImage;
    }

    /**
     * Sets the value of the envelopebackContainsImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnvelopebackContainsImage(Boolean value) {
        this.envelopebackContainsImage = value;
    }

    /**
     * Gets the value of the envelopebackContainsLetterhead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnvelopebackContainsLetterhead() {
        return envelopebackContainsLetterhead;
    }

    /**
     * Sets the value of the envelopebackContainsLetterhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnvelopebackContainsLetterhead(Boolean value) {
        this.envelopebackContainsLetterhead = value;
    }

    /**
     * Gets the value of the envelopebackContent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnvelopebackContent() {
        return envelopebackContent;
    }

    /**
     * Sets the value of the envelopebackContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnvelopebackContent(BigInteger value) {
        this.envelopebackContent = value;
    }

    /**
     * Gets the value of the envelopebackHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnvelopebackHeight() {
        return envelopebackHeight;
    }

    /**
     * Sets the value of the envelopebackHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnvelopebackHeight(BigInteger value) {
        this.envelopebackHeight = value;
    }

    /**
     * Gets the value of the envelopebackLeftMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnvelopebackLeftMargin() {
        return envelopebackLeftMargin;
    }

    /**
     * Sets the value of the envelopebackLeftMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnvelopebackLeftMargin(BigInteger value) {
        this.envelopebackLeftMargin = value;
    }

    /**
     * Gets the value of the envelopebackName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvelopebackName() {
        return envelopebackName;
    }

    /**
     * Sets the value of the envelopebackName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvelopebackName(String value) {
        this.envelopebackName = value;
    }

    /**
     * Gets the value of the envelopebackPageSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnvelopebackPageSize() {
        return envelopebackPageSize;
    }

    /**
     * Sets the value of the envelopebackPageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnvelopebackPageSize(BigInteger value) {
        this.envelopebackPageSize = value;
    }

    /**
     * Gets the value of the envelopebackRightMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnvelopebackRightMargin() {
        return envelopebackRightMargin;
    }

    /**
     * Sets the value of the envelopebackRightMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnvelopebackRightMargin(BigInteger value) {
        this.envelopebackRightMargin = value;
    }

    /**
     * Gets the value of the envelopebackTopMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnvelopebackTopMargin() {
        return envelopebackTopMargin;
    }

    /**
     * Sets the value of the envelopebackTopMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnvelopebackTopMargin(BigInteger value) {
        this.envelopebackTopMargin = value;
    }

    /**
     * Gets the value of the envelopebackWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnvelopebackWidth() {
        return envelopebackWidth;
    }

    /**
     * Sets the value of the envelopebackWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnvelopebackWidth(BigInteger value) {
        this.envelopebackWidth = value;
    }

    /**
     * Gets the value of the envelopefrontBottomMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnvelopefrontBottomMargin() {
        return envelopefrontBottomMargin;
    }

    /**
     * Sets the value of the envelopefrontBottomMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnvelopefrontBottomMargin(BigInteger value) {
        this.envelopefrontBottomMargin = value;
    }

    /**
     * Gets the value of the envelopefrontContainsImage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnvelopefrontContainsImage() {
        return envelopefrontContainsImage;
    }

    /**
     * Sets the value of the envelopefrontContainsImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnvelopefrontContainsImage(Boolean value) {
        this.envelopefrontContainsImage = value;
    }

    /**
     * Gets the value of the envelopefrontContainsLetterhead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnvelopefrontContainsLetterhead() {
        return envelopefrontContainsLetterhead;
    }

    /**
     * Sets the value of the envelopefrontContainsLetterhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnvelopefrontContainsLetterhead(Boolean value) {
        this.envelopefrontContainsLetterhead = value;
    }

    /**
     * Gets the value of the envelopefrontContent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnvelopefrontContent() {
        return envelopefrontContent;
    }

    /**
     * Sets the value of the envelopefrontContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnvelopefrontContent(BigInteger value) {
        this.envelopefrontContent = value;
    }

    /**
     * Gets the value of the envelopefrontHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnvelopefrontHeight() {
        return envelopefrontHeight;
    }

    /**
     * Sets the value of the envelopefrontHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnvelopefrontHeight(BigInteger value) {
        this.envelopefrontHeight = value;
    }

    /**
     * Gets the value of the envelopefrontLeftMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnvelopefrontLeftMargin() {
        return envelopefrontLeftMargin;
    }

    /**
     * Sets the value of the envelopefrontLeftMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnvelopefrontLeftMargin(BigInteger value) {
        this.envelopefrontLeftMargin = value;
    }

    /**
     * Gets the value of the envelopefrontName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvelopefrontName() {
        return envelopefrontName;
    }

    /**
     * Sets the value of the envelopefrontName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvelopefrontName(String value) {
        this.envelopefrontName = value;
    }

    /**
     * Gets the value of the envelopefrontPageSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnvelopefrontPageSize() {
        return envelopefrontPageSize;
    }

    /**
     * Sets the value of the envelopefrontPageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnvelopefrontPageSize(BigInteger value) {
        this.envelopefrontPageSize = value;
    }

    /**
     * Gets the value of the envelopefrontRightMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnvelopefrontRightMargin() {
        return envelopefrontRightMargin;
    }

    /**
     * Sets the value of the envelopefrontRightMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnvelopefrontRightMargin(BigInteger value) {
        this.envelopefrontRightMargin = value;
    }

    /**
     * Gets the value of the envelopefrontTopMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnvelopefrontTopMargin() {
        return envelopefrontTopMargin;
    }

    /**
     * Sets the value of the envelopefrontTopMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnvelopefrontTopMargin(BigInteger value) {
        this.envelopefrontTopMargin = value;
    }

    /**
     * Gets the value of the envelopefrontWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnvelopefrontWidth() {
        return envelopefrontWidth;
    }

    /**
     * Sets the value of the envelopefrontWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnvelopefrontWidth(BigInteger value) {
        this.envelopefrontWidth = value;
    }

    /**
     * Gets the value of the faxCoverpageBottomMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFaxCoverpageBottomMargin() {
        return faxCoverpageBottomMargin;
    }

    /**
     * Sets the value of the faxCoverpageBottomMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFaxCoverpageBottomMargin(BigInteger value) {
        this.faxCoverpageBottomMargin = value;
    }

    /**
     * Gets the value of the faxCoverpageContainsImage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFaxCoverpageContainsImage() {
        return faxCoverpageContainsImage;
    }

    /**
     * Sets the value of the faxCoverpageContainsImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFaxCoverpageContainsImage(Boolean value) {
        this.faxCoverpageContainsImage = value;
    }

    /**
     * Gets the value of the faxCoverpageContainsLetterhead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFaxCoverpageContainsLetterhead() {
        return faxCoverpageContainsLetterhead;
    }

    /**
     * Sets the value of the faxCoverpageContainsLetterhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFaxCoverpageContainsLetterhead(Boolean value) {
        this.faxCoverpageContainsLetterhead = value;
    }

    /**
     * Gets the value of the faxCoverpageContent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFaxCoverpageContent() {
        return faxCoverpageContent;
    }

    /**
     * Sets the value of the faxCoverpageContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFaxCoverpageContent(BigInteger value) {
        this.faxCoverpageContent = value;
    }

    /**
     * Gets the value of the faxCoverpageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFaxCoverpageHeight() {
        return faxCoverpageHeight;
    }

    /**
     * Sets the value of the faxCoverpageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFaxCoverpageHeight(BigInteger value) {
        this.faxCoverpageHeight = value;
    }

    /**
     * Gets the value of the faxCoverpageLeftMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFaxCoverpageLeftMargin() {
        return faxCoverpageLeftMargin;
    }

    /**
     * Sets the value of the faxCoverpageLeftMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFaxCoverpageLeftMargin(BigInteger value) {
        this.faxCoverpageLeftMargin = value;
    }

    /**
     * Gets the value of the faxCoverpageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxCoverpageName() {
        return faxCoverpageName;
    }

    /**
     * Sets the value of the faxCoverpageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxCoverpageName(String value) {
        this.faxCoverpageName = value;
    }

    /**
     * Gets the value of the faxCoverpagePageSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFaxCoverpagePageSize() {
        return faxCoverpagePageSize;
    }

    /**
     * Sets the value of the faxCoverpagePageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFaxCoverpagePageSize(BigInteger value) {
        this.faxCoverpagePageSize = value;
    }

    /**
     * Gets the value of the faxCoverpageRightMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFaxCoverpageRightMargin() {
        return faxCoverpageRightMargin;
    }

    /**
     * Sets the value of the faxCoverpageRightMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFaxCoverpageRightMargin(BigInteger value) {
        this.faxCoverpageRightMargin = value;
    }

    /**
     * Gets the value of the faxCoverpageTopMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFaxCoverpageTopMargin() {
        return faxCoverpageTopMargin;
    }

    /**
     * Sets the value of the faxCoverpageTopMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFaxCoverpageTopMargin(BigInteger value) {
        this.faxCoverpageTopMargin = value;
    }

    /**
     * Gets the value of the faxCoverpageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFaxCoverpageWidth() {
        return faxCoverpageWidth;
    }

    /**
     * Sets the value of the faxCoverpageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFaxCoverpageWidth(BigInteger value) {
        this.faxCoverpageWidth = value;
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
     * Gets the value of the lblBottomMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLblBottomMargin() {
        return lblBottomMargin;
    }

    /**
     * Sets the value of the lblBottomMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLblBottomMargin(BigInteger value) {
        this.lblBottomMargin = value;
    }

    /**
     * Gets the value of the lblContainsImage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLblContainsImage() {
        return lblContainsImage;
    }

    /**
     * Sets the value of the lblContainsImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLblContainsImage(Boolean value) {
        this.lblContainsImage = value;
    }

    /**
     * Gets the value of the lblContainsLetterhead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLblContainsLetterhead() {
        return lblContainsLetterhead;
    }

    /**
     * Sets the value of the lblContainsLetterhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLblContainsLetterhead(Boolean value) {
        this.lblContainsLetterhead = value;
    }

    /**
     * Gets the value of the lblContent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLblContent() {
        return lblContent;
    }

    /**
     * Sets the value of the lblContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLblContent(BigInteger value) {
        this.lblContent = value;
    }

    /**
     * Gets the value of the lblHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLblHeight() {
        return lblHeight;
    }

    /**
     * Sets the value of the lblHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLblHeight(BigInteger value) {
        this.lblHeight = value;
    }

    /**
     * Gets the value of the lblLeftMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLblLeftMargin() {
        return lblLeftMargin;
    }

    /**
     * Sets the value of the lblLeftMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLblLeftMargin(BigInteger value) {
        this.lblLeftMargin = value;
    }

    /**
     * Gets the value of the lblName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLblName() {
        return lblName;
    }

    /**
     * Sets the value of the lblName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLblName(String value) {
        this.lblName = value;
    }

    /**
     * Gets the value of the lblPageSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLblPageSize() {
        return lblPageSize;
    }

    /**
     * Sets the value of the lblPageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLblPageSize(BigInteger value) {
        this.lblPageSize = value;
    }

    /**
     * Gets the value of the lblRightMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLblRightMargin() {
        return lblRightMargin;
    }

    /**
     * Sets the value of the lblRightMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLblRightMargin(BigInteger value) {
        this.lblRightMargin = value;
    }

    /**
     * Gets the value of the lblTopMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLblTopMargin() {
        return lblTopMargin;
    }

    /**
     * Sets the value of the lblTopMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLblTopMargin(BigInteger value) {
        this.lblTopMargin = value;
    }

    /**
     * Gets the value of the lblWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLblWidth() {
        return lblWidth;
    }

    /**
     * Sets the value of the lblWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLblWidth(BigInteger value) {
        this.lblWidth = value;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * @return
     *     possible object is
     *     {@link SentLetterType.Recipients }
     *     
     */
    public SentLetterType.Recipients getRecipients() {
        return recipients;
    }

    /**
     * Sets the value of the recipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link SentLetterType.Recipients }
     *     
     */
    public void setRecipients(SentLetterType.Recipients value) {
        this.recipients = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSender(BigInteger value) {
        this.sender = value;
    }

    /**
     * Gets the value of the sentTask property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSentTask() {
        return sentTask;
    }

    /**
     * Sets the value of the sentTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSentTask(BigInteger value) {
        this.sentTask = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfLetterStatus }
     *     
     */
    public TypeOfLetterStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfLetterStatus }
     *     
     */
    public void setStatus(TypeOfLetterStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
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
     * Gets the value of the virtualQueueC4CId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualQueueC4CId() {
        return virtualQueueC4CId;
    }

    /**
     * Sets the value of the virtualQueueC4CId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualQueueC4CId(String value) {
        this.virtualQueueC4CId = value;
    }

    /**
     * Gets the value of the virtualQueueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualQueueName() {
        return virtualQueueName;
    }

    /**
     * Sets the value of the virtualQueueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualQueueName(String value) {
        this.virtualQueueName = value;
    }

    /**
     * Gets the value of the virtualQueueUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualQueueUniversalId() {
        return virtualQueueUniversalId;
    }

    /**
     * Sets the value of the virtualQueueUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualQueueUniversalId(String value) {
        this.virtualQueueUniversalId = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVisibility(BigInteger value) {
        this.visibility = value;
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
     *         &lt;element name="recipient" type="{http://www.click4care.com/thinkhealth/6.5/dto}letterRecipient_type" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<LetterRecipientType> recipient;

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
         * {@link LetterRecipientType }
         * 
         * 
         */
        public List<LetterRecipientType> getRecipient() {
            if (recipient == null) {
                recipient = new ArrayList<LetterRecipientType>();
            }
            return this.recipient;
        }

    }

}
