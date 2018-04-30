
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for care_calculator_typesubtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="care_calculator_typesubtype">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}typesubtype">
 *       &lt;sequence>
 *         &lt;element name="careCalculatorTypeDefaultLeadingMessage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "care_calculator_typesubtype", propOrder = {
    "careCalculatorTypeDefaultLeadingMessage"
})
public class CareCalculatorTypesubtype
    extends Typesubtype
{

    protected BigInteger careCalculatorTypeDefaultLeadingMessage;

    /**
     * Gets the value of the careCalculatorTypeDefaultLeadingMessage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCareCalculatorTypeDefaultLeadingMessage() {
        return careCalculatorTypeDefaultLeadingMessage;
    }

    /**
     * Sets the value of the careCalculatorTypeDefaultLeadingMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCareCalculatorTypeDefaultLeadingMessage(BigInteger value) {
        this.careCalculatorTypeDefaultLeadingMessage = value;
    }

}
