
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carebean_diagnosis_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carebean_diagnosis_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}diagnosis_instance_type">
 *       &lt;sequence>
 *         &lt;element name="carebeanDiagnosisId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carebean_diagnosis_type", propOrder = {
    "carebeanDiagnosisId"
})
public class CarebeanDiagnosisType
    extends DiagnosisInstanceType
{

    protected BigInteger carebeanDiagnosisId;

    /**
     * Gets the value of the carebeanDiagnosisId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCarebeanDiagnosisId() {
        return carebeanDiagnosisId;
    }

    /**
     * Sets the value of the carebeanDiagnosisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCarebeanDiagnosisId(BigInteger value) {
        this.carebeanDiagnosisId = value;
    }

}
