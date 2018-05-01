
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfVisibility;


/**
 * <p>Java class for taskRepetitionPattern_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskRepetitionPattern_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="authorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dailyRecurrenceDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="dailyRecurrenceWeekdays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="enableScheduling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="endAfterNumberOfOccurences" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="monthlyRecurrenceDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="monthlyRecurrenceMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="monthlyRecurrenceWeek" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="monthlyRecurrenceWeekDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="monthlyRecurrenceWeekMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="recurrenceType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfVisibility" minOccurs="0"/>
 *         &lt;element name="weeklyRecurrenceFriday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="weeklyRecurrenceMonday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="weeklyRecurrenceSaturday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="weeklyRecurrenceSunday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="weeklyRecurrenceThursday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="weeklyRecurrenceTuesday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="weeklyRecurrenceWednesday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="weeklyRecurrenceWeek" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="yearlyRecurrenceDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="yearlyRecurrenceMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="yearlyRecurrenceWeek" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="yearlyRecurrenceWeekDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="yearlyRecurrenceWeekMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskRepetitionPattern_type", propOrder = {
    "author",
    "authorUniversalId",
    "c4CId",
    "createdDate",
    "dailyRecurrenceDay",
    "dailyRecurrenceWeekdays",
    "deletedDate",
    "enableScheduling",
    "endAfterNumberOfOccurences",
    "endDate",
    "id",
    "lastActionDate",
    "monthlyRecurrenceDay",
    "monthlyRecurrenceMonth",
    "monthlyRecurrenceWeek",
    "monthlyRecurrenceWeekDay",
    "monthlyRecurrenceWeekMonth",
    "recurrenceType",
    "startDate",
    "timeout",
    "universalId",
    "version",
    "visibility",
    "weeklyRecurrenceFriday",
    "weeklyRecurrenceMonday",
    "weeklyRecurrenceSaturday",
    "weeklyRecurrenceSunday",
    "weeklyRecurrenceThursday",
    "weeklyRecurrenceTuesday",
    "weeklyRecurrenceWednesday",
    "weeklyRecurrenceWeek",
    "yearlyRecurrenceDay",
    "yearlyRecurrenceMonth",
    "yearlyRecurrenceWeek",
    "yearlyRecurrenceWeekDay",
    "yearlyRecurrenceWeekMonth"
})
public class TaskRepetitionPatternType {

    protected BigInteger author;
    protected String authorUniversalId;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected BigInteger dailyRecurrenceDay;
    protected Boolean dailyRecurrenceWeekdays;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected Boolean enableScheduling;
    protected BigInteger endAfterNumberOfOccurences;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected BigInteger monthlyRecurrenceDay;
    protected BigInteger monthlyRecurrenceMonth;
    protected BigInteger monthlyRecurrenceWeek;
    protected BigInteger monthlyRecurrenceWeekDay;
    protected BigInteger monthlyRecurrenceWeekMonth;
    protected BigInteger recurrenceType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected BigInteger timeout;
    protected String universalId;
    protected BigInteger version;
    @XmlSchemaType(name = "string")
    protected TypeOfVisibility visibility;
    protected Boolean weeklyRecurrenceFriday;
    protected Boolean weeklyRecurrenceMonday;
    protected Boolean weeklyRecurrenceSaturday;
    protected Boolean weeklyRecurrenceSunday;
    protected Boolean weeklyRecurrenceThursday;
    protected Boolean weeklyRecurrenceTuesday;
    protected Boolean weeklyRecurrenceWednesday;
    protected BigInteger weeklyRecurrenceWeek;
    protected BigInteger yearlyRecurrenceDay;
    protected BigInteger yearlyRecurrenceMonth;
    protected BigInteger yearlyRecurrenceWeek;
    protected BigInteger yearlyRecurrenceWeekDay;
    protected BigInteger yearlyRecurrenceWeekMonth;

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
     * Gets the value of the dailyRecurrenceDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDailyRecurrenceDay() {
        return dailyRecurrenceDay;
    }

    /**
     * Sets the value of the dailyRecurrenceDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDailyRecurrenceDay(BigInteger value) {
        this.dailyRecurrenceDay = value;
    }

    /**
     * Gets the value of the dailyRecurrenceWeekdays property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDailyRecurrenceWeekdays() {
        return dailyRecurrenceWeekdays;
    }

    /**
     * Sets the value of the dailyRecurrenceWeekdays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDailyRecurrenceWeekdays(Boolean value) {
        this.dailyRecurrenceWeekdays = value;
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
     * Gets the value of the enableScheduling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableScheduling() {
        return enableScheduling;
    }

    /**
     * Sets the value of the enableScheduling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableScheduling(Boolean value) {
        this.enableScheduling = value;
    }

    /**
     * Gets the value of the endAfterNumberOfOccurences property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndAfterNumberOfOccurences() {
        return endAfterNumberOfOccurences;
    }

    /**
     * Sets the value of the endAfterNumberOfOccurences property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndAfterNumberOfOccurences(BigInteger value) {
        this.endAfterNumberOfOccurences = value;
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
     * Gets the value of the monthlyRecurrenceDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyRecurrenceDay() {
        return monthlyRecurrenceDay;
    }

    /**
     * Sets the value of the monthlyRecurrenceDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyRecurrenceDay(BigInteger value) {
        this.monthlyRecurrenceDay = value;
    }

    /**
     * Gets the value of the monthlyRecurrenceMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyRecurrenceMonth() {
        return monthlyRecurrenceMonth;
    }

    /**
     * Sets the value of the monthlyRecurrenceMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyRecurrenceMonth(BigInteger value) {
        this.monthlyRecurrenceMonth = value;
    }

    /**
     * Gets the value of the monthlyRecurrenceWeek property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyRecurrenceWeek() {
        return monthlyRecurrenceWeek;
    }

    /**
     * Sets the value of the monthlyRecurrenceWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyRecurrenceWeek(BigInteger value) {
        this.monthlyRecurrenceWeek = value;
    }

    /**
     * Gets the value of the monthlyRecurrenceWeekDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyRecurrenceWeekDay() {
        return monthlyRecurrenceWeekDay;
    }

    /**
     * Sets the value of the monthlyRecurrenceWeekDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyRecurrenceWeekDay(BigInteger value) {
        this.monthlyRecurrenceWeekDay = value;
    }

    /**
     * Gets the value of the monthlyRecurrenceWeekMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyRecurrenceWeekMonth() {
        return monthlyRecurrenceWeekMonth;
    }

    /**
     * Sets the value of the monthlyRecurrenceWeekMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyRecurrenceWeekMonth(BigInteger value) {
        this.monthlyRecurrenceWeekMonth = value;
    }

    /**
     * Gets the value of the recurrenceType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecurrenceType() {
        return recurrenceType;
    }

    /**
     * Sets the value of the recurrenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecurrenceType(BigInteger value) {
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
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeout(BigInteger value) {
        this.timeout = value;
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
     * Gets the value of the weeklyRecurrenceFriday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklyRecurrenceFriday() {
        return weeklyRecurrenceFriday;
    }

    /**
     * Sets the value of the weeklyRecurrenceFriday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklyRecurrenceFriday(Boolean value) {
        this.weeklyRecurrenceFriday = value;
    }

    /**
     * Gets the value of the weeklyRecurrenceMonday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklyRecurrenceMonday() {
        return weeklyRecurrenceMonday;
    }

    /**
     * Sets the value of the weeklyRecurrenceMonday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklyRecurrenceMonday(Boolean value) {
        this.weeklyRecurrenceMonday = value;
    }

    /**
     * Gets the value of the weeklyRecurrenceSaturday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklyRecurrenceSaturday() {
        return weeklyRecurrenceSaturday;
    }

    /**
     * Sets the value of the weeklyRecurrenceSaturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklyRecurrenceSaturday(Boolean value) {
        this.weeklyRecurrenceSaturday = value;
    }

    /**
     * Gets the value of the weeklyRecurrenceSunday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklyRecurrenceSunday() {
        return weeklyRecurrenceSunday;
    }

    /**
     * Sets the value of the weeklyRecurrenceSunday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklyRecurrenceSunday(Boolean value) {
        this.weeklyRecurrenceSunday = value;
    }

    /**
     * Gets the value of the weeklyRecurrenceThursday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklyRecurrenceThursday() {
        return weeklyRecurrenceThursday;
    }

    /**
     * Sets the value of the weeklyRecurrenceThursday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklyRecurrenceThursday(Boolean value) {
        this.weeklyRecurrenceThursday = value;
    }

    /**
     * Gets the value of the weeklyRecurrenceTuesday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklyRecurrenceTuesday() {
        return weeklyRecurrenceTuesday;
    }

    /**
     * Sets the value of the weeklyRecurrenceTuesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklyRecurrenceTuesday(Boolean value) {
        this.weeklyRecurrenceTuesday = value;
    }

    /**
     * Gets the value of the weeklyRecurrenceWednesday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklyRecurrenceWednesday() {
        return weeklyRecurrenceWednesday;
    }

    /**
     * Sets the value of the weeklyRecurrenceWednesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklyRecurrenceWednesday(Boolean value) {
        this.weeklyRecurrenceWednesday = value;
    }

    /**
     * Gets the value of the weeklyRecurrenceWeek property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWeeklyRecurrenceWeek() {
        return weeklyRecurrenceWeek;
    }

    /**
     * Sets the value of the weeklyRecurrenceWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWeeklyRecurrenceWeek(BigInteger value) {
        this.weeklyRecurrenceWeek = value;
    }

    /**
     * Gets the value of the yearlyRecurrenceDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearlyRecurrenceDay() {
        return yearlyRecurrenceDay;
    }

    /**
     * Sets the value of the yearlyRecurrenceDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearlyRecurrenceDay(BigInteger value) {
        this.yearlyRecurrenceDay = value;
    }

    /**
     * Gets the value of the yearlyRecurrenceMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearlyRecurrenceMonth() {
        return yearlyRecurrenceMonth;
    }

    /**
     * Sets the value of the yearlyRecurrenceMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearlyRecurrenceMonth(BigInteger value) {
        this.yearlyRecurrenceMonth = value;
    }

    /**
     * Gets the value of the yearlyRecurrenceWeek property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearlyRecurrenceWeek() {
        return yearlyRecurrenceWeek;
    }

    /**
     * Sets the value of the yearlyRecurrenceWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearlyRecurrenceWeek(BigInteger value) {
        this.yearlyRecurrenceWeek = value;
    }

    /**
     * Gets the value of the yearlyRecurrenceWeekDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearlyRecurrenceWeekDay() {
        return yearlyRecurrenceWeekDay;
    }

    /**
     * Sets the value of the yearlyRecurrenceWeekDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearlyRecurrenceWeekDay(BigInteger value) {
        this.yearlyRecurrenceWeekDay = value;
    }

    /**
     * Gets the value of the yearlyRecurrenceWeekMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearlyRecurrenceWeekMonth() {
        return yearlyRecurrenceWeekMonth;
    }

    /**
     * Sets the value of the yearlyRecurrenceWeekMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearlyRecurrenceWeekMonth(BigInteger value) {
        this.yearlyRecurrenceWeekMonth = value;
    }

}
