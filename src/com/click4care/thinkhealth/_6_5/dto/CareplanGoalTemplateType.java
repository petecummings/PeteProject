
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.click4care.thinkhealth.core.dto.TypeOfVisibility;


/**
 * <p>Java class for careplanGoalTemplate_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="careplanGoalTemplate_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="action" type="{http://www.click4care.com/thinkhealth/6.5/dto}careplanActionTemplate_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="authorUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categories" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="category" type="{http://www.click4care.com/thinkhealth/6.5/dto}category_typesubtype" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropDownListItemId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="dropDownListItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropDownListItemUniversalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://www.click4care.com/thinkhealth/core/dto}typeOfVisibility" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "careplanGoalTemplate_type", propOrder = {
    "actions",
    "author",
    "authorUniversalId",
    "c4CId",
    "categories",
    "comments",
    "createdDate",
    "deletedDate",
    "description",
    "dropDownListItemId",
    "dropDownListItemLabel",
    "dropDownListItemUniversalId",
    "id",
    "lastActionDate",
    "name",
    "universalId",
    "version",
    "visibility"
})
public class CareplanGoalTemplateType {

    protected CareplanGoalTemplateType.Actions actions;
    protected BigInteger author;
    protected String authorUniversalId;
    @XmlElement(name = "c4cId")
    protected String c4CId;
    protected CareplanGoalTemplateType.Categories categories;
    protected String comments;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    protected String description;
    protected BigInteger dropDownListItemId;
    protected String dropDownListItemLabel;
    protected String dropDownListItemUniversalId;
    protected BigInteger id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActionDate;
    protected String name;
    protected String universalId;
    protected BigInteger version;
    @XmlSchemaType(name = "string")
    protected TypeOfVisibility visibility;

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link CareplanGoalTemplateType.Actions }
     *     
     */
    public CareplanGoalTemplateType.Actions getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareplanGoalTemplateType.Actions }
     *     
     */
    public void setActions(CareplanGoalTemplateType.Actions value) {
        this.actions = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthor(BigInteger value) {
        this.author = value;
    }

    /**
     * Gets the value of the authorUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorUniversalId() {
        return authorUniversalId;
    }

    /**
     * Sets the value of the authorUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorUniversalId(String value) {
        this.authorUniversalId = value;
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
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link CareplanGoalTemplateType.Categories }
     *     
     */
    public CareplanGoalTemplateType.Categories getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareplanGoalTemplateType.Categories }
     *     
     */
    public void setCategories(CareplanGoalTemplateType.Categories value) {
        this.categories = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the deletedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeletedDate() {
        return deletedDate;
    }

    /**
     * Sets the value of the deletedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeletedDate(XMLGregorianCalendar value) {
        this.deletedDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the dropDownListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDropDownListItemId() {
        return dropDownListItemId;
    }

    /**
     * Sets the value of the dropDownListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDropDownListItemId(BigInteger value) {
        this.dropDownListItemId = value;
    }

    /**
     * Gets the value of the dropDownListItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropDownListItemLabel() {
        return dropDownListItemLabel;
    }

    /**
     * Sets the value of the dropDownListItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropDownListItemLabel(String value) {
        this.dropDownListItemLabel = value;
    }

    /**
     * Gets the value of the dropDownListItemUniversalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropDownListItemUniversalId() {
        return dropDownListItemUniversalId;
    }

    /**
     * Sets the value of the dropDownListItemUniversalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropDownListItemUniversalId(String value) {
        this.dropDownListItemUniversalId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the lastActionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastActionDate() {
        return lastActionDate;
    }

    /**
     * Sets the value of the lastActionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastActionDate(XMLGregorianCalendar value) {
        this.lastActionDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the universalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalId() {
        return universalId;
    }

    /**
     * Sets the value of the universalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalId(String value) {
        this.universalId = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfVisibility }
     *     
     */
    public TypeOfVisibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfVisibility }
     *     
     */
    public void setVisibility(TypeOfVisibility value) {
        this.visibility = value;
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
     *       &lt;sequence>
     *         &lt;element name="action" type="{http://www.click4care.com/thinkhealth/6.5/dto}careplanActionTemplate_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "action"
    })
    public static class Actions {

        @XmlElement(nillable = true)
        protected List<CareplanActionTemplateType> action;

        /**
         * Gets the value of the action property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the action property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CareplanActionTemplateType }
         * 
         * 
         */
        public List<CareplanActionTemplateType> getAction() {
            if (action == null) {
                action = new ArrayList<CareplanActionTemplateType>();
            }
            return this.action;
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
     *       &lt;sequence>
     *         &lt;element name="category" type="{http://www.click4care.com/thinkhealth/6.5/dto}category_typesubtype" maxOccurs="unbounded" minOccurs="0"/>
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
        "category"
    })
    public static class Categories {

        @XmlElement(nillable = true)
        protected List<CategoryTypesubtype> category;

        /**
         * Gets the value of the category property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the category property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CategoryTypesubtype }
         * 
         * 
         */
        public List<CategoryTypesubtype> getCategory() {
            if (category == null) {
                category = new ArrayList<CategoryTypesubtype>();
            }
            return this.category;
        }

    }

}
