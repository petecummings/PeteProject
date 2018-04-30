
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfNegative.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfNegative">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SIGNED"/>
 *     &lt;enumeration value="UNSIGNED_RED"/>
 *     &lt;enumeration value="PARENTHESES"/>
 *     &lt;enumeration value="PARENTHESES_RED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfNegative")
@XmlEnum
public enum TypeOfNegative {

    SIGNED,
    UNSIGNED_RED,
    PARENTHESES,
    PARENTHESES_RED;

    public String value() {
        return name();
    }

    public static TypeOfNegative fromValue(String v) {
        return valueOf(v);
    }

}
