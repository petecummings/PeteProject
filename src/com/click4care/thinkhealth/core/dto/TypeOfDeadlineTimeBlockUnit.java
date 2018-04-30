
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfDeadlineTimeBlockUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfDeadlineTimeBlockUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MINUTES"/>
 *     &lt;enumeration value="HOURS"/>
 *     &lt;enumeration value="DAYS"/>
 *     &lt;enumeration value="WEEKS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfDeadlineTimeBlockUnit")
@XmlEnum
public enum TypeOfDeadlineTimeBlockUnit {

    MINUTES,
    HOURS,
    DAYS,
    WEEKS;

    public String value() {
        return name();
    }

    public static TypeOfDeadlineTimeBlockUnit fromValue(String v) {
        return valueOf(v);
    }

}
