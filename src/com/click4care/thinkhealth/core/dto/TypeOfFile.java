
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfFile.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfFile">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="JPEG"/>
 *     &lt;enumeration value="GIF"/>
 *     &lt;enumeration value="CSS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfFile")
@XmlEnum
public enum TypeOfFile {

    OTHER,
    HTML,
    JPEG,
    GIF,
    CSS;

    public String value() {
        return name();
    }

    public static TypeOfFile fromValue(String v) {
        return valueOf(v);
    }

}
