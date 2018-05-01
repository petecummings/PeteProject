
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
 * <p>Java class for member_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="member_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}user_type">
 *       &lt;sequence>
 *         &lt;element name="alternateBenefitsHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateInsuranceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confidentialContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="coordinationOfBenefits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="coordinationOfBenefitsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dateOfDeath" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="memberDiagnoses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="memberDiagnosis" type="{http://www.click4care.com/thinkhealth/6.5/dto}member_diagnosis_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dnfCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eligible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="endangeredMember" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HICN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceIdAtOtherInsurer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastReview" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="medicaidID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medicaidRecertificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="memberMBI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryInsurer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recipientTracking" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="restrictedRecipientProgram" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="safeword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriberMemberId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="subscriberMemberUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriberRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="subscriberRelationshipCodeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriberRelationshipCodeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriberRelationshipCodeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "member_type", propOrder = {
    "alternateBenefitsHolderName",
    "alternateInsuranceId",
    "confidentialContact",
    "coordinationOfBenefits",
    "coordinationOfBenefitsName",
    "creditIndicator",
    "dateOfBirth",
    "dateOfDeath",
    "memberDiagnoses",
    "dnfCode",
    "eligible",
    "endangeredMember",
    "hicn",
    "insuranceId",
    "insuranceIdAtOtherInsurer",
    "lastReview",
    "medicaidID",
    "medicaidRecertificationDate",
    "memberMBI",
    "primaryInsurer",
    "recipientTracking",
    "restrictedRecipientProgram",
    "safeword",
    "socialSecurityNumber",
    "subscriberMemberId",
    "subscriberMemberUniversalId",
    "subscriberRelationshipCode",
    "subscriberRelationshipCodeDropDownListItemLabel",
    "subscriberRelationshipCodeDropDownListName",
    "subscriberRelationshipCodeUniversalId"
})
public class MemberType
    extends UserType
{

    protected String alternateBenefitsHolderName;
    protected String alternateInsuranceId;
    protected Boolean confidentialContact;
    protected Boolean coordinationOfBenefits;
    protected String coordinationOfBenefitsName;
    protected Boolean creditIndicator;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfDeath;
    protected MemberType.MemberDiagnoses memberDiagnoses;
    protected String dnfCode;
    protected Boolean eligible;
    protected Boolean endangeredMember;
    @XmlElement(name = "HICN")
    protected String hicn;
    protected String insuranceId;
    protected String insuranceIdAtOtherInsurer;
    protected BigInteger lastReview;
    protected String medicaidID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar medicaidRecertificationDate;
    protected String memberMBI;
    protected Boolean primaryInsurer;
    protected BigInteger recipientTracking;
    protected Boolean restrictedRecipientProgram;
    protected String safeword;
    protected String socialSecurityNumber;
    protected BigInteger subscriberMemberId;
    protected String subscriberMemberUniversalId;
    protected BigInteger subscriberRelationshipCode;
    protected String subscriberRelationshipCodeDropDownListItemLabel;
    protected String subscriberRelationshipCodeDropDownListName;
    protected String subscriberRelationshipCodeUniversalId;

    /**
     * Gets the value of the alternateBenefitsHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateBenefitsHolderName() {
        return alternateBenefitsHolderName;
    }

    /**
     * Sets the value of the alternateBenefitsHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateBenefitsHolderName(String value) {
        this.alternateBenefitsHolderName = value;
    }

    /**
     * Gets the value of the alternateInsuranceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateInsuranceId() {
        return alternateInsuranceId;
    }

    /**
     * Sets the value of the alternateInsuranceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateInsuranceId(String value) {
        this.alternateInsuranceId = value;
    }

    /**
     * Gets the value of the confidentialContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfidentialContact() {
        return confidentialContact;
    }

    /**
     * Sets the value of the confidentialContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfidentialContact(Boolean value) {
        this.confidentialContact = value;
    }

    /**
     * Gets the value of the coordinationOfBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoordinationOfBenefits() {
        return coordinationOfBenefits;
    }

    /**
     * Sets the value of the coordinationOfBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoordinationOfBenefits(Boolean value) {
        this.coordinationOfBenefits = value;
    }

    /**
     * Gets the value of the coordinationOfBenefitsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinationOfBenefitsName() {
        return coordinationOfBenefitsName;
    }

    /**
     * Sets the value of the coordinationOfBenefitsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinationOfBenefitsName(String value) {
        this.coordinationOfBenefitsName = value;
    }

    /**
     * Gets the value of the creditIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreditIndicator() {
        return creditIndicator;
    }

    /**
     * Sets the value of the creditIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreditIndicator(Boolean value) {
        this.creditIndicator = value;
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
     * Gets the value of the dateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDeath(XMLGregorianCalendar value) {
        this.dateOfDeath = value;
    }

    /**
     * Gets the value of the memberDiagnoses property.
     * 
     * @return
     *     possible object is
     *     {@link MemberType.MemberDiagnoses }
     *     
     */
    public MemberType.MemberDiagnoses getMemberDiagnoses() {
        return memberDiagnoses;
    }

    /**
     * Sets the value of the memberDiagnoses property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberType.MemberDiagnoses }
     *     
     */
    public void setMemberDiagnoses(MemberType.MemberDiagnoses value) {
        this.memberDiagnoses = value;
    }

    /**
     * Gets the value of the dnfCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnfCode() {
        return dnfCode;
    }

    /**
     * Sets the value of the dnfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnfCode(String value) {
        this.dnfCode = value;
    }

    /**
     * Gets the value of the eligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligible() {
        return eligible;
    }

    /**
     * Sets the value of the eligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligible(Boolean value) {
        this.eligible = value;
    }

    /**
     * Gets the value of the endangeredMember property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndangeredMember() {
        return endangeredMember;
    }

    /**
     * Sets the value of the endangeredMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndangeredMember(Boolean value) {
        this.endangeredMember = value;
    }

    /**
     * Gets the value of the hicn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHICN() {
        return hicn;
    }

    /**
     * Sets the value of the hicn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHICN(String value) {
        this.hicn = value;
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
     * Gets the value of the insuranceIdAtOtherInsurer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceIdAtOtherInsurer() {
        return insuranceIdAtOtherInsurer;
    }

    /**
     * Sets the value of the insuranceIdAtOtherInsurer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceIdAtOtherInsurer(String value) {
        this.insuranceIdAtOtherInsurer = value;
    }

    /**
     * Gets the value of the lastReview property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastReview() {
        return lastReview;
    }

    /**
     * Sets the value of the lastReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastReview(BigInteger value) {
        this.lastReview = value;
    }

    /**
     * Gets the value of the medicaidID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicaidID() {
        return medicaidID;
    }

    /**
     * Sets the value of the medicaidID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicaidID(String value) {
        this.medicaidID = value;
    }

    /**
     * Gets the value of the medicaidRecertificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMedicaidRecertificationDate() {
        return medicaidRecertificationDate;
    }

    /**
     * Sets the value of the medicaidRecertificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMedicaidRecertificationDate(XMLGregorianCalendar value) {
        this.medicaidRecertificationDate = value;
    }

    /**
     * Gets the value of the memberMBI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberMBI() {
        return memberMBI;
    }

    /**
     * Sets the value of the memberMBI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberMBI(String value) {
        this.memberMBI = value;
    }

    /**
     * Gets the value of the primaryInsurer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryInsurer() {
        return primaryInsurer;
    }

    /**
     * Sets the value of the primaryInsurer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryInsurer(Boolean value) {
        this.primaryInsurer = value;
    }

    /**
     * Gets the value of the recipientTracking property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecipientTracking() {
        return recipientTracking;
    }

    /**
     * Sets the value of the recipientTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecipientTracking(BigInteger value) {
        this.recipientTracking = value;
    }

    /**
     * Gets the value of the restrictedRecipientProgram property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedRecipientProgram() {
        return restrictedRecipientProgram;
    }

    /**
     * Sets the value of the restrictedRecipientProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedRecipientProgram(Boolean value) {
        this.restrictedRecipientProgram = value;
    }

    /**
     * Gets the value of the safeword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafeword() {
        return safeword;
    }

    /**
     * Sets the value of the safeword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafeword(String value) {
        this.safeword = value;
    }

    /**
     * Gets the value of the socialSecurityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the value of the socialSecurityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNumber(String value) {
        this.socialSecurityNumber = value;
    }

    /**
     * Gets the value of the subscriberMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubscriberMemberId() {
        return subscriberMemberId;
    }

    /**
     * Sets the value of the subscriberMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubscriberMemberId(BigInteger value) {
        this.subscriberMemberId = value;
    }

    /**
     * Gets the value of the subscriberMemberUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberMemberUniversalId() {
        return subscriberMemberUniversalId;
    }

    /**
     * Sets the value of the subscriberMemberUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberMemberUniversalId(String value) {
        this.subscriberMemberUniversalId = value;
    }

    /**
     * Gets the value of the subscriberRelationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubscriberRelationshipCode() {
        return subscriberRelationshipCode;
    }

    /**
     * Sets the value of the subscriberRelationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubscriberRelationshipCode(BigInteger value) {
        this.subscriberRelationshipCode = value;
    }

    /**
     * Gets the value of the subscriberRelationshipCodeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberRelationshipCodeDropDownListItemLabel() {
        return subscriberRelationshipCodeDropDownListItemLabel;
    }

    /**
     * Sets the value of the subscriberRelationshipCodeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberRelationshipCodeDropDownListItemLabel(String value) {
        this.subscriberRelationshipCodeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the subscriberRelationshipCodeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberRelationshipCodeDropDownListName() {
        return subscriberRelationshipCodeDropDownListName;
    }

    /**
     * Sets the value of the subscriberRelationshipCodeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberRelationshipCodeDropDownListName(String value) {
        this.subscriberRelationshipCodeDropDownListName = value;
    }

    /**
     * Gets the value of the subscriberRelationshipCodeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberRelationshipCodeUniversalId() {
        return subscriberRelationshipCodeUniversalId;
    }

    /**
     * Sets the value of the subscriberRelationshipCodeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberRelationshipCodeUniversalId(String value) {
        this.subscriberRelationshipCodeUniversalId = value;
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
     *         &lt;element name="memberDiagnosis" type="{http://www.click4care.com/thinkhealth/6.5/dto}member_diagnosis_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "memberDiagnosis"
    })
    public static class MemberDiagnoses {

        protected List<MemberDiagnosisType> memberDiagnosis;

        /**
         * Gets the value of the memberDiagnosis property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memberDiagnosis property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMemberDiagnosis().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MemberDiagnosisType }
         * 
         * 
         */
        public List<MemberDiagnosisType> getMemberDiagnosis() {
            if (memberDiagnosis == null) {
                memberDiagnosis = new ArrayList<MemberDiagnosisType>();
            }
            return this.memberDiagnosis;
        }

    }

}
