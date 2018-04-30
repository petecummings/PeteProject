
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfPhi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfPhi">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PERMISSION"/>
 *     &lt;enumeration value="RESTRICTION"/>
 *     &lt;enumeration value="AUTHORIZATION"/>
 *     &lt;enumeration value="CONFIDENTIAL_COMMUNICATION"/>
 *     &lt;enumeration value="LEGAL_REPRESENTATION"/>
 *     &lt;enumeration value="PERSONAL_REPRESENTATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfPhi")
@XmlEnum
public enum TypeOfPhi {

    PERMISSION,
    RESTRICTION,
    AUTHORIZATION,
    CONFIDENTIAL_COMMUNICATION,
    LEGAL_REPRESENTATION,
    PERSONAL_REPRESENTATION;

    public String value() {
        return name();
    }

    public static TypeOfPhi fromValue(String v) {
        return valueOf(v);
    }

}
