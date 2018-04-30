
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfClinicalDataValueInputType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfClinicalDataValueInputType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="DATERANGE"/>
 *     &lt;enumeration value="DROPDOWNLIST"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="TIME"/>
 *     &lt;enumeration value="VALUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfClinicalDataValueInputType")
@XmlEnum
public enum TypeOfClinicalDataValueInputType {

    DATE,
    DATERANGE,
    DROPDOWNLIST,
    TEXT,
    TIME,
    VALUE;

    public String value() {
        return name();
    }

    public static TypeOfClinicalDataValueInputType fromValue(String v) {
        return valueOf(v);
    }

}
