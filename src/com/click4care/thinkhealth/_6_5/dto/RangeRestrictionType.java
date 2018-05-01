
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for range_restriction_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="range_restriction_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}data_access_restriction_type">
 *       &lt;sequence>
 *         &lt;element name="rangeFromValue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="rangeRestrictionId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="rangeToValue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "range_restriction_type", propOrder = {
    "rangeFromValue",
    "rangeRestrictionId",
    "rangeToValue"
})
public class RangeRestrictionType
    extends DataAccessRestrictionType
{

    protected BigInteger rangeFromValue;
    protected BigInteger rangeRestrictionId;
    protected BigInteger rangeToValue;

    /**
     * Gets the value of the rangeFromValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRangeFromValue() {
        return rangeFromValue;
    }

    /**
     * Sets the value of the rangeFromValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRangeFromValue(BigInteger value) {
        this.rangeFromValue = value;
    }

    /**
     * Gets the value of the rangeRestrictionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRangeRestrictionId() {
        return rangeRestrictionId;
    }

    /**
     * Sets the value of the rangeRestrictionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRangeRestrictionId(BigInteger value) {
        this.rangeRestrictionId = value;
    }

    /**
     * Gets the value of the rangeToValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRangeToValue() {
        return rangeToValue;
    }

    /**
     * Sets the value of the rangeToValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRangeToValue(BigInteger value) {
        this.rangeToValue = value;
    }

}
