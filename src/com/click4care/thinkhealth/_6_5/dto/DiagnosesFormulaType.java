
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diagnoses_formula_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diagnoses_formula_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}formula_type">
 *       &lt;sequence>
 *         &lt;element name="diagnosesFormulaId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diagnoses_formula_type", propOrder = {
    "diagnosesFormulaId"
})
public class DiagnosesFormulaType
    extends FormulaType
{

    protected BigInteger diagnosesFormulaId;

    /**
     * Gets the value of the diagnosesFormulaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiagnosesFormulaId() {
        return diagnosesFormulaId;
    }

    /**
     * Sets the value of the diagnosesFormulaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiagnosesFormulaId(BigInteger value) {
        this.diagnosesFormulaId = value;
    }

}
