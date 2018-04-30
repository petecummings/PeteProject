package com.ustgloacl.caremanager.ustcareadmin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;


public class MainApp {

	public static void main(String[] args) throws IOException, JAXBException, ParseException, DatatypeConfigurationException, InterruptedException {
		
		
		System.out.println("alpha");
		String csv="";
		
		/*
		
		
		try {
			csv = getRS.getCSVIGP(5);
			
			ProcessIPG processIt = new ProcessIPG();
			processIt.LoadAccount(csv);
			//System.out.println(csv);			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
			
		try {
			csv = getRS.getCSVpractioner(5);
			
			ProcessPractioner processIt = new ProcessPractioner();
			processIt.loadPractitioner(csv);		
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("omega ");


	}

    

	
    

    // Do something with the Connection

		
		
		//String filename = "C:\\Users\\u61906\\single_accountvuteq.csv";
		//ProcessIPG processIt = new ProcessIPG();
		//processIt.LoadAccount(filename);
		
		//String f2 = "C:\\Users\\u61906\\export.csv";
		//ProcessProdCat prodCat = new ProcessProdCat();
		//prodCat.LoadProdCat(f2);
		
		
		//String f3 = "C:\\Users\\u61906\\flintstones_vuteq.csv";
		//ProcessSubscription ps = new ProcessSubscription();
		//ps.LoadSubscription(f3);
		
		//String f4 = "C:\\Users\\u61906\\supplier_LOADME.txt";
		//ProcessSupplier pss = new ProcessSupplier();
		//pss.LoadSupplier(f4);

		//Thread.sleep(5000);
		
		//String f5 = "C:\\Users\\u61906\\supplierLocation_LOADME.txt";
		//ProcessSupplierLocation psl = new ProcessSupplierLocation();
		//psl.LoadSupplierLocation(f5);
		//System.exit(0);
		
		//String f6 = "C:\\Users\\u61906\\practitioner_LOADME.txt";
		//ProcessPractioner pp = new ProcessPractioner();
		//pp.loadPractitioner(f6);
		//System.exit(0);
		
	}
	
	


