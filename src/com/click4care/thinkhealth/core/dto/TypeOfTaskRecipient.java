
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfTaskRecipient.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfTaskRecipient">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAYER_PERSONAL_TASK"/>
 *     &lt;enumeration value="PROVIDER_PERSONAL_TASK"/>
 *     &lt;enumeration value="MEMBER_PERSONAL_TASK"/>
 *     &lt;enumeration value="FF_PERSONAL_TASK"/>
 *     &lt;enumeration value="PAYER_TASK"/>
 *     &lt;enumeration value="PROVIDER_TASK"/>
 *     &lt;enumeration value="MEMBER_TASK"/>
 *     &lt;enumeration value="FF_TASK"/>
 *     &lt;enumeration value="ANY_RECIPIENT_TASK"/>
 *     &lt;enumeration value="SYSTEM_TASK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfTaskRecipient")
@XmlEnum
public enum TypeOfTaskRecipient {

    PAYER_PERSONAL_TASK,
    PROVIDER_PERSONAL_TASK,
    MEMBER_PERSONAL_TASK,
    FF_PERSONAL_TASK,
    PAYER_TASK,
    PROVIDER_TASK,
    MEMBER_TASK,
    FF_TASK,
    ANY_RECIPIENT_TASK,
    SYSTEM_TASK;

    public String value() {
        return name();
    }

    public static TypeOfTaskRecipient fromValue(String v) {
        return valueOf(v);
    }

}
