
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfNegative;
import com.click4care.thinkhealth.core.dto.TypeOfRelativeImpressionScrollbar;
import com.click4care.thinkhealth.core.dto.TypeOfRelativeImpressionScrollbarFormat;
import com.click4care.thinkhealth.core.dto.TypeOfSliderAction;
import com.click4care.thinkhealth.core.dto.TypeOfVisibility;


/**
 * <p>Java class for RelativeImpressionScrollbar_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelativeImpressionScrollbar_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoMarks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="format" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfRelativeImpressionScrollbarFormat" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="minimumValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="negativesFormat" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfNegative" minOccurs="0"/>
 *         &lt;element name="numberOfDecimals" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="riscOrigcrtr" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="showThousandsSeparator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sliderAction" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfSliderAction" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfRelativeImpressionScrollbar" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfVisibility" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeImpressionScrollbar_type", propOrder = {
    "autoMarks",
    "c4CId",
    "createdDate",
    "currency",
    "deletedDate",
    "format",
    "id",
    "lastActionDate",
    "maxValue",
    "minimumValue",
    "negativesFormat",
    "numberOfDecimals",
    "riscOrigcrtr",
    "showThousandsSeparator",
    "sliderAction",
    "type",
    "universalId",
    "version",
    "visibility"
})
public class RelativeImpressionScrollbarType {

    protected Boolean autoMarks;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected String currency;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    @XmlSchemaType(name = "string")
    protected TypeOfRelativeImpressionScrollbarFormat format;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected BigDecimal maxValue;
    protected BigDecimal minimumValue;
    @XmlSchemaType(name = "string")
    protected TypeOfNegative negativesFormat;
    protected BigInteger numberOfDecimals;
    protected BigInteger riscOrigcrtr;
    protected Boolean showThousandsSeparator;
    @XmlSchemaType(name = "string")
    protected TypeOfSliderAction sliderAction;
    @XmlSchemaType(name = "string")
    protected TypeOfRelativeImpressionScrollbar type;
    protected String universalId;
    protected BigInteger version;
    @XmlSchemaType(name = "string")
    protected TypeOfVisibility visibility;

    /**
     * Gets the value of the autoMarks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoMarks() {
        return autoMarks;
    }

    /**
     * Sets the value of the autoMarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoMarks(Boolean value) {
        this.autoMarks = value;
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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfRelativeImpressionScrollbarFormat }
     *     
     */
    public TypeOfRelativeImpressionScrollbarFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfRelativeImpressionScrollbarFormat }
     *     
     */
    public void setFormat(TypeOfRelativeImpressionScrollbarFormat value) {
        this.format = value;
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
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxValue(BigDecimal value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the minimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumValue() {
        return minimumValue;
    }

    /**
     * Sets the value of the minimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumValue(BigDecimal value) {
        this.minimumValue = value;
    }

    /**
     * Gets the value of the negativesFormat property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfNegative }
     *     
     */
    public TypeOfNegative getNegativesFormat() {
        return negativesFormat;
    }

    /**
     * Sets the value of the negativesFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfNegative }
     *     
     */
    public void setNegativesFormat(TypeOfNegative value) {
        this.negativesFormat = value;
    }

    /**
     * Gets the value of the numberOfDecimals property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDecimals() {
        return numberOfDecimals;
    }

    /**
     * Sets the value of the numberOfDecimals property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDecimals(BigInteger value) {
        this.numberOfDecimals = value;
    }

    /**
     * Gets the value of the riscOrigcrtr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRiscOrigcrtr() {
        return riscOrigcrtr;
    }

    /**
     * Sets the value of the riscOrigcrtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRiscOrigcrtr(BigInteger value) {
        this.riscOrigcrtr = value;
    }

    /**
     * Gets the value of the showThousandsSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowThousandsSeparator() {
        return showThousandsSeparator;
    }

    /**
     * Sets the value of the showThousandsSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowThousandsSeparator(Boolean value) {
        this.showThousandsSeparator = value;
    }

    /**
     * Gets the value of the sliderAction property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfSliderAction }
     *     
     */
    public TypeOfSliderAction getSliderAction() {
        return sliderAction;
    }

    /**
     * Sets the value of the sliderAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfSliderAction }
     *     
     */
    public void setSliderAction(TypeOfSliderAction value) {
        this.sliderAction = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfRelativeImpressionScrollbar }
     *     
     */
    public TypeOfRelativeImpressionScrollbar getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfRelativeImpressionScrollbar }
     *     
     */
    public void setType(TypeOfRelativeImpressionScrollbar value) {
        this.type = value;
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

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfVisibility }
     *     
     */
    public TypeOfVisibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfVisibility }
     *     
     */
    public void setVisibility(TypeOfVisibility value) {
        this.visibility = value;
    }

}
