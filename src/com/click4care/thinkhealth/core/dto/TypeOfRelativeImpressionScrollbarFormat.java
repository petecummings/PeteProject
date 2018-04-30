
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfRelativeImpressionScrollbarFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfRelativeImpressionScrollbarFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GENERAL"/>
 *     &lt;enumeration value="NUMBER"/>
 *     &lt;enumeration value="CURRENCY"/>
 *     &lt;enumeration value="PERCENTAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfRelativeImpressionScrollbarFormat")
@XmlEnum
public enum TypeOfRelativeImpressionScrollbarFormat {

    GENERAL,
    NUMBER,
    CURRENCY,
    PERCENTAGE;

    public String value() {
        return name();
    }

    public static TypeOfRelativeImpressionScrollbarFormat fromValue(String v) {
        return valueOf(v);
    }

}
