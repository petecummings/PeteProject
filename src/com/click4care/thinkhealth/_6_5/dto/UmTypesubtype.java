
package com.click4care.thinkhealth._6_5.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for um_typesubtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="um_typesubtype">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}typesubtype">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "um_typesubtype")
@XmlSeeAlso({
    UmInpatientAuthorizationTypesubtype.class,
    UmOutpatientAuthorizationTypesubtype.class,
    UmReferralTypesubtype.class
})
public abstract class UmTypesubtype
    extends Typesubtype
{


}
