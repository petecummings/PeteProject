
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfAssessmentResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfAssessmentResponse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FORMATTED_VALUE"/>
 *     &lt;enumeration value="FORMATTED_TEXT"/>
 *     &lt;enumeration value="MULTIPLE_CHOICE_SINGLE_ANSWER"/>
 *     &lt;enumeration value="MULTIPLE_CHOICE_MULTI_ANSWER"/>
 *     &lt;enumeration value="RELATIVE_IMPRESSION_SCROLLBAR"/>
 *     &lt;enumeration value="OPEN_VALUE"/>
 *     &lt;enumeration value="OPEN_TEXT"/>
 *     &lt;enumeration value="FORM"/>
 *     &lt;enumeration value="CLINICALDATA"/>
 *     &lt;enumeration value="SECTION_START"/>
 *     &lt;enumeration value="SECTION_END"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfAssessmentResponse")
@XmlEnum
public enum TypeOfAssessmentResponse {

    FORMATTED_VALUE,
    FORMATTED_TEXT,
    MULTIPLE_CHOICE_SINGLE_ANSWER,
    MULTIPLE_CHOICE_MULTI_ANSWER,
    RELATIVE_IMPRESSION_SCROLLBAR,
    OPEN_VALUE,
    OPEN_TEXT,
    FORM,
    CLINICALDATA,
    SECTION_START,
    SECTION_END;

    public String value() {
        return name();
    }

    public static TypeOfAssessmentResponse fromValue(String v) {
        return valueOf(v);
    }

}
