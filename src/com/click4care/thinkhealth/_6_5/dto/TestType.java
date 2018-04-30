
package com.click4care.thinkhealth._6_5.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for test_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="test_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="testBool" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="testC4cId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testCons" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="testCrtd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="testDepBool" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="testDepCons" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="testDepDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="testDepNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testDepNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="testDepSub" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="testDltddt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="testDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="testId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="testImg" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="testLasAct" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="testLasActActrtyp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="testLasActBy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="testLasActByLogdin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="testLasActTim" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="testNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="testObjStt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="testOrigcrtr" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="testOrigcrtrlogdin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="testUnivid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testVers" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="testVsbt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tssbId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="tssbLoopchld" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="tssbLoopprnt" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="tssbSub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "test_type", propOrder = {
    "classtype",
    "id",
    "testBool",
    "testC4CId",
    "testCons",
    "testCrtd",
    "testDepBool",
    "testDepCons",
    "testDepDt",
    "testDepNam",
    "testDepNum",
    "testDepSub",
    "testDltddt",
    "testDt",
    "testId",
    "testImg",
    "testLasAct",
    "testLasActActrtyp",
    "testLasActBy",
    "testLasActByLogdin",
    "testLasActTim",
    "testNam",
    "testNum",
    "testObjStt",
    "testOrigcrtr",
    "testOrigcrtrlogdin",
    "testUnivid",
    "testVers",
    "testVsbt",
    "tssbId",
    "tssbLoopchld",
    "tssbLoopprnt",
    "tssbSub"
})
public class TestType {

    protected String classtype;
    protected BigInteger id;
    protected Short testBool;
    @XmlElement(name = "testC4cId")
    protected String testC4CId;
    protected Long testCons;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar testCrtd;
    protected Short testDepBool;
    protected Long testDepCons;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar testDepDt;
    protected String testDepNam;
    protected Long testDepNum;
    protected BigInteger testDepSub;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar testDltddt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar testDt;
    protected BigDecimal testId;
    protected byte[] testImg;
    protected Long testLasAct;
    protected Long testLasActActrtyp;
    protected BigInteger testLasActBy;
    protected BigInteger testLasActByLogdin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar testLasActTim;
    protected String testNam;
    protected Long testNum;
    protected Long testObjStt;
    protected BigInteger testOrigcrtr;
    protected BigInteger testOrigcrtrlogdin;
    protected String testUnivid;
    protected BigInteger testVers;
    protected Long testVsbt;
    protected BigInteger tssbId;
    protected BigInteger tssbLoopchld;
    protected BigInteger tssbLoopprnt;
    protected String tssbSub;

    /**
     * Gets the value of the classtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasstype() {
        return classtype;
    }

    /**
     * Sets the value of the classtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasstype(String value) {
        this.classtype = value;
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
     * Gets the value of the testBool property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTestBool() {
        return testBool;
    }

    /**
     * Sets the value of the testBool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTestBool(Short value) {
        this.testBool = value;
    }

    /**
     * Gets the value of the testC4CId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestC4CId() {
        return testC4CId;
    }

    /**
     * Sets the value of the testC4CId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestC4CId(String value) {
        this.testC4CId = value;
    }

    /**
     * Gets the value of the testCons property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTestCons() {
        return testCons;
    }

    /**
     * Sets the value of the testCons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTestCons(Long value) {
        this.testCons = value;
    }

    /**
     * Gets the value of the testCrtd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTestCrtd() {
        return testCrtd;
    }

    /**
     * Sets the value of the testCrtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTestCrtd(XMLGregorianCalendar value) {
        this.testCrtd = value;
    }

    /**
     * Gets the value of the testDepBool property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTestDepBool() {
        return testDepBool;
    }

    /**
     * Sets the value of the testDepBool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTestDepBool(Short value) {
        this.testDepBool = value;
    }

    /**
     * Gets the value of the testDepCons property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTestDepCons() {
        return testDepCons;
    }

    /**
     * Sets the value of the testDepCons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTestDepCons(Long value) {
        this.testDepCons = value;
    }

    /**
     * Gets the value of the testDepDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTestDepDt() {
        return testDepDt;
    }

    /**
     * Sets the value of the testDepDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTestDepDt(XMLGregorianCalendar value) {
        this.testDepDt = value;
    }

    /**
     * Gets the value of the testDepNam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestDepNam() {
        return testDepNam;
    }

    /**
     * Sets the value of the testDepNam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestDepNam(String value) {
        this.testDepNam = value;
    }

    /**
     * Gets the value of the testDepNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTestDepNum() {
        return testDepNum;
    }

    /**
     * Sets the value of the testDepNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTestDepNum(Long value) {
        this.testDepNum = value;
    }

    /**
     * Gets the value of the testDepSub property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTestDepSub() {
        return testDepSub;
    }

    /**
     * Sets the value of the testDepSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTestDepSub(BigInteger value) {
        this.testDepSub = value;
    }

    /**
     * Gets the value of the testDltddt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTestDltddt() {
        return testDltddt;
    }

    /**
     * Sets the value of the testDltddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTestDltddt(XMLGregorianCalendar value) {
        this.testDltddt = value;
    }

    /**
     * Gets the value of the testDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTestDt() {
        return testDt;
    }

    /**
     * Sets the value of the testDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTestDt(XMLGregorianCalendar value) {
        this.testDt = value;
    }

    /**
     * Gets the value of the testId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTestId() {
        return testId;
    }

    /**
     * Sets the value of the testId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTestId(BigDecimal value) {
        this.testId = value;
    }

    /**
     * Gets the value of the testImg property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTestImg() {
        return testImg;
    }

    /**
     * Sets the value of the testImg property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTestImg(byte[] value) {
        this.testImg = value;
    }

    /**
     * Gets the value of the testLasAct property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTestLasAct() {
        return testLasAct;
    }

    /**
     * Sets the value of the testLasAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTestLasAct(Long value) {
        this.testLasAct = value;
    }

    /**
     * Gets the value of the testLasActActrtyp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTestLasActActrtyp() {
        return testLasActActrtyp;
    }

    /**
     * Sets the value of the testLasActActrtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTestLasActActrtyp(Long value) {
        this.testLasActActrtyp = value;
    }

    /**
     * Gets the value of the testLasActBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTestLasActBy() {
        return testLasActBy;
    }

    /**
     * Sets the value of the testLasActBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTestLasActBy(BigInteger value) {
        this.testLasActBy = value;
    }

    /**
     * Gets the value of the testLasActByLogdin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTestLasActByLogdin() {
        return testLasActByLogdin;
    }

    /**
     * Sets the value of the testLasActByLogdin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTestLasActByLogdin(BigInteger value) {
        this.testLasActByLogdin = value;
    }

    /**
     * Gets the value of the testLasActTim property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTestLasActTim() {
        return testLasActTim;
    }

    /**
     * Sets the value of the testLasActTim property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTestLasActTim(XMLGregorianCalendar value) {
        this.testLasActTim = value;
    }

    /**
     * Gets the value of the testNam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestNam() {
        return testNam;
    }

    /**
     * Sets the value of the testNam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestNam(String value) {
        this.testNam = value;
    }

    /**
     * Gets the value of the testNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTestNum() {
        return testNum;
    }

    /**
     * Sets the value of the testNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTestNum(Long value) {
        this.testNum = value;
    }

    /**
     * Gets the value of the testObjStt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTestObjStt() {
        return testObjStt;
    }

    /**
     * Sets the value of the testObjStt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTestObjStt(Long value) {
        this.testObjStt = value;
    }

    /**
     * Gets the value of the testOrigcrtr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTestOrigcrtr() {
        return testOrigcrtr;
    }

    /**
     * Sets the value of the testOrigcrtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTestOrigcrtr(BigInteger value) {
        this.testOrigcrtr = value;
    }

    /**
     * Gets the value of the testOrigcrtrlogdin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTestOrigcrtrlogdin() {
        return testOrigcrtrlogdin;
    }

    /**
     * Sets the value of the testOrigcrtrlogdin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTestOrigcrtrlogdin(BigInteger value) {
        this.testOrigcrtrlogdin = value;
    }

    /**
     * Gets the value of the testUnivid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestUnivid() {
        return testUnivid;
    }

    /**
     * Sets the value of the testUnivid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestUnivid(String value) {
        this.testUnivid = value;
    }

    /**
     * Gets the value of the testVers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTestVers() {
        return testVers;
    }

    /**
     * Sets the value of the testVers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTestVers(BigInteger value) {
        this.testVers = value;
    }

    /**
     * Gets the value of the testVsbt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTestVsbt() {
        return testVsbt;
    }

    /**
     * Sets the value of the testVsbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTestVsbt(Long value) {
        this.testVsbt = value;
    }

    /**
     * Gets the value of the tssbId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTssbId() {
        return tssbId;
    }

    /**
     * Sets the value of the tssbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTssbId(BigInteger value) {
        this.tssbId = value;
    }

    /**
     * Gets the value of the tssbLoopchld property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTssbLoopchld() {
        return tssbLoopchld;
    }

    /**
     * Sets the value of the tssbLoopchld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTssbLoopchld(BigInteger value) {
        this.tssbLoopchld = value;
    }

    /**
     * Gets the value of the tssbLoopprnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTssbLoopprnt() {
        return tssbLoopprnt;
    }

    /**
     * Sets the value of the tssbLoopprnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTssbLoopprnt(BigInteger value) {
        this.tssbLoopprnt = value;
    }

    /**
     * Gets the value of the tssbSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTssbSub() {
        return tssbSub;
    }

    /**
     * Sets the value of the tssbSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTssbSub(String value) {
        this.tssbSub = value;
    }

}
