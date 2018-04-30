
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
 *           &lt;element name="medicalService" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="medicalServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="umNoteTypeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="umNoteTypeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="umNoteTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="umNoteSubtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="umNoteSubtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="umNoteSubtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "medicalService",
    "medicalServiceUniversalId",
    "umNoteTypeSubtype",
    "umNoteTypeSubtypeUniversalId",
    "umNoteTypeDropDownListItemLabel",
    "umNoteSubtype1DropDownListItemLabel",
    "umNoteSubtype2DropDownListItemLabel",
    "umNoteSubtype3DropDownListItemLabel",
    "noteState",
    "createdDate",
    "lastActionDate",
    "queryState"
})
@XmlRootElement(name = "medicalServiceNoteListFilter")
public class MedicalServiceNoteListFilter {

    protected List<String> legacyId;
    protected List<BigInteger> id;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected BigInteger medicalService;
    protected String medicalServiceUniversalId;
    protected BigInteger umNoteTypeSubtype;
    protected String umNoteTypeSubtypeUniversalId;
    protected String umNoteTypeDropDownListItemLabel;
    protected String umNoteSubtype1DropDownListItemLabel;
    protected String umNoteSubtype2DropDownListItemLabel;
    protected String umNoteSubtype3DropDownListItemLabel;
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
     * Gets the value of the medicalService property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMedicalService() {
        return medicalService;
    }

    /**
     * Sets the value of the medicalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMedicalService(BigInteger value) {
        this.medicalService = value;
    }

    /**
     * Gets the value of the medicalServiceUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalServiceUniversalId() {
        return medicalServiceUniversalId;
    }

    /**
     * Sets the value of the medicalServiceUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalServiceUniversalId(String value) {
        this.medicalServiceUniversalId = value;
    }

    /**
     * Gets the value of the umNoteTypeSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUmNoteTypeSubtype() {
        return umNoteTypeSubtype;
    }

    /**
     * Sets the value of the umNoteTypeSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmNoteTypeSubtype(BigInteger value) {
        this.umNoteTypeSubtype = value;
    }

    /**
     * Gets the value of the umNoteTypeSubtypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmNoteTypeSubtypeUniversalId() {
        return umNoteTypeSubtypeUniversalId;
    }

    /**
     * Sets the value of the umNoteTypeSubtypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmNoteTypeSubtypeUniversalId(String value) {
        this.umNoteTypeSubtypeUniversalId = value;
    }

    /**
     * Gets the value of the umNoteTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmNoteTypeDropDownListItemLabel() {
        return umNoteTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the umNoteTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmNoteTypeDropDownListItemLabel(String value) {
        this.umNoteTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the umNoteSubtype1DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmNoteSubtype1DropDownListItemLabel() {
        return umNoteSubtype1DropDownListItemLabel;
    }

    /**
     * Sets the value of the umNoteSubtype1DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmNoteSubtype1DropDownListItemLabel(String value) {
        this.umNoteSubtype1DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the umNoteSubtype2DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmNoteSubtype2DropDownListItemLabel() {
        return umNoteSubtype2DropDownListItemLabel;
    }

    /**
     * Sets the value of the umNoteSubtype2DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmNoteSubtype2DropDownListItemLabel(String value) {
        this.umNoteSubtype2DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the umNoteSubtype3DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmNoteSubtype3DropDownListItemLabel() {
        return umNoteSubtype3DropDownListItemLabel;
    }

    /**
     * Sets the value of the umNoteSubtype3DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmNoteSubtype3DropDownListItemLabel(String value) {
        this.umNoteSubtype3DropDownListItemLabel = value;
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
