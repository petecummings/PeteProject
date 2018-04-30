
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfAlertRecipient.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfAlertRecipient">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RECIPIENT"/>
 *     &lt;enumeration value="SUPERVISOR"/>
 *     &lt;enumeration value="BOTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfAlertRecipient")
@XmlEnum
public enum TypeOfAlertRecipient {

    RECIPIENT,
    SUPERVISOR,
    BOTH;

    public String value() {
        return name();
    }

    public static TypeOfAlertRecipient fromValue(String v) {
        return valueOf(v);
    }

}
