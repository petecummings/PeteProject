
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ddl_item_restriction_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ddl_item_restriction_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}data_access_restriction_type">
 *       &lt;sequence>
 *         &lt;element name="dropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="dropDownListItemRestrictionId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="dropDownListItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ddl_item_restriction_type", propOrder = {
    "dropDownListItemId",
    "dropDownListItemRestrictionId",
    "dropDownListItemUniversalId"
})
public class DdlItemRestrictionType
    extends DataAccessRestrictionType
{

    protected BigInteger dropDownListItemId;
    protected BigInteger dropDownListItemRestrictionId;
    protected String dropDownListItemUniversalId;

    /**
     * Gets the value of the dropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDropDownListItemId() {
        return dropDownListItemId;
    }

    /**
     * Sets the value of the dropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDropDownListItemId(BigInteger value) {
        this.dropDownListItemId = value;
    }

    /**
     * Gets the value of the dropDownListItemRestrictionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDropDownListItemRestrictionId() {
        return dropDownListItemRestrictionId;
    }

    /**
     * Sets the value of the dropDownListItemRestrictionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDropDownListItemRestrictionId(BigInteger value) {
        this.dropDownListItemRestrictionId = value;
    }

    /**
     * Gets the value of the dropDownListItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropDownListItemUniversalId() {
        return dropDownListItemUniversalId;
    }

    /**
     * Sets the value of the dropDownListItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropDownListItemUniversalId(String value) {
        this.dropDownListItemUniversalId = value;
    }

}
