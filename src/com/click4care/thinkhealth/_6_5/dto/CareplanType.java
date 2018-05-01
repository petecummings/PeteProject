
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


/**
 * <p>Java class for careplan_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="careplan_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="barriers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="barrier" type="{http://www.click4care.com/thinkhealth/6.5/dto}careplanBarrier_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="careManagementId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="careManagementUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="note" type="{http://www.click4care.com/thinkhealth/6.5/dto}careplan_note_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="opportunities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="opportunity" type="{http://www.click4care.com/thinkhealth/6.5/dto}careplanOpportunity_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="statusDropDownListId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="statusDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusDropDownListItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "careplan_type", propOrder = {
    "barriers",
    "c4CId",
    "careManagementId",
    "careManagementUniversalId",
    "createdDate",
    "deletedDate",
    "end",
    "id",
    "lastActionDate",
    "name",
    "notes",
    "opportunities",
    "start",
    "statusDropDownListId",
    "statusDropDownListItemLabel",
    "statusDropDownListItemUniversalId",
    "universalId",
    "version"
})
public class CareplanType {

    protected CareplanType.Barriers barriers;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected BigInteger careManagementId;
    protected String careManagementUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected String name;
    protected CareplanType.Notes notes;
    protected CareplanType.Opportunities opportunities;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    protected BigInteger statusDropDownListId;
    protected String statusDropDownListItemLabel;
    protected String statusDropDownListItemUniversalId;
    protected String universalId;
    protected BigInteger version;

    /**
     * Gets the value of the barriers property.
     * 
     * @return
     *     possible object is
     *     {@link CareplanType.Barriers }
     *     
     */
    public CareplanType.Barriers getBarriers() {
        return barriers;
    }

    /**
     * Sets the value of the barriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareplanType.Barriers }
     *     
     */
    public void setBarriers(CareplanType.Barriers value) {
        this.barriers = value;
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
     * Gets the value of the careManagementId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCareManagementId() {
        return careManagementId;
    }

    /**
     * Sets the value of the careManagementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCareManagementId(BigInteger value) {
        this.careManagementId = value;
    }

    /**
     * Gets the value of the careManagementUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareManagementUniversalId() {
        return careManagementUniversalId;
    }

    /**
     * Sets the value of the careManagementUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareManagementUniversalId(String value) {
        this.careManagementUniversalId = value;
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
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link CareplanType.Notes }
     *     
     */
    public CareplanType.Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareplanType.Notes }
     *     
     */
    public void setNotes(CareplanType.Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the opportunities property.
     * 
     * @return
     *     possible object is
     *     {@link CareplanType.Opportunities }
     *     
     */
    public CareplanType.Opportunities getOpportunities() {
        return opportunities;
    }

    /**
     * Sets the value of the opportunities property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareplanType.Opportunities }
     *     
     */
    public void setOpportunities(CareplanType.Opportunities value) {
        this.opportunities = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the statusDropDownListId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatusDropDownListId() {
        return statusDropDownListId;
    }

    /**
     * Sets the value of the statusDropDownListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatusDropDownListId(BigInteger value) {
        this.statusDropDownListId = value;
    }

    /**
     * Gets the value of the statusDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDropDownListItemLabel() {
        return statusDropDownListItemLabel;
    }

    /**
     * Sets the value of the statusDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDropDownListItemLabel(String value) {
        this.statusDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the statusDropDownListItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDropDownListItemUniversalId() {
        return statusDropDownListItemUniversalId;
    }

    /**
     * Sets the value of the statusDropDownListItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDropDownListItemUniversalId(String value) {
        this.statusDropDownListItemUniversalId = value;
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
     *         &lt;element name="barrier" type="{http://www.click4care.com/thinkhealth/6.5/dto}careplanBarrier_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "barrier"
    })
    public static class Barriers {

        @XmlElement(nillable = true)
        protected List<CareplanBarrierType> barrier;

        /**
         * Gets the value of the barrier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the barrier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBarrier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CareplanBarrierType }
         * 
         * 
         */
        public List<CareplanBarrierType> getBarrier() {
            if (barrier == null) {
                barrier = new ArrayList<CareplanBarrierType>();
            }
            return this.barrier;
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
     *         &lt;element name="note" type="{http://www.click4care.com/thinkhealth/6.5/dto}careplan_note_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "note"
    })
    public static class Notes {

        protected List<CareplanNoteType> note;

        /**
         * Gets the value of the note property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the note property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CareplanNoteType }
         * 
         * 
         */
        public List<CareplanNoteType> getNote() {
            if (note == null) {
                note = new ArrayList<CareplanNoteType>();
            }
            return this.note;
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
     *         &lt;element name="opportunity" type="{http://www.click4care.com/thinkhealth/6.5/dto}careplanOpportunity_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "opportunity"
    })
    public static class Opportunities {

        @XmlElement(nillable = true)
        protected List<CareplanOpportunityType> opportunity;

        /**
         * Gets the value of the opportunity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the opportunity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOpportunity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CareplanOpportunityType }
         * 
         * 
         */
        public List<CareplanOpportunityType> getOpportunity() {
            if (opportunity == null) {
                opportunity = new ArrayList<CareplanOpportunityType>();
            }
            return this.opportunity;
        }

    }

}
