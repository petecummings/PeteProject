package com.ustglobal.base;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Environment {
	public static String dir;
	public static String cptfile;
	public static String icd10pcsfile;
	public static String icd10cmfile;
	public static String hcpcsfile;
	public static String ndcpackage;
	public static String ndcproduct;
	public static String isurl;
	public static String cmusr;
	public static String cmpwd;
	public static String qname1;
	public static String qname2;
	public static String processedDir;

	public Environment() {
		String localdir = System.getProperty("user.dir");
		System.out.println(localdir);
		try (FileReader reader = new FileReader(localdir + File.separatorChar + "codes.properties")) {
			Properties properties = new Properties();
			properties.load(reader);
			
			ndcpackage = properties.getProperty("code.ndcpackage");
			ndcproduct = properties.getProperty("code.ndcproduct");
			processedDir = properties.getProperty("code.processedDir");
			cptfile = properties.getProperty("code.cptfile");
			icd10pcsfile = properties.getProperty("code.icd10pcsfile");
			icd10cmfile = properties.getProperty("code.icd10cmfile");
			hcpcsfile = properties.getProperty("code.hcpcsfile");
			dir = properties.getProperty("code.directorytoscan");
			isurl = properties.getProperty("code.isurl");
			cmusr = properties.getProperty("code.cmusername");
			cmpwd = properties.getProperty("code.cmpassword");
			qname1 = properties.getProperty("code.qname1");
			qname2 = properties.getProperty("code.qname2");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getNdcpackage() {
		return ndcpackage;
	}

	public static void setNdcpackage(String ndcpackage) {
		Environment.ndcpackage = ndcpackage;
	}

	public static String getNdcproduct() {
		return ndcproduct;
	}

	public static void setNdcproduct(String ndcproduct) {
		Environment.ndcproduct = ndcproduct;
	}

	public static String getProcessedDir() {
		return processedDir;
	}

	public static void setProcessedDir(String processedDir) {
		Environment.processedDir = processedDir;
	}

	public static String getDir() {
		return dir;
	}

	

	public static String getCptfile() {
		return cptfile;
	}

	public static void setCptfile(String cptfile) {
		Environment.cptfile = cptfile;
	}

	public static String getIcd10pcsfile() {
		return icd10pcsfile;
	}

	public static void setIcd10pcsfile(String icd10pcsfile) {
		Environment.icd10pcsfile = icd10pcsfile;
	}

	public static String getIcd10cmfile() {
		return icd10cmfile;
	}

	public static void setIcd10cmfile(String icd10cmfile) {
		Environment.icd10cmfile = icd10cmfile;
	}

	public static String getHcpcsfile() {
		return hcpcsfile;
	}

	public static void setHcpcsfile(String hcpcsfile) {
		Environment.hcpcsfile = hcpcsfile;
	}

	public static void setDir(String dir) {
		Environment.dir = dir;
	}

	public static void setIsurl(String isurl) {
		Environment.isurl = isurl;
	}

	public static void setCmusr(String cmusr) {
		Environment.cmusr = cmusr;
	}

	public static void setCmpwd(String cmpwd) {
		Environment.cmpwd = cmpwd;
	}

	public static void setQname1(String qname1) {
		Environment.qname1 = qname1;
	}

	public static void setQname2(String qname2) {
		Environment.qname2 = qname2;
	}

	public static String getIsurl() {
		return isurl;
	}

	public static String getCmusr() {
		return cmusr;
	}

	public static String getCmpwd() {
		return cmpwd;
	}

	public static String getQname1() {
		return qname1;
	}

	public static String getQname2() {
		return qname2;
	}

}
