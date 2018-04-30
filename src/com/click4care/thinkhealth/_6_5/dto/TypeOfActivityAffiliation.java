
package com.click4care.thinkhealth._6_5.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfActivityAffiliation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfActivityAffiliation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MEMBER"/>
 *     &lt;enumeration value="CASE"/>
 *     &lt;enumeration value="PROGRAM"/>
 *     &lt;enumeration value="AUTHORIZATION"/>
 *     &lt;enumeration value="GROUP"/>
 *     &lt;enumeration value="CASE_REQUEST"/>
 *     &lt;enumeration value="PROGRAM_REQUEST"/>
 *     &lt;enumeration value="AUTHORIZATION_REQUEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfActivityAffiliation")
@XmlEnum
public enum TypeOfActivityAffiliation {

    MEMBER,
    CASE,
    PROGRAM,
    AUTHORIZATION,
    GROUP,
    CASE_REQUEST,
    PROGRAM_REQUEST,
    AUTHORIZATION_REQUEST;

    public String value() {
        return name();
    }

    public static TypeOfActivityAffiliation fromValue(String v) {
        return valueOf(v);
    }

}
