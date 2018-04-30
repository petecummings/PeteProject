
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfMultiChoiceQuestionFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfMultiChoiceQuestionFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MULTI_CHOICE_SINGLE"/>
 *     &lt;enumeration value="MULTI_CHOICE_MULTIPLE"/>
 *     &lt;enumeration value="DROP_DOWN_LIST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfMultiChoiceQuestionFormat")
@XmlEnum
public enum TypeOfMultiChoiceQuestionFormat {

    MULTI_CHOICE_SINGLE,
    MULTI_CHOICE_MULTIPLE,
    DROP_DOWN_LIST;

    public String value() {
        return name();
    }

    public static TypeOfMultiChoiceQuestionFormat fromValue(String v) {
        return valueOf(v);
    }

}
