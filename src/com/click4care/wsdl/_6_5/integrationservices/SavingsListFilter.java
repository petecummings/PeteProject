
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
 *           &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="categoryDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="categoryDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="categoryUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="cmBaseId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="cmBaseUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *           &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="groupUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="medicalServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="medicalServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="memberDiagnosisId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="memberDiagnosisUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="memberId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="memberUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="netSavings" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *           &lt;element name="providerId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="providerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *           &lt;element name="umBaseId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="umBaseUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "categoryDropDownListItemLabel",
    "categoryDropDownListName",
    "categoryId",
    "categoryUniversalId",
    "cmBaseId",
    "cmBaseUniversalId",
    "fromDate",
    "groupId",
    "groupUniversalId",
    "medicalServiceId",
    "medicalServiceUniversalId",
    "memberDiagnosisId",
    "memberDiagnosisUniversalId",
    "memberId",
    "memberUniversalId",
    "netSavings",
    "providerId",
    "providerUniversalId",
    "toDate",
    "umBaseId",
    "umBaseUniversalId",
    "createdDate",
    "lastActionDate",
    "queryState"
})
@XmlRootElement(name = "savingsListFilter")
public class SavingsListFilter {

    protected List<String> legacyId;
    protected List<BigInteger> id;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected String categoryDropDownListItemLabel;
    protected String categoryDropDownListName;
    protected BigInteger categoryId;
    protected String categoryUniversalId;
    protected BigInteger cmBaseId;
    protected String cmBaseUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    protected BigInteger groupId;
    protected String groupUniversalId;
    protected BigInteger medicalServiceId;
    protected String medicalServiceUniversalId;
    protected BigInteger memberDiagnosisId;
    protected String memberDiagnosisUniversalId;
    protected BigInteger memberId;
    protected String memberUniversalId;
    protected Double netSavings;
    protected BigInteger providerId;
    protected String providerUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    protected BigInteger umBaseId;
    protected String umBaseUniversalId;
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
     * Gets the value of the categoryDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryDropDownListItemLabel() {
        return categoryDropDownListItemLabel;
    }

    /**
     * Sets the value of the categoryDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryDropDownListItemLabel(String value) {
        this.categoryDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the categoryDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryDropDownListName() {
        return categoryDropDownListName;
    }

    /**
     * Sets the value of the categoryDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryDropDownListName(String value) {
        this.categoryDropDownListName = value;
    }

    /**
     * Gets the value of the categoryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCategoryId(BigInteger value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the categoryUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryUniversalId() {
        return categoryUniversalId;
    }

    /**
     * Sets the value of the categoryUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryUniversalId(String value) {
        this.categoryUniversalId = value;
    }

    /**
     * Gets the value of the cmBaseId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCmBaseId() {
        return cmBaseId;
    }

    /**
     * Sets the value of the cmBaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCmBaseId(BigInteger value) {
        this.cmBaseId = value;
    }

    /**
     * Gets the value of the cmBaseUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmBaseUniversalId() {
        return cmBaseUniversalId;
    }

    /**
     * Sets the value of the cmBaseUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmBaseUniversalId(String value) {
        this.cmBaseUniversalId = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroupId(BigInteger value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the groupUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupUniversalId() {
        return groupUniversalId;
    }

    /**
     * Sets the value of the groupUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupUniversalId(String value) {
        this.groupUniversalId = value;
    }

    /**
     * Gets the value of the medicalServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMedicalServiceId() {
        return medicalServiceId;
    }

    /**
     * Sets the value of the medicalServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMedicalServiceId(BigInteger value) {
        this.medicalServiceId = value;
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
     * Gets the value of the memberDiagnosisId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMemberDiagnosisId() {
        return memberDiagnosisId;
    }

    /**
     * Sets the value of the memberDiagnosisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMemberDiagnosisId(BigInteger value) {
        this.memberDiagnosisId = value;
    }

    /**
     * Gets the value of the memberDiagnosisUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberDiagnosisUniversalId() {
        return memberDiagnosisUniversalId;
    }

    /**
     * Sets the value of the memberDiagnosisUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberDiagnosisUniversalId(String value) {
        this.memberDiagnosisUniversalId = value;
    }

    /**
     * Gets the value of the memberId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMemberId() {
        return memberId;
    }

    /**
     * Sets the value of the memberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMemberId(BigInteger value) {
        this.memberId = value;
    }

    /**
     * Gets the value of the memberUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberUniversalId() {
        return memberUniversalId;
    }

    /**
     * Sets the value of the memberUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberUniversalId(String value) {
        this.memberUniversalId = value;
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
     * Gets the value of the providerId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProviderId() {
        return providerId;
    }

    /**
     * Sets the value of the providerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProviderId(BigInteger value) {
        this.providerId = value;
    }

    /**
     * Gets the value of the providerUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderUniversalId() {
        return providerUniversalId;
    }

    /**
     * Sets the value of the providerUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderUniversalId(String value) {
        this.providerUniversalId = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the umBaseId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUmBaseId() {
        return umBaseId;
    }

    /**
     * Sets the value of the umBaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmBaseId(BigInteger value) {
        this.umBaseId = value;
    }

    /**
     * Gets the value of the umBaseUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmBaseUniversalId() {
        return umBaseUniversalId;
    }

    /**
     * Sets the value of the umBaseUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmBaseUniversalId(String value) {
        this.umBaseUniversalId = value;
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
