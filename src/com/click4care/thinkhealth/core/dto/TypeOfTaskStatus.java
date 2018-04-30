
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfTaskStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfTaskStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUPPRESSED_DUPLICATE"/>
 *     &lt;enumeration value="SUPPRESSED_CONTRAINDICATED"/>
 *     &lt;enumeration value="ABORTED"/>
 *     &lt;enumeration value="TO_BE_STARTED"/>
 *     &lt;enumeration value="EARLY_SO"/>
 *     &lt;enumeration value="COMPLETABLE_DUE_TO_BE_STARTED"/>
 *     &lt;enumeration value="COMPLETABLE_PAST_DUE"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="BLOCKED_EARLY"/>
 *     &lt;enumeration value="BLOCKED_DUE"/>
 *     &lt;enumeration value="BLOCKED_PAST_DUE"/>
 *     &lt;enumeration value="DEACTIVATED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfTaskStatus")
@XmlEnum
public enum TypeOfTaskStatus {

    SUPPRESSED_DUPLICATE,
    SUPPRESSED_CONTRAINDICATED,
    ABORTED,
    TO_BE_STARTED,
    EARLY_SO,
    COMPLETABLE_DUE_TO_BE_STARTED,
    COMPLETABLE_PAST_DUE,
    EXPIRED,
    COMPLETED,
    BLOCKED_EARLY,
    BLOCKED_DUE,
    BLOCKED_PAST_DUE,
    DEACTIVATED,
    CANCELLED;

    public String value() {
        return name();
    }

    public static TypeOfTaskStatus fromValue(String v) {
        return valueOf(v);
    }

}
