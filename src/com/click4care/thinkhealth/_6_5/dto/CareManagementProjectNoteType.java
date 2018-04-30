
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for care_management_project_note_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="care_management_project_note_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}note_type">
 *       &lt;sequence>
 *         &lt;element name="caseProjectNoteSubtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseProjectNoteSubtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseProjectNoteSubtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseProjectNoteTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseProjectNoteTypeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="caseProjectNoteTypeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cmBase" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
@XmlType(name = "care_management_project_note_type", propOrder = {
    "caseProjectNoteSubtype1DropDownListItemLabel",
    "caseProjectNoteSubtype2DropDownListItemLabel",
    "caseProjectNoteSubtype3DropDownListItemLabel",
    "caseProjectNoteTypeDropDownListItemLabel",
    "caseProjectNoteTypeSubtype",
    "caseProjectNoteTypeSubtypeUniversalId",
    "cmBase",
    "cmBaseUniversalId"
})
public class CareManagementProjectNoteType
    extends NoteType
{

    protected String caseProjectNoteSubtype1DropDownListItemLabel;
    protected String caseProjectNoteSubtype2DropDownListItemLabel;
    protected String caseProjectNoteSubtype3DropDownListItemLabel;
    protected String caseProjectNoteTypeDropDownListItemLabel;
    protected BigInteger caseProjectNoteTypeSubtype;
    protected String caseProjectNoteTypeSubtypeUniversalId;
    @XmlElement(required = true)
    protected BigInteger cmBase;
    protected String cmBaseUniversalId;

    /**
     * Gets the value of the caseProjectNoteSubtype1DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseProjectNoteSubtype1DropDownListItemLabel() {
        return caseProjectNoteSubtype1DropDownListItemLabel;
    }

    /**
     * Sets the value of the caseProjectNoteSubtype1DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseProjectNoteSubtype1DropDownListItemLabel(String value) {
        this.caseProjectNoteSubtype1DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the caseProjectNoteSubtype2DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseProjectNoteSubtype2DropDownListItemLabel() {
        return caseProjectNoteSubtype2DropDownListItemLabel;
    }

    /**
     * Sets the value of the caseProjectNoteSubtype2DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseProjectNoteSubtype2DropDownListItemLabel(String value) {
        this.caseProjectNoteSubtype2DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the caseProjectNoteSubtype3DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseProjectNoteSubtype3DropDownListItemLabel() {
        return caseProjectNoteSubtype3DropDownListItemLabel;
    }

    /**
     * Sets the value of the caseProjectNoteSubtype3DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseProjectNoteSubtype3DropDownListItemLabel(String value) {
        this.caseProjectNoteSubtype3DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the caseProjectNoteTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseProjectNoteTypeDropDownListItemLabel() {
        return caseProjectNoteTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the caseProjectNoteTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseProjectNoteTypeDropDownListItemLabel(String value) {
        this.caseProjectNoteTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the caseProjectNoteTypeSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCaseProjectNoteTypeSubtype() {
        return caseProjectNoteTypeSubtype;
    }

    /**
     * Sets the value of the caseProjectNoteTypeSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCaseProjectNoteTypeSubtype(BigInteger value) {
        this.caseProjectNoteTypeSubtype = value;
    }

    /**
     * Gets the value of the caseProjectNoteTypeSubtypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseProjectNoteTypeSubtypeUniversalId() {
        return caseProjectNoteTypeSubtypeUniversalId;
    }

    /**
     * Sets the value of the caseProjectNoteTypeSubtypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseProjectNoteTypeSubtypeUniversalId(String value) {
        this.caseProjectNoteTypeSubtypeUniversalId = value;
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
