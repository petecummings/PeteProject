
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfUmRequest.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfUmRequest">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REFERRAL"/>
 *     &lt;enumeration value="INPATIENT_AUTHORIZATION"/>
 *     &lt;enumeration value="OUTPATIENT_AUTHORIZATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfUmRequest")
@XmlEnum
public enum TypeOfUmRequest {

    REFERRAL,
    INPATIENT_AUTHORIZATION,
    OUTPATIENT_AUTHORIZATION;

    public String value() {
        return name();
    }

    public static TypeOfUmRequest fromValue(String v) {
        return valueOf(v);
    }

}
