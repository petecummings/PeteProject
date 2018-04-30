
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for umServiceAgreement_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="umServiceAgreement_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}umEvent_type">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="coverThroughDischarge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="extendLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="feeTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inNetwork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="payAtMaximum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="percentageBilled" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reimbursementMethod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reimbursementMethodDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reimbursementMethodDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reimbursementMethodUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceAgreement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "umServiceAgreement_type", propOrder = {
    "amount",
    "coverThroughDischarge",
    "extendLimit",
    "feeType",
    "feeTypeDropDownListItemLabel",
    "feeTypeDropDownListName",
    "feeTypeUniversalId",
    "inNetwork",
    "payAtMaximum",
    "percentageBilled",
    "reimbursementMethod",
    "reimbursementMethodDropDownListItemLabel",
    "reimbursementMethodDropDownListName",
    "reimbursementMethodUniversalId",
    "serviceAgreement"
})
public class UmServiceAgreementType
    extends UmEventType
{

    protected BigDecimal amount;
    protected Boolean coverThroughDischarge;
    protected Boolean extendLimit;
    protected BigInteger feeType;
    protected String feeTypeDropDownListItemLabel;
    protected String feeTypeDropDownListName;
    protected String feeTypeUniversalId;
    protected Boolean inNetwork;
    protected Boolean payAtMaximum;
    protected BigInteger percentageBilled;
    protected BigInteger reimbursementMethod;
    protected String reimbursementMethodDropDownListItemLabel;
    protected String reimbursementMethodDropDownListName;
    protected String reimbursementMethodUniversalId;
    protected Boolean serviceAgreement;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
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
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFeeType(BigInteger value) {
        this.feeType = value;
    }

    /**
     * Gets the value of the feeTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeTypeDropDownListItemLabel() {
        return feeTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the feeTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeTypeDropDownListItemLabel(String value) {
        this.feeTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the feeTypeDropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeTypeDropDownListName() {
        return feeTypeDropDownListName;
    }

    /**
     * Sets the value of the feeTypeDropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeTypeDropDownListName(String value) {
        this.feeTypeDropDownListName = value;
    }

    /**
     * Gets the value of the feeTypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeTypeUniversalId() {
        return feeTypeUniversalId;
    }

    /**
     * Sets the value of the feeTypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeTypeUniversalId(String value) {
        this.feeTypeUniversalId = value;
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPercentageBilled() {
        return percentageBilled;
    }

    /**
     * Sets the value of the percentageBilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPercentageBilled(BigInteger value) {
        this.percentageBilled = value;
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
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceAgreement() {
        return serviceAgreement;
    }

    /**
     * Sets the value of the serviceAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceAgreement(Boolean value) {
        this.serviceAgreement = value;
    }

}
