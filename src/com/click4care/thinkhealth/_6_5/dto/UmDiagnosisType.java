
package com.click4care.thinkhealth._6_5.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for um_diagnosis_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="um_diagnosis_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}um_diagnosis_base_type">
 *       &lt;sequence>
 *         &lt;element name="customFields" type="{http://www.click4care.com/thinkhealth/6.5/dto}customFields_type" minOccurs="0"/>
 *         &lt;element name="medicalServices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="medicalService" type="{http://www.click4care.com/thinkhealth/6.5/dto}medicalService_type" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "um_diagnosis_type", propOrder = {
    "customFields",
    "medicalServices"
})
public class UmDiagnosisType
    extends UmDiagnosisBaseType
{

    protected CustomFieldsType customFields;
    protected UmDiagnosisType.MedicalServices medicalServices;

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldsType }
     *     
     */
    public CustomFieldsType getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldsType }
     *     
     */
    public void setCustomFields(CustomFieldsType value) {
        this.customFields = value;
    }

    /**
     * Gets the value of the medicalServices property.
     * 
     * @return
     *     possible object is
     *     {@link UmDiagnosisType.MedicalServices }
     *     
     */
    public UmDiagnosisType.MedicalServices getMedicalServices() {
        return medicalServices;
    }

    /**
     * Sets the value of the medicalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link UmDiagnosisType.MedicalServices }
     *     
     */
    public void setMedicalServices(UmDiagnosisType.MedicalServices value) {
        this.medicalServices = value;
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
     *         &lt;element name="medicalService" type="{http://www.click4care.com/thinkhealth/6.5/dto}medicalService_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "medicalService"
    })
    public static class MedicalServices {

        protected List<MedicalServiceType> medicalService;

        /**
         * Gets the value of the medicalService property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the medicalService property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMedicalService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MedicalServiceType }
         * 
         * 
         */
        public List<MedicalServiceType> getMedicalService() {
            if (medicalService == null) {
                medicalService = new ArrayList<MedicalServiceType>();
            }
            return this.medicalService;
        }

    }

}
