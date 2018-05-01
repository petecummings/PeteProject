
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.click4care.thinkhealth.core.dto.TypeOfDeadlineTimeBlockUnit;


/**
 * <p>Java class for configured_carebean_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configured_carebean_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}carebean_type">
 *       &lt;sequence>
 *         &lt;element name="automation" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="automationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="automationUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchAction" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="branchActionUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deadlineBlockAmount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deadlineBlockUnit" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDeadlineTimeBlockUnit" minOccurs="0"/>
 *         &lt;element name="formula" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="formulaUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="original" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="originalUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sentAssessment" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sentAssessmentUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configured_carebean_type", propOrder = {
    "automation",
    "automationType",
    "automationUniversalId",
    "branchAction",
    "branchActionUniversalId",
    "deadlineBlockAmount",
    "deadlineBlockUnit",
    "formula",
    "formulaUniversalId",
    "original",
    "originalUniversalId",
    "sentAssessment",
    "sentAssessmentUniversalId"
})
public class ConfiguredCarebeanType
    extends CarebeanType
{

    protected BigInteger automation;
    protected Boolean automationType;
    protected String automationUniversalId;
    protected BigInteger branchAction;
    protected String branchActionUniversalId;
    protected BigInteger deadlineBlockAmount;
    @XmlSchemaType(name = "string")
    protected TypeOfDeadlineTimeBlockUnit deadlineBlockUnit;
    protected BigInteger formula;
    protected String formulaUniversalId;
    protected BigInteger original;
    protected String originalUniversalId;
    protected BigInteger sentAssessment;
    protected String sentAssessmentUniversalId;

    /**
     * Gets the value of the automation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAutomation() {
        return automation;
    }

    /**
     * Sets the value of the automation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAutomation(BigInteger value) {
        this.automation = value;
    }

    /**
     * Gets the value of the automationType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomationType() {
        return automationType;
    }

    /**
     * Sets the value of the automationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomationType(Boolean value) {
        this.automationType = value;
    }

    /**
     * Gets the value of the automationUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomationUniversalId() {
        return automationUniversalId;
    }

    /**
     * Sets the value of the automationUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomationUniversalId(String value) {
        this.automationUniversalId = value;
    }

    /**
     * Gets the value of the branchAction property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBranchAction() {
        return branchAction;
    }

    /**
     * Sets the value of the branchAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBranchAction(BigInteger value) {
        this.branchAction = value;
    }

    /**
     * Gets the value of the branchActionUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchActionUniversalId() {
        return branchActionUniversalId;
    }

    /**
     * Sets the value of the branchActionUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchActionUniversalId(String value) {
        this.branchActionUniversalId = value;
    }

    /**
     * Gets the value of the deadlineBlockAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeadlineBlockAmount() {
        return deadlineBlockAmount;
    }

    /**
     * Sets the value of the deadlineBlockAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeadlineBlockAmount(BigInteger value) {
        this.deadlineBlockAmount = value;
    }

    /**
     * Gets the value of the deadlineBlockUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDeadlineTimeBlockUnit }
     *     
     */
    public TypeOfDeadlineTimeBlockUnit getDeadlineBlockUnit() {
        return deadlineBlockUnit;
    }

    /**
     * Sets the value of the deadlineBlockUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDeadlineTimeBlockUnit }
     *     
     */
    public void setDeadlineBlockUnit(TypeOfDeadlineTimeBlockUnit value) {
        this.deadlineBlockUnit = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFormula(BigInteger value) {
        this.formula = value;
    }

    /**
     * Gets the value of the formulaUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormulaUniversalId() {
        return formulaUniversalId;
    }

    /**
     * Sets the value of the formulaUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormulaUniversalId(String value) {
        this.formulaUniversalId = value;
    }

    /**
     * Gets the value of the original property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginal() {
        return original;
    }

    /**
     * Sets the value of the original property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginal(BigInteger value) {
        this.original = value;
    }

    /**
     * Gets the value of the originalUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalUniversalId() {
        return originalUniversalId;
    }

    /**
     * Sets the value of the originalUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalUniversalId(String value) {
        this.originalUniversalId = value;
    }

    /**
     * Gets the value of the sentAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSentAssessment() {
        return sentAssessment;
    }

    /**
     * Sets the value of the sentAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSentAssessment(BigInteger value) {
        this.sentAssessment = value;
    }

    /**
     * Gets the value of the sentAssessmentUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentAssessmentUniversalId() {
        return sentAssessmentUniversalId;
    }

    /**
     * Sets the value of the sentAssessmentUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentAssessmentUniversalId(String value) {
        this.sentAssessmentUniversalId = value;
    }

}
