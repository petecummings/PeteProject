
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
import com.click4care.thinkhealth.core.dto.TypeOfMedicalClaim;


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
 *           &lt;element name="patientId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="patientUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="referringProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="referringProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="servicingProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="servicingProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="primaryProcedureCodeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="primaryProcedureCodeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="primaryDiagnosisId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="primaryDiagnosisUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="placeOfServiceCodeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="placeOfServiceCodeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="claimType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfMedicalClaim" minOccurs="0"/>
 *           &lt;element name="firstDateOfService" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           &lt;element name="lastDateOfService" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
    "patientId",
    "patientUniversalId",
    "referringProviderId",
    "referringProviderUniversalId",
    "servicingProviderId",
    "servicingProviderUniversalId",
    "primaryProcedureCodeId",
    "primaryProcedureCodeUniversalId",
    "primaryDiagnosisId",
    "primaryDiagnosisUniversalId",
    "placeOfServiceCodeId",
    "placeOfServiceCodeUniversalId",
    "claimType",
    "firstDateOfService",
    "lastDateOfService",
    "createdDate",
    "lastActionDate",
    "queryState"
})
@XmlRootElement(name = "medicalClaimListFilter")
public class MedicalClaimListFilter {

    protected List<String> legacyId;
    protected List<BigInteger> id;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected BigInteger patientId;
    protected String patientUniversalId;
    protected BigInteger referringProviderId;
    protected String referringProviderUniversalId;
    protected BigInteger servicingProviderId;
    protected String servicingProviderUniversalId;
    protected BigInteger primaryProcedureCodeId;
    protected String primaryProcedureCodeUniversalId;
    protected BigInteger primaryDiagnosisId;
    protected String primaryDiagnosisUniversalId;
    protected BigInteger placeOfServiceCodeId;
    protected String placeOfServiceCodeUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfMedicalClaim claimType;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstDateOfService;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDateOfService;
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
     * Gets the value of the patientId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPatientId() {
        return patientId;
    }

    /**
     * Sets the value of the patientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPatientId(BigInteger value) {
        this.patientId = value;
    }

    /**
     * Gets the value of the patientUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientUniversalId() {
        return patientUniversalId;
    }

    /**
     * Sets the value of the patientUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientUniversalId(String value) {
        this.patientUniversalId = value;
    }

    /**
     * Gets the value of the referringProviderId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferringProviderId() {
        return referringProviderId;
    }

    /**
     * Sets the value of the referringProviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferringProviderId(BigInteger value) {
        this.referringProviderId = value;
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
     * Gets the value of the servicingProviderId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServicingProviderId() {
        return servicingProviderId;
    }

    /**
     * Sets the value of the servicingProviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServicingProviderId(BigInteger value) {
        this.servicingProviderId = value;
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
     * Gets the value of the primaryProcedureCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrimaryProcedureCodeId() {
        return primaryProcedureCodeId;
    }

    /**
     * Sets the value of the primaryProcedureCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrimaryProcedureCodeId(BigInteger value) {
        this.primaryProcedureCodeId = value;
    }

    /**
     * Gets the value of the primaryProcedureCodeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryProcedureCodeUniversalId() {
        return primaryProcedureCodeUniversalId;
    }

    /**
     * Sets the value of the primaryProcedureCodeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryProcedureCodeUniversalId(String value) {
        this.primaryProcedureCodeUniversalId = value;
    }

    /**
     * Gets the value of the primaryDiagnosisId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrimaryDiagnosisId() {
        return primaryDiagnosisId;
    }

    /**
     * Sets the value of the primaryDiagnosisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrimaryDiagnosisId(BigInteger value) {
        this.primaryDiagnosisId = value;
    }

    /**
     * Gets the value of the primaryDiagnosisUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryDiagnosisUniversalId() {
        return primaryDiagnosisUniversalId;
    }

    /**
     * Sets the value of the primaryDiagnosisUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryDiagnosisUniversalId(String value) {
        this.primaryDiagnosisUniversalId = value;
    }

    /**
     * Gets the value of the placeOfServiceCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlaceOfServiceCodeId() {
        return placeOfServiceCodeId;
    }

    /**
     * Sets the value of the placeOfServiceCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlaceOfServiceCodeId(BigInteger value) {
        this.placeOfServiceCodeId = value;
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
