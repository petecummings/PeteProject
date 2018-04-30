
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfActivityState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfActivityState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="PROCESSED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfActivityState")
@XmlEnum
public enum TypeOfActivityState {

    ACTIVE,
    ERROR,
    PROCESSED;

    public String value() {
        return name();
    }

    public static TypeOfActivityState fromValue(String v) {
        return valueOf(v);
    }

}
