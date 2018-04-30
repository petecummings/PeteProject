
package com.click4care.wsdl._6_5.integrationservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.click4care.thinkhealth._6_5.dto.AssessmenttypeTypesubtype;
import com.click4care.thinkhealth._6_5.dto.BiometricsTypesubtype;
import com.click4care.thinkhealth._6_5.dto.BoilerPlateTypesubtype;
import com.click4care.thinkhealth._6_5.dto.CareCalculatorTypesubtype;
import com.click4care.thinkhealth._6_5.dto.CareManagementProjectNoteTypesubtype;
import com.click4care.thinkhealth._6_5.dto.CareManagementTypesubtype;
import com.click4care.thinkhealth._6_5.dto.CarebeanTypesubtype;
import com.click4care.thinkhealth._6_5.dto.CareplanNoteTypesubtype;
import com.click4care.thinkhealth._6_5.dto.CaseNoteTypesubtype;
import com.click4care.thinkhealth._6_5.dto.CategoryTypesubtype;
import com.click4care.thinkhealth._6_5.dto.ClinicalDataTypesubtype;
import com.click4care.thinkhealth._6_5.dto.CustomDiagnosisTypesubtype;
import com.click4care.thinkhealth._6_5.dto.EducationalContentTypesubtype;
import com.click4care.thinkhealth._6_5.dto.EnvelopeTypesubtype;
import com.click4care.thinkhealth._6_5.dto.FaxCoverTypesubtype;
import com.click4care.thinkhealth._6_5.dto.ImageDocumentTypesubtype;
import com.click4care.thinkhealth._6_5.dto.LabelTypesubtype;
import com.click4care.thinkhealth._6_5.dto.LetterTypesubtype;
import com.click4care.thinkhealth._6_5.dto.LetterheadTypesubtype;
import com.click4care.thinkhealth._6_5.dto.MemberGroupTypesubtype;
import com.click4care.thinkhealth._6_5.dto.MemberNoteTypesubtype;
import com.click4care.thinkhealth._6_5.dto.NoticeTypesubtype;
import com.click4care.thinkhealth._6_5.dto.ProviderNoteTypesubtype;
import com.click4care.thinkhealth._6_5.dto.QueryTypesubtype;
import com.click4care.thinkhealth._6_5.dto.QuestionTypesubtype;
import com.click4care.thinkhealth._6_5.dto.ReportTemplateTypesubtype;
import com.click4care.thinkhealth._6_5.dto.SentTaskNoteTypesubtype;
import com.click4care.thinkhealth._6_5.dto.TaskIconTypesubtype;
import com.click4care.thinkhealth._6_5.dto.TaskTypeTypesubtype;
import com.click4care.thinkhealth._6_5.dto.UmEventNoteTypesubtype;
import com.click4care.thinkhealth._6_5.dto.UmInpatientAuthorizationTypesubtype;
import com.click4care.thinkhealth._6_5.dto.UmOutpatientAuthorizationTypesubtype;
import com.click4care.thinkhealth._6_5.dto.UmReferralTypesubtype;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="AssessmentType" type="{http://www.click4care.com/thinkhealth/6.5/dto}assessmenttype_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="BiometricsType" type="{http://www.click4care.com/thinkhealth/6.5/dto}biometrics_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="BoilerPlateType" type="{http://www.click4care.com/thinkhealth/6.5/dto}boiler_plate_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="CareBeanType" type="{http://www.click4care.com/thinkhealth/6.5/dto}carebean_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="CareCalculatorType" type="{http://www.click4care.com/thinkhealth/6.5/dto}care_calculator_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="CaseNoteType" type="{http://www.click4care.com/thinkhealth/6.5/dto}case_note_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="CarePlanCategoryType" type="{http://www.click4care.com/thinkhealth/6.5/dto}category_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="CareplanNoteType" type="{http://www.click4care.com/thinkhealth/6.5/dto}careplan_note_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="ClinicalDataType" type="{http://www.click4care.com/thinkhealth/6.5/dto}clinical_data_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="CmProjectNoteType" type="{http://www.click4care.com/thinkhealth/6.5/dto}care_management_project_note_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="CmType" type="{http://www.click4care.com/thinkhealth/6.5/dto}care_management_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="CustomDiagnosisType" type="{http://www.click4care.com/thinkhealth/6.5/dto}custom_diagnosis_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="EducationalContentType" type="{http://www.click4care.com/thinkhealth/6.5/dto}educational_content_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="EnvelopeType" type="{http://www.click4care.com/thinkhealth/6.5/dto}envelope_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="FaxCoverType" type="{http://www.click4care.com/thinkhealth/6.5/dto}fax_cover_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="ImageDocumentType" type="{http://www.click4care.com/thinkhealth/6.5/dto}image_document_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="LabelType" type="{http://www.click4care.com/thinkhealth/6.5/dto}label_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="LetterHeadType" type="{http://www.click4care.com/thinkhealth/6.5/dto}letterhead_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="LetterType" type="{http://www.click4care.com/thinkhealth/6.5/dto}letter_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="MemberGroupType" type="{http://www.click4care.com/thinkhealth/6.5/dto}member_group_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="MemberNoteType" type="{http://www.click4care.com/thinkhealth/6.5/dto}member_note_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="SentTaskNoteType" type="{http://www.click4care.com/thinkhealth/6.5/dto}sent_task_note_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="NoticeType" type="{http://www.click4care.com/thinkhealth/6.5/dto}notice_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="ProviderNoteType" type="{http://www.click4care.com/thinkhealth/6.5/dto}provider_note_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="QueryType" type="{http://www.click4care.com/thinkhealth/6.5/dto}query_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="QuestionType" type="{http://www.click4care.com/thinkhealth/6.5/dto}question_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="ReportTemplateType" type="{http://www.click4care.com/thinkhealth/6.5/dto}report_template_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="TaskIconType" type="{http://www.click4care.com/thinkhealth/6.5/dto}task_icon_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="TaskType" type="{http://www.click4care.com/thinkhealth/6.5/dto}task_type_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="UmEventNoteType" type="{http://www.click4care.com/thinkhealth/6.5/dto}um_event_note_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="UmInPatientAuthorizationType" type="{http://www.click4care.com/thinkhealth/6.5/dto}um_inpatient_authorization_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="UmOutPatientAuthorizationType" type="{http://www.click4care.com/thinkhealth/6.5/dto}um_outpatient_authorization_typesubtype" maxOccurs="unbounded"/>
 *           &lt;element name="UmReferralType" type="{http://www.click4care.com/thinkhealth/6.5/dto}um_referral_typesubtype" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="queryState" type="{http://click4care.com/wsdl/6.5/integrationServices}queryStateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "assessmentType",
    "biometricsType",
    "boilerPlateType",
    "careBeanType",
    "careCalculatorType",
    "caseNoteType",
    "carePlanCategoryType",
    "careplanNoteType",
    "clinicalDataType",
    "cmProjectNoteType",
    "cmType",
    "customDiagnosisType",
    "educationalContentType",
    "envelopeType",
    "faxCoverType",
    "imageDocumentType",
    "labelType",
    "letterHeadType",
    "letterType",
    "memberGroupType",
    "memberNoteType",
    "sentTaskNoteType",
    "noticeType",
    "providerNoteType",
    "queryType",
    "questionType",
    "reportTemplateType",
    "taskIconType",
    "taskType",
    "umEventNoteType",
    "umInPatientAuthorizationType",
    "umOutPatientAuthorizationType",
    "umReferralType",
    "queryState"
})
@XmlRootElement(name = "typesList")
public class TypesList {

    @XmlElement(name = "AssessmentType")
    protected List<AssessmenttypeTypesubtype> assessmentType;
    @XmlElement(name = "BiometricsType")
    protected List<BiometricsTypesubtype> biometricsType;
    @XmlElement(name = "BoilerPlateType")
    protected List<BoilerPlateTypesubtype> boilerPlateType;
    @XmlElement(name = "CareBeanType")
    protected List<CarebeanTypesubtype> careBeanType;
    @XmlElement(name = "CareCalculatorType")
    protected List<CareCalculatorTypesubtype> careCalculatorType;
    @XmlElement(name = "CaseNoteType")
    protected List<CaseNoteTypesubtype> caseNoteType;
    @XmlElement(name = "CarePlanCategoryType")
    protected List<CategoryTypesubtype> carePlanCategoryType;
    @XmlElement(name = "CareplanNoteType")
    protected List<CareplanNoteTypesubtype> careplanNoteType;
    @XmlElement(name = "ClinicalDataType")
    protected List<ClinicalDataTypesubtype> clinicalDataType;
    @XmlElement(name = "CmProjectNoteType")
    protected List<CareManagementProjectNoteTypesubtype> cmProjectNoteType;
    @XmlElement(name = "CmType")
    protected List<CareManagementTypesubtype> cmType;
    @XmlElement(name = "CustomDiagnosisType")
    protected List<CustomDiagnosisTypesubtype> customDiagnosisType;
    @XmlElement(name = "EducationalContentType")
    protected List<EducationalContentTypesubtype> educationalContentType;
    @XmlElement(name = "EnvelopeType")
    protected List<EnvelopeTypesubtype> envelopeType;
    @XmlElement(name = "FaxCoverType")
    protected List<FaxCoverTypesubtype> faxCoverType;
    @XmlElement(name = "ImageDocumentType")
    protected List<ImageDocumentTypesubtype> imageDocumentType;
    @XmlElement(name = "LabelType")
    protected List<LabelTypesubtype> labelType;
    @XmlElement(name = "LetterHeadType")
    protected List<LetterheadTypesubtype> letterHeadType;
    @XmlElement(name = "LetterType")
    protected List<LetterTypesubtype> letterType;
    @XmlElement(name = "MemberGroupType")
    protected List<MemberGroupTypesubtype> memberGroupType;
    @XmlElement(name = "MemberNoteType")
    protected List<MemberNoteTypesubtype> memberNoteType;
    @XmlElement(name = "SentTaskNoteType")
    protected List<SentTaskNoteTypesubtype> sentTaskNoteType;
    @XmlElement(name = "NoticeType")
    protected List<NoticeTypesubtype> noticeType;
    @XmlElement(name = "ProviderNoteType")
    protected List<ProviderNoteTypesubtype> providerNoteType;
    @XmlElement(name = "QueryType")
    protected List<QueryTypesubtype> queryType;
    @XmlElement(name = "QuestionType")
    protected List<QuestionTypesubtype> questionType;
    @XmlElement(name = "ReportTemplateType")
    protected List<ReportTemplateTypesubtype> reportTemplateType;
    @XmlElement(name = "TaskIconType")
    protected List<TaskIconTypesubtype> taskIconType;
    @XmlElement(name = "TaskType")
    protected List<TaskTypeTypesubtype> taskType;
    @XmlElement(name = "UmEventNoteType")
    protected List<UmEventNoteTypesubtype> umEventNoteType;
    @XmlElement(name = "UmInPatientAuthorizationType")
    protected List<UmInpatientAuthorizationTypesubtype> umInPatientAuthorizationType;
    @XmlElement(name = "UmOutPatientAuthorizationType")
    protected List<UmOutpatientAuthorizationTypesubtype> umOutPatientAuthorizationType;
    @XmlElement(name = "UmReferralType")
    protected List<UmReferralTypesubtype> umReferralType;
    protected BigInteger queryState;

    /**
     * Gets the value of the assessmentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssessmenttypeTypesubtype }
     * 
     * 
     */
    public List<AssessmenttypeTypesubtype> getAssessmentType() {
        if (assessmentType == null) {
            assessmentType = new ArrayList<AssessmenttypeTypesubtype>();
        }
        return this.assessmentType;
    }

    /**
     * Gets the value of the biometricsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the biometricsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiometricsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BiometricsTypesubtype }
     * 
     * 
     */
    public List<BiometricsTypesubtype> getBiometricsType() {
        if (biometricsType == null) {
            biometricsType = new ArrayList<BiometricsTypesubtype>();
        }
        return this.biometricsType;
    }

    /**
     * Gets the value of the boilerPlateType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boilerPlateType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoilerPlateType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoilerPlateTypesubtype }
     * 
     * 
     */
    public List<BoilerPlateTypesubtype> getBoilerPlateType() {
        if (boilerPlateType == null) {
            boilerPlateType = new ArrayList<BoilerPlateTypesubtype>();
        }
        return this.boilerPlateType;
    }

    /**
     * Gets the value of the careBeanType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the careBeanType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCareBeanType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarebeanTypesubtype }
     * 
     * 
     */
    public List<CarebeanTypesubtype> getCareBeanType() {
        if (careBeanType == null) {
            careBeanType = new ArrayList<CarebeanTypesubtype>();
        }
        return this.careBeanType;
    }

    /**
     * Gets the value of the careCalculatorType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the careCalculatorType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCareCalculatorType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CareCalculatorTypesubtype }
     * 
     * 
     */
    public List<CareCalculatorTypesubtype> getCareCalculatorType() {
        if (careCalculatorType == null) {
            careCalculatorType = new ArrayList<CareCalculatorTypesubtype>();
        }
        return this.careCalculatorType;
    }

    /**
     * Gets the value of the caseNoteType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseNoteType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseNoteType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaseNoteTypesubtype }
     * 
     * 
     */
    public List<CaseNoteTypesubtype> getCaseNoteType() {
        if (caseNoteType == null) {
            caseNoteType = new ArrayList<CaseNoteTypesubtype>();
        }
        return this.caseNoteType;
    }

    /**
     * Gets the value of the carePlanCategoryType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carePlanCategoryType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarePlanCategoryType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryTypesubtype }
     * 
     * 
     */
    public List<CategoryTypesubtype> getCarePlanCategoryType() {
        if (carePlanCategoryType == null) {
            carePlanCategoryType = new ArrayList<CategoryTypesubtype>();
        }
        return this.carePlanCategoryType;
    }

    /**
     * Gets the value of the careplanNoteType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the careplanNoteType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCareplanNoteType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CareplanNoteTypesubtype }
     * 
     * 
     */
    public List<CareplanNoteTypesubtype> getCareplanNoteType() {
        if (careplanNoteType == null) {
            careplanNoteType = new ArrayList<CareplanNoteTypesubtype>();
        }
        return this.careplanNoteType;
    }

    /**
     * Gets the value of the clinicalDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clinicalDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClinicalDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClinicalDataTypesubtype }
     * 
     * 
     */
    public List<ClinicalDataTypesubtype> getClinicalDataType() {
        if (clinicalDataType == null) {
            clinicalDataType = new ArrayList<ClinicalDataTypesubtype>();
        }
        return this.clinicalDataType;
    }

    /**
     * Gets the value of the cmProjectNoteType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmProjectNoteType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmProjectNoteType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CareManagementProjectNoteTypesubtype }
     * 
     * 
     */
    public List<CareManagementProjectNoteTypesubtype> getCmProjectNoteType() {
        if (cmProjectNoteType == null) {
            cmProjectNoteType = new ArrayList<CareManagementProjectNoteTypesubtype>();
        }
        return this.cmProjectNoteType;
    }

    /**
     * Gets the value of the cmType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CareManagementTypesubtype }
     * 
     * 
     */
    public List<CareManagementTypesubtype> getCmType() {
        if (cmType == null) {
            cmType = new ArrayList<CareManagementTypesubtype>();
        }
        return this.cmType;
    }

    /**
     * Gets the value of the customDiagnosisType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customDiagnosisType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomDiagnosisType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomDiagnosisTypesubtype }
     * 
     * 
     */
    public List<CustomDiagnosisTypesubtype> getCustomDiagnosisType() {
        if (customDiagnosisType == null) {
            customDiagnosisType = new ArrayList<CustomDiagnosisTypesubtype>();
        }
        return this.customDiagnosisType;
    }

    /**
     * Gets the value of the educationalContentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the educationalContentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEducationalContentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EducationalContentTypesubtype }
     * 
     * 
     */
    public List<EducationalContentTypesubtype> getEducationalContentType() {
        if (educationalContentType == null) {
            educationalContentType = new ArrayList<EducationalContentTypesubtype>();
        }
        return this.educationalContentType;
    }

    /**
     * Gets the value of the envelopeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the envelopeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvelopeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvelopeTypesubtype }
     * 
     * 
     */
    public List<EnvelopeTypesubtype> getEnvelopeType() {
        if (envelopeType == null) {
            envelopeType = new ArrayList<EnvelopeTypesubtype>();
        }
        return this.envelopeType;
    }

    /**
     * Gets the value of the faxCoverType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faxCoverType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaxCoverType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaxCoverTypesubtype }
     * 
     * 
     */
    public List<FaxCoverTypesubtype> getFaxCoverType() {
        if (faxCoverType == null) {
            faxCoverType = new ArrayList<FaxCoverTypesubtype>();
        }
        return this.faxCoverType;
    }

    /**
     * Gets the value of the imageDocumentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageDocumentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageDocumentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageDocumentTypesubtype }
     * 
     * 
     */
    public List<ImageDocumentTypesubtype> getImageDocumentType() {
        if (imageDocumentType == null) {
            imageDocumentType = new ArrayList<ImageDocumentTypesubtype>();
        }
        return this.imageDocumentType;
    }

    /**
     * Gets the value of the labelType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labelType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelTypesubtype }
     * 
     * 
     */
    public List<LabelTypesubtype> getLabelType() {
        if (labelType == null) {
            labelType = new ArrayList<LabelTypesubtype>();
        }
        return this.labelType;
    }

    /**
     * Gets the value of the letterHeadType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the letterHeadType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLetterHeadType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LetterheadTypesubtype }
     * 
     * 
     */
    public List<LetterheadTypesubtype> getLetterHeadType() {
        if (letterHeadType == null) {
            letterHeadType = new ArrayList<LetterheadTypesubtype>();
        }
        return this.letterHeadType;
    }

    /**
     * Gets the value of the letterType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the letterType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLetterType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LetterTypesubtype }
     * 
     * 
     */
    public List<LetterTypesubtype> getLetterType() {
        if (letterType == null) {
            letterType = new ArrayList<LetterTypesubtype>();
        }
        return this.letterType;
    }

    /**
     * Gets the value of the memberGroupType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberGroupType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberGroupType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberGroupTypesubtype }
     * 
     * 
     */
    public List<MemberGroupTypesubtype> getMemberGroupType() {
        if (memberGroupType == null) {
            memberGroupType = new ArrayList<MemberGroupTypesubtype>();
        }
        return this.memberGroupType;
    }

    /**
     * Gets the value of the memberNoteType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberNoteType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberNoteType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberNoteTypesubtype }
     * 
     * 
     */
    public List<MemberNoteTypesubtype> getMemberNoteType() {
        if (memberNoteType == null) {
            memberNoteType = new ArrayList<MemberNoteTypesubtype>();
        }
        return this.memberNoteType;
    }

    /**
     * Gets the value of the sentTaskNoteType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sentTaskNoteType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSentTaskNoteType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SentTaskNoteTypesubtype }
     * 
     * 
     */
    public List<SentTaskNoteTypesubtype> getSentTaskNoteType() {
        if (sentTaskNoteType == null) {
            sentTaskNoteType = new ArrayList<SentTaskNoteTypesubtype>();
        }
        return this.sentTaskNoteType;
    }

    /**
     * Gets the value of the noticeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noticeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoticeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoticeTypesubtype }
     * 
     * 
     */
    public List<NoticeTypesubtype> getNoticeType() {
        if (noticeType == null) {
            noticeType = new ArrayList<NoticeTypesubtype>();
        }
        return this.noticeType;
    }

    /**
     * Gets the value of the providerNoteType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerNoteType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderNoteType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderNoteTypesubtype }
     * 
     * 
     */
    public List<ProviderNoteTypesubtype> getProviderNoteType() {
        if (providerNoteType == null) {
            providerNoteType = new ArrayList<ProviderNoteTypesubtype>();
        }
        return this.providerNoteType;
    }

    /**
     * Gets the value of the queryType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryTypesubtype }
     * 
     * 
     */
    public List<QueryTypesubtype> getQueryType() {
        if (queryType == null) {
            queryType = new ArrayList<QueryTypesubtype>();
        }
        return this.queryType;
    }

    /**
     * Gets the value of the questionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionTypesubtype }
     * 
     * 
     */
    public List<QuestionTypesubtype> getQuestionType() {
        if (questionType == null) {
            questionType = new ArrayList<QuestionTypesubtype>();
        }
        return this.questionType;
    }

    /**
     * Gets the value of the reportTemplateType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportTemplateType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportTemplateType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportTemplateTypesubtype }
     * 
     * 
     */
    public List<ReportTemplateTypesubtype> getReportTemplateType() {
        if (reportTemplateType == null) {
            reportTemplateType = new ArrayList<ReportTemplateTypesubtype>();
        }
        return this.reportTemplateType;
    }

    /**
     * Gets the value of the taskIconType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskIconType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskIconType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskIconTypesubtype }
     * 
     * 
     */
    public List<TaskIconTypesubtype> getTaskIconType() {
        if (taskIconType == null) {
            taskIconType = new ArrayList<TaskIconTypesubtype>();
        }
        return this.taskIconType;
    }

    /**
     * Gets the value of the taskType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskTypeTypesubtype }
     * 
     * 
     */
    public List<TaskTypeTypesubtype> getTaskType() {
        if (taskType == null) {
            taskType = new ArrayList<TaskTypeTypesubtype>();
        }
        return this.taskType;
    }

    /**
     * Gets the value of the umEventNoteType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the umEventNoteType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUmEventNoteType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UmEventNoteTypesubtype }
     * 
     * 
     */
    public List<UmEventNoteTypesubtype> getUmEventNoteType() {
        if (umEventNoteType == null) {
            umEventNoteType = new ArrayList<UmEventNoteTypesubtype>();
        }
        return this.umEventNoteType;
    }

    /**
     * Gets the value of the umInPatientAuthorizationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the umInPatientAuthorizationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUmInPatientAuthorizationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UmInpatientAuthorizationTypesubtype }
     * 
     * 
     */
    public List<UmInpatientAuthorizationTypesubtype> getUmInPatientAuthorizationType() {
        if (umInPatientAuthorizationType == null) {
            umInPatientAuthorizationType = new ArrayList<UmInpatientAuthorizationTypesubtype>();
        }
        return this.umInPatientAuthorizationType;
    }

    /**
     * Gets the value of the umOutPatientAuthorizationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the umOutPatientAuthorizationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUmOutPatientAuthorizationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UmOutpatientAuthorizationTypesubtype }
     * 
     * 
     */
    public List<UmOutpatientAuthorizationTypesubtype> getUmOutPatientAuthorizationType() {
        if (umOutPatientAuthorizationType == null) {
            umOutPatientAuthorizationType = new ArrayList<UmOutpatientAuthorizationTypesubtype>();
        }
        return this.umOutPatientAuthorizationType;
    }

    /**
     * Gets the value of the umReferralType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the umReferralType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUmReferralType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UmReferralTypesubtype }
     * 
     * 
     */
    public List<UmReferralTypesubtype> getUmReferralType() {
        if (umReferralType == null) {
            umReferralType = new ArrayList<UmReferralTypesubtype>();
        }
        return this.umReferralType;
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
