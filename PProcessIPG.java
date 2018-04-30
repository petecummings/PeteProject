package com.ustgloacl.caremanager.ustcareadmin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import com.click4care.thinkhealth._6_5.dto.AnyItemsType;
import com.click4care.thinkhealth._6_5.dto.InsurancePurchaserGroupType;
import com.click4care.thinkhealth._6_5.dto.ObjectFactory;
import com.opencsv.CSVReader;
import com.ustglobal.caremanager.ustcareadmin.model.AccountIPGModel;
import com.ustglobal.caremanager.ustcareadmin.model.BatchLoaderModel;
import com.ustglobal.caremanager.ustcareadmin.model.SuccessFail;

public class PProcessIPG {
	public int lines;
	static AccountIPGModel parent = null;
	static int nextParentId = 0;
	static String parenthccid = null;
	static Map<String, AccountIPGModel> main = new HashMap<String, AccountIPGModel>();
	static Map<String, AccountIPGModel> theTopMap = new HashMap<String, AccountIPGModel>();
	static Map<String, AccountIPGModel> the1Map = new HashMap<String, AccountIPGModel>();
	static Map<String, AccountIPGModel> the2Map = new HashMap<String, AccountIPGModel>();
	static Map<String, AccountIPGModel> the3Map = new HashMap<String, AccountIPGModel>();
	static Map<String, AccountIPGModel> the4Map = new HashMap<String, AccountIPGModel>();
	DBWorker db = new DBWorker();
	BatchLoaderModel batch = new BatchLoaderModel();

	public PProcessIPG() {
		/*
		 * QUERY TO USE select top_account_key, account_key, account_hcc_id,
		 * account_name, parent_account_names, ACCOUNT_LEVEL from hr_dwh.account connect
		 * by prior top_account_key = account_key AND parent_account_names <>
		 * account_name order by top_account_key, account_key asc
		 */

	}

	public int LoadAccount(String file) throws IOException, JAXBException, InterruptedException {
		Date start = new Date();
		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		JAXBElement<InsurancePurchaserGroupType> umet = null;
		JAXBElement<InsurancePurchaserGroupType> umet1 = null;
		JAXBElement<InsurancePurchaserGroupType> umet2 = null;
		JAXBElement<InsurancePurchaserGroupType> umet3 = null;
		JAXBElement<InsurancePurchaserGroupType> umet4 = null;

		BufferedReader treader = new BufferedReader(new FileReader(file));
		lines = 0;

		while (treader.readLine() != null)
			lines++;
		treader.close();
		AccountIPGModel[] ipgmodel = new AccountIPGModel[lines];
		CSVReader reader = null;
		try {
			int i = 0;
			reader = new CSVReader(new FileReader(file));
			String[] line;
			//reader.readNext();
			while ((line = reader.readNext()) != null) {

				ipgmodel[i] = new AccountIPGModel(line);
				// System.out.println(ipgmodel[i].getAccountHccId());
				// Files.write(Paths.get("c:\\users\\u61906\\myfile.txt"),
				// ipgmodel[i].toString().getBytes(), StandardOpenOption.APPEND);
				main.put(ipgmodel[i].getTopAccountKey(),ipgmodel[i]);
				if (ipgmodel[i].getAccountLevel().equalsIgnoreCase("0")) {
					// process subscriber
					theTopMap.put(ipgmodel[i].getAccountKey(), ipgmodel[i]);
					// System.out.println(submodel[i].getFirstName());
				} else if (ipgmodel[i].getAccountLevel().equalsIgnoreCase("1")) {
					the1Map.put(ipgmodel[i].getAccountName(), ipgmodel[i]);
				} else if (ipgmodel[i].getAccountLevel().equalsIgnoreCase("2")) {
					the2Map.put(ipgmodel[i].getAccountName(), ipgmodel[i]);

				} else if (ipgmodel[i].getAccountLevel().equalsIgnoreCase("3")) {
					the3Map.put(ipgmodel[i].getAccountName(), ipgmodel[i]);

				} else if (ipgmodel[i].getAccountLevel().equalsIgnoreCase("4")) {
					the4Map.put(ipgmodel[i].getAccountName(), ipgmodel[i]);
				}

				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<InsurancePurchaserGroupType> ipg = ProcessTopAccount();
		List<InsurancePurchaserGroupType> ipg1 = Process1Account();
		List<InsurancePurchaserGroupType> ipg2 = Process2Account();
		List<InsurancePurchaserGroupType> ipg3 = Process3Account();

		for (InsurancePurchaserGroupType ip : ipg) {
			umet = of.createInsurancePurchaserGroup(ip);

			ai.getAny().add(umet);
			try {
			InitIS.port.addOrUpdate(ai);
			}
			catch(Exception e) {
				System.out.println(e);
				ai.getAny().clear();
				continue;
			}
			ai.getAny().clear();
			
		}
		
		
		
		for (InsurancePurchaserGroupType ip1 : ipg1) {
			umet1 = of.createInsurancePurchaserGroup(ip1);
			ai.getAny().add(umet1);
			try {
				InitIS.port.addOrUpdate(ai);
				}
				catch(Exception e) {
					System.out.println(e);
					ai.getAny().clear();
					continue;
				}
				ai.getAny().clear();
			
		}
		
	
		for (InsurancePurchaserGroupType ip2 : ipg2) {
			umet2 = of.createInsurancePurchaserGroup(ip2);
			ai.getAny().add(umet2);
			try {
				InitIS.port.addOrUpdate(ai);
				}
				catch(Exception e) {
					System.out.println(e);
					ai.getAny().clear();
					continue;
				}
				ai.getAny().clear();
		}
		
		
		ai.getAny().clear();
		Thread.sleep(10000);
		
		for (InsurancePurchaserGroupType ip3 : ipg3) {
			umet3 = of.createInsurancePurchaserGroup(ip3);
			ai.getAny().add(umet3);
			try {
				InitIS.port.addOrUpdate(ai);
				}
				catch(Exception e) {
					System.out.println(e);
					ai.getAny().clear();
					continue;
				}
				ai.getAny().clear();
		}
		
		
		SuccessFail results = new SuccessFail();
		
		try {
			//InitIS.port.addOrUpdate(ai);
			//Marshaller m = context.createMarshaller();
			//m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			//m.marshal(ait, System.out);
			results.setSuccessfulRecords(lines-1);
		
		}
		catch(Exception e) {
			System.out.println(e);
			//results = db.DeBatchAndProcessSingle(batch, file,ai, results);
		}
		finally {
		Date end = new Date();
		//db.AddBatchLogging(start, end, file, results.getSuccessfulRecords(), results.getFailedRecords(), (lines-1));
		}
		//
		
		// m.marshal(ait, new File("C://Users/u61906/accounts.output"));
		return lines;

	}

	public List<InsurancePurchaserGroupType> ProcessTopAccount() {
		java.util.Iterator<Entry<String, AccountIPGModel>> it = theTopMap.entrySet().iterator();
		List<InsurancePurchaserGroupType> lpct = new ArrayList<InsurancePurchaserGroupType>();
		while (it.hasNext()) {
			InsurancePurchaserGroupType ipg = new InsurancePurchaserGroupType();
			Map.Entry pair = (Map.Entry) it.next();

			ipg.setName(theTopMap.get(pair.getKey()).getAccountName());
			ipg.setDescription(theTopMap.get(pair.getKey()).getAccountHccId());
			ipg.setUniversalId(theTopMap.get(pair.getKey()).getAccountHccId());

			lpct.add(ipg);
		}
		return lpct;

	}

	public List<InsurancePurchaserGroupType> Process1Account() {
		java.util.Iterator<Entry<String, AccountIPGModel>> it = the1Map.entrySet().iterator();
		List<InsurancePurchaserGroupType> lpct = new ArrayList<InsurancePurchaserGroupType>();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();

			String theId = the1Map.get(pair.getKey()).getAccountLevel();
			if (theId.trim().equalsIgnoreCase("1")) {
				InsurancePurchaserGroupType ipg = new InsurancePurchaserGroupType();
				ipg.setName(the1Map.get(pair.getKey()).getAccountName());
				ipg.setDescription(the1Map.get(pair.getKey()).getAccountName());
				ipg.setUniversalId(the1Map.get(pair.getKey()).getAccountHccId());
				String t = the1Map.get(pair.getKey()).getTopAccountKey();
				
				String parent = the1Map.get(pair.getKey()).getTheParent();
				//System.out.println(parent);
					ipg.setParentGroupUniversalId(parent);
				lpct.add(ipg);
			}

		}
		return lpct;

	}

	public List<InsurancePurchaserGroupType> Process2Account() {
		java.util.Iterator<Entry<String, AccountIPGModel>> it = the2Map.entrySet().iterator();
		List<InsurancePurchaserGroupType> lpct = new ArrayList<InsurancePurchaserGroupType>();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();

			InsurancePurchaserGroupType ipg = new InsurancePurchaserGroupType();
			ipg.setName(the2Map.get(pair.getKey()).getAccountName());
			ipg.setDescription(the2Map.get(pair.getKey()).getAccountName());
			ipg.setUniversalId(the2Map.get(pair.getKey()).getAccountHccId());
			String t = the2Map.get(pair.getKey()).getParentAccountNames();
			String[] value_split = t.split("\\|");
			String parent = the2Map.get(pair.getKey()).getTheParent();
			//System.out.println(parent);
			ipg.setParentGroupUniversalId(parent);
			lpct.add(ipg);

		}
		return lpct;

	}
	
	public List<InsurancePurchaserGroupType> Process3Account() {
		java.util.Iterator<Entry<String, AccountIPGModel>> it = the3Map.entrySet().iterator();
		List<InsurancePurchaserGroupType> lpct = new ArrayList<InsurancePurchaserGroupType>();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();

			InsurancePurchaserGroupType ipg = new InsurancePurchaserGroupType();
			ipg.setName(the3Map.get(pair.getKey()).getAccountName());
			ipg.setDescription(the3Map.get(pair.getKey()).getAccountName());
			ipg.setUniversalId(the3Map.get(pair.getKey()).getAccountHccId());
			String t = the3Map.get(pair.getKey()).getParentAccountNames();
			String[] value_split = t.split("\\|");
			String parent = the3Map.get(pair.getKey()).getTheParent();
			ipg.setParentGroupUniversalId(parent);
			//System.out.println(parent);
			lpct.add(ipg);

		}
		return lpct;

	}
	
	
}
