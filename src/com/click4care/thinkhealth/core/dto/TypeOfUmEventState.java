
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfUmEventState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfUmEventState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLOSED"/>
 *     &lt;enumeration value="OPEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfUmEventState")
@XmlEnum
public enum TypeOfUmEventState {

    CLOSED,
    OPEN;

    public String value() {
        return name();
    }

    public static TypeOfUmEventState fromValue(String v) {
        return valueOf(v);
    }

}
