package com.ustglobal.caremanager.ustcareadmin.model;

public class SupplierModel {
	private String supplierHccId;
	private String supplierName;
	private String supplierNPI;
	private String taxId;
	private String statusCode;
	private String specialty;
	private String faxNumber;
	private String phoneNumber;
	private String phoneExt;
	private String corrAddressLine;
	private String corrAddressLine2;
	private String corrAddressLine3;
	private String corrCityName;
	private String corrCountyCode;
	private String corrCountryCode;
	private String corrStateCode;
	private String corrZipCode;
	private String corrZip4Code;
	private String taxAddressLine;
	private String taxAddressLine2;
	private String taxAddressLine3;
	private String taxCityName;
	private String taxCountyCode;
	private String taxCountryCode;
	private String taxStateCode;
	private String taxZipCode;
	private String taxZip4Code;
	
	public SupplierModel(String[] line) {
		supplierHccId = line[0];
		supplierName = line[1];
		supplierNPI = line[2];
		taxId = line[3];
		statusCode = line[4];
		specialty = line[5];
		faxNumber = line[6];
		phoneNumber = line[7];
		phoneExt = line[8];
		corrAddressLine = line[9];
		corrAddressLine2 = line[10];
		corrAddressLine3 = line[11];
		corrCityName = line[12];
		corrCountyCode = line[13];
		corrCountryCode = line[14];
		corrStateCode = line[15];
		corrZipCode = line[16];
		corrZip4Code = line[17];
		taxAddressLine = line[18];
		taxAddressLine2 = line[19];
		taxAddressLine3 = line[20];
		taxCityName = line[21];
		taxCountyCode = line[22];
		taxCountryCode = line[23];
		taxStateCode = line[24];
		taxZipCode = line[25];
		taxZip4Code = line[26];
        
    }

	public String getCorrCountyCode() {
		return corrCountyCode;
	}

	public void setCorrCountyCode(String corrCountyCode) {
		this.corrCountyCode = corrCountyCode;
	}

	public String getTaxCountyCode() {
		return taxCountyCode;
	}

	public void setTaxCountyCode(String taxCountyCode) {
		this.taxCountyCode = taxCountyCode;
	}

	public String getSupplierHccId() {
		return supplierHccId;
	}

	public void setSupplierHccId(String supplierHccId) {
		this.supplierHccId = supplierHccId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierNPI() {
		return supplierNPI;
	}

	public void setSupplierNPI(String supplierNPI) {
		this.supplierNPI = supplierNPI;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneExt() {
		return phoneExt;
	}

	public void setPhoneExt(String phoneExt) {
		this.phoneExt = phoneExt;
	}

	public String getCorrAddressLine() {
		return corrAddressLine;
	}

	public void setCorrAddressLine(String corrAddressLine) {
		this.corrAddressLine = corrAddressLine;
	}

	public String getCorrAddressLine2() {
		return corrAddressLine2;
	}

	public void setCorrAddressLine2(String corrAddressLine2) {
		this.corrAddressLine2 = corrAddressLine2;
	}

	public String getCorrAddressLine3() {
		return corrAddressLine3;
	}

	public void setCorrAddressLine3(String corrAddressLine3) {
		this.corrAddressLine3 = corrAddressLine3;
	}

	public String getCorrCityName() {
		return corrCityName;
	}

	public void setCorrCityName(String corrCityName) {
		this.corrCityName = corrCityName;
	}

	public String getCorrCountryCode() {
		return corrCountryCode;
	}

	public void setCorrCountryCode(String corrCountryCode) {
		this.corrCountryCode = corrCountryCode;
	}

	public String getCorrStateCode() {
		return corrStateCode;
	}

	public void setCorrStateCode(String corrStateCode) {
		this.corrStateCode = corrStateCode;
	}

	public String getCorrZipCode() {
		return corrZipCode;
	}

	public void setCorrZipCode(String corrZipCode) {
		this.corrZipCode = corrZipCode;
	}

	public String getCorrZip4Code() {
		return corrZip4Code;
	}

	public void setCorrZip4Code(String corrZip4Code) {
		this.corrZip4Code = corrZip4Code;
	}

	public String getTaxAddressLine() {
		return taxAddressLine;
	}

	public void setTaxAddressLine(String taxAddressLine) {
		this.taxAddressLine = taxAddressLine;
	}

	public String getTaxAddressLine2() {
		return taxAddressLine2;
	}

	public void setTaxAddressLine2(String taxAddressLine2) {
		this.taxAddressLine2 = taxAddressLine2;
	}

	public String getTaxAddressLine3() {
		return taxAddressLine3;
	}

	public void setTaxAddressLine3(String taxAddressLine3) {
		this.taxAddressLine3 = taxAddressLine3;
	}

	public String getTaxCityName() {
		return taxCityName;
	}

	public void setTaxCityName(String taxCityName) {
		this.taxCityName = taxCityName;
	}

	public String getTaxCountryCode() {
		return taxCountryCode;
	}

	public void setTaxCountryCode(String taxCountryCode) {
		this.taxCountryCode = taxCountryCode;
	}

	public String getTaxStateCode() {
		return taxStateCode;
	}

	public void setTaxStateCode(String taxStateCode) {
		this.taxStateCode = taxStateCode;
	}

	public String getTaxZipCode() {
		return taxZipCode;
	}

	public void setTaxZipCode(String taxZipCode) {
		this.taxZipCode = taxZipCode;
	}

	public String getTaxZip4Code() {
		return taxZip4Code;
	}

	public void setTaxZip4Code(String taxZip4Code) {
		this.taxZip4Code = taxZip4Code;
	}


	
	

	
	
}
