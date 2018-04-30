
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfLetterStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfLetterStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SENT_FOR_TEMPLATE_CHOICE_ROUTINGBIN"/>
 *     &lt;enumeration value="SENT_FOR_TEMPLATE_CHOICE"/>
 *     &lt;enumeration value="SENT_TO_GATEKEEPER_ROUTINGBIN"/>
 *     &lt;enumeration value="SENT_TO_GATEKEEPER"/>
 *     &lt;enumeration value="RETRACTED_FROM_GATEKEEPER"/>
 *     &lt;enumeration value="GATEKEEPER_DENIED"/>
 *     &lt;enumeration value="SENDING_STARTED"/>
 *     &lt;enumeration value="GATEKEEPER_APPROVED"/>
 *     &lt;enumeration value="SENDING_COMPLETED"/>
 *     &lt;enumeration value="SENDING_FAILED"/>
 *     &lt;enumeration value="REJECTED_GATEKEEPER_APPROVAL"/>
 *     &lt;enumeration value="REJECTED_FOR_REWORK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfLetterStatus")
@XmlEnum
public enum TypeOfLetterStatus {

    SENT_FOR_TEMPLATE_CHOICE_ROUTINGBIN,
    SENT_FOR_TEMPLATE_CHOICE,
    SENT_TO_GATEKEEPER_ROUTINGBIN,
    SENT_TO_GATEKEEPER,
    RETRACTED_FROM_GATEKEEPER,
    GATEKEEPER_DENIED,
    SENDING_STARTED,
    GATEKEEPER_APPROVED,
    SENDING_COMPLETED,
    SENDING_FAILED,
    REJECTED_GATEKEEPER_APPROVAL,
    REJECTED_FOR_REWORK;

    public String value() {
        return name();
    }

    public static TypeOfLetterStatus fromValue(String v) {
        return valueOf(v);
    }

}
