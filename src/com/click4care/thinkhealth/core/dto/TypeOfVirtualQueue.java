
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfVirtualQueue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfVirtualQueue">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FAX_QUEUE"/>
 *     &lt;enumeration value="PRINT_QUEUE"/>
 *     &lt;enumeration value="EMAIL_QUEUE"/>
 *     &lt;enumeration value="EFAX_QUEUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfVirtualQueue")
@XmlEnum
public enum TypeOfVirtualQueue {

    FAX_QUEUE,
    PRINT_QUEUE,
    EMAIL_QUEUE,
    EFAX_QUEUE;

    public String value() {
        return name();
    }

    public static TypeOfVirtualQueue fromValue(String v) {
        return valueOf(v);
    }

}
