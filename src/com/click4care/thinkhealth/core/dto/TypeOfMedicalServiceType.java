
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfMedicalServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfMedicalServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INITIAL_DETERMINATION"/>
 *     &lt;enumeration value="DISCHARGE_PLAN"/>
 *     &lt;enumeration value="CONCURRENT_REVIEW"/>
 *     &lt;enumeration value="SERVICE_PROCEDURE"/>
 *     &lt;enumeration value="UNDEFINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfMedicalServiceType")
@XmlEnum
public enum TypeOfMedicalServiceType {

    INITIAL_DETERMINATION,
    DISCHARGE_PLAN,
    CONCURRENT_REVIEW,
    SERVICE_PROCEDURE,
    UNDEFINED;

    public String value() {
        return name();
    }

    public static TypeOfMedicalServiceType fromValue(String v) {
        return valueOf(v);
    }

}
