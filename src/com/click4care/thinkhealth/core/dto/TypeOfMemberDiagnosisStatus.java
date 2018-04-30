
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfMemberDiagnosisStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfMemberDiagnosisStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATED"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="OPEN"/>
 *     &lt;enumeration value="CLOSED"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="UNSUBMITTED"/>
 *     &lt;enumeration value="SNAPSHOT"/>
 *     &lt;enumeration value="ABORTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfMemberDiagnosisStatus")
@XmlEnum
public enum TypeOfMemberDiagnosisStatus {

    CREATED,
    DELETED,
    OPEN,
    CLOSED,
    ERROR,
    UNSUBMITTED,
    SNAPSHOT,
    ABORTED;

    public String value() {
        return name();
    }

    public static TypeOfMemberDiagnosisStatus fromValue(String v) {
        return valueOf(v);
    }

}
