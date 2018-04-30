
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.click4care.thinkhealth.core.dto.TypeOfClinicalData;


/**
 * <p>Java class for clinicalDataAssociation_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clinicalDataAssociation_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clinicaldatadef" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="clinicaldatadefUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="subtype1" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="subtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype1DropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype1DropDownUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype2" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="subtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype2DropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype2DropDownUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype3" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="subtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype3DropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype3DropDownUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeOfClinicalData" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfClinicalData"/>
 *         &lt;element name="typeSubtypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clinicalDataAssociation_type", propOrder = {
    "clinicaldatadef",
    "clinicaldatadefUniversalId",
    "id",
    "subtype1",
    "subtype1DropDownListItemLabel",
    "subtype1DropDownListName",
    "subtype1DropDownUniversalId",
    "subtype2",
    "subtype2DropDownListItemLabel",
    "subtype2DropDownListName",
    "subtype2DropDownUniversalId",
    "subtype3",
    "subtype3DropDownListItemLabel",
    "subtype3DropDownListName",
    "subtype3DropDownUniversalId",
    "typeDropDownListItemLabel",
    "typeDropDownListName",
    "typeOfClinicalData",
    "typeSubtypeId",
    "typeSubtypeUniversalId",
    "universalId"
})
public class ClinicalDataAssociationType {

    protected BigInteger clinicaldatadef;
    protected String clinicaldatadefUniversalId;
    protected BigInteger id;
    protected BigInteger subtype1;
    protected String subtype1DropDownListItemLabel;
    protected String subtype1DropDownListName;
    protected String subtype1DropDownUniversalId;
    protected BigInteger subtype2;
    protected String subtype2DropDownListItemLabel;
    protected String subtype2DropDownListName;
    protected String subtype2DropDownUniversalId;
    protected BigInteger subtype3;
    protected String subtype3DropDownListItemLabel;
    protected String subtype3DropDownListName;
    protected String subtype3DropDownUniversalId;
    protected String typeDropDownListItemLabel;
    protected String typeDropDownListName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfClinicalData typeOfClinicalData;
    protected BigInteger typeSubtypeId;
    protected String typeSubtypeUniversalId;
    protected String universalId;

    /**
     * Gets the value of the clinicaldatadef property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClinicaldatadef() {
        return clinicaldatadef;
    }

    /**
     * Sets the value of the clinicaldatadef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClinicaldatadef(BigInteger value) {
        this.clinicaldatadef = value;
    }

    /**
     * Gets the value of the clinicaldatadefUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicaldatadefUniversalId() {
        return clinicaldatadefUniversalId;
    }

    /**
     * Sets the value of the clinicaldatadefUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicaldatadefUniversalId(String value) {
        this.clinicaldatadefUniversalId = value;
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
     * Gets the value of the subtype1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubtype1() {
        return subtype1;
    }

    /**
     * Sets the value of the subtype1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubtype1(BigInteger value) {
        this.subtype1 = value;
    }

    /**
     * Gets the value of the subtype1DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype1DropDownListItemLabel() {
        return subtype1DropDownListItemLabel;
    }

    /**
     * Sets the value of the subtype1DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype1DropDownListItemLabel(String value) {
        this.subtype1DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the subtype1DropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype1DropDownListName() {
        return subtype1DropDownListName;
    }

    /**
     * Sets the value of the subtype1DropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype1DropDownListName(String value) {
        this.subtype1DropDownListName = value;
    }

    /**
     * Gets the value of the subtype1DropDownUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype1DropDownUniversalId() {
        return subtype1DropDownUniversalId;
    }

    /**
     * Sets the value of the subtype1DropDownUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype1DropDownUniversalId(String value) {
        this.subtype1DropDownUniversalId = value;
    }

    /**
     * Gets the value of the subtype2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubtype2() {
        return subtype2;
    }

    /**
     * Sets the value of the subtype2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubtype2(BigInteger value) {
        this.subtype2 = value;
    }

    /**
     * Gets the value of the subtype2DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype2DropDownListItemLabel() {
        return subtype2DropDownListItemLabel;
    }

    /**
     * Sets the value of the subtype2DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype2DropDownListItemLabel(String value) {
        this.subtype2DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the subtype2DropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype2DropDownListName() {
        return subtype2DropDownListName;
    }

    /**
     * Sets the value of the subtype2DropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype2DropDownListName(String value) {
        this.subtype2DropDownListName = value;
    }

    /**
     * Gets the value of the subtype2DropDownUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype2DropDownUniversalId() {
        return subtype2DropDownUniversalId;
    }

    /**
     * Sets the value of the subtype2DropDownUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype2DropDownUniversalId(String value) {
        this.subtype2DropDownUniversalId = value;
    }

    /**
     * Gets the value of the subtype3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubtype3() {
        return subtype3;
    }

    /**
     * Sets the value of the subtype3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubtype3(BigInteger value) {
        this.subtype3 = value;
    }

    /**
     * Gets the value of the subtype3DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype3DropDownListItemLabel() {
        return subtype3DropDownListItemLabel;
    }

    /**
     * Sets the value of the subtype3DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype3DropDownListItemLabel(String value) {
        this.subtype3DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the subtype3DropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype3DropDownListName() {
        return subtype3DropDownListName;
    }

    /**
     * Sets the value of the subtype3DropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype3DropDownListName(String value) {
        this.subtype3DropDownListName = value;
    }

    /**
     * Gets the value of the subtype3DropDownUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype3DropDownUniversalId() {
        return subtype3DropDownUniversalId;
    }

    /**
     * Sets the value of the subtype3DropDownUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype3DropDownUniversalId(String value) {
        this.subtype3DropDownUniversalId = value;
    }

    /**
     * Gets the value of the typeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDropDownListItemLabel() {
        return typeDropDownListItemLabel;
    }

    /**
     * Sets the value of the typeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDropDownListItemLabel(String value) {
        this.typeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the typeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDropDownListName() {
        return typeDropDownListName;
    }

    /**
     * Sets the value of the typeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDropDownListName(String value) {
        this.typeDropDownListName = value;
    }

    /**
     * Gets the value of the typeOfClinicalData property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfClinicalData }
     *     
     */
    public TypeOfClinicalData getTypeOfClinicalData() {
        return typeOfClinicalData;
    }

    /**
     * Sets the value of the typeOfClinicalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfClinicalData }
     *     
     */
    public void setTypeOfClinicalData(TypeOfClinicalData value) {
        this.typeOfClinicalData = value;
    }

    /**
     * Gets the value of the typeSubtypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeSubtypeId() {
        return typeSubtypeId;
    }

    /**
     * Sets the value of the typeSubtypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeSubtypeId(BigInteger value) {
        this.typeSubtypeId = value;
    }

    /**
     * Gets the value of the typeSubtypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSubtypeUniversalId() {
        return typeSubtypeUniversalId;
    }

    /**
     * Sets the value of the typeSubtypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSubtypeUniversalId(String value) {
        this.typeSubtypeUniversalId = value;
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

}
