
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfTableForNoteTo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfTableForNoteTo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="T_USR"/>
 *     &lt;enumeration value="T_CNCT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfTableForNoteTo")
@XmlEnum
public enum TypeOfTableForNoteTo {

    T_USR,
    T_CNCT;

    public String value() {
        return name();
    }

    public static TypeOfTableForNoteTo fromValue(String v) {
        return valueOf(v);
    }

}
