
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfUmRouting.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfUmRouting">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ROUTING_BIN"/>
 *     &lt;enumeration value="ANY_APPROVER"/>
 *     &lt;enumeration value="AUTO_UM"/>
 *     &lt;enumeration value="PARENT_PROJECT"/>
 *     &lt;enumeration value="PEER_UM_EVENT"/>
 *     &lt;enumeration value="RECENTLY_CLOSED_RECORDS"/>
 *     &lt;enumeration value="SELF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfUmRouting")
@XmlEnum
public enum TypeOfUmRouting {

    ROUTING_BIN,
    ANY_APPROVER,
    AUTO_UM,
    PARENT_PROJECT,
    PEER_UM_EVENT,
    RECENTLY_CLOSED_RECORDS,
    SELF;

    public String value() {
        return name();
    }

    public static TypeOfUmRouting fromValue(String v) {
        return valueOf(v);
    }

}
