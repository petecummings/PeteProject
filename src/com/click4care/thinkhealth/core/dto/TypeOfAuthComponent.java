
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfAuthComponent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfAuthComponent">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Request_Details"/>
 *     &lt;enumeration value="IP_Discharge_Planning"/>
 *     &lt;enumeration value="OP_Care_Coordination"/>
 *     &lt;enumeration value="RX_Care_Coordination"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfAuthComponent")
@XmlEnum
public enum TypeOfAuthComponent {

    @XmlEnumValue("Request_Details")
    REQUEST_DETAILS("Request_Details"),
    @XmlEnumValue("IP_Discharge_Planning")
    IP_DISCHARGE_PLANNING("IP_Discharge_Planning"),
    @XmlEnumValue("OP_Care_Coordination")
    OP_CARE_COORDINATION("OP_Care_Coordination"),
    @XmlEnumValue("RX_Care_Coordination")
    RX_CARE_COORDINATION("RX_Care_Coordination");
    private final String value;

    TypeOfAuthComponent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfAuthComponent fromValue(String v) {
        for (TypeOfAuthComponent c: TypeOfAuthComponent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
