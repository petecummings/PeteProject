
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
import com.click4care.thinkhealth.core.dto.TypeOfMedicationSourceType;
import com.click4care.thinkhealth.core.dto.TypeOfMedicationState;


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
 *           &lt;element name="typeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="state" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfMedicationState" minOccurs="0"/>
 *           &lt;element name="sourceType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfMedicationSourceType" minOccurs="0"/>
 *           &lt;element name="medicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="memberId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="memberUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="prescriptedById" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="prescriptedByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="filledById" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="filledByUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="ndcCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="ndcCodeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="drugClaimId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="drugClaimUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="affiliatedRecordCareManagementId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="affiliatedRecordCareManagementUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="affiliatedRecordMemberId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="affiliatedRecordMemberUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="affiliatedRecordProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="affiliatedRecordProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="affiliatedRecordUmEventId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="affiliatedRecordUmEventUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="affiliatedRecordUmEventRequestId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="affiliatedRecordUmEventRequestUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "typeSubtype",
    "state",
    "sourceType",
    "medicationName",
    "memberId",
    "memberUniversalId",
    "prescriptedById",
    "prescriptedByUniversalId",
    "filledById",
    "filledByUniversalId",
    "ndcCode",
    "ndcCodeUniversalId",
    "drugClaimId",
    "drugClaimUniversalId",
    "affiliatedRecordCareManagementId",
    "affiliatedRecordCareManagementUniversalId",
    "affiliatedRecordMemberId",
    "affiliatedRecordMemberUniversalId",
    "affiliatedRecordProviderId",
    "affiliatedRecordProviderUniversalId",
    "affiliatedRecordUmEventId",
    "affiliatedRecordUmEventUniversalId",
    "affiliatedRecordUmEventRequestId",
    "affiliatedRecordUmEventRequestUniversalId",
    "createdDate",
    "lastActionDate",
    "queryState"
})
@XmlRootElement(name = "medicationListFilter")
public class MedicationListFilter {

    protected List<String> legacyId;
    protected List<BigInteger> id;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected BigInteger typeSubtype;
    @XmlSchemaType(name = "string")
    protected TypeOfMedicationState state;
    @XmlSchemaType(name = "string")
    protected TypeOfMedicationSourceType sourceType;
    protected String medicationName;
    protected BigInteger memberId;
    protected String memberUniversalId;
    protected BigInteger prescriptedById;
    protected String prescriptedByUniversalId;
    protected BigInteger filledById;
    protected String filledByUniversalId;
    protected BigInteger ndcCode;
    protected String ndcCodeUniversalId;
    protected BigInteger drugClaimId;
    protected String drugClaimUniversalId;
    protected BigInteger affiliatedRecordCareManagementId;
    protected String affiliatedRecordCareManagementUniversalId;
    protected BigInteger affiliatedRecordMemberId;
    protected String affiliatedRecordMemberUniversalId;
    protected BigInteger affiliatedRecordProviderId;
    protected String affiliatedRecordProviderUniversalId;
    protected BigInteger affiliatedRecordUmEventId;
    protected String affiliatedRecordUmEventUniversalId;
    protected BigInteger affiliatedRecordUmEventRequestId;
    protected String affiliatedRecordUmEventRequestUniversalId;
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
     * Gets the value of the typeSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeSubtype() {
        return typeSubtype;
    }

    /**
     * Sets the value of the typeSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeSubtype(BigInteger value) {
        this.typeSubtype = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfMedicationState }
     *     
     */
    public TypeOfMedicationState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfMedicationState }
     *     
     */
    public void setState(TypeOfMedicationState value) {
        this.state = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfMedicationSourceType }
     *     
     */
    public TypeOfMedicationSourceType getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfMedicationSourceType }
     *     
     */
    public void setSourceType(TypeOfMedicationSourceType value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the medicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicationName() {
        return medicationName;
    }

    /**
     * Sets the value of the medicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicationName(String value) {
        this.medicationName = value;
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
     * Gets the value of the prescriptedById property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrescriptedById() {
        return prescriptedById;
    }

    /**
     * Sets the value of the prescriptedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrescriptedById(BigInteger value) {
        this.prescriptedById = value;
    }

    /**
     * Gets the value of the prescriptedByUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptedByUniversalId() {
        return prescriptedByUniversalId;
    }

    /**
     * Sets the value of the prescriptedByUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptedByUniversalId(String value) {
        this.prescriptedByUniversalId = value;
    }

    /**
     * Gets the value of the filledById property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFilledById() {
        return filledById;
    }

    /**
     * Sets the value of the filledById property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFilledById(BigInteger value) {
        this.filledById = value;
    }

    /**
     * Gets the value of the filledByUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilledByUniversalId() {
        return filledByUniversalId;
    }

    /**
     * Sets the value of the filledByUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilledByUniversalId(String value) {
        this.filledByUniversalId = value;
    }

    /**
     * Gets the value of the ndcCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNdcCode() {
        return ndcCode;
    }

    /**
     * Sets the value of the ndcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNdcCode(BigInteger value) {
        this.ndcCode = value;
    }

    /**
     * Gets the value of the ndcCodeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdcCodeUniversalId() {
        return ndcCodeUniversalId;
    }

    /**
     * Sets the value of the ndcCodeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdcCodeUniversalId(String value) {
        this.ndcCodeUniversalId = value;
    }

    /**
     * Gets the value of the drugClaimId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDrugClaimId() {
        return drugClaimId;
    }

    /**
     * Sets the value of the drugClaimId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDrugClaimId(BigInteger value) {
        this.drugClaimId = value;
    }

    /**
     * Gets the value of the drugClaimUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugClaimUniversalId() {
        return drugClaimUniversalId;
    }

    /**
     * Sets the value of the drugClaimUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugClaimUniversalId(String value) {
        this.drugClaimUniversalId = value;
    }

    /**
     * Gets the value of the affiliatedRecordCareManagementId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliatedRecordCareManagementId() {
        return affiliatedRecordCareManagementId;
    }

    /**
     * Sets the value of the affiliatedRecordCareManagementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliatedRecordCareManagementId(BigInteger value) {
        this.affiliatedRecordCareManagementId = value;
    }

    /**
     * Gets the value of the affiliatedRecordCareManagementUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliatedRecordCareManagementUniversalId() {
        return affiliatedRecordCareManagementUniversalId;
    }

    /**
     * Sets the value of the affiliatedRecordCareManagementUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliatedRecordCareManagementUniversalId(String value) {
        this.affiliatedRecordCareManagementUniversalId = value;
    }

    /**
     * Gets the value of the affiliatedRecordMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliatedRecordMemberId() {
        return affiliatedRecordMemberId;
    }

    /**
     * Sets the value of the affiliatedRecordMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliatedRecordMemberId(BigInteger value) {
        this.affiliatedRecordMemberId = value;
    }

    /**
     * Gets the value of the affiliatedRecordMemberUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliatedRecordMemberUniversalId() {
        return affiliatedRecordMemberUniversalId;
    }

    /**
     * Sets the value of the affiliatedRecordMemberUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliatedRecordMemberUniversalId(String value) {
        this.affiliatedRecordMemberUniversalId = value;
    }

    /**
     * Gets the value of the affiliatedRecordProviderId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliatedRecordProviderId() {
        return affiliatedRecordProviderId;
    }

    /**
     * Sets the value of the affiliatedRecordProviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliatedRecordProviderId(BigInteger value) {
        this.affiliatedRecordProviderId = value;
    }

    /**
     * Gets the value of the affiliatedRecordProviderUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliatedRecordProviderUniversalId() {
        return affiliatedRecordProviderUniversalId;
    }

    /**
     * Sets the value of the affiliatedRecordProviderUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliatedRecordProviderUniversalId(String value) {
        this.affiliatedRecordProviderUniversalId = value;
    }

    /**
     * Gets the value of the affiliatedRecordUmEventId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliatedRecordUmEventId() {
        return affiliatedRecordUmEventId;
    }

    /**
     * Sets the value of the affiliatedRecordUmEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliatedRecordUmEventId(BigInteger value) {
        this.affiliatedRecordUmEventId = value;
    }

    /**
     * Gets the value of the affiliatedRecordUmEventUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliatedRecordUmEventUniversalId() {
        return affiliatedRecordUmEventUniversalId;
    }

    /**
     * Sets the value of the affiliatedRecordUmEventUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliatedRecordUmEventUniversalId(String value) {
        this.affiliatedRecordUmEventUniversalId = value;
    }

    /**
     * Gets the value of the affiliatedRecordUmEventRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliatedRecordUmEventRequestId() {
        return affiliatedRecordUmEventRequestId;
    }

    /**
     * Sets the value of the affiliatedRecordUmEventRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliatedRecordUmEventRequestId(BigInteger value) {
        this.affiliatedRecordUmEventRequestId = value;
    }

    /**
     * Gets the value of the affiliatedRecordUmEventRequestUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliatedRecordUmEventRequestUniversalId() {
        return affiliatedRecordUmEventRequestUniversalId;
    }

    /**
     * Sets the value of the affiliatedRecordUmEventRequestUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliatedRecordUmEventRequestUniversalId(String value) {
        this.affiliatedRecordUmEventRequestUniversalId = value;
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
