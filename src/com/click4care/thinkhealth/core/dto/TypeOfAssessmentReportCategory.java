
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfAssessmentReportCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfAssessmentReportCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEUTRAL"/>
 *     &lt;enumeration value="RISKY"/>
 *     &lt;enumeration value="BENEFICIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfAssessmentReportCategory")
@XmlEnum
public enum TypeOfAssessmentReportCategory {

    NEUTRAL,
    RISKY,
    BENEFICIAL;

    public String value() {
        return name();
    }

    public static TypeOfAssessmentReportCategory fromValue(String v) {
        return valueOf(v);
    }

}
