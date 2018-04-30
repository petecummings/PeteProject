
package com.click4care.wsdl._6_5.integrationservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="completeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="accessGranted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="systemInitiated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "taskId",
    "comment",
    "completeDate",
    "accessGranted",
    "systemInitiated"
})
@XmlRootElement(name = "taskCompletion")
public class TaskCompletion {

    protected long taskId;
    @XmlElement(required = true)
    protected String comment;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completeDate;
    protected Boolean accessGranted;
    protected Boolean systemInitiated;

    /**
     * Gets the value of the taskId property.
     * 
     */
    public long getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     */
    public void setTaskId(long value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the completeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompleteDate() {
        return completeDate;
    }

    /**
     * Sets the value of the completeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompleteDate(XMLGregorianCalendar value) {
        this.completeDate = value;
    }

    /**
     * Gets the value of the accessGranted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessGranted() {
        return accessGranted;
    }

    /**
     * Sets the value of the accessGranted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessGranted(Boolean value) {
        this.accessGranted = value;
    }

    /**
     * Gets the value of the systemInitiated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSystemInitiated() {
        return systemInitiated;
    }

    /**
     * Sets the value of the systemInitiated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSystemInitiated(Boolean value) {
        this.systemInitiated = value;
    }

}
