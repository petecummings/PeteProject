
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfClinicalDataEntryContext.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfClinicalDataEntryContext">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UMEventValue"/>
 *     &lt;enumeration value="UMEventRequestValue"/>
 *     &lt;enumeration value="CaseValue"/>
 *     &lt;enumeration value="CaseRequestValue"/>
 *     &lt;enumeration value="CMProjectValue"/>
 *     &lt;enumeration value="CMProjectRequestValue"/>
 *     &lt;enumeration value="MemberUserValue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfClinicalDataEntryContext")
@XmlEnum
public enum TypeOfClinicalDataEntryContext {

    @XmlEnumValue("UMEventValue")
    UM_EVENT_VALUE("UMEventValue"),
    @XmlEnumValue("UMEventRequestValue")
    UM_EVENT_REQUEST_VALUE("UMEventRequestValue"),
    @XmlEnumValue("CaseValue")
    CASE_VALUE("CaseValue"),
    @XmlEnumValue("CaseRequestValue")
    CASE_REQUEST_VALUE("CaseRequestValue"),
    @XmlEnumValue("CMProjectValue")
    CM_PROJECT_VALUE("CMProjectValue"),
    @XmlEnumValue("CMProjectRequestValue")
    CM_PROJECT_REQUEST_VALUE("CMProjectRequestValue"),
    @XmlEnumValue("MemberUserValue")
    MEMBER_USER_VALUE("MemberUserValue");
    private final String value;

    TypeOfClinicalDataEntryContext(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfClinicalDataEntryContext fromValue(String v) {
        for (TypeOfClinicalDataEntryContext c: TypeOfClinicalDataEntryContext.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
