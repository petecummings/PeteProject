
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfAppealableState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfAppealableState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_APPEALABLE_FULLY_APPROVED"/>
 *     &lt;enumeration value="NOT_APPEALABLE_PARTIALLY_APPROVED"/>
 *     &lt;enumeration value="APPEALABLE_PARTIALLY_APPROVED"/>
 *     &lt;enumeration value="APPEALABLE_DENIED"/>
 *     &lt;enumeration value="DENIED_UNAPPEALABLE"/>
 *     &lt;enumeration value="APPEAL_PENDING_DENIED"/>
 *     &lt;enumeration value="APPEAL_PENDING_PARTIALLY_APPROVED"/>
 *     &lt;enumeration value="EXTENDED_FULLY_APPROVED"/>
 *     &lt;enumeration value="EXTENDED_PARTIALLY_APPROVED"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="UNSUBMITTED"/>
 *     &lt;enumeration value="DETERMINATION_NEEDED"/>
 *     &lt;enumeration value="SNAPSHOT"/>
 *     &lt;enumeration value="ABORTED"/>
 *     &lt;enumeration value="EXTENDED_DENIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfAppealableState")
@XmlEnum
public enum TypeOfAppealableState {

    NOT_APPEALABLE_FULLY_APPROVED,
    NOT_APPEALABLE_PARTIALLY_APPROVED,
    APPEALABLE_PARTIALLY_APPROVED,
    APPEALABLE_DENIED,
    DENIED_UNAPPEALABLE,
    APPEAL_PENDING_DENIED,
    APPEAL_PENDING_PARTIALLY_APPROVED,
    EXTENDED_FULLY_APPROVED,
    EXTENDED_PARTIALLY_APPROVED,
    ERROR,
    UNSUBMITTED,
    DETERMINATION_NEEDED,
    SNAPSHOT,
    ABORTED,
    EXTENDED_DENIED;

    public String value() {
        return name();
    }

    public static TypeOfAppealableState fromValue(String v) {
        return valueOf(v);
    }

}
