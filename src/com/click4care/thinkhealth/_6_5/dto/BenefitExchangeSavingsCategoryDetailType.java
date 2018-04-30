
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
 * <p>Java class for benefit_exchange_savings_category_detail_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="benefit_exchange_savings_category_detail_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="netSavings" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="replacementCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="replacementCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="replacementProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="replacementProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replacementServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="replacementServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replacementUnitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replacementUnitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replacementUnitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="replacementUnitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replacementUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="requestedCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="requestedCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedUnitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedUnitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedUnitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="requestedUnitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedUnits" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
@XmlType(name = "benefit_exchange_savings_category_detail_type", propOrder = {
    "savingsAlternativeCosts",
    "c4CId",
    "createdDate",
    "deletedDate",
    "id",
    "lastActionDate",
    "netSavings",
    "replacementCost",
    "replacementCostPerUnit",
    "replacementProviderId",
    "replacementProviderUniversalId",
    "replacementServiceId",
    "replacementServiceUniversalId",
    "replacementUnitTypeDropDownListItemLabel",
    "replacementUnitTypeDropDownListName",
    "replacementUnitTypeId",
    "replacementUnitTypeUniversalId",
    "replacementUnits",
    "requestedCost",
    "requestedCostPerUnit",
    "requestedProviderId",
    "requestedProviderUniversalId",
    "requestedServiceId",
    "requestedServiceUniversalId",
    "requestedUnitTypeDropDownListItemLabel",
    "requestedUnitTypeDropDownListName",
    "requestedUnitTypeId",
    "requestedUnitTypeUniversalId",
    "requestedUnits",
    "universalId",
    "version"
})
public class BenefitExchangeSavingsCategoryDetailType {

    protected BenefitExchangeSavingsCategoryDetailType.SavingsAlternativeCosts savingsAlternativeCosts;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected Double netSavings;
    protected Double replacementCost;
    protected Double replacementCostPerUnit;
    protected BigInteger replacementProviderId;
    protected String replacementProviderUniversalId;
    protected BigInteger replacementServiceId;
    protected String replacementServiceUniversalId;
    protected String replacementUnitTypeDropDownListItemLabel;
    protected String replacementUnitTypeDropDownListName;
    protected BigInteger replacementUnitTypeId;
    protected String replacementUnitTypeUniversalId;
    protected BigInteger replacementUnits;
    protected Double requestedCost;
    protected double requestedCostPerUnit;
    protected BigInteger requestedProviderId;
    protected String requestedProviderUniversalId;
    protected BigInteger requestedServiceId;
    protected String requestedServiceUniversalId;
    protected String requestedUnitTypeDropDownListItemLabel;
    protected String requestedUnitTypeDropDownListName;
    protected BigInteger requestedUnitTypeId;
    protected String requestedUnitTypeUniversalId;
    @XmlElement(required = true)
    protected BigInteger requestedUnits;
    protected String universalId;
    protected BigInteger version;

    /**
     * Gets the value of the savingsAlternativeCosts property.
     * 
     * @return
     *     possible object is
     *     {@link BenefitExchangeSavingsCategoryDetailType.SavingsAlternativeCosts }
     *     
     */
    public BenefitExchangeSavingsCategoryDetailType.SavingsAlternativeCosts getSavingsAlternativeCosts() {
        return savingsAlternativeCosts;
    }

    /**
     * Sets the value of the savingsAlternativeCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenefitExchangeSavingsCategoryDetailType.SavingsAlternativeCosts }
     *     
     */
    public void setSavingsAlternativeCosts(BenefitExchangeSavingsCategoryDetailType.SavingsAlternativeCosts value) {
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
     * Gets the value of the replacementCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReplacementCost() {
        return replacementCost;
    }

    /**
     * Sets the value of the replacementCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReplacementCost(Double value) {
        this.replacementCost = value;
    }

    /**
     * Gets the value of the replacementCostPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReplacementCostPerUnit() {
        return replacementCostPerUnit;
    }

    /**
     * Sets the value of the replacementCostPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReplacementCostPerUnit(Double value) {
        this.replacementCostPerUnit = value;
    }

    /**
     * Gets the value of the replacementProviderId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReplacementProviderId() {
        return replacementProviderId;
    }

    /**
     * Sets the value of the replacementProviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReplacementProviderId(BigInteger value) {
        this.replacementProviderId = value;
    }

    /**
     * Gets the value of the replacementProviderUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacementProviderUniversalId() {
        return replacementProviderUniversalId;
    }

    /**
     * Sets the value of the replacementProviderUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplacementProviderUniversalId(String value) {
        this.replacementProviderUniversalId = value;
    }

    /**
     * Gets the value of the replacementServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReplacementServiceId() {
        return replacementServiceId;
    }

    /**
     * Sets the value of the replacementServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReplacementServiceId(BigInteger value) {
        this.replacementServiceId = value;
    }

    /**
     * Gets the value of the replacementServiceUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacementServiceUniversalId() {
        return replacementServiceUniversalId;
    }

    /**
     * Sets the value of the replacementServiceUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplacementServiceUniversalId(String value) {
        this.replacementServiceUniversalId = value;
    }

    /**
     * Gets the value of the replacementUnitTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacementUnitTypeDropDownListItemLabel() {
        return replacementUnitTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the replacementUnitTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplacementUnitTypeDropDownListItemLabel(String value) {
        this.replacementUnitTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the replacementUnitTypeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacementUnitTypeDropDownListName() {
        return replacementUnitTypeDropDownListName;
    }

    /**
     * Sets the value of the replacementUnitTypeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplacementUnitTypeDropDownListName(String value) {
        this.replacementUnitTypeDropDownListName = value;
    }

    /**
     * Gets the value of the replacementUnitTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReplacementUnitTypeId() {
        return replacementUnitTypeId;
    }

    /**
     * Sets the value of the replacementUnitTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReplacementUnitTypeId(BigInteger value) {
        this.replacementUnitTypeId = value;
    }

    /**
     * Gets the value of the replacementUnitTypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacementUnitTypeUniversalId() {
        return replacementUnitTypeUniversalId;
    }

    /**
     * Sets the value of the replacementUnitTypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplacementUnitTypeUniversalId(String value) {
        this.replacementUnitTypeUniversalId = value;
    }

    /**
     * Gets the value of the replacementUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReplacementUnits() {
        return replacementUnits;
    }

    /**
     * Sets the value of the replacementUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReplacementUnits(BigInteger value) {
        this.replacementUnits = value;
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
     * Gets the value of the requestedCostPerUnit property.
     * 
     */
    public double getRequestedCostPerUnit() {
        return requestedCostPerUnit;
    }

    /**
     * Sets the value of the requestedCostPerUnit property.
     * 
     */
    public void setRequestedCostPerUnit(double value) {
        this.requestedCostPerUnit = value;
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
     * Gets the value of the requestedUnitTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedUnitTypeDropDownListItemLabel() {
        return requestedUnitTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the requestedUnitTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedUnitTypeDropDownListItemLabel(String value) {
        this.requestedUnitTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the requestedUnitTypeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedUnitTypeDropDownListName() {
        return requestedUnitTypeDropDownListName;
    }

    /**
     * Sets the value of the requestedUnitTypeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedUnitTypeDropDownListName(String value) {
        this.requestedUnitTypeDropDownListName = value;
    }

    /**
     * Gets the value of the requestedUnitTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestedUnitTypeId() {
        return requestedUnitTypeId;
    }

    /**
     * Sets the value of the requestedUnitTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestedUnitTypeId(BigInteger value) {
        this.requestedUnitTypeId = value;
    }

    /**
     * Gets the value of the requestedUnitTypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedUnitTypeUniversalId() {
        return requestedUnitTypeUniversalId;
    }

    /**
     * Sets the value of the requestedUnitTypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedUnitTypeUniversalId(String value) {
        this.requestedUnitTypeUniversalId = value;
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
