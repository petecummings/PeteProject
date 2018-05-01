
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfDdlItemState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfDdlItemState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfDdlItemState")
@XmlEnum
public enum TypeOfDdlItemState {

    DELETED,
    ACTIVE,
    INACTIVE;

    public String value() {
        return name();
    }

    public static TypeOfDdlItemState fromValue(String v) {
        return valueOf(v);
    }

}
