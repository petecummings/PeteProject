
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sent_carebean_task_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sent_carebean_task_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}sent_task_base_type">
 *       &lt;sequence>
 *         &lt;element name="afterEachInstance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="carebeanId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="carebeanTaskId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="taskNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sent_carebean_task_type", propOrder = {
    "afterEachInstance",
    "carebeanId",
    "carebeanTaskId",
    "taskNumber"
})
public class SentCarebeanTaskType
    extends SentTaskBaseType
{

    protected Boolean afterEachInstance;
    protected BigInteger carebeanId;
    protected BigInteger carebeanTaskId;
    protected BigInteger taskNumber;

    /**
     * Gets the value of the afterEachInstance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAfterEachInstance() {
        return afterEachInstance;
    }

    /**
     * Sets the value of the afterEachInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAfterEachInstance(Boolean value) {
        this.afterEachInstance = value;
    }

    /**
     * Gets the value of the carebeanId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCarebeanId() {
        return carebeanId;
    }

    /**
     * Sets the value of the carebeanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCarebeanId(BigInteger value) {
        this.carebeanId = value;
    }

    /**
     * Gets the value of the carebeanTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCarebeanTaskId() {
        return carebeanTaskId;
    }

    /**
     * Sets the value of the carebeanTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCarebeanTaskId(BigInteger value) {
        this.carebeanTaskId = value;
    }

    /**
     * Gets the value of the taskNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaskNumber() {
        return taskNumber;
    }

    /**
     * Sets the value of the taskNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaskNumber(BigInteger value) {
        this.taskNumber = value;
    }

}
