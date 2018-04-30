
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfCmTimeUnit;
import com.click4care.thinkhealth.core.dto.TypeOfDeadline;


/**
 * <p>Java class for case_request_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="case_request_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}care_management_base_type">
 *       &lt;sequence>
 *         &lt;element name="deadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deadlineTimeBlock" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deadlineTimeBlockUnit" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfCmTimeUnit" minOccurs="0"/>
 *         &lt;element name="deadlineType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDeadline" minOccurs="0"/>
 *         &lt;element name="denialReason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="denialReasonDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denialReasonUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstSubmittedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstSubmittedBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="firstSubmittedByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isOkAfterDeadline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ownerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectionComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectionReason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="rejectionReasonDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectionReasonUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "case_request_type", propOrder = {
    "deadline",
    "deadlineTimeBlock",
    "deadlineTimeBlockUnit",
    "deadlineType",
    "denialReason",
    "denialReasonDropDownListItemLabel",
    "denialReasonUniversalId",
    "firstSubmittedAt",
    "firstSubmittedBy",
    "firstSubmittedByUniversalId",
    "isOkAfterDeadline",
    "owner",
    "ownerUniversalId",
    "rejectionComment",
    "rejectionReason",
    "rejectionReasonDropDownListItemLabel",
    "rejectionReasonUniversalId"
})
public class CaseRequestType
    extends CareManagementBaseType
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deadline;
    protected BigInteger deadlineTimeBlock;
    @XmlSchemaType(name = "string")
    protected TypeOfCmTimeUnit deadlineTimeBlockUnit;
    @XmlSchemaType(name = "string")
    protected TypeOfDeadline deadlineType;
    protected BigInteger denialReason;
    protected String denialReasonDropDownListItemLabel;
    protected String denialReasonUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstSubmittedAt;
    protected BigInteger firstSubmittedBy;
    protected String firstSubmittedByUniversalId;
    protected Boolean isOkAfterDeadline;
    protected BigInteger owner;
    protected String ownerUniversalId;
    protected String rejectionComment;
    protected BigInteger rejectionReason;
    protected String rejectionReasonDropDownListItemLabel;
    protected String rejectionReasonUniversalId;

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
     *     {@link TypeOfCmTimeUnit }
     *     
     */
    public TypeOfCmTimeUnit getDeadlineTimeBlockUnit() {
        return deadlineTimeBlockUnit;
    }

    /**
     * Sets the value of the deadlineTimeBlockUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfCmTimeUnit }
     *     
     */
    public void setDeadlineTimeBlockUnit(TypeOfCmTimeUnit value) {
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
     * Gets the value of the denialReason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDenialReason() {
        return denialReason;
    }

    /**
     * Sets the value of the denialReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDenialReason(BigInteger value) {
        this.denialReason = value;
    }

    /**
     * Gets the value of the denialReasonDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenialReasonDropDownListItemLabel() {
        return denialReasonDropDownListItemLabel;
    }

    /**
     * Sets the value of the denialReasonDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenialReasonDropDownListItemLabel(String value) {
        this.denialReasonDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the denialReasonUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenialReasonUniversalId() {
        return denialReasonUniversalId;
    }

    /**
     * Sets the value of the denialReasonUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenialReasonUniversalId(String value) {
        this.denialReasonUniversalId = value;
    }

    /**
     * Gets the value of the firstSubmittedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstSubmittedAt() {
        return firstSubmittedAt;
    }

    /**
     * Sets the value of the firstSubmittedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstSubmittedAt(XMLGregorianCalendar value) {
        this.firstSubmittedAt = value;
    }

    /**
     * Gets the value of the firstSubmittedBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstSubmittedBy() {
        return firstSubmittedBy;
    }

    /**
     * Sets the value of the firstSubmittedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstSubmittedBy(BigInteger value) {
        this.firstSubmittedBy = value;
    }

    /**
     * Gets the value of the firstSubmittedByUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstSubmittedByUniversalId() {
        return firstSubmittedByUniversalId;
    }

    /**
     * Sets the value of the firstSubmittedByUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstSubmittedByUniversalId(String value) {
        this.firstSubmittedByUniversalId = value;
    }

    /**
     * Gets the value of the isOkAfterDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOkAfterDeadline() {
        return isOkAfterDeadline;
    }

    /**
     * Sets the value of the isOkAfterDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOkAfterDeadline(Boolean value) {
        this.isOkAfterDeadline = value;
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
     * Gets the value of the rejectionComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionComment() {
        return rejectionComment;
    }

    /**
     * Sets the value of the rejectionComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionComment(String value) {
        this.rejectionComment = value;
    }

    /**
     * Gets the value of the rejectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRejectionReason() {
        return rejectionReason;
    }

    /**
     * Sets the value of the rejectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRejectionReason(BigInteger value) {
        this.rejectionReason = value;
    }

    /**
     * Gets the value of the rejectionReasonDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionReasonDropDownListItemLabel() {
        return rejectionReasonDropDownListItemLabel;
    }

    /**
     * Sets the value of the rejectionReasonDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionReasonDropDownListItemLabel(String value) {
        this.rejectionReasonDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the rejectionReasonUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionReasonUniversalId() {
        return rejectionReasonUniversalId;
    }

    /**
     * Sets the value of the rejectionReasonUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionReasonUniversalId(String value) {
        this.rejectionReasonUniversalId = value;
    }

}
