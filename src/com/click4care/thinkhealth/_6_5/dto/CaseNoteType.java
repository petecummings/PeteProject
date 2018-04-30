
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for case_note_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="case_note_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}note_type">
 *       &lt;sequence>
 *         &lt;element name="caseNoteSubtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseNoteSubtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseNoteSubtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseNoteTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseNoteTypeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="caseNoteTypeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cmBase" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="cmBaseUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "case_note_type", propOrder = {
    "caseNoteSubtype1DropDownListItemLabel",
    "caseNoteSubtype2DropDownListItemLabel",
    "caseNoteSubtype3DropDownListItemLabel",
    "caseNoteTypeDropDownListItemLabel",
    "caseNoteTypeSubtype",
    "caseNoteTypeSubtypeUniversalId",
    "cmBase",
    "cmBaseUniversalId"
})
public class CaseNoteType
    extends NoteType
{

    protected String caseNoteSubtype1DropDownListItemLabel;
    protected String caseNoteSubtype2DropDownListItemLabel;
    protected String caseNoteSubtype3DropDownListItemLabel;
    protected String caseNoteTypeDropDownListItemLabel;
    protected BigInteger caseNoteTypeSubtype;
    protected String caseNoteTypeSubtypeUniversalId;
    protected BigInteger cmBase;
    protected String cmBaseUniversalId;

    /**
     * Gets the value of the caseNoteSubtype1DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNoteSubtype1DropDownListItemLabel() {
        return caseNoteSubtype1DropDownListItemLabel;
    }

    /**
     * Sets the value of the caseNoteSubtype1DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNoteSubtype1DropDownListItemLabel(String value) {
        this.caseNoteSubtype1DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the caseNoteSubtype2DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNoteSubtype2DropDownListItemLabel() {
        return caseNoteSubtype2DropDownListItemLabel;
    }

    /**
     * Sets the value of the caseNoteSubtype2DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNoteSubtype2DropDownListItemLabel(String value) {
        this.caseNoteSubtype2DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the caseNoteSubtype3DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNoteSubtype3DropDownListItemLabel() {
        return caseNoteSubtype3DropDownListItemLabel;
    }

    /**
     * Sets the value of the caseNoteSubtype3DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNoteSubtype3DropDownListItemLabel(String value) {
        this.caseNoteSubtype3DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the caseNoteTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNoteTypeDropDownListItemLabel() {
        return caseNoteTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the caseNoteTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNoteTypeDropDownListItemLabel(String value) {
        this.caseNoteTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the caseNoteTypeSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCaseNoteTypeSubtype() {
        return caseNoteTypeSubtype;
    }

    /**
     * Sets the value of the caseNoteTypeSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCaseNoteTypeSubtype(BigInteger value) {
        this.caseNoteTypeSubtype = value;
    }

    /**
     * Gets the value of the caseNoteTypeSubtypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNoteTypeSubtypeUniversalId() {
        return caseNoteTypeSubtypeUniversalId;
    }

    /**
     * Sets the value of the caseNoteTypeSubtypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNoteTypeSubtypeUniversalId(String value) {
        this.caseNoteTypeSubtypeUniversalId = value;
    }

    /**
     * Gets the value of the cmBase property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCmBase() {
        return cmBase;
    }

    /**
     * Sets the value of the cmBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCmBase(BigInteger value) {
        this.cmBase = value;
    }

    /**
     * Gets the value of the cmBaseUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmBaseUniversalId() {
        return cmBaseUniversalId;
    }

    /**
     * Sets the value of the cmBaseUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmBaseUniversalId(String value) {
        this.cmBaseUniversalId = value;
    }

}
