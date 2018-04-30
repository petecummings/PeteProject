
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROVIDER_USER"/>
 *     &lt;enumeration value="MEMBER_USER"/>
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
@XmlType(name = "typeOfSource")
@XmlEnum
public enum TypeOfSource {

    PROVIDER_USER,
    MEMBER_USER,
    PATIENT_ID_QUERY,
    ASSESMENT,
    CARE_CALCULATOR,
    PAYER_USER,
    MEDICAL_CLAIM;

    public String value() {
        return name();
    }

    public static TypeOfSource fromValue(String v) {
        return valueOf(v);
    }

}
