
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfLetterRecipient;


/**
 * <p>Java class for letterRecipientType_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="letterRecipientType_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configuredLetterCC" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="configuredLetterCCUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configuredLetterTo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="configuredLetterToUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="defaultRecipient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="preparedLetterCC" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="preparedLetterCCUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preparedLetterTo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="preparedLetterToUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfLetterRecipient" minOccurs="0"/>
 *         &lt;element name="templateCC" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="templateCCUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="templateTo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="templateToUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "letterRecipientType_type", propOrder = {
    "c4CId",
    "configuredLetterCC",
    "configuredLetterCCUniversalId",
    "configuredLetterTo",
    "configuredLetterToUniversalId",
    "createdDate",
    "defaultRecipient",
    "deletedDate",
    "id",
    "lastActionDate",
    "preparedLetterCC",
    "preparedLetterCCUniversalId",
    "preparedLetterTo",
    "preparedLetterToUniversalId",
    "recipientType",
    "templateCC",
    "templateCCUniversalId",
    "templateTo",
    "templateToUniversalId",
    "universalId",
    "version"
})
public class LetterRecipientTypeType {

    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected BigInteger configuredLetterCC;
    protected String configuredLetterCCUniversalId;
    protected BigInteger configuredLetterTo;
    protected String configuredLetterToUniversalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected Boolean defaultRecipient;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected BigInteger preparedLetterCC;
    protected String preparedLetterCCUniversalId;
    protected BigInteger preparedLetterTo;
    protected String preparedLetterToUniversalId;
    @XmlSchemaType(name = "string")
    protected TypeOfLetterRecipient recipientType;
    protected BigInteger templateCC;
    protected String templateCCUniversalId;
    protected BigInteger templateTo;
    protected String templateToUniversalId;
    protected String universalId;
    protected BigInteger version;

    /**
     * Gets the value of the c4CId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC4CId() {
        return c4CId;
    }

    /**
     * Sets the value of the c4CId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC4CId(String value) {
        this.c4CId = value;
    }

    /**
     * Gets the value of the configuredLetterCC property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConfiguredLetterCC() {
        return configuredLetterCC;
    }

    /**
     * Sets the value of the configuredLetterCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConfiguredLetterCC(BigInteger value) {
        this.configuredLetterCC = value;
    }

    /**
     * Gets the value of the configuredLetterCCUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguredLetterCCUniversalId() {
        return configuredLetterCCUniversalId;
    }

    /**
     * Sets the value of the configuredLetterCCUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguredLetterCCUniversalId(String value) {
        this.configuredLetterCCUniversalId = value;
    }

    /**
     * Gets the value of the configuredLetterTo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConfiguredLetterTo() {
        return configuredLetterTo;
    }

    /**
     * Sets the value of the configuredLetterTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConfiguredLetterTo(BigInteger value) {
        this.configuredLetterTo = value;
    }

    /**
     * Gets the value of the configuredLetterToUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguredLetterToUniversalId() {
        return configuredLetterToUniversalId;
    }

    /**
     * Sets the value of the configuredLetterToUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguredLetterToUniversalId(String value) {
        this.configuredLetterToUniversalId = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the defaultRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultRecipient() {
        return defaultRecipient;
    }

    /**
     * Sets the value of the defaultRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultRecipient(Boolean value) {
        this.defaultRecipient = value;
    }

    /**
     * Gets the value of the deletedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeletedDate() {
        return deletedDate;
    }

    /**
     * Sets the value of the deletedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeletedDate(XMLGregorianCalendar value) {
        this.deletedDate = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the lastActionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastActionDate() {
        return lastActionDate;
    }

    /**
     * Sets the value of the lastActionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastActionDate(XMLGregorianCalendar value) {
        this.lastActionDate = value;
    }

    /**
     * Gets the value of the preparedLetterCC property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPreparedLetterCC() {
        return preparedLetterCC;
    }

    /**
     * Sets the value of the preparedLetterCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPreparedLetterCC(BigInteger value) {
        this.preparedLetterCC = value;
    }

    /**
     * Gets the value of the preparedLetterCCUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreparedLetterCCUniversalId() {
        return preparedLetterCCUniversalId;
    }

    /**
     * Sets the value of the preparedLetterCCUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreparedLetterCCUniversalId(String value) {
        this.preparedLetterCCUniversalId = value;
    }

    /**
     * Gets the value of the preparedLetterTo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPreparedLetterTo() {
        return preparedLetterTo;
    }

    /**
     * Sets the value of the preparedLetterTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPreparedLetterTo(BigInteger value) {
        this.preparedLetterTo = value;
    }

    /**
     * Gets the value of the preparedLetterToUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreparedLetterToUniversalId() {
        return preparedLetterToUniversalId;
    }

    /**
     * Sets the value of the preparedLetterToUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreparedLetterToUniversalId(String value) {
        this.preparedLetterToUniversalId = value;
    }

    /**
     * Gets the value of the recipientType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfLetterRecipient }
     *     
     */
    public TypeOfLetterRecipient getRecipientType() {
        return recipientType;
    }

    /**
     * Sets the value of the recipientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfLetterRecipient }
     *     
     */
    public void setRecipientType(TypeOfLetterRecipient value) {
        this.recipientType = value;
    }

    /**
     * Gets the value of the templateCC property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTemplateCC() {
        return templateCC;
    }

    /**
     * Sets the value of the templateCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTemplateCC(BigInteger value) {
        this.templateCC = value;
    }

    /**
     * Gets the value of the templateCCUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateCCUniversalId() {
        return templateCCUniversalId;
    }

    /**
     * Sets the value of the templateCCUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateCCUniversalId(String value) {
        this.templateCCUniversalId = value;
    }

    /**
     * Gets the value of the templateTo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTemplateTo() {
        return templateTo;
    }

    /**
     * Sets the value of the templateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTemplateTo(BigInteger value) {
        this.templateTo = value;
    }

    /**
     * Gets the value of the templateToUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateToUniversalId() {
        return templateToUniversalId;
    }

    /**
     * Sets the value of the templateToUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateToUniversalId(String value) {
        this.templateToUniversalId = value;
    }

    /**
     * Gets the value of the universalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalId() {
        return universalId;
    }

    /**
     * Sets the value of the universalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalId(String value) {
        this.universalId = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

}
