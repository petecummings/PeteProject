
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfDeadline.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfDeadline">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSOLUTE_DATE"/>
 *     &lt;enumeration value="NO_DEADLINE"/>
 *     &lt;enumeration value="TIME_BLOCK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfDeadline")
@XmlEnum
public enum TypeOfDeadline {

    ABSOLUTE_DATE,
    NO_DEADLINE,
    TIME_BLOCK;

    public String value() {
        return name();
    }

    public static TypeOfDeadline fromValue(String v) {
        return valueOf(v);
    }

}
