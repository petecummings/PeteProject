
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfUserState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfUserState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="WIP"/>
 *     &lt;enumeration value="ACTIVATED"/>
 *     &lt;enumeration value="DEACTIVATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfUserState")
@XmlEnum
public enum TypeOfUserState {

    DELETED,
    WIP,
    ACTIVATED,
    DEACTIVATED;

    public String value() {
        return name();
    }

    public static TypeOfUserState fromValue(String v) {
        return valueOf(v);
    }

}
