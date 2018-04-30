
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfUmTemplateState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfUmTemplateState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATED"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="INTERNAL"/>
 *     &lt;enumeration value="LOCKED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfUmTemplateState")
@XmlEnum
public enum TypeOfUmTemplateState {

    CREATED,
    DELETED,
    INTERNAL,
    LOCKED;

    public String value() {
        return name();
    }

    public static TypeOfUmTemplateState fromValue(String v) {
        return valueOf(v);
    }

}
