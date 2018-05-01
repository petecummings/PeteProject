
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfAppealRouting.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfAppealRouting">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ROUTING_BIN"/>
 *     &lt;enumeration value="ANY_APPROVER"/>
 *     &lt;enumeration value="SELF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfAppealRouting")
@XmlEnum
public enum TypeOfAppealRouting {

    ROUTING_BIN,
    ANY_APPROVER,
    SELF;

    public String value() {
        return name();
    }

    public static TypeOfAppealRouting fromValue(String v) {
        return valueOf(v);
    }

}
