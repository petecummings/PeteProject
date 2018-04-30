
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfDeadlineAction;
import com.click4care.thinkhealth.core.dto.TypeOfDeadlineSelection;
import com.click4care.thinkhealth.core.dto.TypeOfSelectionAction;
import com.click4care.thinkhealth.core.dto.TypeOfTimeOrigin;
import com.click4care.thinkhealth.core.dto.TypeOfTimeUnit;


/**
 * <p>Java class for configured_task_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configured_task_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}task_base_type">
 *       &lt;sequence>
 *         &lt;element name="automation" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="automationUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchAction" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="branchActionUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deadlineAction" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDeadlineAction" minOccurs="0"/>
 *         &lt;element name="deadlineBeforeNextIteration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deadlineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deadlineSelection" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDeadlineSelection" minOccurs="0"/>
 *         &lt;element name="deadlineTimeBlockAmount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deadlineTimeBlockUnit" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTimeUnit" minOccurs="0"/>
 *         &lt;element name="deadlineTimeInDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="durationAmount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="durationUnit" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTimeUnit" minOccurs="0"/>
 *         &lt;element name="formula" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="formulaUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAStartNoLaterThanTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDeadlineBeforeNextIteration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="original" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="originalTempalteUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reminderPreceedWithAmount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reminderPreceedWithUnit" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTimeUnit" minOccurs="0"/>
 *         &lt;element name="reminderTimeofOrigin" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTimeOrigin" minOccurs="0"/>
 *         &lt;element name="scheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="scheduledAt" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="selectionAction" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfSelectionAction" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startNoLaterThanDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskRepetitionPatternId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="taskRepetitionPatternUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configured_task_type", propOrder = {
    "automation",
    "automationUniversalId",
    "branchAction",
    "branchActionUniversalId",
    "deadlineAction",
    "deadlineBeforeNextIteration",
    "deadlineDate",
    "deadlineSelection",
    "deadlineTimeBlockAmount",
    "deadlineTimeBlockUnit",
    "deadlineTimeInDays",
    "durationAmount",
    "durationUnit",
    "formula",
    "formulaUniversalId",
    "isAStartNoLaterThanTask",
    "isDeadlineBeforeNextIteration",
    "isPrivate",
    "original",
    "originalTempalteUniversalId",
    "reminderPreceedWithAmount",
    "reminderPreceedWithUnit",
    "reminderTimeofOrigin",
    "scheduled",
    "scheduledAt",
    "selectionAction",
    "startDate",
    "startNoLaterThanDate",
    "subject",
    "taskRepetitionPatternId",
    "taskRepetitionPatternUniversalId"
})
public class ConfiguredTaskType
    extends TaskBaseType
{

    protected BigInteger automation;
    protected String automationUniversalId;
    protected BigInteger branchAction;
    protected String branchActionUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfDeadlineAction deadlineAction;
    protected Boolean deadlineBeforeNextIteration;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deadlineDate;
    @XmlSchemaType(name = "string")
    protected TypeOfDeadlineSelection deadlineSelection;
    protected BigInteger deadlineTimeBlockAmount;
    @XmlSchemaType(name = "string")
    protected TypeOfTimeUnit deadlineTimeBlockUnit;
    protected BigInteger deadlineTimeInDays;
    protected BigInteger durationAmount;
    @XmlSchemaType(name = "string")
    protected TypeOfTimeUnit durationUnit;
    protected BigInteger formula;
    protected String formulaUniversalId;
    protected Boolean isAStartNoLaterThanTask;
    protected Boolean isDeadlineBeforeNextIteration;
    protected Boolean isPrivate;
    protected BigInteger original;
    protected String originalTempalteUniversalId;
    protected BigInteger reminderPreceedWithAmount;
    @XmlSchemaType(name = "string")
    protected TypeOfTimeUnit reminderPreceedWithUnit;
    @XmlSchemaType(name = "string")
    protected TypeOfTimeOrigin reminderTimeofOrigin;
    protected Boolean scheduled;
    protected BigInteger scheduledAt;
    @XmlSchemaType(name = "string")
    protected TypeOfSelectionAction selectionAction;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startNoLaterThanDate;
    protected String subject;
    protected BigInteger taskRepetitionPatternId;
    protected String taskRepetitionPatternUniversalId;

    /**
     * Gets the value of the automation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAutomation() {
        return automation;
    }

    /**
     * Sets the value of the automation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAutomation(BigInteger value) {
        this.automation = value;
    }

    /**
     * Gets the value of the automationUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomationUniversalId() {
        return automationUniversalId;
    }

    /**
     * Sets the value of the automationUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomationUniversalId(String value) {
        this.automationUniversalId = value;
    }

    /**
     * Gets the value of the branchAction property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBranchAction() {
        return branchAction;
    }

    /**
     * Sets the value of the branchAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBranchAction(BigInteger value) {
        this.branchAction = value;
    }

    /**
     * Gets the value of the branchActionUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchActionUniversalId() {
        return branchActionUniversalId;
    }

    /**
     * Sets the value of the branchActionUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchActionUniversalId(String value) {
        this.branchActionUniversalId = value;
    }

    /**
     * Gets the value of the deadlineAction property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDeadlineAction }
     *     
     */
    public TypeOfDeadlineAction getDeadlineAction() {
        return deadlineAction;
    }

    /**
     * Sets the value of the deadlineAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDeadlineAction }
     *     
     */
    public void setDeadlineAction(TypeOfDeadlineAction value) {
        this.deadlineAction = value;
    }

    /**
     * Gets the value of the deadlineBeforeNextIteration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeadlineBeforeNextIteration() {
        return deadlineBeforeNextIteration;
    }

    /**
     * Sets the value of the deadlineBeforeNextIteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeadlineBeforeNextIteration(Boolean value) {
        this.deadlineBeforeNextIteration = value;
    }

    /**
     * Gets the value of the deadlineDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeadlineDate() {
        return deadlineDate;
    }

    /**
     * Sets the value of the deadlineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeadlineDate(XMLGregorianCalendar value) {
        this.deadlineDate = value;
    }

    /**
     * Gets the value of the deadlineSelection property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDeadlineSelection }
     *     
     */
    public TypeOfDeadlineSelection getDeadlineSelection() {
        return deadlineSelection;
    }

    /**
     * Sets the value of the deadlineSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDeadlineSelection }
     *     
     */
    public void setDeadlineSelection(TypeOfDeadlineSelection value) {
        this.deadlineSelection = value;
    }

    /**
     * Gets the value of the deadlineTimeBlockAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeadlineTimeBlockAmount() {
        return deadlineTimeBlockAmount;
    }

    /**
     * Sets the value of the deadlineTimeBlockAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeadlineTimeBlockAmount(BigInteger value) {
        this.deadlineTimeBlockAmount = value;
    }

    /**
     * Gets the value of the deadlineTimeBlockUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTimeUnit }
     *     
     */
    public TypeOfTimeUnit getDeadlineTimeBlockUnit() {
        return deadlineTimeBlockUnit;
    }

    /**
     * Sets the value of the deadlineTimeBlockUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTimeUnit }
     *     
     */
    public void setDeadlineTimeBlockUnit(TypeOfTimeUnit value) {
        this.deadlineTimeBlockUnit = value;
    }

    /**
     * Gets the value of the deadlineTimeInDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeadlineTimeInDays() {
        return deadlineTimeInDays;
    }

    /**
     * Sets the value of the deadlineTimeInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeadlineTimeInDays(BigInteger value) {
        this.deadlineTimeInDays = value;
    }

    /**
     * Gets the value of the durationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDurationAmount() {
        return durationAmount;
    }

    /**
     * Sets the value of the durationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDurationAmount(BigInteger value) {
        this.durationAmount = value;
    }

    /**
     * Gets the value of the durationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTimeUnit }
     *     
     */
    public TypeOfTimeUnit getDurationUnit() {
        return durationUnit;
    }

    /**
     * Sets the value of the durationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTimeUnit }
     *     
     */
    public void setDurationUnit(TypeOfTimeUnit value) {
        this.durationUnit = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFormula(BigInteger value) {
        this.formula = value;
    }

    /**
     * Gets the value of the formulaUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormulaUniversalId() {
        return formulaUniversalId;
    }

    /**
     * Sets the value of the formulaUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormulaUniversalId(String value) {
        this.formulaUniversalId = value;
    }

    /**
     * Gets the value of the isAStartNoLaterThanTask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAStartNoLaterThanTask() {
        return isAStartNoLaterThanTask;
    }

    /**
     * Sets the value of the isAStartNoLaterThanTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAStartNoLaterThanTask(Boolean value) {
        this.isAStartNoLaterThanTask = value;
    }

    /**
     * Gets the value of the isDeadlineBeforeNextIteration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeadlineBeforeNextIteration() {
        return isDeadlineBeforeNextIteration;
    }

    /**
     * Sets the value of the isDeadlineBeforeNextIteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeadlineBeforeNextIteration(Boolean value) {
        this.isDeadlineBeforeNextIteration = value;
    }

    /**
     * Gets the value of the isPrivate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * Sets the value of the isPrivate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrivate(Boolean value) {
        this.isPrivate = value;
    }

    /**
     * Gets the value of the original property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginal() {
        return original;
    }

    /**
     * Sets the value of the original property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginal(BigInteger value) {
        this.original = value;
    }

    /**
     * Gets the value of the originalTempalteUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTempalteUniversalId() {
        return originalTempalteUniversalId;
    }

    /**
     * Sets the value of the originalTempalteUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTempalteUniversalId(String value) {
        this.originalTempalteUniversalId = value;
    }

    /**
     * Gets the value of the reminderPreceedWithAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReminderPreceedWithAmount() {
        return reminderPreceedWithAmount;
    }

    /**
     * Sets the value of the reminderPreceedWithAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReminderPreceedWithAmount(BigInteger value) {
        this.reminderPreceedWithAmount = value;
    }

    /**
     * Gets the value of the reminderPreceedWithUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTimeUnit }
     *     
     */
    public TypeOfTimeUnit getReminderPreceedWithUnit() {
        return reminderPreceedWithUnit;
    }

    /**
     * Sets the value of the reminderPreceedWithUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTimeUnit }
     *     
     */
    public void setReminderPreceedWithUnit(TypeOfTimeUnit value) {
        this.reminderPreceedWithUnit = value;
    }

    /**
     * Gets the value of the reminderTimeofOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTimeOrigin }
     *     
     */
    public TypeOfTimeOrigin getReminderTimeofOrigin() {
        return reminderTimeofOrigin;
    }

    /**
     * Sets the value of the reminderTimeofOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTimeOrigin }
     *     
     */
    public void setReminderTimeofOrigin(TypeOfTimeOrigin value) {
        this.reminderTimeofOrigin = value;
    }

    /**
     * Gets the value of the scheduled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheduled() {
        return scheduled;
    }

    /**
     * Sets the value of the scheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduled(Boolean value) {
        this.scheduled = value;
    }

    /**
     * Gets the value of the scheduledAt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScheduledAt() {
        return scheduledAt;
    }

    /**
     * Sets the value of the scheduledAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScheduledAt(BigInteger value) {
        this.scheduledAt = value;
    }

    /**
     * Gets the value of the selectionAction property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfSelectionAction }
     *     
     */
    public TypeOfSelectionAction getSelectionAction() {
        return selectionAction;
    }

    /**
     * Sets the value of the selectionAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfSelectionAction }
     *     
     */
    public void setSelectionAction(TypeOfSelectionAction value) {
        this.selectionAction = value;
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
     * Gets the value of the startNoLaterThanDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartNoLaterThanDate() {
        return startNoLaterThanDate;
    }

    /**
     * Sets the value of the startNoLaterThanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartNoLaterThanDate(XMLGregorianCalendar value) {
        this.startNoLaterThanDate = value;
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
     * Gets the value of the taskRepetitionPatternId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaskRepetitionPatternId() {
        return taskRepetitionPatternId;
    }

    /**
     * Sets the value of the taskRepetitionPatternId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaskRepetitionPatternId(BigInteger value) {
        this.taskRepetitionPatternId = value;
    }

    /**
     * Gets the value of the taskRepetitionPatternUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskRepetitionPatternUniversalId() {
        return taskRepetitionPatternUniversalId;
    }

    /**
     * Sets the value of the taskRepetitionPatternUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskRepetitionPatternUniversalId(String value) {
        this.taskRepetitionPatternUniversalId = value;
    }

}
