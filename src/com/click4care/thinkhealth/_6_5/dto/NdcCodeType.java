
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.click4care.thinkhealth.core.dto.TypeOfRxOtc;


/**
 * <p>Java class for ndc_code_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ndc_code_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}service_type">
 *       &lt;sequence>
 *         &lt;element name="dosageForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genericName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gpiCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="gpiCodeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iceMedFlag" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="labelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxOtc" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfRxOtc" minOccurs="0"/>
 *         &lt;element name="strength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ndc_code_type", propOrder = {
    "dosageForm",
    "genericName",
    "gpiCode",
    "gpiCodeUniversalId",
    "iceMedFlag",
    "labelCode",
    "packageCode",
    "packageSize",
    "packageType",
    "productCode",
    "rxOtc",
    "strength",
    "tradeName",
    "unit"
})
public class NdcCodeType
    extends ServiceType
{

    protected String dosageForm;
    protected String genericName;
    protected BigInteger gpiCode;
    protected String gpiCodeUniversalId;
    protected BigInteger iceMedFlag;
    protected String labelCode;
    protected String packageCode;
    protected String packageSize;
    protected String packageType;
    protected String productCode;
    @XmlSchemaType(name = "string")
    protected TypeOfRxOtc rxOtc;
    protected String strength;
    protected String tradeName;
    protected String unit;

    /**
     * Gets the value of the dosageForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosageForm() {
        return dosageForm;
    }

    /**
     * Sets the value of the dosageForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosageForm(String value) {
        this.dosageForm = value;
    }

    /**
     * Gets the value of the genericName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericName() {
        return genericName;
    }

    /**
     * Sets the value of the genericName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericName(String value) {
        this.genericName = value;
    }

    /**
     * Gets the value of the gpiCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGpiCode() {
        return gpiCode;
    }

    /**
     * Sets the value of the gpiCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGpiCode(BigInteger value) {
        this.gpiCode = value;
    }

    /**
     * Gets the value of the gpiCodeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpiCodeUniversalId() {
        return gpiCodeUniversalId;
    }

    /**
     * Sets the value of the gpiCodeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpiCodeUniversalId(String value) {
        this.gpiCodeUniversalId = value;
    }

    /**
     * Gets the value of the iceMedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIceMedFlag() {
        return iceMedFlag;
    }

    /**
     * Sets the value of the iceMedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIceMedFlag(BigInteger value) {
        this.iceMedFlag = value;
    }

    /**
     * Gets the value of the labelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelCode() {
        return labelCode;
    }

    /**
     * Sets the value of the labelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelCode(String value) {
        this.labelCode = value;
    }

    /**
     * Gets the value of the packageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageCode() {
        return packageCode;
    }

    /**
     * Sets the value of the packageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageCode(String value) {
        this.packageCode = value;
    }

    /**
     * Gets the value of the packageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageSize() {
        return packageSize;
    }

    /**
     * Sets the value of the packageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageSize(String value) {
        this.packageSize = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageType(String value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the rxOtc property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfRxOtc }
     *     
     */
    public TypeOfRxOtc getRxOtc() {
        return rxOtc;
    }

    /**
     * Sets the value of the rxOtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfRxOtc }
     *     
     */
    public void setRxOtc(TypeOfRxOtc value) {
        this.rxOtc = value;
    }

    /**
     * Gets the value of the strength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrength() {
        return strength;
    }

    /**
     * Sets the value of the strength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrength(String value) {
        this.strength = value;
    }

    /**
     * Gets the value of the tradeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeName() {
        return tradeName;
    }

    /**
     * Sets the value of the tradeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeName(String value) {
        this.tradeName = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
