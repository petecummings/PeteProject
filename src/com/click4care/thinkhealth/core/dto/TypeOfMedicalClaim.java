
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfMedicalClaim.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfMedicalClaim">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UB92"/>
 *     &lt;enumeration value="HFCA"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfMedicalClaim")
@XmlEnum
public enum TypeOfMedicalClaim {

    @XmlEnumValue("UB92")
    UB_92("UB92"),
    HFCA("HFCA"),
    OTHER("OTHER");
    private final String value;

    TypeOfMedicalClaim(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfMedicalClaim fromValue(String v) {
        for (TypeOfMedicalClaim c: TypeOfMedicalClaim.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
