
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfStartDate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfStartDate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SENDER_DEFINED"/>
 *     &lt;enumeration value="ABSOLUTE_DATE"/>
 *     &lt;enumeration value="SEND_DATE"/>
 *     &lt;enumeration value="INITIATOR_DEFINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfStartDate")
@XmlEnum
public enum TypeOfStartDate {

    SENDER_DEFINED,
    ABSOLUTE_DATE,
    SEND_DATE,
    INITIATOR_DEFINED;

    public String value() {
        return name();
    }

    public static TypeOfStartDate fromValue(String v) {
        return valueOf(v);
    }

}
