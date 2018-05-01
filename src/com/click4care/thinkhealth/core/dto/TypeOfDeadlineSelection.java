
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfDeadlineSelection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfDeadlineSelection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DURATION"/>
 *     &lt;enumeration value="DEADLINE_TIME_BLOCK"/>
 *     &lt;enumeration value="ABSOLUTE_DATE"/>
 *     &lt;enumeration value="BEFORE_NEXT_ITERATION"/>
 *     &lt;enumeration value="NO_DEADLINE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfDeadlineSelection")
@XmlEnum
public enum TypeOfDeadlineSelection {

    DURATION,
    DEADLINE_TIME_BLOCK,
    ABSOLUTE_DATE,
    BEFORE_NEXT_ITERATION,
    NO_DEADLINE;

    public String value() {
        return name();
    }

    public static TypeOfDeadlineSelection fromValue(String v) {
        return valueOf(v);
    }

}
