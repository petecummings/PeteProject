
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfCustomFieldDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfCustomFieldDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="INTEGER"/>
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="REFERENCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfCustomFieldDataType")
@XmlEnum
public enum TypeOfCustomFieldDataType {

    DATE,
    INTEGER,
    STRING,
    REFERENCE;

    public String value() {
        return name();
    }

    public static TypeOfCustomFieldDataType fromValue(String v) {
        return valueOf(v);
    }

}
