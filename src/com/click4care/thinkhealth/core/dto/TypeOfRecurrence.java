
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfRecurrence.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfRecurrence">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAILY_RECURRENCE"/>
 *     &lt;enumeration value="WEEKLY_RECURRENCE"/>
 *     &lt;enumeration value="MONTHLY_RECURRENCE"/>
 *     &lt;enumeration value="YEARLY_RECURRENCE"/>
 *     &lt;enumeration value="HOURLY_RECURRENCE"/>
 *     &lt;enumeration value="DAILY_RECURRENCE_WITH_HOURLY"/>
 *     &lt;enumeration value="WEEKLY_RECURRENCE_WITH_HOURLY"/>
 *     &lt;enumeration value="MONTHLY_RECURRENCE_WITH_HOURLY"/>
 *     &lt;enumeration value="YEARLY_RECURRENCE_WITH_HOURLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfRecurrence")
@XmlEnum
public enum TypeOfRecurrence {

    DAILY_RECURRENCE,
    WEEKLY_RECURRENCE,
    MONTHLY_RECURRENCE,
    YEARLY_RECURRENCE,
    HOURLY_RECURRENCE,
    DAILY_RECURRENCE_WITH_HOURLY,
    WEEKLY_RECURRENCE_WITH_HOURLY,
    MONTHLY_RECURRENCE_WITH_HOURLY,
    YEARLY_RECURRENCE_WITH_HOURLY;

    public String value() {
        return name();
    }

    public static TypeOfRecurrence fromValue(String v) {
        return valueOf(v);
    }

}
