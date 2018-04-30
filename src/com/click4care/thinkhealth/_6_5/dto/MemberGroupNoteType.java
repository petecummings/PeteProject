
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for member_group_note_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="member_group_note_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}note_type">
 *       &lt;sequence>
 *         &lt;element name="memberGroupId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="memberGroupUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberNoteSubtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberNoteSubtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberNoteSubtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberNoteTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberNoteTypeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="memberNoteTypeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "member_group_note_type", propOrder = {
    "memberGroupId",
    "memberGroupUniversalId",
    "memberNoteSubtype1DropDownListItemLabel",
    "memberNoteSubtype2DropDownListItemLabel",
    "memberNoteSubtype3DropDownListItemLabel",
    "memberNoteTypeDropDownListItemLabel",
    "memberNoteTypeSubtype",
    "memberNoteTypeSubtypeUniversalId"
})
public class MemberGroupNoteType
    extends NoteType
{

    protected BigInteger memberGroupId;
    protected String memberGroupUniversalId;
    protected String memberNoteSubtype1DropDownListItemLabel;
    protected String memberNoteSubtype2DropDownListItemLabel;
    protected String memberNoteSubtype3DropDownListItemLabel;
    protected String memberNoteTypeDropDownListItemLabel;
    protected BigInteger memberNoteTypeSubtype;
    protected String memberNoteTypeSubtypeUniversalId;

    /**
     * Gets the value of the memberGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMemberGroupId() {
        return memberGroupId;
    }

    /**
     * Sets the value of the memberGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMemberGroupId(BigInteger value) {
        this.memberGroupId = value;
    }

    /**
     * Gets the value of the memberGroupUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberGroupUniversalId() {
        return memberGroupUniversalId;
    }

    /**
     * Sets the value of the memberGroupUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberGroupUniversalId(String value) {
        this.memberGroupUniversalId = value;
    }

    /**
     * Gets the value of the memberNoteSubtype1DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberNoteSubtype1DropDownListItemLabel() {
        return memberNoteSubtype1DropDownListItemLabel;
    }

    /**
     * Sets the value of the memberNoteSubtype1DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberNoteSubtype1DropDownListItemLabel(String value) {
        this.memberNoteSubtype1DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the memberNoteSubtype2DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberNoteSubtype2DropDownListItemLabel() {
        return memberNoteSubtype2DropDownListItemLabel;
    }

    /**
     * Sets the value of the memberNoteSubtype2DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberNoteSubtype2DropDownListItemLabel(String value) {
        this.memberNoteSubtype2DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the memberNoteSubtype3DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberNoteSubtype3DropDownListItemLabel() {
        return memberNoteSubtype3DropDownListItemLabel;
    }

    /**
     * Sets the value of the memberNoteSubtype3DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberNoteSubtype3DropDownListItemLabel(String value) {
        this.memberNoteSubtype3DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the memberNoteTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberNoteTypeDropDownListItemLabel() {
        return memberNoteTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the memberNoteTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberNoteTypeDropDownListItemLabel(String value) {
        this.memberNoteTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the memberNoteTypeSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMemberNoteTypeSubtype() {
        return memberNoteTypeSubtype;
    }

    /**
     * Sets the value of the memberNoteTypeSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMemberNoteTypeSubtype(BigInteger value) {
        this.memberNoteTypeSubtype = value;
    }

    /**
     * Gets the value of the memberNoteTypeSubtypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberNoteTypeSubtypeUniversalId() {
        return memberNoteTypeSubtypeUniversalId;
    }

    /**
     * Sets the value of the memberNoteTypeSubtypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberNoteTypeSubtypeUniversalId(String value) {
        this.memberNoteTypeSubtypeUniversalId = value;
    }

}
