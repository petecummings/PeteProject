
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfMedicationSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfMedicationSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROVIDER"/>
 *     &lt;enumeration value="MEMBER"/>
 *     &lt;enumeration value="PATIENT_ID_QUERY"/>
 *     &lt;enumeration value="ASSESMENT"/>
 *     &lt;enumeration value="CARE_CALCULATOR"/>
 *     &lt;enumeration value="PAYER_USER"/>
 *     &lt;enumeration value="MEDICAL_CLAIM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfMedicationSourceType")
@XmlEnum
public enum TypeOfMedicationSourceType {

    PROVIDER,
    MEMBER,
    PATIENT_ID_QUERY,
    ASSESMENT,
    CARE_CALCULATOR,
    PAYER_USER,
    MEDICAL_CLAIM;

    public String value() {
        return name();
    }

    public static TypeOfMedicationSourceType fromValue(String v) {
        return valueOf(v);
    }

}
