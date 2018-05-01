
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfSelectionAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfSelectionAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_ACTION"/>
 *     &lt;enumeration value="EXPIRE"/>
 *     &lt;enumeration value="AUTOSTART"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfSelectionAction")
@XmlEnum
public enum TypeOfSelectionAction {

    NO_ACTION,
    EXPIRE,
    AUTOSTART;

    public String value() {
        return name();
    }

    public static TypeOfSelectionAction fromValue(String v) {
        return valueOf(v);
    }

}
