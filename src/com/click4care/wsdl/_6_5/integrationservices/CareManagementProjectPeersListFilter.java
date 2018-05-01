
package com.click4care.wsdl._6_5.integrationservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *         &lt;sequence>
 *           &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="projectUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="projectPeerId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="projectPeerUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "legacyId",
    "id",
    "projectId",
    "projectUniversalId",
    "projectPeerId",
    "projectPeerUniversalId",
    "createdDate",
    "lastActionDate",
    "queryState"
})
@XmlRootElement(name = "careManagementProjectPeersListFilter")
public class CareManagementProjectPeersListFilter {

    protected List<String> legacyId;
    protected List<BigInteger> id;
    protected BigInteger projectId;
    protected String projectUniversalId;
    protected BigInteger projectPeerId;
    protected String projectPeerUniversalId;
    protected DateRange createdDate;
    protected DateRange lastActionDate;
    protected BigInteger queryState;

    /**
     * Gets the value of the legacyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legacyId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegacyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLegacyId() {
        if (legacyId == null) {
            legacyId = new ArrayList<String>();
        }
        return this.legacyId;
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
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProjectId(BigInteger value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the projectUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectUniversalId() {
        return projectUniversalId;
    }

    /**
     * Sets the value of the projectUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectUniversalId(String value) {
        this.projectUniversalId = value;
    }

    /**
     * Gets the value of the projectPeerId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProjectPeerId() {
        return projectPeerId;
    }

    /**
     * Sets the value of the projectPeerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProjectPeerId(BigInteger value) {
        this.projectPeerId = value;
    }

    /**
     * Gets the value of the projectPeerUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectPeerUniversalId() {
        return projectPeerUniversalId;
    }

    /**
     * Sets the value of the projectPeerUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectPeerUniversalId(String value) {
        this.projectPeerUniversalId = value;
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
