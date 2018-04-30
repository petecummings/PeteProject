
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfCmTimeUnit;
import com.click4care.thinkhealth.core.dto.TypeOfDeadline;


/**
 * <p>Java class for care_management_request_template_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="care_management_request_template_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}care_management_template_type">
 *       &lt;sequence>
 *         &lt;element name="deadlineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deadlineTimeBlock" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deadlineTimeBlockUnitType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfCmTimeUnit" minOccurs="0"/>
 *         &lt;element name="deadlineTimeInDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deadlineType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfDeadline" minOccurs="0"/>
 *         &lt;element name="okAfterDeadline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "care_management_request_template_type", propOrder = {
    "deadlineDate",
    "deadlineTimeBlock",
    "deadlineTimeBlockUnitType",
    "deadlineTimeInDay",
    "deadlineType",
    "okAfterDeadline"
})
public class CareManagementRequestTemplateType
    extends CareManagementTemplateType
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deadlineDate;
    protected BigInteger deadlineTimeBlock;
    @XmlSchemaType(name = "string")
    protected TypeOfCmTimeUnit deadlineTimeBlockUnitType;
    protected BigInteger deadlineTimeInDay;
    @XmlSchemaType(name = "string")
    protected TypeOfDeadline deadlineType;
    protected Boolean okAfterDeadline;

    /**
     * Gets the value of the deadlineDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeadlineDate() {
        return deadlineDate;
    }

    /**
     * Sets the value of the deadlineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeadlineDate(XMLGregorianCalendar value) {
        this.deadlineDate = value;
    }

    /**
     * Gets the value of the deadlineTimeBlock property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeadlineTimeBlock() {
        return deadlineTimeBlock;
    }

    /**
     * Sets the value of the deadlineTimeBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeadlineTimeBlock(BigInteger value) {
        this.deadlineTimeBlock = value;
    }

    /**
     * Gets the value of the deadlineTimeBlockUnitType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfCmTimeUnit }
     *     
     */
    public TypeOfCmTimeUnit getDeadlineTimeBlockUnitType() {
        return deadlineTimeBlockUnitType;
    }

    /**
     * Sets the value of the deadlineTimeBlockUnitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfCmTimeUnit }
     *     
     */
    public void setDeadlineTimeBlockUnitType(TypeOfCmTimeUnit value) {
        this.deadlineTimeBlockUnitType = value;
    }

    /**
     * Gets the value of the deadlineTimeInDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeadlineTimeInDay() {
        return deadlineTimeInDay;
    }

    /**
     * Sets the value of the deadlineTimeInDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeadlineTimeInDay(BigInteger value) {
        this.deadlineTimeInDay = value;
    }

    /**
     * Gets the value of the deadlineType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDeadline }
     *     
     */
    public TypeOfDeadline getDeadlineType() {
        return deadlineType;
    }

    /**
     * Sets the value of the deadlineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDeadline }
     *     
     */
    public void setDeadlineType(TypeOfDeadline value) {
        this.deadlineType = value;
    }

    /**
     * Gets the value of the okAfterDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOkAfterDeadline() {
        return okAfterDeadline;
    }

    /**
     * Sets the value of the okAfterDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOkAfterDeadline(Boolean value) {
        this.okAfterDeadline = value;
    }

}
