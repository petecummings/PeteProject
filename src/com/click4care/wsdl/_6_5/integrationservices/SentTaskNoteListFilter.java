
package com.click4care.wsdl._6_5.integrationservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.click4care.thinkhealth.core.dto.TypeOfNoteState;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *         &lt;sequence>
 *           &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="sentTask" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="sentTaskNoteTypeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="sentTaskNoteTypeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="sentTaskNoteTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="sentTaskNoteSubtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="sentTaskNoteSubtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="sentTaskNoteSubtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="noteState" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfNoteState" minOccurs="0"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *             &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *           &lt;/choice>
 *           &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "legacyId",
    "id",
    "c4CId",
    "sentTask",
    "sentTaskNoteTypeSubtype",
    "sentTaskNoteTypeSubtypeUniversalId",
    "sentTaskNoteTypeDropDownListItemLabel",
    "sentTaskNoteSubtype1DropDownListItemLabel",
    "sentTaskNoteSubtype2DropDownListItemLabel",
    "sentTaskNoteSubtype3DropDownListItemLabel",
    "noteState",
    "createdDate",
    "lastActionDate",
    "queryState"
})
@XmlRootElement(name = "sentTaskNoteListFilter")
public class SentTaskNoteListFilter {

    protected List<String> legacyId;
    protected List<BigInteger> id;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected BigInteger sentTask;
    protected BigInteger sentTaskNoteTypeSubtype;
    protected String sentTaskNoteTypeSubtypeUniversalId;
    protected String sentTaskNoteTypeDropDownListItemLabel;
    protected String sentTaskNoteSubtype1DropDownListItemLabel;
    protected String sentTaskNoteSubtype2DropDownListItemLabel;
    protected String sentTaskNoteSubtype3DropDownListItemLabel;
    @XmlSchemaType(name = "string")
    protected TypeOfNoteState noteState;
    protected DateRange createdDate;
    protected DateRange lastActionDate;
    protected BigInteger queryState;

    /**
     * Gets the value of the legacyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legacyId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegacyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLegacyId() {
        if (legacyId == null) {
            legacyId = new ArrayList<String>();
        }
        return this.legacyId;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getId() {
        if (id == null) {
            id = new ArrayList<BigInteger>();
        }
        return this.id;
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
     * Gets the value of the sentTask property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSentTask() {
        return sentTask;
    }

    /**
     * Sets the value of the sentTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSentTask(BigInteger value) {
        this.sentTask = value;
    }

    /**
     * Gets the value of the sentTaskNoteTypeSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSentTaskNoteTypeSubtype() {
        return sentTaskNoteTypeSubtype;
    }

    /**
     * Sets the value of the sentTaskNoteTypeSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSentTaskNoteTypeSubtype(BigInteger value) {
        this.sentTaskNoteTypeSubtype = value;
    }

    /**
     * Gets the value of the sentTaskNoteTypeSubtypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentTaskNoteTypeSubtypeUniversalId() {
        return sentTaskNoteTypeSubtypeUniversalId;
    }

    /**
     * Sets the value of the sentTaskNoteTypeSubtypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentTaskNoteTypeSubtypeUniversalId(String value) {
        this.sentTaskNoteTypeSubtypeUniversalId = value;
    }

    /**
     * Gets the value of the sentTaskNoteTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentTaskNoteTypeDropDownListItemLabel() {
        return sentTaskNoteTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the sentTaskNoteTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentTaskNoteTypeDropDownListItemLabel(String value) {
        this.sentTaskNoteTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the sentTaskNoteSubtype1DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentTaskNoteSubtype1DropDownListItemLabel() {
        return sentTaskNoteSubtype1DropDownListItemLabel;
    }

    /**
     * Sets the value of the sentTaskNoteSubtype1DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentTaskNoteSubtype1DropDownListItemLabel(String value) {
        this.sentTaskNoteSubtype1DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the sentTaskNoteSubtype2DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentTaskNoteSubtype2DropDownListItemLabel() {
        return sentTaskNoteSubtype2DropDownListItemLabel;
    }

    /**
     * Sets the value of the sentTaskNoteSubtype2DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentTaskNoteSubtype2DropDownListItemLabel(String value) {
        this.sentTaskNoteSubtype2DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the sentTaskNoteSubtype3DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentTaskNoteSubtype3DropDownListItemLabel() {
        return sentTaskNoteSubtype3DropDownListItemLabel;
    }

    /**
     * Sets the value of the sentTaskNoteSubtype3DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentTaskNoteSubtype3DropDownListItemLabel(String value) {
        this.sentTaskNoteSubtype3DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the noteState property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfNoteState }
     *     
     */
    public TypeOfNoteState getNoteState() {
        return noteState;
    }

    /**
     * Sets the value of the noteState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfNoteState }
     *     
     */
    public void setNoteState(TypeOfNoteState value) {
        this.noteState = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setCreatedDate(DateRange value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the lastActionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getLastActionDate() {
        return lastActionDate;
    }

    /**
     * Sets the value of the lastActionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setLastActionDate(DateRange value) {
        this.lastActionDate = value;
    }

    /**
     * Gets the value of the queryState property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueryState() {
        return queryState;
    }

    /**
     * Sets the value of the queryState property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueryState(BigInteger value) {
        this.queryState = value;
    }

}
