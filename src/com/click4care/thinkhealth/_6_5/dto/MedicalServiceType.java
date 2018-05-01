
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfMedicalServiceType;


/**
 * <p>Java class for medicalService_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medicalService_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}appealable_type">
 *       &lt;sequence>
 *         &lt;element name="bedType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="bedTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bedTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bedTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coverThroughDischarge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cumulativeApprovedDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cumulativeApprovedDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cumulativeApprovedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="customFields" type="{http://www.click4care.com/thinkhealth/6.5/dto}customFields_type" minOccurs="0"/>
 *         &lt;element name="denialServiceCategory" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="denialServiceCategoryDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denialServiceCategoryDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denialServiceCategoryUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denialServiceReason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="denialServiceReasonDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denialServiceReasonDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denialServiceReasonUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptRcvdTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="diagnosisUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dischargeActualAdmitDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dischargeActualDischargeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dischargeDisposition" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="dischargeDispositionDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dischargeDispositionDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dischargeDispositionUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expeditedRequestor" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="expeditedRequestorDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expeditedRequestorDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expeditedRequestorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extendLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="feesVerified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flatFeeType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="flatFeeTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flatFeeTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flatFeeTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="healthPlanRcvdTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="inNetwork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="levelOfService" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="levelOfServiceDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelOfServiceDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelOfServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manuallyDeterminedBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="manuallyDeterminedByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manuallyDeterminedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="parentUmId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="parentUmUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payAtMaximum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="percentageBilled" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="placeOfServiceType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="placeOfServiceTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeOfServiceTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeOfServiceTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processAs" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="processAsDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processAsDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processAsUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerAssociation" type="{http://www.click4care.com/thinkhealth/6.5/dto}medical_service_provider_association_type" minOccurs="0"/>
 *         &lt;element name="reimbursementAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="reimbursementMethod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reimbursementMethodDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reimbursementMethodDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reimbursementMethodUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceAgreement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="serviceCodes" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceCode" type="{http://www.click4care.com/thinkhealth/6.5/dto}service_code_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="serviceLaymansTerms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="serviceLaymansTermsDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLaymansTermsDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLaymansTermsUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfMedicalServiceType" minOccurs="0"/>
 *         &lt;element name="typeOfAction" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeOfActionDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeOfActionDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeOfActionUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicalService_type", propOrder = {
    "bedType",
    "bedTypeDropDownListItemLabel",
    "bedTypeDropDownListName",
    "bedTypeUniversalId",
    "contractId",
    "coverThroughDischarge",
    "cumulativeApprovedDateFrom",
    "cumulativeApprovedDateTo",
    "cumulativeApprovedQuantity",
    "customFields",
    "denialServiceCategory",
    "denialServiceCategoryDropDownListItemLabel",
    "denialServiceCategoryDropDownListName",
    "denialServiceCategoryUniversalId",
    "denialServiceReason",
    "denialServiceReasonDropDownListItemLabel",
    "denialServiceReasonDropDownListName",
    "denialServiceReasonUniversalId",
    "deptRcvdTime",
    "diagnosisUniversalId",
    "dischargeActualAdmitDate",
    "dischargeActualDischargeDate",
    "dischargeDisposition",
    "dischargeDispositionDropDownListItemLabel",
    "dischargeDispositionDropDownListName",
    "dischargeDispositionUniversalId",
    "expeditedRequestor",
    "expeditedRequestorDropDownListItemLabel",
    "expeditedRequestorDropDownListName",
    "expeditedRequestorUniversalId",
    "extendLimit",
    "feesVerified",
    "flatFeeType",
    "flatFeeTypeDropDownListItemLabel",
    "flatFeeTypeDropDownListName",
    "flatFeeTypeUniversalId",
    "healthPlanRcvdTime",
    "inNetwork",
    "levelOfService",
    "levelOfServiceDropDownListItemLabel",
    "levelOfServiceDropDownListName",
    "levelOfServiceUniversalId",
    "manuallyDeterminedBy",
    "manuallyDeterminedByUniversalId",
    "manuallyDeterminedDate",
    "parentUmId",
    "parentUmUniversalId",
    "payAtMaximum",
    "percentageBilled",
    "placeOfServiceType",
    "placeOfServiceTypeDropDownListItemLabel",
    "placeOfServiceTypeDropDownListName",
    "placeOfServiceTypeUniversalId",
    "processAs",
    "processAsDropDownListItemLabel",
    "processAsDropDownListName",
    "processAsUniversalId",
    "providerAssociation",
    "reimbursementAmount",
    "reimbursementMethod",
    "reimbursementMethodDropDownListItemLabel",
    "reimbursementMethodDropDownListName",
    "reimbursementMethodUniversalId",
    "serviceAgreement",
    "serviceCodes",
    "serviceLaymansTerms",
    "serviceLaymansTermsDropDownListItemLabel",
    "serviceLaymansTermsDropDownListName",
    "serviceLaymansTermsUniversalId",
    "serviceType",
    "typeOfAction",
    "typeOfActionDropDownListItemLabel",
    "typeOfActionDropDownListName",
    "typeOfActionUniversalId"
})
public class MedicalServiceType
    extends AppealableType
{

    protected BigInteger bedType;
    protected String bedTypeDropDownListItemLabel;
    protected String bedTypeDropDownListName;
    protected String bedTypeUniversalId;
    protected String contractId;
    protected Boolean coverThroughDischarge;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cumulativeApprovedDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cumulativeApprovedDateTo;
    protected BigInteger cumulativeApprovedQuantity;
    protected CustomFieldsType customFields;
    protected BigInteger denialServiceCategory;
    protected String denialServiceCategoryDropDownListItemLabel;
    protected String denialServiceCategoryDropDownListName;
    protected String denialServiceCategoryUniversalId;
    protected BigInteger denialServiceReason;
    protected String denialServiceReasonDropDownListItemLabel;
    protected String denialServiceReasonDropDownListName;
    protected String denialServiceReasonUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deptRcvdTime;
    protected String diagnosisUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dischargeActualAdmitDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dischargeActualDischargeDate;
    protected BigInteger dischargeDisposition;
    protected String dischargeDispositionDropDownListItemLabel;
    protected String dischargeDispositionDropDownListName;
    protected String dischargeDispositionUniversalId;
    protected BigInteger expeditedRequestor;
    protected String expeditedRequestorDropDownListItemLabel;
    protected String expeditedRequestorDropDownListName;
    protected String expeditedRequestorUniversalId;
    protected Boolean extendLimit;
    protected Boolean feesVerified;
    protected BigInteger flatFeeType;
    protected String flatFeeTypeDropDownListItemLabel;
    protected String flatFeeTypeDropDownListName;
    protected String flatFeeTypeUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar healthPlanRcvdTime;
    protected Boolean inNetwork;
    protected BigInteger levelOfService;
    protected String levelOfServiceDropDownListItemLabel;
    protected String levelOfServiceDropDownListName;
    protected String levelOfServiceUniversalId;
    protected BigInteger manuallyDeterminedBy;
    protected String manuallyDeterminedByUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar manuallyDeterminedDate;
    protected BigInteger parentUmId;
    protected String parentUmUniversalId;
    protected Boolean payAtMaximum;
    protected BigDecimal percentageBilled;
    protected BigInteger placeOfServiceType;
    protected String placeOfServiceTypeDropDownListItemLabel;
    protected String placeOfServiceTypeDropDownListName;
    protected String placeOfServiceTypeUniversalId;
    protected BigInteger processAs;
    protected String processAsDropDownListItemLabel;
    protected String processAsDropDownListName;
    protected String processAsUniversalId;
    protected MedicalServiceProviderAssociationType providerAssociation;
    protected BigDecimal reimbursementAmount;
    protected BigInteger reimbursementMethod;
    protected String reimbursementMethodDropDownListItemLabel;
    protected String reimbursementMethodDropDownListName;
    protected String reimbursementMethodUniversalId;
    protected boolean serviceAgreement;
    @XmlElement(namespace = "http://www.click4care.com/thinkhealth/6.5/dto")
    protected MedicalServiceType.ServiceCodes serviceCodes;
    protected BigInteger serviceLaymansTerms;
    protected String serviceLaymansTermsDropDownListItemLabel;
    protected String serviceLaymansTermsDropDownListName;
    protected String serviceLaymansTermsUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfMedicalServiceType serviceType;
    protected BigInteger typeOfAction;
    protected String typeOfActionDropDownListItemLabel;
    protected String typeOfActionDropDownListName;
    protected String typeOfActionUniversalId;

    /**
     * Gets the value of the bedType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBedType() {
        return bedType;
    }

    /**
     * Sets the value of the bedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBedType(BigInteger value) {
        this.bedType = value;
    }

    /**
     * Gets the value of the bedTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedTypeDropDownListItemLabel() {
        return bedTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the bedTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedTypeDropDownListItemLabel(String value) {
        this.bedTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the bedTypeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedTypeDropDownListName() {
        return bedTypeDropDownListName;
    }

    /**
     * Sets the value of the bedTypeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedTypeDropDownListName(String value) {
        this.bedTypeDropDownListName = value;
    }

    /**
     * Gets the value of the bedTypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedTypeUniversalId() {
        return bedTypeUniversalId;
    }

    /**
     * Sets the value of the bedTypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedTypeUniversalId(String value) {
        this.bedTypeUniversalId = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractId(String value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the coverThroughDischarge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoverThroughDischarge() {
        return coverThroughDischarge;
    }

    /**
     * Sets the value of the coverThroughDischarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoverThroughDischarge(Boolean value) {
        this.coverThroughDischarge = value;
    }

    /**
     * Gets the value of the cumulativeApprovedDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCumulativeApprovedDateFrom() {
        return cumulativeApprovedDateFrom;
    }

    /**
     * Sets the value of the cumulativeApprovedDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCumulativeApprovedDateFrom(XMLGregorianCalendar value) {
        this.cumulativeApprovedDateFrom = value;
    }

    /**
     * Gets the value of the cumulativeApprovedDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCumulativeApprovedDateTo() {
        return cumulativeApprovedDateTo;
    }

    /**
     * Sets the value of the cumulativeApprovedDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCumulativeApprovedDateTo(XMLGregorianCalendar value) {
        this.cumulativeApprovedDateTo = value;
    }

    /**
     * Gets the value of the cumulativeApprovedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCumulativeApprovedQuantity() {
        return cumulativeApprovedQuantity;
    }

    /**
     * Sets the value of the cumulativeApprovedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCumulativeApprovedQuantity(BigInteger value) {
        this.cumulativeApprovedQuantity = value;
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
     * Gets the value of the denialServiceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDenialServiceCategory() {
        return denialServiceCategory;
    }

    /**
     * Sets the value of the denialServiceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDenialServiceCategory(BigInteger value) {
        this.denialServiceCategory = value;
    }

    /**
     * Gets the value of the denialServiceCategoryDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenialServiceCategoryDropDownListItemLabel() {
        return denialServiceCategoryDropDownListItemLabel;
    }

    /**
     * Sets the value of the denialServiceCategoryDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenialServiceCategoryDropDownListItemLabel(String value) {
        this.denialServiceCategoryDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the denialServiceCategoryDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenialServiceCategoryDropDownListName() {
        return denialServiceCategoryDropDownListName;
    }

    /**
     * Sets the value of the denialServiceCategoryDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenialServiceCategoryDropDownListName(String value) {
        this.denialServiceCategoryDropDownListName = value;
    }

    /**
     * Gets the value of the denialServiceCategoryUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenialServiceCategoryUniversalId() {
        return denialServiceCategoryUniversalId;
    }

    /**
     * Sets the value of the denialServiceCategoryUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenialServiceCategoryUniversalId(String value) {
        this.denialServiceCategoryUniversalId = value;
    }

    /**
     * Gets the value of the denialServiceReason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDenialServiceReason() {
        return denialServiceReason;
    }

    /**
     * Sets the value of the denialServiceReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDenialServiceReason(BigInteger value) {
        this.denialServiceReason = value;
    }

    /**
     * Gets the value of the denialServiceReasonDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenialServiceReasonDropDownListItemLabel() {
        return denialServiceReasonDropDownListItemLabel;
    }

    /**
     * Sets the value of the denialServiceReasonDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenialServiceReasonDropDownListItemLabel(String value) {
        this.denialServiceReasonDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the denialServiceReasonDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenialServiceReasonDropDownListName() {
        return denialServiceReasonDropDownListName;
    }

    /**
     * Sets the value of the denialServiceReasonDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenialServiceReasonDropDownListName(String value) {
        this.denialServiceReasonDropDownListName = value;
    }

    /**
     * Gets the value of the denialServiceReasonUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenialServiceReasonUniversalId() {
        return denialServiceReasonUniversalId;
    }

    /**
     * Sets the value of the denialServiceReasonUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenialServiceReasonUniversalId(String value) {
        this.denialServiceReasonUniversalId = value;
    }

    /**
     * Gets the value of the deptRcvdTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeptRcvdTime() {
        return deptRcvdTime;
    }

    /**
     * Sets the value of the deptRcvdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeptRcvdTime(XMLGregorianCalendar value) {
        this.deptRcvdTime = value;
    }

    /**
     * Gets the value of the diagnosisUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosisUniversalId() {
        return diagnosisUniversalId;
    }

    /**
     * Sets the value of the diagnosisUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosisUniversalId(String value) {
        this.diagnosisUniversalId = value;
    }

    /**
     * Gets the value of the dischargeActualAdmitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDischargeActualAdmitDate() {
        return dischargeActualAdmitDate;
    }

    /**
     * Sets the value of the dischargeActualAdmitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDischargeActualAdmitDate(XMLGregorianCalendar value) {
        this.dischargeActualAdmitDate = value;
    }

    /**
     * Gets the value of the dischargeActualDischargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDischargeActualDischargeDate() {
        return dischargeActualDischargeDate;
    }

    /**
     * Sets the value of the dischargeActualDischargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDischargeActualDischargeDate(XMLGregorianCalendar value) {
        this.dischargeActualDischargeDate = value;
    }

    /**
     * Gets the value of the dischargeDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDischargeDisposition() {
        return dischargeDisposition;
    }

    /**
     * Sets the value of the dischargeDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDischargeDisposition(BigInteger value) {
        this.dischargeDisposition = value;
    }

    /**
     * Gets the value of the dischargeDispositionDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDischargeDispositionDropDownListItemLabel() {
        return dischargeDispositionDropDownListItemLabel;
    }

    /**
     * Sets the value of the dischargeDispositionDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDischargeDispositionDropDownListItemLabel(String value) {
        this.dischargeDispositionDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the dischargeDispositionDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDischargeDispositionDropDownListName() {
        return dischargeDispositionDropDownListName;
    }

    /**
     * Sets the value of the dischargeDispositionDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDischargeDispositionDropDownListName(String value) {
        this.dischargeDispositionDropDownListName = value;
    }

    /**
     * Gets the value of the dischargeDispositionUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDischargeDispositionUniversalId() {
        return dischargeDispositionUniversalId;
    }

    /**
     * Sets the value of the dischargeDispositionUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDischargeDispositionUniversalId(String value) {
        this.dischargeDispositionUniversalId = value;
    }

    /**
     * Gets the value of the expeditedRequestor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpeditedRequestor() {
        return expeditedRequestor;
    }

    /**
     * Sets the value of the expeditedRequestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpeditedRequestor(BigInteger value) {
        this.expeditedRequestor = value;
    }

    /**
     * Gets the value of the expeditedRequestorDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeditedRequestorDropDownListItemLabel() {
        return expeditedRequestorDropDownListItemLabel;
    }

    /**
     * Sets the value of the expeditedRequestorDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeditedRequestorDropDownListItemLabel(String value) {
        this.expeditedRequestorDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the expeditedRequestorDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeditedRequestorDropDownListName() {
        return expeditedRequestorDropDownListName;
    }

    /**
     * Sets the value of the expeditedRequestorDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeditedRequestorDropDownListName(String value) {
        this.expeditedRequestorDropDownListName = value;
    }

    /**
     * Gets the value of the expeditedRequestorUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeditedRequestorUniversalId() {
        return expeditedRequestorUniversalId;
    }

    /**
     * Sets the value of the expeditedRequestorUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeditedRequestorUniversalId(String value) {
        this.expeditedRequestorUniversalId = value;
    }

    /**
     * Gets the value of the extendLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtendLimit() {
        return extendLimit;
    }

    /**
     * Sets the value of the extendLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtendLimit(Boolean value) {
        this.extendLimit = value;
    }

    /**
     * Gets the value of the feesVerified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeesVerified() {
        return feesVerified;
    }

    /**
     * Sets the value of the feesVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeesVerified(Boolean value) {
        this.feesVerified = value;
    }

    /**
     * Gets the value of the flatFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlatFeeType() {
        return flatFeeType;
    }

    /**
     * Sets the value of the flatFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlatFeeType(BigInteger value) {
        this.flatFeeType = value;
    }

    /**
     * Gets the value of the flatFeeTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlatFeeTypeDropDownListItemLabel() {
        return flatFeeTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the flatFeeTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlatFeeTypeDropDownListItemLabel(String value) {
        this.flatFeeTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the flatFeeTypeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlatFeeTypeDropDownListName() {
        return flatFeeTypeDropDownListName;
    }

    /**
     * Sets the value of the flatFeeTypeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlatFeeTypeDropDownListName(String value) {
        this.flatFeeTypeDropDownListName = value;
    }

    /**
     * Gets the value of the flatFeeTypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlatFeeTypeUniversalId() {
        return flatFeeTypeUniversalId;
    }

    /**
     * Sets the value of the flatFeeTypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlatFeeTypeUniversalId(String value) {
        this.flatFeeTypeUniversalId = value;
    }

    /**
     * Gets the value of the healthPlanRcvdTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHealthPlanRcvdTime() {
        return healthPlanRcvdTime;
    }

    /**
     * Sets the value of the healthPlanRcvdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHealthPlanRcvdTime(XMLGregorianCalendar value) {
        this.healthPlanRcvdTime = value;
    }

    /**
     * Gets the value of the inNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInNetwork() {
        return inNetwork;
    }

    /**
     * Sets the value of the inNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInNetwork(Boolean value) {
        this.inNetwork = value;
    }

    /**
     * Gets the value of the levelOfService property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevelOfService() {
        return levelOfService;
    }

    /**
     * Sets the value of the levelOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevelOfService(BigInteger value) {
        this.levelOfService = value;
    }

    /**
     * Gets the value of the levelOfServiceDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelOfServiceDropDownListItemLabel() {
        return levelOfServiceDropDownListItemLabel;
    }

    /**
     * Sets the value of the levelOfServiceDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelOfServiceDropDownListItemLabel(String value) {
        this.levelOfServiceDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the levelOfServiceDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelOfServiceDropDownListName() {
        return levelOfServiceDropDownListName;
    }

    /**
     * Sets the value of the levelOfServiceDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelOfServiceDropDownListName(String value) {
        this.levelOfServiceDropDownListName = value;
    }

    /**
     * Gets the value of the levelOfServiceUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelOfServiceUniversalId() {
        return levelOfServiceUniversalId;
    }

    /**
     * Sets the value of the levelOfServiceUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelOfServiceUniversalId(String value) {
        this.levelOfServiceUniversalId = value;
    }

    /**
     * Gets the value of the manuallyDeterminedBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getManuallyDeterminedBy() {
        return manuallyDeterminedBy;
    }

    /**
     * Sets the value of the manuallyDeterminedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setManuallyDeterminedBy(BigInteger value) {
        this.manuallyDeterminedBy = value;
    }

    /**
     * Gets the value of the manuallyDeterminedByUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManuallyDeterminedByUniversalId() {
        return manuallyDeterminedByUniversalId;
    }

    /**
     * Sets the value of the manuallyDeterminedByUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManuallyDeterminedByUniversalId(String value) {
        this.manuallyDeterminedByUniversalId = value;
    }

    /**
     * Gets the value of the manuallyDeterminedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getManuallyDeterminedDate() {
        return manuallyDeterminedDate;
    }

    /**
     * Sets the value of the manuallyDeterminedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setManuallyDeterminedDate(XMLGregorianCalendar value) {
        this.manuallyDeterminedDate = value;
    }

    /**
     * Gets the value of the parentUmId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentUmId() {
        return parentUmId;
    }

    /**
     * Sets the value of the parentUmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentUmId(BigInteger value) {
        this.parentUmId = value;
    }

    /**
     * Gets the value of the parentUmUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentUmUniversalId() {
        return parentUmUniversalId;
    }

    /**
     * Sets the value of the parentUmUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentUmUniversalId(String value) {
        this.parentUmUniversalId = value;
    }

    /**
     * Gets the value of the payAtMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayAtMaximum() {
        return payAtMaximum;
    }

    /**
     * Sets the value of the payAtMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayAtMaximum(Boolean value) {
        this.payAtMaximum = value;
    }

    /**
     * Gets the value of the percentageBilled property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageBilled() {
        return percentageBilled;
    }

    /**
     * Sets the value of the percentageBilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageBilled(BigDecimal value) {
        this.percentageBilled = value;
    }

    /**
     * Gets the value of the placeOfServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlaceOfServiceType() {
        return placeOfServiceType;
    }

    /**
     * Sets the value of the placeOfServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlaceOfServiceType(BigInteger value) {
        this.placeOfServiceType = value;
    }

    /**
     * Gets the value of the placeOfServiceTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfServiceTypeDropDownListItemLabel() {
        return placeOfServiceTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the placeOfServiceTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfServiceTypeDropDownListItemLabel(String value) {
        this.placeOfServiceTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the placeOfServiceTypeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfServiceTypeDropDownListName() {
        return placeOfServiceTypeDropDownListName;
    }

    /**
     * Sets the value of the placeOfServiceTypeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfServiceTypeDropDownListName(String value) {
        this.placeOfServiceTypeDropDownListName = value;
    }

    /**
     * Gets the value of the placeOfServiceTypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfServiceTypeUniversalId() {
        return placeOfServiceTypeUniversalId;
    }

    /**
     * Sets the value of the placeOfServiceTypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfServiceTypeUniversalId(String value) {
        this.placeOfServiceTypeUniversalId = value;
    }

    /**
     * Gets the value of the processAs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProcessAs() {
        return processAs;
    }

    /**
     * Sets the value of the processAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProcessAs(BigInteger value) {
        this.processAs = value;
    }

    /**
     * Gets the value of the processAsDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessAsDropDownListItemLabel() {
        return processAsDropDownListItemLabel;
    }

    /**
     * Sets the value of the processAsDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessAsDropDownListItemLabel(String value) {
        this.processAsDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the processAsDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessAsDropDownListName() {
        return processAsDropDownListName;
    }

    /**
     * Sets the value of the processAsDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessAsDropDownListName(String value) {
        this.processAsDropDownListName = value;
    }

    /**
     * Gets the value of the processAsUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessAsUniversalId() {
        return processAsUniversalId;
    }

    /**
     * Sets the value of the processAsUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessAsUniversalId(String value) {
        this.processAsUniversalId = value;
    }

    /**
     * Gets the value of the providerAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalServiceProviderAssociationType }
     *     
     */
    public MedicalServiceProviderAssociationType getProviderAssociation() {
        return providerAssociation;
    }

    /**
     * Sets the value of the providerAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalServiceProviderAssociationType }
     *     
     */
    public void setProviderAssociation(MedicalServiceProviderAssociationType value) {
        this.providerAssociation = value;
    }

    /**
     * Gets the value of the reimbursementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReimbursementAmount() {
        return reimbursementAmount;
    }

    /**
     * Sets the value of the reimbursementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReimbursementAmount(BigDecimal value) {
        this.reimbursementAmount = value;
    }

    /**
     * Gets the value of the reimbursementMethod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReimbursementMethod() {
        return reimbursementMethod;
    }

    /**
     * Sets the value of the reimbursementMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReimbursementMethod(BigInteger value) {
        this.reimbursementMethod = value;
    }

    /**
     * Gets the value of the reimbursementMethodDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReimbursementMethodDropDownListItemLabel() {
        return reimbursementMethodDropDownListItemLabel;
    }

    /**
     * Sets the value of the reimbursementMethodDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReimbursementMethodDropDownListItemLabel(String value) {
        this.reimbursementMethodDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the reimbursementMethodDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReimbursementMethodDropDownListName() {
        return reimbursementMethodDropDownListName;
    }

    /**
     * Sets the value of the reimbursementMethodDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReimbursementMethodDropDownListName(String value) {
        this.reimbursementMethodDropDownListName = value;
    }

    /**
     * Gets the value of the reimbursementMethodUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReimbursementMethodUniversalId() {
        return reimbursementMethodUniversalId;
    }

    /**
     * Sets the value of the reimbursementMethodUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReimbursementMethodUniversalId(String value) {
        this.reimbursementMethodUniversalId = value;
    }

    /**
     * Gets the value of the serviceAgreement property.
     * 
     */
    public boolean isServiceAgreement() {
        return serviceAgreement;
    }

    /**
     * Sets the value of the serviceAgreement property.
     * 
     */
    public void setServiceAgreement(boolean value) {
        this.serviceAgreement = value;
    }

    /**
     * Gets the value of the serviceCodes property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalServiceType.ServiceCodes }
     *     
     */
    public MedicalServiceType.ServiceCodes getServiceCodes() {
        return serviceCodes;
    }

    /**
     * Sets the value of the serviceCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalServiceType.ServiceCodes }
     *     
     */
    public void setServiceCodes(MedicalServiceType.ServiceCodes value) {
        this.serviceCodes = value;
    }

    /**
     * Gets the value of the serviceLaymansTerms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServiceLaymansTerms() {
        return serviceLaymansTerms;
    }

    /**
     * Sets the value of the serviceLaymansTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServiceLaymansTerms(BigInteger value) {
        this.serviceLaymansTerms = value;
    }

    /**
     * Gets the value of the serviceLaymansTermsDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLaymansTermsDropDownListItemLabel() {
        return serviceLaymansTermsDropDownListItemLabel;
    }

    /**
     * Sets the value of the serviceLaymansTermsDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLaymansTermsDropDownListItemLabel(String value) {
        this.serviceLaymansTermsDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the serviceLaymansTermsDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLaymansTermsDropDownListName() {
        return serviceLaymansTermsDropDownListName;
    }

    /**
     * Sets the value of the serviceLaymansTermsDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLaymansTermsDropDownListName(String value) {
        this.serviceLaymansTermsDropDownListName = value;
    }

    /**
     * Gets the value of the serviceLaymansTermsUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLaymansTermsUniversalId() {
        return serviceLaymansTermsUniversalId;
    }

    /**
     * Sets the value of the serviceLaymansTermsUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLaymansTermsUniversalId(String value) {
        this.serviceLaymansTermsUniversalId = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfMedicalServiceType }
     *     
     */
    public TypeOfMedicalServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfMedicalServiceType }
     *     
     */
    public void setServiceType(TypeOfMedicalServiceType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the typeOfAction property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeOfAction() {
        return typeOfAction;
    }

    /**
     * Sets the value of the typeOfAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeOfAction(BigInteger value) {
        this.typeOfAction = value;
    }

    /**
     * Gets the value of the typeOfActionDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfActionDropDownListItemLabel() {
        return typeOfActionDropDownListItemLabel;
    }

    /**
     * Sets the value of the typeOfActionDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfActionDropDownListItemLabel(String value) {
        this.typeOfActionDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the typeOfActionDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfActionDropDownListName() {
        return typeOfActionDropDownListName;
    }

    /**
     * Sets the value of the typeOfActionDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfActionDropDownListName(String value) {
        this.typeOfActionDropDownListName = value;
    }

    /**
     * Gets the value of the typeOfActionUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfActionUniversalId() {
        return typeOfActionUniversalId;
    }

    /**
     * Sets the value of the typeOfActionUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfActionUniversalId(String value) {
        this.typeOfActionUniversalId = value;
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
     *         &lt;element name="serviceCode" type="{http://www.click4care.com/thinkhealth/6.5/dto}service_code_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "serviceCode"
    })
    public static class ServiceCodes {

        protected List<ServiceCodeType> serviceCode;

        /**
         * Gets the value of the serviceCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceCodeType }
         * 
         * 
         */
        public List<ServiceCodeType> getServiceCode() {
            if (serviceCode == null) {
                serviceCode = new ArrayList<ServiceCodeType>();
            }
            return this.serviceCode;
        }

    }

}
