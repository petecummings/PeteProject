
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for member_note_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="member_note_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}note_type">
 *       &lt;sequence>
 *         &lt;element name="member" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="memberNoteSubtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberNoteSubtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberNoteSubtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberNoteTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberNoteTypeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="memberNoteTypeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "member_note_type", propOrder = {
    "member",
    "memberNoteSubtype1DropDownListItemLabel",
    "memberNoteSubtype2DropDownListItemLabel",
    "memberNoteSubtype3DropDownListItemLabel",
    "memberNoteTypeDropDownListItemLabel",
    "memberNoteTypeSubtype",
    "memberNoteTypeSubtypeUniversalId",
    "memberUniversalId"
})
public class MemberNoteType
    extends NoteType
{

    protected BigInteger member;
    protected String memberNoteSubtype1DropDownListItemLabel;
    protected String memberNoteSubtype2DropDownListItemLabel;
    protected String memberNoteSubtype3DropDownListItemLabel;
    protected String memberNoteTypeDropDownListItemLabel;
    protected BigInteger memberNoteTypeSubtype;
    protected String memberNoteTypeSubtypeUniversalId;
    protected String memberUniversalId;

    /**
     * Gets the value of the member property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMember() {
        return member;
    }

    /**
     * Sets the value of the member property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMember(BigInteger value) {
        this.member = value;
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

    /**
     * Gets the value of the memberUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberUniversalId() {
        return memberUniversalId;
    }

    /**
     * Sets the value of the memberUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberUniversalId(String value) {
        this.memberUniversalId = value;
    }

}
