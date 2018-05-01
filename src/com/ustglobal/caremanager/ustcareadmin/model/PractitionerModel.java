package com.ustglobal.caremanager.ustcareadmin.model;

public class PractitionerModel {

	protected String practitionerId;
	protected String Pract_Key;
	protected String firstName;
	protected String middleName;
	protected String lastName;
	protected String NPI;
	protected String PCP;
	protected String OBGYN;
	protected String specialist;
	protected String practitionerRoleName;
	protected String practitionerRoleStatus;
	protected String primaryLanguage;
	protected String namePrefix;
	protected String suffixName;
	protected String gender;
	protected String firstActiveDate;
	protected String address_Line;
	protected String address_Line_2;
	protected String address_Line_3;
	protected String country;
	protected String county;
	protected String state;
	protected String city;
	protected String zipcode5;
	protected String zipcode4;
	protected String primarySpecialty;
	protected String secondarySpecialty;
	protected String phone;
	protected String phoneExtension;
	protected String ethnicity;

	public PractitionerModel(String[] line) {
		practitionerId = line[0];
		Pract_Key = line[1];
		firstName = line[2];
		middleName = line[3];
		lastName = line[4];
		NPI = line[5];
		PCP = line[6];
		OBGYN = line[7];
		specialist = line[8];
		practitionerRoleName = line[9];
		practitionerRoleStatus = line[10];
		primaryLanguage = line[11];
		namePrefix = line[12];
		suffixName = line[13];
		gender = line[14];
		firstActiveDate = line[15];
		address_Line = line[16];
		address_Line_2 = line[17];
		address_Line_3 = line[18];
		country = line[19];
		county = line[20];
		state = line[21];
		city = line[22];
		zipcode5 = line[23];
		zipcode4 = line[24];
		primarySpecialty = line[25];
		secondarySpecialty = line[26];
		phone = line[27];
		phoneExtension = line[28];
		ethnicity = line[29];
	}

	@Override
	public String toString() {
		return "PractitionerModel [practitionerId=" + practitionerId + ", Pract_Key=" + Pract_Key + ", firstName="
				+ firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", NPI=" + NPI + ", PCP=" + PCP
				+ ", OBGYN=" + OBGYN + ", specialist=" + specialist + ", practitionerRoleName=" + practitionerRoleName
				+ ", practitionerRoleStatus=" + practitionerRoleStatus + ", primaryLanguage=" + primaryLanguage
				+ ", namePrefix=" + namePrefix + ", suffixName=" + suffixName + ", gender=" + gender
				+ ", firstActiveDate=" + firstActiveDate + ", address_Line=" + address_Line + ", address_Line_2="
				+ address_Line_2 + ", address_Line_3=" + address_Line_3 + ", country=" + country + ", county=" + county
				+ ", state=" + state + ", city=" + city + ", zipcode5=" + zipcode5 + ", zipcode4=" + zipcode4
				+ ", primarySpecialty=" + primarySpecialty + ", secondarySpecialty=" + secondarySpecialty + ", phone="
				+ phone + ", phoneExtension=" + phoneExtension + ", ethnicity=" + ethnicity + "]";
	}

	public String getPractitionerId() {
		return practitionerId;
	}

	public void setPractitionerId(String practitionerId) {
		this.practitionerId = practitionerId;
	}

	public String getPract_Key() {
		return Pract_Key;
	}

	public void setPract_Key(String pract_Key) {
		Pract_Key = pract_Key;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNPI() {
		return NPI;
	}

	public void setNPI(String nPI) {
		NPI = nPI;
	}

	public String getPCP() {
		return PCP;
	}

	public void setPCP(String pCP) {
		PCP = pCP;
	}

	public String getOBGYN() {
		return OBGYN;
	}

	public void setOBGYN(String oBGYN) {
		OBGYN = oBGYN;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public String getPractitionerRoleName() {
		return practitionerRoleName;
	}

	public void setPractitionerRoleName(String practitionerRoleName) {
		this.practitionerRoleName = practitionerRoleName;
	}

	public String getPractitionerRoleStatus() {
		return practitionerRoleStatus;
	}

	public void setPractitionerRoleStatus(String practitionerRoleStatus) {
		this.practitionerRoleStatus = practitionerRoleStatus;
	}

	public String getPrimaryLanguage() {
		return primaryLanguage;
	}

	public void setPrimaryLanguage(String primaryLanguage) {
		this.primaryLanguage = primaryLanguage;
	}

	public String getNamePrefix() {
		return namePrefix;
	}

	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}

	public String getSuffixName() {
		return suffixName;
	}

	public void setSuffixName(String suffixName) {
		this.suffixName = suffixName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstActiveDate() {
		return firstActiveDate;
	}

	public void setFirstActiveDate(String firstActiveDate) {
		this.firstActiveDate = firstActiveDate;
	}

	public String getAddress_Line() {
		return address_Line;
	}

	public void setAddress_Line(String address_Line) {
		this.address_Line = address_Line;
	}

	public String getAddress_Line_2() {
		return address_Line_2;
	}

	public void setAddress_Line_2(String address_Line_2) {
		this.address_Line_2 = address_Line_2;
	}

	public String getAddress_Line_3() {
		return address_Line_3;
	}

	public void setAddress_Line_3(String address_Line_3) {
		this.address_Line_3 = address_Line_3;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode5() {
		return zipcode5;
	}

	public void setZipcode5(String zipcode5) {
		this.zipcode5 = zipcode5;
	}

	public String getZipcode4() {
		return zipcode4;
	}

	public void setZipcode4(String zipcode4) {
		this.zipcode4 = zipcode4;
	}

	public String getPrimarySpecialty() {
		return primarySpecialty;
	}

	public void setPrimarySpecialty(String primarySpecialty) {
		this.primarySpecialty = primarySpecialty;
	}

	public String getSecondarySpecialty() {
		return secondarySpecialty;
	}

	public void setSecondarySpecialty(String secondarySpecialty) {
		this.secondarySpecialty = secondarySpecialty;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoneExtension() {
		return phoneExtension;
	}

	public void setPhoneExtension(String phoneExtension) {
		this.phoneExtension = phoneExtension;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}


}
