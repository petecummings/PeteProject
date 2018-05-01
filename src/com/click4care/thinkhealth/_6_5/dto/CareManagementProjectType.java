
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for care_management_project_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="care_management_project_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}care_management_base_type">
 *       &lt;sequence>
 *         &lt;element name="acknowledgedDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="childCases" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="childCase" type="{http://www.click4care.com/thinkhealth/6.5/dto}case_parents_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="childUmEvents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="childUmEvent" type="{http://www.click4care.com/thinkhealth/6.5/dto}umParents_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="closingComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="closureReason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="closureReasonDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="closureReasonUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstOpened" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstOpenedBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="firstOpenedByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastClosed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastClosedBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastClosedByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastReopened" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastReopenedBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastReopenedByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ownerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectOutcome" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="projectOutcomeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectOutcomeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectPeers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="projectPeer" type="{http://www.click4care.com/thinkhealth/6.5/dto}caremanagementprojectpeers_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="projectRequestId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="projectRequestUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reopenComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reopenReason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reopenReasonDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reopenReasonUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "care_management_project_type", propOrder = {
    "acknowledgedDeadline",
    "childCases",
    "childUmEvents",
    "closingComment",
    "closureReason",
    "closureReasonDropDownListItemLabel",
    "closureReasonUniversalId",
    "firstOpened",
    "firstOpenedBy",
    "firstOpenedByUniversalId",
    "lastClosed",
    "lastClosedBy",
    "lastClosedByUniversalId",
    "lastReopened",
    "lastReopenedBy",
    "lastReopenedByUniversalId",
    "owner",
    "ownerUniversalId",
    "projectOutcome",
    "projectOutcomeDropDownListItemLabel",
    "projectOutcomeUniversalId",
    "projectPeers",
    "projectRequestId",
    "projectRequestUniversalId",
    "reopenComment",
    "reopenReason",
    "reopenReasonDropDownListItemLabel",
    "reopenReasonUniversalId"
})
public class CareManagementProjectType
    extends CareManagementBaseType
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acknowledgedDeadline;
    protected CareManagementProjectType.ChildCases childCases;
    protected CareManagementProjectType.ChildUmEvents childUmEvents;
    protected String closingComment;
    protected BigInteger closureReason;
    protected String closureReasonDropDownListItemLabel;
    protected String closureReasonUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstOpened;
    protected BigInteger firstOpenedBy;
    protected String firstOpenedByUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastClosed;
    protected BigInteger lastClosedBy;
    protected String lastClosedByUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReopened;
    protected BigInteger lastReopenedBy;
    protected String lastReopenedByUniversalId;
    protected BigInteger owner;
    protected String ownerUniversalId;
    protected BigInteger projectOutcome;
    protected String projectOutcomeDropDownListItemLabel;
    protected String projectOutcomeUniversalId;
    protected CareManagementProjectType.ProjectPeers projectPeers;
    protected BigInteger projectRequestId;
    protected String projectRequestUniversalId;
    protected String reopenComment;
    protected BigInteger reopenReason;
    protected String reopenReasonDropDownListItemLabel;
    protected String reopenReasonUniversalId;

    /**
     * Gets the value of the acknowledgedDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcknowledgedDeadline() {
        return acknowledgedDeadline;
    }

    /**
     * Sets the value of the acknowledgedDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcknowledgedDeadline(XMLGregorianCalendar value) {
        this.acknowledgedDeadline = value;
    }

    /**
     * Gets the value of the childCases property.
     * 
     * @return
     *     possible object is
     *     {@link CareManagementProjectType.ChildCases }
     *     
     */
    public CareManagementProjectType.ChildCases getChildCases() {
        return childCases;
    }

    /**
     * Sets the value of the childCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareManagementProjectType.ChildCases }
     *     
     */
    public void setChildCases(CareManagementProjectType.ChildCases value) {
        this.childCases = value;
    }

    /**
     * Gets the value of the childUmEvents property.
     * 
     * @return
     *     possible object is
     *     {@link CareManagementProjectType.ChildUmEvents }
     *     
     */
    public CareManagementProjectType.ChildUmEvents getChildUmEvents() {
        return childUmEvents;
    }

    /**
     * Sets the value of the childUmEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareManagementProjectType.ChildUmEvents }
     *     
     */
    public void setChildUmEvents(CareManagementProjectType.ChildUmEvents value) {
        this.childUmEvents = value;
    }

    /**
     * Gets the value of the closingComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingComment() {
        return closingComment;
    }

    /**
     * Sets the value of the closingComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingComment(String value) {
        this.closingComment = value;
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
     * Gets the value of the firstOpened property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstOpened() {
        return firstOpened;
    }

    /**
     * Sets the value of the firstOpened property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstOpened(XMLGregorianCalendar value) {
        this.firstOpened = value;
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
     * Gets the value of the lastClosed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastClosed() {
        return lastClosed;
    }

    /**
     * Sets the value of the lastClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastClosed(XMLGregorianCalendar value) {
        this.lastClosed = value;
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
     * Gets the value of the lastReopened property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReopened() {
        return lastReopened;
    }

    /**
     * Sets the value of the lastReopened property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReopened(XMLGregorianCalendar value) {
        this.lastReopened = value;
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
     * Gets the value of the projectOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProjectOutcome() {
        return projectOutcome;
    }

    /**
     * Sets the value of the projectOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProjectOutcome(BigInteger value) {
        this.projectOutcome = value;
    }

    /**
     * Gets the value of the projectOutcomeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectOutcomeDropDownListItemLabel() {
        return projectOutcomeDropDownListItemLabel;
    }

    /**
     * Sets the value of the projectOutcomeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectOutcomeDropDownListItemLabel(String value) {
        this.projectOutcomeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the projectOutcomeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectOutcomeUniversalId() {
        return projectOutcomeUniversalId;
    }

    /**
     * Sets the value of the projectOutcomeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectOutcomeUniversalId(String value) {
        this.projectOutcomeUniversalId = value;
    }

    /**
     * Gets the value of the projectPeers property.
     * 
     * @return
     *     possible object is
     *     {@link CareManagementProjectType.ProjectPeers }
     *     
     */
    public CareManagementProjectType.ProjectPeers getProjectPeers() {
        return projectPeers;
    }

    /**
     * Sets the value of the projectPeers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareManagementProjectType.ProjectPeers }
     *     
     */
    public void setProjectPeers(CareManagementProjectType.ProjectPeers value) {
        this.projectPeers = value;
    }

    /**
     * Gets the value of the projectRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProjectRequestId() {
        return projectRequestId;
    }

    /**
     * Sets the value of the projectRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProjectRequestId(BigInteger value) {
        this.projectRequestId = value;
    }

    /**
     * Gets the value of the projectRequestUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectRequestUniversalId() {
        return projectRequestUniversalId;
    }

    /**
     * Sets the value of the projectRequestUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectRequestUniversalId(String value) {
        this.projectRequestUniversalId = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="childCase" type="{http://www.click4care.com/thinkhealth/6.5/dto}case_parents_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "childCase"
    })
    public static class ChildCases {

        protected List<CaseParentsType> childCase;

        /**
         * Gets the value of the childCase property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the childCase property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChildCase().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CaseParentsType }
         * 
         * 
         */
        public List<CaseParentsType> getChildCase() {
            if (childCase == null) {
                childCase = new ArrayList<CaseParentsType>();
            }
            return this.childCase;
        }

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
     *         &lt;element name="childUmEvent" type="{http://www.click4care.com/thinkhealth/6.5/dto}umParents_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "childUmEvent"
    })
    public static class ChildUmEvents {

        protected List<UmParentsType> childUmEvent;

        /**
         * Gets the value of the childUmEvent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the childUmEvent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChildUmEvent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UmParentsType }
         * 
         * 
         */
        public List<UmParentsType> getChildUmEvent() {
            if (childUmEvent == null) {
                childUmEvent = new ArrayList<UmParentsType>();
            }
            return this.childUmEvent;
        }

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
     *         &lt;element name="projectPeer" type="{http://www.click4care.com/thinkhealth/6.5/dto}caremanagementprojectpeers_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "projectPeer"
    })
    public static class ProjectPeers {

        protected List<CaremanagementprojectpeersType> projectPeer;

        /**
         * Gets the value of the projectPeer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the projectPeer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProjectPeer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CaremanagementprojectpeersType }
         * 
         * 
         */
        public List<CaremanagementprojectpeersType> getProjectPeer() {
            if (projectPeer == null) {
                projectPeer = new ArrayList<CaremanagementprojectpeersType>();
            }
            return this.projectPeer;
        }

    }

}
