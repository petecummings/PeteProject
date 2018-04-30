package com.ustgloacl.caremanager.ustcareadmin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import com.click4care.thinkhealth._6_5.dto.AddressType;
import com.click4care.thinkhealth._6_5.dto.AnyItemsType;
import com.click4care.thinkhealth._6_5.dto.ContactInformationType;
import com.click4care.thinkhealth._6_5.dto.ContactInformationType.Addresses;
import com.click4care.thinkhealth._6_5.dto.DropDownListItemProviderSpecialtiesType;
import com.click4care.thinkhealth._6_5.dto.ObjectFactory;
import com.click4care.thinkhealth._6_5.dto.ProviderType;
import com.click4care.thinkhealth.core.dto.PhoneNumberType;
import com.click4care.thinkhealth.core.dto.TypeOfAddress;
import com.click4care.thinkhealth.core.dto.TypeOfCountry;
import com.click4care.thinkhealth.core.dto.TypeOfPhoneNumber;
import com.click4care.thinkhealth.core.dto.TypeOfUserState;
import com.opencsv.CSVReader;
import com.ustglobal.caremanager.ustcareadmin.model.BatchLoaderModel;
import com.ustglobal.caremanager.ustcareadmin.model.SupplierModel;

public class ProcessSupplier {
	public int lines;
	static SupplierModel suppliers = null;
	static Map<String, SupplierModel> supMap = new HashMap<String, SupplierModel>();
	static Map<String, SupplierModel> specialtyMap = new HashMap<String, SupplierModel>();
	DBWorker db = new DBWorker();
	BatchLoaderModel batch = new BatchLoaderModel();

	public ProcessSupplier() {
		/*  query to use
		select sh.supplier_hcc_id, sh.supplier_name, sh.supplier_npi, te.TAX_ID,sh.supplier_status, pt.PROVIDER_TAXONOMY_NAME,sh.FAX_NUMBER, sh.TELEPHONE_NUMBER, sh.TELEPHONE_EXTENSION, 
corr.address_line, corr.address_line_2, corr.address_line_3, corr.city_name, ccode.COUNTY_NAME,
corr.country_code, corr.state_code, corr.zip_code, corr.zip_4_code, tax.ADDRESS_LINE, tax.ADDRESS_LINE_2, tax.address_line_3, tax.city_name, tcode.COUNTY_NAME,tax.country_code, tax.state_code, tax.zip_code, tax.zip_4_code
from HR_DWH.SUPPLIER_HISTORY_FACT sh
left outer join HR_DWH.SPPLR_HSTRY_TO_PRVDR_TXNMY shpt
on sh.SUPPLIER_HISTORY_FACT_KEY = shpt.SUPPLIER_HISTORY_FACT_KEY
left outer join hr_dwh.provider_taxonomy pt
on shpt.PROVIDER_TAXONOMY_KEY = pt.PROVIDER_TAXONOMY_KEY
left outer join hr_dwh.tax_entity_history_fact te
on sh.TAX_ENTITY_KEY = te.TAX_ENTITY_KEY
left outer join hr_dwh.postal_address corr
on sh.supplier_corr_address_key = corr.postal_address_key
left outer join hr_dwh.postal_address tax
on te.TAX_ADDRESS_KEY = tax.POSTAL_ADDRESS_KEY
left outer join hr_dwh.county_code ccode
on corr.COUNTY_CODE = ccode.COUNTY_CODE
left outer join hr_dwh.county_code tcode
on tax.county_code = tcode.COUNTY_CODE
where rownum < 100
order by sh.supplier_history_fact_key, shpt.SORT_ORDER asc
		*/

	}

	public int LoadSupplier(String file) throws IOException, JAXBException, InterruptedException {
		Date start = new Date();
		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		JAXBElement<ProviderType> umet = null;
		JAXBElement<DropDownListItemProviderSpecialtiesType> special = null;
		

		BufferedReader treader = new BufferedReader(new FileReader(file));
		lines = 0;

		while (treader.readLine() != null)
			lines++;
		treader.close();
		SupplierModel[] supmodel = new SupplierModel[lines];
		CSVReader reader = null;
		try {
			int i = 0;
			reader = new CSVReader(new FileReader(file));
			String[] line;
			reader.readNext();
			while ((line = reader.readNext()) != null) {

				supmodel[i] = new SupplierModel(line);
				
				supMap.put(supmodel[i].getSupplierHccId(), supmodel[i]);
				specialtyMap.put(supmodel[i].getSupplierHccId() + "-" + supmodel[i].getSpecialty(), supmodel[i]);
				
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<ProviderType> supplier = ProcessSup();
		List<DropDownListItemProviderSpecialtiesType> specialties = ProcessSpecialties();
		
		
		

		for (ProviderType ip : supplier) {
			umet = of.createProvider(ip);
			
			ai.getAny().add(umet);
			InitIS.port.addOrUpdate(ai);
			Thread.sleep(5000);
		}
		
		ai.getAny().clear();
		
		for (DropDownListItemProviderSpecialtiesType ip : specialties) {
			special = of.createDropDownListItemProviderSpecialties(ip);
			ai.getAny().add(special);
			InitIS.port.addOrUpdate(ai);
		}

		
		//SuccessFail results = new SuccessFail();
		
		try {
			InitIS.port.addOrUpdate(ai);
			//Marshaller m = context.createMarshaller();
			//m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			//m.marshal(ait, System.out);
			//results.setSuccessfulRecords(lines-1);
		
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

	private List<DropDownListItemProviderSpecialtiesType> ProcessSpecialties() {
		java.util.Iterator<Entry<String, SupplierModel>> it = specialtyMap.entrySet().iterator();
		List<DropDownListItemProviderSpecialtiesType> lpct = new ArrayList<DropDownListItemProviderSpecialtiesType>();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
		
		DropDownListItemProviderSpecialtiesType spec = new DropDownListItemProviderSpecialtiesType();
		spec.setDropDownListName("SpecialityDDL");
		spec.setDropDownListItemLabel(specialtyMap.get(pair.getKey()).getSpecialty());
		spec.setProviderUniversalId(specialtyMap.get(pair.getKey()).getSupplierHccId());
		spec.setUniversalId(specialtyMap.get(pair.getKey()).getSupplierHccId() + "_" + specialtyMap.get(pair.getKey()).getSpecialty());
		lpct.add(spec);
		}
		return lpct;
	}

	public List<ProviderType> ProcessSup() {
		java.util.Iterator<Entry<String, SupplierModel>> it = supMap.entrySet().iterator();
		List<ProviderType> lpct = new ArrayList<ProviderType>();
		while (it.hasNext()) {
			ProviderType supp = new ProviderType();
			Map.Entry pair = (Map.Entry) it.next();
			supp.setUniversalId(supMap.get(pair.getKey()).getSupplierHccId());
			supp.setLastName(supMap.get(pair.getKey()).getSupplierName());
			supp.setFederalTaxId(supMap.get(pair.getKey()).getTaxId());
			if(supMap.get(pair.getKey()).getStatusCode().equalsIgnoreCase("a")) {
				supp.setUserState(TypeOfUserState.ACTIVATED);
			}
			else {
				supp.setUserState(TypeOfUserState.DEACTIVATED);
			}
			supp.setUpin(supMap.get(pair.getKey()).getSupplierNPI());
			supp.setPlanId(supMap.get(pair.getKey()).getSupplierHccId());
			supp.setIsPrimaryCareProvider(false);
			supp.setTypeDropDownListItemLabel("Supplier");
			supp.setTypeDropDownListName("ProviderTypeDDL");
			supp.setSupplierTypeDropDownListItemLabel("SupplierTypeSupplier");
			supp.setSupplierTypeDropDownListName("SupplierTypeDDL");
			ContactInformationType cit = new ContactInformationType();
			cit.setUniversalId(supMap.get(pair.getKey()).getSupplierHccId());
			AddressType OtherAdd = processOtherAddress((SupplierModel) pair.getValue());
			AddressType bizAd = processBizAddress((SupplierModel) pair.getValue());
			Addresses a = new Addresses();
			a.getAddress().add(OtherAdd);
			a.getAddress().add(bizAd);
			cit.setAddresses(a);
			supp.setContactInformation(cit);
			
			
			lpct.add(supp);
		}
		return lpct;

	}

	
	private AddressType processOtherAddress(SupplierModel sup) {
		AddressType ad = new AddressType();
		
		ad.setCountry(TypeOfCountry.US);
		ad.setType(TypeOfAddress.OTHER);
		ad.setOtherAddressIndex(new BigInteger("0"));
		ad.setStreet1(sup.getCorrAddressLine());
		ad.setStreet2(sup.getCorrAddressLine2());
		ad.setStreet3(sup.getCorrAddressLine3());
		ad.setDescription("General Correspondence");
		ad.setCity(sup.getCorrCityName());
		ad.setState(sup.getCorrStateCode());
		ad.setCounty(sup.getCorrCountyCode());
		ad.setPostalCode5(sup.getCorrZipCode());
		ad.setPostalCode4(sup.getCorrZip4Code());
		if(sup.getPhoneNumber() != null) {
			com.click4care.thinkhealth._6_5.dto.AddressType.PhoneNumbers pn = new com.click4care.thinkhealth._6_5.dto.AddressType.PhoneNumbers();
			PhoneNumberType pnt = new PhoneNumberType();
			pnt.setNumber(sup.getPhoneNumber());
			pn.getPhoneNumber().add(pnt);
			ad.setPhoneNumbers(pn);
			pnt.setType(TypeOfPhoneNumber.MAIN);
		}
			
		ad.setUniversalId(sup.getSupplierHccId() + "-OTHER-0");
		
		return ad;
	}
	
	private AddressType processBizAddress(SupplierModel sup) {
		AddressType ad = new AddressType();
		
		ad.setCountry(TypeOfCountry.US);
		ad.setType(TypeOfAddress.BUSINESS);
		ad.setStreet1(sup.getTaxAddressLine());
		ad.setStreet2(sup.getTaxAddressLine2());
		ad.setStreet3(sup.getTaxAddressLine3());
		ad.setDescription("Business");
		ad.setCity(sup.getTaxCityName());
		ad.setState(sup.getTaxStateCode());
		ad.setCounty(sup.getTaxCountyCode());
		ad.setPostalCode5(sup.getTaxZipCode());
		ad.setPostalCode4(sup.getTaxZip4Code());
		if(sup.getPhoneNumber() != null) {
			com.click4care.thinkhealth._6_5.dto.AddressType.PhoneNumbers pn = new com.click4care.thinkhealth._6_5.dto.AddressType.PhoneNumbers();
			PhoneNumberType pnt = new PhoneNumberType();
			pnt.setNumber(sup.getPhoneNumber());
			pn.getPhoneNumber().add(pnt);
			ad.setPhoneNumbers(pn);
			pnt.setType(TypeOfPhoneNumber.MAIN);
		}
			
		ad.setUniversalId(sup.getSupplierHccId() + "-BUSINESS");
		
		return ad;
	}
	
	
}
