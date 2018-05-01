package com.ustgloacl.caremanager.ustcareadmin;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.sql.rowset.JdbcRowSet;
import com.sun.rowset.JdbcRowSetImpl;



public class getRS {
	static Connection conn = null;

	public static String getCSVIGP(int lim) throws Exception {

		String csv = "";
		ResultSetMetaData rsmd = null;

		try {
			conn = DriverManager
					.getConnection("jdbc:mysql://localhost/integration?" + "user=integration&password=integration");

			Statement stmt = conn.createStatement();

			String qry = "SELECT TOP_ACCOUNT_KEY, ACCOUNT_KEY, ACCOUNT_HCC_ID, ACCOUNT_NAME, PARENT_ACCOUNT_NAMES, ACCOUNT_LEVEL, THEPARENT FROM integration.account_delta ORDER by TOP_ACCOUNT_KEY,ACCOUNT_KEY";
			String dbopts = " LIMIT " + lim;
			// String ORDER = " order by TOP_ACCOUNT_KEY,ACCOUNT_KEY";
			ResultSet rs = stmt.executeQuery(qry + dbopts);
			while (rs.next()) {

				csv += rs2csvr.convertIGPToCsv(rs) + "\n";

			}
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());

		}

		conn.close();

		return csv;

	}
	
	public static String getCSVpractioner(int lim) throws Exception {

		String csv = "";
		ResultSetMetaData rsmd = null;
		List ThisOne;

		try {
			conn = DriverManager
					.getConnection("jdbc:mysql://localhost/integration?" + "user=integration&password=integration");

			Statement stmt = conn.createStatement();

			String qry = "SELECT PRACTITIONER_ID, PRACT_KEY,FIRST_NAME,MIDDLE_NAME,LAST_NAME, NPI,PCP,OBGYN, SPECIALIST, PRACTITIONER_ROLE_NAME, PRACTITIONER_ROLE_STATUS, PRIMARY_LANGUAGE, NAME_PREFIX, SUFFIX_NAME, GENDER, FIRST_ACTIVE_DATE, ADDRESS_LINE, ADDRESS_LINE_2, ADDRESS_LINE_3, COUNTRY, COUNTY, STATE, CITY, ZIPCODE, ZIPCODE4, PRIMARY_SPECIALTY, SECONDARY_SPECIALTY, PHONE, PHONE_EXTENSION, ETHNICITY"
					+ " FROM integration.practitioner_delta ";
					
			String ORDER = " ORDER BY PRACTITIONER_ID";
		
			
			String LIMIT = " LIMIT " + lim;
			System.out.println(qry + ORDER + LIMIT);
			ResultSet rs = stmt.executeQuery(qry + ORDER + LIMIT);
			String value=null;
			

			ResultSetMetaData meta = rs.getMetaData();

			int numberOfColumns = meta.getColumnCount();
			
		     
		     
		     List<LinkedHashMap<String, Object>> xyz = convertResultSetToList(rs);
		     
		     
		     
		     


int x=0;
			while(!xyz.isEmpty()) {
				
				csv += rs2csvr.convertPractitionerToCsv(xyz) + "\n";



				
			}
			
			while (rs.next()) {
				value = rs.toString();
	//			csv += rs2csvr.convertPractitionerToCsv(rs) + "\n";

				int z=0;

			}
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());

		}

		conn.close();

		System.out.println("bye\n");
		return csv;

	}
	
	public static List<LinkedHashMap<String, Object>> convertResultSetToList(ResultSet rs) throws SQLException {
	    ResultSetMetaData md = rs.getMetaData();
	    int columns = md.getColumnCount();
	    //HashMap<String,Object> row = new HashMap<String,Object>();
	    List<LinkedHashMap<String,Object>> list = new ArrayList<LinkedHashMap<String,Object>>();
	    
	    
	    
        LinkedHashMap<String,Object> row = new LinkedHashMap<String, Object>(columns);


	    while (rs.next()) {
	        for(int i=1; i<=columns; ++i) {
	           row.put(md.getColumnName(i),rs.getObject(i));
	        }
	        list.add(row);
	    }

	    return list;
	}
	
	
	public static List resultSetToArrayList(ResultSet rs) throws SQLException{
		  ResultSetMetaData md = rs.getMetaData();
		  int columns = md.getColumnCount();
		  ArrayList list = new ArrayList(50);
		  while (rs.next()){
		     HashMap row = new HashMap(columns);
		     for(int i=1; i<=columns; ++i){           
		      row.put(md.getColumnName(i),rs.getObject(i));
		     }
		      list.add(row);
		  }

		 return list;
		}

}
