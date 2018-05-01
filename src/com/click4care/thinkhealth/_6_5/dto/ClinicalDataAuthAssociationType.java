
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.click4care.thinkhealth.core.dto.TypeOfAuthComponent;


/**
 * <p>Java class for clinicalDataAuthAssociation_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clinicalDataAuthAssociation_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="accountUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clinicaldatadef" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="clinicaldatadefUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="component" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="componentDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="componentDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="componentUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="form" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfAuthComponent"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lineOfBusinessUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ownerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reasonDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clinicalDataAuthAssociation_type", propOrder = {
    "account",
    "accountUniversalId",
    "clinicaldatadef",
    "clinicaldatadefUniversalId",
    "component",
    "componentDropDownListItemLabel",
    "componentDropDownListName",
    "componentUniversalId",
    "form",
    "id",
    "lineOfBusiness",
    "lineOfBusinessUniversalId",
    "owner",
    "ownerUniversalId",
    "reason",
    "reasonDropDownListItemLabel",
    "reasonDropDownListName",
    "reasonUniversalId",
    "universalId"
})
public class ClinicalDataAuthAssociationType {

    protected BigInteger account;
    protected String accountUniversalId;
    protected BigInteger clinicaldatadef;
    protected String clinicaldatadefUniversalId;
    protected BigInteger component;
    protected String componentDropDownListItemLabel;
    protected String componentDropDownListName;
    protected String componentUniversalId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfAuthComponent form;
    protected BigInteger id;
    protected BigInteger lineOfBusiness;
    protected String lineOfBusinessUniversalId;
    protected BigInteger owner;
    protected String ownerUniversalId;
    protected BigInteger reason;
    protected String reasonDropDownListItemLabel;
    protected String reasonDropDownListName;
    protected String reasonUniversalId;
    protected String universalId;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccount(BigInteger value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountUniversalId() {
        return accountUniversalId;
    }

    /**
     * Sets the value of the accountUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountUniversalId(String value) {
        this.accountUniversalId = value;
    }

    /**
     * Gets the value of the clinicaldatadef property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClinicaldatadef() {
        return clinicaldatadef;
    }

    /**
     * Sets the value of the clinicaldatadef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClinicaldatadef(BigInteger value) {
        this.clinicaldatadef = value;
    }

    /**
     * Gets the value of the clinicaldatadefUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicaldatadefUniversalId() {
        return clinicaldatadefUniversalId;
    }

    /**
     * Sets the value of the clinicaldatadefUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicaldatadefUniversalId(String value) {
        this.clinicaldatadefUniversalId = value;
    }

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComponent(BigInteger value) {
        this.component = value;
    }

    /**
     * Gets the value of the componentDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentDropDownListItemLabel() {
        return componentDropDownListItemLabel;
    }

    /**
     * Sets the value of the componentDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentDropDownListItemLabel(String value) {
        this.componentDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the componentDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentDropDownListName() {
        return componentDropDownListName;
    }

    /**
     * Sets the value of the componentDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentDropDownListName(String value) {
        this.componentDropDownListName = value;
    }

    /**
     * Gets the value of the componentUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentUniversalId() {
        return componentUniversalId;
    }

    /**
     * Sets the value of the componentUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentUniversalId(String value) {
        this.componentUniversalId = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAuthComponent }
     *     
     */
    public TypeOfAuthComponent getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAuthComponent }
     *     
     */
    public void setForm(TypeOfAuthComponent value) {
        this.form = value;
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
     * Gets the value of the lineOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineOfBusiness() {
        return lineOfBusiness;
    }

    /**
     * Sets the value of the lineOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineOfBusiness(BigInteger value) {
        this.lineOfBusiness = value;
    }

    /**
     * Gets the value of the lineOfBusinessUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineOfBusinessUniversalId() {
        return lineOfBusinessUniversalId;
    }

    /**
     * Sets the value of the lineOfBusinessUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineOfBusinessUniversalId(String value) {
        this.lineOfBusinessUniversalId = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOwner(BigInteger value) {
        this.owner = value;
    }

    /**
     * Gets the value of the ownerUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerUniversalId() {
        return ownerUniversalId;
    }

    /**
     * Sets the value of the ownerUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerUniversalId(String value) {
        this.ownerUniversalId = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReason(BigInteger value) {
        this.reason = value;
    }

    /**
     * Gets the value of the reasonDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonDropDownListItemLabel() {
        return reasonDropDownListItemLabel;
    }

    /**
     * Sets the value of the reasonDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonDropDownListItemLabel(String value) {
        this.reasonDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the reasonDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonDropDownListName() {
        return reasonDropDownListName;
    }

    /**
     * Sets the value of the reasonDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonDropDownListName(String value) {
        this.reasonDropDownListName = value;
    }

    /**
     * Gets the value of the reasonUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonUniversalId() {
        return reasonUniversalId;
    }

    /**
     * Sets the value of the reasonUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonUniversalId(String value) {
        this.reasonUniversalId = value;
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

}
