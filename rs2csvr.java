package com.ustgloacl.caremanager.ustcareadmin;

import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class rs2csvr {

	ResultSet rs;

	public static String convertIGPToCsv(ResultSet rs) throws SQLException, FileNotFoundException {
		// PrintWriter csvWriter = new PrintWriter(new File("whatever.csv")) ;
		ResultSetMetaData meta = rs.getMetaData();
		int numberOfColumns = meta.getColumnCount();
		String dataHeaders = "\"" + meta.getColumnName(1) + "\"";
		for (int i = 2; i < numberOfColumns + 1; i++) {
			dataHeaders += ",\"" + meta.getColumnName(i).replaceAll("\"", "\\\"") + "\"";
		}
		// csvWriter.println(dataHeaders) ;
		String row = null;
		while (!rs.isAfterLast()) {
			row = rs.getInt(1) + ",";

			// get the first 2 ints
			for (int i = 2; i < 3; i++) {
				try {
					String col = rs.getInt(i) + ",";
					row += col;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					row += ",\"\"";
				}

			}

			for (int i = 3; i < 6; i++) {
				try {
					String col = "\"" + rs.getString(i).replaceAll("\"", "\\\"") + "\",";
					row += col;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					row += ",";
				}

			}

			for (int i = 6; i < 7; i++) {
				try {
					String col = rs.getInt(i) + ",";
					row += col;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					row += ",";
				}

			}

			for (int i = 6; i < numberOfColumns - 1; i++) {
				try {
					String col = "\"" + rs.getString(i).replaceAll("\"", "\\\"") + "\",";
					row += col;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					row += ",";
				}

				// row += ",\"" + rs.getString(i).replaceAll("\"","\\\"") + "\"" ;
			}

			return row;
			// csvWriter.println(row) ;
		}
		// csvWriter.close();
		return row;
	}

	public static String convertPractitionerToCsv(List<LinkedHashMap<String, Object>> xyz) throws SQLException, FileNotFoundException {


		String row = "";
		String col = "";
		

		System.out.println("For Loop:");

		for(int x=0;x < xyz.size();++x)
		{
			LinkedHashMap<String, Object> chunk = xyz.get(x);
			
			for(Entry<String, Object> me : chunk.entrySet())
			{
				
		          System.out.println("Key:  Value: " + xyz.get(x) + "\n\n");

				
			}
		
        	//if(xyz.equals(null))	row += ",";
		//	else row += xyz.getValue().toString() + ",";
		       	        	
          System.out.println("Key:  Value: " + xyz.get(x) + "\n\n");
	}
		
		
		
		
		/*
		ResultSetMetaData meta = a.getMetaData();

		int numberOfColumns = meta.getColumnCount();
		String dataHeaders = "\"" + meta.getColumnName(1) + "\"";
		for (int i = 2; i < numberOfColumns + 1; i++) {
			dataHeaders += ",\"" + meta.getColumnName(i).replaceAll("\"", "\\\"") + "\"";
		}
		String row = "";
		String col = "";
		int i = 0;
		while (!a.isAfterLast()) {
			for (int x = 1, y = 0; x < meta.getColumnCount(); ++x) {
				col = "";
				if (a.getMetaData().getColumnTypeName(x) == "VARCHAR")
					col += a.getString(x);
				else
					col += String.valueOf(a.getInt(x));

				if (a.wasNull())
					row += ",";
				else
					row += col + ",";
			}
++i;
			System.out.println("fake file " + i + "\n\n");

		
		*/
		return row;
	}

	}


