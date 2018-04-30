
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sent_task_note_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sent_task_note_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}note_type">
 *       &lt;sequence>
 *         &lt;element name="sentTask" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sentTaskNoteSubtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sentTaskNoteSubtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sentTaskNoteSubtype3DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sentTaskNoteTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sentTaskNoteTypeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sentTaskNoteTypeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sentTaskUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sent_task_note_type", propOrder = {
    "sentTask",
    "sentTaskNoteSubtype1DropDownListItemLabel",
    "sentTaskNoteSubtype2DropDownListItemLabel",
    "sentTaskNoteSubtype3DropDownListItemLabel",
    "sentTaskNoteTypeDropDownListItemLabel",
    "sentTaskNoteTypeSubtype",
    "sentTaskNoteTypeSubtypeUniversalId",
    "sentTaskUniversalId"
})
public class SentTaskNoteType
    extends NoteType
{

    protected BigInteger sentTask;
    protected String sentTaskNoteSubtype1DropDownListItemLabel;
    protected String sentTaskNoteSubtype2DropDownListItemLabel;
    protected String sentTaskNoteSubtype3DropDownListItemLabel;
    protected String sentTaskNoteTypeDropDownListItemLabel;
    protected BigInteger sentTaskNoteTypeSubtype;
    protected String sentTaskNoteTypeSubtypeUniversalId;
    protected String sentTaskUniversalId;

    /**
     * Gets the value of the sentTask property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSentTask() {
        return sentTask;
    }

    /**
     * Sets the value of the sentTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSentTask(BigInteger value) {
        this.sentTask = value;
    }

    /**
     * Gets the value of the sentTaskNoteSubtype1DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentTaskNoteSubtype1DropDownListItemLabel() {
        return sentTaskNoteSubtype1DropDownListItemLabel;
    }

    /**
     * Sets the value of the sentTaskNoteSubtype1DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentTaskNoteSubtype1DropDownListItemLabel(String value) {
        this.sentTaskNoteSubtype1DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the sentTaskNoteSubtype2DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentTaskNoteSubtype2DropDownListItemLabel() {
        return sentTaskNoteSubtype2DropDownListItemLabel;
    }

    /**
     * Sets the value of the sentTaskNoteSubtype2DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentTaskNoteSubtype2DropDownListItemLabel(String value) {
        this.sentTaskNoteSubtype2DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the sentTaskNoteSubtype3DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentTaskNoteSubtype3DropDownListItemLabel() {
        return sentTaskNoteSubtype3DropDownListItemLabel;
    }

    /**
     * Sets the value of the sentTaskNoteSubtype3DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentTaskNoteSubtype3DropDownListItemLabel(String value) {
        this.sentTaskNoteSubtype3DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the sentTaskNoteTypeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentTaskNoteTypeDropDownListItemLabel() {
        return sentTaskNoteTypeDropDownListItemLabel;
    }

    /**
     * Sets the value of the sentTaskNoteTypeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentTaskNoteTypeDropDownListItemLabel(String value) {
        this.sentTaskNoteTypeDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the sentTaskNoteTypeSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSentTaskNoteTypeSubtype() {
        return sentTaskNoteTypeSubtype;
    }

    /**
     * Sets the value of the sentTaskNoteTypeSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSentTaskNoteTypeSubtype(BigInteger value) {
        this.sentTaskNoteTypeSubtype = value;
    }

    /**
     * Gets the value of the sentTaskNoteTypeSubtypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentTaskNoteTypeSubtypeUniversalId() {
        return sentTaskNoteTypeSubtypeUniversalId;
    }

    /**
     * Sets the value of the sentTaskNoteTypeSubtypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentTaskNoteTypeSubtypeUniversalId(String value) {
        this.sentTaskNoteTypeSubtypeUniversalId = value;
    }

    /**
     * Gets the value of the sentTaskUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentTaskUniversalId() {
        return sentTaskUniversalId;
    }

    /**
     * Sets the value of the sentTaskUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentTaskUniversalId(String value) {
        this.sentTaskUniversalId = value;
    }

}
