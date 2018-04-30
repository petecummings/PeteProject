
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for letter_typesubtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="letter_typesubtype">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}typesubtype">
 *       &lt;sequence>
 *         &lt;element name="letterTypeMandatoryGatekeeperReview" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "letter_typesubtype", propOrder = {
    "letterTypeMandatoryGatekeeperReview"
})
public class LetterTypesubtype
    extends Typesubtype
{

    protected BigInteger letterTypeMandatoryGatekeeperReview;

    /**
     * Gets the value of the letterTypeMandatoryGatekeeperReview property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLetterTypeMandatoryGatekeeperReview() {
        return letterTypeMandatoryGatekeeperReview;
    }

    /**
     * Sets the value of the letterTypeMandatoryGatekeeperReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLetterTypeMandatoryGatekeeperReview(BigInteger value) {
        this.letterTypeMandatoryGatekeeperReview = value;
    }

}
