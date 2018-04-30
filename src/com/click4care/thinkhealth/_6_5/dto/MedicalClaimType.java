
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfMedicalClaim;
import com.click4care.thinkhealth.core.dto.TypeOfSimpleObjectState;


/**
 * <p>Java class for medical_claim_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medical_claim_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amountAllowed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="amountApproved" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="amountCharged" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="amountCopay" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="amountDeductible" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="amountPaid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfMedicalClaim" minOccurs="0"/>
 *         &lt;element name="classtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpt4Code" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="cpt4CodeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="drug" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstDateOfService" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homeGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icdxDiagnosis1" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="icdxDiagnosis1UniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icdxDiagnosis2" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="icdxDiagnosis2UniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icdxDiagnosis3" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="icdxDiagnosis3UniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastDateOfService" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lengthOfStay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="majorDiagnosticCategory" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="majorDiagnosticCategoryUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="memberUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectState" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfSimpleObjectState" minOccurs="0"/>
 *         &lt;element name="placeOfServiceCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="placeOfServiceCodeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryIcdxProcedureCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="primaryIcdxProcedureCodeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referringProvider" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="referringProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revenueCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="revenueCodeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryIcdxProcedureCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="secondaryIcdxProcedureCodeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicingProvider" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="servicingProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "medical_claim_type", propOrder = {
    "amountAllowed",
    "amountApproved",
    "amountCharged",
    "amountCopay",
    "amountDeductible",
    "amountPaid",
    "c4CId",
    "claimId",
    "claimType",
    "classtype",
    "cpt4Code",
    "cpt4CodeUniversalId",
    "createdDate",
    "deletedDate",
    "drug",
    "firstDateOfService",
    "groupId",
    "homeGroupId",
    "icdxDiagnosis1",
    "icdxDiagnosis1UniversalId",
    "icdxDiagnosis2",
    "icdxDiagnosis2UniversalId",
    "icdxDiagnosis3",
    "icdxDiagnosis3UniversalId",
    "id",
    "lastActionDate",
    "lastDateOfService",
    "lengthOfStay",
    "lineOfBusiness",
    "majorDiagnosticCategory",
    "majorDiagnosticCategoryUniversalId",
    "memberId",
    "memberUniversalId",
    "objectState",
    "placeOfServiceCode",
    "placeOfServiceCodeUniversalId",
    "primaryIcdxProcedureCode",
    "primaryIcdxProcedureCodeUniversalId",
    "referringProvider",
    "referringProviderUniversalId",
    "revenueCode",
    "revenueCodeUniversalId",
    "secondaryIcdxProcedureCode",
    "secondaryIcdxProcedureCodeUniversalId",
    "servicingProvider",
    "servicingProviderUniversalId",
    "universalId",
    "version"
})
public class MedicalClaimType {

    protected Double amountAllowed;
    protected Double amountApproved;
    protected Double amountCharged;
    protected Double amountCopay;
    protected Double amountDeductible;
    protected Double amountPaid;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected String claimId;
    @XmlSchemaType(name = "string")
    protected TypeOfMedicalClaim claimType;
    protected String classtype;
    protected BigInteger cpt4Code;
    protected String cpt4CodeUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected String drug;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstDateOfService;
    protected String groupId;
    protected String homeGroupId;
    protected BigInteger icdxDiagnosis1;
    protected String icdxDiagnosis1UniversalId;
    protected BigInteger icdxDiagnosis2;
    protected String icdxDiagnosis2UniversalId;
    protected BigInteger icdxDiagnosis3;
    protected String icdxDiagnosis3UniversalId;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastDateOfService;
    protected BigInteger lengthOfStay;
    protected String lineOfBusiness;
    protected BigInteger majorDiagnosticCategory;
    protected String majorDiagnosticCategoryUniversalId;
    protected BigInteger memberId;
    protected String memberUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfSimpleObjectState objectState;
    protected BigInteger placeOfServiceCode;
    protected String placeOfServiceCodeUniversalId;
    protected BigInteger primaryIcdxProcedureCode;
    protected String primaryIcdxProcedureCodeUniversalId;
    protected BigInteger referringProvider;
    protected String referringProviderUniversalId;
    protected BigInteger revenueCode;
    protected String revenueCodeUniversalId;
    protected BigInteger secondaryIcdxProcedureCode;
    protected String secondaryIcdxProcedureCodeUniversalId;
    protected BigInteger servicingProvider;
    protected String servicingProviderUniversalId;
    protected String universalId;
    protected BigInteger version;

    /**
     * Gets the value of the amountAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountAllowed() {
        return amountAllowed;
    }

    /**
     * Sets the value of the amountAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountAllowed(Double value) {
        this.amountAllowed = value;
    }

    /**
     * Gets the value of the amountApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountApproved() {
        return amountApproved;
    }

    /**
     * Sets the value of the amountApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountApproved(Double value) {
        this.amountApproved = value;
    }

    /**
     * Gets the value of the amountCharged property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountCharged() {
        return amountCharged;
    }

    /**
     * Sets the value of the amountCharged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountCharged(Double value) {
        this.amountCharged = value;
    }

    /**
     * Gets the value of the amountCopay property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountCopay() {
        return amountCopay;
    }

    /**
     * Sets the value of the amountCopay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountCopay(Double value) {
        this.amountCopay = value;
    }

    /**
     * Gets the value of the amountDeductible property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountDeductible() {
        return amountDeductible;
    }

    /**
     * Sets the value of the amountDeductible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountDeductible(Double value) {
        this.amountDeductible = value;
    }

    /**
     * Gets the value of the amountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountPaid() {
        return amountPaid;
    }

    /**
     * Sets the value of the amountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountPaid(Double value) {
        this.amountPaid = value;
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
     * Gets the value of the claimId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimId() {
        return claimId;
    }

    /**
     * Sets the value of the claimId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimId(String value) {
        this.claimId = value;
    }

    /**
     * Gets the value of the claimType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfMedicalClaim }
     *     
     */
    public TypeOfMedicalClaim getClaimType() {
        return claimType;
    }

    /**
     * Sets the value of the claimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfMedicalClaim }
     *     
     */
    public void setClaimType(TypeOfMedicalClaim value) {
        this.claimType = value;
    }

    /**
     * Gets the value of the classtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasstype() {
        return classtype;
    }

    /**
     * Sets the value of the classtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasstype(String value) {
        this.classtype = value;
    }

    /**
     * Gets the value of the cpt4Code property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCpt4Code() {
        return cpt4Code;
    }

    /**
     * Sets the value of the cpt4Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCpt4Code(BigInteger value) {
        this.cpt4Code = value;
    }

    /**
     * Gets the value of the cpt4CodeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpt4CodeUniversalId() {
        return cpt4CodeUniversalId;
    }

    /**
     * Sets the value of the cpt4CodeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpt4CodeUniversalId(String value) {
        this.cpt4CodeUniversalId = value;
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
     * Gets the value of the drug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrug() {
        return drug;
    }

    /**
     * Sets the value of the drug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrug(String value) {
        this.drug = value;
    }

    /**
     * Gets the value of the firstDateOfService property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstDateOfService() {
        return firstDateOfService;
    }

    /**
     * Sets the value of the firstDateOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstDateOfService(XMLGregorianCalendar value) {
        this.firstDateOfService = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the homeGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeGroupId() {
        return homeGroupId;
    }

    /**
     * Sets the value of the homeGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeGroupId(String value) {
        this.homeGroupId = value;
    }

    /**
     * Gets the value of the icdxDiagnosis1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIcdxDiagnosis1() {
        return icdxDiagnosis1;
    }

    /**
     * Sets the value of the icdxDiagnosis1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIcdxDiagnosis1(BigInteger value) {
        this.icdxDiagnosis1 = value;
    }

    /**
     * Gets the value of the icdxDiagnosis1UniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcdxDiagnosis1UniversalId() {
        return icdxDiagnosis1UniversalId;
    }

    /**
     * Sets the value of the icdxDiagnosis1UniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcdxDiagnosis1UniversalId(String value) {
        this.icdxDiagnosis1UniversalId = value;
    }

    /**
     * Gets the value of the icdxDiagnosis2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIcdxDiagnosis2() {
        return icdxDiagnosis2;
    }

    /**
     * Sets the value of the icdxDiagnosis2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIcdxDiagnosis2(BigInteger value) {
        this.icdxDiagnosis2 = value;
    }

    /**
     * Gets the value of the icdxDiagnosis2UniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcdxDiagnosis2UniversalId() {
        return icdxDiagnosis2UniversalId;
    }

    /**
     * Sets the value of the icdxDiagnosis2UniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcdxDiagnosis2UniversalId(String value) {
        this.icdxDiagnosis2UniversalId = value;
    }

    /**
     * Gets the value of the icdxDiagnosis3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIcdxDiagnosis3() {
        return icdxDiagnosis3;
    }

    /**
     * Sets the value of the icdxDiagnosis3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIcdxDiagnosis3(BigInteger value) {
        this.icdxDiagnosis3 = value;
    }

    /**
     * Gets the value of the icdxDiagnosis3UniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcdxDiagnosis3UniversalId() {
        return icdxDiagnosis3UniversalId;
    }

    /**
     * Sets the value of the icdxDiagnosis3UniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcdxDiagnosis3UniversalId(String value) {
        this.icdxDiagnosis3UniversalId = value;
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
     * Gets the value of the lastDateOfService property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDateOfService() {
        return lastDateOfService;
    }

    /**
     * Sets the value of the lastDateOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDateOfService(XMLGregorianCalendar value) {
        this.lastDateOfService = value;
    }

    /**
     * Gets the value of the lengthOfStay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLengthOfStay() {
        return lengthOfStay;
    }

    /**
     * Sets the value of the lengthOfStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLengthOfStay(BigInteger value) {
        this.lengthOfStay = value;
    }

    /**
     * Gets the value of the lineOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    /**
     * Sets the value of the lineOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineOfBusiness(String value) {
        this.lineOfBusiness = value;
    }

    /**
     * Gets the value of the majorDiagnosticCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMajorDiagnosticCategory() {
        return majorDiagnosticCategory;
    }

    /**
     * Sets the value of the majorDiagnosticCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMajorDiagnosticCategory(BigInteger value) {
        this.majorDiagnosticCategory = value;
    }

    /**
     * Gets the value of the majorDiagnosticCategoryUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorDiagnosticCategoryUniversalId() {
        return majorDiagnosticCategoryUniversalId;
    }

    /**
     * Sets the value of the majorDiagnosticCategoryUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorDiagnosticCategoryUniversalId(String value) {
        this.majorDiagnosticCategoryUniversalId = value;
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
     * Gets the value of the objectState property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfSimpleObjectState }
     *     
     */
    public TypeOfSimpleObjectState getObjectState() {
        return objectState;
    }

    /**
     * Sets the value of the objectState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfSimpleObjectState }
     *     
     */
    public void setObjectState(TypeOfSimpleObjectState value) {
        this.objectState = value;
    }

    /**
     * Gets the value of the placeOfServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlaceOfServiceCode() {
        return placeOfServiceCode;
    }

    /**
     * Sets the value of the placeOfServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlaceOfServiceCode(BigInteger value) {
        this.placeOfServiceCode = value;
    }

    /**
     * Gets the value of the placeOfServiceCodeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfServiceCodeUniversalId() {
        return placeOfServiceCodeUniversalId;
    }

    /**
     * Sets the value of the placeOfServiceCodeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfServiceCodeUniversalId(String value) {
        this.placeOfServiceCodeUniversalId = value;
    }

    /**
     * Gets the value of the primaryIcdxProcedureCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrimaryIcdxProcedureCode() {
        return primaryIcdxProcedureCode;
    }

    /**
     * Sets the value of the primaryIcdxProcedureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrimaryIcdxProcedureCode(BigInteger value) {
        this.primaryIcdxProcedureCode = value;
    }

    /**
     * Gets the value of the primaryIcdxProcedureCodeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryIcdxProcedureCodeUniversalId() {
        return primaryIcdxProcedureCodeUniversalId;
    }

    /**
     * Sets the value of the primaryIcdxProcedureCodeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryIcdxProcedureCodeUniversalId(String value) {
        this.primaryIcdxProcedureCodeUniversalId = value;
    }

    /**
     * Gets the value of the referringProvider property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferringProvider() {
        return referringProvider;
    }

    /**
     * Sets the value of the referringProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferringProvider(BigInteger value) {
        this.referringProvider = value;
    }

    /**
     * Gets the value of the referringProviderUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferringProviderUniversalId() {
        return referringProviderUniversalId;
    }

    /**
     * Sets the value of the referringProviderUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferringProviderUniversalId(String value) {
        this.referringProviderUniversalId = value;
    }

    /**
     * Gets the value of the revenueCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRevenueCode() {
        return revenueCode;
    }

    /**
     * Sets the value of the revenueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRevenueCode(BigInteger value) {
        this.revenueCode = value;
    }

    /**
     * Gets the value of the revenueCodeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueCodeUniversalId() {
        return revenueCodeUniversalId;
    }

    /**
     * Sets the value of the revenueCodeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueCodeUniversalId(String value) {
        this.revenueCodeUniversalId = value;
    }

    /**
     * Gets the value of the secondaryIcdxProcedureCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSecondaryIcdxProcedureCode() {
        return secondaryIcdxProcedureCode;
    }

    /**
     * Sets the value of the secondaryIcdxProcedureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSecondaryIcdxProcedureCode(BigInteger value) {
        this.secondaryIcdxProcedureCode = value;
    }

    /**
     * Gets the value of the secondaryIcdxProcedureCodeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryIcdxProcedureCodeUniversalId() {
        return secondaryIcdxProcedureCodeUniversalId;
    }

    /**
     * Sets the value of the secondaryIcdxProcedureCodeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryIcdxProcedureCodeUniversalId(String value) {
        this.secondaryIcdxProcedureCodeUniversalId = value;
    }

    /**
     * Gets the value of the servicingProvider property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServicingProvider() {
        return servicingProvider;
    }

    /**
     * Sets the value of the servicingProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServicingProvider(BigInteger value) {
        this.servicingProvider = value;
    }

    /**
     * Gets the value of the servicingProviderUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicingProviderUniversalId() {
        return servicingProviderUniversalId;
    }

    /**
     * Sets the value of the servicingProviderUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicingProviderUniversalId(String value) {
        this.servicingProviderUniversalId = value;
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
