
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for careplan_note_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="careplan_note_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}note_type">
 *       &lt;sequence>
 *         &lt;element name="careplanNoteSubtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="careplanNoteSubtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="careplanNoteSubtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="careplanNoteTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="careplanNoteTypeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="careplanNoteTypeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "careplan_note_type", propOrder = {
    "careplanNoteSubtype1DropDownListItemLabel",
    "careplanNoteSubtype2DropDownListItemLabel",
    "careplanNoteSubtype3DropDownListItemLabel",
    "careplanNoteTypeDropDownListItemLabel",
    "careplanNoteTypeSubtype",
    "careplanNoteTypeSubtypeUniversalId"
})
public class CareplanNoteType
    extends NoteType
{

    protected String careplanNoteSubtype1DropDownListItemLabel;
    protected String careplanNoteSubtype2DropDownListItemLabel;
    protected String careplanNoteSubtype3DropDownListItemLabel;
    protected String careplanNoteTypeDropDownListItemLabel;
    protected BigInteger careplanNoteTypeSubtype;
    protected String careplanNoteTypeSubtypeUniversalId;

    /**
     * Gets the value of the careplanNoteSubtype1DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareplanNoteSubtype1DropDownListItemLabel() {
        return careplanNoteSubtype1DropDownListItemLabel;
    }

    /**
     * Sets the value of the careplanNoteSubtype1DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareplanNoteSubtype1DropDownListItemLabel(String value) {
        this.careplanNoteSubtype1DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the careplanNoteSubtype2DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareplanNoteSubtype2DropDownListItemLabel() {
        return careplanNoteSubtype2DropDownListItemLabel;
    }

    /**
     * Sets the value of the careplanNoteSubtype2DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareplanNoteSubtype2DropDownListItemLabel(String value) {
        this.careplanNoteSubtype2DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the careplanNoteSubtype3DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareplanNoteSubtype3DropDownListItemLabel() {
        return careplanNoteSubtype3DropDownListItemLabel;
    }

    /**
     * Sets the value of the careplanNoteSubtype3DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareplanNoteSubtype3DropDownListItemLabel(String value) {
        this.careplanNoteSubtype3DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the careplanNoteTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareplanNoteTypeDropDownListItemLabel() {
        return careplanNoteTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the careplanNoteTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareplanNoteTypeDropDownListItemLabel(String value) {
        this.careplanNoteTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the careplanNoteTypeSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCareplanNoteTypeSubtype() {
        return careplanNoteTypeSubtype;
    }

    /**
     * Sets the value of the careplanNoteTypeSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCareplanNoteTypeSubtype(BigInteger value) {
        this.careplanNoteTypeSubtype = value;
    }

    /**
     * Gets the value of the careplanNoteTypeSubtypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareplanNoteTypeSubtypeUniversalId() {
        return careplanNoteTypeSubtypeUniversalId;
    }

    /**
     * Sets the value of the careplanNoteTypeSubtypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareplanNoteTypeSubtypeUniversalId(String value) {
        this.careplanNoteTypeSubtypeUniversalId = value;
    }

}
