
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfObjectState;


/**
 * <p>Java class for query_status_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="query_status_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionByLoggedIn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="patientIdQueryId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="patientIdQueryUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryAttemptedNumberOfMembers" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="queryCreatedGroupId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="queryCreatedGroupUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryNumberOfMembers" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="queryPercentage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="queryResultCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="queryResultTable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryScheduledRun" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="queryStatusParentId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="queryStatusParentUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="querySuccessfullyProcessedNumberOfMembers" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="queryTotalNumberOfMembers" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="scheduledDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfObjectState" minOccurs="0"/>
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
@XmlType(name = "query_status_type", propOrder = {
    "c4CId",
    "createdDate",
    "deletedDate",
    "endDate",
    "id",
    "lastActionBy",
    "lastActionByLoggedIn",
    "lastActionDate",
    "patientIdQueryId",
    "patientIdQueryUniversalId",
    "queryAttemptedNumberOfMembers",
    "queryCreatedGroupId",
    "queryCreatedGroupUniversalId",
    "queryNumberOfMembers",
    "queryPercentage",
    "queryResultCode",
    "queryResultTable",
    "queryScheduledRun",
    "queryStatusParentId",
    "queryStatusParentUniversalId",
    "querySuccessfullyProcessedNumberOfMembers",
    "queryTotalNumberOfMembers",
    "scheduledDate",
    "startDate",
    "status",
    "universalId",
    "version"
})
public class QueryStatusType {

    @XmlElement(name = "c4cId")
    protected String c4CId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected BigInteger id;
    protected BigInteger lastActionBy;
    protected BigInteger lastActionByLoggedIn;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected BigInteger patientIdQueryId;
    protected String patientIdQueryUniversalId;
    protected BigInteger queryAttemptedNumberOfMembers;
    protected BigInteger queryCreatedGroupId;
    protected String queryCreatedGroupUniversalId;
    protected BigInteger queryNumberOfMembers;
    protected BigInteger queryPercentage;
    protected BigInteger queryResultCode;
    protected String queryResultTable;
    protected Boolean queryScheduledRun;
    protected BigInteger queryStatusParentId;
    protected String queryStatusParentUniversalId;
    protected BigInteger querySuccessfullyProcessedNumberOfMembers;
    protected BigInteger queryTotalNumberOfMembers;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "string")
    protected TypeOfObjectState status;
    protected String universalId;
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
     * Gets the value of the patientIdQueryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPatientIdQueryId() {
        return patientIdQueryId;
    }

    /**
     * Sets the value of the patientIdQueryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPatientIdQueryId(BigInteger value) {
        this.patientIdQueryId = value;
    }

    /**
     * Gets the value of the patientIdQueryUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientIdQueryUniversalId() {
        return patientIdQueryUniversalId;
    }

    /**
     * Sets the value of the patientIdQueryUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientIdQueryUniversalId(String value) {
        this.patientIdQueryUniversalId = value;
    }

    /**
     * Gets the value of the queryAttemptedNumberOfMembers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueryAttemptedNumberOfMembers() {
        return queryAttemptedNumberOfMembers;
    }

    /**
     * Sets the value of the queryAttemptedNumberOfMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueryAttemptedNumberOfMembers(BigInteger value) {
        this.queryAttemptedNumberOfMembers = value;
    }

    /**
     * Gets the value of the queryCreatedGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueryCreatedGroupId() {
        return queryCreatedGroupId;
    }

    /**
     * Sets the value of the queryCreatedGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueryCreatedGroupId(BigInteger value) {
        this.queryCreatedGroupId = value;
    }

    /**
     * Gets the value of the queryCreatedGroupUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryCreatedGroupUniversalId() {
        return queryCreatedGroupUniversalId;
    }

    /**
     * Sets the value of the queryCreatedGroupUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryCreatedGroupUniversalId(String value) {
        this.queryCreatedGroupUniversalId = value;
    }

    /**
     * Gets the value of the queryNumberOfMembers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueryNumberOfMembers() {
        return queryNumberOfMembers;
    }

    /**
     * Sets the value of the queryNumberOfMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueryNumberOfMembers(BigInteger value) {
        this.queryNumberOfMembers = value;
    }

    /**
     * Gets the value of the queryPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueryPercentage() {
        return queryPercentage;
    }

    /**
     * Sets the value of the queryPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueryPercentage(BigInteger value) {
        this.queryPercentage = value;
    }

    /**
     * Gets the value of the queryResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueryResultCode() {
        return queryResultCode;
    }

    /**
     * Sets the value of the queryResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueryResultCode(BigInteger value) {
        this.queryResultCode = value;
    }

    /**
     * Gets the value of the queryResultTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryResultTable() {
        return queryResultTable;
    }

    /**
     * Sets the value of the queryResultTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryResultTable(String value) {
        this.queryResultTable = value;
    }

    /**
     * Gets the value of the queryScheduledRun property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQueryScheduledRun() {
        return queryScheduledRun;
    }

    /**
     * Sets the value of the queryScheduledRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueryScheduledRun(Boolean value) {
        this.queryScheduledRun = value;
    }

    /**
     * Gets the value of the queryStatusParentId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueryStatusParentId() {
        return queryStatusParentId;
    }

    /**
     * Sets the value of the queryStatusParentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueryStatusParentId(BigInteger value) {
        this.queryStatusParentId = value;
    }

    /**
     * Gets the value of the queryStatusParentUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryStatusParentUniversalId() {
        return queryStatusParentUniversalId;
    }

    /**
     * Sets the value of the queryStatusParentUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryStatusParentUniversalId(String value) {
        this.queryStatusParentUniversalId = value;
    }

    /**
     * Gets the value of the querySuccessfullyProcessedNumberOfMembers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuerySuccessfullyProcessedNumberOfMembers() {
        return querySuccessfullyProcessedNumberOfMembers;
    }

    /**
     * Sets the value of the querySuccessfullyProcessedNumberOfMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuerySuccessfullyProcessedNumberOfMembers(BigInteger value) {
        this.querySuccessfullyProcessedNumberOfMembers = value;
    }

    /**
     * Gets the value of the queryTotalNumberOfMembers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueryTotalNumberOfMembers() {
        return queryTotalNumberOfMembers;
    }

    /**
     * Sets the value of the queryTotalNumberOfMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueryTotalNumberOfMembers(BigInteger value) {
        this.queryTotalNumberOfMembers = value;
    }

    /**
     * Gets the value of the scheduledDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDate() {
        return scheduledDate;
    }

    /**
     * Sets the value of the scheduledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDate(XMLGregorianCalendar value) {
        this.scheduledDate = value;
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
