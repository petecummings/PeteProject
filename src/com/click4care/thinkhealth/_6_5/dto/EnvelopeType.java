
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for envelope_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="envelope_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}stationary_type">
 *       &lt;sequence>
 *         &lt;element name="backContentBottomMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="backContentContainsImage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="backContentContainsLetterhead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="backContentContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="backContentDat1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backContentDat2" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="backContentHeight" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="backContentLeftMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="backContentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backContentPageSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="backContentRightMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="backContentTopMargin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="backContentWidth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deactivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typeSubtype" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "envelope_type", propOrder = {
    "backContentBottomMargin",
    "backContentContainsImage",
    "backContentContainsLetterhead",
    "backContentContent",
    "backContentDat1",
    "backContentDat2",
    "backContentHeight",
    "backContentLeftMargin",
    "backContentName",
    "backContentPageSize",
    "backContentRightMargin",
    "backContentTopMargin",
    "backContentWidth",
    "deactivationDate",
    "owner",
    "typeSubtype"
})
public class EnvelopeType
    extends StationaryType
{

    protected BigInteger backContentBottomMargin;
    protected Boolean backContentContainsImage;
    protected Boolean backContentContainsLetterhead;
    protected byte[] backContentContent;
    protected String backContentDat1;
    protected BigInteger backContentDat2;
    protected BigInteger backContentHeight;
    protected BigInteger backContentLeftMargin;
    protected String backContentName;
    protected BigInteger backContentPageSize;
    protected BigInteger backContentRightMargin;
    protected BigInteger backContentTopMargin;
    protected BigInteger backContentWidth;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactivationDate;
    protected BigInteger owner;
    protected BigInteger typeSubtype;

    /**
     * Gets the value of the backContentBottomMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBackContentBottomMargin() {
        return backContentBottomMargin;
    }

    /**
     * Sets the value of the backContentBottomMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBackContentBottomMargin(BigInteger value) {
        this.backContentBottomMargin = value;
    }

    /**
     * Gets the value of the backContentContainsImage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackContentContainsImage() {
        return backContentContainsImage;
    }

    /**
     * Sets the value of the backContentContainsImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackContentContainsImage(Boolean value) {
        this.backContentContainsImage = value;
    }

    /**
     * Gets the value of the backContentContainsLetterhead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackContentContainsLetterhead() {
        return backContentContainsLetterhead;
    }

    /**
     * Sets the value of the backContentContainsLetterhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackContentContainsLetterhead(Boolean value) {
        this.backContentContainsLetterhead = value;
    }

    /**
     * Gets the value of the backContentContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBackContentContent() {
        return backContentContent;
    }

    /**
     * Sets the value of the backContentContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBackContentContent(byte[] value) {
        this.backContentContent = value;
    }

    /**
     * Gets the value of the backContentDat1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackContentDat1() {
        return backContentDat1;
    }

    /**
     * Sets the value of the backContentDat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackContentDat1(String value) {
        this.backContentDat1 = value;
    }

    /**
     * Gets the value of the backContentDat2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBackContentDat2() {
        return backContentDat2;
    }

    /**
     * Sets the value of the backContentDat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBackContentDat2(BigInteger value) {
        this.backContentDat2 = value;
    }

    /**
     * Gets the value of the backContentHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBackContentHeight() {
        return backContentHeight;
    }

    /**
     * Sets the value of the backContentHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBackContentHeight(BigInteger value) {
        this.backContentHeight = value;
    }

    /**
     * Gets the value of the backContentLeftMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBackContentLeftMargin() {
        return backContentLeftMargin;
    }

    /**
     * Sets the value of the backContentLeftMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBackContentLeftMargin(BigInteger value) {
        this.backContentLeftMargin = value;
    }

    /**
     * Gets the value of the backContentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackContentName() {
        return backContentName;
    }

    /**
     * Sets the value of the backContentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackContentName(String value) {
        this.backContentName = value;
    }

    /**
     * Gets the value of the backContentPageSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBackContentPageSize() {
        return backContentPageSize;
    }

    /**
     * Sets the value of the backContentPageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBackContentPageSize(BigInteger value) {
        this.backContentPageSize = value;
    }

    /**
     * Gets the value of the backContentRightMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBackContentRightMargin() {
        return backContentRightMargin;
    }

    /**
     * Sets the value of the backContentRightMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBackContentRightMargin(BigInteger value) {
        this.backContentRightMargin = value;
    }

    /**
     * Gets the value of the backContentTopMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBackContentTopMargin() {
        return backContentTopMargin;
    }

    /**
     * Sets the value of the backContentTopMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBackContentTopMargin(BigInteger value) {
        this.backContentTopMargin = value;
    }

    /**
     * Gets the value of the backContentWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBackContentWidth() {
        return backContentWidth;
    }

    /**
     * Sets the value of the backContentWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBackContentWidth(BigInteger value) {
        this.backContentWidth = value;
    }

    /**
     * Gets the value of the deactivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeactivationDate() {
        return deactivationDate;
    }

    /**
     * Sets the value of the deactivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeactivationDate(XMLGregorianCalendar value) {
        this.deactivationDate = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOwner(BigInteger value) {
        this.owner = value;
    }

    /**
     * Gets the value of the typeSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeSubtype() {
        return typeSubtype;
    }

    /**
     * Sets the value of the typeSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeSubtype(BigInteger value) {
        this.typeSubtype = value;
    }

}
