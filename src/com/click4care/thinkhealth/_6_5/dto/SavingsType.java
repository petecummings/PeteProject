
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for savings_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="savings_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="categoryUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cmBaseId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="cmBaseUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customFields" type="{http://www.click4care.com/thinkhealth/6.5/dto}customFields_type" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="groupUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="medicalServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="medicalServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberDiagnosisId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="memberDiagnosisUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="memberUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netSavings" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="originalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="providerId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="providerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="adHocNegotiatedSavingsCategoryDetail" type="{http://www.click4care.com/thinkhealth/6.5/dto}ad_hoc_negotiated_savings_category_detail_type"/>
 *           &lt;element name="benefitExceptionSavingsCategoryDetail" type="{http://www.click4care.com/thinkhealth/6.5/dto}benefit_exception_savings_category_detail_type"/>
 *           &lt;element name="benefitExchangeSavingsCategoryDetail" type="{http://www.click4care.com/thinkhealth/6.5/dto}benefit_exchange_savings_category_detail_type"/>
 *           &lt;element name="denialSavingsCategoryDetail" type="{http://www.click4care.com/thinkhealth/6.5/dto}denial_savings_category_detail_type"/>
 *           &lt;element name="memberReportedSavingsCategoryDetail" type="{http://www.click4care.com/thinkhealth/6.5/dto}member_reported_savings_category_detail_type"/>
 *           &lt;element name="otherSavingsCategoryDetail" type="{http://www.click4care.com/thinkhealth/6.5/dto}other_savings_category_detail_type"/>
 *           &lt;element name="otherUMRelatedSavingsCategoryDetail" type="{http://www.click4care.com/thinkhealth/6.5/dto}other_um_related_savings_category_detail_type"/>
 *           &lt;element name="perContractNegotiatedSavingsCategoryDetail" type="{http://www.click4care.com/thinkhealth/6.5/dto}per_contract_negotiated_savings_category_detail_type"/>
 *         &lt;/choice>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="umBaseId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="umBaseUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="umExtensionId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="umExtensionUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "savings_type", propOrder = {
    "c4CId",
    "categoryDropDownListItemLabel",
    "categoryDropDownListName",
    "categoryId",
    "categoryUniversalId",
    "cmBaseId",
    "cmBaseUniversalId",
    "comments",
    "createdDate",
    "customFields",
    "deletedDate",
    "fromDate",
    "groupId",
    "groupUniversalId",
    "id",
    "lastActionDate",
    "medicalServiceId",
    "medicalServiceUniversalId",
    "memberDiagnosisId",
    "memberDiagnosisUniversalId",
    "memberId",
    "memberUniversalId",
    "netSavings",
    "originalCost",
    "providerId",
    "providerUniversalId",
    "adHocNegotiatedSavingsCategoryDetail",
    "benefitExceptionSavingsCategoryDetail",
    "benefitExchangeSavingsCategoryDetail",
    "denialSavingsCategoryDetail",
    "memberReportedSavingsCategoryDetail",
    "otherSavingsCategoryDetail",
    "otherUMRelatedSavingsCategoryDetail",
    "perContractNegotiatedSavingsCategoryDetail",
    "toDate",
    "umBaseId",
    "umBaseUniversalId",
    "umExtensionId",
    "umExtensionUniversalId",
    "universalId",
    "version"
})
public class SavingsType {

    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected String categoryDropDownListItemLabel;
    protected String categoryDropDownListName;
    protected BigInteger categoryId;
    protected String categoryUniversalId;
    protected BigInteger cmBaseId;
    protected String cmBaseUniversalId;
    protected String comments;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected CustomFieldsType customFields;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    protected BigInteger groupId;
    protected String groupUniversalId;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected BigInteger medicalServiceId;
    protected String medicalServiceUniversalId;
    protected BigInteger memberDiagnosisId;
    protected String memberDiagnosisUniversalId;
    protected BigInteger memberId;
    protected String memberUniversalId;
    protected Double netSavings;
    protected Double originalCost;
    protected BigInteger providerId;
    protected String providerUniversalId;
    protected AdHocNegotiatedSavingsCategoryDetailType adHocNegotiatedSavingsCategoryDetail;
    protected BenefitExceptionSavingsCategoryDetailType benefitExceptionSavingsCategoryDetail;
    protected BenefitExchangeSavingsCategoryDetailType benefitExchangeSavingsCategoryDetail;
    protected DenialSavingsCategoryDetailType denialSavingsCategoryDetail;
    protected MemberReportedSavingsCategoryDetailType memberReportedSavingsCategoryDetail;
    protected OtherSavingsCategoryDetailType otherSavingsCategoryDetail;
    protected OtherUmRelatedSavingsCategoryDetailType otherUMRelatedSavingsCategoryDetail;
    protected PerContractNegotiatedSavingsCategoryDetailType perContractNegotiatedSavingsCategoryDetail;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    protected BigInteger umBaseId;
    protected String umBaseUniversalId;
    protected BigInteger umExtensionId;
    protected String umExtensionUniversalId;
    protected String universalId;
    protected BigInteger version;

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
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldsType }
     *     
     */
    public CustomFieldsType getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldsType }
     *     
     */
    public void setCustomFields(CustomFieldsType value) {
        this.customFields = value;
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
     * Gets the value of the originalCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOriginalCost() {
        return originalCost;
    }

    /**
     * Sets the value of the originalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOriginalCost(Double value) {
        this.originalCost = value;
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
     * Gets the value of the adHocNegotiatedSavingsCategoryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AdHocNegotiatedSavingsCategoryDetailType }
     *     
     */
    public AdHocNegotiatedSavingsCategoryDetailType getAdHocNegotiatedSavingsCategoryDetail() {
        return adHocNegotiatedSavingsCategoryDetail;
    }

    /**
     * Sets the value of the adHocNegotiatedSavingsCategoryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdHocNegotiatedSavingsCategoryDetailType }
     *     
     */
    public void setAdHocNegotiatedSavingsCategoryDetail(AdHocNegotiatedSavingsCategoryDetailType value) {
        this.adHocNegotiatedSavingsCategoryDetail = value;
    }

    /**
     * Gets the value of the benefitExceptionSavingsCategoryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link BenefitExceptionSavingsCategoryDetailType }
     *     
     */
    public BenefitExceptionSavingsCategoryDetailType getBenefitExceptionSavingsCategoryDetail() {
        return benefitExceptionSavingsCategoryDetail;
    }

    /**
     * Sets the value of the benefitExceptionSavingsCategoryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenefitExceptionSavingsCategoryDetailType }
     *     
     */
    public void setBenefitExceptionSavingsCategoryDetail(BenefitExceptionSavingsCategoryDetailType value) {
        this.benefitExceptionSavingsCategoryDetail = value;
    }

    /**
     * Gets the value of the benefitExchangeSavingsCategoryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link BenefitExchangeSavingsCategoryDetailType }
     *     
     */
    public BenefitExchangeSavingsCategoryDetailType getBenefitExchangeSavingsCategoryDetail() {
        return benefitExchangeSavingsCategoryDetail;
    }

    /**
     * Sets the value of the benefitExchangeSavingsCategoryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenefitExchangeSavingsCategoryDetailType }
     *     
     */
    public void setBenefitExchangeSavingsCategoryDetail(BenefitExchangeSavingsCategoryDetailType value) {
        this.benefitExchangeSavingsCategoryDetail = value;
    }

    /**
     * Gets the value of the denialSavingsCategoryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DenialSavingsCategoryDetailType }
     *     
     */
    public DenialSavingsCategoryDetailType getDenialSavingsCategoryDetail() {
        return denialSavingsCategoryDetail;
    }

    /**
     * Sets the value of the denialSavingsCategoryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DenialSavingsCategoryDetailType }
     *     
     */
    public void setDenialSavingsCategoryDetail(DenialSavingsCategoryDetailType value) {
        this.denialSavingsCategoryDetail = value;
    }

    /**
     * Gets the value of the memberReportedSavingsCategoryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link MemberReportedSavingsCategoryDetailType }
     *     
     */
    public MemberReportedSavingsCategoryDetailType getMemberReportedSavingsCategoryDetail() {
        return memberReportedSavingsCategoryDetail;
    }

    /**
     * Sets the value of the memberReportedSavingsCategoryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberReportedSavingsCategoryDetailType }
     *     
     */
    public void setMemberReportedSavingsCategoryDetail(MemberReportedSavingsCategoryDetailType value) {
        this.memberReportedSavingsCategoryDetail = value;
    }

    /**
     * Gets the value of the otherSavingsCategoryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OtherSavingsCategoryDetailType }
     *     
     */
    public OtherSavingsCategoryDetailType getOtherSavingsCategoryDetail() {
        return otherSavingsCategoryDetail;
    }

    /**
     * Sets the value of the otherSavingsCategoryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherSavingsCategoryDetailType }
     *     
     */
    public void setOtherSavingsCategoryDetail(OtherSavingsCategoryDetailType value) {
        this.otherSavingsCategoryDetail = value;
    }

    /**
     * Gets the value of the otherUMRelatedSavingsCategoryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OtherUmRelatedSavingsCategoryDetailType }
     *     
     */
    public OtherUmRelatedSavingsCategoryDetailType getOtherUMRelatedSavingsCategoryDetail() {
        return otherUMRelatedSavingsCategoryDetail;
    }

    /**
     * Sets the value of the otherUMRelatedSavingsCategoryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherUmRelatedSavingsCategoryDetailType }
     *     
     */
    public void setOtherUMRelatedSavingsCategoryDetail(OtherUmRelatedSavingsCategoryDetailType value) {
        this.otherUMRelatedSavingsCategoryDetail = value;
    }

    /**
     * Gets the value of the perContractNegotiatedSavingsCategoryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PerContractNegotiatedSavingsCategoryDetailType }
     *     
     */
    public PerContractNegotiatedSavingsCategoryDetailType getPerContractNegotiatedSavingsCategoryDetail() {
        return perContractNegotiatedSavingsCategoryDetail;
    }

    /**
     * Sets the value of the perContractNegotiatedSavingsCategoryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerContractNegotiatedSavingsCategoryDetailType }
     *     
     */
    public void setPerContractNegotiatedSavingsCategoryDetail(PerContractNegotiatedSavingsCategoryDetailType value) {
        this.perContractNegotiatedSavingsCategoryDetail = value;
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
     * Gets the value of the umExtensionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUmExtensionId() {
        return umExtensionId;
    }

    /**
     * Sets the value of the umExtensionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmExtensionId(BigInteger value) {
        this.umExtensionId = value;
    }

    /**
     * Gets the value of the umExtensionUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmExtensionUniversalId() {
        return umExtensionUniversalId;
    }

    /**
     * Sets the value of the umExtensionUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmExtensionUniversalId(String value) {
        this.umExtensionUniversalId = value;
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
