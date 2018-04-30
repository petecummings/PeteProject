
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
import com.click4care.thinkhealth.core.dto.TypeOfAppealRouting;
import com.click4care.thinkhealth.core.dto.TypeOfAppealState;
import com.click4care.thinkhealth.core.dto.TypeOfDetermination;
import com.click4care.thinkhealth.core.dto.TypeOfTableForRequester;


/**
 * <p>Java class for appeal_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appeal_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acknowledgeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="appealCategory" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="appealCategoryDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appealCategoryDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appealCategoryUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appealClasstype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="appealExpRequester" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="appealLevelOfService" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="appealNextReviewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="appealProcessAs" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="approvedDateFromAfterAppeal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="approvedDateFromBeforeAppeal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="approvedDateToAfterAppeal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="approvedDateToBeforeAppeal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="approvedQuantityAfterAppeal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="approvedQuantityBeforeAppeal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="benefitPackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="determination" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDetermination" minOccurs="0"/>
 *         &lt;element name="determinationComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="determinationDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="determinationReason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="determinationReasonDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="determinationReasonDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="determinationReasonUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityOutcome" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="entityOutcomeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityOutcomeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityOutcomeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityRecvd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expRequesterDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expRequesterDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expRequesterUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="levelOfServiceDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelOfServiceDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelOfServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ownerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentExtnId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="parentExtnUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentMsrvId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="parentMsrvUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentUmId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="parentUmUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="priorityDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorityDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorityUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processAsDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processAsDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processAsUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reasonDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="receivedDateAg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="receivedRoute" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="receivedRouteDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivedRouteDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivedRouteUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recvdFromEntity" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="requestedBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="requestedByDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedByDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requester" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="requesterDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requesterDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requesterTableType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTableForRequester" minOccurs="0"/>
 *         &lt;element name="requesterUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reviewType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reviewTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reviewTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reviewTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routing" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfAppealRouting" minOccurs="0"/>
 *         &lt;element name="routingRecipient" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="routingRecipientUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sentToEntity" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sentVia" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sentViaDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sentViaDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sentViaUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfAppealState" minOccurs="0"/>
 *         &lt;element name="trackingLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackingNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="turnaroundTimes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="turnaroundTime" type="{http://www.click4care.com/thinkhealth/6.5/dto}turnaround_time_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "appeal_type", propOrder = {
    "acknowledgeDate",
    "appealCategory",
    "appealCategoryDropDownListItemLabel",
    "appealCategoryDropDownListName",
    "appealCategoryUniversalId",
    "appealClasstype",
    "appealExpRequester",
    "appealLevelOfService",
    "appealNextReviewDate",
    "appealProcessAs",
    "approvedDateFromAfterAppeal",
    "approvedDateFromBeforeAppeal",
    "approvedDateToAfterAppeal",
    "approvedDateToBeforeAppeal",
    "approvedQuantityAfterAppeal",
    "approvedQuantityBeforeAppeal",
    "benefitPackage",
    "c4CId",
    "claimNumber",
    "comment",
    "createdDate",
    "decisionDate",
    "deletedDate",
    "determination",
    "determinationComment",
    "determinationDueDate",
    "determinationReason",
    "determinationReasonDropDownListItemLabel",
    "determinationReasonDropDownListName",
    "determinationReasonUniversalId",
    "entityName",
    "entityOutcome",
    "entityOutcomeDropDownListItemLabel",
    "entityOutcomeDropDownListName",
    "entityOutcomeUniversalId",
    "entityRecvd",
    "expRequesterDropDownListItemLabel",
    "expRequesterDropDownListName",
    "expRequesterUniversalId",
    "id",
    "lastActionDate",
    "levelOfServiceDropDownListItemLabel",
    "levelOfServiceDropDownListName",
    "levelOfServiceUniversalId",
    "owner",
    "ownerUniversalId",
    "parentExtnId",
    "parentExtnUniversalId",
    "parentMsrvId",
    "parentMsrvUniversalId",
    "parentUmId",
    "parentUmUniversalId",
    "priority",
    "priorityDropDownListItemLabel",
    "priorityDropDownListName",
    "priorityUniversalId",
    "processAsDropDownListItemLabel",
    "processAsDropDownListName",
    "processAsUniversalId",
    "reason",
    "reasonDropDownListItemLabel",
    "reasonDropDownListName",
    "reasonUniversalId",
    "receiptDate",
    "receivedDateAg",
    "receivedRoute",
    "receivedRouteDropDownListItemLabel",
    "receivedRouteDropDownListName",
    "receivedRouteUniversalId",
    "recvdFromEntity",
    "requestedBy",
    "requestedByDropDownListItemLabel",
    "requestedByDropDownListName",
    "requestedByUniversalId",
    "requester",
    "requesterDropDownListItemLabel",
    "requesterDropDownListName",
    "requesterTableType",
    "requesterUniversalId",
    "reviewType",
    "reviewTypeDropDownListItemLabel",
    "reviewTypeDropDownListName",
    "reviewTypeUniversalId",
    "routing",
    "routingRecipient",
    "routingRecipientUniversalId",
    "sentToEntity",
    "sentVia",
    "sentViaDropDownListItemLabel",
    "sentViaDropDownListName",
    "sentViaUniversalId",
    "state",
    "trackingLink",
    "trackingNum",
    "turnaroundTimes",
    "type",
    "typeDropDownListItemLabel",
    "typeDropDownListName",
    "typeUniversalId",
    "universalId",
    "version"
})
public class AppealType {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acknowledgeDate;
    protected BigInteger appealCategory;
    protected String appealCategoryDropDownListItemLabel;
    protected String appealCategoryDropDownListName;
    protected String appealCategoryUniversalId;
    protected BigInteger appealClasstype;
    protected BigInteger appealExpRequester;
    protected BigInteger appealLevelOfService;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appealNextReviewDate;
    protected BigInteger appealProcessAs;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvedDateFromAfterAppeal;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvedDateFromBeforeAppeal;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvedDateToAfterAppeal;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvedDateToBeforeAppeal;
    protected BigInteger approvedQuantityAfterAppeal;
    protected BigInteger approvedQuantityBeforeAppeal;
    protected String benefitPackage;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected String claimNumber;
    protected String comment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar decisionDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    @XmlSchemaType(name = "string")
    protected TypeOfDetermination determination;
    protected String determinationComment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar determinationDueDate;
    protected BigInteger determinationReason;
    protected String determinationReasonDropDownListItemLabel;
    protected String determinationReasonDropDownListName;
    protected String determinationReasonUniversalId;
    protected String entityName;
    protected BigInteger entityOutcome;
    protected String entityOutcomeDropDownListItemLabel;
    protected String entityOutcomeDropDownListName;
    protected String entityOutcomeUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entityRecvd;
    protected String expRequesterDropDownListItemLabel;
    protected String expRequesterDropDownListName;
    protected String expRequesterUniversalId;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected String levelOfServiceDropDownListItemLabel;
    protected String levelOfServiceDropDownListName;
    protected String levelOfServiceUniversalId;
    protected BigInteger owner;
    protected String ownerUniversalId;
    protected BigInteger parentExtnId;
    protected String parentExtnUniversalId;
    protected BigInteger parentMsrvId;
    protected String parentMsrvUniversalId;
    protected BigInteger parentUmId;
    protected String parentUmUniversalId;
    protected BigInteger priority;
    protected String priorityDropDownListItemLabel;
    protected String priorityDropDownListName;
    protected String priorityUniversalId;
    protected String processAsDropDownListItemLabel;
    protected String processAsDropDownListName;
    protected String processAsUniversalId;
    protected BigInteger reason;
    protected String reasonDropDownListItemLabel;
    protected String reasonDropDownListName;
    protected String reasonUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiptDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedDateAg;
    protected BigInteger receivedRoute;
    protected String receivedRouteDropDownListItemLabel;
    protected String receivedRouteDropDownListName;
    protected String receivedRouteUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recvdFromEntity;
    protected BigInteger requestedBy;
    protected String requestedByDropDownListItemLabel;
    protected String requestedByDropDownListName;
    protected String requestedByUniversalId;
    protected BigInteger requester;
    protected String requesterDropDownListItemLabel;
    protected String requesterDropDownListName;
    @XmlSchemaType(name = "string")
    protected TypeOfTableForRequester requesterTableType;
    protected String requesterUniversalId;
    protected BigInteger reviewType;
    protected String reviewTypeDropDownListItemLabel;
    protected String reviewTypeDropDownListName;
    protected String reviewTypeUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfAppealRouting routing;
    protected BigInteger routingRecipient;
    protected String routingRecipientUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentToEntity;
    protected BigInteger sentVia;
    protected String sentViaDropDownListItemLabel;
    protected String sentViaDropDownListName;
    protected String sentViaUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfAppealState state;
    protected String trackingLink;
    protected String trackingNum;
    protected AppealType.TurnaroundTimes turnaroundTimes;
    protected BigInteger type;
    protected String typeDropDownListItemLabel;
    protected String typeDropDownListName;
    protected String typeUniversalId;
    protected String universalId;
    protected BigInteger version;

    /**
     * Gets the value of the acknowledgeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcknowledgeDate() {
        return acknowledgeDate;
    }

    /**
     * Sets the value of the acknowledgeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcknowledgeDate(XMLGregorianCalendar value) {
        this.acknowledgeDate = value;
    }

    /**
     * Gets the value of the appealCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAppealCategory() {
        return appealCategory;
    }

    /**
     * Sets the value of the appealCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAppealCategory(BigInteger value) {
        this.appealCategory = value;
    }

    /**
     * Gets the value of the appealCategoryDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppealCategoryDropDownListItemLabel() {
        return appealCategoryDropDownListItemLabel;
    }

    /**
     * Sets the value of the appealCategoryDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppealCategoryDropDownListItemLabel(String value) {
        this.appealCategoryDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the appealCategoryDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppealCategoryDropDownListName() {
        return appealCategoryDropDownListName;
    }

    /**
     * Sets the value of the appealCategoryDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppealCategoryDropDownListName(String value) {
        this.appealCategoryDropDownListName = value;
    }

    /**
     * Gets the value of the appealCategoryUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppealCategoryUniversalId() {
        return appealCategoryUniversalId;
    }

    /**
     * Sets the value of the appealCategoryUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppealCategoryUniversalId(String value) {
        this.appealCategoryUniversalId = value;
    }

    /**
     * Gets the value of the appealClasstype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAppealClasstype() {
        return appealClasstype;
    }

    /**
     * Sets the value of the appealClasstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAppealClasstype(BigInteger value) {
        this.appealClasstype = value;
    }

    /**
     * Gets the value of the appealExpRequester property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAppealExpRequester() {
        return appealExpRequester;
    }

    /**
     * Sets the value of the appealExpRequester property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAppealExpRequester(BigInteger value) {
        this.appealExpRequester = value;
    }

    /**
     * Gets the value of the appealLevelOfService property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAppealLevelOfService() {
        return appealLevelOfService;
    }

    /**
     * Sets the value of the appealLevelOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAppealLevelOfService(BigInteger value) {
        this.appealLevelOfService = value;
    }

    /**
     * Gets the value of the appealNextReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppealNextReviewDate() {
        return appealNextReviewDate;
    }

    /**
     * Sets the value of the appealNextReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppealNextReviewDate(XMLGregorianCalendar value) {
        this.appealNextReviewDate = value;
    }

    /**
     * Gets the value of the appealProcessAs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAppealProcessAs() {
        return appealProcessAs;
    }

    /**
     * Sets the value of the appealProcessAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAppealProcessAs(BigInteger value) {
        this.appealProcessAs = value;
    }

    /**
     * Gets the value of the approvedDateFromAfterAppeal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovedDateFromAfterAppeal() {
        return approvedDateFromAfterAppeal;
    }

    /**
     * Sets the value of the approvedDateFromAfterAppeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovedDateFromAfterAppeal(XMLGregorianCalendar value) {
        this.approvedDateFromAfterAppeal = value;
    }

    /**
     * Gets the value of the approvedDateFromBeforeAppeal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovedDateFromBeforeAppeal() {
        return approvedDateFromBeforeAppeal;
    }

    /**
     * Sets the value of the approvedDateFromBeforeAppeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovedDateFromBeforeAppeal(XMLGregorianCalendar value) {
        this.approvedDateFromBeforeAppeal = value;
    }

    /**
     * Gets the value of the approvedDateToAfterAppeal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovedDateToAfterAppeal() {
        return approvedDateToAfterAppeal;
    }

    /**
     * Sets the value of the approvedDateToAfterAppeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovedDateToAfterAppeal(XMLGregorianCalendar value) {
        this.approvedDateToAfterAppeal = value;
    }

    /**
     * Gets the value of the approvedDateToBeforeAppeal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovedDateToBeforeAppeal() {
        return approvedDateToBeforeAppeal;
    }

    /**
     * Sets the value of the approvedDateToBeforeAppeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovedDateToBeforeAppeal(XMLGregorianCalendar value) {
        this.approvedDateToBeforeAppeal = value;
    }

    /**
     * Gets the value of the approvedQuantityAfterAppeal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApprovedQuantityAfterAppeal() {
        return approvedQuantityAfterAppeal;
    }

    /**
     * Sets the value of the approvedQuantityAfterAppeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApprovedQuantityAfterAppeal(BigInteger value) {
        this.approvedQuantityAfterAppeal = value;
    }

    /**
     * Gets the value of the approvedQuantityBeforeAppeal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApprovedQuantityBeforeAppeal() {
        return approvedQuantityBeforeAppeal;
    }

    /**
     * Sets the value of the approvedQuantityBeforeAppeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApprovedQuantityBeforeAppeal(BigInteger value) {
        this.approvedQuantityBeforeAppeal = value;
    }

    /**
     * Gets the value of the benefitPackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitPackage() {
        return benefitPackage;
    }

    /**
     * Sets the value of the benefitPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitPackage(String value) {
        this.benefitPackage = value;
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
     * Gets the value of the claimNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimNumber() {
        return claimNumber;
    }

    /**
     * Sets the value of the claimNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimNumber(String value) {
        this.claimNumber = value;
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
     * Gets the value of the decisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDecisionDate(XMLGregorianCalendar value) {
        this.decisionDate = value;
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
     * Gets the value of the determinationComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeterminationComment() {
        return determinationComment;
    }

    /**
     * Sets the value of the determinationComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminationComment(String value) {
        this.determinationComment = value;
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
     * Gets the value of the determinationReason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeterminationReason() {
        return determinationReason;
    }

    /**
     * Sets the value of the determinationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeterminationReason(BigInteger value) {
        this.determinationReason = value;
    }

    /**
     * Gets the value of the determinationReasonDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeterminationReasonDropDownListItemLabel() {
        return determinationReasonDropDownListItemLabel;
    }

    /**
     * Sets the value of the determinationReasonDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminationReasonDropDownListItemLabel(String value) {
        this.determinationReasonDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the determinationReasonDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeterminationReasonDropDownListName() {
        return determinationReasonDropDownListName;
    }

    /**
     * Sets the value of the determinationReasonDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminationReasonDropDownListName(String value) {
        this.determinationReasonDropDownListName = value;
    }

    /**
     * Gets the value of the determinationReasonUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeterminationReasonUniversalId() {
        return determinationReasonUniversalId;
    }

    /**
     * Sets the value of the determinationReasonUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminationReasonUniversalId(String value) {
        this.determinationReasonUniversalId = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the entityOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntityOutcome() {
        return entityOutcome;
    }

    /**
     * Sets the value of the entityOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntityOutcome(BigInteger value) {
        this.entityOutcome = value;
    }

    /**
     * Gets the value of the entityOutcomeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityOutcomeDropDownListItemLabel() {
        return entityOutcomeDropDownListItemLabel;
    }

    /**
     * Sets the value of the entityOutcomeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityOutcomeDropDownListItemLabel(String value) {
        this.entityOutcomeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the entityOutcomeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityOutcomeDropDownListName() {
        return entityOutcomeDropDownListName;
    }

    /**
     * Sets the value of the entityOutcomeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityOutcomeDropDownListName(String value) {
        this.entityOutcomeDropDownListName = value;
    }

    /**
     * Gets the value of the entityOutcomeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityOutcomeUniversalId() {
        return entityOutcomeUniversalId;
    }

    /**
     * Sets the value of the entityOutcomeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityOutcomeUniversalId(String value) {
        this.entityOutcomeUniversalId = value;
    }

    /**
     * Gets the value of the entityRecvd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntityRecvd() {
        return entityRecvd;
    }

    /**
     * Sets the value of the entityRecvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntityRecvd(XMLGregorianCalendar value) {
        this.entityRecvd = value;
    }

    /**
     * Gets the value of the expRequesterDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpRequesterDropDownListItemLabel() {
        return expRequesterDropDownListItemLabel;
    }

    /**
     * Sets the value of the expRequesterDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpRequesterDropDownListItemLabel(String value) {
        this.expRequesterDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the expRequesterDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpRequesterDropDownListName() {
        return expRequesterDropDownListName;
    }

    /**
     * Sets the value of the expRequesterDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpRequesterDropDownListName(String value) {
        this.expRequesterDropDownListName = value;
    }

    /**
     * Gets the value of the expRequesterUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpRequesterUniversalId() {
        return expRequesterUniversalId;
    }

    /**
     * Sets the value of the expRequesterUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpRequesterUniversalId(String value) {
        this.expRequesterUniversalId = value;
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
     * Gets the value of the levelOfServiceDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelOfServiceDropDownListItemLabel() {
        return levelOfServiceDropDownListItemLabel;
    }

    /**
     * Sets the value of the levelOfServiceDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelOfServiceDropDownListItemLabel(String value) {
        this.levelOfServiceDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the levelOfServiceDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelOfServiceDropDownListName() {
        return levelOfServiceDropDownListName;
    }

    /**
     * Sets the value of the levelOfServiceDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelOfServiceDropDownListName(String value) {
        this.levelOfServiceDropDownListName = value;
    }

    /**
     * Gets the value of the levelOfServiceUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelOfServiceUniversalId() {
        return levelOfServiceUniversalId;
    }

    /**
     * Sets the value of the levelOfServiceUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelOfServiceUniversalId(String value) {
        this.levelOfServiceUniversalId = value;
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
     * Gets the value of the parentExtnId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentExtnId() {
        return parentExtnId;
    }

    /**
     * Sets the value of the parentExtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentExtnId(BigInteger value) {
        this.parentExtnId = value;
    }

    /**
     * Gets the value of the parentExtnUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentExtnUniversalId() {
        return parentExtnUniversalId;
    }

    /**
     * Sets the value of the parentExtnUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentExtnUniversalId(String value) {
        this.parentExtnUniversalId = value;
    }

    /**
     * Gets the value of the parentMsrvId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentMsrvId() {
        return parentMsrvId;
    }

    /**
     * Sets the value of the parentMsrvId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentMsrvId(BigInteger value) {
        this.parentMsrvId = value;
    }

    /**
     * Gets the value of the parentMsrvUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentMsrvUniversalId() {
        return parentMsrvUniversalId;
    }

    /**
     * Sets the value of the parentMsrvUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentMsrvUniversalId(String value) {
        this.parentMsrvUniversalId = value;
    }

    /**
     * Gets the value of the parentUmId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentUmId() {
        return parentUmId;
    }

    /**
     * Sets the value of the parentUmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentUmId(BigInteger value) {
        this.parentUmId = value;
    }

    /**
     * Gets the value of the parentUmUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentUmUniversalId() {
        return parentUmUniversalId;
    }

    /**
     * Sets the value of the parentUmUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentUmUniversalId(String value) {
        this.parentUmUniversalId = value;
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
     * Gets the value of the processAsDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessAsDropDownListItemLabel() {
        return processAsDropDownListItemLabel;
    }

    /**
     * Sets the value of the processAsDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessAsDropDownListItemLabel(String value) {
        this.processAsDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the processAsDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessAsDropDownListName() {
        return processAsDropDownListName;
    }

    /**
     * Sets the value of the processAsDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessAsDropDownListName(String value) {
        this.processAsDropDownListName = value;
    }

    /**
     * Gets the value of the processAsUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessAsUniversalId() {
        return processAsUniversalId;
    }

    /**
     * Sets the value of the processAsUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessAsUniversalId(String value) {
        this.processAsUniversalId = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReason(BigInteger value) {
        this.reason = value;
    }

    /**
     * Gets the value of the reasonDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonDropDownListItemLabel() {
        return reasonDropDownListItemLabel;
    }

    /**
     * Sets the value of the reasonDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonDropDownListItemLabel(String value) {
        this.reasonDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the reasonDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonDropDownListName() {
        return reasonDropDownListName;
    }

    /**
     * Sets the value of the reasonDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonDropDownListName(String value) {
        this.reasonDropDownListName = value;
    }

    /**
     * Gets the value of the reasonUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonUniversalId() {
        return reasonUniversalId;
    }

    /**
     * Sets the value of the reasonUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonUniversalId(String value) {
        this.reasonUniversalId = value;
    }

    /**
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

    /**
     * Gets the value of the receivedDateAg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedDateAg() {
        return receivedDateAg;
    }

    /**
     * Sets the value of the receivedDateAg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedDateAg(XMLGregorianCalendar value) {
        this.receivedDateAg = value;
    }

    /**
     * Gets the value of the receivedRoute property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReceivedRoute() {
        return receivedRoute;
    }

    /**
     * Sets the value of the receivedRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReceivedRoute(BigInteger value) {
        this.receivedRoute = value;
    }

    /**
     * Gets the value of the receivedRouteDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedRouteDropDownListItemLabel() {
        return receivedRouteDropDownListItemLabel;
    }

    /**
     * Sets the value of the receivedRouteDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedRouteDropDownListItemLabel(String value) {
        this.receivedRouteDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the receivedRouteDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedRouteDropDownListName() {
        return receivedRouteDropDownListName;
    }

    /**
     * Sets the value of the receivedRouteDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedRouteDropDownListName(String value) {
        this.receivedRouteDropDownListName = value;
    }

    /**
     * Gets the value of the receivedRouteUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedRouteUniversalId() {
        return receivedRouteUniversalId;
    }

    /**
     * Sets the value of the receivedRouteUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedRouteUniversalId(String value) {
        this.receivedRouteUniversalId = value;
    }

    /**
     * Gets the value of the recvdFromEntity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecvdFromEntity() {
        return recvdFromEntity;
    }

    /**
     * Sets the value of the recvdFromEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecvdFromEntity(XMLGregorianCalendar value) {
        this.recvdFromEntity = value;
    }

    /**
     * Gets the value of the requestedBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestedBy() {
        return requestedBy;
    }

    /**
     * Sets the value of the requestedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestedBy(BigInteger value) {
        this.requestedBy = value;
    }

    /**
     * Gets the value of the requestedByDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedByDropDownListItemLabel() {
        return requestedByDropDownListItemLabel;
    }

    /**
     * Sets the value of the requestedByDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedByDropDownListItemLabel(String value) {
        this.requestedByDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the requestedByDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedByDropDownListName() {
        return requestedByDropDownListName;
    }

    /**
     * Sets the value of the requestedByDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedByDropDownListName(String value) {
        this.requestedByDropDownListName = value;
    }

    /**
     * Gets the value of the requestedByUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedByUniversalId() {
        return requestedByUniversalId;
    }

    /**
     * Sets the value of the requestedByUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedByUniversalId(String value) {
        this.requestedByUniversalId = value;
    }

    /**
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequester(BigInteger value) {
        this.requester = value;
    }

    /**
     * Gets the value of the requesterDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterDropDownListItemLabel() {
        return requesterDropDownListItemLabel;
    }

    /**
     * Sets the value of the requesterDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterDropDownListItemLabel(String value) {
        this.requesterDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the requesterDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterDropDownListName() {
        return requesterDropDownListName;
    }

    /**
     * Sets the value of the requesterDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterDropDownListName(String value) {
        this.requesterDropDownListName = value;
    }

    /**
     * Gets the value of the requesterTableType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTableForRequester }
     *     
     */
    public TypeOfTableForRequester getRequesterTableType() {
        return requesterTableType;
    }

    /**
     * Sets the value of the requesterTableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTableForRequester }
     *     
     */
    public void setRequesterTableType(TypeOfTableForRequester value) {
        this.requesterTableType = value;
    }

    /**
     * Gets the value of the requesterUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterUniversalId() {
        return requesterUniversalId;
    }

    /**
     * Sets the value of the requesterUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterUniversalId(String value) {
        this.requesterUniversalId = value;
    }

    /**
     * Gets the value of the reviewType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReviewType() {
        return reviewType;
    }

    /**
     * Sets the value of the reviewType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReviewType(BigInteger value) {
        this.reviewType = value;
    }

    /**
     * Gets the value of the reviewTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewTypeDropDownListItemLabel() {
        return reviewTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the reviewTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewTypeDropDownListItemLabel(String value) {
        this.reviewTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the reviewTypeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewTypeDropDownListName() {
        return reviewTypeDropDownListName;
    }

    /**
     * Sets the value of the reviewTypeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewTypeDropDownListName(String value) {
        this.reviewTypeDropDownListName = value;
    }

    /**
     * Gets the value of the reviewTypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewTypeUniversalId() {
        return reviewTypeUniversalId;
    }

    /**
     * Sets the value of the reviewTypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewTypeUniversalId(String value) {
        this.reviewTypeUniversalId = value;
    }

    /**
     * Gets the value of the routing property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAppealRouting }
     *     
     */
    public TypeOfAppealRouting getRouting() {
        return routing;
    }

    /**
     * Sets the value of the routing property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAppealRouting }
     *     
     */
    public void setRouting(TypeOfAppealRouting value) {
        this.routing = value;
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
     * Gets the value of the sentToEntity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentToEntity() {
        return sentToEntity;
    }

    /**
     * Sets the value of the sentToEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentToEntity(XMLGregorianCalendar value) {
        this.sentToEntity = value;
    }

    /**
     * Gets the value of the sentVia property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSentVia() {
        return sentVia;
    }

    /**
     * Sets the value of the sentVia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSentVia(BigInteger value) {
        this.sentVia = value;
    }

    /**
     * Gets the value of the sentViaDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentViaDropDownListItemLabel() {
        return sentViaDropDownListItemLabel;
    }

    /**
     * Sets the value of the sentViaDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentViaDropDownListItemLabel(String value) {
        this.sentViaDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the sentViaDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentViaDropDownListName() {
        return sentViaDropDownListName;
    }

    /**
     * Sets the value of the sentViaDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentViaDropDownListName(String value) {
        this.sentViaDropDownListName = value;
    }

    /**
     * Gets the value of the sentViaUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentViaUniversalId() {
        return sentViaUniversalId;
    }

    /**
     * Sets the value of the sentViaUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentViaUniversalId(String value) {
        this.sentViaUniversalId = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAppealState }
     *     
     */
    public TypeOfAppealState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAppealState }
     *     
     */
    public void setState(TypeOfAppealState value) {
        this.state = value;
    }

    /**
     * Gets the value of the trackingLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingLink() {
        return trackingLink;
    }

    /**
     * Sets the value of the trackingLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingLink(String value) {
        this.trackingLink = value;
    }

    /**
     * Gets the value of the trackingNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNum() {
        return trackingNum;
    }

    /**
     * Sets the value of the trackingNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNum(String value) {
        this.trackingNum = value;
    }

    /**
     * Gets the value of the turnaroundTimes property.
     * 
     * @return
     *     possible object is
     *     {@link AppealType.TurnaroundTimes }
     *     
     */
    public AppealType.TurnaroundTimes getTurnaroundTimes() {
        return turnaroundTimes;
    }

    /**
     * Sets the value of the turnaroundTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppealType.TurnaroundTimes }
     *     
     */
    public void setTurnaroundTimes(AppealType.TurnaroundTimes value) {
        this.turnaroundTimes = value;
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
     *         &lt;element name="turnaroundTime" type="{http://www.click4care.com/thinkhealth/6.5/dto}turnaround_time_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "turnaroundTime"
    })
    public static class TurnaroundTimes {

        protected List<TurnaroundTimeType> turnaroundTime;

        /**
         * Gets the value of the turnaroundTime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the turnaroundTime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTurnaroundTime().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TurnaroundTimeType }
         * 
         * 
         */
        public List<TurnaroundTimeType> getTurnaroundTime() {
            if (turnaroundTime == null) {
                turnaroundTime = new ArrayList<TurnaroundTimeType>();
            }
            return this.turnaroundTime;
        }

    }

}
