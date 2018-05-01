
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfAssessmentState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfAssessmentState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WORK_IN_PROGRESS"/>
 *     &lt;enumeration value="SENT_FOR_APPROVAL"/>
 *     &lt;enumeration value="NOT_APPROVED_REJECTED"/>
 *     &lt;enumeration value="NOT_APPROVED_RETRACTED"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="DENIED"/>
 *     &lt;enumeration value="ACTIVATED"/>
 *     &lt;enumeration value="DEACTIVATED"/>
 *     &lt;enumeration value="SENT_FOR_REACTIVATION_APPROVAL"/>
 *     &lt;enumeration value="DELETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfAssessmentState")
@XmlEnum
public enum TypeOfAssessmentState {

    WORK_IN_PROGRESS,
    SENT_FOR_APPROVAL,
    NOT_APPROVED_REJECTED,
    NOT_APPROVED_RETRACTED,
    APPROVED,
    DENIED,
    ACTIVATED,
    DEACTIVATED,
    SENT_FOR_REACTIVATION_APPROVAL,
    DELETED;

    public String value() {
        return name();
    }

    public static TypeOfAssessmentState fromValue(String v) {
        return valueOf(v);
    }

}
