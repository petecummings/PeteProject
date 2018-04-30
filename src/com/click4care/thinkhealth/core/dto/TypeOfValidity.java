
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfValidity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfValidity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="CONFIGURED_UNMODIFIED"/>
 *     &lt;enumeration value="CONFIGURED_MODIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfValidity")
@XmlEnum
public enum TypeOfValidity {

    APPROVED,
    CONFIGURED_UNMODIFIED,
    CONFIGURED_MODIFIED;

    public String value() {
        return name();
    }

    public static TypeOfValidity fromValue(String v) {
        return valueOf(v);
    }

}
