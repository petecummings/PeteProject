
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
 * <p>Java class for denial_savings_category_detail_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="denial_savings_category_detail_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualUnits" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="savingsAlternativeCosts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="savingsAlternativeCost" type="{http://www.click4care.com/thinkhealth/6.5/dto}savings_alternative_cost_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costPerUnit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deniedCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deniedUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="netSavings" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="requestedCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedUnits" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="unitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="unitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "denial_savings_category_detail_type", propOrder = {
    "actualUnits",
    "savingsAlternativeCosts",
    "c4CId",
    "costPerUnit",
    "createdDate",
    "deletedDate",
    "deniedCost",
    "deniedUnits",
    "id",
    "lastActionDate",
    "netSavings",
    "requestedCost",
    "requestedProviderId",
    "requestedProviderUniversalId",
    "requestedServiceId",
    "requestedServiceUniversalId",
    "requestedUnits",
    "unitTypeDropDownListItemLabel",
    "unitTypeDropDownListName",
    "unitTypeId",
    "unitTypeUniversalId",
    "universalId",
    "version"
})
public class DenialSavingsCategoryDetailType {

    @XmlElement(required = true)
    protected BigInteger actualUnits;
    protected DenialSavingsCategoryDetailType.SavingsAlternativeCosts savingsAlternativeCosts;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected double costPerUnit;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected Double deniedCost;
    protected BigInteger deniedUnits;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected Double netSavings;
    protected Double requestedCost;
    protected BigInteger requestedProviderId;
    protected String requestedProviderUniversalId;
    protected BigInteger requestedServiceId;
    protected String requestedServiceUniversalId;
    @XmlElement(required = true)
    protected BigInteger requestedUnits;
    protected String unitTypeDropDownListItemLabel;
    protected String unitTypeDropDownListName;
    protected BigInteger unitTypeId;
    protected String unitTypeUniversalId;
    protected String universalId;
    protected BigInteger version;

    /**
     * Gets the value of the actualUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActualUnits() {
        return actualUnits;
    }

    /**
     * Sets the value of the actualUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActualUnits(BigInteger value) {
        this.actualUnits = value;
    }

    /**
     * Gets the value of the savingsAlternativeCosts property.
     * 
     * @return
     *     possible object is
     *     {@link DenialSavingsCategoryDetailType.SavingsAlternativeCosts }
     *     
     */
    public DenialSavingsCategoryDetailType.SavingsAlternativeCosts getSavingsAlternativeCosts() {
        return savingsAlternativeCosts;
    }

    /**
     * Sets the value of the savingsAlternativeCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DenialSavingsCategoryDetailType.SavingsAlternativeCosts }
     *     
     */
    public void setSavingsAlternativeCosts(DenialSavingsCategoryDetailType.SavingsAlternativeCosts value) {
        this.savingsAlternativeCosts = value;
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
     * Gets the value of the costPerUnit property.
     * 
     */
    public double getCostPerUnit() {
        return costPerUnit;
    }

    /**
     * Sets the value of the costPerUnit property.
     * 
     */
    public void setCostPerUnit(double value) {
        this.costPerUnit = value;
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
     * Gets the value of the deniedCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeniedCost() {
        return deniedCost;
    }

    /**
     * Sets the value of the deniedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeniedCost(Double value) {
        this.deniedCost = value;
    }

    /**
     * Gets the value of the deniedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeniedUnits() {
        return deniedUnits;
    }

    /**
     * Sets the value of the deniedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeniedUnits(BigInteger value) {
        this.deniedUnits = value;
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
     * Gets the value of the netSavings property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetSavings() {
        return netSavings;
    }

    /**
     * Sets the value of the netSavings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetSavings(Double value) {
        this.netSavings = value;
    }

    /**
     * Gets the value of the requestedCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRequestedCost() {
        return requestedCost;
    }

    /**
     * Sets the value of the requestedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRequestedCost(Double value) {
        this.requestedCost = value;
    }

    /**
     * Gets the value of the requestedProviderId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestedProviderId() {
        return requestedProviderId;
    }

    /**
     * Sets the value of the requestedProviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestedProviderId(BigInteger value) {
        this.requestedProviderId = value;
    }

    /**
     * Gets the value of the requestedProviderUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedProviderUniversalId() {
        return requestedProviderUniversalId;
    }

    /**
     * Sets the value of the requestedProviderUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedProviderUniversalId(String value) {
        this.requestedProviderUniversalId = value;
    }

    /**
     * Gets the value of the requestedServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestedServiceId() {
        return requestedServiceId;
    }

    /**
     * Sets the value of the requestedServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestedServiceId(BigInteger value) {
        this.requestedServiceId = value;
    }

    /**
     * Gets the value of the requestedServiceUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedServiceUniversalId() {
        return requestedServiceUniversalId;
    }

    /**
     * Sets the value of the requestedServiceUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedServiceUniversalId(String value) {
        this.requestedServiceUniversalId = value;
    }

    /**
     * Gets the value of the requestedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestedUnits() {
        return requestedUnits;
    }

    /**
     * Sets the value of the requestedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestedUnits(BigInteger value) {
        this.requestedUnits = value;
    }

    /**
     * Gets the value of the unitTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTypeDropDownListItemLabel() {
        return unitTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the unitTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTypeDropDownListItemLabel(String value) {
        this.unitTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the unitTypeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTypeDropDownListName() {
        return unitTypeDropDownListName;
    }

    /**
     * Sets the value of the unitTypeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTypeDropDownListName(String value) {
        this.unitTypeDropDownListName = value;
    }

    /**
     * Gets the value of the unitTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnitTypeId() {
        return unitTypeId;
    }

    /**
     * Sets the value of the unitTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnitTypeId(BigInteger value) {
        this.unitTypeId = value;
    }

    /**
     * Gets the value of the unitTypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTypeUniversalId() {
        return unitTypeUniversalId;
    }

    /**
     * Sets the value of the unitTypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTypeUniversalId(String value) {
        this.unitTypeUniversalId = value;
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
     *         &lt;element name="savingsAlternativeCost" type="{http://www.click4care.com/thinkhealth/6.5/dto}savings_alternative_cost_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "savingsAlternativeCost"
    })
    public static class SavingsAlternativeCosts {

        protected List<SavingsAlternativeCostType> savingsAlternativeCost;

        /**
         * Gets the value of the savingsAlternativeCost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the savingsAlternativeCost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSavingsAlternativeCost().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SavingsAlternativeCostType }
         * 
         * 
         */
        public List<SavingsAlternativeCostType> getSavingsAlternativeCost() {
            if (savingsAlternativeCost == null) {
                savingsAlternativeCost = new ArrayList<SavingsAlternativeCostType>();
            }
            return this.savingsAlternativeCost;
        }

    }

}
