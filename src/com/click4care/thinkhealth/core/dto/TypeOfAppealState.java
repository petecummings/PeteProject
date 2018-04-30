
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfAppealState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfAppealState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN_ROUTING_BIN"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="ACCEPTED"/>
 *     &lt;enumeration value="DENIED"/>
 *     &lt;enumeration value="PARTIALLY_APPROVED"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="ABORTED"/>
 *     &lt;enumeration value="REJECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfAppealState")
@XmlEnum
public enum TypeOfAppealState {

    IN_ROUTING_BIN,
    PENDING,
    ACCEPTED,
    DENIED,
    PARTIALLY_APPROVED,
    APPROVED,
    ABORTED,
    REJECTED;

    public String value() {
        return name();
    }

    public static TypeOfAppealState fromValue(String v) {
        return valueOf(v);
    }

}
