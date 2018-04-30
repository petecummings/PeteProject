
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
 * <p>Java class for provider_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provider_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}user_type">
 *       &lt;sequence>
 *         &lt;element name="acceptingNewPatients" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="authorizedForAutomaticDetermination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="federalTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAdministrator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPrimaryCareProvider" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="locationUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pcpCategory" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="pcpCategoryDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcpCategoryDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcpCategoryUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="removeFromLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supplierTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplierTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplierTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="supplierTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalNumberActivePlanMembersInPractice" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="totalNumberOfPatients" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="totalNumberOfPatientsInPractice" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="totalNumberOfPlanMembers" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provider_type", propOrder = {
    "acceptingNewPatients",
    "authorizedForAutomaticDetermination",
    "dateOfBirth",
    "federalTaxId",
    "insuranceId",
    "isAdministrator",
    "isPrimaryCareProvider",
    "locationUniversalId",
    "pcpCategory",
    "pcpCategoryDropDownListItemLabel",
    "pcpCategoryDropDownListName",
    "pcpCategoryUniversalId",
    "planId",
    "removeFromLocation",
    "supplierTypeDropDownListItemLabel",
    "supplierTypeDropDownListName",
    "supplierTypeId",
    "supplierTypeUniversalId",
    "totalNumberActivePlanMembersInPractice",
    "totalNumberOfPatients",
    "totalNumberOfPatientsInPractice",
    "totalNumberOfPlanMembers",
    "type",
    "typeDropDownListItemLabel",
    "typeDropDownListName",
    "typeUniversalId",
    "upin"
})
public class ProviderType
    extends UserType
{

    protected Boolean acceptingNewPatients;
    protected Boolean authorizedForAutomaticDetermination;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    protected String federalTaxId;
    protected String insuranceId;
    protected Boolean isAdministrator;
    protected Boolean isPrimaryCareProvider;
    protected List<String> locationUniversalId;
    protected BigInteger pcpCategory;
    protected String pcpCategoryDropDownListItemLabel;
    protected String pcpCategoryDropDownListName;
    protected String pcpCategoryUniversalId;
    protected String planId;
    protected Boolean removeFromLocation;
    protected String supplierTypeDropDownListItemLabel;
    protected String supplierTypeDropDownListName;
    protected BigInteger supplierTypeId;
    protected String supplierTypeUniversalId;
    protected BigInteger totalNumberActivePlanMembersInPractice;
    protected BigInteger totalNumberOfPatients;
    protected BigInteger totalNumberOfPatientsInPractice;
    protected BigInteger totalNumberOfPlanMembers;
    protected BigInteger type;
    protected String typeDropDownListItemLabel;
    protected String typeDropDownListName;
    protected String typeUniversalId;
    protected String upin;

    /**
     * Gets the value of the acceptingNewPatients property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptingNewPatients() {
        return acceptingNewPatients;
    }

    /**
     * Sets the value of the acceptingNewPatients property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptingNewPatients(Boolean value) {
        this.acceptingNewPatients = value;
    }

    /**
     * Gets the value of the authorizedForAutomaticDetermination property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorizedForAutomaticDetermination() {
        return authorizedForAutomaticDetermination;
    }

    /**
     * Sets the value of the authorizedForAutomaticDetermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorizedForAutomaticDetermination(Boolean value) {
        this.authorizedForAutomaticDetermination = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the federalTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalTaxId() {
        return federalTaxId;
    }

    /**
     * Sets the value of the federalTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalTaxId(String value) {
        this.federalTaxId = value;
    }

    /**
     * Gets the value of the insuranceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceId() {
        return insuranceId;
    }

    /**
     * Sets the value of the insuranceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceId(String value) {
        this.insuranceId = value;
    }

    /**
     * Gets the value of the isAdministrator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdministrator() {
        return isAdministrator;
    }

    /**
     * Sets the value of the isAdministrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdministrator(Boolean value) {
        this.isAdministrator = value;
    }

    /**
     * Gets the value of the isPrimaryCareProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimaryCareProvider() {
        return isPrimaryCareProvider;
    }

    /**
     * Sets the value of the isPrimaryCareProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimaryCareProvider(Boolean value) {
        this.isPrimaryCareProvider = value;
    }

    /**
     * Gets the value of the locationUniversalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationUniversalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationUniversalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocationUniversalId() {
        if (locationUniversalId == null) {
            locationUniversalId = new ArrayList<String>();
        }
        return this.locationUniversalId;
    }

    /**
     * Gets the value of the pcpCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPcpCategory() {
        return pcpCategory;
    }

    /**
     * Sets the value of the pcpCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPcpCategory(BigInteger value) {
        this.pcpCategory = value;
    }

    /**
     * Gets the value of the pcpCategoryDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcpCategoryDropDownListItemLabel() {
        return pcpCategoryDropDownListItemLabel;
    }

    /**
     * Sets the value of the pcpCategoryDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcpCategoryDropDownListItemLabel(String value) {
        this.pcpCategoryDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the pcpCategoryDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcpCategoryDropDownListName() {
        return pcpCategoryDropDownListName;
    }

    /**
     * Sets the value of the pcpCategoryDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcpCategoryDropDownListName(String value) {
        this.pcpCategoryDropDownListName = value;
    }

    /**
     * Gets the value of the pcpCategoryUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcpCategoryUniversalId() {
        return pcpCategoryUniversalId;
    }

    /**
     * Sets the value of the pcpCategoryUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcpCategoryUniversalId(String value) {
        this.pcpCategoryUniversalId = value;
    }

    /**
     * Gets the value of the planId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * Sets the value of the planId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanId(String value) {
        this.planId = value;
    }

    /**
     * Gets the value of the removeFromLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveFromLocation() {
        return removeFromLocation;
    }

    /**
     * Sets the value of the removeFromLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveFromLocation(Boolean value) {
        this.removeFromLocation = value;
    }

    /**
     * Gets the value of the supplierTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierTypeDropDownListItemLabel() {
        return supplierTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the supplierTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierTypeDropDownListItemLabel(String value) {
        this.supplierTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the supplierTypeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierTypeDropDownListName() {
        return supplierTypeDropDownListName;
    }

    /**
     * Sets the value of the supplierTypeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierTypeDropDownListName(String value) {
        this.supplierTypeDropDownListName = value;
    }

    /**
     * Gets the value of the supplierTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSupplierTypeId() {
        return supplierTypeId;
    }

    /**
     * Sets the value of the supplierTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSupplierTypeId(BigInteger value) {
        this.supplierTypeId = value;
    }

    /**
     * Gets the value of the supplierTypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierTypeUniversalId() {
        return supplierTypeUniversalId;
    }

    /**
     * Sets the value of the supplierTypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierTypeUniversalId(String value) {
        this.supplierTypeUniversalId = value;
    }

    /**
     * Gets the value of the totalNumberActivePlanMembersInPractice property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberActivePlanMembersInPractice() {
        return totalNumberActivePlanMembersInPractice;
    }

    /**
     * Sets the value of the totalNumberActivePlanMembersInPractice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberActivePlanMembersInPractice(BigInteger value) {
        this.totalNumberActivePlanMembersInPractice = value;
    }

    /**
     * Gets the value of the totalNumberOfPatients property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfPatients() {
        return totalNumberOfPatients;
    }

    /**
     * Sets the value of the totalNumberOfPatients property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfPatients(BigInteger value) {
        this.totalNumberOfPatients = value;
    }

    /**
     * Gets the value of the totalNumberOfPatientsInPractice property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfPatientsInPractice() {
        return totalNumberOfPatientsInPractice;
    }

    /**
     * Sets the value of the totalNumberOfPatientsInPractice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfPatientsInPractice(BigInteger value) {
        this.totalNumberOfPatientsInPractice = value;
    }

    /**
     * Gets the value of the totalNumberOfPlanMembers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfPlanMembers() {
        return totalNumberOfPlanMembers;
    }

    /**
     * Sets the value of the totalNumberOfPlanMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfPlanMembers(BigInteger value) {
        this.totalNumberOfPlanMembers = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setType(BigInteger value) {
        this.type = value;
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
     * Gets the value of the typeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeUniversalId() {
        return typeUniversalId;
    }

    /**
     * Sets the value of the typeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeUniversalId(String value) {
        this.typeUniversalId = value;
    }

    /**
     * Gets the value of the upin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpin() {
        return upin;
    }

    /**
     * Sets the value of the upin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpin(String value) {
        this.upin = value;
    }

}
