
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfVirtualQueueState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfVirtualQueueState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATED"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="INTERNAL"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfVirtualQueueState")
@XmlEnum
public enum TypeOfVirtualQueueState {

    CREATED,
    DELETED,
    INTERNAL,
    ACTIVE,
    INACTIVE;

    public String value() {
        return name();
    }

    public static TypeOfVirtualQueueState fromValue(String v) {
        return valueOf(v);
    }

}
