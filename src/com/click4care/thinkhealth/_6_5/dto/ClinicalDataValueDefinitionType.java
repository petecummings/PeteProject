
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.click4care.thinkhealth.core.dto.TypeOfClinicalDataValueInputType;


/**
 * <p>Java class for clinicalDataValueDefinition_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clinicalDataValueDefinition_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertMaximum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="alertMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dropDownListId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="dropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formatDropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="formatDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfClinicalDataValueInputType"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="measureDateAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="measureTimeAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mutable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="unitDropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="unitDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validMaximum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="validMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valueId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clinicalDataValueDefinition_type", propOrder = {
    "alertMaximum",
    "alertMinimum",
    "dropDownListId",
    "dropDownListName",
    "formatDropDownListItemId",
    "formatDropDownListItemLabel",
    "inputType",
    "label",
    "mandatory",
    "measureDateAvailable",
    "measureTimeAvailable",
    "mutable",
    "unitDropDownListItemId",
    "unitDropDownListItemLabel",
    "validMaximum",
    "validMinimum",
    "valueId"
})
public class ClinicalDataValueDefinitionType {

    protected BigDecimal alertMaximum;
    protected BigDecimal alertMinimum;
    protected BigInteger dropDownListId;
    protected String dropDownListName;
    protected BigInteger formatDropDownListItemId;
    protected String formatDropDownListItemLabel;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfClinicalDataValueInputType inputType;
    @XmlElement(required = true)
    protected String label;
    protected Boolean mandatory;
    protected Boolean measureDateAvailable;
    protected Boolean measureTimeAvailable;
    protected Boolean mutable;
    protected BigInteger unitDropDownListItemId;
    protected String unitDropDownListItemLabel;
    protected BigDecimal validMaximum;
    protected BigDecimal validMinimum;
    @XmlElement(required = true)
    protected BigInteger valueId;

    /**
     * Gets the value of the alertMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAlertMaximum() {
        return alertMaximum;
    }

    /**
     * Sets the value of the alertMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAlertMaximum(BigDecimal value) {
        this.alertMaximum = value;
    }

    /**
     * Gets the value of the alertMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAlertMinimum() {
        return alertMinimum;
    }

    /**
     * Sets the value of the alertMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAlertMinimum(BigDecimal value) {
        this.alertMinimum = value;
    }

    /**
     * Gets the value of the dropDownListId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDropDownListId() {
        return dropDownListId;
    }

    /**
     * Sets the value of the dropDownListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDropDownListId(BigInteger value) {
        this.dropDownListId = value;
    }

    /**
     * Gets the value of the dropDownListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropDownListName() {
        return dropDownListName;
    }

    /**
     * Sets the value of the dropDownListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropDownListName(String value) {
        this.dropDownListName = value;
    }

    /**
     * Gets the value of the formatDropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFormatDropDownListItemId() {
        return formatDropDownListItemId;
    }

    /**
     * Sets the value of the formatDropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFormatDropDownListItemId(BigInteger value) {
        this.formatDropDownListItemId = value;
    }

    /**
     * Gets the value of the formatDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatDropDownListItemLabel() {
        return formatDropDownListItemLabel;
    }

    /**
     * Sets the value of the formatDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatDropDownListItemLabel(String value) {
        this.formatDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the inputType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfClinicalDataValueInputType }
     *     
     */
    public TypeOfClinicalDataValueInputType getInputType() {
        return inputType;
    }

    /**
     * Sets the value of the inputType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfClinicalDataValueInputType }
     *     
     */
    public void setInputType(TypeOfClinicalDataValueInputType value) {
        this.inputType = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatory(Boolean value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the measureDateAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeasureDateAvailable() {
        return measureDateAvailable;
    }

    /**
     * Sets the value of the measureDateAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeasureDateAvailable(Boolean value) {
        this.measureDateAvailable = value;
    }

    /**
     * Gets the value of the measureTimeAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeasureTimeAvailable() {
        return measureTimeAvailable;
    }

    /**
     * Sets the value of the measureTimeAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeasureTimeAvailable(Boolean value) {
        this.measureTimeAvailable = value;
    }

    /**
     * Gets the value of the mutable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMutable() {
        return mutable;
    }

    /**
     * Sets the value of the mutable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMutable(Boolean value) {
        this.mutable = value;
    }

    /**
     * Gets the value of the unitDropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnitDropDownListItemId() {
        return unitDropDownListItemId;
    }

    /**
     * Sets the value of the unitDropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnitDropDownListItemId(BigInteger value) {
        this.unitDropDownListItemId = value;
    }

    /**
     * Gets the value of the unitDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitDropDownListItemLabel() {
        return unitDropDownListItemLabel;
    }

    /**
     * Sets the value of the unitDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitDropDownListItemLabel(String value) {
        this.unitDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the validMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValidMaximum() {
        return validMaximum;
    }

    /**
     * Sets the value of the validMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValidMaximum(BigDecimal value) {
        this.validMaximum = value;
    }

    /**
     * Gets the value of the validMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValidMinimum() {
        return validMinimum;
    }

    /**
     * Sets the value of the validMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValidMinimum(BigDecimal value) {
        this.validMinimum = value;
    }

    /**
     * Gets the value of the valueId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValueId() {
        return valueId;
    }

    /**
     * Sets the value of the valueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValueId(BigInteger value) {
        this.valueId = value;
    }

}
