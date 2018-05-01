
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for um_event_note_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="um_event_note_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}note_type">
 *       &lt;sequence>
 *         &lt;element name="umBase" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="umBaseUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="umNoteSubtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="umNoteSubtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="umNoteSubtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="umNoteTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="umNoteTypeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="umNoteTypeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "um_event_note_type", propOrder = {
    "umBase",
    "umBaseUniversalId",
    "umNoteSubtype1DropDownListItemLabel",
    "umNoteSubtype2DropDownListItemLabel",
    "umNoteSubtype3DropDownListItemLabel",
    "umNoteTypeDropDownListItemLabel",
    "umNoteTypeSubtype",
    "umNoteTypeSubtypeUniversalId"
})
public class UmEventNoteType
    extends NoteType
{

    protected BigInteger umBase;
    protected String umBaseUniversalId;
    protected String umNoteSubtype1DropDownListItemLabel;
    protected String umNoteSubtype2DropDownListItemLabel;
    protected String umNoteSubtype3DropDownListItemLabel;
    protected String umNoteTypeDropDownListItemLabel;
    protected BigInteger umNoteTypeSubtype;
    protected String umNoteTypeSubtypeUniversalId;

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

    /**
     * Gets the value of the umNoteSubtype1DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmNoteSubtype1DropDownListItemLabel() {
        return umNoteSubtype1DropDownListItemLabel;
    }

    /**
     * Sets the value of the umNoteSubtype1DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmNoteSubtype1DropDownListItemLabel(String value) {
        this.umNoteSubtype1DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the umNoteSubtype2DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmNoteSubtype2DropDownListItemLabel() {
        return umNoteSubtype2DropDownListItemLabel;
    }

    /**
     * Sets the value of the umNoteSubtype2DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmNoteSubtype2DropDownListItemLabel(String value) {
        this.umNoteSubtype2DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the umNoteSubtype3DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmNoteSubtype3DropDownListItemLabel() {
        return umNoteSubtype3DropDownListItemLabel;
    }

    /**
     * Sets the value of the umNoteSubtype3DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmNoteSubtype3DropDownListItemLabel(String value) {
        this.umNoteSubtype3DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the umNoteTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmNoteTypeDropDownListItemLabel() {
        return umNoteTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the umNoteTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmNoteTypeDropDownListItemLabel(String value) {
        this.umNoteTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the umNoteTypeSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUmNoteTypeSubtype() {
        return umNoteTypeSubtype;
    }

    /**
     * Sets the value of the umNoteTypeSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmNoteTypeSubtype(BigInteger value) {
        this.umNoteTypeSubtype = value;
    }

    /**
     * Gets the value of the umNoteTypeSubtypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmNoteTypeSubtypeUniversalId() {
        return umNoteTypeSubtypeUniversalId;
    }

    /**
     * Sets the value of the umNoteTypeSubtypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmNoteTypeSubtypeUniversalId(String value) {
        this.umNoteTypeSubtypeUniversalId = value;
    }

}
