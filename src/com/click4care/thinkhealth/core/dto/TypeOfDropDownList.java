
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfDropDownList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfDropDownList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SYSTEM_DDL"/>
 *     &lt;enumeration value="USER_DDL"/>
 *     &lt;enumeration value="HDDL"/>
 *     &lt;enumeration value="CUSTOM_FIELD_DDL"/>
 *     &lt;enumeration value="CONTENT_TYPE_SUBTYPE"/>
 *     &lt;enumeration value="LETTER_TYPE_SUBTYPE"/>
 *     &lt;enumeration value="CARE_CALCULATOR_TYPE_SUBTYPE"/>
 *     &lt;enumeration value="ASSESSMENT_TYPE_SUBTYPE"/>
 *     &lt;enumeration value="TASK_TYPE_SUBTYPE"/>
 *     &lt;enumeration value="PROJECT_TYPE_SUBTYPE"/>
 *     &lt;enumeration value="SIMPLE_TYPE_SUBTYPE"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfDropDownList")
@XmlEnum
public enum TypeOfDropDownList {

    SYSTEM_DDL,
    USER_DDL,
    HDDL,
    CUSTOM_FIELD_DDL,
    CONTENT_TYPE_SUBTYPE,
    LETTER_TYPE_SUBTYPE,
    CARE_CALCULATOR_TYPE_SUBTYPE,
    ASSESSMENT_TYPE_SUBTYPE,
    TASK_TYPE_SUBTYPE,
    PROJECT_TYPE_SUBTYPE,
    SIMPLE_TYPE_SUBTYPE,
    OTHER;

    public String value() {
        return name();
    }

    public static TypeOfDropDownList fromValue(String v) {
        return valueOf(v);
    }

}
