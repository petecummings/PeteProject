
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for constant_restriction_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="constant_restriction_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}data_access_restriction_type">
 *       &lt;sequence>
 *         &lt;element name="constantLongValue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="constantRestrictionId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constant_restriction_type", propOrder = {
    "constantLongValue",
    "constantRestrictionId"
})
public class ConstantRestrictionType
    extends DataAccessRestrictionType
{

    protected BigInteger constantLongValue;
    protected BigInteger constantRestrictionId;

    /**
     * Gets the value of the constantLongValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConstantLongValue() {
        return constantLongValue;
    }

    /**
     * Sets the value of the constantLongValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConstantLongValue(BigInteger value) {
        this.constantLongValue = value;
    }

    /**
     * Gets the value of the constantRestrictionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConstantRestrictionId() {
        return constantRestrictionId;
    }

    /**
     * Sets the value of the constantRestrictionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConstantRestrictionId(BigInteger value) {
        this.constantRestrictionId = value;
    }

}
