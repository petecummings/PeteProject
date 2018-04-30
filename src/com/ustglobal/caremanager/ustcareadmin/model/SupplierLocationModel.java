package com.ustglobal.caremanager.ustcareadmin.model;

public class SupplierLocationModel {
	private String supplierLocationHccId;
	private String supplierHccId;
	private String supplierLocationName;
	private String supplierLocationNPI;
	private String statusCode;
	private String faxNumber;
	private String phoneNumber;
	private String phoneExt;
	private String AddressLine;
	private String AddressLine2;
	private String AddressLine3;
	private String CityName;
	private String CountyCode;
	private String CountryCode;
	private String StateCode;
	private String ZipCode;
	private String Zip4Code;
	private String isPrimaryLocation;
	private String isHospital;
	private String phoneCountryCode;
	private String phoneAreaCode;
	private String mainPhoneNumber;
	
	
	public SupplierLocationModel(String[] line) {
		supplierLocationHccId = line[0];
		supplierLocationName = line[1];
		supplierLocationNPI = line[2];
		statusCode = line[3];
		faxNumber = line[4];
		phoneNumber = line[5];
		phoneExt = line[6];
		AddressLine = line[7];
		AddressLine2 = line[8];
		AddressLine3 = line[9];
		CityName = line[10];
		CountyCode = line[11];
		CountryCode = line[12];
		StateCode = line[13];
		ZipCode = line[14];
		Zip4Code = line[15];
		isPrimaryLocation = line[16];
		isHospital = line[17];
		phoneCountryCode = line[18];
		phoneAreaCode = line[19];
		mainPhoneNumber = line[20];
		supplierHccId = line[21];        
    }


	public String getSupplierHccId() {
		return supplierHccId;
	}


	public void setSupplierHccId(String supplierHccId) {
		this.supplierHccId = supplierHccId;
	}


	public String getPhoneCountryCode() {
		return phoneCountryCode;
	}


	public void setPhoneCountryCode(String phoneCountryCode) {
		this.phoneCountryCode = phoneCountryCode;
	}


	public String getPhoneAreaCode() {
		return phoneAreaCode;
	}


	public void setPhoneAreaCode(String phoneAreaCode) {
		this.phoneAreaCode = phoneAreaCode;
	}


	public String getSupplierLocationHccId() {
		return supplierLocationHccId;
	}


	public void setSupplierLocationHccId(String supplierLocationHccId) {
		this.supplierLocationHccId = supplierLocationHccId;
	}


	public String getSupplierLocationName() {
		return supplierLocationName;
	}


	public void setSupplierLocationName(String supplierLocationName) {
		this.supplierLocationName = supplierLocationName;
	}


	public String getSupplierLocationNPI() {
		return supplierLocationNPI;
	}


	public void setSupplierLocationNPI(String supplierLocationNPI) {
		this.supplierLocationNPI = supplierLocationNPI;
	}


	public String getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
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


	public String getAddressLine() {
		return AddressLine;
	}


	public void setAddressLine(String addressLine) {
		AddressLine = addressLine;
	}


	public String getAddressLine2() {
		return AddressLine2;
	}


	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}


	public String getAddressLine3() {
		return AddressLine3;
	}


	public void setAddressLine3(String addressLine3) {
		AddressLine3 = addressLine3;
	}


	public String getCityName() {
		return CityName;
	}


	public void setCityName(String cityName) {
		CityName = cityName;
	}


	public String getCountyCode() {
		return CountyCode;
	}


	public void setCountyCode(String countyCode) {
		CountyCode = countyCode;
	}


	public String getCountryCode() {
		return CountryCode;
	}


	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}


	public String getStateCode() {
		return StateCode;
	}


	public void setStateCode(String stateCode) {
		StateCode = stateCode;
	}


	public String getZipCode() {
		return ZipCode;
	}


	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}


	public String getZip4Code() {
		return Zip4Code;
	}


	public void setZip4Code(String zip4Code) {
		Zip4Code = zip4Code;
	}


	public String getIsPrimaryLocation() {
		return isPrimaryLocation;
	}


	public void setIsPrimaryLocation(String isPrimaryLocation) {
		this.isPrimaryLocation = isPrimaryLocation;
	}


	public String getIsHospital() {
		return isHospital;
	}


	public void setIsHospital(String isHospital) {
		this.isHospital = isHospital;
	}


	public String getMainPhoneNumber() {
		return mainPhoneNumber;
	}


	public void setMainPhoneNumber(String mainPhoneNumber) {
		this.mainPhoneNumber = mainPhoneNumber;
	}

	
}