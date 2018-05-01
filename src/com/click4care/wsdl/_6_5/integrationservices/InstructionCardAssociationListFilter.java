
package com.click4care.wsdl._6_5.integrationservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *         &lt;sequence>
 *           &lt;element name="instructionCardId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="typeSubtypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="typeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="typeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="typeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="subtype1" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="subtype1DropDownUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="subtype1DropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="subtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="subtype2" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="subtype2DropDownUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="subtype2DropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="subtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="subtype3" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="subtype3DropDownUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="subtype3DropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="subtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="lob" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
    "id",
    "instructionCardId",
    "typeSubtypeId",
    "typeSubtypeUniversalId",
    "typeDropDownListName",
    "typeDropDownListItemLabel",
    "subtype1",
    "subtype1DropDownUniversalId",
    "subtype1DropDownListName",
    "subtype1DropDownListItemLabel",
    "subtype2",
    "subtype2DropDownUniversalId",
    "subtype2DropDownListName",
    "subtype2DropDownListItemLabel",
    "subtype3",
    "subtype3DropDownUniversalId",
    "subtype3DropDownListName",
    "subtype3DropDownListItemLabel",
    "lob",
    "account",
    "createdDate",
    "lastActionDate",
    "queryState"
})
@XmlRootElement(name = "instructionCardAssociationListFilter")
public class InstructionCardAssociationListFilter {

    protected List<BigInteger> id;
    protected BigInteger instructionCardId;
    protected BigInteger typeSubtypeId;
    protected String typeSubtypeUniversalId;
    protected String typeDropDownListName;
    protected String typeDropDownListItemLabel;
    protected BigInteger subtype1;
    protected String subtype1DropDownUniversalId;
    protected String subtype1DropDownListName;
    protected String subtype1DropDownListItemLabel;
    protected BigInteger subtype2;
    protected String subtype2DropDownUniversalId;
    protected String subtype2DropDownListName;
    protected String subtype2DropDownListItemLabel;
    protected BigInteger subtype3;
    protected String subtype3DropDownUniversalId;
    protected String subtype3DropDownListName;
    protected String subtype3DropDownListItemLabel;
    protected BigInteger lob;
    protected BigInteger account;
    protected DateRange createdDate;
    protected DateRange lastActionDate;
    protected BigInteger queryState;

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
     * Gets the value of the instructionCardId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInstructionCardId() {
        return instructionCardId;
    }

    /**
     * Sets the value of the instructionCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInstructionCardId(BigInteger value) {
        this.instructionCardId = value;
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
     * Gets the value of the lob property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLob() {
        return lob;
    }

    /**
     * Sets the value of the lob property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLob(BigInteger value) {
        this.lob = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccount(BigInteger value) {
        this.account = value;
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
