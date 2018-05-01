
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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *         &lt;sequence>
 *           &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="memberId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="memberUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="definitionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="definitionId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="creatorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="captureMethodDropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="captureMethodDropDownListItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="captureMethodDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="deviceMakerDropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="deviceMakerDropDownListItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="deviceMakerDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="deviceModelDropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="deviceModelDropDownListItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="deviceModelDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="sourceDropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="sourceDropDownListItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="sourceDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="observerDropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="observerDropDownListItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="observerDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="umEventId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="umEventUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="umEventRequestId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="umEventRequestUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="caseId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="caseUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="caseRequestId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="caseRequestUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="cmProjectId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="cmProjectUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="cmProjectRequestId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="cmProjectRequestUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "id",
    "owner",
    "memberId",
    "memberUniversalId",
    "definitionName",
    "definitionId",
    "creatorId",
    "creatorUniversalId",
    "captureMethodDropDownListItemId",
    "captureMethodDropDownListItemUniversalId",
    "captureMethodDropDownListItemLabel",
    "deviceMakerDropDownListItemId",
    "deviceMakerDropDownListItemUniversalId",
    "deviceMakerDropDownListItemLabel",
    "deviceModelDropDownListItemId",
    "deviceModelDropDownListItemUniversalId",
    "deviceModelDropDownListItemLabel",
    "sourceDropDownListItemId",
    "sourceDropDownListItemUniversalId",
    "sourceDropDownListItemLabel",
    "observerDropDownListItemId",
    "observerDropDownListItemUniversalId",
    "observerDropDownListItemLabel",
    "umEventId",
    "umEventUniversalId",
    "umEventRequestId",
    "umEventRequestUniversalId",
    "caseId",
    "caseUniversalId",
    "caseRequestId",
    "caseRequestUniversalId",
    "cmProjectId",
    "cmProjectUniversalId",
    "cmProjectRequestId",
    "cmProjectRequestUniversalId",
    "queryState"
})
@XmlRootElement(name = "clinicalDataEntryListFilter")
public class ClinicalDataEntryListFilter {

    protected List<BigInteger> id;
    protected String owner;
    protected BigInteger memberId;
    protected String memberUniversalId;
    protected String definitionName;
    protected BigInteger definitionId;
    protected BigInteger creatorId;
    protected String creatorUniversalId;
    protected BigInteger captureMethodDropDownListItemId;
    protected String captureMethodDropDownListItemUniversalId;
    protected String captureMethodDropDownListItemLabel;
    protected BigInteger deviceMakerDropDownListItemId;
    protected String deviceMakerDropDownListItemUniversalId;
    protected String deviceMakerDropDownListItemLabel;
    protected BigInteger deviceModelDropDownListItemId;
    protected String deviceModelDropDownListItemUniversalId;
    protected String deviceModelDropDownListItemLabel;
    protected BigInteger sourceDropDownListItemId;
    protected String sourceDropDownListItemUniversalId;
    protected String sourceDropDownListItemLabel;
    protected BigInteger observerDropDownListItemId;
    protected String observerDropDownListItemUniversalId;
    protected String observerDropDownListItemLabel;
    protected BigInteger umEventId;
    protected String umEventUniversalId;
    protected BigInteger umEventRequestId;
    protected String umEventRequestUniversalId;
    protected BigInteger caseId;
    protected String caseUniversalId;
    protected BigInteger caseRequestId;
    protected String caseRequestUniversalId;
    protected BigInteger cmProjectId;
    protected String cmProjectUniversalId;
    protected BigInteger cmProjectRequestId;
    protected String cmProjectRequestUniversalId;
    protected BigInteger queryState;

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
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the memberId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMemberId() {
        return memberId;
    }

    /**
     * Sets the value of the memberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMemberId(BigInteger value) {
        this.memberId = value;
    }

    /**
     * Gets the value of the memberUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberUniversalId() {
        return memberUniversalId;
    }

    /**
     * Sets the value of the memberUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberUniversalId(String value) {
        this.memberUniversalId = value;
    }

    /**
     * Gets the value of the definitionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinitionName() {
        return definitionName;
    }

    /**
     * Sets the value of the definitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinitionName(String value) {
        this.definitionName = value;
    }

    /**
     * Gets the value of the definitionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDefinitionId() {
        return definitionId;
    }

    /**
     * Sets the value of the definitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDefinitionId(BigInteger value) {
        this.definitionId = value;
    }

    /**
     * Gets the value of the creatorId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCreatorId() {
        return creatorId;
    }

    /**
     * Sets the value of the creatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCreatorId(BigInteger value) {
        this.creatorId = value;
    }

    /**
     * Gets the value of the creatorUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorUniversalId() {
        return creatorUniversalId;
    }

    /**
     * Sets the value of the creatorUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorUniversalId(String value) {
        this.creatorUniversalId = value;
    }

    /**
     * Gets the value of the captureMethodDropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCaptureMethodDropDownListItemId() {
        return captureMethodDropDownListItemId;
    }

    /**
     * Sets the value of the captureMethodDropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCaptureMethodDropDownListItemId(BigInteger value) {
        this.captureMethodDropDownListItemId = value;
    }

    /**
     * Gets the value of the captureMethodDropDownListItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureMethodDropDownListItemUniversalId() {
        return captureMethodDropDownListItemUniversalId;
    }

    /**
     * Sets the value of the captureMethodDropDownListItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureMethodDropDownListItemUniversalId(String value) {
        this.captureMethodDropDownListItemUniversalId = value;
    }

    /**
     * Gets the value of the captureMethodDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureMethodDropDownListItemLabel() {
        return captureMethodDropDownListItemLabel;
    }

    /**
     * Sets the value of the captureMethodDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureMethodDropDownListItemLabel(String value) {
        this.captureMethodDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the deviceMakerDropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeviceMakerDropDownListItemId() {
        return deviceMakerDropDownListItemId;
    }

    /**
     * Sets the value of the deviceMakerDropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeviceMakerDropDownListItemId(BigInteger value) {
        this.deviceMakerDropDownListItemId = value;
    }

    /**
     * Gets the value of the deviceMakerDropDownListItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceMakerDropDownListItemUniversalId() {
        return deviceMakerDropDownListItemUniversalId;
    }

    /**
     * Sets the value of the deviceMakerDropDownListItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceMakerDropDownListItemUniversalId(String value) {
        this.deviceMakerDropDownListItemUniversalId = value;
    }

    /**
     * Gets the value of the deviceMakerDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceMakerDropDownListItemLabel() {
        return deviceMakerDropDownListItemLabel;
    }

    /**
     * Sets the value of the deviceMakerDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceMakerDropDownListItemLabel(String value) {
        this.deviceMakerDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the deviceModelDropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeviceModelDropDownListItemId() {
        return deviceModelDropDownListItemId;
    }

    /**
     * Sets the value of the deviceModelDropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeviceModelDropDownListItemId(BigInteger value) {
        this.deviceModelDropDownListItemId = value;
    }

    /**
     * Gets the value of the deviceModelDropDownListItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceModelDropDownListItemUniversalId() {
        return deviceModelDropDownListItemUniversalId;
    }

    /**
     * Sets the value of the deviceModelDropDownListItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceModelDropDownListItemUniversalId(String value) {
        this.deviceModelDropDownListItemUniversalId = value;
    }

    /**
     * Gets the value of the deviceModelDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceModelDropDownListItemLabel() {
        return deviceModelDropDownListItemLabel;
    }

    /**
     * Sets the value of the deviceModelDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceModelDropDownListItemLabel(String value) {
        this.deviceModelDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the sourceDropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceDropDownListItemId() {
        return sourceDropDownListItemId;
    }

    /**
     * Sets the value of the sourceDropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceDropDownListItemId(BigInteger value) {
        this.sourceDropDownListItemId = value;
    }

    /**
     * Gets the value of the sourceDropDownListItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDropDownListItemUniversalId() {
        return sourceDropDownListItemUniversalId;
    }

    /**
     * Sets the value of the sourceDropDownListItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDropDownListItemUniversalId(String value) {
        this.sourceDropDownListItemUniversalId = value;
    }

    /**
     * Gets the value of the sourceDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDropDownListItemLabel() {
        return sourceDropDownListItemLabel;
    }

    /**
     * Sets the value of the sourceDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDropDownListItemLabel(String value) {
        this.sourceDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the observerDropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getObserverDropDownListItemId() {
        return observerDropDownListItemId;
    }

    /**
     * Sets the value of the observerDropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setObserverDropDownListItemId(BigInteger value) {
        this.observerDropDownListItemId = value;
    }

    /**
     * Gets the value of the observerDropDownListItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObserverDropDownListItemUniversalId() {
        return observerDropDownListItemUniversalId;
    }

    /**
     * Sets the value of the observerDropDownListItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObserverDropDownListItemUniversalId(String value) {
        this.observerDropDownListItemUniversalId = value;
    }

    /**
     * Gets the value of the observerDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObserverDropDownListItemLabel() {
        return observerDropDownListItemLabel;
    }

    /**
     * Sets the value of the observerDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObserverDropDownListItemLabel(String value) {
        this.observerDropDownListItemLabel = value;
    }

    /**
     * Gets the value of the umEventId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUmEventId() {
        return umEventId;
    }

    /**
     * Sets the value of the umEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmEventId(BigInteger value) {
        this.umEventId = value;
    }

    /**
     * Gets the value of the umEventUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmEventUniversalId() {
        return umEventUniversalId;
    }

    /**
     * Sets the value of the umEventUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmEventUniversalId(String value) {
        this.umEventUniversalId = value;
    }

    /**
     * Gets the value of the umEventRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUmEventRequestId() {
        return umEventRequestId;
    }

    /**
     * Sets the value of the umEventRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUmEventRequestId(BigInteger value) {
        this.umEventRequestId = value;
    }

    /**
     * Gets the value of the umEventRequestUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmEventRequestUniversalId() {
        return umEventRequestUniversalId;
    }

    /**
     * Sets the value of the umEventRequestUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmEventRequestUniversalId(String value) {
        this.umEventRequestUniversalId = value;
    }

    /**
     * Gets the value of the caseId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCaseId() {
        return caseId;
    }

    /**
     * Sets the value of the caseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCaseId(BigInteger value) {
        this.caseId = value;
    }

    /**
     * Gets the value of the caseUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseUniversalId() {
        return caseUniversalId;
    }

    /**
     * Sets the value of the caseUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseUniversalId(String value) {
        this.caseUniversalId = value;
    }

    /**
     * Gets the value of the caseRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCaseRequestId() {
        return caseRequestId;
    }

    /**
     * Sets the value of the caseRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCaseRequestId(BigInteger value) {
        this.caseRequestId = value;
    }

    /**
     * Gets the value of the caseRequestUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseRequestUniversalId() {
        return caseRequestUniversalId;
    }

    /**
     * Sets the value of the caseRequestUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseRequestUniversalId(String value) {
        this.caseRequestUniversalId = value;
    }

    /**
     * Gets the value of the cmProjectId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCmProjectId() {
        return cmProjectId;
    }

    /**
     * Sets the value of the cmProjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCmProjectId(BigInteger value) {
        this.cmProjectId = value;
    }

    /**
     * Gets the value of the cmProjectUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmProjectUniversalId() {
        return cmProjectUniversalId;
    }

    /**
     * Sets the value of the cmProjectUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmProjectUniversalId(String value) {
        this.cmProjectUniversalId = value;
    }

    /**
     * Gets the value of the cmProjectRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCmProjectRequestId() {
        return cmProjectRequestId;
    }

    /**
     * Sets the value of the cmProjectRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCmProjectRequestId(BigInteger value) {
        this.cmProjectRequestId = value;
    }

    /**
     * Gets the value of the cmProjectRequestUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmProjectRequestUniversalId() {
        return cmProjectRequestUniversalId;
    }

    /**
     * Sets the value of the cmProjectRequestUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmProjectRequestUniversalId(String value) {
        this.cmProjectRequestUniversalId = value;
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
