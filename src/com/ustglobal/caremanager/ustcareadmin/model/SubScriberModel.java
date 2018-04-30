package com.ustglobal.caremanager.ustcareadmin.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SubScriberModel {
	
	
	private String isSubscriber;
	private String ssn;
	private String lastName;
	private String firstName;
	private String middleName;
	private Date dob;
	private String gender;
	private String resStreetAddress;
	private String resCity;
	private String resState;
	private String resZipCode;
	private String resCounty;
	private String resHomePhoneNumber;
	private String bphccId;
	private Date enrollmentStartDate;
	private String subscriberhccId;
	private String accounthccId;
	private String memberId;
	private String streetAddress2;
	private String streetAddress3;
	private String zipCode4;
	private String countryCode;
	private String emailAddress;
	private String mailingAddressStreet1;
	private String mailingAddressStreet2;
	private String mailingAddressStreet3;
	private String mailingCity;
	private String mailingState;
	private String mailingZip;
	private String mailingZip4;
	private String mailingCounty;
	private String mailingCountry;
	private String headOfHouseIndividualKey;
	private Date enrollmentEndDate;
	private String relationshipToSubscriber;
	private String isMemberVIP;
	private String languageCode;

	
	
	public SubScriberModel() {
		 

/*
	    		*******************LATEST AND GREATEST************************
	  	  SELECT
		          CASE
		            WHEN MBR.rltp_to_subscriber_key = 15
		            THEN 'Y'
		            ELSE 'N'
		          END                                    AS isSubscriber ,
		          MBR.tax_id                             AS Social_Security_Number ,
		          MBR.member_last_name                   AS Last_Name ,
		          MBR.member_first_name                  AS First_Name ,
		          MBR.member_middle_name                 AS Middle_Name ,
		          DATE_DOB.DATE_Name_2                   AS Date_of_Birth ,
		          MBR.member_gender_code                 AS Gender_Code ,
		          ADDR1.ADDRESS_LINE                     AS Residential_Street_Address_One ,
		          ADDR1.CITY_NAME                        AS Residential_City ,
		          ADDR1.STATE_CODE                       AS Residential_State ,
		          ADDR1.ZIP_CODE                         AS Residential_Zip_Code ,
		          CNTY.COUNTY_NAME                       AS Residential_County_Code ,
		          mbr.telephone_number                   AS residential_home_phone ,
		          BP.BENEFIT_PLAN_HCC_ID                                           AS Benefit_Plan_hcc_id,
		          BP_START_DT.DATE_Name_2                                          AS Coverage_Effective_Date ,
		          MBR.subscription_hcc_id                                          AS Subscriber_ID ,
		          ACCT.account_hcc_id                                             AS Account_ID ,
		          MBR.member_hcc_id                                                AS Member_ID ,
		          ADDR1.ADDRESS_LINE_2                                             AS Street_Address_Two ,
		          ADDR1.ADDRESS_LINE_3                                             AS Street_Address_Three ,
		          ADDR1.ZIP_4_code                                                 AS Zip_Code_4 ,
		          ADDR1.COUNTRY_CODE                                               AS Country_Code ,
		          MBR.email_address                                                AS Email_Address ,
		          mail_addr.ADDRESS_LINE                                           AS Mailing_Street_Address_One ,
		          mail_addr.ADDRESS_LINE_2                                         AS Mailing_Street_Address_Two ,
		          mail_addr.ADDRESS_LINE_3                                         AS Mailing_Street_Address_Three ,
		          mail_addr.CITY_NAME                                              AS Mailing_Street_City ,
		          mail_addr.STATE_CODE                                             AS Mailing_Street_State ,
		          mail_addr.ZIP_CODE                                               AS Mailing_Street_Zip_Code ,
		          mail_addr.ZIP_4_CODE                                             AS Mailing_Street_Zip_Code_4 ,
		          mail_addr.COUNTY_CODE                                            AS Mailing_Street_County_Code ,
		          mail_addr.COUNTRY_CODE                                           AS Mailing_Street_Country_Code ,
		          mbr.head_of_house_individual_key								AS HeadOfHouseIndividualKey,
                  CASE
		            WHEN BP_END_DT.DATE_Name_2 = ''
		            THEN ''
		            ELSE bp_end_dt.date_name_2
		          END                                                 AS coverage_end_date,
                  RLTP_SUBS.rltp_to_subscriber_name             AS RelationshipToSubscriber,
                  mbr.IS_VIP                                    AS IsMemberVIP,
                  lang.language_domain_name                                    AS PrimaryLanguage,
                  lang2.language_domain_name                                    AS NativeLanguage
                  --lob.line_of_business_key                                          AS lobKey,
                 -- prod.product_hcc_id                                               AS productHccId
		          FROM hr_dwh.member MBR
		         INNER JOIN hr_dwh.account ACCT
		         ON MBR.account_key = ACCT.account_key
                 inner join hr_dwh.language_code lang
                 on lang.language_domain_key = mbr.PRIMARY_LANGUAGE_CODE
                 left outer join hr_dwh.language_code lang2
                 on lang2.language_domain_key = mbr.NATIVE_LANGUAGE_CODE
		         INNER JOIN hr_dwh.account ACCTP
		         ON ACCT.top_account_key = ACCTP.account_key
		         INNER JOIN hr_dwh.rltp_to_subscriber RLTP_SUBS
		         ON MBR.rltp_to_subscriber_key = RLTP_SUBS.rltp_to_subscriber_key
		         INNER JOIN hr_dwh.date_dimension DATE_DOB
		         ON mbr.member_birth_date_key = date_dob.date_key
		         LEFT OUTER JOIN hr_dwh.POSTAL_ADDRESS ADDR1
		         ON MBR.MEMBER_HOME_ADDRESS_KEY = ADDR1.POSTAL_ADDRESS_KEY
		         LEFT OUTER JOIN hr_dwh.COUNTY_CODE CNTY
		         ON addr1.county_code = cnty.county_code
		         LEFT OUTER JOIN
		          (SELECT udt.member_history_fact_key,
		            MAX (
		            CASE
		              WHEN udt_val.member_udt_attr_name = 'Waiting Period'
		              THEN udt_val.member_udt_attr_name
		            END) AS outofarea
		          FROM hr_dwh.member_to_member_udt udt
		          INNER JOIN hr_dwh.member_udt_value udt_val
		          ON udt.member_udt_key = udt_val.member_udt_key
		          GROUP BY udt.member_history_fact_key
		          ) member_udt ON mbr.member_history_fact_key = member_udt.member_history_fact_key
		         LEFT OUTER JOIN hr_dwh.date_dimension DATE_HIRE_DT
		         ON mbr.hire_date_key = date_hire_dt.date_key
		         LEFT OUTER JOIN hr_dwh.MEMBER_PLAN_SELECTION MBR_BP
		         ON mbr.member_key = mbr_bp.member_key
		         LEFT OUTER JOIN hr_dwh.benefit_plan bp
		         ON BP.BENEFIT_PLAN_KEY = MBR_BP.BENEFIT_PLAN_KEY
                 left outer join hr_dwh.product prod 
                 on bp.benefit_plan_product_key = prod.product_key
		         LEFT OUTER JOIN hr_dwh.MEMBER_HIST_FACT_TO_BNFT_PLAN MBR_BP_HIST
		         ON MBR_BP_HIST.MEMBER_HISTORY_FACT_KEY = MBR.MEMBER_HISTORY_FACT_KEY
		         AND mbr_bp_hist.benefit_plan_key       = mbr_bp.benefit_plan_key
		         LEFT OUTER JOIN hr_dwh.date_dimension BP_START_DT
		         ON mbr_bp.start_date_key = bp_start_dt.date_key
		         LEFT OUTER JOIN hr_dwh.date_dimension BP_END_DT
		         ON mbr_bp.end_date_key = bp_end_dt.date_key
		         LEFT OUTER JOIN hr_dwh.date_dimension disability_date
		         ON MBR.disability_reported_date_key = disability_date.DATE_KEY
		         LEFT OUTER JOIN
		          (SELECT MBR_CNCT_INFO.MEMBER_HISTORY_FACT_KEY,
		            POSTAL_ADDR.*
		          FROM hr_dwh.MEMBER_HIST_FCT_TO_CONTCT_INFO MBR_CNCT_INFO
		          INNER JOIN hr_dwh.CONTACT_INFORMATION CNCT_INFO
		          ON MBR_CNCT_INFO.CONTACT_INFO_KEY = CNCT_INFO.CONTACT_INFO_KEY
		          INNER JOIN hr_dwh.CONTACT_INFORMATION_TYPE CNCT_INFO_TYPE
		          ON CNCT_INFO_TYPE.CONTACT_INFORMATION_TYPE_KEY = CNCT_INFO.CONTACT_INFORMATION_TYPE_KEY
		          AND CNCT_INFO_TYPE.CONTACT_INFO_TYPE_CODE      = 'General'
		          INNER JOIN hr_dwh.CONTACT_ADDRESS_INFORMATION CNCT_ADDR_INFO
		          ON CNCT_ADDR_INFO.ADDRESS_INFO_KEY = CNCT_INFO.ADDRESS_INFO_KEY
		          INNER JOIN hr_dwh.CONTACT_POSTAL_ADDRESS POSTAL_ADDR
		          ON CNCT_ADDR_INFO.POSTAL_ADDRESS_KEY             = POSTAL_ADDR.POSTAL_ADDRESS_KEY
		          ) mail_addr ON mail_addr.member_history_fact_key = mbr.member_history_fact_key
		         LEFT OUTER JOIN
		          (SELECT m.member_key              AS oic_member_key,
		            oic.case_status_code            AS oic_case_status,
		            eff_date.date_value             AS oic_eff_dt,
		            term_date.date_value            AS oic_term_dt,
		            oi.other_insurance_company_name AS oic_company_nme,
		            oic.other_ins_priority          AS oic_priority,
		            oic.other_ins_reason            AS oic_reason,
		            oic.plan_id                     AS oic_plan_id,
		            oic.plan_name                   AS oic_plan_nme,
		            oic.policy_type_code            AS oic_policy_type
		          FROM hr_dwh.member m
		          INNER JOIN hr_dwh.OTHER_INSURANCE_COVERAGE oic
		          ON oic.member_key = m.member_key
		          LEFT OUTER JOIN hr_dwh.OTHER_INSURANCE_COMPANY oi
		          ON oic.other_insurance_company_key = oi.other_insurance_company_key
		          INNER JOIN hr_dwh.date_dimension version_eff
		          ON oic.version_eff_date_key = version_eff.date_key
		          INNER JOIN hr_dwh.date_dimension eff_date
		          ON oic.effective_date_key = eff_date.date_key
		          INNER JOIN hr_dwh.date_dimension term_date
		          ON oic.TERMINATION_DATE_KEY  = term_date.date_key
		          WHERE version_eff.date_value =
		            (SELECT MAX(version_eff1.date_value)
		            FROM hr_dwh.other_insurance_coverage oic1
		            INNER JOIN hr_dwh.date_dimension version_eff1
		            ON oic1.version_eff_date_key = version_eff1.date_key
		            WHERE oic1.member_key        = oic.member_key
		            )
		          AND term_date.date_value >= to_date('2017-07-01','yyyy-mm-dd')
		          ) COB ON mbr.member_key   = COB.oic_member_key
		         WHERE 
	    		    acctp.account_hcc_id = 'IU2013'  
                    --mbr.is_vip = 'Y'
	    		 ORDER BY
	    		    acctp.account_hcc_id, 
	    		    mbr.member_hcc_id
	    		*
	    		*/
		
	}
	
	public SubScriberModel(ResultSet line) throws SQLException {
		isSubscriber = line.getString(1);
		ssn = line.getString(2);
		lastName = line.getString(3);
		firstName = line.getString(4);
		middleName = line.getString(5);
		dob = line.getDate(6);
		gender = line.getString(7);
		resStreetAddress = line.getString(8);
		resCity = line.getString(9);
		resState = line.getString(10);
		resZipCode = line.getString(11);
		resCounty = line.getString(12);
		resHomePhoneNumber = line.getString(13);
		bphccId = line.getString(14);
		enrollmentStartDate = line.getDate(15);
		subscriberhccId = line.getString(16);
		accounthccId = line.getString(17);
		memberId = line.getString(18);
		streetAddress2 = line.getString(19);
		streetAddress3 = line.getString(20);
		zipCode4 = line.getString(21);
		countryCode = line.getString(22);
		emailAddress = line.getString(23);
		mailingAddressStreet1 = line.getString(24);
		mailingAddressStreet2 = line.getString(25);
		mailingAddressStreet3 = line.getString(26);
		mailingCity = line.getString(27);
		mailingState = line.getString(28);
		mailingZip = line.getString(29);
		mailingZip4 = line.getString(30);
		mailingCounty = line.getString(31);
		mailingCountry = line.getString(32);
		headOfHouseIndividualKey = line.getString(33);
		if(line.getString(34) != null) {
		enrollmentEndDate = line.getDate(34);
		}
		relationshipToSubscriber = line.getString(35);
		isMemberVIP = line.getString(36);
		languageCode = line.getString(37);
	
	}


	public SubScriberModel(String[] line) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		//line.split(Pattern.quote("."));
		//line.split(Pattern.quote(","));
        
		//String[] split = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		isSubscriber = line[0];
		ssn = line[1];
		lastName = line[2];
		firstName = line[3];
		middleName = line[4];
		if(!line[5].equalsIgnoreCase("not specified")) {
		dob = formatter.parse(line[5]);
		}
		
		gender = line[6];
		resStreetAddress = line[7];
		resCity = line[8];
		resState = line[9];
		resZipCode = line[10];
		resCounty = line[11];
		resHomePhoneNumber = line[12];
		bphccId = line[13];
		if(!line[14].isEmpty()) {
		enrollmentStartDate = formatter.parse(line[14]);
		}
		subscriberhccId = line[15];
		accounthccId = line[16];
		memberId = line[17];
		streetAddress2 = line[18];
		streetAddress3 = line[19];
		zipCode4 = line[20];
		countryCode = line[21];
		emailAddress = line[22];
		mailingAddressStreet1 = line[23];
		mailingAddressStreet2 = line[24];
		mailingAddressStreet3 = line[25];
		mailingCity = line[26];
		mailingState = line[27];
		mailingZip = line[28];
		mailingZip4 = line[29];
		mailingCounty = line[30];
		mailingCountry = line[31];
		headOfHouseIndividualKey = line[32];
		if(line[33].equalsIgnoreCase("end of time") || line[33].equalsIgnoreCase("Not Specified")) {
			enrollmentEndDate = formatter.parse("01/01/2999");
		}
		else if(!line[33].isEmpty()) {
		enrollmentEndDate = formatter.parse(line[33]);
		}
		relationshipToSubscriber = line[34];
		isMemberVIP = line[35];
		languageCode = line[36];
        
    }
	
	

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getIsMemberVIP() {
		return isMemberVIP;
	}

	public void setIsMemberVIP(String isMemberVIP) {
		this.isMemberVIP = isMemberVIP;
	}

	public String getRelationshipToSubscriber() {
		return relationshipToSubscriber;
	}

	public void setRelationshipToSubscriber(String relationshipToSubscriber) {
		this.relationshipToSubscriber = relationshipToSubscriber;
	}

	public String getHeadOfHouseIndividualKey() {
		return headOfHouseIndividualKey;
	}


	public void setHeadOfHouseIndividualKey(String headOfHouseIndividualKey) {
		this.headOfHouseIndividualKey = headOfHouseIndividualKey;
	}

	public String getMailingCounty() {
		return mailingCounty;
	}


	public void setMailingCounty(String mailingCounty) {
		this.mailingCounty = mailingCounty;
	}


	public String getMailingCountry() {
		return mailingCountry;
	}


	public void setMailingCountry(String mailingCountry) {
		this.mailingCountry = mailingCountry;
	}


	public String getIsSubscriber() {
		return isSubscriber;
	}


	public void setIsSubscriber(String isSubscriber) {
		this.isSubscriber = isSubscriber;
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


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public String getResStreetAddress() {
		return resStreetAddress;
	}


	public void setResStreetAddress(String resStreetAddress) {
		this.resStreetAddress = resStreetAddress;
	}


	public String getResCity() {
		return resCity;
	}


	public void setResCity(String resCity) {
		this.resCity = resCity;
	}


	public String getResState() {
		return resState;
	}


	public void setResState(String resState) {
		this.resState = resState;
	}


	public String getResZipCode() {
		return resZipCode;
	}


	public void setResZipCode(String resZipCode) {
		this.resZipCode = resZipCode;
	}


	public String getResCounty() {
		return resCounty;
	}


	public void setResCounty(String resCounty) {
		this.resCounty = resCounty;
	}


	public String getResHomePhoneNumber() {
		return resHomePhoneNumber;
	}


	public void setResHomePhoneNumber(String resHomePhoneNumber) {
		this.resHomePhoneNumber = resHomePhoneNumber;
	}


	public String getBphccId() {
		return bphccId;
	}


	public void setBphccId(String bphccId) {
		this.bphccId = bphccId;
	}


	public String getSubscriberhccId() {
		return subscriberhccId;
	}


	public void setSubscriberhccId(String subscriberhccId) {
		this.subscriberhccId = subscriberhccId;
	}


	public String getAccounthccId() {
		return accounthccId;
	}


	public void setAccounthccId(String accounthccId) {
		this.accounthccId = accounthccId;
	}


	public String getMemberId() {
		return memberId;
	}


	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}


	public String getStreetAddress2() {
		return streetAddress2;
	}


	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}


	public String getStreetAddress3() {
		return streetAddress3;
	}


	public void setStreetAddress3(String streetAddress3) {
		this.streetAddress3 = streetAddress3;
	}


	public String getZipCode4() {
		return zipCode4;
	}


	public void setZipCode4(String zipCode4) {
		this.zipCode4 = zipCode4;
	}


	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}



	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getMailingAddressStreet1() {
		return mailingAddressStreet1;
	}


	public void setMailingAddressStreet1(String mailingAddressStreet1) {
		this.mailingAddressStreet1 = mailingAddressStreet1;
	}


	public String getMailingAddressStreet2() {
		return mailingAddressStreet2;
	}


	public void setMailingAddressStreet2(String mailingAddressStreet2) {
		this.mailingAddressStreet2 = mailingAddressStreet2;
	}


	public String getMailingAddressStreet3() {
		return mailingAddressStreet3;
	}


	public void setMailingAddressStreet3(String mailingAddressStreet3) {
		this.mailingAddressStreet3 = mailingAddressStreet3;
	}


	public String getMailingCity() {
		return mailingCity;
	}


	public void setMailingCity(String mailingCity) {
		this.mailingCity = mailingCity;
	}


	public String getMailingState() {
		return mailingState;
	}


	public void setMailingState(String mailingState) {
		this.mailingState = mailingState;
	}


	public String getMailingZip() {
		return mailingZip;
	}


	public void setMailingZip(String mailingZip) {
		this.mailingZip = mailingZip;
	}


	public String getMailingZip4() {
		return mailingZip4;
	}


	public void setMailingZip4(String mailingZip4) {
		this.mailingZip4 = mailingZip4;
	}


	public Date getEnrollmentStartDate() {
		return enrollmentStartDate;
	}


	public void setEnrollmentStartDate(Date enrollmentStartDate) {
		this.enrollmentStartDate = enrollmentStartDate;
	}


	public Date getEnrollmentEndDate() {
		return enrollmentEndDate;
	}


	public void setEnrollmentEndDate(Date enrollmentEndDate) {
		this.enrollmentEndDate = enrollmentEndDate;
	}
	
	

}
