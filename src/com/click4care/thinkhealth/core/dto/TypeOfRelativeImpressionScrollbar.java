
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfRelativeImpressionScrollbar.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfRelativeImpressionScrollbar">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="VALUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfRelativeImpressionScrollbar")
@XmlEnum
public enum TypeOfRelativeImpressionScrollbar {

    TEXT,
    VALUE;

    public String value() {
        return name();
    }

    public static TypeOfRelativeImpressionScrollbar fromValue(String v) {
        return valueOf(v);
    }

}
