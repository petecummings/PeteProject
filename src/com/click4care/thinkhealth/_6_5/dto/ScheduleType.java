
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfRecurrence;
import com.click4care.thinkhealth.core.dto.TypeOfVisibility;


/**
 * <p>Java class for schedule_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="schedule_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="authorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dailyWeekdays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="endAfterXOccurances" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="monthlyDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="monthlyMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="monthlyWeek" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="monthlyWeekMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="monthlyWeekday" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="queryStatusId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="queryStatusUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurrenceType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfRecurrence" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="timeOut" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfVisibility" minOccurs="0"/>
 *         &lt;element name="weeklyFriday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="weeklyMonday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="weeklySaturday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="weeklySunday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="weeklyThursday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="weeklyTuesday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="weeklyWednesday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="weeklyWeek" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="yearlyDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="yearlyMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="yearlyWeek" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="yearlyWeekMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="yearlyWeekday" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schedule_type", propOrder = {
    "author",
    "authorUniversalId",
    "c4CId",
    "createdDate",
    "dailyWeekdays",
    "day",
    "deletedDate",
    "enable",
    "endAfterXOccurances",
    "endDate",
    "id",
    "lastActionDate",
    "monthlyDay",
    "monthlyMonth",
    "monthlyWeek",
    "monthlyWeekMonth",
    "monthlyWeekday",
    "queryStatusId",
    "queryStatusUniversalId",
    "recurrenceType",
    "startDate",
    "timeOut",
    "universalId",
    "version",
    "visibility",
    "weeklyFriday",
    "weeklyMonday",
    "weeklySaturday",
    "weeklySunday",
    "weeklyThursday",
    "weeklyTuesday",
    "weeklyWednesday",
    "weeklyWeek",
    "yearlyDay",
    "yearlyMonth",
    "yearlyWeek",
    "yearlyWeekMonth",
    "yearlyWeekday"
})
public class ScheduleType {

    protected BigInteger author;
    protected String authorUniversalId;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected Boolean dailyWeekdays;
    protected BigInteger day;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected Boolean enable;
    protected BigInteger endAfterXOccurances;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected BigInteger monthlyDay;
    protected BigInteger monthlyMonth;
    protected BigInteger monthlyWeek;
    protected BigInteger monthlyWeekMonth;
    protected BigInteger monthlyWeekday;
    protected BigInteger queryStatusId;
    protected String queryStatusUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfRecurrence recurrenceType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected BigInteger timeOut;
    protected String universalId;
    protected BigInteger version;
    @XmlSchemaType(name = "string")
    protected TypeOfVisibility visibility;
    protected Boolean weeklyFriday;
    protected Boolean weeklyMonday;
    protected Boolean weeklySaturday;
    protected Boolean weeklySunday;
    protected Boolean weeklyThursday;
    protected Boolean weeklyTuesday;
    protected Boolean weeklyWednesday;
    protected BigInteger weeklyWeek;
    protected BigInteger yearlyDay;
    protected BigInteger yearlyMonth;
    protected BigInteger yearlyWeek;
    protected BigInteger yearlyWeekMonth;
    protected BigInteger yearlyWeekday;

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthor(BigInteger value) {
        this.author = value;
    }

    /**
     * Gets the value of the authorUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorUniversalId() {
        return authorUniversalId;
    }

    /**
     * Sets the value of the authorUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorUniversalId(String value) {
        this.authorUniversalId = value;
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
     * Gets the value of the dailyWeekdays property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDailyWeekdays() {
        return dailyWeekdays;
    }

    /**
     * Sets the value of the dailyWeekdays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDailyWeekdays(Boolean value) {
        this.dailyWeekdays = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDay(BigInteger value) {
        this.day = value;
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
     * Gets the value of the enable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnable() {
        return enable;
    }

    /**
     * Sets the value of the enable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnable(Boolean value) {
        this.enable = value;
    }

    /**
     * Gets the value of the endAfterXOccurances property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndAfterXOccurances() {
        return endAfterXOccurances;
    }

    /**
     * Sets the value of the endAfterXOccurances property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndAfterXOccurances(BigInteger value) {
        this.endAfterXOccurances = value;
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
     * Gets the value of the monthlyDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyDay() {
        return monthlyDay;
    }

    /**
     * Sets the value of the monthlyDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyDay(BigInteger value) {
        this.monthlyDay = value;
    }

    /**
     * Gets the value of the monthlyMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyMonth() {
        return monthlyMonth;
    }

    /**
     * Sets the value of the monthlyMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyMonth(BigInteger value) {
        this.monthlyMonth = value;
    }

    /**
     * Gets the value of the monthlyWeek property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyWeek() {
        return monthlyWeek;
    }

    /**
     * Sets the value of the monthlyWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyWeek(BigInteger value) {
        this.monthlyWeek = value;
    }

    /**
     * Gets the value of the monthlyWeekMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyWeekMonth() {
        return monthlyWeekMonth;
    }

    /**
     * Sets the value of the monthlyWeekMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyWeekMonth(BigInteger value) {
        this.monthlyWeekMonth = value;
    }

    /**
     * Gets the value of the monthlyWeekday property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyWeekday() {
        return monthlyWeekday;
    }

    /**
     * Sets the value of the monthlyWeekday property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyWeekday(BigInteger value) {
        this.monthlyWeekday = value;
    }

    /**
     * Gets the value of the queryStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueryStatusId() {
        return queryStatusId;
    }

    /**
     * Sets the value of the queryStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueryStatusId(BigInteger value) {
        this.queryStatusId = value;
    }

    /**
     * Gets the value of the queryStatusUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryStatusUniversalId() {
        return queryStatusUniversalId;
    }

    /**
     * Sets the value of the queryStatusUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryStatusUniversalId(String value) {
        this.queryStatusUniversalId = value;
    }

    /**
     * Gets the value of the recurrenceType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfRecurrence }
     *     
     */
    public TypeOfRecurrence getRecurrenceType() {
        return recurrenceType;
    }

    /**
     * Sets the value of the recurrenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfRecurrence }
     *     
     */
    public void setRecurrenceType(TypeOfRecurrence value) {
        this.recurrenceType = value;
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
     * Gets the value of the timeOut property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeOut() {
        return timeOut;
    }

    /**
     * Sets the value of the timeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeOut(BigInteger value) {
        this.timeOut = value;
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
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfVisibility }
     *     
     */
    public TypeOfVisibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfVisibility }
     *     
     */
    public void setVisibility(TypeOfVisibility value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the weeklyFriday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklyFriday() {
        return weeklyFriday;
    }

    /**
     * Sets the value of the weeklyFriday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklyFriday(Boolean value) {
        this.weeklyFriday = value;
    }

    /**
     * Gets the value of the weeklyMonday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklyMonday() {
        return weeklyMonday;
    }

    /**
     * Sets the value of the weeklyMonday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklyMonday(Boolean value) {
        this.weeklyMonday = value;
    }

    /**
     * Gets the value of the weeklySaturday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklySaturday() {
        return weeklySaturday;
    }

    /**
     * Sets the value of the weeklySaturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklySaturday(Boolean value) {
        this.weeklySaturday = value;
    }

    /**
     * Gets the value of the weeklySunday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklySunday() {
        return weeklySunday;
    }

    /**
     * Sets the value of the weeklySunday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklySunday(Boolean value) {
        this.weeklySunday = value;
    }

    /**
     * Gets the value of the weeklyThursday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklyThursday() {
        return weeklyThursday;
    }

    /**
     * Sets the value of the weeklyThursday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklyThursday(Boolean value) {
        this.weeklyThursday = value;
    }

    /**
     * Gets the value of the weeklyTuesday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklyTuesday() {
        return weeklyTuesday;
    }

    /**
     * Sets the value of the weeklyTuesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklyTuesday(Boolean value) {
        this.weeklyTuesday = value;
    }

    /**
     * Gets the value of the weeklyWednesday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklyWednesday() {
        return weeklyWednesday;
    }

    /**
     * Sets the value of the weeklyWednesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklyWednesday(Boolean value) {
        this.weeklyWednesday = value;
    }

    /**
     * Gets the value of the weeklyWeek property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWeeklyWeek() {
        return weeklyWeek;
    }

    /**
     * Sets the value of the weeklyWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWeeklyWeek(BigInteger value) {
        this.weeklyWeek = value;
    }

    /**
     * Gets the value of the yearlyDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearlyDay() {
        return yearlyDay;
    }

    /**
     * Sets the value of the yearlyDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearlyDay(BigInteger value) {
        this.yearlyDay = value;
    }

    /**
     * Gets the value of the yearlyMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearlyMonth() {
        return yearlyMonth;
    }

    /**
     * Sets the value of the yearlyMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearlyMonth(BigInteger value) {
        this.yearlyMonth = value;
    }

    /**
     * Gets the value of the yearlyWeek property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearlyWeek() {
        return yearlyWeek;
    }

    /**
     * Sets the value of the yearlyWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearlyWeek(BigInteger value) {
        this.yearlyWeek = value;
    }

    /**
     * Gets the value of the yearlyWeekMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearlyWeekMonth() {
        return yearlyWeekMonth;
    }

    /**
     * Sets the value of the yearlyWeekMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearlyWeekMonth(BigInteger value) {
        this.yearlyWeekMonth = value;
    }

    /**
     * Gets the value of the yearlyWeekday property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearlyWeekday() {
        return yearlyWeekday;
    }

    /**
     * Sets the value of the yearlyWeekday property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearlyWeekday(BigInteger value) {
        this.yearlyWeekday = value;
    }

}
