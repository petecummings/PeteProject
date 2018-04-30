
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for umevent_grievance_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="umevent_grievance_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}grievance_type">
 *       &lt;sequence>
 *         &lt;element name="umBase" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="umBaseUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "umevent_grievance_type", propOrder = {
    "umBase",
    "umBaseUniversalId"
})
public class UmeventGrievanceType
    extends GrievanceType
{

    protected BigInteger umBase;
    protected String umBaseUniversalId;

    /**
     * Gets the value of the umBase property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUmBase() {
        return umBase;
    }

    /**
     * Sets the value of the umBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmBase(BigInteger value) {
        this.umBase = value;
    }

    /**
     * Gets the value of the umBaseUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmBaseUniversalId() {
        return umBaseUniversalId;
    }

    /**
     * Sets the value of the umBaseUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmBaseUniversalId(String value) {
        this.umBaseUniversalId = value;
    }

}
