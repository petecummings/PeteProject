
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfNoteState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfNoteState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ERROR_GRIEVANCE"/>
 *     &lt;enumeration value="ERROR_RESOLVED"/>
 *     &lt;enumeration value="GRIEVANCE"/>
 *     &lt;enumeration value="RESOLVED"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="DELETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfNoteState")
@XmlEnum
public enum TypeOfNoteState {

    ERROR_GRIEVANCE,
    ERROR_RESOLVED,
    GRIEVANCE,
    RESOLVED,
    ERROR,
    DEFAULT,
    DELETED;

    public String value() {
        return name();
    }

    public static TypeOfNoteState fromValue(String v) {
        return valueOf(v);
    }

}
