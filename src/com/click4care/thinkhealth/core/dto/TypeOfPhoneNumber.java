
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfPhoneNumber.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfPhoneNumber">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="PAGER"/>
 *     &lt;enumeration value="EMERGENCY"/>
 *     &lt;enumeration value="FAX"/>
 *     &lt;enumeration value="MAIN"/>
 *     &lt;enumeration value="CONFIDENTIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfPhoneNumber")
@XmlEnum
public enum TypeOfPhoneNumber {

    MOBILE,
    PAGER,
    EMERGENCY,
    FAX,
    MAIN,
    CONFIDENTIAL;

    public String value() {
        return name();
    }

    public static TypeOfPhoneNumber fromValue(String v) {
        return valueOf(v);
    }

}
