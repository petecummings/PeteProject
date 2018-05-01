
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfClinicalData.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfClinicalData">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Member_Note"/>
 *     &lt;enumeration value="Provider_Note"/>
 *     &lt;enumeration value="MedicalService_Note"/>
 *     &lt;enumeration value="SentTask_Note"/>
 *     &lt;enumeration value="CMProject_Note"/>
 *     &lt;enumeration value="Case_Note"/>
 *     &lt;enumeration value="UMEvent_Note"/>
 *     &lt;enumeration value="MemberDiagnosis_Note"/>
 *     &lt;enumeration value="CarePlan_Note"/>
 *     &lt;enumeration value="CarePlanGoal_Note"/>
 *     &lt;enumeration value="CarePlanTodo_Note"/>
 *     &lt;enumeration value="CarePlanProblem_Note"/>
 *     &lt;enumeration value="CarePlanBarrier_Note"/>
 *     &lt;enumeration value="UMExtension_Note"/>
 *     &lt;enumeration value="MemberGroup_Note"/>
 *     &lt;enumeration value="UMDiagnosis_Note"/>
 *     &lt;enumeration value="Member_Grievance"/>
 *     &lt;enumeration value="Provider_Grievance"/>
 *     &lt;enumeration value="CMProject_Grievance"/>
 *     &lt;enumeration value="Case_Grievance"/>
 *     &lt;enumeration value="UMEvent_Grievance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfClinicalData")
@XmlEnum
public enum TypeOfClinicalData {

    @XmlEnumValue("Member_Note")
    MEMBER_NOTE("Member_Note"),
    @XmlEnumValue("Provider_Note")
    PROVIDER_NOTE("Provider_Note"),
    @XmlEnumValue("MedicalService_Note")
    MEDICAL_SERVICE_NOTE("MedicalService_Note"),
    @XmlEnumValue("SentTask_Note")
    SENT_TASK_NOTE("SentTask_Note"),
    @XmlEnumValue("CMProject_Note")
    CM_PROJECT_NOTE("CMProject_Note"),
    @XmlEnumValue("Case_Note")
    CASE_NOTE("Case_Note"),
    @XmlEnumValue("UMEvent_Note")
    UM_EVENT_NOTE("UMEvent_Note"),
    @XmlEnumValue("MemberDiagnosis_Note")
    MEMBER_DIAGNOSIS_NOTE("MemberDiagnosis_Note"),
    @XmlEnumValue("CarePlan_Note")
    CARE_PLAN_NOTE("CarePlan_Note"),
    @XmlEnumValue("CarePlanGoal_Note")
    CARE_PLAN_GOAL_NOTE("CarePlanGoal_Note"),
    @XmlEnumValue("CarePlanTodo_Note")
    CARE_PLAN_TODO_NOTE("CarePlanTodo_Note"),
    @XmlEnumValue("CarePlanProblem_Note")
    CARE_PLAN_PROBLEM_NOTE("CarePlanProblem_Note"),
    @XmlEnumValue("CarePlanBarrier_Note")
    CARE_PLAN_BARRIER_NOTE("CarePlanBarrier_Note"),
    @XmlEnumValue("UMExtension_Note")
    UM_EXTENSION_NOTE("UMExtension_Note"),
    @XmlEnumValue("MemberGroup_Note")
    MEMBER_GROUP_NOTE("MemberGroup_Note"),
    @XmlEnumValue("UMDiagnosis_Note")
    UM_DIAGNOSIS_NOTE("UMDiagnosis_Note"),
    @XmlEnumValue("Member_Grievance")
    MEMBER_GRIEVANCE("Member_Grievance"),
    @XmlEnumValue("Provider_Grievance")
    PROVIDER_GRIEVANCE("Provider_Grievance"),
    @XmlEnumValue("CMProject_Grievance")
    CM_PROJECT_GRIEVANCE("CMProject_Grievance"),
    @XmlEnumValue("Case_Grievance")
    CASE_GRIEVANCE("Case_Grievance"),
    @XmlEnumValue("UMEvent_Grievance")
    UM_EVENT_GRIEVANCE("UMEvent_Grievance");
    private final String value;

    TypeOfClinicalData(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfClinicalData fromValue(String v) {
        for (TypeOfClinicalData c: TypeOfClinicalData.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
