
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfUmEventState;


/**
 * <p>Java class for umEvent_summary_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="umEvent_summary_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}um_summary_type">
 *       &lt;sequence>
 *         &lt;element name="acknowledgeDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="closed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="closedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="closingComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="closureReason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="closureReasonDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="closureReasonDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="closureReasonUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstOpenedBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="firstOpenedByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstOpenedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastClosedBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastClosedByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastClosedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastReopenedBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastReopenedByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastReopenedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastReview" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastRoutedTo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastRoutedToUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ownerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reopenComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reopenReason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reopenReasonDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reopenReasonDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reopenReasonUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="requestUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfUmEventState" minOccurs="0"/>
 *         &lt;element name="umEventOutcome" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="umEventOutcomeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="umEventOutcomeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="umEventOutcomeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "umEvent_summary_type", propOrder = {
    "acknowledgeDeadline",
    "closed",
    "closedDate",
    "closingComments",
    "closureReason",
    "closureReasonDropDownListItemLabel",
    "closureReasonDropDownListName",
    "closureReasonUniversalId",
    "firstOpenedBy",
    "firstOpenedByUniversalId",
    "firstOpenedDate",
    "lastClosedBy",
    "lastClosedByUniversalId",
    "lastClosedDate",
    "lastReopenedBy",
    "lastReopenedByUniversalId",
    "lastReopenedDate",
    "lastReview",
    "lastRoutedTo",
    "lastRoutedToUniversalId",
    "owner",
    "ownerUniversalId",
    "reopenComment",
    "reopenReason",
    "reopenReasonDropDownListItemLabel",
    "reopenReasonDropDownListName",
    "reopenReasonUniversalId",
    "request",
    "requestUniversalId",
    "state",
    "umEventOutcome",
    "umEventOutcomeDropDownListItemLabel",
    "umEventOutcomeDropDownListName",
    "umEventOutcomeUniversalId"
})
@XmlSeeAlso({
    UmEventType.class
})
public class UmEventSummaryType
    extends UmSummaryType
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acknowledgeDeadline;
    protected Boolean closed;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closedDate;
    protected String closingComments;
    protected BigInteger closureReason;
    protected String closureReasonDropDownListItemLabel;
    protected String closureReasonDropDownListName;
    protected String closureReasonUniversalId;
    protected BigInteger firstOpenedBy;
    protected String firstOpenedByUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstOpenedDate;
    protected BigInteger lastClosedBy;
    protected String lastClosedByUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastClosedDate;
    protected BigInteger lastReopenedBy;
    protected String lastReopenedByUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReopenedDate;
    protected BigInteger lastReview;
    protected BigInteger lastRoutedTo;
    protected String lastRoutedToUniversalId;
    protected BigInteger owner;
    protected String ownerUniversalId;
    protected String reopenComment;
    protected BigInteger reopenReason;
    protected String reopenReasonDropDownListItemLabel;
    protected String reopenReasonDropDownListName;
    protected String reopenReasonUniversalId;
    protected BigInteger request;
    protected String requestUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfUmEventState state;
    protected BigInteger umEventOutcome;
    protected String umEventOutcomeDropDownListItemLabel;
    protected String umEventOutcomeDropDownListName;
    protected String umEventOutcomeUniversalId;

    /**
     * Gets the value of the acknowledgeDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcknowledgeDeadline() {
        return acknowledgeDeadline;
    }

    /**
     * Sets the value of the acknowledgeDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcknowledgeDeadline(XMLGregorianCalendar value) {
        this.acknowledgeDeadline = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosed(Boolean value) {
        this.closed = value;
    }

    /**
     * Gets the value of the closedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosedDate() {
        return closedDate;
    }

    /**
     * Sets the value of the closedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosedDate(XMLGregorianCalendar value) {
        this.closedDate = value;
    }

    /**
     * Gets the value of the closingComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingComments() {
        return closingComments;
    }

    /**
     * Sets the value of the closingComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingComments(String value) {
        this.closingComments = value;
    }

    /**
     * Gets the value of the closureReason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClosureReason() {
        return closureReason;
    }

    /**
     * Sets the value of the closureReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClosureReason(BigInteger value) {
        this.closureReason = value;
    }

    /**
     * Gets the value of the closureReasonDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosureReasonDropDownListItemLabel() {
        return closureReasonDropDownListItemLabel;
    }

    /**
     * Sets the value of the closureReasonDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosureReasonDropDownListItemLabel(String value) {
        this.closureReasonDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the closureReasonDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosureReasonDropDownListName() {
        return closureReasonDropDownListName;
    }

    /**
     * Sets the value of the closureReasonDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosureReasonDropDownListName(String value) {
        this.closureReasonDropDownListName = value;
    }

    /**
     * Gets the value of the closureReasonUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosureReasonUniversalId() {
        return closureReasonUniversalId;
    }

    /**
     * Sets the value of the closureReasonUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosureReasonUniversalId(String value) {
        this.closureReasonUniversalId = value;
    }

    /**
     * Gets the value of the firstOpenedBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstOpenedBy() {
        return firstOpenedBy;
    }

    /**
     * Sets the value of the firstOpenedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstOpenedBy(BigInteger value) {
        this.firstOpenedBy = value;
    }

    /**
     * Gets the value of the firstOpenedByUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstOpenedByUniversalId() {
        return firstOpenedByUniversalId;
    }

    /**
     * Sets the value of the firstOpenedByUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstOpenedByUniversalId(String value) {
        this.firstOpenedByUniversalId = value;
    }

    /**
     * Gets the value of the firstOpenedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstOpenedDate() {
        return firstOpenedDate;
    }

    /**
     * Sets the value of the firstOpenedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstOpenedDate(XMLGregorianCalendar value) {
        this.firstOpenedDate = value;
    }

    /**
     * Gets the value of the lastClosedBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastClosedBy() {
        return lastClosedBy;
    }

    /**
     * Sets the value of the lastClosedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastClosedBy(BigInteger value) {
        this.lastClosedBy = value;
    }

    /**
     * Gets the value of the lastClosedByUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastClosedByUniversalId() {
        return lastClosedByUniversalId;
    }

    /**
     * Sets the value of the lastClosedByUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastClosedByUniversalId(String value) {
        this.lastClosedByUniversalId = value;
    }

    /**
     * Gets the value of the lastClosedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastClosedDate() {
        return lastClosedDate;
    }

    /**
     * Sets the value of the lastClosedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastClosedDate(XMLGregorianCalendar value) {
        this.lastClosedDate = value;
    }

    /**
     * Gets the value of the lastReopenedBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastReopenedBy() {
        return lastReopenedBy;
    }

    /**
     * Sets the value of the lastReopenedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastReopenedBy(BigInteger value) {
        this.lastReopenedBy = value;
    }

    /**
     * Gets the value of the lastReopenedByUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastReopenedByUniversalId() {
        return lastReopenedByUniversalId;
    }

    /**
     * Sets the value of the lastReopenedByUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastReopenedByUniversalId(String value) {
        this.lastReopenedByUniversalId = value;
    }

    /**
     * Gets the value of the lastReopenedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReopenedDate() {
        return lastReopenedDate;
    }

    /**
     * Sets the value of the lastReopenedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReopenedDate(XMLGregorianCalendar value) {
        this.lastReopenedDate = value;
    }

    /**
     * Gets the value of the lastReview property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastReview() {
        return lastReview;
    }

    /**
     * Sets the value of the lastReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastReview(BigInteger value) {
        this.lastReview = value;
    }

    /**
     * Gets the value of the lastRoutedTo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastRoutedTo() {
        return lastRoutedTo;
    }

    /**
     * Sets the value of the lastRoutedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastRoutedTo(BigInteger value) {
        this.lastRoutedTo = value;
    }

    /**
     * Gets the value of the lastRoutedToUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRoutedToUniversalId() {
        return lastRoutedToUniversalId;
    }

    /**
     * Sets the value of the lastRoutedToUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRoutedToUniversalId(String value) {
        this.lastRoutedToUniversalId = value;
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
     * Gets the value of the reopenComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReopenComment() {
        return reopenComment;
    }

    /**
     * Sets the value of the reopenComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReopenComment(String value) {
        this.reopenComment = value;
    }

    /**
     * Gets the value of the reopenReason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReopenReason() {
        return reopenReason;
    }

    /**
     * Sets the value of the reopenReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReopenReason(BigInteger value) {
        this.reopenReason = value;
    }

    /**
     * Gets the value of the reopenReasonDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReopenReasonDropDownListItemLabel() {
        return reopenReasonDropDownListItemLabel;
    }

    /**
     * Sets the value of the reopenReasonDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReopenReasonDropDownListItemLabel(String value) {
        this.reopenReasonDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the reopenReasonDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReopenReasonDropDownListName() {
        return reopenReasonDropDownListName;
    }

    /**
     * Sets the value of the reopenReasonDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReopenReasonDropDownListName(String value) {
        this.reopenReasonDropDownListName = value;
    }

    /**
     * Gets the value of the reopenReasonUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReopenReasonUniversalId() {
        return reopenReasonUniversalId;
    }

    /**
     * Sets the value of the reopenReasonUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReopenReasonUniversalId(String value) {
        this.reopenReasonUniversalId = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequest(BigInteger value) {
        this.request = value;
    }

    /**
     * Gets the value of the requestUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestUniversalId() {
        return requestUniversalId;
    }

    /**
     * Sets the value of the requestUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestUniversalId(String value) {
        this.requestUniversalId = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfUmEventState }
     *     
     */
    public TypeOfUmEventState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfUmEventState }
     *     
     */
    public void setState(TypeOfUmEventState value) {
        this.state = value;
    }

    /**
     * Gets the value of the umEventOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUmEventOutcome() {
        return umEventOutcome;
    }

    /**
     * Sets the value of the umEventOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmEventOutcome(BigInteger value) {
        this.umEventOutcome = value;
    }

    /**
     * Gets the value of the umEventOutcomeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmEventOutcomeDropDownListItemLabel() {
        return umEventOutcomeDropDownListItemLabel;
    }

    /**
     * Sets the value of the umEventOutcomeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmEventOutcomeDropDownListItemLabel(String value) {
        this.umEventOutcomeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the umEventOutcomeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmEventOutcomeDropDownListName() {
        return umEventOutcomeDropDownListName;
    }

    /**
     * Sets the value of the umEventOutcomeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmEventOutcomeDropDownListName(String value) {
        this.umEventOutcomeDropDownListName = value;
    }

    /**
     * Gets the value of the umEventOutcomeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmEventOutcomeUniversalId() {
        return umEventOutcomeUniversalId;
    }

    /**
     * Sets the value of the umEventOutcomeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmEventOutcomeUniversalId(String value) {
        this.umEventOutcomeUniversalId = value;
    }

}
