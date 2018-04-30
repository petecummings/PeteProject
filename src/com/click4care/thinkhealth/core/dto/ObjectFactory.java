
package com.click4care.thinkhealth.core.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.click4care.thinkhealth.core.dto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PhoneNumber_QNAME = new QName("http://www.click4care.com/thinkhealth/core/dto", "phoneNumber");
    private final static QName _EmailAddress_QNAME = new QName("http://www.click4care.com/thinkhealth/core/dto", "emailAddress");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.click4care.thinkhealth.core.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmailAddressType }
     * 
     */
    public EmailAddressType createEmailAddressType() {
        return new EmailAddressType();
    }

    /**
     * Create an instance of {@link PhoneNumberType }
     * 
     */
    public PhoneNumberType createPhoneNumberType() {
        return new PhoneNumberType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.click4care.com/thinkhealth/core/dto", name = "phoneNumber")
    public JAXBElement<PhoneNumberType> createPhoneNumber(PhoneNumberType value) {
        return new JAXBElement<PhoneNumberType>(_PhoneNumber_QNAME, PhoneNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.click4care.com/thinkhealth/core/dto", name = "emailAddress")
    public JAXBElement<EmailAddressType> createEmailAddress(EmailAddressType value) {
        return new JAXBElement<EmailAddressType>(_EmailAddress_QNAME, EmailAddressType.class, null, value);
    }

}
