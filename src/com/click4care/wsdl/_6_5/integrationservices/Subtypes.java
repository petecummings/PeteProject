
package com.click4care.wsdl._6_5.integrationservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _subtypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="_subtypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AssessmentType"/>
 *     &lt;enumeration value="BiometricsType"/>
 *     &lt;enumeration value="BoilerPlateType"/>
 *     &lt;enumeration value="CareBeanType"/>
 *     &lt;enumeration value="CareCalculatorType"/>
 *     &lt;enumeration value="CaseNoteType"/>
 *     &lt;enumeration value="CarePlanCategoryType"/>
 *     &lt;enumeration value="CareplanNoteType"/>
 *     &lt;enumeration value="ClinicalDataType"/>
 *     &lt;enumeration value="CmProjectNoteType"/>
 *     &lt;enumeration value="CmType"/>
 *     &lt;enumeration value="CustomDiagnosisType"/>
 *     &lt;enumeration value="EducationalContentType"/>
 *     &lt;enumeration value="EnvelopeType"/>
 *     &lt;enumeration value="FaxCoverType"/>
 *     &lt;enumeration value="ImageDocumentType"/>
 *     &lt;enumeration value="LabelType"/>
 *     &lt;enumeration value="LetterHeadType"/>
 *     &lt;enumeration value="LetterType"/>
 *     &lt;enumeration value="MemberGroupType"/>
 *     &lt;enumeration value="MemberNoteType"/>
 *     &lt;enumeration value="SentTaskNoteType"/>
 *     &lt;enumeration value="NoticeType"/>
 *     &lt;enumeration value="ProviderNoteType"/>
 *     &lt;enumeration value="QueryType"/>
 *     &lt;enumeration value="QuestionType"/>
 *     &lt;enumeration value="ReportTemplateType"/>
 *     &lt;enumeration value="TaskIconType"/>
 *     &lt;enumeration value="TaskType"/>
 *     &lt;enumeration value="UmEventNoteType"/>
 *     &lt;enumeration value="UmInPatientAuthorizationType"/>
 *     &lt;enumeration value="UmOutPatientAuthorizationType"/>
 *     &lt;enumeration value="UmReferralType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "_subtypes")
@XmlEnum
public enum Subtypes {

    @XmlEnumValue("AssessmentType")
    ASSESSMENT_TYPE("AssessmentType"),
    @XmlEnumValue("BiometricsType")
    BIOMETRICS_TYPE("BiometricsType"),
    @XmlEnumValue("BoilerPlateType")
    BOILER_PLATE_TYPE("BoilerPlateType"),
    @XmlEnumValue("CareBeanType")
    CARE_BEAN_TYPE("CareBeanType"),
    @XmlEnumValue("CareCalculatorType")
    CARE_CALCULATOR_TYPE("CareCalculatorType"),
    @XmlEnumValue("CaseNoteType")
    CASE_NOTE_TYPE("CaseNoteType"),
    @XmlEnumValue("CarePlanCategoryType")
    CARE_PLAN_CATEGORY_TYPE("CarePlanCategoryType"),
    @XmlEnumValue("CareplanNoteType")
    CAREPLAN_NOTE_TYPE("CareplanNoteType"),
    @XmlEnumValue("ClinicalDataType")
    CLINICAL_DATA_TYPE("ClinicalDataType"),
    @XmlEnumValue("CmProjectNoteType")
    CM_PROJECT_NOTE_TYPE("CmProjectNoteType"),
    @XmlEnumValue("CmType")
    CM_TYPE("CmType"),
    @XmlEnumValue("CustomDiagnosisType")
    CUSTOM_DIAGNOSIS_TYPE("CustomDiagnosisType"),
    @XmlEnumValue("EducationalContentType")
    EDUCATIONAL_CONTENT_TYPE("EducationalContentType"),
    @XmlEnumValue("EnvelopeType")
    ENVELOPE_TYPE("EnvelopeType"),
    @XmlEnumValue("FaxCoverType")
    FAX_COVER_TYPE("FaxCoverType"),
    @XmlEnumValue("ImageDocumentType")
    IMAGE_DOCUMENT_TYPE("ImageDocumentType"),
    @XmlEnumValue("LabelType")
    LABEL_TYPE("LabelType"),
    @XmlEnumValue("LetterHeadType")
    LETTER_HEAD_TYPE("LetterHeadType"),
    @XmlEnumValue("LetterType")
    LETTER_TYPE("LetterType"),
    @XmlEnumValue("MemberGroupType")
    MEMBER_GROUP_TYPE("MemberGroupType"),
    @XmlEnumValue("MemberNoteType")
    MEMBER_NOTE_TYPE("MemberNoteType"),
    @XmlEnumValue("SentTaskNoteType")
    SENT_TASK_NOTE_TYPE("SentTaskNoteType"),
    @XmlEnumValue("NoticeType")
    NOTICE_TYPE("NoticeType"),
    @XmlEnumValue("ProviderNoteType")
    PROVIDER_NOTE_TYPE("ProviderNoteType"),
    @XmlEnumValue("QueryType")
    QUERY_TYPE("QueryType"),
    @XmlEnumValue("QuestionType")
    QUESTION_TYPE("QuestionType"),
    @XmlEnumValue("ReportTemplateType")
    REPORT_TEMPLATE_TYPE("ReportTemplateType"),
    @XmlEnumValue("TaskIconType")
    TASK_ICON_TYPE("TaskIconType"),
    @XmlEnumValue("TaskType")
    TASK_TYPE("TaskType"),
    @XmlEnumValue("UmEventNoteType")
    UM_EVENT_NOTE_TYPE("UmEventNoteType"),
    @XmlEnumValue("UmInPatientAuthorizationType")
    UM_IN_PATIENT_AUTHORIZATION_TYPE("UmInPatientAuthorizationType"),
    @XmlEnumValue("UmOutPatientAuthorizationType")
    UM_OUT_PATIENT_AUTHORIZATION_TYPE("UmOutPatientAuthorizationType"),
    @XmlEnumValue("UmReferralType")
    UM_REFERRAL_TYPE("UmReferralType");
    private final String value;

    Subtypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Subtypes fromValue(String v) {
        for (Subtypes c: Subtypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
