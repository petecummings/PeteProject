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
import javax.xml.bind.Marshaller;

import com.click4care.thinkhealth._6_5.dto.AddressType;
import com.click4care.thinkhealth._6_5.dto.AnyItemsType;
import com.click4care.thinkhealth._6_5.dto.ContactInformationType;
import com.click4care.thinkhealth._6_5.dto.ContactInformationType.Addresses;
import com.click4care.thinkhealth._6_5.dto.ObjectFactory;
import com.click4care.thinkhealth._6_5.dto.ProviderLocationXrefType;
import com.click4care.thinkhealth._6_5.dto.ProviderType;
import com.click4care.thinkhealth.core.dto.PhoneNumberType;
import com.click4care.thinkhealth.core.dto.TypeOfAddress;
import com.click4care.thinkhealth.core.dto.TypeOfCountry;
import com.click4care.thinkhealth.core.dto.TypeOfPhoneNumber;
import com.click4care.thinkhealth.core.dto.TypeOfUserState;
import com.opencsv.CSVReader;
import com.ustglobal.caremanager.ustcareadmin.model.SupplierLocationModel;
import com.ustglobal.caremanager.ustcareadmin.model.SupplierModel;

public class ProcessSupplierLocation {
	public int lines;
	static SupplierModel suppliers = null;
	static Map<String, SupplierLocationModel> supMap = new HashMap<String, SupplierLocationModel>();
	static Map<String, SupplierLocationModel> xRefMap = new HashMap<String, SupplierLocationModel>();
//	DBWorker db = new DBWorker();
//	BatchLoaderModel batch = new BatchLoaderModel();

	public ProcessSupplierLocation() {
		/*  query to use
select suploc.SUPPLIER_LOCATION_HCC_ID, suploc.SUPPLIER_LOCATION_NAME, suploc.SUPPLIER_LOCATION_NPI, suploc.FAX_NUMBER, suploc.TELEPHONE_NUMBER, suploc.TELEPHONE_EXTENSION,
corraddr.ADDRESS_LINE, corraddr.ADDRESS_LINE_2, corraddr.ADDRESS_LINE_3, corraddr.CITY_NAME, ccounty.County_name, corraddr.COUNTRY_CODE, corraddr.STATE_CODE, corraddr.ZIP_CODE, corraddr.ZIP_4_CODE,
pracaddr.ADDRESS_LINE, pracaddr.ADDRESS_LINE_2, pracaddr.ADDRESS_LINE_3, pracaddr.CITY_NAME, pcounty.county_name, pracaddr.COUNTRY_CODE, pracaddr.STATE_CODE, pracaddr.ZIP_CODE, pracaddr.ZIP_4_CODE
from hr_dwh.supplier_location suploc
left outer join hr_dwh.postal_address corraddr on suploc.CORRESPONDENCE_ADDRESS_KEY = corraddr.postal_address_key
left outer join hr_dwh.postal_address pracaddr on suploc.PRACTICE_ADDRESS_KEY = pracaddr.postal_address_key
left outer join hr_dwh.county_code ccounty on ccounty.county_code = corraddr.county_code
left outer join hr_dwh.county_code pcounty on pcounty.county_code = corraddr.county_code
order by suploc.supplier_location_name asc

********************BETTER**********************
select  * from HR_DWH.SUPPLIER_LOCATION_HIST_FACT shf
left outer join hr_dwh.supp_loc_hist_to_contact_info slhci on shf.SUPPLIER_LOC_HIST_FACT_KEY = slhci.supplier_loc_hist_fact_key
left outer join hr_dwh.contact_information ci on ci.contact_info_key = slhci.contact_info_key
left outer join hr_dwh.contact_address_information cai on cai.address_info_key = ci.address_info_key
left outer join hr_dwh.contact_postal_address cpa on cpa.postal_address_key = cai.postal_address_key
left outer join hr_dwh.con_addr_inf_to_con_info_phone cphone on cphone.address_info_key = ci.address_info_key
left outer join hr_dwh.contact_telephone_fact ctf on ctf.phone_key = cphone.phone_key
where shf.SUPPLIER_LOCATION_NPI = '1346389764' 
order by shf.supplier_location_hcc_id asc;
*******************WITH COLUMNS******************************
select distinct suploc.SUPPLIER_LOCATION_HCC_ID, suploc.SUPPLIER_LOCATION_NAME, suploc.SUPPLIER_LOCATION_NPI, suploc.supplier_location_status, suploc.FAX_NUMBER, suploc.TELEPHONE_NUMBER, suploc.TELEPHONE_EXTENSION,
cpa.ADDRESS_LINE, cpa.address_line_2, cpa.address_line_3, cpa.CITY_NAME, ccode.County_name, cpa.COUNTRY_CODE, cpa.STATE_CODE, cpa.ZIP_CODE, cpa.ZIP_4_CODE, suploc.IS_PRIMARY_LOCATION, suploc.IS_HOSPITAL,
ctf.phone_country_cd || '-' || ctf.phone_area_cd || '-' || ctf.phone_nbr as mainPhoneNumber
from HR_DWH.SUPPLIER_LOCATION_HIST_FACT suploc
left outer join hr_dwh.supp_loc_hist_to_contact_info slhci on suploc.SUPPLIER_LOC_HIST_FACT_KEY = slhci.supplier_loc_hist_fact_key
left outer join hr_dwh.contact_information ci on ci.contact_info_key = slhci.contact_info_key
left outer join hr_dwh.contact_address_information cai on cai.address_info_key = ci.address_info_key
left outer join hr_dwh.contact_postal_address cpa on cpa.postal_address_key = cai.postal_address_key
left outer join hr_dwh.con_addr_inf_to_con_info_phone cphone on cphone.address_info_key = ci.address_info_key
left outer join hr_dwh.contact_telephone_fact ctf on ctf.phone_key = cphone.phone_key
left outer join HR_DWH.COUNTY_CODE ccode on cpa.county_code = ccode.county_code
where cpa.address_line is not null
order by suploc.supplier_location_hcc_id asc;
		*/

	}

	public int LoadSupplierLocation(String file) throws IOException, JAXBException, InterruptedException {
		Date start = new Date();
		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		JAXBElement<ProviderType> umet = null;
		JAXBElement<ProviderLocationXrefType> ptxref = null;
		

		BufferedReader treader = new BufferedReader(new FileReader(file));
		lines = 0;

		while (treader.readLine() != null)
			lines++;
		treader.close();
		SupplierLocationModel[] supmodel = new SupplierLocationModel[lines];
		CSVReader reader = null;
		try {
			int i = 0;
			reader = new CSVReader(new FileReader(file));
			String[] line;
			reader.readNext();
			while ((line = reader.readNext()) != null) {

				supmodel[i] = new SupplierLocationModel(line);
				
				supMap.put(supmodel[i].getSupplierLocationHccId(), supmodel[i]);
				xRefMap.put(supmodel[i].getSupplierLocationHccId() + "-" + supmodel[i].getSupplierHccId(), supmodel[i]);
				
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<ProviderType> supplierLocation = ProcessSupLoc();
		List<ProviderLocationXrefType> xrefLocation = ProcessXRef();
		
		
		

		//for (ProviderType ip : supplierLocation) {
		//	umet = of.createProvider(ip);
		//	ai.getAny().add(umet);
		//}
		//InitIS.port.addOrUpdate(ai);
		//ai.getAny().clear();
		//Thread.sleep(5000);
		for (ProviderLocationXrefType t : xrefLocation) {
			ptxref = of.createProviderLocationXref(t);
			ai.getAny().add(ptxref);
		}
		InitIS.port.addOrUpdate(ai);
			
		//SuccessFail results = new SuccessFail();
		
		try {
			//InitIS.port.addOrUpdate(ai);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(ait, System.out);
			
		
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

	

	public List<ProviderType> ProcessSupLoc() {
		java.util.Iterator<Entry<String, SupplierLocationModel>> it = supMap.entrySet().iterator();
		List<ProviderType> lpct = new ArrayList<ProviderType>();
		while (it.hasNext()) {
			ProviderType supp = new ProviderType();
			Map.Entry pair = (Map.Entry) it.next();
			supp.setUniversalId("SupplierLocation_" + supMap.get(pair.getKey()).getSupplierLocationHccId());
			supp.setLastName(supMap.get(pair.getKey()).getSupplierLocationName());
			if(supMap.get(pair.getKey()).getStatusCode().equalsIgnoreCase("a")) {
				supp.setUserState(TypeOfUserState.ACTIVATED);
			}
			else {
				supp.setUserState(TypeOfUserState.DEACTIVATED);
			}
			supp.setUpin(supMap.get(pair.getKey()).getSupplierLocationNPI());
			supp.setPlanId(supMap.get(pair.getKey()).getSupplierLocationHccId());
			supp.setIsPrimaryCareProvider(false);
			supp.setTypeDropDownListName("ProviderTypeDDL");
			if(supMap.get(pair.getKey()).getIsHospital().equalsIgnoreCase("N")){
				supp.setTypeDropDownListItemLabel("SupplierLocation");
			}
			else
			{
				supp.setTypeDropDownListItemLabel("Hospital");
			}
			
			
			supp.setSupplierTypeDropDownListItemLabel("SupplierTypeLocation");
			supp.setSupplierTypeDropDownListName("SupplierTypeDDL");
			ContactInformationType cit = new ContactInformationType();
			cit.setUniversalId("SupplierLocation_" + supMap.get(pair.getKey()).getSupplierLocationHccId());
			Addresses a = new Addresses();
			/*if(!supMap.get(pair.getKey()).getAddressLine().isEmpty()){
			AddressType OtherAdd = processOtherAddress((SupplierLocationModel) pair.getValue());
			a.getAddress().add(OtherAdd);
			}*/
			if(!supMap.get(pair.getKey()).getAddressLine().isEmpty()) {
			AddressType bizAd = processBizAddress((SupplierLocationModel) pair.getValue());
			a.getAddress().add(bizAd);
			}
			
			
			
			
			cit.setAddresses(a);
			supp.setContactInformation(cit);
			
			
			lpct.add(supp);
		}
		return lpct;

	}
	
	private List<ProviderLocationXrefType> ProcessXRef(){
		java.util.Iterator<Entry<String, SupplierLocationModel>> it = xRefMap.entrySet().iterator();
		List<ProviderLocationXrefType> lpct = new ArrayList<ProviderLocationXrefType>();
		while (it.hasNext()) {
			ProviderLocationXrefType xref = new ProviderLocationXrefType();
			Map.Entry pair = (Map.Entry) it.next();
			xref.setParentUniversalId(xRefMap.get(pair.getKey()).getSupplierHccId());
			xref.setChildUniversalId("SupplierLocation_".concat(xRefMap.get(pair.getKey()).getSupplierLocationHccId()));
			xref.setUniversalId(xRefMap.get(pair.getKey()).getSupplierHccId().concat("_").concat("SupplierLocation_".concat(xRefMap.get(pair.getKey()).getSupplierLocationHccId())));
			lpct.add(xref);
		}
		return lpct;
	}

	
	private AddressType processOtherAddress(SupplierLocationModel sup) {
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
	
	private AddressType processBizAddress(SupplierLocationModel sup) {
		AddressType ad = new AddressType();
		
		ad.setCountry(TypeOfCountry.US);
		ad.setType(TypeOfAddress.BUSINESS);
		ad.setStreet1(sup.getAddressLine());
		ad.setStreet2(sup.getAddressLine2());
		ad.setStreet3(sup.getAddressLine3());
		ad.setDescription("Business");
		ad.setCity(sup.getCityName());
		ad.setState(sup.getStateCode());
		ad.setCounty(sup.getCountyCode());
		ad.setPostalCode5(sup.getZipCode());
		ad.setPostalCode4(sup.getZip4Code());
		if(sup.getPhoneNumber() != null) {
			com.click4care.thinkhealth._6_5.dto.AddressType.PhoneNumbers pn = new com.click4care.thinkhealth._6_5.dto.AddressType.PhoneNumbers();
			PhoneNumberType pnt = new PhoneNumberType();
			pnt.setNumber(sup.getPhoneNumber());
			pn.getPhoneNumber().add(pnt);
			ad.setPhoneNumbers(pn);
			pnt.setType(TypeOfPhoneNumber.MAIN);
		}
			
		ad.setUniversalId("SupplierLocation_".concat(sup.getSupplierLocationHccId()) + "-BUSINESS");
		
		return ad;
	}
	
	
}
