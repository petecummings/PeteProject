
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfDeadlineAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfDeadlineAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_ACTION"/>
 *     &lt;enumeration value="EXPIRE"/>
 *     &lt;enumeration value="AUTO_COMPLETE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfDeadlineAction")
@XmlEnum
public enum TypeOfDeadlineAction {

    NO_ACTION,
    EXPIRE,
    AUTO_COMPLETE;

    public String value() {
        return name();
    }

    public static TypeOfDeadlineAction fromValue(String v) {
        return valueOf(v);
    }

}
