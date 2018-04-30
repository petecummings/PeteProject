
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfDeadline;
import com.click4care.thinkhealth.core.dto.TypeOfDeadlineTimeBlockUnit;
import com.click4care.thinkhealth.core.dto.TypeOfDetermination;
import com.click4care.thinkhealth.core.dto.TypeOfUmRequest;
import com.click4care.thinkhealth.core.dto.TypeOfUmRouting;


/**
 * <p>Java class for um_summary_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="um_summary_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acuity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="acuityDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acuityDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acuityUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="admitDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="authSeverity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="authSeverityDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authSeverityDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authSeverityUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authSrc" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="authSrcDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authSrcDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authSrcUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="authorizationTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clinicalDataEntryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customFields" type="{http://www.click4care.com/thinkhealth/6.5/dto}customFields_type" minOccurs="0"/>
 *         &lt;element name="deadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deadlineTimeBlock" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deadlineTimeBlockUnit" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDeadlineTimeBlockUnit" minOccurs="0"/>
 *         &lt;element name="deadlineType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDeadline" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="determination" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDetermination" minOccurs="0"/>
 *         &lt;element name="determinationDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dischargeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="initialContactDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="letter" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="member" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="memberUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="performingProvider" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="performingProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryProvider" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="primaryProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="priorityDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorityDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorityUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recommendedLengthOfStay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="releaseOfInfoDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="releaseOfInfoDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="releaseOfInfoId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="releaseOfInfoUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfUmRequest" minOccurs="0"/>
 *         &lt;element name="requestingProvider" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="requestingProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestor" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="requestorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routing" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfUmRouting" minOccurs="0"/>
 *         &lt;element name="routingPeer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="routingRecipient" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="routingRecipientUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="severity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="severityDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="severityDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="severityUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sourceDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="triageAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="triageDateDischarge" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="triageDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="triageDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="triageUnitType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="triageUnitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="triageUnitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="triageUnitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "um_summary_type", propOrder = {
    "acuity",
    "acuityDropDownListItemLabel",
    "acuityDropDownListName",
    "acuityUniversalId",
    "admitDate",
    "authSeverity",
    "authSeverityDropDownListItemLabel",
    "authSeverityDropDownListName",
    "authSeverityUniversalId",
    "authSrc",
    "authSrcDropDownListItemLabel",
    "authSrcDropDownListName",
    "authSrcUniversalId",
    "authorizationType",
    "authorizationTypeDropDownListItemLabel",
    "authorizationTypeDropDownListName",
    "authorizationTypeUniversalId",
    "c4CId",
    "clinicalDataEntryId",
    "comment",
    "createdDate",
    "customFields",
    "deadline",
    "deadlineTimeBlock",
    "deadlineTimeBlockUnit",
    "deadlineType",
    "deletedDate",
    "determination",
    "determinationDueDate",
    "dischargeDate",
    "id",
    "initialContactDate",
    "lastActionDate",
    "letter",
    "member",
    "memberUniversalId",
    "performingProvider",
    "performingProviderUniversalId",
    "primaryProvider",
    "primaryProviderUniversalId",
    "priority",
    "priorityDropDownListItemLabel",
    "priorityDropDownListName",
    "priorityUniversalId",
    "recommendedLengthOfStay",
    "releaseOfInfoDropDownListItemLabel",
    "releaseOfInfoDropDownListName",
    "releaseOfInfoId",
    "releaseOfInfoUniversalId",
    "requestType",
    "requestingProvider",
    "requestingProviderUniversalId",
    "requestor",
    "requestorUniversalId",
    "routing",
    "routingPeer",
    "routingRecipient",
    "routingRecipientUniversalId",
    "severity",
    "severityDropDownListItemLabel",
    "severityDropDownListName",
    "severityUniversalId",
    "source",
    "sourceDropDownListItemLabel",
    "sourceDropDownListName",
    "sourceUniversalId",
    "triageAmount",
    "triageDateDischarge",
    "triageDateFrom",
    "triageDateTo",
    "triageUnitType",
    "triageUnitTypeDropDownListItemLabel",
    "triageUnitTypeDropDownListName",
    "triageUnitTypeUniversalId",
    "type",
    "typeDropDownListItemLabel",
    "typeDropDownListName",
    "typeUniversalId",
    "universalId",
    "version"
})
@XmlSeeAlso({
    UmRequestSummaryType.class,
    UmEventSummaryType.class
})
public abstract class UmSummaryType {

    protected BigInteger acuity;
    protected String acuityDropDownListItemLabel;
    protected String acuityDropDownListName;
    protected String acuityUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar admitDate;
    protected BigInteger authSeverity;
    protected String authSeverityDropDownListItemLabel;
    protected String authSeverityDropDownListName;
    protected String authSeverityUniversalId;
    protected BigInteger authSrc;
    protected String authSrcDropDownListItemLabel;
    protected String authSrcDropDownListName;
    protected String authSrcUniversalId;
    protected BigInteger authorizationType;
    protected String authorizationTypeDropDownListItemLabel;
    protected String authorizationTypeDropDownListName;
    protected String authorizationTypeUniversalId;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected Long clinicalDataEntryId;
    protected String comment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected CustomFieldsType customFields;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deadline;
    protected BigInteger deadlineTimeBlock;
    @XmlSchemaType(name = "string")
    protected TypeOfDeadlineTimeBlockUnit deadlineTimeBlockUnit;
    @XmlSchemaType(name = "string")
    protected TypeOfDeadline deadlineType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    @XmlSchemaType(name = "string")
    protected TypeOfDetermination determination;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar determinationDueDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dischargeDate;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialContactDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected BigInteger letter;
    protected BigInteger member;
    protected String memberUniversalId;
    protected BigInteger performingProvider;
    protected String performingProviderUniversalId;
    protected BigInteger primaryProvider;
    protected String primaryProviderUniversalId;
    protected BigInteger priority;
    protected String priorityDropDownListItemLabel;
    protected String priorityDropDownListName;
    protected String priorityUniversalId;
    protected BigInteger recommendedLengthOfStay;
    protected String releaseOfInfoDropDownListItemLabel;
    protected String releaseOfInfoDropDownListName;
    protected BigInteger releaseOfInfoId;
    protected String releaseOfInfoUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfUmRequest requestType;
    protected BigInteger requestingProvider;
    protected String requestingProviderUniversalId;
    protected BigInteger requestor;
    protected String requestorUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfUmRouting routing;
    protected BigInteger routingPeer;
    protected BigInteger routingRecipient;
    protected String routingRecipientUniversalId;
    protected BigInteger severity;
    protected String severityDropDownListItemLabel;
    protected String severityDropDownListName;
    protected String severityUniversalId;
    protected BigInteger source;
    protected String sourceDropDownListItemLabel;
    protected String sourceDropDownListName;
    protected String sourceUniversalId;
    protected Long triageAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar triageDateDischarge;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar triageDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar triageDateTo;
    protected BigInteger triageUnitType;
    protected String triageUnitTypeDropDownListItemLabel;
    protected String triageUnitTypeDropDownListName;
    protected String triageUnitTypeUniversalId;
    protected BigInteger type;
    protected String typeDropDownListItemLabel;
    protected String typeDropDownListName;
    protected String typeUniversalId;
    protected String universalId;
    protected BigInteger version;

    /**
     * Gets the value of the acuity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcuity() {
        return acuity;
    }

    /**
     * Sets the value of the acuity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcuity(BigInteger value) {
        this.acuity = value;
    }

    /**
     * Gets the value of the acuityDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcuityDropDownListItemLabel() {
        return acuityDropDownListItemLabel;
    }

    /**
     * Sets the value of the acuityDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcuityDropDownListItemLabel(String value) {
        this.acuityDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the acuityDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcuityDropDownListName() {
        return acuityDropDownListName;
    }

    /**
     * Sets the value of the acuityDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcuityDropDownListName(String value) {
        this.acuityDropDownListName = value;
    }

    /**
     * Gets the value of the acuityUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcuityUniversalId() {
        return acuityUniversalId;
    }

    /**
     * Sets the value of the acuityUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcuityUniversalId(String value) {
        this.acuityUniversalId = value;
    }

    /**
     * Gets the value of the admitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdmitDate() {
        return admitDate;
    }

    /**
     * Sets the value of the admitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdmitDate(XMLGregorianCalendar value) {
        this.admitDate = value;
    }

    /**
     * Gets the value of the authSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthSeverity() {
        return authSeverity;
    }

    /**
     * Sets the value of the authSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthSeverity(BigInteger value) {
        this.authSeverity = value;
    }

    /**
     * Gets the value of the authSeverityDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthSeverityDropDownListItemLabel() {
        return authSeverityDropDownListItemLabel;
    }

    /**
     * Sets the value of the authSeverityDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthSeverityDropDownListItemLabel(String value) {
        this.authSeverityDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the authSeverityDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthSeverityDropDownListName() {
        return authSeverityDropDownListName;
    }

    /**
     * Sets the value of the authSeverityDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthSeverityDropDownListName(String value) {
        this.authSeverityDropDownListName = value;
    }

    /**
     * Gets the value of the authSeverityUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthSeverityUniversalId() {
        return authSeverityUniversalId;
    }

    /**
     * Sets the value of the authSeverityUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthSeverityUniversalId(String value) {
        this.authSeverityUniversalId = value;
    }

    /**
     * Gets the value of the authSrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthSrc() {
        return authSrc;
    }

    /**
     * Sets the value of the authSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthSrc(BigInteger value) {
        this.authSrc = value;
    }

    /**
     * Gets the value of the authSrcDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthSrcDropDownListItemLabel() {
        return authSrcDropDownListItemLabel;
    }

    /**
     * Sets the value of the authSrcDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthSrcDropDownListItemLabel(String value) {
        this.authSrcDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the authSrcDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthSrcDropDownListName() {
        return authSrcDropDownListName;
    }

    /**
     * Sets the value of the authSrcDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthSrcDropDownListName(String value) {
        this.authSrcDropDownListName = value;
    }

    /**
     * Gets the value of the authSrcUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthSrcUniversalId() {
        return authSrcUniversalId;
    }

    /**
     * Sets the value of the authSrcUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthSrcUniversalId(String value) {
        this.authSrcUniversalId = value;
    }

    /**
     * Gets the value of the authorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthorizationType() {
        return authorizationType;
    }

    /**
     * Sets the value of the authorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthorizationType(BigInteger value) {
        this.authorizationType = value;
    }

    /**
     * Gets the value of the authorizationTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationTypeDropDownListItemLabel() {
        return authorizationTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the authorizationTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationTypeDropDownListItemLabel(String value) {
        this.authorizationTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the authorizationTypeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationTypeDropDownListName() {
        return authorizationTypeDropDownListName;
    }

    /**
     * Sets the value of the authorizationTypeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationTypeDropDownListName(String value) {
        this.authorizationTypeDropDownListName = value;
    }

    /**
     * Gets the value of the authorizationTypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationTypeUniversalId() {
        return authorizationTypeUniversalId;
    }

    /**
     * Sets the value of the authorizationTypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationTypeUniversalId(String value) {
        this.authorizationTypeUniversalId = value;
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
     * Gets the value of the clinicalDataEntryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClinicalDataEntryId() {
        return clinicalDataEntryId;
    }

    /**
     * Sets the value of the clinicalDataEntryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClinicalDataEntryId(Long value) {
        this.clinicalDataEntryId = value;
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
     * Gets the value of the deadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeadline() {
        return deadline;
    }

    /**
     * Sets the value of the deadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeadline(XMLGregorianCalendar value) {
        this.deadline = value;
    }

    /**
     * Gets the value of the deadlineTimeBlock property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeadlineTimeBlock() {
        return deadlineTimeBlock;
    }

    /**
     * Sets the value of the deadlineTimeBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeadlineTimeBlock(BigInteger value) {
        this.deadlineTimeBlock = value;
    }

    /**
     * Gets the value of the deadlineTimeBlockUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDeadlineTimeBlockUnit }
     *     
     */
    public TypeOfDeadlineTimeBlockUnit getDeadlineTimeBlockUnit() {
        return deadlineTimeBlockUnit;
    }

    /**
     * Sets the value of the deadlineTimeBlockUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDeadlineTimeBlockUnit }
     *     
     */
    public void setDeadlineTimeBlockUnit(TypeOfDeadlineTimeBlockUnit value) {
        this.deadlineTimeBlockUnit = value;
    }

    /**
     * Gets the value of the deadlineType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDeadline }
     *     
     */
    public TypeOfDeadline getDeadlineType() {
        return deadlineType;
    }

    /**
     * Sets the value of the deadlineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDeadline }
     *     
     */
    public void setDeadlineType(TypeOfDeadline value) {
        this.deadlineType = value;
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
     * Gets the value of the determination property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDetermination }
     *     
     */
    public TypeOfDetermination getDetermination() {
        return determination;
    }

    /**
     * Sets the value of the determination property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDetermination }
     *     
     */
    public void setDetermination(TypeOfDetermination value) {
        this.determination = value;
    }

    /**
     * Gets the value of the determinationDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeterminationDueDate() {
        return determinationDueDate;
    }

    /**
     * Sets the value of the determinationDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeterminationDueDate(XMLGregorianCalendar value) {
        this.determinationDueDate = value;
    }

    /**
     * Gets the value of the dischargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDischargeDate() {
        return dischargeDate;
    }

    /**
     * Sets the value of the dischargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDischargeDate(XMLGregorianCalendar value) {
        this.dischargeDate = value;
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
     * Gets the value of the initialContactDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialContactDate() {
        return initialContactDate;
    }

    /**
     * Sets the value of the initialContactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialContactDate(XMLGregorianCalendar value) {
        this.initialContactDate = value;
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
     * Gets the value of the letter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLetter() {
        return letter;
    }

    /**
     * Sets the value of the letter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLetter(BigInteger value) {
        this.letter = value;
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
     * Gets the value of the performingProvider property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPerformingProvider() {
        return performingProvider;
    }

    /**
     * Sets the value of the performingProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPerformingProvider(BigInteger value) {
        this.performingProvider = value;
    }

    /**
     * Gets the value of the performingProviderUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformingProviderUniversalId() {
        return performingProviderUniversalId;
    }

    /**
     * Sets the value of the performingProviderUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformingProviderUniversalId(String value) {
        this.performingProviderUniversalId = value;
    }

    /**
     * Gets the value of the primaryProvider property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrimaryProvider() {
        return primaryProvider;
    }

    /**
     * Sets the value of the primaryProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrimaryProvider(BigInteger value) {
        this.primaryProvider = value;
    }

    /**
     * Gets the value of the primaryProviderUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryProviderUniversalId() {
        return primaryProviderUniversalId;
    }

    /**
     * Sets the value of the primaryProviderUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryProviderUniversalId(String value) {
        this.primaryProviderUniversalId = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the priorityDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityDropDownListItemLabel() {
        return priorityDropDownListItemLabel;
    }

    /**
     * Sets the value of the priorityDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityDropDownListItemLabel(String value) {
        this.priorityDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the priorityDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityDropDownListName() {
        return priorityDropDownListName;
    }

    /**
     * Sets the value of the priorityDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityDropDownListName(String value) {
        this.priorityDropDownListName = value;
    }

    /**
     * Gets the value of the priorityUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityUniversalId() {
        return priorityUniversalId;
    }

    /**
     * Sets the value of the priorityUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityUniversalId(String value) {
        this.priorityUniversalId = value;
    }

    /**
     * Gets the value of the recommendedLengthOfStay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecommendedLengthOfStay() {
        return recommendedLengthOfStay;
    }

    /**
     * Sets the value of the recommendedLengthOfStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecommendedLengthOfStay(BigInteger value) {
        this.recommendedLengthOfStay = value;
    }

    /**
     * Gets the value of the releaseOfInfoDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseOfInfoDropDownListItemLabel() {
        return releaseOfInfoDropDownListItemLabel;
    }

    /**
     * Sets the value of the releaseOfInfoDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseOfInfoDropDownListItemLabel(String value) {
        this.releaseOfInfoDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the releaseOfInfoDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseOfInfoDropDownListName() {
        return releaseOfInfoDropDownListName;
    }

    /**
     * Sets the value of the releaseOfInfoDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseOfInfoDropDownListName(String value) {
        this.releaseOfInfoDropDownListName = value;
    }

    /**
     * Gets the value of the releaseOfInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReleaseOfInfoId() {
        return releaseOfInfoId;
    }

    /**
     * Sets the value of the releaseOfInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReleaseOfInfoId(BigInteger value) {
        this.releaseOfInfoId = value;
    }

    /**
     * Gets the value of the releaseOfInfoUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseOfInfoUniversalId() {
        return releaseOfInfoUniversalId;
    }

    /**
     * Sets the value of the releaseOfInfoUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseOfInfoUniversalId(String value) {
        this.releaseOfInfoUniversalId = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfUmRequest }
     *     
     */
    public TypeOfUmRequest getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfUmRequest }
     *     
     */
    public void setRequestType(TypeOfUmRequest value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the requestingProvider property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestingProvider() {
        return requestingProvider;
    }

    /**
     * Sets the value of the requestingProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestingProvider(BigInteger value) {
        this.requestingProvider = value;
    }

    /**
     * Gets the value of the requestingProviderUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestingProviderUniversalId() {
        return requestingProviderUniversalId;
    }

    /**
     * Sets the value of the requestingProviderUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestingProviderUniversalId(String value) {
        this.requestingProviderUniversalId = value;
    }

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestor(BigInteger value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the requestorUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorUniversalId() {
        return requestorUniversalId;
    }

    /**
     * Sets the value of the requestorUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorUniversalId(String value) {
        this.requestorUniversalId = value;
    }

    /**
     * Gets the value of the routing property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfUmRouting }
     *     
     */
    public TypeOfUmRouting getRouting() {
        return routing;
    }

    /**
     * Sets the value of the routing property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfUmRouting }
     *     
     */
    public void setRouting(TypeOfUmRouting value) {
        this.routing = value;
    }

    /**
     * Gets the value of the routingPeer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoutingPeer() {
        return routingPeer;
    }

    /**
     * Sets the value of the routingPeer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoutingPeer(BigInteger value) {
        this.routingPeer = value;
    }

    /**
     * Gets the value of the routingRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoutingRecipient() {
        return routingRecipient;
    }

    /**
     * Sets the value of the routingRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoutingRecipient(BigInteger value) {
        this.routingRecipient = value;
    }

    /**
     * Gets the value of the routingRecipientUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingRecipientUniversalId() {
        return routingRecipientUniversalId;
    }

    /**
     * Sets the value of the routingRecipientUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingRecipientUniversalId(String value) {
        this.routingRecipientUniversalId = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeverity(BigInteger value) {
        this.severity = value;
    }

    /**
     * Gets the value of the severityDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverityDropDownListItemLabel() {
        return severityDropDownListItemLabel;
    }

    /**
     * Sets the value of the severityDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverityDropDownListItemLabel(String value) {
        this.severityDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the severityDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverityDropDownListName() {
        return severityDropDownListName;
    }

    /**
     * Sets the value of the severityDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverityDropDownListName(String value) {
        this.severityDropDownListName = value;
    }

    /**
     * Gets the value of the severityUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverityUniversalId() {
        return severityUniversalId;
    }

    /**
     * Sets the value of the severityUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverityUniversalId(String value) {
        this.severityUniversalId = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSource(BigInteger value) {
        this.source = value;
    }

    /**
     * Gets the value of the sourceDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDropDownListItemLabel() {
        return sourceDropDownListItemLabel;
    }

    /**
     * Sets the value of the sourceDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDropDownListItemLabel(String value) {
        this.sourceDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the sourceDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDropDownListName() {
        return sourceDropDownListName;
    }

    /**
     * Sets the value of the sourceDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDropDownListName(String value) {
        this.sourceDropDownListName = value;
    }

    /**
     * Gets the value of the sourceUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUniversalId() {
        return sourceUniversalId;
    }

    /**
     * Sets the value of the sourceUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUniversalId(String value) {
        this.sourceUniversalId = value;
    }

    /**
     * Gets the value of the triageAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTriageAmount() {
        return triageAmount;
    }

    /**
     * Sets the value of the triageAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTriageAmount(Long value) {
        this.triageAmount = value;
    }

    /**
     * Gets the value of the triageDateDischarge property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTriageDateDischarge() {
        return triageDateDischarge;
    }

    /**
     * Sets the value of the triageDateDischarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTriageDateDischarge(XMLGregorianCalendar value) {
        this.triageDateDischarge = value;
    }

    /**
     * Gets the value of the triageDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTriageDateFrom() {
        return triageDateFrom;
    }

    /**
     * Sets the value of the triageDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTriageDateFrom(XMLGregorianCalendar value) {
        this.triageDateFrom = value;
    }

    /**
     * Gets the value of the triageDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTriageDateTo() {
        return triageDateTo;
    }

    /**
     * Sets the value of the triageDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTriageDateTo(XMLGregorianCalendar value) {
        this.triageDateTo = value;
    }

    /**
     * Gets the value of the triageUnitType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTriageUnitType() {
        return triageUnitType;
    }

    /**
     * Sets the value of the triageUnitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTriageUnitType(BigInteger value) {
        this.triageUnitType = value;
    }

    /**
     * Gets the value of the triageUnitTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriageUnitTypeDropDownListItemLabel() {
        return triageUnitTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the triageUnitTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriageUnitTypeDropDownListItemLabel(String value) {
        this.triageUnitTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the triageUnitTypeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriageUnitTypeDropDownListName() {
        return triageUnitTypeDropDownListName;
    }

    /**
     * Sets the value of the triageUnitTypeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriageUnitTypeDropDownListName(String value) {
        this.triageUnitTypeDropDownListName = value;
    }

    /**
     * Gets the value of the triageUnitTypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriageUnitTypeUniversalId() {
        return triageUnitTypeUniversalId;
    }

    /**
     * Sets the value of the triageUnitTypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriageUnitTypeUniversalId(String value) {
        this.triageUnitTypeUniversalId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setType(BigInteger value) {
        this.type = value;
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
     * Gets the value of the typeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDropDownListName() {
        return typeDropDownListName;
    }

    /**
     * Sets the value of the typeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDropDownListName(String value) {
        this.typeDropDownListName = value;
    }

    /**
     * Gets the value of the typeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeUniversalId() {
        return typeUniversalId;
    }

    /**
     * Sets the value of the typeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeUniversalId(String value) {
        this.typeUniversalId = value;
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
