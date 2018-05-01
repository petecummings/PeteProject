
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for payer_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payer_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}user_type">
 *       &lt;sequence>
 *         &lt;element name="backup1" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="backup1UniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backup2" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="backup2UniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backup3" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="backup3UniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseRequests" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="cases" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="cmProjectRequests" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="cmProjects" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="customWorkloadLimitId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="customWorkloadLimitUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="employeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hiredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="regularDayOffFriday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="regularDayOffMonday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="regularDayOffSaturday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="regularDayOffSunday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="regularDayOffThursday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="regularDayOffTuesday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="regularDayOffWednesday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reviewRequests" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="severityIndex" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startOfYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supervisor" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="terminatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="thinkHealthEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="thinkHealthStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="totalWorkload" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="umEvents" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="umRequests" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="workloadLimitBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="workloadLimitByAllUserRoles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="workloadLimitByPrimaryUserRole" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="workloadLimitByRoleBySeverity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="workloadLimitByTotalWorkload" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="workloadLimitFinalDecider" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="workloadLimitedByWorkType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payer_type", propOrder = {
    "backup1",
    "backup1UniversalId",
    "backup2",
    "backup2UniversalId",
    "backup3",
    "backup3UniversalId",
    "caseRequests",
    "cases",
    "cmProjectRequests",
    "cmProjects",
    "customWorkloadLimitId",
    "customWorkloadLimitUniversalId",
    "dateOfBirth",
    "employeeId",
    "hiredDate",
    "regularDayOffFriday",
    "regularDayOffMonday",
    "regularDayOffSaturday",
    "regularDayOffSunday",
    "regularDayOffThursday",
    "regularDayOffTuesday",
    "regularDayOffWednesday",
    "reviewRequests",
    "severityIndex",
    "socialSecurityNumber",
    "startOfYear",
    "supervisor",
    "terminatedDate",
    "thinkHealthEndDate",
    "thinkHealthStartDate",
    "totalWorkload",
    "umEvents",
    "umRequests",
    "workloadLimitBy",
    "workloadLimitByAllUserRoles",
    "workloadLimitByPrimaryUserRole",
    "workloadLimitByRoleBySeverity",
    "workloadLimitByTotalWorkload",
    "workloadLimitFinalDecider",
    "workloadLimitedByWorkType"
})
public class PayerType
    extends UserType
{

    protected BigInteger backup1;
    protected String backup1UniversalId;
    protected BigInteger backup2;
    protected String backup2UniversalId;
    protected BigInteger backup3;
    protected String backup3UniversalId;
    protected BigInteger caseRequests;
    protected BigInteger cases;
    protected BigInteger cmProjectRequests;
    protected BigInteger cmProjects;
    protected BigInteger customWorkloadLimitId;
    protected String customWorkloadLimitUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    protected String employeeId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hiredDate;
    protected Boolean regularDayOffFriday;
    protected Boolean regularDayOffMonday;
    protected Boolean regularDayOffSaturday;
    protected Boolean regularDayOffSunday;
    protected Boolean regularDayOffThursday;
    protected Boolean regularDayOffTuesday;
    protected Boolean regularDayOffWednesday;
    protected BigInteger reviewRequests;
    protected BigInteger severityIndex;
    protected String socialSecurityNumber;
    protected String startOfYear;
    protected BigInteger supervisor;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar terminatedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar thinkHealthEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar thinkHealthStartDate;
    protected BigInteger totalWorkload;
    protected BigInteger umEvents;
    protected BigInteger umRequests;
    protected BigInteger workloadLimitBy;
    protected Boolean workloadLimitByAllUserRoles;
    protected Boolean workloadLimitByPrimaryUserRole;
    protected BigInteger workloadLimitByRoleBySeverity;
    protected BigInteger workloadLimitByTotalWorkload;
    protected BigInteger workloadLimitFinalDecider;
    protected BigInteger workloadLimitedByWorkType;

    /**
     * Gets the value of the backup1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBackup1() {
        return backup1;
    }

    /**
     * Sets the value of the backup1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBackup1(BigInteger value) {
        this.backup1 = value;
    }

    /**
     * Gets the value of the backup1UniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackup1UniversalId() {
        return backup1UniversalId;
    }

    /**
     * Sets the value of the backup1UniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackup1UniversalId(String value) {
        this.backup1UniversalId = value;
    }

    /**
     * Gets the value of the backup2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBackup2() {
        return backup2;
    }

    /**
     * Sets the value of the backup2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBackup2(BigInteger value) {
        this.backup2 = value;
    }

    /**
     * Gets the value of the backup2UniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackup2UniversalId() {
        return backup2UniversalId;
    }

    /**
     * Sets the value of the backup2UniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackup2UniversalId(String value) {
        this.backup2UniversalId = value;
    }

    /**
     * Gets the value of the backup3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBackup3() {
        return backup3;
    }

    /**
     * Sets the value of the backup3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBackup3(BigInteger value) {
        this.backup3 = value;
    }

    /**
     * Gets the value of the backup3UniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackup3UniversalId() {
        return backup3UniversalId;
    }

    /**
     * Sets the value of the backup3UniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackup3UniversalId(String value) {
        this.backup3UniversalId = value;
    }

    /**
     * Gets the value of the caseRequests property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCaseRequests() {
        return caseRequests;
    }

    /**
     * Sets the value of the caseRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCaseRequests(BigInteger value) {
        this.caseRequests = value;
    }

    /**
     * Gets the value of the cases property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCases() {
        return cases;
    }

    /**
     * Sets the value of the cases property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCases(BigInteger value) {
        this.cases = value;
    }

    /**
     * Gets the value of the cmProjectRequests property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCmProjectRequests() {
        return cmProjectRequests;
    }

    /**
     * Sets the value of the cmProjectRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCmProjectRequests(BigInteger value) {
        this.cmProjectRequests = value;
    }

    /**
     * Gets the value of the cmProjects property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCmProjects() {
        return cmProjects;
    }

    /**
     * Sets the value of the cmProjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCmProjects(BigInteger value) {
        this.cmProjects = value;
    }

    /**
     * Gets the value of the customWorkloadLimitId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomWorkloadLimitId() {
        return customWorkloadLimitId;
    }

    /**
     * Sets the value of the customWorkloadLimitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomWorkloadLimitId(BigInteger value) {
        this.customWorkloadLimitId = value;
    }

    /**
     * Gets the value of the customWorkloadLimitUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomWorkloadLimitUniversalId() {
        return customWorkloadLimitUniversalId;
    }

    /**
     * Sets the value of the customWorkloadLimitUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomWorkloadLimitUniversalId(String value) {
        this.customWorkloadLimitUniversalId = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the hiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHiredDate() {
        return hiredDate;
    }

    /**
     * Sets the value of the hiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHiredDate(XMLGregorianCalendar value) {
        this.hiredDate = value;
    }

    /**
     * Gets the value of the regularDayOffFriday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegularDayOffFriday() {
        return regularDayOffFriday;
    }

    /**
     * Sets the value of the regularDayOffFriday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegularDayOffFriday(Boolean value) {
        this.regularDayOffFriday = value;
    }

    /**
     * Gets the value of the regularDayOffMonday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegularDayOffMonday() {
        return regularDayOffMonday;
    }

    /**
     * Sets the value of the regularDayOffMonday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegularDayOffMonday(Boolean value) {
        this.regularDayOffMonday = value;
    }

    /**
     * Gets the value of the regularDayOffSaturday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegularDayOffSaturday() {
        return regularDayOffSaturday;
    }

    /**
     * Sets the value of the regularDayOffSaturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegularDayOffSaturday(Boolean value) {
        this.regularDayOffSaturday = value;
    }

    /**
     * Gets the value of the regularDayOffSunday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegularDayOffSunday() {
        return regularDayOffSunday;
    }

    /**
     * Sets the value of the regularDayOffSunday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegularDayOffSunday(Boolean value) {
        this.regularDayOffSunday = value;
    }

    /**
     * Gets the value of the regularDayOffThursday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegularDayOffThursday() {
        return regularDayOffThursday;
    }

    /**
     * Sets the value of the regularDayOffThursday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegularDayOffThursday(Boolean value) {
        this.regularDayOffThursday = value;
    }

    /**
     * Gets the value of the regularDayOffTuesday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegularDayOffTuesday() {
        return regularDayOffTuesday;
    }

    /**
     * Sets the value of the regularDayOffTuesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegularDayOffTuesday(Boolean value) {
        this.regularDayOffTuesday = value;
    }

    /**
     * Gets the value of the regularDayOffWednesday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegularDayOffWednesday() {
        return regularDayOffWednesday;
    }

    /**
     * Sets the value of the regularDayOffWednesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegularDayOffWednesday(Boolean value) {
        this.regularDayOffWednesday = value;
    }

    /**
     * Gets the value of the reviewRequests property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReviewRequests() {
        return reviewRequests;
    }

    /**
     * Sets the value of the reviewRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReviewRequests(BigInteger value) {
        this.reviewRequests = value;
    }

    /**
     * Gets the value of the severityIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeverityIndex() {
        return severityIndex;
    }

    /**
     * Sets the value of the severityIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeverityIndex(BigInteger value) {
        this.severityIndex = value;
    }

    /**
     * Gets the value of the socialSecurityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the value of the socialSecurityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNumber(String value) {
        this.socialSecurityNumber = value;
    }

    /**
     * Gets the value of the startOfYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartOfYear() {
        return startOfYear;
    }

    /**
     * Sets the value of the startOfYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartOfYear(String value) {
        this.startOfYear = value;
    }

    /**
     * Gets the value of the supervisor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSupervisor() {
        return supervisor;
    }

    /**
     * Sets the value of the supervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSupervisor(BigInteger value) {
        this.supervisor = value;
    }

    /**
     * Gets the value of the terminatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminatedDate() {
        return terminatedDate;
    }

    /**
     * Sets the value of the terminatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminatedDate(XMLGregorianCalendar value) {
        this.terminatedDate = value;
    }

    /**
     * Gets the value of the thinkHealthEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThinkHealthEndDate() {
        return thinkHealthEndDate;
    }

    /**
     * Sets the value of the thinkHealthEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThinkHealthEndDate(XMLGregorianCalendar value) {
        this.thinkHealthEndDate = value;
    }

    /**
     * Gets the value of the thinkHealthStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThinkHealthStartDate() {
        return thinkHealthStartDate;
    }

    /**
     * Sets the value of the thinkHealthStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThinkHealthStartDate(XMLGregorianCalendar value) {
        this.thinkHealthStartDate = value;
    }

    /**
     * Gets the value of the totalWorkload property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalWorkload() {
        return totalWorkload;
    }

    /**
     * Sets the value of the totalWorkload property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalWorkload(BigInteger value) {
        this.totalWorkload = value;
    }

    /**
     * Gets the value of the umEvents property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUmEvents() {
        return umEvents;
    }

    /**
     * Sets the value of the umEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmEvents(BigInteger value) {
        this.umEvents = value;
    }

    /**
     * Gets the value of the umRequests property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUmRequests() {
        return umRequests;
    }

    /**
     * Sets the value of the umRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmRequests(BigInteger value) {
        this.umRequests = value;
    }

    /**
     * Gets the value of the workloadLimitBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWorkloadLimitBy() {
        return workloadLimitBy;
    }

    /**
     * Sets the value of the workloadLimitBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWorkloadLimitBy(BigInteger value) {
        this.workloadLimitBy = value;
    }

    /**
     * Gets the value of the workloadLimitByAllUserRoles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkloadLimitByAllUserRoles() {
        return workloadLimitByAllUserRoles;
    }

    /**
     * Sets the value of the workloadLimitByAllUserRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkloadLimitByAllUserRoles(Boolean value) {
        this.workloadLimitByAllUserRoles = value;
    }

    /**
     * Gets the value of the workloadLimitByPrimaryUserRole property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkloadLimitByPrimaryUserRole() {
        return workloadLimitByPrimaryUserRole;
    }

    /**
     * Sets the value of the workloadLimitByPrimaryUserRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkloadLimitByPrimaryUserRole(Boolean value) {
        this.workloadLimitByPrimaryUserRole = value;
    }

    /**
     * Gets the value of the workloadLimitByRoleBySeverity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWorkloadLimitByRoleBySeverity() {
        return workloadLimitByRoleBySeverity;
    }

    /**
     * Sets the value of the workloadLimitByRoleBySeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWorkloadLimitByRoleBySeverity(BigInteger value) {
        this.workloadLimitByRoleBySeverity = value;
    }

    /**
     * Gets the value of the workloadLimitByTotalWorkload property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWorkloadLimitByTotalWorkload() {
        return workloadLimitByTotalWorkload;
    }

    /**
     * Sets the value of the workloadLimitByTotalWorkload property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWorkloadLimitByTotalWorkload(BigInteger value) {
        this.workloadLimitByTotalWorkload = value;
    }

    /**
     * Gets the value of the workloadLimitFinalDecider property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWorkloadLimitFinalDecider() {
        return workloadLimitFinalDecider;
    }

    /**
     * Sets the value of the workloadLimitFinalDecider property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWorkloadLimitFinalDecider(BigInteger value) {
        this.workloadLimitFinalDecider = value;
    }

    /**
     * Gets the value of the workloadLimitedByWorkType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWorkloadLimitedByWorkType() {
        return workloadLimitedByWorkType;
    }

    /**
     * Sets the value of the workloadLimitedByWorkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWorkloadLimitedByWorkType(BigInteger value) {
        this.workloadLimitedByWorkType = value;
    }

}
