
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfStartNoLaterThanAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfStartNoLaterThanAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXPIRE"/>
 *     &lt;enumeration value="NO_ACTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfStartNoLaterThanAction")
@XmlEnum
public enum TypeOfStartNoLaterThanAction {

    EXPIRE,
    NO_ACTION;

    public String value() {
        return name();
    }

    public static TypeOfStartNoLaterThanAction fromValue(String v) {
        return valueOf(v);
    }

}
