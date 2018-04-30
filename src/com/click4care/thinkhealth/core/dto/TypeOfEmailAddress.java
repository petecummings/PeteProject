
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfEmailAddress.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfEmailAddress">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRIMARY"/>
 *     &lt;enumeration value="SECONDARY"/>
 *     &lt;enumeration value="TERTIARY"/>
 *     &lt;enumeration value="QUATERNARY"/>
 *     &lt;enumeration value="CONFIDENTIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfEmailAddress")
@XmlEnum
public enum TypeOfEmailAddress {

    PRIMARY,
    SECONDARY,
    TERTIARY,
    QUATERNARY,
    CONFIDENTIAL;

    public String value() {
        return name();
    }

    public static TypeOfEmailAddress fromValue(String v) {
        return valueOf(v);
    }

}
