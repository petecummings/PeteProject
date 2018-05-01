
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfEducationalContentState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfEducationalContentState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATED"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="INTERNAL"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="SENT_FOR_APPROVAL"/>
 *     &lt;enumeration value="NOT_APPROVED_REJECTED"/>
 *     &lt;enumeration value="NOT_APPROVED_RETRACTED"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="DENIED"/>
 *     &lt;enumeration value="SENT_FOR_REACTIVATION_APPROVAL"/>
 *     &lt;enumeration value="UPLOADED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfEducationalContentState")
@XmlEnum
public enum TypeOfEducationalContentState {

    CREATED,
    DELETED,
    INTERNAL,
    ACTIVE,
    INACTIVE,
    SENT_FOR_APPROVAL,
    NOT_APPROVED_REJECTED,
    NOT_APPROVED_RETRACTED,
    APPROVED,
    DENIED,
    SENT_FOR_REACTIVATION_APPROVAL,
    UPLOADED;

    public String value() {
        return name();
    }

    public static TypeOfEducationalContentState fromValue(String v) {
        return valueOf(v);
    }

}
