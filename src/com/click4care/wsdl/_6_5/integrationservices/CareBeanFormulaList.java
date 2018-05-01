
package com.click4care.wsdl._6_5.integrationservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.click4care.thinkhealth._6_5.dto.CareBeanFormulaType;


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
 *         &lt;element name="careBeanFormulas" type="{http://www.click4care.com/thinkhealth/6.5/dto}care_bean_formula_type" maxOccurs="unbounded" minOccurs="0"/>
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
    "careBeanFormulas",
    "queryState"
})
@XmlRootElement(name = "careBeanFormulaList")
public class CareBeanFormulaList {

    protected List<CareBeanFormulaType> careBeanFormulas;
    protected BigInteger queryState;

    /**
     * Gets the value of the careBeanFormulas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the careBeanFormulas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCareBeanFormulas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CareBeanFormulaType }
     * 
     * 
     */
    public List<CareBeanFormulaType> getCareBeanFormulas() {
        if (careBeanFormulas == null) {
            careBeanFormulas = new ArrayList<CareBeanFormulaType>();
        }
        return this.careBeanFormulas;
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
