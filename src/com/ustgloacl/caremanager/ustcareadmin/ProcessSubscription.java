package com.ustgloacl.caremanager.ustcareadmin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.click4care.thinkhealth._6_5.dto.AddressType;
import com.click4care.thinkhealth._6_5.dto.AnyItemsType;
import com.click4care.thinkhealth._6_5.dto.ContactInformationType;
import com.click4care.thinkhealth._6_5.dto.DdlItemType;
import com.click4care.thinkhealth._6_5.dto.ContactInformationType.Addresses;
import com.click4care.thinkhealth._6_5.dto.EnrollmentType;
import com.click4care.thinkhealth._6_5.dto.FriendsAndFamilyListType;
import com.click4care.thinkhealth._6_5.dto.FriendsAndFamilyType;
import com.click4care.thinkhealth._6_5.dto.InsurancePurchaserGroupType;
import com.click4care.thinkhealth._6_5.dto.LanguageListType;
import com.click4care.thinkhealth._6_5.dto.MemberType;
import com.click4care.thinkhealth._6_5.dto.ObjectFactory;
import com.click4care.thinkhealth.core.dto.PhoneNumberType;
import com.click4care.thinkhealth.core.dto.TypeOfAddress;
import com.click4care.thinkhealth.core.dto.TypeOfCountry;
import com.click4care.thinkhealth.core.dto.TypeOfEnrollmentState;
import com.click4care.thinkhealth.core.dto.TypeOfGender;
import com.click4care.thinkhealth.core.dto.TypeOfPhoneNumber;
import com.click4care.wsdl._6_5.integrationservices.DdlItemList;
import com.click4care.wsdl._6_5.integrationservices.DdlItemListFilter;
import com.click4care.wsdl._6_5.integrationservices.LanguageListList;
import com.click4care.wsdl._6_5.integrationservices.LanguageListListFilter;
import com.click4care.wsdl._6_5.integrationservices.Version;
import com.opencsv.CSVReader;
import com.ustglobal.caremanager.ustcareadmin.model.SubScriberModel;

public class ProcessSubscription {
	static Map<String,String> languages = new HashMap<String,String>();

	public ProcessSubscription() {

		
		//First create FF record
		//Then The member record itself
	}

	public int LoadSubscription(String file)
			throws IOException, JAXBException, ParseException, DatatypeConfigurationException, InterruptedException {
		
		LoadLanguages();
		Map<String, SubScriberModel> theSubMap = new HashMap<String, SubScriberModel>();
		Map<String, SubScriberModel> theChildSubMap = new HashMap<String, SubScriberModel>();
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		//long start = System.nanoTime();
		BufferedReader treader = new BufferedReader(new FileReader(file));
		int lines = 0;

		while (treader.readLine() != null)
			lines++;
		treader.close();
		//long end = System.nanoTime();
		//long elapsedTime = end - start;
		//double seconds = (double)elapsedTime / 1000000000.0;
		//System.out.println(seconds);
		//Thread.sleep(10000);
		SubScriberModel[] submodel = new SubScriberModel[lines];
		CSVReader reader = null;
		try {
			int i = 0;
			reader = new CSVReader(new FileReader(file));
			String[] line;
			reader.readNext();
			while ((line = reader.readNext()) != null) {

				submodel[i] = new SubScriberModel(line);

				if (submodel[i].getIsSubscriber().equalsIgnoreCase("y")) {
					// process subscriber
					theSubMap.put(submodel[i].getMemberId(), submodel[i]);
					// System.out.println(submodel[i].getFirstName());
				} else {
					theChildSubMap.put(submodel[i].getMemberId(), submodel[i]);
				}

				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// List<String> stringList = Files.readAllLines(filePath, charset);
		int membCount = 0;
		int enrollCount = 0;
		int ffCount = 0;
		int fftCount = 0;
		
		List<FriendsAndFamilyType> psff = ProcessSubFF(theSubMap);
		List<FriendsAndFamilyListType> pffl = ProcessFFList(theChildSubMap);
		List<MemberType> pts = ProcessTopSub(theSubMap);
		List<MemberType> pns = ProcessNONSub(theChildSubMap);
		List<EnrollmentType> pesub = ProcessEnrollment(theSubMap);
		List<EnrollmentType> pechild = ProcessEnrollment(theChildSubMap);
		
		
		for(FriendsAndFamilyType fft : psff) {
			JAXBElement<FriendsAndFamilyType> jaxbpayer = of.createFriendsAndFamily(fft);
			ai.getAny().add(jaxbpayer);
			ffCount++;
			if(ffCount >= 100) {
				InitIS.port.addOrUpdate(ai);
				ai.getAny().clear();
				ffCount = 0;
			}
			}
		InitIS.port.addOrUpdate(ai);
		ai.getAny().clear();
		
		for (MemberType pt : pts) {
			JAXBElement<MemberType> jaxbpayer = of.createMember(pt);
			ai.getAny().add(jaxbpayer);
			membCount++;
			if(membCount >= 100) {
				InitIS.port.addOrUpdate(ai);
				ai.getAny().clear();
				membCount = 0;
			}
			}
		//Thread.sleep(5000);
		InitIS.port.addOrUpdate(ai);
		ai.getAny().clear();
		
		for(MemberType npt : pns) {
			JAXBElement<MemberType> jaxbpayer = of.createMember(npt);
			ai.getAny().add(jaxbpayer);
			membCount++;
			if(membCount >= 100) {
				InitIS.port.addOrUpdate(ai);
				ai.getAny().clear();
				membCount = 0;
			}
			}
		//Thread.sleep(5000);
		InitIS.port.addOrUpdate(ai);
		ai.getAny().clear();
		
		for(EnrollmentType et : pesub) {
			JAXBElement<EnrollmentType> jaxbpayer = of.createEnrollment(et);
			ai.getAny().add(jaxbpayer);
			enrollCount++;
			if(enrollCount >= 100) {
				InitIS.port.addOrUpdate(ai);
				ai.getAny().clear();
				enrollCount = 0;
			}
		}
		//Thread.sleep(5000);
		InitIS.port.addOrUpdate(ai);
		ai.getAny().clear();
		
		for(EnrollmentType et : pechild) {
			JAXBElement<EnrollmentType> jaxbpayer = of.createEnrollment(et);
			ai.getAny().add(jaxbpayer);
			enrollCount++;
			if(enrollCount >= 100) {
				InitIS.port.addOrUpdate(ai);
				ai.getAny().clear();
				enrollCount = 0;
			}
		}
		//Thread.sleep(5000);
		InitIS.port.addOrUpdate(ai);
		ai.getAny().clear();
		
		for(FriendsAndFamilyListType ffl : pffl) {
			JAXBElement<FriendsAndFamilyListType> jaxbpayer = of.createFriendsAndFamilyList(ffl);
			ai.getAny().add(jaxbpayer);
			fftCount++;
			if(fftCount >= 100) {
				InitIS.port.addOrUpdate(ai);
				ai.getAny().clear();
				fftCount = 0;
			}
		}
		//Thread.sleep(5000);
		InitIS.port.addOrUpdate(ai);
		ai.getAny().clear();
	
		
		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, new File("C:\\users\\u61906\\TESTMEMBENNOUTPUT.out"));
		return lines;

	}
	
	private void LoadLanguages() {
		
		DdlItemListFilter umlf = new DdlItemListFilter();
		umlf.setDropDownListName("LanguageDDL");
		DdlItemList uel = InitIS.port.listDdlItems(umlf);

		List<DdlItemType> umpt = uel.getDdlItem();
		
		for (DdlItemType ut : umpt) {
			languages.put(ut.getLabel(), ut.getUniversalId());
		}

		
		
	}

	private List<FriendsAndFamilyListType> ProcessFFList(Map<String, SubScriberModel> pcmodel) throws ParseException, DatatypeConfigurationException {
			java.util.Iterator<Entry<String, SubScriberModel>> it = pcmodel.entrySet().iterator();
			int z = 0;
			List<FriendsAndFamilyListType> lpct = new ArrayList<FriendsAndFamilyListType>();
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry) it.next();
				// System.out.println(pair.getKey() + " = " + pair.getValue());
				// it.remove(); // avoids a ConcurrentModificationException
				FriendsAndFamilyListType ff = new FriendsAndFamilyListType();
				ff.setFriendAndFamilyUserUniversalId("HOH_" + pcmodel.get(pair.getKey()).getSubscriberhccId().concat("01-").concat(pcmodel.get(pair.getKey()).getHeadOfHouseIndividualKey()));
				ff.setMemberUniversalId(pcmodel.get(pair.getKey()).getMemberId());
				ff.setRelationshipCodeDropDownListName("FfRelationshipToMemberDDL");
				ff.setRelationshipCodeDropDownListItemLabel(pcmodel.get(pair.getKey()).getRelationshipToSubscriber());
				
				ff.setUniversalId("HOH_" + pcmodel.get(pair.getKey()).getSubscriberhccId().concat("01-").concat(pcmodel.get(pair.getKey()).getHeadOfHouseIndividualKey()) + pair.getKey());
				lpct.add(ff);
				
				if (z >= 100) {
					// call add or update
					z = 0;
				}
			}
			// call add or update to finish
			return lpct;

		
	}

	private List<EnrollmentType> ProcessEnrollment(Map<String, SubScriberModel> pcmodel) throws ParseException, DatatypeConfigurationException {
		java.util.Iterator<Entry<String, SubScriberModel>> it = pcmodel.entrySet().iterator();
		int z = 0;
		List<EnrollmentType> lpct = new ArrayList<EnrollmentType>();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			EnrollmentType et = new EnrollmentType();
			String coverageEffective = "";
			String coverageEnd = "";
			et.setBenefitsPackageUniversalId(pcmodel.get(pair.getKey()).getBphccId());
			//et.setContinuouslyEnrolled(true);
			et.setInsurancePurchaserGroupUniversalId(pcmodel.get(pair.getKey()).getAccounthccId());
			if(!(pcmodel.get(pair.getKey()).getEnrollmentEndDate() == null)) {
				et.setDisenrollmentDate(DateToGreg(pcmodel.get(pair.getKey()).getEnrollmentEndDate()));
				et.setTerminationDate(DateToGreg(pcmodel.get(pair.getKey()).getEnrollmentEndDate()));
				coverageEnd = DateToString(pcmodel.get(pair.getKey()).getEnrollmentEndDate());
			}
			if(!(pcmodel.get(pair.getKey()).getEnrollmentStartDate() == null)) {
				et.setEnrollmentDate(DateToGreg(pcmodel.get(pair.getKey()).getEnrollmentStartDate()));
				et.setOriginalEffectiveDate(DateToGreg(pcmodel.get(pair.getKey()).getEnrollmentStartDate()));
				et.setEffectiveDate(DateToGreg(pcmodel.get(pair.getKey()).getEnrollmentStartDate()));
				coverageEffective = DateToString(pcmodel.get(pair.getKey()).getEnrollmentStartDate());
			}
			et.setLegacyMemberEnrollmentId(pcmodel.get(pair.getKey()).getMemberId());
			et.setMemberUniversalId(pcmodel.get(pair.getKey()).getMemberId());
			
			et.setState(TypeOfEnrollmentState.ACTIVE);
			et.setUniversalId(pcmodel.get(pair.getKey()).getBphccId().concat("_").concat(pcmodel.get(pair.getKey())
					.getAccounthccId().concat("_").concat(pcmodel.get(pair.getKey()).getMemberId())
					.concat(coverageEffective).concat("-").concat(coverageEnd)));
			lpct.add(et);
			
		}
		// TODO Auto-generated method stub
		return lpct;
	}

	public List<MemberType> ProcessTopSub(Map<String, SubScriberModel> pcmodel)
			throws ParseException, DatatypeConfigurationException {
		java.util.Iterator<Entry<String, SubScriberModel>> it = pcmodel.entrySet().iterator();
		int z = 0;
		List<MemberType> lpct = new ArrayList<MemberType>();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			// System.out.println(pair.getKey() + " = " + pair.getValue());
			// it.remove(); // avoids a ConcurrentModificationException
			//15 is self relationshiptosubscriber
			
			MemberType pc = new MemberType();
			
			pc.setSubscriberMemberUniversalId(pcmodel.get(pair.getKey()).getMemberId());
			pc.setFirstName(pcmodel.get(pair.getKey()).getFirstName());
			pc.setLastName(pcmodel.get(pair.getKey()).getLastName());
			pc.setSocialSecurityNumber(pcmodel.get(pair.getKey()).getSsn());
			pc.setUniversalId((String) pair.getKey());
			pc.setInsuranceId((String) pair.getKey());
			if(pcmodel.get(pair.getKey()).getLanguageCode().contains("English")){
			pc.setPrimaryLanguageCodeUniversalId("LanguageEnglish");
			}
			else
				pc.setPrimaryLanguageCodeUniversalId(languages.get(pcmodel.get(pair.getKey()).getLanguageCode()));

			
			pc.setEligible(CheckIfEligible(pcmodel.get(pair.getKey()).getEnrollmentStartDate(), pcmodel.get(pair.getKey()).getEnrollmentEndDate()));
			//need to either query db to get the data, load it into a map or something for easy access - should also check if it exists in HRCM and if not add it
			pc.setSubscriberRelationshipCodeDropDownListName("MemberRelationshipToSubscriberDDL");
			pc.setSubscriberRelationshipCodeDropDownListItemLabel("Self");
			if(pcmodel.get(pair.getKey()).getGender().equalsIgnoreCase("m")) {
				pc.setGenderType(TypeOfGender.MALE);
		}
		else
				pc.setGenderType(TypeOfGender.FEMALE);
		
			
			pc.setDateOfBirth(DateToGreg(pcmodel.get(pair.getKey()).getDob()));
			SubScriberModel s = pcmodel.get(pair.getKey());
			ContactInformationType cit = new ContactInformationType();
			cit.setUniversalId((String) pair.getKey());
			AddressType homeAd = processHOMEContactInfo((String) pair.getKey(), s);
			AddressType corAd = processCorrespondenceContactInfo((String) pair.getKey(), s);
			cit.setEmailContactPreferenceDropDownListItemLabel("MemberEmailContactPrefConf"); 
			cit.setEmailContactPreferenceDropDownListName("MemberEmailContactPreferencesDDL");
			cit.setMailContactPreferenceDropDownListItemLabel("MemberMailContactPrefHome");
			cit.setMailContactPreferenceDropDownListName("MemberMailContactPreferencesDDL");
			cit.setPhoneContactPreferenceDropDownListItemLabel("MemberPhoneContactPrefHome");
			cit.setPhoneContactPreferenceDropDownListName("MemberPhoneContactPreferencesDDL");
			cit.setContactMethodDropDownListItemLabel("MemberContactMethodPhone");
			cit.setContactMethodDropDownListName("MemberContactMethodDDL");
			com.click4care.thinkhealth._6_5.dto.ContactInformationType.PhoneNumbers pn = new com.click4care.thinkhealth._6_5.dto.ContactInformationType.PhoneNumbers();
			PhoneNumberType pnt = new PhoneNumberType();
			pnt.setNumber(pcmodel.get(pair.getKey()).getResHomePhoneNumber());
			pn.getPhoneNumber().add(pnt);
			cit.setPhoneNumbers(pn);
			pnt.setType(TypeOfPhoneNumber.MAIN);
			Addresses a = new Addresses();
			a.getAddress().add(homeAd);
			a.getAddress().add(corAd);
			cit.setAddresses(a);
			pc.setContactInformation(cit);
			
			lpct.add(pc);
			
			if (z >= 100) {
				// call add or update
				z = 0;
			}
		}
				
		// call add or update to finish
		
		return lpct;

	}
	
	public List<MemberType> ProcessNONSub(Map<String, SubScriberModel> pcmodel)
			throws ParseException, DatatypeConfigurationException {
		java.util.Iterator<Entry<String, SubScriberModel>> it = pcmodel.entrySet().iterator();
		int z = 0;
		List<MemberType> lpct = new ArrayList<MemberType>();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			// System.out.println(pair.getKey() + " = " + pair.getValue());
			// it.remove(); // avoids a ConcurrentModificationException
			//15 is self relationshiptosubscriber
			MemberType pc = new MemberType();
			
			pc.setSubscriberMemberUniversalId(pcmodel.get(pair.getKey()).getSubscriberhccId().concat("01"));
			pc.setFirstName(pcmodel.get(pair.getKey()).getFirstName());
			pc.setLastName(pcmodel.get(pair.getKey()).getLastName());
			pc.setSocialSecurityNumber(pcmodel.get(pair.getKey()).getSsn());
			pc.setUniversalId((String) pair.getKey());
			pc.setInsuranceId((String) pair.getKey());
			if(pcmodel.get(pair.getKey()).getLanguageCode().contains("English")){
				pc.setPrimaryLanguageCodeUniversalId("LanguageEnglish");
				
				}
				else
					pc.setPrimaryLanguageCodeUniversalId(languages.get(pcmodel.get(pair.getKey()).getLanguageCode()));
			pc.setEligible(CheckIfEligible(pcmodel.get(pair.getKey()).getEnrollmentStartDate(), pcmodel.get(pair.getKey()).getEnrollmentEndDate()));
			//need to either query db to get the data, load it into a map or something for easy access - should also check if it exists in HRCM and if not add it
			pc.setSubscriberRelationshipCodeDropDownListName("MemberRelationshipToSubscriberDDL");
			pc.setSubscriberRelationshipCodeDropDownListItemLabel(pcmodel.get(pair.getKey()).getRelationshipToSubscriber());
			if(pcmodel.get(pair.getKey()).getGender().equalsIgnoreCase("m")) {
				pc.setGenderType(TypeOfGender.MALE);
		}
		else
				pc.setGenderType(TypeOfGender.FEMALE);
		
			if(!(pcmodel.get(pair.getKey()).getDob() == null)) {
			pc.setDateOfBirth(DateToGreg(pcmodel.get(pair.getKey()).getDob()));
			}
			SubScriberModel s = pcmodel.get(pair.getKey());
			ContactInformationType cit = new ContactInformationType();
			
			cit.setUniversalId((String) pair.getKey());
			AddressType homeAd = processHOMEContactInfo((String) pair.getKey(), s);
			AddressType corAd = processCorrespondenceContactInfo((String) pair.getKey(), s);
			cit.setEmailContactPreferenceDropDownListItemLabel("MemberEmailContactPrefConf"); 
			cit.setEmailContactPreferenceDropDownListName("MemberEmailContactPreferencesDDL");
			cit.setMailContactPreferenceDropDownListItemLabel("MemberMailContactPrefHome");
			cit.setMailContactPreferenceDropDownListName("MemberMailContactPreferencesDDL");
			cit.setPhoneContactPreferenceDropDownListItemLabel("MemberPhoneContactPrefHome");
			cit.setPhoneContactPreferenceDropDownListName("MemberPhoneContactPreferencesDDL");
			cit.setContactMethodDropDownListItemLabel("MemberContactMethodPhone");
			cit.setContactMethodDropDownListName("MemberContactMethodDDL");
			com.click4care.thinkhealth._6_5.dto.ContactInformationType.PhoneNumbers pn = new com.click4care.thinkhealth._6_5.dto.ContactInformationType.PhoneNumbers();
			PhoneNumberType pnt = new PhoneNumberType();
			pnt.setNumber(pcmodel.get(pair.getKey()).getResHomePhoneNumber());
			pn.getPhoneNumber().add(pnt);
			cit.setPhoneNumbers(pn);
			pnt.setType(TypeOfPhoneNumber.MAIN);
			Addresses a = new Addresses();
			a.getAddress().add(homeAd);
			a.getAddress().add(corAd);
			cit.setAddresses(a);
			pc.setContactInformation(cit);
			
			
			lpct.add(pc);
			
			if (z >= 100) {
				// call add or update
				z = 0;
			}
		}
				
		// call add or update to finish
		
		return lpct;

	}

	public List<MemberType> ProcessTopSubHOH(Map<String, SubScriberModel> pcmodel)
			throws ParseException, DatatypeConfigurationException {
		java.util.Iterator<Entry<String, SubScriberModel>> it = pcmodel.entrySet().iterator();
		int z = 0;
		List<MemberType> lpct = new ArrayList<MemberType>();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			// System.out.println(pair.getKey() + " = " + pair.getValue());
			// it.remove(); // avoids a ConcurrentModificationException
			//15 is self relationshiptosubscriber
			MemberType pc = new MemberType();
			pc.setFirstName(pcmodel.get(pair.getKey()).getFirstName());
			pc.setLastName(pcmodel.get(pair.getKey()).getLastName());
			pc.setSocialSecurityNumber(pcmodel.get(pair.getKey()).getSsn());
			pc.setUniversalId("HOH_" + (String) pair.getKey() + "-" + pcmodel.get(pair.getKey()).getHeadOfHouseIndividualKey());
			pc.setDateOfBirth(DateToGreg(pcmodel.get(pair.getKey()).getDob()));
			SubScriberModel s = pcmodel.get(pair.getKey());
			ContactInformationType cit = new ContactInformationType();
			cit.setUniversalId("HOH_" + (String) pair.getKey() + "-" + pcmodel.get(pair.getKey()).getHeadOfHouseIndividualKey());
			AddressType homeAd = processHOMEContactInfo((String) pair.getKey(), s);
			AddressType bizAd = processCorrespondenceContactInfo((String) pair.getKey(), s);
			Addresses a = new Addresses();
			a.getAddress().add(homeAd);
			a.getAddress().add(bizAd);
			cit.setAddresses(a);
			pc.setContactInformation(cit);
			
			
			lpct.add(pc);
			
			if (z >= 100) {
				// call add or update
				z = 0;
			}
		}
		// call add or update to finish
		return lpct;

	}
	
	public List<FriendsAndFamilyType> ProcessSubFF(Map<String, SubScriberModel> pcmodel)
			throws ParseException, DatatypeConfigurationException {
		java.util.Iterator<Entry<String, SubScriberModel>> it = pcmodel.entrySet().iterator();
		int z = 0;
		List<FriendsAndFamilyType> lpct = new ArrayList<FriendsAndFamilyType>();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			// System.out.println(pair.getKey() + " = " + pair.getValue());
			// it.remove(); // avoids a ConcurrentModificationException
			FriendsAndFamilyType ff = new FriendsAndFamilyType();
			ff.setFirstName(pcmodel.get(pair.getKey()).getFirstName());
			ff.setLastName(pcmodel.get(pair.getKey()).getLastName());
			ff.setUniversalId("HOH_" + (String) pair.getKey().toString().concat("-").concat(pcmodel.get(pair.getKey()).getHeadOfHouseIndividualKey()));
			ff.setDateOfBirth(DateToGreg(pcmodel.get(pair.getKey()).getDob()));
			SubScriberModel s = pcmodel.get(pair.getKey());
			ContactInformationType cit = new ContactInformationType();
			cit.setUniversalId("HOH_" + (String) pair.getKey().toString().concat("-").concat(pcmodel.get(pair.getKey()).getHeadOfHouseIndividualKey()));
			AddressType homeAd = processHOMEContactInfo((String) pair.getKey(), s);
			AddressType corAd = processCorrespondenceContactInfo((String) pair.getKey(), s);
			cit.setEmailContactPreferenceDropDownListItemLabel("MemberEmailContactPrefConf"); 
			cit.setEmailContactPreferenceDropDownListName("MemberEmailContactPreferencesDDL");
			cit.setMailContactPreferenceDropDownListItemLabel("MemberMailContactPrefHome");
			cit.setMailContactPreferenceDropDownListName("MemberMailContactPreferencesDDL");
			cit.setPhoneContactPreferenceDropDownListItemLabel("MemberPhoneContactPrefHome");
			cit.setPhoneContactPreferenceDropDownListName("MemberPhoneContactPreferencesDDL");
			com.click4care.thinkhealth._6_5.dto.ContactInformationType.PhoneNumbers pn = new com.click4care.thinkhealth._6_5.dto.ContactInformationType.PhoneNumbers();
			PhoneNumberType pnt = new PhoneNumberType();
			pnt.setNumber(pcmodel.get(pair.getKey()).getResHomePhoneNumber());
			pn.getPhoneNumber().add(pnt);
			cit.setPhoneNumbers(pn);
			pnt.setType(TypeOfPhoneNumber.MAIN);
			Addresses a = new Addresses();
			a.getAddress().add(homeAd);
			a.getAddress().add(corAd);
			cit.setAddresses(a);
			ff.setContactInformation(cit);
			
			
			
			lpct.add(ff);
			
			if (z >= 100) {
				// call add or update
				z = 0;
			}
		}
		// call add or update to finish
		return lpct;

	}

	private AddressType processHOMEContactInfo(String key, SubScriberModel sub) {
		AddressType ad = new AddressType();
		ad.setStreet1(sub.getResStreetAddress());
		ad.setCountry(TypeOfCountry.US);
		ad.setType(TypeOfAddress.HOME);
		ad.setDescription("Home");
		ad.setCity(sub.getResCity());
		ad.setState(sub.getResState());
		ad.setCounty(sub.getResCounty());
		ad.setPostalCode5(sub.getResZipCode());
		if(sub.getResHomePhoneNumber() != null) {
			com.click4care.thinkhealth._6_5.dto.AddressType.PhoneNumbers pn = new com.click4care.thinkhealth._6_5.dto.AddressType.PhoneNumbers();
			PhoneNumberType pnt = new PhoneNumberType();
			pnt.setNumber(sub.getResHomePhoneNumber());
			pn.getPhoneNumber().add(pnt);
			ad.setPhoneNumbers(pn);
			pnt.setType(TypeOfPhoneNumber.MAIN);
		}
			
		ad.setUniversalId((String) key + "-HOME");
		
		return ad;
	}
	
	private AddressType processCorrespondenceContactInfo(String key, SubScriberModel sub) {
		AddressType ad = new AddressType();
		
		ad.setCountry(TypeOfCountry.US);
		ad.setType(TypeOfAddress.CORRESPONDENCE);
		ad.setStreet1(sub.getMailingAddressStreet1());
		ad.setCity(sub.getMailingCity());
		ad.setState(sub.getMailingState());
		ad.setCounty(sub.getMailingCounty());
		ad.setPostalCode5(sub.getMailingZip());
		if(sub.getResHomePhoneNumber() != null) {
			com.click4care.thinkhealth._6_5.dto.AddressType.PhoneNumbers pn = new com.click4care.thinkhealth._6_5.dto.AddressType.PhoneNumbers();
			PhoneNumberType pnt = new PhoneNumberType();
			pnt.setNumber(sub.getResHomePhoneNumber());
			pn.getPhoneNumber().add(pnt);
			ad.setPhoneNumbers(pn);
			pnt.setType(TypeOfPhoneNumber.MAIN);
		}
			
		ad.setUniversalId((String) key + "-CORRESPONDENCE");
		
		return ad;
	}
	
	

	

	public XMLGregorianCalendar StringToGreg(String date) throws ParseException, DatatypeConfigurationException {
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		Date ndate = format.parse(date);
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(ndate);
		XMLGregorianCalendar xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		return xmlGregCal;

	}
	
	public XMLGregorianCalendar DateToGreg(Date date) throws DatatypeConfigurationException {
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(date);
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		return date2;
		
	}
	
	public String DateToString(Date date) throws DatatypeConfigurationException {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		//to convert Date to String, use format method of SimpleDateFormat class.
		String strDate = dateFormat.format(date);
		return strDate;

		
	}
	
	public boolean CheckIfEligible(Date start, Date end) {
		Date today = new Date();
		if(today.after(start) && today.before(end)) {
			return true;
		}
		else
			return false;
	}
	
	

}
