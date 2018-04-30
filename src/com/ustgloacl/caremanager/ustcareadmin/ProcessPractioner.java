package com.ustgloacl.caremanager.ustcareadmin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.click4care.thinkhealth._6_5.dto.AddressType;
import com.click4care.thinkhealth._6_5.dto.AnyItemsType;
import com.click4care.thinkhealth._6_5.dto.ContactInformationType;
import com.click4care.thinkhealth._6_5.dto.ContactInformationType.Addresses;
import com.click4care.thinkhealth._6_5.dto.DropDownListItemProviderSpecialtiesType;
import com.click4care.thinkhealth._6_5.dto.LanguageListType;
import com.click4care.thinkhealth._6_5.dto.ObjectFactory;
import com.click4care.thinkhealth._6_5.dto.ProviderType;
import com.click4care.thinkhealth.core.dto.PhoneNumberType;
import com.click4care.thinkhealth.core.dto.TypeOfAddress;
import com.click4care.thinkhealth.core.dto.TypeOfCountry;
import com.click4care.thinkhealth.core.dto.TypeOfGender;
import com.click4care.thinkhealth.core.dto.TypeOfPhoneNumber;
import com.click4care.thinkhealth.core.dto.TypeOfUserState;
import com.opencsv.CSVReader;
import com.ustglobal.caremanager.ustcareadmin.model.AccountIPGModel;
import com.ustglobal.caremanager.ustcareadmin.model.PractitionerModel;

public class ProcessPractioner {

	public ProcessPractioner(){
		
	}
	/*
	 * 
	 */



	static Map<String, PractitionerModel> practitionerMap = new HashMap<String, PractitionerModel>();
	static Map<String, PractitionerModel> specialtyMap = new HashMap<String, PractitionerModel>();
	static Map<String, PractitionerModel> secondSpecialtyMap = new HashMap<String, PractitionerModel>();
	static Map<String, PractitionerModel> languageMap = new HashMap<String, PractitionerModel>();

	// DBWorker db = new DBWorker();
	// BatchLoaderModel batch = new BatchLoaderModel();

	public void processPractitioner() {
		// Query
	}

	public int loadPractitioner(String ffile) throws JAXBException, IOException {

		Date start = new Date();
		JAXBContext jaxbContext = JAXBContext.newInstance(AnyItemsType.class);
		AnyItemsType anyItemsType = new AnyItemsType();
		ObjectFactory objectFactory = new ObjectFactory();
		// JAXBElement<AnyItemsType> jaxbAnyItemType =
		// objectFactory.createAnyItems(anyItemsType);
		JAXBElement<ProviderType> umet = null;
		JAXBElement<DropDownListItemProviderSpecialtiesType> jaxbSpecialty = null;
		JAXBElement<DropDownListItemProviderSpecialtiesType> jaxbSubSpecialty = null;
		JAXBElement<LanguageListType> jaxbLanguage = null;

//PCC

		String[] linez = ffile.split(System.getProperty("line.separator"));
		int lines = linez.length;
			
		// String[] linesArray = ffile.split("\r\n|\r|\n");
		
		PractitionerModel[] practitionerModelArray = new PractitionerModel[lines];

		  		
		

		
		
/*		
		
		// Counting no of lines in the file
		int noOfLines = 0;
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		while (br.readLine() != null) {
			noOfLines++;
		}
		br.close();
		System.out.println("no of line : " + noOfLines);

		PractitionerModel[] practitionerModelArray = new PractitionerModel[noOfLines];

		CSVReader csvReader = null;
		try {

			int recordCount = 0;
			String[] splittedLine;
			csvReader = new CSVReader(new FileReader(fileName));
			csvReader.readNext();
			while ((splittedLine = csvReader.readNext()) != null) {
				
				
				
				
*/			
		
		try {
			int recordCount = 0;
			//reader = new CSVReader(new FileReader(file));
			Scanner scanner = new Scanner(ffile);

			//String[] line;
			  String liner = null; //scanner.nextLine();
			  String[] line; // = liner.split(",");


//			while ((line = reader.readNext()) != null) {
			while (scanner.hasNextLine() && recordCount < lines) {
				liner = scanner.nextLine();
				line = liner.split(",", -1);
				practitionerModelArray[recordCount] = new PractitionerModel(line);

				practitionerMap.put(practitionerModelArray[recordCount].getPractitionerId(),
						practitionerModelArray[recordCount]);

				if (!practitionerModelArray[recordCount].getPrimarySpecialty().isEmpty()) {
					specialtyMap.put(
							practitionerModelArray[recordCount].getPractitionerId() + "-"
									+ practitionerModelArray[recordCount].getPrimarySpecialty(),
							practitionerModelArray[recordCount]);
				}
				if (!practitionerModelArray[recordCount].getSecondarySpecialty().isEmpty()) {
					secondSpecialtyMap.put(
							practitionerModelArray[recordCount].getPractitionerId() + "-"
									+ practitionerModelArray[recordCount].getSecondarySpecialty(),
							practitionerModelArray[recordCount]);
				}

				languageMap.put(
						practitionerModelArray[recordCount].getPractitionerId() + "-"
								+ practitionerModelArray[recordCount].getPrimaryLanguage(),
						practitionerModelArray[recordCount]);

				recordCount++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		List<ProviderType> practitionerList = processPractioner();
		List<DropDownListItemProviderSpecialtiesType> specialtyList = processSpecialties(specialtyMap);
		List<DropDownListItemProviderSpecialtiesType> secondSpecialtyList = processSubSpecialties(secondSpecialtyMap);
		List<LanguageListType> languageList = processLanguage(languageMap);

		for (ProviderType ip : practitionerList) {
			umet = objectFactory.createProvider(ip);
			anyItemsType.getAny().add(umet);
		}

		for (DropDownListItemProviderSpecialtiesType ip : specialtyList) {
			jaxbSpecialty = objectFactory.createDropDownListItemProviderSpecialties(ip);
			anyItemsType.getAny().add(jaxbSpecialty);
		}

		for (DropDownListItemProviderSpecialtiesType ip1 : secondSpecialtyList) {
			jaxbSubSpecialty = objectFactory.createDropDownListItemProviderSpecialties(ip1);
			anyItemsType.getAny().add(jaxbSubSpecialty);
		}

		for (LanguageListType lang : languageList) {
			jaxbLanguage = objectFactory.createLanguageList(lang);
			anyItemsType.getAny().add(jaxbLanguage);
		}
		// SuccessFail results = new SuccessFail();

		try {
			InitIS.port.addOrUpdate(anyItemsType);
			//JAXBElement<AnyItemsType> jaxbAnyItemType = objectFactory.createAnyItems(anyItemsType);
			//Marshaller m = jaxbContext.createMarshaller();
			//m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			// m.marshal(jaxbAnyItemType, System.out);
			//m.marshal(jaxbAnyItemType, System.out);
			// results.setSuccessfulRecords(lines-1);

		} catch (Exception e) {
			System.out.println(e);
			// results = db.DeBatchAndProcessSingle(batch, file,ai, results);
		} finally {
			Date end = new Date();
			// db.AddBatchLogging(start, end, file, results.getSuccessfulRecords(),
			// results.getFailedRecords(), (lines-1));
		}
		return lines;

	}

	private static List<LanguageListType> processLanguage(Map<String, PractitionerModel> languageMap) {

		List<LanguageListType> languageList = new ArrayList<LanguageListType>();

		for (String key : languageMap.keySet()) {

			LanguageListType languageListType = new LanguageListType();
			PractitionerModel practitionerModel = languageMap.get(key);

			if(practitionerModel.getPrimaryLanguage().contains("English")){
				languageListType.setLanguageCodeDdlItemLabel("LanguageEnglish");
			}
			else {
			languageListType.setLanguageCodeDdlItemLabel(practitionerModel.getPrimaryLanguage());
			}
			languageListType.setLanguageCodeDdlName("LanguageDDL");
			languageListType.setUserUniversalId(practitionerModel.getPractitionerId());
			languageListType
					.setUniversalId(
							practitionerModel.getPractitionerId() + "-" + practitionerModel.getPrimaryLanguage());
			languageList.add(languageListType);
		}
		return languageList;

	}

	private static List<DropDownListItemProviderSpecialtiesType> processSpecialties(
			Map<String, PractitionerModel> specialtyMaps) {

		List<DropDownListItemProviderSpecialtiesType> practitionerSpecialtyList = new ArrayList<DropDownListItemProviderSpecialtiesType>();

		for (String key : specialtyMaps.keySet()) {

			DropDownListItemProviderSpecialtiesType specialty = new DropDownListItemProviderSpecialtiesType();
			PractitionerModel practitionerModel = specialtyMaps.get(key);

			specialty.setDropDownListName("SpecialityDDL");

			specialty.setDropDownListItemLabel(practitionerModel.getPrimarySpecialty());

			specialty.setProviderUniversalId(practitionerModel.getPractitionerId());
			specialty.setUniversalId(
					practitionerModel.getPractitionerId() + "-" + practitionerModel.getPrimarySpecialty());

			practitionerSpecialtyList.add(specialty);

		}

		return practitionerSpecialtyList;
	}

	private static List<DropDownListItemProviderSpecialtiesType> processSubSpecialties(
			Map<String, PractitionerModel> specialtyMaps) {

		List<DropDownListItemProviderSpecialtiesType> practitionerSpecialtyList = new ArrayList<DropDownListItemProviderSpecialtiesType>();

		for (String key : specialtyMaps.keySet()) {

			DropDownListItemProviderSpecialtiesType specialty = new DropDownListItemProviderSpecialtiesType();
			PractitionerModel practitionerModel = specialtyMaps.get(key);

			specialty.setDropDownListName("SubSpecialityDDL");

			specialty.setDropDownListItemLabel(practitionerModel.getSecondarySpecialty());

			specialty.setProviderUniversalId(practitionerModel.getPractitionerId());
			specialty.setUniversalId(
					practitionerModel.getPractitionerId() + "-" + practitionerModel.getSecondarySpecialty());

			practitionerSpecialtyList.add(specialty);

		}

		return practitionerSpecialtyList;
	}

	private static List<ProviderType> processPractioner() {

		List<ProviderType> practitionerList = new ArrayList<ProviderType>();

		for (String key : practitionerMap.keySet()) {
			ProviderType practitioner = new ProviderType();
			PractitionerModel practitionerModel = practitionerMap.get(key);
			// Mapping
			practitioner.setPlanId(practitionerModel.getPractitionerId());
			practitioner.setFirstName(practitionerModel.getFirstName());
			practitioner.setMiddleName(practitionerModel.getMiddleName());
			practitioner.setLastName(practitionerModel.getLastName());
			practitioner.setTypeDropDownListItemLabel("Practitioner");
			practitioner.setTypeDropDownListName("ProviderTypeDDL");
			practitioner.setSupplierTypeDropDownListItemLabel("SupplierTypePractitioner");
			practitioner.setSupplierTypeDropDownListName("SupplierTypeDDL");

			if (practitionerModel.getPCP().equalsIgnoreCase("Y")) {
				practitioner.setIsPrimaryCareProvider(true);
				practitioner.setPcpCategoryDropDownListName("PcpCategoryDDL");
				practitioner.setPcpCategoryDropDownListItemLabel(practitionerModel.getPractitionerRoleName());
			}

			
			practitioner.setPrimaryLanguage(practitionerModel.getPrimaryLanguage());
			if(!practitionerModel.getNamePrefix().isEmpty()) {
			practitioner.setNamePrefixCodeDropDownListName("PrefixDDL");
			practitioner.setNamePrefixCodeDropDownListItemLabel(practitionerModel.getNamePrefix());
			}
			if(!practitionerModel.getSuffixName().isEmpty()) {
			practitioner.setNameSuffixCodeDropDownListName("SuffixDDL");
			practitioner.setNameSuffixCodeDropDownListItemLabel(practitionerModel.getSuffixName());
			}
			if (practitionerModel.getGender().equalsIgnoreCase("F")) {
				practitioner.setGenderType(TypeOfGender.FEMALE);
			} else if (practitionerModel.getGender().equalsIgnoreCase("M")) {
				practitioner.setGenderType(TypeOfGender.MALE);
			} else {
				System.out.println(practitionerModel.getGender());
				System.err.println("Invalid Gender");
			}

			ContactInformationType contactInformationType = new ContactInformationType();
			contactInformationType.setUniversalId(practitionerModel.getPractitionerId());

			Addresses addresses = new Addresses();
			AddressType otherAddress = processOtherAddress(practitionerModel);
			AddressType bussinessAddress = processBussinessAddress(practitionerModel);

			addresses.getAddress().add(otherAddress);
			addresses.getAddress().add(bussinessAddress);
			contactInformationType.setAddresses(addresses);
			practitioner.setContactInformation(contactInformationType);

			practitioner.setEthnicityCodeDropDownListName("EthnicityDDL");
			practitioner.setEthnicityCodeDropDownListItemLabel(practitionerModel.getEthnicity());

			practitioner.setUniversalId(practitionerModel.getPractitionerId());
			practitioner.setUpin(practitionerModel.getNPI());
			if ((practitionerModel.getPractitionerRoleStatus().equalsIgnoreCase("a") || practitionerModel.getPractitionerRoleStatus().isEmpty())) {
				practitioner.setUserState(TypeOfUserState.ACTIVATED);
			} else {
				practitioner.setUserState(TypeOfUserState.DEACTIVATED);
			}

			practitionerList.add(practitioner);

		}

		return practitionerList;
	}

	private static AddressType processOtherAddress(PractitionerModel practitionerModel) {
		// Mapping other address

		AddressType addresstype = new AddressType();

		addresstype.setStreet1(practitionerModel.getAddress_Line());
		addresstype.setStreet2(practitionerModel.getAddress_Line_2());
		addresstype.setStreet3(practitionerModel.getAddress_Line_3());
		addresstype.setCountry(TypeOfCountry.US);
		addresstype.setCounty(practitionerModel.getCounty());
		addresstype.setState(practitionerModel.getState());
		addresstype.setCity(practitionerModel.getCity());

		addresstype.setPostalCode5(practitionerModel.getZipcode5());
		addresstype.setPostalCode4(practitionerModel.getZipcode4());
		addresstype.setType(TypeOfAddress.OTHER);
		addresstype.setOtherAddressIndex(new BigInteger("0"));
		addresstype.setDescription("General Correspondence");

		if (practitionerModel.getPhone() != null) {
			AddressType.PhoneNumbers phoneNumber = new AddressType.PhoneNumbers();
			PhoneNumberType phoneNumbertype = new PhoneNumberType();
			phoneNumbertype.setNumber(practitionerModel.getPhone());
			phoneNumbertype.setExtension(practitionerModel.getPhoneExtension());
			phoneNumber.getPhoneNumber().add(phoneNumbertype);
			addresstype.setPhoneNumbers(phoneNumber);
			phoneNumbertype.setType(TypeOfPhoneNumber.MAIN);
		}
		addresstype.setUniversalId(practitionerModel.getPractitionerId() + "-OTHER-0");
		return addresstype;
	}

	private static AddressType processBussinessAddress(PractitionerModel practitionerModel) {

		// mapping of business address
		AddressType addresstype = new AddressType();

		addresstype.setStreet1(practitionerModel.getAddress_Line());
		addresstype.setStreet2(practitionerModel.getAddress_Line_2());
		addresstype.setStreet3(practitionerModel.getAddress_Line_3());
		addresstype.setCountry(TypeOfCountry.US);
		addresstype.setCounty(practitionerModel.getCounty());
		addresstype.setState(practitionerModel.getState());
		addresstype.setCity(practitionerModel.getCity());

		addresstype.setPostalCode5(practitionerModel.getZipcode5());
		addresstype.setPostalCode4(practitionerModel.getZipcode4());
		addresstype.setType(TypeOfAddress.BUSINESS);
		addresstype.setDescription("Business");

		if (practitionerModel.getPhone() != null) {
			AddressType.PhoneNumbers phoneNumber = new AddressType.PhoneNumbers();
			PhoneNumberType phoneNumbertype = new PhoneNumberType();
			phoneNumbertype.setNumber(practitionerModel.getPhone());
			phoneNumbertype.setExtension(practitionerModel.getPhoneExtension());
			phoneNumber.getPhoneNumber().add(phoneNumbertype);
			addresstype.setPhoneNumbers(phoneNumber);
			phoneNumbertype.setType(TypeOfPhoneNumber.MAIN);
		}
		addresstype.setUniversalId(practitionerModel.getPractitionerId() + "-BUSINESS");
		return addresstype;
	}

}
