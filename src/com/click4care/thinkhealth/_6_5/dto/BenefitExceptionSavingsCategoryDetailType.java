
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for benefit_exception_savings_category_detail_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="benefit_exception_savings_category_detail_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="benefitExceptionSavingsId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costPerUnit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expectedBenefit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="netSavings" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="unitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
@XmlType(name = "benefit_exception_savings_category_detail_type", propOrder = {
    "benefitExceptionSavingsId",
    "c4CId",
    "costPerUnit",
    "createdDate",
    "deletedDate",
    "expectedBenefit",
    "id",
    "lastActionDate",
    "netSavings",
    "requestedProviderId",
    "requestedProviderUniversalId",
    "requestedServiceId",
    "requestedServiceUniversalId",
    "unitTypeDropDownListItemLabel",
    "unitTypeDropDownListName",
    "unitTypeId",
    "unitTypeUniversalId",
    "units",
    "universalId",
    "version"
})
public class BenefitExceptionSavingsCategoryDetailType {

    protected BigInteger benefitExceptionSavingsId;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected double costPerUnit;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected double expectedBenefit;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected Double netSavings;
    protected BigInteger requestedProviderId;
    protected String requestedProviderUniversalId;
    protected BigInteger requestedServiceId;
    protected String requestedServiceUniversalId;
    protected String unitTypeDropDownListItemLabel;
    protected String unitTypeDropDownListName;
    protected BigInteger unitTypeId;
    protected String unitTypeUniversalId;
    @XmlElement(required = true)
    protected BigInteger units;
    protected String universalId;
    protected BigInteger version;

    /**
     * Gets the value of the benefitExceptionSavingsId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBenefitExceptionSavingsId() {
        return benefitExceptionSavingsId;
    }

    /**
     * Sets the value of the benefitExceptionSavingsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBenefitExceptionSavingsId(BigInteger value) {
        this.benefitExceptionSavingsId = value;
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
     * Gets the value of the expectedBenefit property.
     * 
     */
    public double getExpectedBenefit() {
        return expectedBenefit;
    }

    /**
     * Sets the value of the expectedBenefit property.
     * 
     */
    public void setExpectedBenefit(double value) {
        this.expectedBenefit = value;
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
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnits(BigInteger value) {
        this.units = value;
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

}
