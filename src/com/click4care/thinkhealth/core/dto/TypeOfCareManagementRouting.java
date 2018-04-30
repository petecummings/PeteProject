
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfCareManagementRouting.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfCareManagementRouting">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BIN"/>
 *     &lt;enumeration value="MANUAL"/>
 *     &lt;enumeration value="SELF"/>
 *     &lt;enumeration value="OWNER_OF_UNATTACHED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfCareManagementRouting")
@XmlEnum
public enum TypeOfCareManagementRouting {

    BIN,
    MANUAL,
    SELF,
    OWNER_OF_UNATTACHED;

    public String value() {
        return name();
    }

    public static TypeOfCareManagementRouting fromValue(String v) {
        return valueOf(v);
    }

}
