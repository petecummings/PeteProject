
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfPharmacyAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfPharmacyAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="CHANGED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfPharmacyAction")
@XmlEnum
public enum TypeOfPharmacyAction {

    NEW,
    CHANGED;

    public String value() {
        return name();
    }

    public static TypeOfPharmacyAction fromValue(String v) {
        return valueOf(v);
    }

}
