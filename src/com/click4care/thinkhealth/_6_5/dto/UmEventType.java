
package com.click4care.thinkhealth._6_5.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for umEvent_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="umEvent_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}umEvent_summary_type">
 *       &lt;sequence>
 *         &lt;element name="umDiagnoses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="umDiagnosis" type="{http://www.click4care.com/thinkhealth/6.5/dto}um_diagnosis_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="umProviderAssociations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="umProviderAssociation" type="{http://www.click4care.com/thinkhealth/6.5/dto}um_provider_association_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "umEvent_type", propOrder = {
    "umDiagnoses",
    "umProviderAssociations"
})
@XmlSeeAlso({
    UmServiceAgreementType.class
})
public class UmEventType
    extends UmEventSummaryType
{

    protected UmEventType.UmDiagnoses umDiagnoses;
    protected UmEventType.UmProviderAssociations umProviderAssociations;

    /**
     * Gets the value of the umDiagnoses property.
     * 
     * @return
     *     possible object is
     *     {@link UmEventType.UmDiagnoses }
     *     
     */
    public UmEventType.UmDiagnoses getUmDiagnoses() {
        return umDiagnoses;
    }

    /**
     * Sets the value of the umDiagnoses property.
     * 
     * @param value
     *     allowed object is
     *     {@link UmEventType.UmDiagnoses }
     *     
     */
    public void setUmDiagnoses(UmEventType.UmDiagnoses value) {
        this.umDiagnoses = value;
    }

    /**
     * Gets the value of the umProviderAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link UmEventType.UmProviderAssociations }
     *     
     */
    public UmEventType.UmProviderAssociations getUmProviderAssociations() {
        return umProviderAssociations;
    }

    /**
     * Sets the value of the umProviderAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link UmEventType.UmProviderAssociations }
     *     
     */
    public void setUmProviderAssociations(UmEventType.UmProviderAssociations value) {
        this.umProviderAssociations = value;
    }


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
     *         &lt;element name="umDiagnosis" type="{http://www.click4care.com/thinkhealth/6.5/dto}um_diagnosis_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "umDiagnosis"
    })
    public static class UmDiagnoses {

        protected List<UmDiagnosisType> umDiagnosis;

        /**
         * Gets the value of the umDiagnosis property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the umDiagnosis property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUmDiagnosis().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UmDiagnosisType }
         * 
         * 
         */
        public List<UmDiagnosisType> getUmDiagnosis() {
            if (umDiagnosis == null) {
                umDiagnosis = new ArrayList<UmDiagnosisType>();
            }
            return this.umDiagnosis;
        }

    }


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
     *         &lt;element name="umProviderAssociation" type="{http://www.click4care.com/thinkhealth/6.5/dto}um_provider_association_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "umProviderAssociation"
    })
    public static class UmProviderAssociations {

        protected List<UmProviderAssociationType> umProviderAssociation;

        /**
         * Gets the value of the umProviderAssociation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the umProviderAssociation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUmProviderAssociation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UmProviderAssociationType }
         * 
         * 
         */
        public List<UmProviderAssociationType> getUmProviderAssociation() {
            if (umProviderAssociation == null) {
                umProviderAssociation = new ArrayList<UmProviderAssociationType>();
            }
            return this.umProviderAssociation;
        }

    }

}
