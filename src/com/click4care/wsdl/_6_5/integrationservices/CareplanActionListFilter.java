
package com.click4care.wsdl._6_5.integrationservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *         &lt;sequence>
 *           &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="sentTaskId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="sentTaskUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *             &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *           &lt;/choice>
 *           &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "universalId",
    "id",
    "c4CId",
    "name",
    "description",
    "sentTaskId",
    "sentTaskUniversalId",
    "createdDate",
    "lastActionDate",
    "queryState"
})
@XmlRootElement(name = "careplanActionListFilter")
public class CareplanActionListFilter {

    protected List<String> universalId;
    protected List<BigInteger> id;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected String name;
    protected String description;
    protected BigInteger sentTaskId;
    protected String sentTaskUniversalId;
    protected DateRange createdDate;
    protected DateRange lastActionDate;
    protected BigInteger queryState;

    /**
     * Gets the value of the universalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the universalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniversalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUniversalId() {
        if (universalId == null) {
            universalId = new ArrayList<String>();
        }
        return this.universalId;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getId() {
        if (id == null) {
            id = new ArrayList<BigInteger>();
        }
        return this.id;
    }

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the sentTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSentTaskId() {
        return sentTaskId;
    }

    /**
     * Sets the value of the sentTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSentTaskId(BigInteger value) {
        this.sentTaskId = value;
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

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setCreatedDate(DateRange value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the lastActionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getLastActionDate() {
        return lastActionDate;
    }

    /**
     * Sets the value of the lastActionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setLastActionDate(DateRange value) {
        this.lastActionDate = value;
    }

    /**
     * Gets the value of the queryState property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueryState() {
        return queryState;
    }

    /**
     * Sets the value of the queryState property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueryState(BigInteger value) {
        this.queryState = value;
    }

}
