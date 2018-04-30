
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfLetterAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfLetterAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="UM_EVENT"/>
 *     &lt;enumeration value="UM_DIAGNOSIS"/>
 *     &lt;enumeration value="UM_SERVICE_OR_EXTENSION"/>
 *     &lt;enumeration value="UM_APPEAL"/>
 *     &lt;enumeration value="CASE"/>
 *     &lt;enumeration value="CM_PROJECT"/>
 *     &lt;enumeration value="MEMBER"/>
 *     &lt;enumeration value="PROVIDER"/>
 *     &lt;enumeration value="UM_REQUEST"/>
 *     &lt;enumeration value="RECIPIENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfLetterAssociation")
@XmlEnum
public enum TypeOfLetterAssociation {

    NONE,
    UM_EVENT,
    UM_DIAGNOSIS,
    UM_SERVICE_OR_EXTENSION,
    UM_APPEAL,
    CASE,
    CM_PROJECT,
    MEMBER,
    PROVIDER,
    UM_REQUEST,
    RECIPIENT;

    public String value() {
        return name();
    }

    public static TypeOfLetterAssociation fromValue(String v) {
        return valueOf(v);
    }

}
