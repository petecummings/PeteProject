
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.click4care.thinkhealth.core.dto.TypeOfTaskRecipient;


/**
 * <p>Java class for task_type_typesubtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="task_type_typesubtype">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}typesubtype">
 *       &lt;sequence>
 *         &lt;element name="taskIcon" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="taskIconUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskItemTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="taskTypeRecipientType" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfTaskRecipient"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "task_type_typesubtype", propOrder = {
    "taskIcon",
    "taskIconUniversalId",
    "taskItemTypeId",
    "taskTypeRecipientType"
})
public class TaskTypeTypesubtype
    extends Typesubtype
{

    protected BigInteger taskIcon;
    protected String taskIconUniversalId;
    protected BigInteger taskItemTypeId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfTaskRecipient taskTypeRecipientType;

    /**
     * Gets the value of the taskIcon property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaskIcon() {
        return taskIcon;
    }

    /**
     * Sets the value of the taskIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaskIcon(BigInteger value) {
        this.taskIcon = value;
    }

    /**
     * Gets the value of the taskIconUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskIconUniversalId() {
        return taskIconUniversalId;
    }

    /**
     * Sets the value of the taskIconUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskIconUniversalId(String value) {
        this.taskIconUniversalId = value;
    }

    /**
     * Gets the value of the taskItemTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaskItemTypeId() {
        return taskItemTypeId;
    }

    /**
     * Sets the value of the taskItemTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaskItemTypeId(BigInteger value) {
        this.taskItemTypeId = value;
    }

    /**
     * Gets the value of the taskTypeRecipientType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTaskRecipient }
     *     
     */
    public TypeOfTaskRecipient getTaskTypeRecipientType() {
        return taskTypeRecipientType;
    }

    /**
     * Sets the value of the taskTypeRecipientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTaskRecipient }
     *     
     */
    public void setTaskTypeRecipientType(TypeOfTaskRecipient value) {
        this.taskTypeRecipientType = value;
    }

}
