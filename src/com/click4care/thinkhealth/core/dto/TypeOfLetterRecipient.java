
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfLetterRecipient.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfLetterRecipient">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MEMBER"/>
 *     &lt;enumeration value="MEMBER_SUBSCRIBER"/>
 *     &lt;enumeration value="MEMBER_HEALTHCARE_PROXIES"/>
 *     &lt;enumeration value="MEMBER_PCP"/>
 *     &lt;enumeration value="MEMBER_INS_PURCHASER_GROUP"/>
 *     &lt;enumeration value="REQUESTING_PROVIDER"/>
 *     &lt;enumeration value="PERFORMING_PROVIDER"/>
 *     &lt;enumeration value="CASE_PROVIDER"/>
 *     &lt;enumeration value="PROVIDER"/>
 *     &lt;enumeration value="PAYER"/>
 *     &lt;enumeration value="FRIENDS_AND_FAMILY"/>
 *     &lt;enumeration value="SERVICE_PROVIDER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfLetterRecipient")
@XmlEnum
public enum TypeOfLetterRecipient {

    MEMBER,
    MEMBER_SUBSCRIBER,
    MEMBER_HEALTHCARE_PROXIES,
    MEMBER_PCP,
    MEMBER_INS_PURCHASER_GROUP,
    REQUESTING_PROVIDER,
    PERFORMING_PROVIDER,
    CASE_PROVIDER,
    PROVIDER,
    PAYER,
    FRIENDS_AND_FAMILY,
    SERVICE_PROVIDER;

    public String value() {
        return name();
    }

    public static TypeOfLetterRecipient fromValue(String v) {
        return valueOf(v);
    }

}
