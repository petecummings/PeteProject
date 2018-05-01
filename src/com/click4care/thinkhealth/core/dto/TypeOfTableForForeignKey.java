
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfTableForForeignKey.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfTableForForeignKey">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="T_APBL"/>
 *     &lt;enumeration value="T_APL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfTableForForeignKey")
@XmlEnum
public enum TypeOfTableForForeignKey {

    T_APBL,
    T_APL;

    public String value() {
        return name();
    }

    public static TypeOfTableForForeignKey fromValue(String v) {
        return valueOf(v);
    }

}
