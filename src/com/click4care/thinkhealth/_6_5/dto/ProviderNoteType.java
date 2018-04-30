
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for provider_note_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provider_note_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}note_type">
 *       &lt;sequence>
 *         &lt;element name="provider" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="providerNoteSubtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerNoteSubtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerNoteSubtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerNoteTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerNoteTypeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="providerNoteTypeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provider_note_type", propOrder = {
    "provider",
    "providerNoteSubtype1DropDownListItemLabel",
    "providerNoteSubtype2DropDownListItemLabel",
    "providerNoteSubtype3DropDownListItemLabel",
    "providerNoteTypeDropDownListItemLabel",
    "providerNoteTypeSubtype",
    "providerNoteTypeSubtypeUniversalId",
    "providerUniversalId"
})
public class ProviderNoteType
    extends NoteType
{

    protected BigInteger provider;
    protected String providerNoteSubtype1DropDownListItemLabel;
    protected String providerNoteSubtype2DropDownListItemLabel;
    protected String providerNoteSubtype3DropDownListItemLabel;
    protected String providerNoteTypeDropDownListItemLabel;
    protected BigInteger providerNoteTypeSubtype;
    protected String providerNoteTypeSubtypeUniversalId;
    protected String providerUniversalId;

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProvider(BigInteger value) {
        this.provider = value;
    }

    /**
     * Gets the value of the providerNoteSubtype1DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderNoteSubtype1DropDownListItemLabel() {
        return providerNoteSubtype1DropDownListItemLabel;
    }

    /**
     * Sets the value of the providerNoteSubtype1DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderNoteSubtype1DropDownListItemLabel(String value) {
        this.providerNoteSubtype1DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the providerNoteSubtype2DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderNoteSubtype2DropDownListItemLabel() {
        return providerNoteSubtype2DropDownListItemLabel;
    }

    /**
     * Sets the value of the providerNoteSubtype2DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderNoteSubtype2DropDownListItemLabel(String value) {
        this.providerNoteSubtype2DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the providerNoteSubtype3DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderNoteSubtype3DropDownListItemLabel() {
        return providerNoteSubtype3DropDownListItemLabel;
    }

    /**
     * Sets the value of the providerNoteSubtype3DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderNoteSubtype3DropDownListItemLabel(String value) {
        this.providerNoteSubtype3DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the providerNoteTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderNoteTypeDropDownListItemLabel() {
        return providerNoteTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the providerNoteTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderNoteTypeDropDownListItemLabel(String value) {
        this.providerNoteTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the providerNoteTypeSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProviderNoteTypeSubtype() {
        return providerNoteTypeSubtype;
    }

    /**
     * Sets the value of the providerNoteTypeSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProviderNoteTypeSubtype(BigInteger value) {
        this.providerNoteTypeSubtype = value;
    }

    /**
     * Gets the value of the providerNoteTypeSubtypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderNoteTypeSubtypeUniversalId() {
        return providerNoteTypeSubtypeUniversalId;
    }

    /**
     * Sets the value of the providerNoteTypeSubtypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderNoteTypeSubtypeUniversalId(String value) {
        this.providerNoteTypeSubtypeUniversalId = value;
    }

    /**
     * Gets the value of the providerUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderUniversalId() {
        return providerUniversalId;
    }

    /**
     * Sets the value of the providerUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderUniversalId(String value) {
        this.providerUniversalId = value;
    }

}
