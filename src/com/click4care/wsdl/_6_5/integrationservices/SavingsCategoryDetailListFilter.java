
package com.click4care.wsdl._6_5.integrationservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="adHocNegotiatedSavingsCategoryDetailListFilter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *                   &lt;sequence>
 *                     &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="industryStandardCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                     &lt;element name="negotiatedCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                     &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="unitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="unitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="unitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="unitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;choice minOccurs="0">
 *                       &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *                       &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *                     &lt;/choice>
 *                     &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="benefitExceptionSavingsCategoryDetailListFilter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *                   &lt;sequence>
 *                     &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="costPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                     &lt;element name="expectedBenefit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                     &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="unitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="unitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="unitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="unitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;choice minOccurs="0">
 *                       &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *                       &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *                     &lt;/choice>
 *                     &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="benefitExchangeSavingsCategoryDetailListFilter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *                   &lt;sequence>
 *                     &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="replacementCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                     &lt;element name="replacementCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                     &lt;element name="replacementProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="replacementProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="replacementServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="replacementServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="replacementUnitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="replacementUnitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="replacementUnitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="replacementUnitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="replacementUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="requestedCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                     &lt;element name="requestedCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                     &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="requestedUnitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="requestedUnitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="requestedUnitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="requestedUnitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="requestedUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;choice minOccurs="0">
 *                       &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *                       &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *                     &lt;/choice>
 *                     &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="denialSavingsCategoryDetailListFilter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *                   &lt;sequence>
 *                     &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="actualUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="costPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                     &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="requestedUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="unitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="unitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="unitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="unitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;choice minOccurs="0">
 *                       &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *                       &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *                     &lt;/choice>
 *                     &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="memberReportedSavingsCategoryDetailListFilter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *                   &lt;sequence>
 *                     &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="actualCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                     &lt;element name="estimatedContractCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                     &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="unitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="unitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="unitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="unitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;choice minOccurs="0">
 *                       &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *                       &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *                     &lt;/choice>
 *                     &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="perContractNegotiatedSavingsCategoryDetailListFilter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *                   &lt;sequence>
 *                     &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="contractCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                     &lt;element name="industryStandardCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                     &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="unitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="unitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="unitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="unitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;choice minOccurs="0">
 *                       &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *                       &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *                     &lt;/choice>
 *                     &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="otherSavingsCategoryDetailListFilter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *                   &lt;sequence>
 *                     &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="netSavings" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                     &lt;choice minOccurs="0">
 *                       &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *                       &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *                     &lt;/choice>
 *                     &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="otherUMRelatedSavingsCategoryDetailListFilter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *                   &lt;sequence>
 *                     &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="netSavings" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                     &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                     &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;choice minOccurs="0">
 *                       &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *                       &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
 *                     &lt;/choice>
 *                     &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adHocNegotiatedSavingsCategoryDetailListFilter",
    "benefitExceptionSavingsCategoryDetailListFilter",
    "benefitExchangeSavingsCategoryDetailListFilter",
    "denialSavingsCategoryDetailListFilter",
    "memberReportedSavingsCategoryDetailListFilter",
    "perContractNegotiatedSavingsCategoryDetailListFilter",
    "otherSavingsCategoryDetailListFilter",
    "otherUMRelatedSavingsCategoryDetailListFilter"
})
@XmlRootElement(name = "savingsCategoryDetailListFilter")
public class SavingsCategoryDetailListFilter {

    protected SavingsCategoryDetailListFilter.AdHocNegotiatedSavingsCategoryDetailListFilter adHocNegotiatedSavingsCategoryDetailListFilter;
    protected SavingsCategoryDetailListFilter.BenefitExceptionSavingsCategoryDetailListFilter benefitExceptionSavingsCategoryDetailListFilter;
    protected SavingsCategoryDetailListFilter.BenefitExchangeSavingsCategoryDetailListFilter benefitExchangeSavingsCategoryDetailListFilter;
    protected SavingsCategoryDetailListFilter.DenialSavingsCategoryDetailListFilter denialSavingsCategoryDetailListFilter;
    protected SavingsCategoryDetailListFilter.MemberReportedSavingsCategoryDetailListFilter memberReportedSavingsCategoryDetailListFilter;
    protected SavingsCategoryDetailListFilter.PerContractNegotiatedSavingsCategoryDetailListFilter perContractNegotiatedSavingsCategoryDetailListFilter;
    protected SavingsCategoryDetailListFilter.OtherSavingsCategoryDetailListFilter otherSavingsCategoryDetailListFilter;
    protected SavingsCategoryDetailListFilter.OtherUMRelatedSavingsCategoryDetailListFilter otherUMRelatedSavingsCategoryDetailListFilter;

    /**
     * Gets the value of the adHocNegotiatedSavingsCategoryDetailListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SavingsCategoryDetailListFilter.AdHocNegotiatedSavingsCategoryDetailListFilter }
     *     
     */
    public SavingsCategoryDetailListFilter.AdHocNegotiatedSavingsCategoryDetailListFilter getAdHocNegotiatedSavingsCategoryDetailListFilter() {
        return adHocNegotiatedSavingsCategoryDetailListFilter;
    }

    /**
     * Sets the value of the adHocNegotiatedSavingsCategoryDetailListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SavingsCategoryDetailListFilter.AdHocNegotiatedSavingsCategoryDetailListFilter }
     *     
     */
    public void setAdHocNegotiatedSavingsCategoryDetailListFilter(SavingsCategoryDetailListFilter.AdHocNegotiatedSavingsCategoryDetailListFilter value) {
        this.adHocNegotiatedSavingsCategoryDetailListFilter = value;
    }

    /**
     * Gets the value of the benefitExceptionSavingsCategoryDetailListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SavingsCategoryDetailListFilter.BenefitExceptionSavingsCategoryDetailListFilter }
     *     
     */
    public SavingsCategoryDetailListFilter.BenefitExceptionSavingsCategoryDetailListFilter getBenefitExceptionSavingsCategoryDetailListFilter() {
        return benefitExceptionSavingsCategoryDetailListFilter;
    }

    /**
     * Sets the value of the benefitExceptionSavingsCategoryDetailListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SavingsCategoryDetailListFilter.BenefitExceptionSavingsCategoryDetailListFilter }
     *     
     */
    public void setBenefitExceptionSavingsCategoryDetailListFilter(SavingsCategoryDetailListFilter.BenefitExceptionSavingsCategoryDetailListFilter value) {
        this.benefitExceptionSavingsCategoryDetailListFilter = value;
    }

    /**
     * Gets the value of the benefitExchangeSavingsCategoryDetailListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SavingsCategoryDetailListFilter.BenefitExchangeSavingsCategoryDetailListFilter }
     *     
     */
    public SavingsCategoryDetailListFilter.BenefitExchangeSavingsCategoryDetailListFilter getBenefitExchangeSavingsCategoryDetailListFilter() {
        return benefitExchangeSavingsCategoryDetailListFilter;
    }

    /**
     * Sets the value of the benefitExchangeSavingsCategoryDetailListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SavingsCategoryDetailListFilter.BenefitExchangeSavingsCategoryDetailListFilter }
     *     
     */
    public void setBenefitExchangeSavingsCategoryDetailListFilter(SavingsCategoryDetailListFilter.BenefitExchangeSavingsCategoryDetailListFilter value) {
        this.benefitExchangeSavingsCategoryDetailListFilter = value;
    }

    /**
     * Gets the value of the denialSavingsCategoryDetailListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SavingsCategoryDetailListFilter.DenialSavingsCategoryDetailListFilter }
     *     
     */
    public SavingsCategoryDetailListFilter.DenialSavingsCategoryDetailListFilter getDenialSavingsCategoryDetailListFilter() {
        return denialSavingsCategoryDetailListFilter;
    }

    /**
     * Sets the value of the denialSavingsCategoryDetailListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SavingsCategoryDetailListFilter.DenialSavingsCategoryDetailListFilter }
     *     
     */
    public void setDenialSavingsCategoryDetailListFilter(SavingsCategoryDetailListFilter.DenialSavingsCategoryDetailListFilter value) {
        this.denialSavingsCategoryDetailListFilter = value;
    }

    /**
     * Gets the value of the memberReportedSavingsCategoryDetailListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SavingsCategoryDetailListFilter.MemberReportedSavingsCategoryDetailListFilter }
     *     
     */
    public SavingsCategoryDetailListFilter.MemberReportedSavingsCategoryDetailListFilter getMemberReportedSavingsCategoryDetailListFilter() {
        return memberReportedSavingsCategoryDetailListFilter;
    }

    /**
     * Sets the value of the memberReportedSavingsCategoryDetailListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SavingsCategoryDetailListFilter.MemberReportedSavingsCategoryDetailListFilter }
     *     
     */
    public void setMemberReportedSavingsCategoryDetailListFilter(SavingsCategoryDetailListFilter.MemberReportedSavingsCategoryDetailListFilter value) {
        this.memberReportedSavingsCategoryDetailListFilter = value;
    }

    /**
     * Gets the value of the perContractNegotiatedSavingsCategoryDetailListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SavingsCategoryDetailListFilter.PerContractNegotiatedSavingsCategoryDetailListFilter }
     *     
     */
    public SavingsCategoryDetailListFilter.PerContractNegotiatedSavingsCategoryDetailListFilter getPerContractNegotiatedSavingsCategoryDetailListFilter() {
        return perContractNegotiatedSavingsCategoryDetailListFilter;
    }

    /**
     * Sets the value of the perContractNegotiatedSavingsCategoryDetailListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SavingsCategoryDetailListFilter.PerContractNegotiatedSavingsCategoryDetailListFilter }
     *     
     */
    public void setPerContractNegotiatedSavingsCategoryDetailListFilter(SavingsCategoryDetailListFilter.PerContractNegotiatedSavingsCategoryDetailListFilter value) {
        this.perContractNegotiatedSavingsCategoryDetailListFilter = value;
    }

    /**
     * Gets the value of the otherSavingsCategoryDetailListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SavingsCategoryDetailListFilter.OtherSavingsCategoryDetailListFilter }
     *     
     */
    public SavingsCategoryDetailListFilter.OtherSavingsCategoryDetailListFilter getOtherSavingsCategoryDetailListFilter() {
        return otherSavingsCategoryDetailListFilter;
    }

    /**
     * Sets the value of the otherSavingsCategoryDetailListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SavingsCategoryDetailListFilter.OtherSavingsCategoryDetailListFilter }
     *     
     */
    public void setOtherSavingsCategoryDetailListFilter(SavingsCategoryDetailListFilter.OtherSavingsCategoryDetailListFilter value) {
        this.otherSavingsCategoryDetailListFilter = value;
    }

    /**
     * Gets the value of the otherUMRelatedSavingsCategoryDetailListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SavingsCategoryDetailListFilter.OtherUMRelatedSavingsCategoryDetailListFilter }
     *     
     */
    public SavingsCategoryDetailListFilter.OtherUMRelatedSavingsCategoryDetailListFilter getOtherUMRelatedSavingsCategoryDetailListFilter() {
        return otherUMRelatedSavingsCategoryDetailListFilter;
    }

    /**
     * Sets the value of the otherUMRelatedSavingsCategoryDetailListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SavingsCategoryDetailListFilter.OtherUMRelatedSavingsCategoryDetailListFilter }
     *     
     */
    public void setOtherUMRelatedSavingsCategoryDetailListFilter(SavingsCategoryDetailListFilter.OtherUMRelatedSavingsCategoryDetailListFilter value) {
        this.otherUMRelatedSavingsCategoryDetailListFilter = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
     *         &lt;sequence>
     *           &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="industryStandardCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *           &lt;element name="negotiatedCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *           &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="unitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="unitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="unitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="unitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;choice minOccurs="0">
     *             &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
     *             &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
     *           &lt;/choice>
     *           &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "legacyId",
        "id",
        "c4CId",
        "industryStandardCostPerUnit",
        "negotiatedCostPerUnit",
        "requestedProviderId",
        "requestedProviderUniversalId",
        "requestedServiceId",
        "requestedServiceUniversalId",
        "unitTypeDropDownListItemLabel",
        "unitTypeDropDownListName",
        "unitTypeId",
        "unitTypeUniversalId",
        "units",
        "createdDate",
        "lastActionDate",
        "queryState"
    })
    public static class AdHocNegotiatedSavingsCategoryDetailListFilter {

        protected List<String> legacyId;
        protected List<BigInteger> id;
        @XmlElement(name = "c4cId")
        protected String c4CId;
        protected Double industryStandardCostPerUnit;
        protected Double negotiatedCostPerUnit;
        protected BigInteger requestedProviderId;
        protected String requestedProviderUniversalId;
        protected BigInteger requestedServiceId;
        protected String requestedServiceUniversalId;
        protected String unitTypeDropDownListItemLabel;
        protected String unitTypeDropDownListName;
        protected BigInteger unitTypeId;
        protected String unitTypeUniversalId;
        protected BigInteger units;
        protected DateRange createdDate;
        protected DateRange lastActionDate;
        protected BigInteger queryState;

        /**
         * Gets the value of the legacyId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legacyId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLegacyId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLegacyId() {
            if (legacyId == null) {
                legacyId = new ArrayList<String>();
            }
            return this.legacyId;
        }

        /**
         * Gets the value of the id property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the id property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getId() {
            if (id == null) {
                id = new ArrayList<BigInteger>();
            }
            return this.id;
        }

        /**
         * Gets the value of the c4CId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getC4CId() {
            return c4CId;
        }

        /**
         * Sets the value of the c4CId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setC4CId(String value) {
            this.c4CId = value;
        }

        /**
         * Gets the value of the industryStandardCostPerUnit property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getIndustryStandardCostPerUnit() {
            return industryStandardCostPerUnit;
        }

        /**
         * Sets the value of the industryStandardCostPerUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setIndustryStandardCostPerUnit(Double value) {
            this.industryStandardCostPerUnit = value;
        }

        /**
         * Gets the value of the negotiatedCostPerUnit property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getNegotiatedCostPerUnit() {
            return negotiatedCostPerUnit;
        }

        /**
         * Sets the value of the negotiatedCostPerUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setNegotiatedCostPerUnit(Double value) {
            this.negotiatedCostPerUnit = value;
        }

        /**
         * Gets the value of the requestedProviderId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedProviderId() {
            return requestedProviderId;
        }

        /**
         * Sets the value of the requestedProviderId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedProviderId(BigInteger value) {
            this.requestedProviderId = value;
        }

        /**
         * Gets the value of the requestedProviderUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedProviderUniversalId() {
            return requestedProviderUniversalId;
        }

        /**
         * Sets the value of the requestedProviderUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedProviderUniversalId(String value) {
            this.requestedProviderUniversalId = value;
        }

        /**
         * Gets the value of the requestedServiceId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedServiceId() {
            return requestedServiceId;
        }

        /**
         * Sets the value of the requestedServiceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedServiceId(BigInteger value) {
            this.requestedServiceId = value;
        }

        /**
         * Gets the value of the requestedServiceUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedServiceUniversalId() {
            return requestedServiceUniversalId;
        }

        /**
         * Sets the value of the requestedServiceUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedServiceUniversalId(String value) {
            this.requestedServiceUniversalId = value;
        }

        /**
         * Gets the value of the unitTypeDropDownListItemLabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitTypeDropDownListItemLabel() {
            return unitTypeDropDownListItemLabel;
        }

        /**
         * Sets the value of the unitTypeDropDownListItemLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitTypeDropDownListItemLabel(String value) {
            this.unitTypeDropDownListItemLabel = value;
        }

        /**
         * Gets the value of the unitTypeDropDownListName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitTypeDropDownListName() {
            return unitTypeDropDownListName;
        }

        /**
         * Sets the value of the unitTypeDropDownListName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitTypeDropDownListName(String value) {
            this.unitTypeDropDownListName = value;
        }

        /**
         * Gets the value of the unitTypeId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnitTypeId() {
            return unitTypeId;
        }

        /**
         * Sets the value of the unitTypeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnitTypeId(BigInteger value) {
            this.unitTypeId = value;
        }

        /**
         * Gets the value of the unitTypeUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitTypeUniversalId() {
            return unitTypeUniversalId;
        }

        /**
         * Sets the value of the unitTypeUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitTypeUniversalId(String value) {
            this.unitTypeUniversalId = value;
        }

        /**
         * Gets the value of the units property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnits() {
            return units;
        }

        /**
         * Sets the value of the units property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnits(BigInteger value) {
            this.units = value;
        }

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setCreatedDate(DateRange value) {
            this.createdDate = value;
        }

        /**
         * Gets the value of the lastActionDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getLastActionDate() {
            return lastActionDate;
        }

        /**
         * Sets the value of the lastActionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setLastActionDate(DateRange value) {
            this.lastActionDate = value;
        }

        /**
         * Gets the value of the queryState property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQueryState() {
            return queryState;
        }

        /**
         * Sets the value of the queryState property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQueryState(BigInteger value) {
            this.queryState = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
     *         &lt;sequence>
     *           &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="costPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *           &lt;element name="expectedBenefit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *           &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="unitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="unitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="unitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="unitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;choice minOccurs="0">
     *             &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
     *             &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
     *           &lt;/choice>
     *           &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "legacyId",
        "id",
        "c4CId",
        "costPerUnit",
        "expectedBenefit",
        "requestedProviderId",
        "requestedProviderUniversalId",
        "requestedServiceId",
        "requestedServiceUniversalId",
        "unitTypeDropDownListItemLabel",
        "unitTypeDropDownListName",
        "unitTypeId",
        "unitTypeUniversalId",
        "units",
        "createdDate",
        "lastActionDate",
        "queryState"
    })
    public static class BenefitExceptionSavingsCategoryDetailListFilter {

        protected List<String> legacyId;
        protected List<BigInteger> id;
        @XmlElement(name = "c4cId")
        protected String c4CId;
        protected Double costPerUnit;
        protected Double expectedBenefit;
        protected BigInteger requestedProviderId;
        protected String requestedProviderUniversalId;
        protected BigInteger requestedServiceId;
        protected String requestedServiceUniversalId;
        protected String unitTypeDropDownListItemLabel;
        protected String unitTypeDropDownListName;
        protected BigInteger unitTypeId;
        protected String unitTypeUniversalId;
        protected BigInteger units;
        protected DateRange createdDate;
        protected DateRange lastActionDate;
        protected BigInteger queryState;

        /**
         * Gets the value of the legacyId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legacyId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLegacyId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLegacyId() {
            if (legacyId == null) {
                legacyId = new ArrayList<String>();
            }
            return this.legacyId;
        }

        /**
         * Gets the value of the id property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the id property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getId() {
            if (id == null) {
                id = new ArrayList<BigInteger>();
            }
            return this.id;
        }

        /**
         * Gets the value of the c4CId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getC4CId() {
            return c4CId;
        }

        /**
         * Sets the value of the c4CId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setC4CId(String value) {
            this.c4CId = value;
        }

        /**
         * Gets the value of the costPerUnit property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getCostPerUnit() {
            return costPerUnit;
        }

        /**
         * Sets the value of the costPerUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setCostPerUnit(Double value) {
            this.costPerUnit = value;
        }

        /**
         * Gets the value of the expectedBenefit property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getExpectedBenefit() {
            return expectedBenefit;
        }

        /**
         * Sets the value of the expectedBenefit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setExpectedBenefit(Double value) {
            this.expectedBenefit = value;
        }

        /**
         * Gets the value of the requestedProviderId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedProviderId() {
            return requestedProviderId;
        }

        /**
         * Sets the value of the requestedProviderId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedProviderId(BigInteger value) {
            this.requestedProviderId = value;
        }

        /**
         * Gets the value of the requestedProviderUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedProviderUniversalId() {
            return requestedProviderUniversalId;
        }

        /**
         * Sets the value of the requestedProviderUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedProviderUniversalId(String value) {
            this.requestedProviderUniversalId = value;
        }

        /**
         * Gets the value of the requestedServiceId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedServiceId() {
            return requestedServiceId;
        }

        /**
         * Sets the value of the requestedServiceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedServiceId(BigInteger value) {
            this.requestedServiceId = value;
        }

        /**
         * Gets the value of the requestedServiceUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedServiceUniversalId() {
            return requestedServiceUniversalId;
        }

        /**
         * Sets the value of the requestedServiceUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedServiceUniversalId(String value) {
            this.requestedServiceUniversalId = value;
        }

        /**
         * Gets the value of the unitTypeDropDownListItemLabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitTypeDropDownListItemLabel() {
            return unitTypeDropDownListItemLabel;
        }

        /**
         * Sets the value of the unitTypeDropDownListItemLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitTypeDropDownListItemLabel(String value) {
            this.unitTypeDropDownListItemLabel = value;
        }

        /**
         * Gets the value of the unitTypeDropDownListName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitTypeDropDownListName() {
            return unitTypeDropDownListName;
        }

        /**
         * Sets the value of the unitTypeDropDownListName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitTypeDropDownListName(String value) {
            this.unitTypeDropDownListName = value;
        }

        /**
         * Gets the value of the unitTypeId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnitTypeId() {
            return unitTypeId;
        }

        /**
         * Sets the value of the unitTypeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnitTypeId(BigInteger value) {
            this.unitTypeId = value;
        }

        /**
         * Gets the value of the unitTypeUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitTypeUniversalId() {
            return unitTypeUniversalId;
        }

        /**
         * Sets the value of the unitTypeUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitTypeUniversalId(String value) {
            this.unitTypeUniversalId = value;
        }

        /**
         * Gets the value of the units property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnits() {
            return units;
        }

        /**
         * Sets the value of the units property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnits(BigInteger value) {
            this.units = value;
        }

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setCreatedDate(DateRange value) {
            this.createdDate = value;
        }

        /**
         * Gets the value of the lastActionDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getLastActionDate() {
            return lastActionDate;
        }

        /**
         * Sets the value of the lastActionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setLastActionDate(DateRange value) {
            this.lastActionDate = value;
        }

        /**
         * Gets the value of the queryState property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQueryState() {
            return queryState;
        }

        /**
         * Sets the value of the queryState property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQueryState(BigInteger value) {
            this.queryState = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
     *         &lt;sequence>
     *           &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="replacementCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *           &lt;element name="replacementCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *           &lt;element name="replacementProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="replacementProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="replacementServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="replacementServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="replacementUnitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="replacementUnitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="replacementUnitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="replacementUnitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="replacementUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="requestedCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *           &lt;element name="requestedCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *           &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="requestedUnitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="requestedUnitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="requestedUnitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="requestedUnitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="requestedUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;choice minOccurs="0">
     *             &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
     *             &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
     *           &lt;/choice>
     *           &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "legacyId",
        "id",
        "c4CId",
        "replacementCost",
        "replacementCostPerUnit",
        "replacementProviderId",
        "replacementProviderUniversalId",
        "replacementServiceId",
        "replacementServiceUniversalId",
        "replacementUnitTypeDropDownListItemLabel",
        "replacementUnitTypeDropDownListName",
        "replacementUnitTypeId",
        "replacementUnitTypeUniversalId",
        "replacementUnits",
        "requestedCost",
        "requestedCostPerUnit",
        "requestedProviderId",
        "requestedProviderUniversalId",
        "requestedServiceId",
        "requestedServiceUniversalId",
        "requestedUnitTypeDropDownListItemLabel",
        "requestedUnitTypeDropDownListName",
        "requestedUnitTypeId",
        "requestedUnitTypeUniversalId",
        "requestedUnits",
        "createdDate",
        "lastActionDate",
        "queryState"
    })
    public static class BenefitExchangeSavingsCategoryDetailListFilter {

        protected List<String> legacyId;
        protected List<BigInteger> id;
        @XmlElement(name = "c4cId")
        protected String c4CId;
        protected Double replacementCost;
        protected Double replacementCostPerUnit;
        protected BigInteger replacementProviderId;
        protected String replacementProviderUniversalId;
        protected BigInteger replacementServiceId;
        protected String replacementServiceUniversalId;
        protected String replacementUnitTypeDropDownListItemLabel;
        protected String replacementUnitTypeDropDownListName;
        protected BigInteger replacementUnitTypeId;
        protected String replacementUnitTypeUniversalId;
        protected BigInteger replacementUnits;
        protected Double requestedCost;
        protected Double requestedCostPerUnit;
        protected BigInteger requestedProviderId;
        protected String requestedProviderUniversalId;
        protected BigInteger requestedServiceId;
        protected String requestedServiceUniversalId;
        protected String requestedUnitTypeDropDownListItemLabel;
        protected String requestedUnitTypeDropDownListName;
        protected BigInteger requestedUnitTypeId;
        protected String requestedUnitTypeUniversalId;
        protected BigInteger requestedUnits;
        protected DateRange createdDate;
        protected DateRange lastActionDate;
        protected BigInteger queryState;

        /**
         * Gets the value of the legacyId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legacyId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLegacyId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLegacyId() {
            if (legacyId == null) {
                legacyId = new ArrayList<String>();
            }
            return this.legacyId;
        }

        /**
         * Gets the value of the id property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the id property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getId() {
            if (id == null) {
                id = new ArrayList<BigInteger>();
            }
            return this.id;
        }

        /**
         * Gets the value of the c4CId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getC4CId() {
            return c4CId;
        }

        /**
         * Sets the value of the c4CId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setC4CId(String value) {
            this.c4CId = value;
        }

        /**
         * Gets the value of the replacementCost property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getReplacementCost() {
            return replacementCost;
        }

        /**
         * Sets the value of the replacementCost property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setReplacementCost(Double value) {
            this.replacementCost = value;
        }

        /**
         * Gets the value of the replacementCostPerUnit property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getReplacementCostPerUnit() {
            return replacementCostPerUnit;
        }

        /**
         * Sets the value of the replacementCostPerUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setReplacementCostPerUnit(Double value) {
            this.replacementCostPerUnit = value;
        }

        /**
         * Gets the value of the replacementProviderId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReplacementProviderId() {
            return replacementProviderId;
        }

        /**
         * Sets the value of the replacementProviderId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReplacementProviderId(BigInteger value) {
            this.replacementProviderId = value;
        }

        /**
         * Gets the value of the replacementProviderUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReplacementProviderUniversalId() {
            return replacementProviderUniversalId;
        }

        /**
         * Sets the value of the replacementProviderUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReplacementProviderUniversalId(String value) {
            this.replacementProviderUniversalId = value;
        }

        /**
         * Gets the value of the replacementServiceId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReplacementServiceId() {
            return replacementServiceId;
        }

        /**
         * Sets the value of the replacementServiceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReplacementServiceId(BigInteger value) {
            this.replacementServiceId = value;
        }

        /**
         * Gets the value of the replacementServiceUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReplacementServiceUniversalId() {
            return replacementServiceUniversalId;
        }

        /**
         * Sets the value of the replacementServiceUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReplacementServiceUniversalId(String value) {
            this.replacementServiceUniversalId = value;
        }

        /**
         * Gets the value of the replacementUnitTypeDropDownListItemLabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReplacementUnitTypeDropDownListItemLabel() {
            return replacementUnitTypeDropDownListItemLabel;
        }

        /**
         * Sets the value of the replacementUnitTypeDropDownListItemLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReplacementUnitTypeDropDownListItemLabel(String value) {
            this.replacementUnitTypeDropDownListItemLabel = value;
        }

        /**
         * Gets the value of the replacementUnitTypeDropDownListName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReplacementUnitTypeDropDownListName() {
            return replacementUnitTypeDropDownListName;
        }

        /**
         * Sets the value of the replacementUnitTypeDropDownListName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReplacementUnitTypeDropDownListName(String value) {
            this.replacementUnitTypeDropDownListName = value;
        }

        /**
         * Gets the value of the replacementUnitTypeId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReplacementUnitTypeId() {
            return replacementUnitTypeId;
        }

        /**
         * Sets the value of the replacementUnitTypeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReplacementUnitTypeId(BigInteger value) {
            this.replacementUnitTypeId = value;
        }

        /**
         * Gets the value of the replacementUnitTypeUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReplacementUnitTypeUniversalId() {
            return replacementUnitTypeUniversalId;
        }

        /**
         * Sets the value of the replacementUnitTypeUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReplacementUnitTypeUniversalId(String value) {
            this.replacementUnitTypeUniversalId = value;
        }

        /**
         * Gets the value of the replacementUnits property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReplacementUnits() {
            return replacementUnits;
        }

        /**
         * Sets the value of the replacementUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReplacementUnits(BigInteger value) {
            this.replacementUnits = value;
        }

        /**
         * Gets the value of the requestedCost property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getRequestedCost() {
            return requestedCost;
        }

        /**
         * Sets the value of the requestedCost property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setRequestedCost(Double value) {
            this.requestedCost = value;
        }

        /**
         * Gets the value of the requestedCostPerUnit property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getRequestedCostPerUnit() {
            return requestedCostPerUnit;
        }

        /**
         * Sets the value of the requestedCostPerUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setRequestedCostPerUnit(Double value) {
            this.requestedCostPerUnit = value;
        }

        /**
         * Gets the value of the requestedProviderId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedProviderId() {
            return requestedProviderId;
        }

        /**
         * Sets the value of the requestedProviderId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedProviderId(BigInteger value) {
            this.requestedProviderId = value;
        }

        /**
         * Gets the value of the requestedProviderUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedProviderUniversalId() {
            return requestedProviderUniversalId;
        }

        /**
         * Sets the value of the requestedProviderUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedProviderUniversalId(String value) {
            this.requestedProviderUniversalId = value;
        }

        /**
         * Gets the value of the requestedServiceId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedServiceId() {
            return requestedServiceId;
        }

        /**
         * Sets the value of the requestedServiceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedServiceId(BigInteger value) {
            this.requestedServiceId = value;
        }

        /**
         * Gets the value of the requestedServiceUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedServiceUniversalId() {
            return requestedServiceUniversalId;
        }

        /**
         * Sets the value of the requestedServiceUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedServiceUniversalId(String value) {
            this.requestedServiceUniversalId = value;
        }

        /**
         * Gets the value of the requestedUnitTypeDropDownListItemLabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedUnitTypeDropDownListItemLabel() {
            return requestedUnitTypeDropDownListItemLabel;
        }

        /**
         * Sets the value of the requestedUnitTypeDropDownListItemLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedUnitTypeDropDownListItemLabel(String value) {
            this.requestedUnitTypeDropDownListItemLabel = value;
        }

        /**
         * Gets the value of the requestedUnitTypeDropDownListName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedUnitTypeDropDownListName() {
            return requestedUnitTypeDropDownListName;
        }

        /**
         * Sets the value of the requestedUnitTypeDropDownListName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedUnitTypeDropDownListName(String value) {
            this.requestedUnitTypeDropDownListName = value;
        }

        /**
         * Gets the value of the requestedUnitTypeId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedUnitTypeId() {
            return requestedUnitTypeId;
        }

        /**
         * Sets the value of the requestedUnitTypeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedUnitTypeId(BigInteger value) {
            this.requestedUnitTypeId = value;
        }

        /**
         * Gets the value of the requestedUnitTypeUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedUnitTypeUniversalId() {
            return requestedUnitTypeUniversalId;
        }

        /**
         * Sets the value of the requestedUnitTypeUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedUnitTypeUniversalId(String value) {
            this.requestedUnitTypeUniversalId = value;
        }

        /**
         * Gets the value of the requestedUnits property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedUnits() {
            return requestedUnits;
        }

        /**
         * Sets the value of the requestedUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedUnits(BigInteger value) {
            this.requestedUnits = value;
        }

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setCreatedDate(DateRange value) {
            this.createdDate = value;
        }

        /**
         * Gets the value of the lastActionDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getLastActionDate() {
            return lastActionDate;
        }

        /**
         * Sets the value of the lastActionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setLastActionDate(DateRange value) {
            this.lastActionDate = value;
        }

        /**
         * Gets the value of the queryState property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQueryState() {
            return queryState;
        }

        /**
         * Sets the value of the queryState property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQueryState(BigInteger value) {
            this.queryState = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
     *         &lt;sequence>
     *           &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="actualUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="costPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *           &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="requestedUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="unitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="unitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="unitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="unitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;choice minOccurs="0">
     *             &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
     *             &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
     *           &lt;/choice>
     *           &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "legacyId",
        "id",
        "c4CId",
        "actualUnits",
        "costPerUnit",
        "requestedProviderId",
        "requestedProviderUniversalId",
        "requestedServiceId",
        "requestedServiceUniversalId",
        "requestedUnits",
        "unitTypeDropDownListItemLabel",
        "unitTypeDropDownListName",
        "unitTypeId",
        "unitTypeUniversalId",
        "createdDate",
        "lastActionDate",
        "queryState"
    })
    public static class DenialSavingsCategoryDetailListFilter {

        protected List<String> legacyId;
        protected List<BigInteger> id;
        @XmlElement(name = "c4cId")
        protected String c4CId;
        protected BigInteger actualUnits;
        protected Double costPerUnit;
        protected BigInteger requestedProviderId;
        protected String requestedProviderUniversalId;
        protected BigInteger requestedServiceId;
        protected String requestedServiceUniversalId;
        protected BigInteger requestedUnits;
        protected String unitTypeDropDownListItemLabel;
        protected String unitTypeDropDownListName;
        protected BigInteger unitTypeId;
        protected String unitTypeUniversalId;
        protected DateRange createdDate;
        protected DateRange lastActionDate;
        protected BigInteger queryState;

        /**
         * Gets the value of the legacyId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legacyId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLegacyId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLegacyId() {
            if (legacyId == null) {
                legacyId = new ArrayList<String>();
            }
            return this.legacyId;
        }

        /**
         * Gets the value of the id property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the id property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getId() {
            if (id == null) {
                id = new ArrayList<BigInteger>();
            }
            return this.id;
        }

        /**
         * Gets the value of the c4CId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getC4CId() {
            return c4CId;
        }

        /**
         * Sets the value of the c4CId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setC4CId(String value) {
            this.c4CId = value;
        }

        /**
         * Gets the value of the actualUnits property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getActualUnits() {
            return actualUnits;
        }

        /**
         * Sets the value of the actualUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setActualUnits(BigInteger value) {
            this.actualUnits = value;
        }

        /**
         * Gets the value of the costPerUnit property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getCostPerUnit() {
            return costPerUnit;
        }

        /**
         * Sets the value of the costPerUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setCostPerUnit(Double value) {
            this.costPerUnit = value;
        }

        /**
         * Gets the value of the requestedProviderId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedProviderId() {
            return requestedProviderId;
        }

        /**
         * Sets the value of the requestedProviderId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedProviderId(BigInteger value) {
            this.requestedProviderId = value;
        }

        /**
         * Gets the value of the requestedProviderUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedProviderUniversalId() {
            return requestedProviderUniversalId;
        }

        /**
         * Sets the value of the requestedProviderUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedProviderUniversalId(String value) {
            this.requestedProviderUniversalId = value;
        }

        /**
         * Gets the value of the requestedServiceId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedServiceId() {
            return requestedServiceId;
        }

        /**
         * Sets the value of the requestedServiceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedServiceId(BigInteger value) {
            this.requestedServiceId = value;
        }

        /**
         * Gets the value of the requestedServiceUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedServiceUniversalId() {
            return requestedServiceUniversalId;
        }

        /**
         * Sets the value of the requestedServiceUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedServiceUniversalId(String value) {
            this.requestedServiceUniversalId = value;
        }

        /**
         * Gets the value of the requestedUnits property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedUnits() {
            return requestedUnits;
        }

        /**
         * Sets the value of the requestedUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedUnits(BigInteger value) {
            this.requestedUnits = value;
        }

        /**
         * Gets the value of the unitTypeDropDownListItemLabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitTypeDropDownListItemLabel() {
            return unitTypeDropDownListItemLabel;
        }

        /**
         * Sets the value of the unitTypeDropDownListItemLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitTypeDropDownListItemLabel(String value) {
            this.unitTypeDropDownListItemLabel = value;
        }

        /**
         * Gets the value of the unitTypeDropDownListName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitTypeDropDownListName() {
            return unitTypeDropDownListName;
        }

        /**
         * Sets the value of the unitTypeDropDownListName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitTypeDropDownListName(String value) {
            this.unitTypeDropDownListName = value;
        }

        /**
         * Gets the value of the unitTypeId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnitTypeId() {
            return unitTypeId;
        }

        /**
         * Sets the value of the unitTypeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnitTypeId(BigInteger value) {
            this.unitTypeId = value;
        }

        /**
         * Gets the value of the unitTypeUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitTypeUniversalId() {
            return unitTypeUniversalId;
        }

        /**
         * Sets the value of the unitTypeUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitTypeUniversalId(String value) {
            this.unitTypeUniversalId = value;
        }

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setCreatedDate(DateRange value) {
            this.createdDate = value;
        }

        /**
         * Gets the value of the lastActionDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getLastActionDate() {
            return lastActionDate;
        }

        /**
         * Sets the value of the lastActionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setLastActionDate(DateRange value) {
            this.lastActionDate = value;
        }

        /**
         * Gets the value of the queryState property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQueryState() {
            return queryState;
        }

        /**
         * Sets the value of the queryState property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQueryState(BigInteger value) {
            this.queryState = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
     *         &lt;sequence>
     *           &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="actualCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *           &lt;element name="estimatedContractCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *           &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="unitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="unitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="unitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="unitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;choice minOccurs="0">
     *             &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
     *             &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
     *           &lt;/choice>
     *           &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "legacyId",
        "id",
        "c4CId",
        "actualCostPerUnit",
        "estimatedContractCostPerUnit",
        "requestedProviderId",
        "requestedProviderUniversalId",
        "requestedServiceId",
        "requestedServiceUniversalId",
        "unitTypeDropDownListItemLabel",
        "unitTypeDropDownListName",
        "unitTypeId",
        "unitTypeUniversalId",
        "units",
        "createdDate",
        "lastActionDate",
        "queryState"
    })
    public static class MemberReportedSavingsCategoryDetailListFilter {

        protected List<String> legacyId;
        protected List<BigInteger> id;
        @XmlElement(name = "c4cId")
        protected String c4CId;
        protected Double actualCostPerUnit;
        protected Double estimatedContractCostPerUnit;
        protected BigInteger requestedProviderId;
        protected String requestedProviderUniversalId;
        protected BigInteger requestedServiceId;
        protected String requestedServiceUniversalId;
        protected String unitTypeDropDownListItemLabel;
        protected String unitTypeDropDownListName;
        protected BigInteger unitTypeId;
        protected String unitTypeUniversalId;
        protected BigInteger units;
        protected DateRange createdDate;
        protected DateRange lastActionDate;
        protected BigInteger queryState;

        /**
         * Gets the value of the legacyId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legacyId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLegacyId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLegacyId() {
            if (legacyId == null) {
                legacyId = new ArrayList<String>();
            }
            return this.legacyId;
        }

        /**
         * Gets the value of the id property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the id property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getId() {
            if (id == null) {
                id = new ArrayList<BigInteger>();
            }
            return this.id;
        }

        /**
         * Gets the value of the c4CId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getC4CId() {
            return c4CId;
        }

        /**
         * Sets the value of the c4CId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setC4CId(String value) {
            this.c4CId = value;
        }

        /**
         * Gets the value of the actualCostPerUnit property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getActualCostPerUnit() {
            return actualCostPerUnit;
        }

        /**
         * Sets the value of the actualCostPerUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setActualCostPerUnit(Double value) {
            this.actualCostPerUnit = value;
        }

        /**
         * Gets the value of the estimatedContractCostPerUnit property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getEstimatedContractCostPerUnit() {
            return estimatedContractCostPerUnit;
        }

        /**
         * Sets the value of the estimatedContractCostPerUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setEstimatedContractCostPerUnit(Double value) {
            this.estimatedContractCostPerUnit = value;
        }

        /**
         * Gets the value of the requestedProviderId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedProviderId() {
            return requestedProviderId;
        }

        /**
         * Sets the value of the requestedProviderId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedProviderId(BigInteger value) {
            this.requestedProviderId = value;
        }

        /**
         * Gets the value of the requestedProviderUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedProviderUniversalId() {
            return requestedProviderUniversalId;
        }

        /**
         * Sets the value of the requestedProviderUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedProviderUniversalId(String value) {
            this.requestedProviderUniversalId = value;
        }

        /**
         * Gets the value of the requestedServiceId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedServiceId() {
            return requestedServiceId;
        }

        /**
         * Sets the value of the requestedServiceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedServiceId(BigInteger value) {
            this.requestedServiceId = value;
        }

        /**
         * Gets the value of the requestedServiceUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedServiceUniversalId() {
            return requestedServiceUniversalId;
        }

        /**
         * Sets the value of the requestedServiceUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedServiceUniversalId(String value) {
            this.requestedServiceUniversalId = value;
        }

        /**
         * Gets the value of the unitTypeDropDownListItemLabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitTypeDropDownListItemLabel() {
            return unitTypeDropDownListItemLabel;
        }

        /**
         * Sets the value of the unitTypeDropDownListItemLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitTypeDropDownListItemLabel(String value) {
            this.unitTypeDropDownListItemLabel = value;
        }

        /**
         * Gets the value of the unitTypeDropDownListName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitTypeDropDownListName() {
            return unitTypeDropDownListName;
        }

        /**
         * Sets the value of the unitTypeDropDownListName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitTypeDropDownListName(String value) {
            this.unitTypeDropDownListName = value;
        }

        /**
         * Gets the value of the unitTypeId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnitTypeId() {
            return unitTypeId;
        }

        /**
         * Sets the value of the unitTypeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnitTypeId(BigInteger value) {
            this.unitTypeId = value;
        }

        /**
         * Gets the value of the unitTypeUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitTypeUniversalId() {
            return unitTypeUniversalId;
        }

        /**
         * Sets the value of the unitTypeUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitTypeUniversalId(String value) {
            this.unitTypeUniversalId = value;
        }

        /**
         * Gets the value of the units property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnits() {
            return units;
        }

        /**
         * Sets the value of the units property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnits(BigInteger value) {
            this.units = value;
        }

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setCreatedDate(DateRange value) {
            this.createdDate = value;
        }

        /**
         * Gets the value of the lastActionDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getLastActionDate() {
            return lastActionDate;
        }

        /**
         * Sets the value of the lastActionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setLastActionDate(DateRange value) {
            this.lastActionDate = value;
        }

        /**
         * Gets the value of the queryState property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQueryState() {
            return queryState;
        }

        /**
         * Sets the value of the queryState property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQueryState(BigInteger value) {
            this.queryState = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
     *         &lt;sequence>
     *           &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="netSavings" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *           &lt;choice minOccurs="0">
     *             &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
     *             &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
     *           &lt;/choice>
     *           &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "legacyId",
        "id",
        "c4CId",
        "netSavings",
        "createdDate",
        "lastActionDate",
        "queryState"
    })
    public static class OtherSavingsCategoryDetailListFilter {

        protected List<String> legacyId;
        protected List<BigInteger> id;
        @XmlElement(name = "c4cId")
        protected String c4CId;
        protected Double netSavings;
        protected DateRange createdDate;
        protected DateRange lastActionDate;
        protected BigInteger queryState;

        /**
         * Gets the value of the legacyId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legacyId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLegacyId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLegacyId() {
            if (legacyId == null) {
                legacyId = new ArrayList<String>();
            }
            return this.legacyId;
        }

        /**
         * Gets the value of the id property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the id property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getId() {
            if (id == null) {
                id = new ArrayList<BigInteger>();
            }
            return this.id;
        }

        /**
         * Gets the value of the c4CId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getC4CId() {
            return c4CId;
        }

        /**
         * Sets the value of the c4CId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setC4CId(String value) {
            this.c4CId = value;
        }

        /**
         * Gets the value of the netSavings property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getNetSavings() {
            return netSavings;
        }

        /**
         * Sets the value of the netSavings property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setNetSavings(Double value) {
            this.netSavings = value;
        }

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setCreatedDate(DateRange value) {
            this.createdDate = value;
        }

        /**
         * Gets the value of the lastActionDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getLastActionDate() {
            return lastActionDate;
        }

        /**
         * Sets the value of the lastActionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setLastActionDate(DateRange value) {
            this.lastActionDate = value;
        }

        /**
         * Gets the value of the queryState property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQueryState() {
            return queryState;
        }

        /**
         * Sets the value of the queryState property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQueryState(BigInteger value) {
            this.queryState = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
     *         &lt;sequence>
     *           &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="netSavings" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *           &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;choice minOccurs="0">
     *             &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
     *             &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
     *           &lt;/choice>
     *           &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "legacyId",
        "id",
        "c4CId",
        "netSavings",
        "requestedProviderId",
        "requestedProviderUniversalId",
        "requestedServiceId",
        "requestedServiceUniversalId",
        "createdDate",
        "lastActionDate",
        "queryState"
    })
    public static class OtherUMRelatedSavingsCategoryDetailListFilter {

        protected List<String> legacyId;
        protected List<BigInteger> id;
        @XmlElement(name = "c4cId")
        protected String c4CId;
        protected Double netSavings;
        protected BigInteger requestedProviderId;
        protected String requestedProviderUniversalId;
        protected BigInteger requestedServiceId;
        protected String requestedServiceUniversalId;
        protected DateRange createdDate;
        protected DateRange lastActionDate;
        protected BigInteger queryState;

        /**
         * Gets the value of the legacyId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legacyId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLegacyId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLegacyId() {
            if (legacyId == null) {
                legacyId = new ArrayList<String>();
            }
            return this.legacyId;
        }

        /**
         * Gets the value of the id property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the id property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getId() {
            if (id == null) {
                id = new ArrayList<BigInteger>();
            }
            return this.id;
        }

        /**
         * Gets the value of the c4CId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getC4CId() {
            return c4CId;
        }

        /**
         * Sets the value of the c4CId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setC4CId(String value) {
            this.c4CId = value;
        }

        /**
         * Gets the value of the netSavings property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getNetSavings() {
            return netSavings;
        }

        /**
         * Sets the value of the netSavings property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setNetSavings(Double value) {
            this.netSavings = value;
        }

        /**
         * Gets the value of the requestedProviderId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedProviderId() {
            return requestedProviderId;
        }

        /**
         * Sets the value of the requestedProviderId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedProviderId(BigInteger value) {
            this.requestedProviderId = value;
        }

        /**
         * Gets the value of the requestedProviderUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedProviderUniversalId() {
            return requestedProviderUniversalId;
        }

        /**
         * Sets the value of the requestedProviderUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedProviderUniversalId(String value) {
            this.requestedProviderUniversalId = value;
        }

        /**
         * Gets the value of the requestedServiceId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedServiceId() {
            return requestedServiceId;
        }

        /**
         * Sets the value of the requestedServiceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedServiceId(BigInteger value) {
            this.requestedServiceId = value;
        }

        /**
         * Gets the value of the requestedServiceUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedServiceUniversalId() {
            return requestedServiceUniversalId;
        }

        /**
         * Sets the value of the requestedServiceUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedServiceUniversalId(String value) {
            this.requestedServiceUniversalId = value;
        }

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setCreatedDate(DateRange value) {
            this.createdDate = value;
        }

        /**
         * Gets the value of the lastActionDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getLastActionDate() {
            return lastActionDate;
        }

        /**
         * Sets the value of the lastActionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setLastActionDate(DateRange value) {
            this.lastActionDate = value;
        }

        /**
         * Gets the value of the queryState property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQueryState() {
            return queryState;
        }

        /**
         * Sets the value of the queryState property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQueryState(BigInteger value) {
            this.queryState = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
     *         &lt;sequence>
     *           &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="contractCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *           &lt;element name="industryStandardCostPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *           &lt;element name="requestedProviderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="requestedProviderUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="requestedServiceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="requestedServiceUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="unitTypeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="unitTypeDropDownListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="unitTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;element name="unitTypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *           &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *           &lt;choice minOccurs="0">
     *             &lt;element name="createdDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
     *             &lt;element name="lastActionDate" type="{http://click4care.com/wsdl/6.5/integrationServices}dateRange"/>
     *           &lt;/choice>
     *           &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "legacyId",
        "id",
        "c4CId",
        "contractCostPerUnit",
        "industryStandardCostPerUnit",
        "requestedProviderId",
        "requestedProviderUniversalId",
        "requestedServiceId",
        "requestedServiceUniversalId",
        "unitTypeDropDownListItemLabel",
        "unitTypeDropDownListName",
        "unitTypeId",
        "unitTypeUniversalId",
        "units",
        "createdDate",
        "lastActionDate",
        "queryState"
    })
    public static class PerContractNegotiatedSavingsCategoryDetailListFilter {

        protected List<String> legacyId;
        protected List<BigInteger> id;
        @XmlElement(name = "c4cId")
        protected String c4CId;
        protected Double contractCostPerUnit;
        protected Double industryStandardCostPerUnit;
        protected BigInteger requestedProviderId;
        protected String requestedProviderUniversalId;
        protected BigInteger requestedServiceId;
        protected String requestedServiceUniversalId;
        protected String unitTypeDropDownListItemLabel;
        protected String unitTypeDropDownListName;
        protected BigInteger unitTypeId;
        protected String unitTypeUniversalId;
        protected BigInteger units;
        protected DateRange createdDate;
        protected DateRange lastActionDate;
        protected BigInteger queryState;

        /**
         * Gets the value of the legacyId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legacyId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLegacyId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLegacyId() {
            if (legacyId == null) {
                legacyId = new ArrayList<String>();
            }
            return this.legacyId;
        }

        /**
         * Gets the value of the id property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the id property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getId() {
            if (id == null) {
                id = new ArrayList<BigInteger>();
            }
            return this.id;
        }

        /**
         * Gets the value of the c4CId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getC4CId() {
            return c4CId;
        }

        /**
         * Sets the value of the c4CId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setC4CId(String value) {
            this.c4CId = value;
        }

        /**
         * Gets the value of the contractCostPerUnit property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getContractCostPerUnit() {
            return contractCostPerUnit;
        }

        /**
         * Sets the value of the contractCostPerUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setContractCostPerUnit(Double value) {
            this.contractCostPerUnit = value;
        }

        /**
         * Gets the value of the industryStandardCostPerUnit property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getIndustryStandardCostPerUnit() {
            return industryStandardCostPerUnit;
        }

        /**
         * Sets the value of the industryStandardCostPerUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setIndustryStandardCostPerUnit(Double value) {
            this.industryStandardCostPerUnit = value;
        }

        /**
         * Gets the value of the requestedProviderId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedProviderId() {
            return requestedProviderId;
        }

        /**
         * Sets the value of the requestedProviderId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedProviderId(BigInteger value) {
            this.requestedProviderId = value;
        }

        /**
         * Gets the value of the requestedProviderUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedProviderUniversalId() {
            return requestedProviderUniversalId;
        }

        /**
         * Sets the value of the requestedProviderUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedProviderUniversalId(String value) {
            this.requestedProviderUniversalId = value;
        }

        /**
         * Gets the value of the requestedServiceId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestedServiceId() {
            return requestedServiceId;
        }

        /**
         * Sets the value of the requestedServiceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestedServiceId(BigInteger value) {
            this.requestedServiceId = value;
        }

        /**
         * Gets the value of the requestedServiceUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedServiceUniversalId() {
            return requestedServiceUniversalId;
        }

        /**
         * Sets the value of the requestedServiceUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedServiceUniversalId(String value) {
            this.requestedServiceUniversalId = value;
        }

        /**
         * Gets the value of the unitTypeDropDownListItemLabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitTypeDropDownListItemLabel() {
            return unitTypeDropDownListItemLabel;
        }

        /**
         * Sets the value of the unitTypeDropDownListItemLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitTypeDropDownListItemLabel(String value) {
            this.unitTypeDropDownListItemLabel = value;
        }

        /**
         * Gets the value of the unitTypeDropDownListName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitTypeDropDownListName() {
            return unitTypeDropDownListName;
        }

        /**
         * Sets the value of the unitTypeDropDownListName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitTypeDropDownListName(String value) {
            this.unitTypeDropDownListName = value;
        }

        /**
         * Gets the value of the unitTypeId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnitTypeId() {
            return unitTypeId;
        }

        /**
         * Sets the value of the unitTypeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnitTypeId(BigInteger value) {
            this.unitTypeId = value;
        }

        /**
         * Gets the value of the unitTypeUniversalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitTypeUniversalId() {
            return unitTypeUniversalId;
        }

        /**
         * Sets the value of the unitTypeUniversalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitTypeUniversalId(String value) {
            this.unitTypeUniversalId = value;
        }

        /**
         * Gets the value of the units property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnits() {
            return units;
        }

        /**
         * Sets the value of the units property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnits(BigInteger value) {
            this.units = value;
        }

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setCreatedDate(DateRange value) {
            this.createdDate = value;
        }

        /**
         * Gets the value of the lastActionDate property.
         * 
         * @return
         *     possible object is
         *     {@link DateRange }
         *     
         */
        public DateRange getLastActionDate() {
            return lastActionDate;
        }

        /**
         * Sets the value of the lastActionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateRange }
         *     
         */
        public void setLastActionDate(DateRange value) {
            this.lastActionDate = value;
        }

        /**
         * Gets the value of the queryState property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQueryState() {
            return queryState;
        }

        /**
         * Sets the value of the queryState property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQueryState(BigInteger value) {
            this.queryState = value;
        }

    }

}
