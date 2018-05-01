
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfSliderAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfSliderAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTINUOUS"/>
 *     &lt;enumeration value="STEPPED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfSliderAction")
@XmlEnum
public enum TypeOfSliderAction {

    CONTINUOUS,
    STEPPED;

    public String value() {
        return name();
    }

    public static TypeOfSliderAction fromValue(String v) {
        return valueOf(v);
    }

}
