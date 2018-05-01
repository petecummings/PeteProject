
package com.click4care.wsdl._6_5.integrationservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           &lt;element name="creatorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="typeSubtypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="typeSubtypeDropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="typeSubtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="typeSubtype1DropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="typeSubtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="typeSubtype2DropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
    "name",
    "enabled",
    "creationDate",
    "creatorUniversalId",
    "creatorId",
    "typeSubtypeDropDownListItemLabel",
    "typeSubtypeDropDownListItemId",
    "typeSubtype1DropDownListItemLabel",
    "typeSubtype1DropDownListItemId",
    "typeSubtype2DropDownListItemLabel",
    "typeSubtype2DropDownListItemId",
    "queryState"
})
@XmlRootElement(name = "clinicalDataDefinitionListFilter")
public class ClinicalDataDefinitionListFilter {

    protected List<String> legacyId;
    protected List<BigInteger> id;
    protected String name;
    protected Boolean enabled;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    protected String creatorUniversalId;
    protected BigInteger creatorId;
    protected String typeSubtypeDropDownListItemLabel;
    protected BigInteger typeSubtypeDropDownListItemId;
    protected String typeSubtype1DropDownListItemLabel;
    protected BigInteger typeSubtype1DropDownListItemId;
    protected String typeSubtype2DropDownListItemLabel;
    protected BigInteger typeSubtype2DropDownListItemId;
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
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the creatorUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorUniversalId() {
        return creatorUniversalId;
    }

    /**
     * Sets the value of the creatorUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorUniversalId(String value) {
        this.creatorUniversalId = value;
    }

    /**
     * Gets the value of the creatorId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCreatorId() {
        return creatorId;
    }

    /**
     * Sets the value of the creatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCreatorId(BigInteger value) {
        this.creatorId = value;
    }

    /**
     * Gets the value of the typeSubtypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSubtypeDropDownListItemLabel() {
        return typeSubtypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the typeSubtypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSubtypeDropDownListItemLabel(String value) {
        this.typeSubtypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the typeSubtypeDropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeSubtypeDropDownListItemId() {
        return typeSubtypeDropDownListItemId;
    }

    /**
     * Sets the value of the typeSubtypeDropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeSubtypeDropDownListItemId(BigInteger value) {
        this.typeSubtypeDropDownListItemId = value;
    }

    /**
     * Gets the value of the typeSubtype1DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSubtype1DropDownListItemLabel() {
        return typeSubtype1DropDownListItemLabel;
    }

    /**
     * Sets the value of the typeSubtype1DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSubtype1DropDownListItemLabel(String value) {
        this.typeSubtype1DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the typeSubtype1DropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeSubtype1DropDownListItemId() {
        return typeSubtype1DropDownListItemId;
    }

    /**
     * Sets the value of the typeSubtype1DropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeSubtype1DropDownListItemId(BigInteger value) {
        this.typeSubtype1DropDownListItemId = value;
    }

    /**
     * Gets the value of the typeSubtype2DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSubtype2DropDownListItemLabel() {
        return typeSubtype2DropDownListItemLabel;
    }

    /**
     * Sets the value of the typeSubtype2DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSubtype2DropDownListItemLabel(String value) {
        this.typeSubtype2DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the typeSubtype2DropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeSubtype2DropDownListItemId() {
        return typeSubtype2DropDownListItemId;
    }

    /**
     * Sets the value of the typeSubtype2DropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeSubtype2DropDownListItemId(BigInteger value) {
        this.typeSubtype2DropDownListItemId = value;
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
