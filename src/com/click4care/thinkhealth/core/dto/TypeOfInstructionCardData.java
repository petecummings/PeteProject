
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfInstructionCardData.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfInstructionCardData">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MEMBER_NOTE"/>
 *     &lt;enumeration value="PROVIDER_NOTE"/>
 *     &lt;enumeration value="MEDICALSERVICE_NOTE"/>
 *     &lt;enumeration value="SENTTASK_NOTE"/>
 *     &lt;enumeration value="CMPROJECT_NOTE"/>
 *     &lt;enumeration value="CASE_NOTE"/>
 *     &lt;enumeration value="UMEVENT_NOTE"/>
 *     &lt;enumeration value="MEMBERDIAGNOSIS_NOTE"/>
 *     &lt;enumeration value="CAREPLAN_NOTE"/>
 *     &lt;enumeration value="CAREPLANGOAL_NOTE"/>
 *     &lt;enumeration value="CAREPLANTODO_NOTE"/>
 *     &lt;enumeration value="CAREPLANPROBLEM_NOTE"/>
 *     &lt;enumeration value="CAREPLANBARRIER_NOTE"/>
 *     &lt;enumeration value="UMEXTENSION_NOTE"/>
 *     &lt;enumeration value="MEMBERGROUP_NOTE"/>
 *     &lt;enumeration value="UMDIAGNOSIS_NOTE"/>
 *     &lt;enumeration value="MEMBER_GRIEVANCE"/>
 *     &lt;enumeration value="PROVIDER_GRIEVANCE"/>
 *     &lt;enumeration value="CMPROJECT_GRIEVANCE"/>
 *     &lt;enumeration value="CASE_GRIEVANCE"/>
 *     &lt;enumeration value="UMEVENT_GRIEVANCE"/>
 *     &lt;enumeration value="UMEVENT_NOTE_UMEVENTNOTESENTTASK"/>
 *     &lt;enumeration value="CASE_NOTE_CASENOTESENTTASK"/>
 *     &lt;enumeration value="MEMBER_NOTE_MEMBERNOTESENTTASK"/>
 *     &lt;enumeration value="CMPROJECT_NOTE_CMPROJECTNOTESENTTASK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfInstructionCardData")
@XmlEnum
public enum TypeOfInstructionCardData {

    MEMBER_NOTE,
    PROVIDER_NOTE,
    MEDICALSERVICE_NOTE,
    SENTTASK_NOTE,
    CMPROJECT_NOTE,
    CASE_NOTE,
    UMEVENT_NOTE,
    MEMBERDIAGNOSIS_NOTE,
    CAREPLAN_NOTE,
    CAREPLANGOAL_NOTE,
    CAREPLANTODO_NOTE,
    CAREPLANPROBLEM_NOTE,
    CAREPLANBARRIER_NOTE,
    UMEXTENSION_NOTE,
    MEMBERGROUP_NOTE,
    UMDIAGNOSIS_NOTE,
    MEMBER_GRIEVANCE,
    PROVIDER_GRIEVANCE,
    CMPROJECT_GRIEVANCE,
    CASE_GRIEVANCE,
    UMEVENT_GRIEVANCE,
    UMEVENT_NOTE_UMEVENTNOTESENTTASK,
    CASE_NOTE_CASENOTESENTTASK,
    MEMBER_NOTE_MEMBERNOTESENTTASK,
    CMPROJECT_NOTE_CMPROJECTNOTESENTTASK;

    public String value() {
        return name();
    }

    public static TypeOfInstructionCardData fromValue(String v) {
        return valueOf(v);
    }

}
