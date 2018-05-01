
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfCareManagementObjectState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfCareManagementObjectState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CASE_REQUEST_ABORTED"/>
 *     &lt;enumeration value="CASE_REQUEST_IN_ROUTING_BIN"/>
 *     &lt;enumeration value="CASE_REQUEST_PENDING"/>
 *     &lt;enumeration value="CASE_REQUEST_RETRACTED"/>
 *     &lt;enumeration value="CASE_REQUEST_REJECTED"/>
 *     &lt;enumeration value="CASE_REQUEST_CLOSED"/>
 *     &lt;enumeration value="CASE_REQUEST_DENIED"/>
 *     &lt;enumeration value="CASE_REQUEST_EXPIRED"/>
 *     &lt;enumeration value="CASE_OPEN"/>
 *     &lt;enumeration value="CASE_CLOSED"/>
 *     &lt;enumeration value="CASE_IN_ROUTING_BIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfCareManagementObjectState")
@XmlEnum
public enum TypeOfCareManagementObjectState {

    CASE_REQUEST_ABORTED,
    CASE_REQUEST_IN_ROUTING_BIN,
    CASE_REQUEST_PENDING,
    CASE_REQUEST_RETRACTED,
    CASE_REQUEST_REJECTED,
    CASE_REQUEST_CLOSED,
    CASE_REQUEST_DENIED,
    CASE_REQUEST_EXPIRED,
    CASE_OPEN,
    CASE_CLOSED,
    CASE_IN_ROUTING_BIN;

    public String value() {
        return name();
    }

    public static TypeOfCareManagementObjectState fromValue(String v) {
        return valueOf(v);
    }

}
