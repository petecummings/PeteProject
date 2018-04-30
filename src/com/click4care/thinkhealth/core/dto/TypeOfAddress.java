
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfAddress.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfAddress">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOME"/>
 *     &lt;enumeration value="BUSINESS"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="CORRESPONDENCE"/>
 *     &lt;enumeration value="CONFIDENTIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfAddress")
@XmlEnum
public enum TypeOfAddress {

    HOME,
    BUSINESS,
    OTHER,
    CORRESPONDENCE,
    CONFIDENTIAL;

    public String value() {
        return name();
    }

    public static TypeOfAddress fromValue(String v) {
        return valueOf(v);
    }

}
