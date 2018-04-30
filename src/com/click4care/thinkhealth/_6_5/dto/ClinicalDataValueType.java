
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clinicalDataValue_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clinicalDataValue_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="measureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="dateValue" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *           &lt;element name="dateRangeValue" type="{http://www.click4care.com/thinkhealth/6.5/dto}clinicalDataValue_daterange_type"/>
 *           &lt;element name="timeInDayValue" type="{http://www.click4care.com/thinkhealth/6.5/dto}clinicalDataValue_time_type"/>
 *           &lt;element name="textValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="ddlItemIdValue" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *           &lt;element name="numberValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;/choice>
 *         &lt;element name="valueDefinitionLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueIndex" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clinicalDataValue_type", propOrder = {
    "lastModifiedDate",
    "measureDate",
    "dateValue",
    "dateRangeValue",
    "timeInDayValue",
    "textValue",
    "ddlItemIdValue",
    "numberValue",
    "valueDefinitionLabel",
    "valueIndex"
})
public class ClinicalDataValueType {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measureDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateValue;
    protected ClinicalDataValueDaterangeType dateRangeValue;
    protected ClinicalDataValueTimeType timeInDayValue;
    protected String textValue;
    protected BigInteger ddlItemIdValue;
    protected BigDecimal numberValue;
    protected String valueDefinitionLabel;
    @XmlElement(required = true)
    protected BigInteger valueIndex;

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the measureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasureDate() {
        return measureDate;
    }

    /**
     * Sets the value of the measureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasureDate(XMLGregorianCalendar value) {
        this.measureDate = value;
    }

    /**
     * Gets the value of the dateValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValue() {
        return dateValue;
    }

    /**
     * Sets the value of the dateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateValue(XMLGregorianCalendar value) {
        this.dateValue = value;
    }

    /**
     * Gets the value of the dateRangeValue property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalDataValueDaterangeType }
     *     
     */
    public ClinicalDataValueDaterangeType getDateRangeValue() {
        return dateRangeValue;
    }

    /**
     * Sets the value of the dateRangeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalDataValueDaterangeType }
     *     
     */
    public void setDateRangeValue(ClinicalDataValueDaterangeType value) {
        this.dateRangeValue = value;
    }

    /**
     * Gets the value of the timeInDayValue property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalDataValueTimeType }
     *     
     */
    public ClinicalDataValueTimeType getTimeInDayValue() {
        return timeInDayValue;
    }

    /**
     * Sets the value of the timeInDayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalDataValueTimeType }
     *     
     */
    public void setTimeInDayValue(ClinicalDataValueTimeType value) {
        this.timeInDayValue = value;
    }

    /**
     * Gets the value of the textValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextValue() {
        return textValue;
    }

    /**
     * Sets the value of the textValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextValue(String value) {
        this.textValue = value;
    }

    /**
     * Gets the value of the ddlItemIdValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDdlItemIdValue() {
        return ddlItemIdValue;
    }

    /**
     * Sets the value of the ddlItemIdValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDdlItemIdValue(BigInteger value) {
        this.ddlItemIdValue = value;
    }

    /**
     * Gets the value of the numberValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberValue() {
        return numberValue;
    }

    /**
     * Sets the value of the numberValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberValue(BigDecimal value) {
        this.numberValue = value;
    }

    /**
     * Gets the value of the valueDefinitionLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueDefinitionLabel() {
        return valueDefinitionLabel;
    }

    /**
     * Sets the value of the valueDefinitionLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueDefinitionLabel(String value) {
        this.valueDefinitionLabel = value;
    }

    /**
     * Gets the value of the valueIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValueIndex() {
        return valueIndex;
    }

    /**
     * Sets the value of the valueIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValueIndex(BigInteger value) {
        this.valueIndex = value;
    }

}
