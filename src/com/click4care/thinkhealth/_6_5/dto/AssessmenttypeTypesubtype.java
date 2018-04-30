
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assessmenttype_typesubtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmenttype_typesubtype">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}typesubtype">
 *       &lt;sequence>
 *         &lt;element name="assessmentTypeDefaultLeadingMessageId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="assessmentTypeDefaultLeadingMessageUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentTypeDefaultLetterHeadId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="assessmentTypeDefaultLetterHeadUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentTypeDisclaimerId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="assessmentTypeDisclaimerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmenttype_typesubtype", propOrder = {
    "assessmentTypeDefaultLeadingMessageId",
    "assessmentTypeDefaultLeadingMessageUniversalId",
    "assessmentTypeDefaultLetterHeadId",
    "assessmentTypeDefaultLetterHeadUniversalId",
    "assessmentTypeDisclaimerId",
    "assessmentTypeDisclaimerUniversalId"
})
public class AssessmenttypeTypesubtype
    extends Typesubtype
{

    protected BigInteger assessmentTypeDefaultLeadingMessageId;
    protected String assessmentTypeDefaultLeadingMessageUniversalId;
    protected BigInteger assessmentTypeDefaultLetterHeadId;
    protected String assessmentTypeDefaultLetterHeadUniversalId;
    protected BigInteger assessmentTypeDisclaimerId;
    protected String assessmentTypeDisclaimerUniversalId;

    /**
     * Gets the value of the assessmentTypeDefaultLeadingMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssessmentTypeDefaultLeadingMessageId() {
        return assessmentTypeDefaultLeadingMessageId;
    }

    /**
     * Sets the value of the assessmentTypeDefaultLeadingMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssessmentTypeDefaultLeadingMessageId(BigInteger value) {
        this.assessmentTypeDefaultLeadingMessageId = value;
    }

    /**
     * Gets the value of the assessmentTypeDefaultLeadingMessageUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentTypeDefaultLeadingMessageUniversalId() {
        return assessmentTypeDefaultLeadingMessageUniversalId;
    }

    /**
     * Sets the value of the assessmentTypeDefaultLeadingMessageUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentTypeDefaultLeadingMessageUniversalId(String value) {
        this.assessmentTypeDefaultLeadingMessageUniversalId = value;
    }

    /**
     * Gets the value of the assessmentTypeDefaultLetterHeadId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssessmentTypeDefaultLetterHeadId() {
        return assessmentTypeDefaultLetterHeadId;
    }

    /**
     * Sets the value of the assessmentTypeDefaultLetterHeadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssessmentTypeDefaultLetterHeadId(BigInteger value) {
        this.assessmentTypeDefaultLetterHeadId = value;
    }

    /**
     * Gets the value of the assessmentTypeDefaultLetterHeadUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentTypeDefaultLetterHeadUniversalId() {
        return assessmentTypeDefaultLetterHeadUniversalId;
    }

    /**
     * Sets the value of the assessmentTypeDefaultLetterHeadUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentTypeDefaultLetterHeadUniversalId(String value) {
        this.assessmentTypeDefaultLetterHeadUniversalId = value;
    }

    /**
     * Gets the value of the assessmentTypeDisclaimerId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssessmentTypeDisclaimerId() {
        return assessmentTypeDisclaimerId;
    }

    /**
     * Sets the value of the assessmentTypeDisclaimerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssessmentTypeDisclaimerId(BigInteger value) {
        this.assessmentTypeDisclaimerId = value;
    }

    /**
     * Gets the value of the assessmentTypeDisclaimerUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentTypeDisclaimerUniversalId() {
        return assessmentTypeDisclaimerUniversalId;
    }

    /**
     * Sets the value of the assessmentTypeDisclaimerUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentTypeDisclaimerUniversalId(String value) {
        this.assessmentTypeDisclaimerUniversalId = value;
    }

}
