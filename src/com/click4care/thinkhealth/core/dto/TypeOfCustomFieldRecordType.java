
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfCustomFieldRecordType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfCustomFieldRecordType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAYER_USER"/>
 *     &lt;enumeration value="MEMBER_USER"/>
 *     &lt;enumeration value="FAMILY_FRIEND_USER"/>
 *     &lt;enumeration value="PROVIDER_USER"/>
 *     &lt;enumeration value="CARE_BEAN"/>
 *     &lt;enumeration value="TASK"/>
 *     &lt;enumeration value="ASSESSMENT"/>
 *     &lt;enumeration value="LETTER_TEMPLATE"/>
 *     &lt;enumeration value="MEDICAL_CLAIM"/>
 *     &lt;enumeration value="BENEFIT_RECORD"/>
 *     &lt;enumeration value="CASE"/>
 *     &lt;enumeration value="CASE_REQUEST"/>
 *     &lt;enumeration value="CM_PROJECT"/>
 *     &lt;enumeration value="CM_PROJECT_REQUEST"/>
 *     &lt;enumeration value="UM_EVENT"/>
 *     &lt;enumeration value="UM_EVENT_REQUEST"/>
 *     &lt;enumeration value="MEMBER_MEDICAL_CODE"/>
 *     &lt;enumeration value="MEMBER_DIAGNOSIS"/>
 *     &lt;enumeration value="SAVINGS_RECORD"/>
 *     &lt;enumeration value="NOTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfCustomFieldRecordType")
@XmlEnum
public enum TypeOfCustomFieldRecordType {

    PAYER_USER,
    MEMBER_USER,
    FAMILY_FRIEND_USER,
    PROVIDER_USER,
    CARE_BEAN,
    TASK,
    ASSESSMENT,
    LETTER_TEMPLATE,
    MEDICAL_CLAIM,
    BENEFIT_RECORD,
    CASE,
    CASE_REQUEST,
    CM_PROJECT,
    CM_PROJECT_REQUEST,
    UM_EVENT,
    UM_EVENT_REQUEST,
    MEMBER_MEDICAL_CODE,
    MEMBER_DIAGNOSIS,
    SAVINGS_RECORD,
    NOTE;

    public String value() {
        return name();
    }

    public static TypeOfCustomFieldRecordType fromValue(String v) {
        return valueOf(v);
    }

}
