package com.ustgloacl.caremanager.ustcareadmin;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;


import oracle.jdbc.OracleConnection;
import oracle.jdbc.pool.OracleDataSource;

public class MainJDBCtoOracle_FORIUHSERVER {
	
	static String rowNumFilter = " and rownum < 1000";
	
	public static void main(String[] args) throws SQLException, IOException, InterruptedException, ParseException, DatatypeConfigurationException {
		OracleDataSource ds = new OracleDataSource();
	
		ds.setURL("jdbc:oracle:thin:CRPT_DEV_RO/V1cnk0cn_f19@//100.100.8.133:1521/IUHPDWDV"); //PROD AT HE
		
		Connection conn;
		conn = ds.getConnection("CRPT_DEV_RO","V1cnk0cn_f19");  //PROD AT HE
		 Connection connection = null;

	    	try {
	    		connection = DriverManager
	    	    .getConnection("jdbc:mysql://localhost:3306/integration?autoReconnect=true&useSSL=false","integration", "integration");

	    		//.getConnection("jdbc:mysql://localhost:3306/integration?autoReconnect=true&useSSL=false","integration_user", "Super!Secret@123-IUH");
	    		connection.setAutoCommit(false);
	    		
	    	} catch (SQLException e) {
	    		System.out.println("Connection Failed! Check output console");
	    		e.printStackTrace();
	    		return;
	    	}

	    	System.out.println("You made it, take control your database now!");
	    	
		//conn = ds.getConnection("HRDWHQA_RO","Peeple4535"); QA
		((OracleConnection)conn).setDefaultRowPrefetch(1000); 
		long start = System.nanoTime();
		LoadAll(conn,connection);
		conn.close();
		connection.close();
		ds.close();
		long end = System.nanoTime();
		long elapsedTime = end - start;
		double seconds = (double)elapsedTime / 1000000000.0;
		System.out.println(seconds);
	}
	
	public static void LoadAll(Connection con, Connection connection) throws SQLException, IOException, InterruptedException, ParseException, DatatypeConfigurationException {
		AccountLoad(con,connection);
		BPLoad(con,connection);
		MemberLoad(con,connection);
		SupplierLoad(con,connection);
		SupplierLocationLoad(con,connection);
		PractitionerLoad(con,connection);
		PostProcess(connection);
	}
	public static void MemberLoad(Connection con, Connection connection)
		    throws SQLException, IOException, InterruptedException, ParseException, DatatypeConfigurationException {
		    Statement stmt = null;
		    
		    String countQuery = "SELECT\r\n" + 
		    		"		          count(1)\r\n" + 
		    		"		          FROM IUH_DEV_DW.member MBR\r\n" + 
		    		"		         INNER JOIN IUH_DEV_DW.account ACCT\r\n" + 
		    		"		         ON MBR.account_key = ACCT.account_key\r\n" + 
		    		"		         INNER JOIN IUH_DEV_DW.account ACCTP\r\n" + 
		    		"		         ON ACCT.top_account_key = ACCTP.account_key\r\n" + 
		    		"		         INNER JOIN IUH_DEV_DW.rltp_to_subscriber RLTP_SUBS\r\n" + 
		    		"		         ON MBR.rltp_to_subscriber_key = RLTP_SUBS.rltp_to_subscriber_key\r\n" + 
		    		"		         INNER JOIN IUH_DEV_DW.date_dimension DATE_DOB\r\n" + 
		    		"		         ON mbr.member_birth_date_key = date_dob.date_key\r\n" + 
		    		"		         LEFT OUTER JOIN IUH_DEV_DW.POSTAL_ADDRESS ADDR1\r\n" + 
		    		"		         ON MBR.MEMBER_HOME_ADDRESS_KEY = ADDR1.POSTAL_ADDRESS_KEY\r\n" + 
		    		"		         LEFT OUTER JOIN IUH_DEV_DW.COUNTY_CODE CNTY\r\n" + 
		    		"		         ON addr1.county_code = cnty.county_code\r\n" + 
		    		"		         LEFT OUTER JOIN\r\n" + 
		    		"		          (SELECT udt.member_history_fact_key,\r\n" + 
		    		"		            MAX (\r\n" + 
		    		"		            CASE\r\n" + 
		    		"		              WHEN udt_val.member_udt_attr_name = 'Waiting Period'\r\n" + 
		    		"		              THEN udt_val.member_udt_attr_name\r\n" + 
		    		"		            END) AS outofarea\r\n" + 
		    		"		          FROM IUH_DEV_DW.member_to_member_udt udt\r\n" + 
		    		"		          INNER JOIN IUH_DEV_DW.member_udt_value udt_val\r\n" + 
		    		"		          ON udt.member_udt_key = udt_val.member_udt_key\r\n" + 
		    		"		          GROUP BY udt.member_history_fact_key\r\n" + 
		    		"		          ) member_udt ON mbr.member_history_fact_key = member_udt.member_history_fact_key\r\n" + 
		    		"		         LEFT OUTER JOIN IUH_DEV_DW.date_dimension DATE_HIRE_DT\r\n" + 
		    		"		         ON mbr.hire_date_key = date_hire_dt.date_key\r\n" + 
		    		"		         LEFT OUTER JOIN IUH_DEV_DW.MEMBER_PLAN_SELECTION MBR_BP\r\n" + 
		    		"		         ON mbr.member_key = mbr_bp.member_key\r\n" + 
		    		"		         LEFT OUTER JOIN IUH_DEV_DW.benefit_plan bp\r\n" + 
		    		"		         ON BP.BENEFIT_PLAN_KEY = MBR_BP.BENEFIT_PLAN_KEY\r\n" + 
		    		"                 left outer join IUH_DEV_DW.product prod \r\n" + 
		    		"                 on bp.benefit_plan_product_key = prod.product_key\r\n" + 
		    		"		         LEFT OUTER JOIN IUH_DEV_DW.MEMBER_HIST_FACT_TO_BNFT_PLAN MBR_BP_HIST\r\n" + 
		    		"		         ON MBR_BP_HIST.MEMBER_HISTORY_FACT_KEY = MBR.MEMBER_HISTORY_FACT_KEY\r\n" + 
		    		"		         AND mbr_bp_hist.benefit_plan_key       = mbr_bp.benefit_plan_key\r\n" + 
		    		"		         LEFT OUTER JOIN IUH_DEV_DW.date_dimension BP_START_DT\r\n" + 
		    		"		         ON mbr_bp.start_date_key = bp_start_dt.date_key\r\n" + 
		    		"		         LEFT OUTER JOIN IUH_DEV_DW.date_dimension BP_END_DT\r\n" + 
		    		"		         ON mbr_bp.end_date_key = bp_end_dt.date_key\r\n" + 
		    		"		         LEFT OUTER JOIN IUH_DEV_DW.date_dimension disability_date\r\n" + 
		    		"		         ON MBR.disability_reported_date_key = disability_date.DATE_KEY\r\n" + 
		    		"		         LEFT OUTER JOIN\r\n" + 
		    		"		          (SELECT MBR_CNCT_INFO.MEMBER_HISTORY_FACT_KEY,\r\n" + 
		    		"		            POSTAL_ADDR.*\r\n" + 
		    		"		          FROM IUH_DEV_DW.MEMBER_HIST_FCT_TO_CONTCT_INFO MBR_CNCT_INFO\r\n" + 
		    		"		          INNER JOIN IUH_DEV_DW.CONTACT_INFORMATION CNCT_INFO\r\n" + 
		    		"		          ON MBR_CNCT_INFO.CONTACT_INFO_KEY = CNCT_INFO.CONTACT_INFO_KEY\r\n" + 
		    		"		          INNER JOIN IUH_DEV_DW.CONTACT_INFORMATION_TYPE CNCT_INFO_TYPE\r\n" + 
		    		"		          ON CNCT_INFO_TYPE.CONTACT_INFORMATION_TYPE_KEY = CNCT_INFO.CONTACT_INFORMATION_TYPE_KEY\r\n" + 
		    		"		          AND CNCT_INFO_TYPE.CONTACT_INFO_TYPE_CODE      = 'General'\r\n" + 
		    		"		          INNER JOIN IUH_DEV_DW.CONTACT_ADDRESS_INFORMATION CNCT_ADDR_INFO\r\n" + 
		    		"		          ON CNCT_ADDR_INFO.ADDRESS_INFO_KEY = CNCT_INFO.ADDRESS_INFO_KEY\r\n" + 
		    		"		          INNER JOIN IUH_DEV_DW.CONTACT_POSTAL_ADDRESS POSTAL_ADDR\r\n" + 
		    		"		          ON CNCT_ADDR_INFO.POSTAL_ADDRESS_KEY             = POSTAL_ADDR.POSTAL_ADDRESS_KEY\r\n" + 
		    		"		          ) mail_addr ON mail_addr.member_history_fact_key = mbr.member_history_fact_key\r\n" + 
		    		"		         LEFT OUTER JOIN\r\n" + 
		    		"		          (SELECT m.member_key              AS oic_member_key,\r\n" + 
		    		"		            oic.case_status_code            AS oic_case_status,\r\n" + 
		    		"		            eff_date.date_value             AS oic_eff_dt,\r\n" + 
		    		"		            term_date.date_value            AS oic_term_dt,\r\n" + 
		    		"		            oi.other_insurance_company_name AS oic_company_nme,\r\n" + 
		    		"		            oic.other_ins_priority          AS oic_priority,\r\n" + 
		    		"		            oic.other_ins_reason            AS oic_reason,\r\n" + 
		    		"		            oic.plan_id                     AS oic_plan_id,\r\n" + 
		    		"		            oic.plan_name                   AS oic_plan_nme,\r\n" + 
		    		"		            oic.policy_type_code            AS oic_policy_type\r\n" + 
		    		"		          FROM IUH_DEV_DW.member m\r\n" + 
		    		"		          INNER JOIN IUH_DEV_DW.OTHER_INSURANCE_COVERAGE oic\r\n" + 
		    		"		          ON oic.member_key = m.member_key\r\n" + 
		    		"		          LEFT OUTER JOIN IUH_DEV_DW.OTHER_INSURANCE_COMPANY oi\r\n" + 
		    		"		          ON oic.other_insurance_company_key = oi.other_insurance_company_key\r\n" + 
		    		"		          INNER JOIN IUH_DEV_DW.date_dimension version_eff\r\n" + 
		    		"		          ON oic.version_eff_date_key = version_eff.date_key\r\n" + 
		    		"		          INNER JOIN IUH_DEV_DW.date_dimension eff_date\r\n" + 
		    		"		          ON oic.effective_date_key = eff_date.date_key\r\n" + 
		    		"		          INNER JOIN IUH_DEV_DW.date_dimension term_date\r\n" + 
		    		"		          ON oic.TERMINATION_DATE_KEY  = term_date.date_key\r\n" + 
		    		"		          WHERE version_eff.date_value =\r\n" + 
		    		"		            (SELECT MAX(version_eff1.date_value)\r\n" + 
		    		"		            FROM IUH_DEV_DW.other_insurance_coverage oic1\r\n" + 
		    		"		            INNER JOIN IUH_DEV_DW.date_dimension version_eff1\r\n" + 
		    		"		            ON oic1.version_eff_date_key = version_eff1.date_key\r\n" + 
		    		"		            WHERE oic1.member_key        = oic.member_key\r\n" + 
		    		"		            )\r\n" + 
		    		"		          AND term_date.date_value >= to_date('2017-07-01','yyyy-mm-dd')\r\n" + 
		    		"		          ) COB ON mbr.member_key   = COB.oic_member_key\r\n" + 
		    		"		         WHERE \r\n" + 
		    		"	    		    acctp.account_hcc_id = 'IU2013'\r\n" + 
		    		"	    		 ORDER BY\r\n" + 
		    		"	    		    acctp.account_hcc_id, \r\n" + 
		    		"	    		    mbr.member_hcc_id";
		    
		    String query =
		        "  SELECT distinct\r\n" + 
		        "  CASE\r\n" + 
		        "            WHEN MHF.rltp_to_subscriber_key = 15 THEN 'Y'\r\n" + 
		        "            ELSE 'N'\r\n" + 
		        "        END\r\n" + 
		        "        AS issubscriber,\r\n" + 
		        "        MHF.tax_id AS social_security_number,\r\n" + 
		        "        MHF.MEMBER_LAST_NAME as LAST_NAME,\r\n" + 
		        "        MHF.MEMBER_FIRST_NAME as FIRST_NAME,\r\n" + 
		        "        MHF.MEMBER_MIDDLE_NAME as MIDDLE_NAME,\r\n" + 
		        "        date_dob.date_name_2 AS date_of_birth,\r\n" + 
		        "        MHF.MEMBER_GENDER_CODE as GENDER_CODE,\r\n" + 
		        "        homeaddr.ADDRESS_LINE as RESIDENTIAL_STREET_ADDRESS_ONE,\r\n" + 
		        "        homeaddr.CITY_NAME as RESIDENTIAL_CITY,\r\n" + 
		        "        homeaddr.STATE_CODE as RESIDENTIAL_STATE,\r\n" + 
		        "        homeaddr.ZIP_CODE as RESIDENTIAL_ZIP_CODE,\r\n" + 
		        "        countycode.COUNTY_NAME as RESIDENTIAL_COUNTY_CODE,\r\n" + 
		        "        mhf.telephone_number as RESIDENTIAL_HOME_PHONE,\r\n" + 
		        "        bplan_1.BENEFIT_PLAN_HCC_ID as BENEFIT_PLAN_HCC_ID,\r\n" + 
		        "        DD4.DATE_NAME_1 as COVERAGE_EFFECTIVE_DATE,\r\n" + 
		        "        MHF.SUBSCRIPTION_HCC_ID as SUBSCRIBER_ID,\r\n" + 
		        "        acct.ACCOUNT_HCC_ID as ACCOUNT_ID,\r\n" + 
		        "        MHF.MEMBER_HCC_ID as MEMBER_ID, \r\n" + 
		        "        homeaddr.ADDRESS_LINE_2 as STREET_ADDRESS_TWO,\r\n" + 
		        "        homeaddr.ADDRESS_LINE_3 as STREET_ADDRESS_THREE,\r\n" + 
		        "        homeaddr.ZIP_4_CODE as ZIP_CODE_4,\r\n" + 
		        "        homeaddr.COUNTRY_CODE,\r\n" + 
		        "        MHF.EMAIL_ADDRESS,\r\n" + 
		        "        mailaddr.ADDRESS_LINE as MAILING_STREET_ADDRESS_ONE,\r\n" + 
		        "        mailaddr.ADDRESS_LINE_2 as MAILING_STREET_ADDRESS_TWO,\r\n" + 
		        "        mailaddr.ADDRESS_LINE_3 as MAILING_STREET_ADDRESS_THREE,\r\n" + 
		        "        mailaddr.CITY_NAME as MAILING_STREET_CITY,\r\n" + 
		        "        mailaddr.STATE_CODE as MAILING_STREET_STATE,\r\n" + 
		        "        mailaddr.ZIP_CODE as MAILING_STREET_ZIP_CODE,\r\n" + 
		        "        mailaddr.ZIP_4_CODE as MAILING_STREET_ZIP_CODE_4,\r\n" + 
		        "        countycode.COUNTY_NAME as MAILING_STREET_COUNTY_CODE,\r\n" + 
		        "        homeaddr.COUNTRY_CODE as MAILING_STREET_COUNTRY_CODE,\r\n" + 
		        "        mhf.head_of_house_individual_key as HEADOFHOUSEINDIVIDUALKEY,\r\n" + 
		        "         DD5.DATE_NAME_1 as COVERAGE_END_DATE,\r\n" + 
		        "        RTS.RLTP_TO_SUBSCRIBER_NAME as RELATIONSHIPTOSUBSCRIBER,  \r\n" + 
		        "        MHF.IS_VIP as ISMEMBERVIP,\r\n" + 
		        "        lang.language_domain_name AS primarylanguage,\r\n" + 
		        "        lang2.language_domain_name AS nativelanguage,\r\n" + 
		        "        (case when plan_link_1.member_terminate_reason_key is null then 'Y' else 'N' end) IS_ACTIVE\r\n" + 
		        "        FROM IUH_DEV_DW.MEMBER_HISTORY_FACT MHF                                        \r\n" + 
		        "          left join IUH_DEV_DW.MEMBER_HIST_FACT_TO_BNFT_PLAN plan_link_1 on plan_link_1.MEMBER_HISTORY_FACT_KEY = MHF.MEMBER_HISTORY_FACT_KEY and plan_link_1.SORT_ORDER = 1                    \r\n" + 
		        "          left join IUH_DEV_DW.BENEFIT_PLAN_HISTORY_FACT bplan_1 on bplan_1.BENEFIT_PLAN_KEY = plan_link_1.BENEFIT_PLAN_KEY \r\n" + 
		        "            and MHF.VERSION_EFF_DATE_KEY >= bplan_1.VERSION_EFF_DATE_KEY \r\n" + 
		        "            and MHF.VERSION_EXP_DATE_KEY <= bplan_1.VERSION_EXP_DATE_KEY   \r\n" + 
		        "          left join IUH_DEV_DW.PRODUCT p_1 on p_1.PRODUCT_KEY = bplan_1.BENEFIT_PLAN_PRODUCT_KEY\r\n" + 
		        "          left join IUH_DEV_DW.BENEFIT_PLAN_TYPE_CODE bptc_1 on bptc_1.BENEFIT_PLAN_TYPE_KEY = p_1.BENEFIT_PLAN_TYPE_KEY                                                                                     \r\n" + 
		        "          left join IUH_DEV_DW.RLTP_TO_SUBSCRIBER RTS                     \r\n" + 
		        "              ON RTS.RLTP_TO_SUBSCRIBER_KEY = MHF.RLTP_TO_SUBSCRIBER_KEY                                      \r\n" + 
		        "          left join IUH_DEV_DW.DATE_DIMENSION DD2                     \r\n" + 
		        "            ON IUH_DEV_DW.DD2.DATE_KEY = MHF.VERSION_EFF_DATE_KEY                    \r\n" + 
		        "          left join IUH_DEV_DW.DATE_DIMENSION DD3 on DD3.DATE_KEY = MHF.VERSION_EXP_DATE_KEY\r\n" + 
		        "          join IUH_DEV_DW.DATE_DIMENSION DD4 on DD4.DATE_KEY = MHF.MEMBER_EFFECTIVE_DATE_KEY\r\n" + 
		        "          join IUH_DEV_DW.DATE_DIMENSION DD5 on DD5.DATE_KEY = MHF.MEMBER_TERMINATION_DATE_KEY \r\n" + 
		        "          join IUH_DEV_DW.DATE_DIMENSION DD6 on DD6.DATE_KEY = MHF.FIRST_EFFECTIVE_DATE_KEY\r\n" + 
		        "          INNER JOIN IUH_DEV_DW.date_dimension date_dob ON mhf.member_birth_date_key = date_dob.date_key\r\n" + 
		        "          left join IUH_DEV_DW.HISTORY_FACT_STATUS_CODE HFSC on HFSC.HISTORY_FACT_STATUS_CODE = MHF.MEMBER_STATUS\r\n" + 
		        "          left join IUH_DEV_DW.postal_address homeaddr on homeaddr.postal_address_key = MHF.MEMBER_HOME_ADDRESS_KEY\r\n" + 
		        "          left join IUH_DEV_DW.postal_address mailaddr on mailaddr.postal_address_key = MHF.MEMBER_MAILING_ADDRESS_KEY\r\n" + 
		        "          left join IUH_DEV_DW.county_code countycode on countycode.county_code = homeaddr.county_code\r\n" + 
		        "          left join IUH_DEV_DW.county_code mailcounty on mailcounty.county_code = mailaddr.county_code\r\n" + 
		        "          left join IUH_DEV_DW.account acct on acct.account_key = mhf.account_key\r\n" + 
		        "          left outer JOIN IUH_DEV_DW.language_code lang ON lang.language_domain_key = mhf.primary_language_code \r\n" + 
		        "          LEFT OUTER JOIN IUH_DEV_DW.language_code lang2 ON lang2.language_domain_key = mhf.native_language_code\r\n" + 
		        "          join IUH_DEV_DW.subscription_history_fact shf on shf.subscription_hcc_id = mhf.subscription_hcc_id\r\n" + 
		        "          where HFSC.HISTORY_FACT_STATUS_DESC = 'Active' and (bptc_1.BENEFIT_PLAN_TYPE_DESC = 'Medical')  \r\n" + //rowNumFilter +
		        "          order by MHF.SUBSCRIPTION_HCC_ID, issubscriber desc";
		    
		    
		    
		   
		    
		   
		  // SubScriberModel[] submodel = null;
		   
		        stmt = con.createStatement();
		        
		        
		       
		        //ResultSet countrs = stmt.executeQuery(countQuery);
		        //countrs.next();
		        
		        //submodel = new SubScriberModel[countrs.getInt("count(1)")];
		       // countrs.close();
		        ResultSet rs = stmt.executeQuery(query);
		        
		        int i = 0;
		        //CSVWriter wr = new CSVWriter(new FileWriter("c:\\users\\u61906\\NEW_full_subscription.csv"));
		        //wr.writeAll(rs, true);
		        //wr.flush();
		        //wr.close();
		        
		        
		        
		       
		    	int z = 0;
		    	
		    	Statement st = connection.createStatement();
		    	st.executeUpdate("truncate table integration.subscription_staging");
		    	st.executeUpdate("alter table integration.subscription_staging disable keys");
		    	String theSql = "INSERT INTO integration.subscription_staging (ISSUBSCRIBER,SOCIAL_SECURITY_NUMBER,LAST_NAME,FIRST_NAME,MIDDLE_NAME,DATE_OF_BIRTH,GENDER_CODE,RESIDENTIAL_STREET_ADDRESS_ONE,RESIDENTIAL_CITY,RESIDENTIAL_STATE,RESIDENTIAL_ZIP_CODE,RESIDENTIAL_COUNTY_CODE,RESIDENTIAL_HOME_PHONE,BENEFIT_PLAN_HCC_ID,COVERAGE_EFFECTIVE_DATE,SUBSCRIBER_ID,ACCOUNT_ID,MEMBER_ID,STREET_ADDRESS_TWO,STREET_ADDRESS_THREE,ZIP_CODE_4,COUNTRY_CODE,EMAIL_ADDRESS,MAILING_STREET_ADDRESS_ONE,MAILING_STREET_ADDRESS_TWO,MAILING_STREET_ADDRESS_THREE,MAILING_STREET_CITY,MAILING_STREET_STATE,MAILING_STREET_ZIP_CODE,MAILING_STREET_ZIP_CODE_4,MAILING_STREET_COUNTY_CODE,MAILING_STREET_COUNTRY_CODE,HEADOFHOUSEINDIVIDUALKEY,COVERAGE_END_DATE,RELATIONSHIPTOSUBSCRIBER,ISMEMBERVIP,PRIMARYLANGUAGE,NATIVELANGUAGE,IS_ACTIVE) " +
	    				"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	    		PreparedStatement preparedStmt = connection.prepareStatement(theSql);

		    	int x=0;
		    	while(rs.next()) {
		    		
		    		preparedStmt.setString(1 ,rs.getString("ISSUBSCRIBER")); 
		    		preparedStmt.setString(2 ,rs.getString("SOCIAL_SECURITY_NUMBER"));
		    		preparedStmt.setString(3 ,rs.getString("LAST_NAME"));
		    		preparedStmt.setString(4 ,rs.getString("FIRST_NAME"));
		    		preparedStmt.setString(5 ,rs.getString("MIDDLE_NAME"));
		    		preparedStmt.setString(6 ,rs.getString("DATE_OF_BIRTH"));
		    		preparedStmt.setString(7 ,rs.getString("GENDER_CODE"));
		    		preparedStmt.setString(8 ,rs.getString("RESIDENTIAL_STREET_ADDRESS_ONE"));
		    		preparedStmt.setString(9 ,rs.getString("RESIDENTIAL_CITY"));
		    		preparedStmt.setString(10 ,rs.getString("RESIDENTIAL_STATE"));
		    		preparedStmt.setString(11 ,rs.getString("RESIDENTIAL_ZIP_CODE"));
		    		preparedStmt.setString(12 ,rs.getString("RESIDENTIAL_COUNTY_CODE"));
		    		preparedStmt.setString(13 ,rs.getString("RESIDENTIAL_HOME_PHONE"));
		    		preparedStmt.setString(14 ,rs.getString("BENEFIT_PLAN_HCC_ID"));
		    		preparedStmt.setString(15 ,rs.getString("COVERAGE_EFFECTIVE_DATE"));
		    		preparedStmt.setString(16 ,rs.getString("SUBSCRIBER_ID"));
		    		preparedStmt.setString(17 ,rs.getString("ACCOUNT_ID"));
		    		preparedStmt.setString(18 ,rs.getString("MEMBER_ID"));
		    		preparedStmt.setString(19 ,rs.getString("STREET_ADDRESS_TWO"));
		    		preparedStmt.setString(20 ,rs.getString("STREET_ADDRESS_THREE"));
		    		preparedStmt.setString(21 ,rs.getString("ZIP_CODE_4"));
		    		preparedStmt.setString(22 ,rs.getString("COUNTRY_CODE"));
		    		preparedStmt.setString(23 ,rs.getString("EMAIL_ADDRESS"));
		    		preparedStmt.setString(24 ,rs.getString("MAILING_STREET_ADDRESS_ONE"));
		    		preparedStmt.setString(25 ,rs.getString("MAILING_STREET_ADDRESS_TWO"));
		    		preparedStmt.setString(26 ,rs.getString("MAILING_STREET_ADDRESS_THREE"));
		    		preparedStmt.setString(27 ,rs.getString("MAILING_STREET_CITY"));
		    		preparedStmt.setString(28 ,rs.getString("MAILING_STREET_STATE"));
		    		preparedStmt.setString(29 ,rs.getString("MAILING_STREET_ZIP_CODE"));
		    		preparedStmt.setString(30 ,rs.getString("MAILING_STREET_ZIP_CODE_4"));
		    		preparedStmt.setString(31 ,rs.getString("MAILING_STREET_COUNTY_CODE"));
		    		preparedStmt.setString(32 ,rs.getString("MAILING_STREET_COUNTRY_CODE"));
		    		preparedStmt.setString(33 ,rs.getString("HEADOFHOUSEINDIVIDUALKEY"));
		    		preparedStmt.setString(34 ,rs.getString("COVERAGE_END_DATE"));
		    		preparedStmt.setString(35 ,rs.getString("RELATIONSHIPTOSUBSCRIBER"));
		    		preparedStmt.setString(36 ,rs.getString("ISMEMBERVIP"));
		    		preparedStmt.setString(37 ,rs.getString("PRIMARYLANGUAGE"));
		    		preparedStmt.setString(38 ,rs.getString("NATIVELANGUAGE"));
		    		preparedStmt.setString(39 ,rs.getString("IS_ACTIVE"));


		    		
		    		preparedStmt.addBatch();
		    	x++;
		    	if(x>=500) {
		    		z =  z + x;
		    		x=0;
		    		preparedStmt.executeBatch();
		    		connection.commit();
		    		System.out.println("Committed " + z + " Subscribers");
		    	}
		    	
		    	}
		    	preparedStmt.executeBatch();
	    		connection.commit();
	    		System.out.println("Committed " + (z + x) + " Subscribers");
	    		x = 0;
	    		z = 0;
		    	st.executeUpdate("alter table integration.subscription_staging enable keys");

		    	rs.close();
		    	st.close();
		    	preparedStmt.close();
		        stmt.close();
		}
	
	private static void SupplierLoad(Connection con, Connection connection) throws SQLException {
		Statement supplierStmt = null;
		 String supplierQuery = "select sh.supplier_hcc_id, sh.supplier_name, sh.supplier_npi, te.TAX_ID,sh.supplier_status, pt.PROVIDER_TAXONOMY_NAME AS SPECIALTY,sh.FAX_NUMBER, sh.TELEPHONE_NUMBER, sh.TELEPHONE_EXTENSION, \r\n" + 
		    		"corr.address_line corr_address_line_1, corr.address_line_2 corr_address_line_2, corr.address_line_3 corr_address_line_3, corr.city_name corr_city_name, ccode.COUNTY_NAME corr_county_name,\r\n" + 
		    		"corr.country_code corr_country_code, corr.state_code corr_state, corr.zip_code corr_zip, corr.zip_4_code corr_zip_4, tax.ADDRESS_LINE tax_address_line_1, tax.ADDRESS_LINE_2 tax_address_line_2, tax.address_line_3 tax_address_line_3, tax.city_name tax_city, tcode.COUNTY_NAME tax_county,tax.country_code tax_country, tax.STATE_CODE tax_state, tax.zip_code tax_zip, tax.zip_4_code tax_zip_4\r\n" + 
		    		"from IUH_DEV_DW.SUPPLIER_HISTORY_FACT sh\r\n" + 
		    		"left outer join IUH_DEV_DW.SPPLR_HSTRY_TO_PRVDR_TXNMY shpt\r\n" + 
		    		"on sh.SUPPLIER_HISTORY_FACT_KEY = shpt.SUPPLIER_HISTORY_FACT_KEY\r\n" + 
		    		"left outer join IUH_DEV_DW.provider_taxonomy pt\r\n" + 
		    		"on shpt.PROVIDER_TAXONOMY_KEY = pt.PROVIDER_TAXONOMY_KEY\r\n" + 
		    		"left outer join IUH_DEV_DW.tax_entity_history_fact te\r\n" + 
		    		"on sh.TAX_ENTITY_KEY = te.TAX_ENTITY_KEY\r\n" + 
		    		"left outer join IUH_DEV_DW.postal_address corr\r\n" + 
		    		"on sh.supplier_corr_address_key = corr.postal_address_key\r\n" + 
		    		"left outer join IUH_DEV_DW.postal_address tax\r\n" + 
		    		"on te.TAX_ADDRESS_KEY = tax.POSTAL_ADDRESS_KEY\r\n" + 
		    		"left outer join IUH_DEV_DW.county_code ccode\r\n" + 
		    		"on corr.COUNTY_CODE = ccode.COUNTY_CODE\r\n" + 
		    		"left outer join IUH_DEV_DW.county_code tcode\r\n" + 
		    		"on tax.county_code = tcode.COUNTY_CODE\r\n" + 
		    		"order by sh.supplier_history_fact_key, shpt.SORT_ORDER asc";
		 
		 supplierStmt = con.createStatement();
	    	supplierStmt.setFetchSize(1000);
	        ResultSet supplierrs = supplierStmt.executeQuery(supplierQuery);
	        int x = 0;
	    	int z = 0;

	    	supplierStmt = connection.createStatement();
	    	
	    	supplierStmt.executeUpdate("truncate table integration.supplier_staging");
	    	supplierStmt.executeUpdate("alter table integration.supplier_staging disable keys");
		    	String thesuppSql = "insert into integration.supplier_staging (SUPPLIER_HCC_ID,SUPPLIER_NAME,SUPPLIER_NPI,TAX_ID,SUPPLIER_STATUS,SPECIALTY,FAX_NUMBER,TELEPHONE_NUMBER,"
		    			+ "TELEPHONE_EXTENSION,CORR_ADDRESS_LINE_1,CORR_ADDRESS_LINE_2,CORR_ADDRESS_LINE_3,CORR_CITY_NAME,CORR_COUNTY_NAME,CORR_COUNTRY_CODE,CORR_STATE,CORR_ZIP,CORR_ZIP_4," +
		    			"TAX_ADDRESS_LINE_1,TAX_ADDRESS_LINE_2,TAX_ADDRESS_LINE_3,TAX_CITY,TAX_COUNTY,TAX_COUNTRY,TAX_STATE,TAX_ZIP,TAX_ZIP_4)"
		    			+ " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	    		PreparedStatement preparedbpStmt = connection.prepareStatement(thesuppSql);
		    	while(supplierrs.next()){
		    		preparedbpStmt.setString(1 ,supplierrs.getString("SUPPLIER_HCC_ID")); 
		    		preparedbpStmt.setString(2 ,supplierrs.getString("SUPPLIER_NAME")); 
		    		preparedbpStmt.setString(3 ,supplierrs.getString("SUPPLIER_NPI"));
		    		preparedbpStmt.setString(4 ,supplierrs.getString("TAX_ID"));
		    		preparedbpStmt.setString(5 ,supplierrs.getString("SUPPLIER_STATUS"));
		    		preparedbpStmt.setString(6 ,supplierrs.getString("SPECIALTY"));
		    		preparedbpStmt.setString(7 ,supplierrs.getString("FAX_NUMBER"));
		    		preparedbpStmt.setString(8 ,supplierrs.getString("TELEPHONE_NUMBER"));
		    		preparedbpStmt.setString(9 ,supplierrs.getString("TELEPHONE_EXTENSION"));
		    		preparedbpStmt.setString(10 ,supplierrs.getString("CORR_ADDRESS_LINE_1"));
		    		preparedbpStmt.setString(11 ,supplierrs.getString("CORR_ADDRESS_LINE_2"));
		    		preparedbpStmt.setString(12 ,supplierrs.getString("CORR_ADDRESS_LINE_3"));
		    		preparedbpStmt.setString(13 ,supplierrs.getString("CORR_CITY_NAME"));
		    		preparedbpStmt.setString(14 ,supplierrs.getString("CORR_COUNTY_NAME"));
		    		preparedbpStmt.setString(15 ,supplierrs.getString("CORR_COUNTRY_CODE"));
		    		preparedbpStmt.setString(16 ,supplierrs.getString("CORR_STATE"));
		    		preparedbpStmt.setString(17 ,supplierrs.getString("CORR_ZIP"));
		    		preparedbpStmt.setString(18 ,supplierrs.getString("CORR_ZIP_4"));
		    		preparedbpStmt.setString(19 ,supplierrs.getString("TAX_ADDRESS_LINE_1"));
		    		preparedbpStmt.setString(20 ,supplierrs.getString("TAX_ADDRESS_LINE_2"));
		    		preparedbpStmt.setString(21 ,supplierrs.getString("TAX_ADDRESS_LINE_3"));
		    		preparedbpStmt.setString(22 ,supplierrs.getString("TAX_CITY"));
		    		preparedbpStmt.setString(23 ,supplierrs.getString("TAX_COUNTY"));
		    		preparedbpStmt.setString(24 ,supplierrs.getString("TAX_COUNTRY"));
		    		preparedbpStmt.setString(25 ,supplierrs.getString("TAX_STATE"));
		    		preparedbpStmt.setString(26 ,supplierrs.getString("TAX_ZIP"));
		    		preparedbpStmt.setString(27 ,supplierrs.getString("TAX_ZIP_4"));
		    		preparedbpStmt.addBatch();
		    		
		    		x++;
			    	if(x>=500) {
			    		z =  z + x;
			    		x=0;
			    		preparedbpStmt.executeBatch();
			    		connection.commit();
			    		System.out.println("Committed " + z + " Suppliers's");
			    	}
		    		
		    	}
		    	
		    	preparedbpStmt.executeBatch();
	    		connection.commit();
	    		System.out.println("Committed " + (z + x)+ " Supplier's");
	    		x = 0;
	    		z = 0;
	    		preparedbpStmt.executeUpdate("alter table integration.supplier_staging enable keys");
	    		preparedbpStmt.close();
	    		supplierStmt.close();
	    		supplierrs.close();

		
	}
	
	
	private static void SupplierLocationLoad(Connection con, Connection connection) throws SQLException {
		Statement supplierStmt = null;
		 String supplierQuery = "select distinct suploc.SUPPLIER_LOCATION_HCC_ID, suploc.SUPPLIER_LOCATION_NAME, suploc.SUPPLIER_LOCATION_NPI, suploc.supplier_location_status, suploc.FAX_NUMBER, suploc.TELEPHONE_NUMBER, suploc.TELEPHONE_EXTENSION,\r\n" + 
		 		"		 		cpa.ADDRESS_LINE, cpa.address_line_2, cpa.address_line_3, cpa.CITY_NAME, ccode.County_name, cpa.COUNTRY_CODE, cpa.STATE_CODE, cpa.ZIP_CODE, cpa.ZIP_4_CODE, suploc.IS_PRIMARY_LOCATION, suploc.IS_HOSPITAL,\r\n" + 
		 		"		 		ctf.phone_country_cd,ctf.phone_area_cd , ctf.phone_nbr as mainPhoneNumber, B.supplier_hcc_id\r\n" + 
		 		"		 		--, practice.ADDRESS_LINE practice_address_1, practice.ADDRESS_LINE_2 practice_address_2,practice.CITY_NAME practice_city, practice.COUNTRY_NAME practice_country, practice.STATE_CODE practice_state, practice.ZIP_CODE practice_zip, practice.ZIP_4_CODE practice_zip_4\r\n" + 
		 		"		 		from IUH_DEV_DW.SUPPLIER_LOCATION_HIST_FACT suploc\r\n" + 
		 		"                LEFT JOIN    IUH_DEV_DW.SUPPLIER B ON B.SUPPLIER_KEY=suploc.SUPPLIER_KEY\r\n" + 
		 		"		 		join IUH_DEV_DW.supp_loc_hist_to_contact_info slhci on suploc.SUPPLIER_LOC_HIST_FACT_KEY = slhci.supplier_loc_hist_fact_key\r\n" + 
		 		"		 		join IUH_DEV_DW.contact_information ci on ci.contact_info_key = slhci.contact_info_key\r\n" + 
		 		"		 		--join IUH_DEV_DW.contact_address_information cai on cai.address_info_key = ci.address_info_key\r\n" + 
		 		"		 		--join IUH_DEV_DW.contact_postal_address cpa on cpa.postal_address_key = cai.postal_address_key\r\n" + 
		 		"		 		join IUH_DEV_DW.postal_address cpa on cpa.postal_address_key = suploc.practice_address_key\r\n" + 
		 		"		 		join IUH_DEV_DW.con_addr_inf_to_con_info_phone cphone on cphone.address_info_key = ci.address_info_key\r\n" + 
		 		"		 		join IUH_DEV_DW.contact_telephone_fact ctf on ctf.phone_key = cphone.phone_key\r\n" + 
		 		"		 		join IUH_DEV_DW.COUNTY_CODE ccode on cpa.county_code = ccode.county_code\r\n" + 
		 		"		 		order by suploc.supplier_location_hcc_id asc";
		 
		 supplierStmt = con.createStatement();
	    	supplierStmt.setFetchSize(1000);
	        ResultSet supplierrs = supplierStmt.executeQuery(supplierQuery);
	        int x = 0;
	    	int z = 0;
	    	supplierStmt = connection.createStatement();
	    	supplierStmt.executeUpdate("truncate table integration.supplierlocation_staging");
	    	supplierStmt.executeUpdate("alter table integration.supplierlocation_staging disable keys");
		    	String thesuppSql = "insert into integration.supplierlocation_staging (SUPPLIER_LOCATION_HCC_ID,SUPPLIER_LOCATION_NAME,SUPPLIER_LOCATION_NPI,"+
	    	"SUPPLIER_LOCATION_STATUS,FAX_NUMBER,TELEPHONE_NUMBER,TELEPHONE_EXTENSION,ADDRESS_LINE,ADDRESS_LINE_2,ADDRESS_LINE_3,"+
		    "CITY_NAME,COUNTY_NAME,COUNTRY_CODE,STATE_CODE,ZIP_CODE,ZIP_4_CODE,IS_PRIMARY_LOCATION,IS_HOSPITAL,"+
	    	"PHONE_COUNTRY_CD,PHONE_AREA_CD,MAINPHONENUMBER,SUPPLIER_HCC_ID)"
		    			+ " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	    		PreparedStatement preparedbpStmt = connection.prepareStatement(thesuppSql);
		    	while(supplierrs.next()){
		    		preparedbpStmt.setString(1 ,supplierrs.getString("SUPPLIER_LOCATION_HCC_ID")); 
		    		preparedbpStmt.setString(2 ,supplierrs.getString("SUPPLIER_LOCATION_NAME")); 
		    		preparedbpStmt.setString(3 ,supplierrs.getString("SUPPLIER_LOCATION_NPI"));
		    		preparedbpStmt.setString(4 ,supplierrs.getString("SUPPLIER_LOCATION_STATUS"));
		    		preparedbpStmt.setString(5 ,supplierrs.getString("FAX_NUMBER"));
		    		preparedbpStmt.setString(6 ,supplierrs.getString("TELEPHONE_NUMBER"));
		    		preparedbpStmt.setString(7 ,supplierrs.getString("TELEPHONE_EXTENSION"));
		    		preparedbpStmt.setString(8 ,supplierrs.getString("ADDRESS_LINE"));
		    		preparedbpStmt.setString(9 ,supplierrs.getString("ADDRESS_LINE_2"));
		    		preparedbpStmt.setString(10 ,supplierrs.getString("ADDRESS_LINE_3"));
		    		preparedbpStmt.setString(11 ,supplierrs.getString("CITY_NAME"));
		    		preparedbpStmt.setString(12 ,supplierrs.getString("COUNTY_NAME"));
		    		preparedbpStmt.setString(13 ,supplierrs.getString("COUNTRY_CODE"));
		    		preparedbpStmt.setString(14 ,supplierrs.getString("STATE_CODE"));
		    		preparedbpStmt.setString(15 ,supplierrs.getString("ZIP_CODE"));
		    		preparedbpStmt.setString(16 ,supplierrs.getString("ZIP_4_CODE"));
		    		preparedbpStmt.setString(17 ,supplierrs.getString("IS_PRIMARY_LOCATION"));
		    		preparedbpStmt.setString(18 ,supplierrs.getString("IS_HOSPITAL"));
		    		preparedbpStmt.setString(19 ,supplierrs.getString("PHONE_COUNTRY_CD"));
		    		preparedbpStmt.setString(20 ,supplierrs.getString("PHONE_AREA_CD"));
		    		preparedbpStmt.setString(21 ,supplierrs.getString("MAINPHONENUMBER"));
		    		preparedbpStmt.setString(22 ,supplierrs.getString("SUPPLIER_HCC_ID"));
		    		preparedbpStmt.addBatch();
		    		
		    		x++;
			    	if(x>=500) {
			    		z =  z + x;
			    		x=0;
			    		preparedbpStmt.executeBatch();
			    		connection.commit();
			    		System.out.println("Committed " + z + " Supplier Locationss");
			    	}
		    		
		    	}
		    	
		    	preparedbpStmt.executeBatch();
	    		connection.commit();
	    		System.out.println("Committed " + (z + x)+ " Supplier Locations");
	    		x = 0;
	    		z = 0;
	    		preparedbpStmt.executeUpdate("alter table integration.supplierlocation_staging enable keys");
	    		preparedbpStmt.close();
	    		supplierStmt.close();
	    		supplierrs.close();


		
	}
	
	private static void BPLoad(Connection con, Connection connection) throws SQLException {
	    Statement bpProdStmt = null;

		 String bpProdQuery = "SELECT prod.sub_company_hcc_id,\r\n" + 
		    		"bp_lob.Market as LOB, prod.product_hcc_id, bp.BENEFIT_PLAN_HCC_ID, prod.product_name, bp.benefit_plan_name, acctp.account_hcc_id, bp.benefit_plan_desc\r\n" + 
		    		"FROM IUH_DEV_DW.BENEFIT_PLAN bp\r\n" + 
		    		"INNER JOIN IUH_DEV_DW.product prod\r\n" + 
		    		"ON bp.benefit_plan_product_key = prod.product_key\r\n" + 
		    		"inner join (SELECT bp.benefit_plan_key,\r\n" + 
		    		"    MAX (\r\n" + 
		    		"    CASE\r\n" + 
		    		"      WHEN lob_val.LOB_GROUP_NAME = 'Funding method'\r\n" + 
		    		"      THEN lob_val.line_of_business_name\r\n" + 
		    		"    END) AS FundingMethod,\r\n" + 
		    		"    MAX (\r\n" + 
		    		"    CASE\r\n" + 
		    		"      WHEN lob_val.LOB_GROUP_NAME = 'Market'\r\n" + 
		    		"      THEN lob_val.line_of_business_name\r\n" + 
		    		"    END) AS Market,\r\n" + 
		    		"    MAX (\r\n" + 
		    		"    CASE\r\n" + 
		    		"      WHEN lob_val.LOB_GROUP_NAME = 'Group size'\r\n" + 
		    		"      THEN lob_val.line_of_business_name\r\n" + 
		    		"    END) AS GroupSize,\r\n" + 
		    		"    MAX (\r\n" + 
		    		"    CASE\r\n" + 
		    		"      WHEN lob_val.LOB_GROUP_NAME = 'Service Area'\r\n" + 
		    		"      THEN lob_val.line_of_business_name\r\n" + 
		    		"    END) AS ServiceArea\r\n" + 
		    		"  FROM IUH_DEV_DW.benefit_plan bp\r\n" + 
		    		"  INNER JOIN IUH_DEV_DW.product_to_line_of_business prod_lob\r\n" + 
		    		"  ON bp.benefit_plan_product_key = prod_lob.product_key\r\n" + 
		    		"  INNER JOIN IUH_DEV_DW.line_of_business lob_val\r\n" + 
		    		"  ON prod_lob.line_of_business_key = lob_val.line_of_business_key\r\n" + 
		    		"  GROUP BY bp.benefit_plan_key\r\n" + 
		    		"  ) bp_lob ON bp.benefit_plan_key = bp_lob.benefit_plan_key\r\n" + 
		    		"INNER JOIN IUH_DEV_DW.Account_plan_select_fact ACCT\r\n" + 
		    		"ON bp.benefit_plan_key = ACCT.BENEFIT_PLAN_KEY\r\n" + 
		    		"INNER JOIN IUH_DEV_DW.account ACCTP\r\n" + 
		    		"ON ACCT.ACCOUNT_KEY = ACCTP.top_account_key\r\n" + 
		    		"inner join IUH_DEV_DW.account acctc\r\n" + 
		    		"on acct.account_key = acctc.account_key\r\n" + 
		    		//"where bp_lob.Market in ('Deaconess','Commercial')\r\n" + 
		    		"ORDER BY bp.benefit_plan_hcc_id,prod.product_hcc_id ASC\r\n";
		 bpProdStmt = con.createStatement();
	    	bpProdStmt.setFetchSize(1000);
	    	int x = 0;
	    	int z = 0;
	    	 ResultSet bpProdrs = bpProdStmt.executeQuery(bpProdQuery);
	    	 bpProdStmt = connection.createStatement();
		    	bpProdStmt.executeUpdate("truncate table integration.bnftplan_prodcat_staging");
		    	bpProdStmt.executeUpdate("alter table integration.bnftplan_prodcat_staging disable keys");
		    	String thebpSql = "insert into integration.bnftplan_prodcat_staging (SUB_COMPANY_HCC_ID,LOB,PRODUCT_HCC_ID,BENEFIT_PLAN_HCC_ID,PRODUCT_NAME,BENEFIT_PLAN_NAME,ACCOUNT_HCC_ID,BENEFIT_PLAN_DESC)"
		    			+ " VALUES (?,?,?,?,?,?,?,?)";
	    		PreparedStatement preparedbpStmt = connection.prepareStatement(thebpSql);
		    	while(bpProdrs.next()){
		    		preparedbpStmt.setString(1 ,bpProdrs.getString("SUB_COMPANY_HCC_ID")); 
		    		preparedbpStmt.setString(2 ,bpProdrs.getString("LOB")); 
		    		preparedbpStmt.setString(3 ,bpProdrs.getString("PRODUCT_HCC_ID"));
		    		preparedbpStmt.setString(4 ,bpProdrs.getString("BENEFIT_PLAN_HCC_ID"));
		    		preparedbpStmt.setString(5 ,bpProdrs.getString("PRODUCT_NAME"));
		    		preparedbpStmt.setString(6 ,bpProdrs.getString("BENEFIT_PLAN_NAME"));
		    		preparedbpStmt.setString(7 ,bpProdrs.getString("ACCOUNT_HCC_ID"));
		    		preparedbpStmt.setString(8 ,bpProdrs.getString("BENEFIT_PLAN_DESC"));
		    		preparedbpStmt.addBatch();
		    		
		    		x++;
			    	if(x>=500) {
			    		z =  z + x;
			    		x=0;
			    		preparedbpStmt.executeBatch();
			    		connection.commit();
			    		System.out.println("Committed " + z + " BP's");
			    	}
		    		
		    	}
		    	
		    	preparedbpStmt.executeBatch();
	    		connection.commit();
	    		System.out.println("Committed " + (z + x)+ " BP's");
	    		x = 0;
	    		z = 0;
		    	bpProdStmt.executeUpdate("alter table integration.bnftplan_prodcat_staging enable keys");
		    	bpProdStmt.close();
		    	preparedbpStmt.close();
		    	bpProdrs.close();

		
	}
	
	private static void AccountLoad(Connection con, Connection connection) throws SQLException {
	    Statement acctStmt = null;
	    int x = 0;
	    int z = 0;
	    String accountQuery = "select distinct ahf.top_account_key as TOP_ACCOUNT_KEY, ahf.account_key as ACCOUNT_KEY, ahf.account_hcc_id as ACCOUNT_HCC_ID, \r\n" + 
	    		"		    				  ahf.account_name as ACCOUNT_NAME, ahf.parent_account_names as PARENT_ACCOUNT_NAMES, ahf.ACCOUNT_LEVEL as ACCOUNT_LEVEL, \r\n" + 
	    		"		    		         (select max(account_hcc_id) from IUH_DEV_DW.account where account_name = REGEXP_SUBSTR(ahf.parent_account_names,'[^|]+', 1, 1)) as THEPARENT \r\n" + 
	    		"		    		          from IUH_DEV_DW.account_history_fact ahf \r\n" + 
	    		"		    		          order by ahf.top_account_key, ahf.account_key asc\r\n" + 
	    		"		    ";
	    acctStmt = con.createStatement();
    	
    	
    	acctStmt.setFetchSize(1000);
    	
    	ResultSet accountrs = acctStmt.executeQuery(accountQuery);
    	//acctStmt.close();
    	acctStmt = connection.createStatement();
    	acctStmt.executeUpdate("truncate table integration.account_staging");
    	acctStmt.executeUpdate("alter table integration.account_staging disable keys");

    	String theaccSql = "insert into integration.account_staging (TOP_ACCOUNT_KEY,ACCOUNT_KEY,ACCOUNT_HCC_ID,ACCOUNT_NAME,PARENT_ACCOUNT_NAMES,ACCOUNT_LEVEL,THEPARENT)"
    			+ " VALUES (?,?,?,?,?,?,?)";
		PreparedStatement preparedaccStmt = connection.prepareStatement(theaccSql);
    	while(accountrs.next()){
    		preparedaccStmt.setString(1 ,accountrs.getString("TOP_ACCOUNT_KEY")); 
    		preparedaccStmt.setString(2 ,accountrs.getString("ACCOUNT_KEY"));
    		preparedaccStmt.setString(3 ,accountrs.getString("ACCOUNT_HCC_ID"));
    		preparedaccStmt.setString(4 ,accountrs.getString("ACCOUNT_NAME"));
    		preparedaccStmt.setString(5 ,accountrs.getString("PARENT_ACCOUNT_NAMES"));
    		preparedaccStmt.setString(6 ,accountrs.getString("ACCOUNT_LEVEL"));
    		preparedaccStmt.setString(7 ,accountrs.getString("THEPARENT"));
    		preparedaccStmt.addBatch();
    		
    		x++;
	    	if(x>=500) {
	    		z =  z + x;
	    		x=0;
	    		preparedaccStmt.executeBatch();
	    		connection.commit();
	    		System.out.println("Committed " + z + " Accounts");
	    	}
    		
    	}
    	preparedaccStmt.executeBatch();
		connection.commit();
		System.out.println("Committed " + (z + x) + " Accounts");
		x = 0;
		z = 0;
    	acctStmt.executeUpdate("alter table integration.account_staging enable keys");
    	preparedaccStmt.close();
    	accountrs.close();
    	acctStmt.close();
    	
       
	}
	
	private static void PractitionerLoad(Connection con, Connection connection) throws SQLException {
		Statement pracStmt = null;
	    int x = 0;
	    int z = 0;
		String practitionerSql = "SELECT distinct A.PRACTITIONER_HCC_ID   \"PRACTITIONER_ID\",\r\n" + 
				"       A. PRACTITIONER_KEY              \"PRACT_KEY\",\r\n" + 
				"       A.PRACTITIONER_FIRST_NAME        \"FIRST_NAME\",\r\n" + 
				"       A.PRACTITIONER_MIDDLE_NAME       \"MIDDLE_NAME\",\r\n" + 
				"       A.PRACTITIONER_LAST_NAME         \"LAST_NAME\",     \r\n" + 
				"       A.PRACTITIONER_NPI               \"NPI\",\r\n" + 
				"       A.IS_PCP                         \"PCP\",       \r\n" + 
				"       PRHF.IS_OBGYN                    \"OBGYN\",\r\n" + 
				"       PRHF.IS_SPECIALIST               \"SPECIALIST\",\r\n" + 
				"       PRHF.PRACTITIONER_ROLE_NAME     \"PRACTITIONER_ROLE_NAME\",\r\n" + 
				"       PRHF.PRACTITIONER_ROLE_STATUS    \"PRACTITIONER_ROLE_STATUS\",\r\n" + 
				"       LC.LANGUAGE_DOMAIN_NAME          \"PRIMARY_LANGUAGE\",  \r\n" + 
				"        A.PRACTITIONER_NAME_PREFIX     \"NAME_PREFIX\",\r\n" + 
				"        A.PRACTITIONER_NAME_SUFFIX     \"SUFFIX_NAME\",\r\n" + 
				"        A.GENDER_CODE                  \"GENDER\",\r\n" + 
				"        G1.DATE_VALUE                  \"FIRST_ACTIVE_DATE\",\r\n" + 
				"        C.ADDRESS_LINE                \"ADDRESS_LINE\",\r\n" + 
				"        C.ADDRESS_LINE_2               \"ADDRESS_LINE_2\",\r\n" + 
				"        C.ADDRESS_LINE_3               \"ADDRESS_LINE_3\",\r\n" + 
				"        C.COUNTRY_NAME                 \"COUNTRY\",\r\n" + 
				"        CC.COUNTY_NAME                 \"COUNTY\",\r\n" + 
				"        C.STATE_CODE                   \"STATE\",\r\n" + 
				"        C.CITY_NAME                    \"CITY\",\r\n" + 
				"        C.ZIP_CODE                     \"ZIPCODE\",\r\n" + 
				"        C.ZIP_4_CODE                    \"ZIPCODE4\",\r\n" + 
				"       MAX( CASE WHEN histtax.IS_PRIMARY = 'Y' THEN ntax.PROVIDER_TAXONOMY_NAME\r\n" + 
				"        else NULL END) AS PRIMARY_SPECIALTY,\r\n" + 
				"       MAX(CASE WHEN histtax.IS_SECONDARY = 'Y' THEN ntax.PROVIDER_TAXONOMY_NAME\r\n" + 
				"        else NULL END) AS SECONDARY_SPECIALTY,\r\n" + 
				"       -- B.CLASSIFICATION                \"PRIMARY SPECIALTY\",\r\n" + 
				"       -- A1.CLASSIFICATION               \"SECONDARY SPECIALTY\",\r\n" + 
				"       A.TELEPHONE_NUMBER              \"PHONE\",\r\n" + 
				"       A.TELEPHONE_EXTENSION           \"PHONE_EXTENSION\",      \r\n" + 
				"       EC.ETHNICITY_DESC               \"ETHNICITY\" \r\n" + 
				"\r\n" + 
				"FROM      IUH_DEV_DW.PRACTITIONER A\r\n" + 
				"LEFT JOIN    IUH_DEV_DW.POSTAL_ADDRESS C    ON A.PRACTITIONER_CORR_ADDR_KEY = C.POSTAL_ADDRESS_KEY  \r\n" + 
				"LEFT JOIN    IUH_DEV_DW.DATE_DIMENSION G1   ON A.FIRST_EFFECTIVE_DATE_KEY =  G1.DATE_KEY\r\n" + 
				"LEFT JOIN    IUH_DEV_DW.PRACTITIONER_ROLE_HISTORY_FACT PRHF ON PRHF.PRACTITIONER_KEY=A.PRACTITIONER_KEY\r\n" + 
				"LEFT JOIN    IUH_DEV_DW.PRACTITIONER_ROLE_HISTORY_FACT PRHF ON PRHF.PRIMARY_SPECIALTY_KEY=A.PRIMARY_SPECIALTY_KEY\r\n" + 
				"JOIN IUH_DEV_DW.PRACT_HIST_TO_PROVIDER_TXNMY HISTTAX ON HISTTAX.PRACTITIONER_HISTORY_FACT_KEY = A.PRACTITIONER_HIST_FACT_KEY\r\n" + 
				"JOIN IUH_DEV_DW.PROVIDER_TAXONOMY NTAX ON NTAX.PROVIDER_TAXONOMY_KEY = HISTTAX.PROVIDER_TAXONOMY_KEY\r\n" + 
				"  JOIN        IUH_DEV_DW.PRACT_HIST_FACT_TO_LANG_CD PHFLC ON PHFLC.PRACTITIONER_HIST_FACT_KEY=A.PRACTITIONER_HIST_FACT_KEY\r\n" + 
				"  JOIN        IUH_DEV_DW.LANGUAGE_CODE LC ON LC.LANGUAGE_DOMAIN_KEY=PHFLC.LANGUAGE_DOMAIN_KEY\r\n" + 
				"LEFT JOIN        IUH_DEV_DW.COUNTY_CODE CC ON CC.COUNTY_CODE=C.COUNTY_CODE\r\n" + 
				"LEFT JOIN       IUH_DEV_DW.ETHNICITY_CODE EC ON EC.ETHNICITY_KEY=A.ETHNICITY_KEY\r\n" + 
				"--where  A.practitioner_hcc_id = 'RP00034882'\r\n" + 
				"GROUP BY A.PRACTITIONER_HCC_ID ,  \r\n" + 
				"       A. PRACTITIONER_KEY ,            \r\n" + 
				"       A.PRACTITIONER_FIRST_NAME,        \r\n" + 
				"       A.PRACTITIONER_MIDDLE_NAME,       \r\n" + 
				"       A.PRACTITIONER_LAST_NAME,         \r\n" + 
				"       A.PRACTITIONER_NPI  ,          \r\n" + 
				"       A.IS_PCP   ,                           \r\n" + 
				"       PRHF.IS_OBGYN  ,                  \r\n" + 
				"       PRHF.IS_SPECIALIST ,              \r\n" + 
				"       PRHF.PRACTITIONER_ROLE_NAME ,    \r\n" + 
				"       PRHF.PRACTITIONER_ROLE_STATUS,    \r\n" + 
				"       LC.LANGUAGE_DOMAIN_NAME ,         \r\n" + 
				"        A.PRACTITIONER_NAME_PREFIX ,    \r\n" + 
				"        A.PRACTITIONER_NAME_SUFFIX ,    \r\n" + 
				"        A.GENDER_CODE ,                 \r\n" + 
				"        G1.DATE_VALUE ,                \r\n" + 
				"        C.ADDRESS_LINE ,               \r\n" + 
				"        C.ADDRESS_LINE_2,               \r\n" + 
				"        C.ADDRESS_LINE_3 ,              \r\n" + 
				"        C.COUNTRY_NAME ,                \r\n" + 
				"        CC.COUNTY_NAME ,                \r\n" + 
				"        C.STATE_CODE  ,                 \r\n" + 
				"        C.CITY_NAME   ,                 \r\n" + 
				"        C.ZIP_CODE   ,                  \r\n" + 
				"        C.ZIP_4_CODE ,\r\n" + 
				"        A.TELEPHONE_NUMBER,\r\n" + 
				"        A.TELEPHONE_EXTENSION ,\r\n" + 
				"        EC.ETHNICITY_DESC        \r\n" + 
				"order by A.PRACTITIONER_FIRST_NAME, A.PRACTITIONER_MIDDLE_NAME";
		
		pracStmt = con.createStatement();
    	
    	
		pracStmt.setFetchSize(1000);
    	
    	ResultSet practrs = pracStmt.executeQuery(practitionerSql);
    	//acctStmt.close();
    	pracStmt = connection.createStatement();
    	pracStmt.executeUpdate("truncate table integration.practitioner_staging");
    	pracStmt.executeUpdate("alter table integration.practitioner_staging disable keys");

    	String thepracSql = "insert into integration.practitioner_staging (PRACTITIONER_ID,PRACT_KEY,FIRST_NAME,MIDDLE_NAME,"+
    	"LAST_NAME,NPI,PCP,OBGYN,SPECIALIST,PRACTITIONER_ROLE_NAME,PRACTITIONER_ROLE_STATUS,PRIMARY_LANGUAGE,NAME_PREFIX,"+
    			"SUFFIX_NAME,GENDER,FIRST_ACTIVE_DATE,ADDRESS_LINE,ADDRESS_LINE_2,ADDRESS_LINE_3,COUNTRY,COUNTY,STATE,CITY,"+
    					"ZIPCODE,ZIPCODE4,PRIMARY_SPECIALTY,SECONDARY_SPECIALTY,PHONE,PHONE_EXTENSION,ETHNICITY)"
    			+ " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedpracStmt = connection.prepareStatement(thepracSql);
    	while(practrs.next()){
    		preparedpracStmt.setString(1 ,practrs.getString("PRACTITIONER_ID")); 
    		preparedpracStmt.setString(2 ,practrs.getString("PRACT_KEY"));
    		preparedpracStmt.setString(3 ,practrs.getString("FIRST_NAME"));
    		preparedpracStmt.setString(4 ,practrs.getString("MIDDLE_NAME"));
    		preparedpracStmt.setString(5 ,practrs.getString("LAST_NAME"));
    		preparedpracStmt.setString(6 ,practrs.getString("NPI"));
    		preparedpracStmt.setString(7 ,practrs.getString("PCP"));
    		preparedpracStmt.setString(8 ,practrs.getString("OBGYN"));
    		preparedpracStmt.setString(9 ,practrs.getString("SPECIALIST"));
    		preparedpracStmt.setString(10 ,practrs.getString("PRACTITIONER_ROLE_NAME"));
    		preparedpracStmt.setString(11 ,practrs.getString("PRACTITIONER_ROLE_STATUS"));
    		preparedpracStmt.setString(12 ,practrs.getString("PRIMARY_LANGUAGE"));
    		preparedpracStmt.setString(13 ,practrs.getString("NAME_PREFIX"));
    		preparedpracStmt.setString(14 ,practrs.getString("SUFFIX_NAME"));
    		preparedpracStmt.setString(15 ,practrs.getString("GENDER"));
    		preparedpracStmt.setString(16 ,practrs.getString("FIRST_ACTIVE_DATE"));
    		preparedpracStmt.setString(17 ,practrs.getString("ADDRESS_LINE"));
    		preparedpracStmt.setString(18 ,practrs.getString("ADDRESS_LINE_2"));
    		preparedpracStmt.setString(19 ,practrs.getString("ADDRESS_LINE_3"));
    		preparedpracStmt.setString(20 ,practrs.getString("COUNTRY"));
    		preparedpracStmt.setString(21 ,practrs.getString("COUNTY"));
    		preparedpracStmt.setString(22 ,practrs.getString("STATE"));
    		preparedpracStmt.setString(23 ,practrs.getString("CITY"));
    		preparedpracStmt.setString(24 ,practrs.getString("ZIPCODE"));
    		preparedpracStmt.setString(25 ,practrs.getString("ZIPCODE4"));
    		preparedpracStmt.setString(26 ,practrs.getString("PRIMARY_SPECIALTY"));
    		preparedpracStmt.setString(27 ,practrs.getString("SECONDARY_SPECIALTY"));
    		preparedpracStmt.setString(28,practrs.getString("PHONE"));
    		preparedpracStmt.setString(29 ,practrs.getString("PHONE_EXTENSION"));
    		preparedpracStmt.setString(30 ,practrs.getString("ETHNICITY"));
    		
    		preparedpracStmt.addBatch();
    		
    		x++;
	    	if(x>=500) {
	    		z =  z + x;
	    		x=0;
	    		preparedpracStmt.executeBatch();
	    		connection.commit();
	    		System.out.println("Committed " + z + " Practitioner");
	    	}
    		
    	}
    	preparedpracStmt.executeBatch();
		connection.commit();
		System.out.println("Committed " + (z + x) + " Practiioner");
		x = 0;
		z = 0;
		pracStmt.executeUpdate("alter table integration.practitioner_staging enable keys");
		preparedpracStmt.close();
    	practrs.close();
    	pracStmt.close();
	}
	
	private static void PostProcess(Connection connection) throws InterruptedException, SQLException {
		PreparedStatement preparedStmt = connection.prepareStatement("select 1 from dual");
		System.out.println("HASHEM() = " + preparedStmt.executeUpdate("call hashthem"));
		System.out.println("LOAD_DELTAS() = " + preparedStmt.executeUpdate("call load_deltas"));
		connection.commit();
		preparedStmt.close();
		
	}

}
