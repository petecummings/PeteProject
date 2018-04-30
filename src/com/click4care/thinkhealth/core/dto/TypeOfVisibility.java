
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfVisibility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfVisibility">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SHARED"/>
 *     &lt;enumeration value="PERSONAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfVisibility")
@XmlEnum
public enum TypeOfVisibility {

    SHARED,
    PERSONAL;

    public String value() {
        return name();
    }

    public static TypeOfVisibility fromValue(String v) {
        return valueOf(v);
    }

}
