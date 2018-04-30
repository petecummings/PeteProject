
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfCustomFieldsMetaDataStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfCustomFieldsMetaDataStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="PLACEHOLDER"/>
 *     &lt;enumeration value="INACTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfCustomFieldsMetaDataStatus")
@XmlEnum
public enum TypeOfCustomFieldsMetaDataStatus {

    ACTIVE,
    PLACEHOLDER,
    INACTIVE;

    public String value() {
        return name();
    }

    public static TypeOfCustomFieldsMetaDataStatus fromValue(String v) {
        return valueOf(v);
    }

}
