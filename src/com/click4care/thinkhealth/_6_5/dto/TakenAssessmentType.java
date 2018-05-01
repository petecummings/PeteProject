
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
import com.click4care.thinkhealth.core.dto.TypeOfObjectState;


/**
 * <p>Java class for taken_assessment_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taken_assessment_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessment" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="assessmentUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelledAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="caseAffiliationId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="caseAffiliationUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="completedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="currentQuestion" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="currentQuestionUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="disclaimerAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="member" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="memberAffiliationId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="memberAffiliationUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalCreator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="originalCreatorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ownerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectAffiliationId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="projectAffiliationUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="renderedAssessment" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="responses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="response" type="{http://www.click4care.com/thinkhealth/6.5/dto}response_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="retakenOriginal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="retakenOriginalUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="sentLetter" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sentTask" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="startedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfObjectState" minOccurs="0"/>
 *         &lt;element name="umAffiliationId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="umAffiliationUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "taken_assessment_type", propOrder = {
    "assessment",
    "assessmentUniversalId",
    "c4CId",
    "cancelledAt",
    "caseAffiliationId",
    "caseAffiliationUniversalId",
    "completedAt",
    "createdDate",
    "currentQuestion",
    "currentQuestionUniversalId",
    "deletedDate",
    "disclaimerAccepted",
    "id",
    "lastActionDate",
    "member",
    "memberAffiliationId",
    "memberAffiliationUniversalId",
    "memberUniversalId",
    "originalCreator",
    "originalCreatorUniversalId",
    "owner",
    "ownerUniversalId",
    "projectAffiliationId",
    "projectAffiliationUniversalId",
    "renderedAssessment",
    "responses",
    "retakenOriginal",
    "retakenOriginalUniversalId",
    "score",
    "sentLetter",
    "sentTask",
    "startedAt",
    "status",
    "umAffiliationId",
    "umAffiliationUniversalId",
    "universalId",
    "version"
})
public class TakenAssessmentType {

    protected BigInteger assessment;
    protected String assessmentUniversalId;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelledAt;
    protected BigInteger caseAffiliationId;
    protected String caseAffiliationUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completedAt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected BigInteger currentQuestion;
    protected String currentQuestionUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected Boolean disclaimerAccepted;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected BigInteger member;
    protected BigInteger memberAffiliationId;
    protected String memberAffiliationUniversalId;
    protected String memberUniversalId;
    protected BigInteger originalCreator;
    protected String originalCreatorUniversalId;
    protected BigInteger owner;
    protected String ownerUniversalId;
    protected BigInteger projectAffiliationId;
    protected String projectAffiliationUniversalId;
    protected byte[] renderedAssessment;
    protected TakenAssessmentType.Responses responses;
    protected BigInteger retakenOriginal;
    protected String retakenOriginalUniversalId;
    protected Double score;
    protected BigInteger sentLetter;
    protected BigInteger sentTask;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startedAt;
    @XmlSchemaType(name = "string")
    protected TypeOfObjectState status;
    protected BigInteger umAffiliationId;
    protected String umAffiliationUniversalId;
    protected String universalId;
    protected BigInteger version;

    /**
     * Gets the value of the assessment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssessment() {
        return assessment;
    }

    /**
     * Sets the value of the assessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssessment(BigInteger value) {
        this.assessment = value;
    }

    /**
     * Gets the value of the assessmentUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentUniversalId() {
        return assessmentUniversalId;
    }

    /**
     * Sets the value of the assessmentUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentUniversalId(String value) {
        this.assessmentUniversalId = value;
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
     * Gets the value of the cancelledAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelledAt() {
        return cancelledAt;
    }

    /**
     * Sets the value of the cancelledAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelledAt(XMLGregorianCalendar value) {
        this.cancelledAt = value;
    }

    /**
     * Gets the value of the caseAffiliationId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCaseAffiliationId() {
        return caseAffiliationId;
    }

    /**
     * Sets the value of the caseAffiliationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCaseAffiliationId(BigInteger value) {
        this.caseAffiliationId = value;
    }

    /**
     * Gets the value of the caseAffiliationUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseAffiliationUniversalId() {
        return caseAffiliationUniversalId;
    }

    /**
     * Sets the value of the caseAffiliationUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseAffiliationUniversalId(String value) {
        this.caseAffiliationUniversalId = value;
    }

    /**
     * Gets the value of the completedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletedAt() {
        return completedAt;
    }

    /**
     * Sets the value of the completedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletedAt(XMLGregorianCalendar value) {
        this.completedAt = value;
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
     * Gets the value of the currentQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentQuestion() {
        return currentQuestion;
    }

    /**
     * Sets the value of the currentQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentQuestion(BigInteger value) {
        this.currentQuestion = value;
    }

    /**
     * Gets the value of the currentQuestionUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentQuestionUniversalId() {
        return currentQuestionUniversalId;
    }

    /**
     * Sets the value of the currentQuestionUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentQuestionUniversalId(String value) {
        this.currentQuestionUniversalId = value;
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
     * Gets the value of the disclaimerAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisclaimerAccepted() {
        return disclaimerAccepted;
    }

    /**
     * Sets the value of the disclaimerAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisclaimerAccepted(Boolean value) {
        this.disclaimerAccepted = value;
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
     * Gets the value of the member property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMember() {
        return member;
    }

    /**
     * Sets the value of the member property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMember(BigInteger value) {
        this.member = value;
    }

    /**
     * Gets the value of the memberAffiliationId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMemberAffiliationId() {
        return memberAffiliationId;
    }

    /**
     * Sets the value of the memberAffiliationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMemberAffiliationId(BigInteger value) {
        this.memberAffiliationId = value;
    }

    /**
     * Gets the value of the memberAffiliationUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberAffiliationUniversalId() {
        return memberAffiliationUniversalId;
    }

    /**
     * Sets the value of the memberAffiliationUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberAffiliationUniversalId(String value) {
        this.memberAffiliationUniversalId = value;
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
     * Gets the value of the originalCreator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginalCreator() {
        return originalCreator;
    }

    /**
     * Sets the value of the originalCreator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginalCreator(BigInteger value) {
        this.originalCreator = value;
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
     * Gets the value of the projectAffiliationId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProjectAffiliationId() {
        return projectAffiliationId;
    }

    /**
     * Sets the value of the projectAffiliationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProjectAffiliationId(BigInteger value) {
        this.projectAffiliationId = value;
    }

    /**
     * Gets the value of the projectAffiliationUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectAffiliationUniversalId() {
        return projectAffiliationUniversalId;
    }

    /**
     * Sets the value of the projectAffiliationUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectAffiliationUniversalId(String value) {
        this.projectAffiliationUniversalId = value;
    }

    /**
     * Gets the value of the renderedAssessment property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRenderedAssessment() {
        return renderedAssessment;
    }

    /**
     * Sets the value of the renderedAssessment property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRenderedAssessment(byte[] value) {
        this.renderedAssessment = value;
    }

    /**
     * Gets the value of the responses property.
     * 
     * @return
     *     possible object is
     *     {@link TakenAssessmentType.Responses }
     *     
     */
    public TakenAssessmentType.Responses getResponses() {
        return responses;
    }

    /**
     * Sets the value of the responses property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakenAssessmentType.Responses }
     *     
     */
    public void setResponses(TakenAssessmentType.Responses value) {
        this.responses = value;
    }

    /**
     * Gets the value of the retakenOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRetakenOriginal() {
        return retakenOriginal;
    }

    /**
     * Sets the value of the retakenOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRetakenOriginal(BigInteger value) {
        this.retakenOriginal = value;
    }

    /**
     * Gets the value of the retakenOriginalUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetakenOriginalUniversalId() {
        return retakenOriginalUniversalId;
    }

    /**
     * Sets the value of the retakenOriginalUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetakenOriginalUniversalId(String value) {
        this.retakenOriginalUniversalId = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScore(Double value) {
        this.score = value;
    }

    /**
     * Gets the value of the sentLetter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSentLetter() {
        return sentLetter;
    }

    /**
     * Sets the value of the sentLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSentLetter(BigInteger value) {
        this.sentLetter = value;
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
     * Gets the value of the startedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartedAt() {
        return startedAt;
    }

    /**
     * Sets the value of the startedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartedAt(XMLGregorianCalendar value) {
        this.startedAt = value;
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
     * Gets the value of the umAffiliationId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUmAffiliationId() {
        return umAffiliationId;
    }

    /**
     * Sets the value of the umAffiliationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmAffiliationId(BigInteger value) {
        this.umAffiliationId = value;
    }

    /**
     * Gets the value of the umAffiliationUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmAffiliationUniversalId() {
        return umAffiliationUniversalId;
    }

    /**
     * Sets the value of the umAffiliationUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmAffiliationUniversalId(String value) {
        this.umAffiliationUniversalId = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="response" type="{http://www.click4care.com/thinkhealth/6.5/dto}response_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "response"
    })
    public static class Responses {

        protected List<ResponseType> response;

        /**
         * Gets the value of the response property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the response property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResponse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResponseType }
         * 
         * 
         */
        public List<ResponseType> getResponse() {
            if (response == null) {
                response = new ArrayList<ResponseType>();
            }
            return this.response;
        }

    }

}
