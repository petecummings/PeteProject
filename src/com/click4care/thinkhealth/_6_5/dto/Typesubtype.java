
package com.click4care.thinkhealth._6_5.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typesubtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typesubtype">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.click4care.com/thinkhealth/6.5/dto}ddl_item_base_type">
 *       &lt;sequence>
 *         &lt;element name="parentTypeSubtypeUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype1DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtype2DropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typesubtype", propOrder = {
    "parentTypeSubtypeUniversalId",
    "subtype1DropDownListItemLabel",
    "subtype2DropDownListItemLabel",
    "typeDropDownListItemLabel"
})
@XmlSeeAlso({
    AssessmenttypeTypesubtype.class,
    BiometricsTypesubtype.class,
    BoilerPlateTypesubtype.class,
    CarebeanTypesubtype.class,
    CareCalculatorTypesubtype.class,
    CaseNoteTypesubtype.class,
    CategoryTypesubtype.class,
    CareplanNoteTypesubtype.class,
    ClinicalDataTypesubtype.class,
    CareManagementProjectNoteTypesubtype.class,
    CareManagementTypesubtype.class,
    CustomDiagnosisTypesubtype.class,
    EducationalContentTypesubtype.class,
    EnvelopeTypesubtype.class,
    FaxCoverTypesubtype.class,
    ImageDocumentTypesubtype.class,
    LabelTypesubtype.class,
    LetterheadTypesubtype.class,
    LetterTypesubtype.class,
    MemberGroupTypesubtype.class,
    MemberNoteTypesubtype.class,
    SentTaskNoteTypesubtype.class,
    NoticeTypesubtype.class,
    ProviderNoteTypesubtype.class,
    QueryTypesubtype.class,
    QuestionTypesubtype.class,
    ReportTemplateTypesubtype.class,
    TaskIconTypesubtype.class,
    TaskTypeTypesubtype.class,
    UmEventNoteTypesubtype.class,
    ProviderGrievanceTypesubtype.class,
    MemberGrievanceTypesubtype.class,
    GrievanceNoteTypesubtype.class,
    CaseGrievanceTypesubtype.class,
    UmEventGrievanceTypesubtype.class,
    UmTypesubtype.class
})
public abstract class Typesubtype
    extends DdlItemBaseType
{

    protected String parentTypeSubtypeUniversalId;
    protected String subtype1DropDownListItemLabel;
    protected String subtype2DropDownListItemLabel;
    protected String typeDropDownListItemLabel;

    /**
     * Gets the value of the parentTypeSubtypeUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentTypeSubtypeUniversalId() {
        return parentTypeSubtypeUniversalId;
    }

    /**
     * Sets the value of the parentTypeSubtypeUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentTypeSubtypeUniversalId(String value) {
        this.parentTypeSubtypeUniversalId = value;
    }

    /**
     * Gets the value of the subtype1DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype1DropDownListItemLabel() {
        return subtype1DropDownListItemLabel;
    }

    /**
     * Sets the value of the subtype1DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype1DropDownListItemLabel(String value) {
        this.subtype1DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the subtype2DropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype2DropDownListItemLabel() {
        return subtype2DropDownListItemLabel;
    }

    /**
     * Sets the value of the subtype2DropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype2DropDownListItemLabel(String value) {
        this.subtype2DropDownListItemLabel = value;
    }

    /**
     * Gets the value of the typeDropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDropDownListItemLabel() {
        return typeDropDownListItemLabel;
    }

    /**
     * Sets the value of the typeDropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDropDownListItemLabel(String value) {
        this.typeDropDownListItemLabel = value;
    }

}
