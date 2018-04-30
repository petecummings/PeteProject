
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfRecipientInclusion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfRecipientInclusion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TO"/>
 *     &lt;enumeration value="CC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfRecipientInclusion")
@XmlEnum
public enum TypeOfRecipientInclusion {

    TO,
    CC;

    public String value() {
        return name();
    }

    public static TypeOfRecipientInclusion fromValue(String v) {
        return valueOf(v);
    }

}
