package com.ustglobal.base;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.HandlerResolver;

import com.click4care.thinkhealth._6_5.dto.AnyItemsType;
import com.click4care.thinkhealth._6_5.dto.AssessmentQuestionType;
import com.click4care.thinkhealth._6_5.dto.AssessmentType;
import com.click4care.thinkhealth._6_5.dto.BenefitsPackageType;
import com.click4care.thinkhealth._6_5.dto.CareplanOpportunityTemplateType;
import com.click4care.thinkhealth._6_5.dto.ClinicalDataDefinitionType;
import com.click4care.thinkhealth._6_5.dto.ConfiguredLetterType;
import com.click4care.thinkhealth._6_5.dto.ContactDetailsType;
import com.click4care.thinkhealth._6_5.dto.CustomFieldsMetadataType;
import com.click4care.thinkhealth._6_5.dto.DdlItemType;
import com.click4care.thinkhealth._6_5.dto.DropDownListType;
import com.click4care.thinkhealth._6_5.dto.EnrollmentType;
import com.click4care.thinkhealth._6_5.dto.FriendsAndFamilyListType;
import com.click4care.thinkhealth._6_5.dto.FriendsAndFamilyType;
import com.click4care.thinkhealth._6_5.dto.FunctionalAccessProfileRightsType;
import com.click4care.thinkhealth._6_5.dto.FunctionalAccessProfileType;
import com.click4care.thinkhealth._6_5.dto.HcpcscptCodeType;
import com.click4care.thinkhealth._6_5.dto.Icd10DiagnosisCodeType;
import com.click4care.thinkhealth._6_5.dto.InsurancePurchaserGroupProductCategoryType;
import com.click4care.thinkhealth._6_5.dto.InsurancePurchaserGroupType;
import com.click4care.thinkhealth._6_5.dto.LanguageListType;
import com.click4care.thinkhealth._6_5.dto.LetterTypesubtype;
import com.click4care.thinkhealth._6_5.dto.MedicalServiceType;
import com.click4care.thinkhealth._6_5.dto.MemberType;
import com.click4care.thinkhealth._6_5.dto.NdcCodeType;
import com.click4care.thinkhealth._6_5.dto.NoticeType;
import com.click4care.thinkhealth._6_5.dto.ObjectFactory;
import com.click4care.thinkhealth._6_5.dto.PayerRolesType;
import com.click4care.thinkhealth._6_5.dto.PayerType;
import com.click4care.thinkhealth._6_5.dto.ProblemFormulaType;
import com.click4care.thinkhealth._6_5.dto.ProductCategoryMetadataType;
import com.click4care.thinkhealth._6_5.dto.ProductCategoryType;
import com.click4care.thinkhealth._6_5.dto.ProviderLocationXrefType;
import com.click4care.thinkhealth._6_5.dto.ProviderType;
import com.click4care.thinkhealth._6_5.dto.RevenueCodeType;
import com.click4care.thinkhealth._6_5.dto.SentLetterType;
import com.click4care.thinkhealth._6_5.dto.SentTaskType;
import com.click4care.thinkhealth._6_5.dto.TaskTemplateType;
import com.click4care.thinkhealth._6_5.dto.UmDiagnosisType;
import com.click4care.thinkhealth._6_5.dto.UmDiagnosisType.MedicalServices;
import com.click4care.thinkhealth._6_5.dto.UmEventType;
import com.click4care.thinkhealth._6_5.dto.UmEventType.UmDiagnoses;
import com.click4care.thinkhealth._6_5.dto.UmEventType.UmProviderAssociations;
import com.click4care.thinkhealth._6_5.dto.UmProviderAssociationType;
import com.click4care.thinkhealth._6_5.dto.UserLoginType;
import com.click4care.thinkhealth._6_5.dto.UserRolesFunctionalAccessProfilesType;
import com.click4care.thinkhealth.core.dto.TypeOfAssessmentState;
import com.click4care.thinkhealth.core.dto.TypeOfDdlItemState;
import com.click4care.thinkhealth.core.dto.TypeOfSimpleObjectState;
import com.click4care.wsdl._6_5.integrationservices.AssessmentList;
import com.click4care.wsdl._6_5.integrationservices.AssessmentListFilter;
import com.click4care.wsdl._6_5.integrationservices.AssessmentQuestionList;
import com.click4care.wsdl._6_5.integrationservices.AssessmentQuestionListFilter;
import com.click4care.wsdl._6_5.integrationservices.BenefitsPackageList;
import com.click4care.wsdl._6_5.integrationservices.BenefitsPackageListFilter;
import com.click4care.wsdl._6_5.integrationservices.CareplanOpportunityTemplateList;
import com.click4care.wsdl._6_5.integrationservices.CareplanOpportunityTemplateListFilter;
import com.click4care.wsdl._6_5.integrationservices.ClinicalDataDefinitionList;
import com.click4care.wsdl._6_5.integrationservices.ClinicalDataDefinitionListFilter;
import com.click4care.wsdl._6_5.integrationservices.ConfiguredLetterList;
import com.click4care.wsdl._6_5.integrationservices.ConfiguredLetterListFilter;
import com.click4care.wsdl._6_5.integrationservices.ContactDetailsList;
import com.click4care.wsdl._6_5.integrationservices.ContactDetailsListFilter;
import com.click4care.wsdl._6_5.integrationservices.CustomFieldsMetaDataList;
import com.click4care.wsdl._6_5.integrationservices.CustomFieldsMetaDataListFilter;
import com.click4care.wsdl._6_5.integrationservices.DdlItemList;
import com.click4care.wsdl._6_5.integrationservices.DdlItemListFilter;
import com.click4care.wsdl._6_5.integrationservices.DdlList;
import com.click4care.wsdl._6_5.integrationservices.DdlListFilter;
import com.click4care.wsdl._6_5.integrationservices.EnrollmentList;
import com.click4care.wsdl._6_5.integrationservices.EnrollmentListFilter;
import com.click4care.wsdl._6_5.integrationservices.FriendsAndFamilyList;
import com.click4care.wsdl._6_5.integrationservices.FriendsAndFamilyListFilter;
import com.click4care.wsdl._6_5.integrationservices.FriendsAndFamilyListList;
import com.click4care.wsdl._6_5.integrationservices.FriendsAndFamilyListListFilter;
import com.click4care.wsdl._6_5.integrationservices.FunctionalAccessProfileList;
import com.click4care.wsdl._6_5.integrationservices.FunctionalAccessProfileListFilter;
import com.click4care.wsdl._6_5.integrationservices.FunctionalAccessProfileRightsList;
import com.click4care.wsdl._6_5.integrationservices.FunctionalAccessProfileRightsListFilter;
import com.click4care.wsdl._6_5.integrationservices.HcpcsCptProcedureCodeList;
import com.click4care.wsdl._6_5.integrationservices.HcpcsCptProcedureCodeListFilter;
import com.click4care.wsdl._6_5.integrationservices.Icd10DiagnosisCodeList;
import com.click4care.wsdl._6_5.integrationservices.Icd10DiagnosisCodeListFilter;
import com.click4care.wsdl._6_5.integrationservices.InsurancePurchaserGroupProductCategoryList;
import com.click4care.wsdl._6_5.integrationservices.InsurancePurchaserGroupProductCategoryListFilter;
import com.click4care.wsdl._6_5.integrationservices.IntegrationServicesPortType;
import com.click4care.wsdl._6_5.integrationservices.IntegrationServicesService;
import com.click4care.wsdl._6_5.integrationservices.IpgList;
import com.click4care.wsdl._6_5.integrationservices.IpgListFilter;
import com.click4care.wsdl._6_5.integrationservices.LanguageListList;
import com.click4care.wsdl._6_5.integrationservices.LanguageListListFilter;
import com.click4care.wsdl._6_5.integrationservices.MedicalServiceList;
import com.click4care.wsdl._6_5.integrationservices.MedicalServiceListFilter;
import com.click4care.wsdl._6_5.integrationservices.MemberList;
import com.click4care.wsdl._6_5.integrationservices.MemberListFilter;
import com.click4care.wsdl._6_5.integrationservices.NdcCodeList;
import com.click4care.wsdl._6_5.integrationservices.NdcCodeListFilter;
import com.click4care.wsdl._6_5.integrationservices.NoticeList;
import com.click4care.wsdl._6_5.integrationservices.NoticeListFilter;
import com.click4care.wsdl._6_5.integrationservices.PayerList;
import com.click4care.wsdl._6_5.integrationservices.PayerListFilter;
import com.click4care.wsdl._6_5.integrationservices.PayerRolesList;
import com.click4care.wsdl._6_5.integrationservices.PayerRolesListFilter;
import com.click4care.wsdl._6_5.integrationservices.ProblemFormulaList;
import com.click4care.wsdl._6_5.integrationservices.ProblemFormulaListFilter;
import com.click4care.wsdl._6_5.integrationservices.ProductCategoryList;
import com.click4care.wsdl._6_5.integrationservices.ProductCategoryListFilter;
import com.click4care.wsdl._6_5.integrationservices.ProviderList;
import com.click4care.wsdl._6_5.integrationservices.ProviderListFilter;
import com.click4care.wsdl._6_5.integrationservices.ProviderLocationXrefList;
import com.click4care.wsdl._6_5.integrationservices.ProviderLocationXrefListFilter;
import com.click4care.wsdl._6_5.integrationservices.RevenueCodeList;
import com.click4care.wsdl._6_5.integrationservices.RevenueCodeListFilter;
import com.click4care.wsdl._6_5.integrationservices.SentLetterList;
import com.click4care.wsdl._6_5.integrationservices.SentLetterListFilter;
import com.click4care.wsdl._6_5.integrationservices.SentTaskList;
import com.click4care.wsdl._6_5.integrationservices.SentTaskListFilter;
import com.click4care.wsdl._6_5.integrationservices.Subtypes;
import com.click4care.wsdl._6_5.integrationservices.TaskManagementServicesPortType;
import com.click4care.wsdl._6_5.integrationservices.TaskTemplateList;
import com.click4care.wsdl._6_5.integrationservices.TaskTemplateListFilter;
import com.click4care.wsdl._6_5.integrationservices.TypesList;
import com.click4care.wsdl._6_5.integrationservices.TypesListFilter;
import com.click4care.wsdl._6_5.integrationservices.UmEventList;
import com.click4care.wsdl._6_5.integrationservices.UmEventListFilter;
import com.click4care.wsdl._6_5.integrationservices.UserLoginList;
import com.click4care.wsdl._6_5.integrationservices.UserLoginListFilter;
import com.click4care.wsdl._6_5.integrationservices.UserRolesFunctionalAccessProfilesList;
import com.click4care.wsdl._6_5.integrationservices.UserRolesFunctionalAccessProfilesListFilter;
import com.click4care.wsdl._6_5.integrationservices.Version;
import com.opencsv.CSVReader;

public class TESTING {

	protected static TaskManagementServicesPortType taskPort = null;
	public static IntegrationServicesPortType port = null;
	protected static HandlerResolver handler = null;
	protected static HashMap<String, String> fixThese;
	protected static List<String> fixMe;

	static {
		Environment e = new Environment();
		IntegrationServicesService service = null;
		Authenticator.setDefault(new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(Environment.getCmusr(), Environment.getCmpwd().toCharArray());
			}
		});
		try {
			service = new IntegrationServicesService(new URL(Environment.getIsurl()),
					new QName(Environment.getQname1(), Environment.getQname2()));
		} catch (MalformedURLException ex) {
			Logger.getLogger(TESTING.class.getName()).log(Level.SEVERE, null, ex);
		}
		handler = service.getHandlerResolver();
		port = service.getIntegrationServicesPort();

		((BindingProvider) port).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, Environment.getCmusr());
		((BindingProvider) port).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, Environment.getCmpwd());

		// Wait up to 5 minutes (300,000 ms) for a response
		// TODO: Determine if these timeout settings help
		((BindingProvider) port).getRequestContext().put("com.sun.xml.ws.connect.timeout", 5 * 60 * 1000);
		((BindingProvider) port).getRequestContext().put("com.sun.xml.internal.ws.connect.timeout", 5 * 60 * 1000);

		((BindingProvider) port).getRequestContext().put("com.sun.xml.ws.request.timeout", 5 * 60 * 1000);
		((BindingProvider) port).getRequestContext().put("com.sun.xml.internal.ws.request.timeout", 5 * 60 * 1000);

		System.setProperty("sun.net.client.defaultReadTimeout", String.valueOf(5 * 60 * 1000));
		System.setProperty("sun.net.client.defaultConnectTimeout", String.valueOf(5 * 60 * 1000));

		taskPort = service.getTaskManagementServicesPort();
		((BindingProvider) taskPort).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, Environment.getCmusr());
		((BindingProvider) taskPort).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, Environment.getCmpwd());

	}

	public TESTING() {

	}

	public static void main(String[] args)
			throws IOException, JAXBException, DatatypeConfigurationException, ParseException, InterruptedException {
		// TODO Auto-generated method stub
		TESTING t = new TESTING();
		// t.NewTest();

		t.GetUmEvent();
		
		// t.GetMemberInfo();
		/*
		 * Icd10ProcedureCodeType ipc = new Icd10ProcedureCodeType();
		 * Icd10DiagnosisCodeType idc = new Icd10DiagnosisCodeType();
		 * Icd10ProcedureCodeListFilter pfilter = new Icd10ProcedureCodeListFilter();
		 * Icd10DiagnosisCodeListFilter dfilter = new Icd10DiagnosisCodeListFilter();
		 * dfilter.setCode("A00"); pfilter.setCode("001"); Icd10ProcedureCodeList plist
		 * = port.listIcd10ProcedureCode(pfilter); Icd10DiagnosisCodeList dlist =
		 * port.listIcd10DiagnosisCode(dfilter);
		 * 
		 * ipc = plist.getIcd10ProcedureCode().get(0); idc =
		 * dlist.getIcd10DiagnosisCode().get(0);
		 * System.out.println(ipc.getUniversalId());
		 * System.out.println(idc.getUniversalId());
		 */

		/*
		 * System.out.println("Hello world"); UmEventType um = new UmEventType();
		 * AssessmentType at = new AssessmentType(); at.setUniversalId("ASS TEST");
		 * at.setName("Blah Ass"); um.setAcuity(new BigInteger("123"));
		 * um.setUniversalId("MPENNA"); DateFormat format = new
		 * SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); Date date =
		 * format.parse("2014-04-24 11:15:00");
		 * 
		 * GregorianCalendar cal = new GregorianCalendar(); cal.setTime(date);
		 * 
		 * XMLGregorianCalendar xmlGregCal =
		 * DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		 * 
		 * System.out.println(xmlGregCal); um.setDeletedDate(xmlGregCal); AnyItemsType
		 * ai = new AnyItemsType(); //ai.getAny().add(um); //ai.getAny().add(at);
		 * System.out.println(ai); //port.addOrUpdate(ai); ObjectFactory of = new
		 * ObjectFactory();
		 * 
		 * JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		 * JAXBElement<UmEventType> umet = of.createUmEvent(um);
		 * JAXBElement<AssessmentType> att = of.createAssessment(at); JAXBContext
		 * context = JAXBContext.newInstance(AnyItemsType.class); ai.getAny().add(umet);
		 * ai.getAny().add(att); Marshaller m = context.createMarshaller();
		 * 
		 * //m.marshal(umet, System.out); m.marshal(ait, System.out);
		 * 
		 * StringWriter sw = new StringWriter();
		 * 
		 * String xmlString = m.toString(); //System.out.println(xmlString);
		 */

	}

	public void NewTest() throws IOException, InterruptedException {
		// docType = LetterBody
		int i = 0;
		ConfiguredLetterListFilter sllf = new ConfiguredLetterListFilter();
		// sllf.getStatus(TypeOfLetterStatus.
		// sllf.setStatus(TypeOfLetterStatus.SENDING_STARTED);
		ConfiguredLetterList sll = port.listConfiguredLetters(sllf);
		List<ConfiguredLetterType> sllt = sll.getConfiguredLetter();
		for (ConfiguredLetterType slt : sllt) {
			// WpContentType wp = slt.getContent();
			// OutputStream out = new FileOutputStream("c:\\Users\\u61906\\Documents\\out" +
			// i + ".pdf");
			// out.write(wp.getWpcTxTextControlContent());
			// out.close();

			System.out.println(slt.getId());
			// System.out.println("REGULAR CONTENT: " + new String(wp.getWpcContent()));
			// System.out.println("TXTEXT CONTENT: " + new
			// String(wp.getWpcTxTextControlContent()));
			// String(wp.getWpcContent()));

			// Process process = null;
			// process =
			// Runtime.getRuntime().exec("C:\\Users\\u61906\\Downloads\\tx_loaddocs\\ClientApplication\\bin\\Debug\\ClientApplication.exe
			// " +
			// new File("c:\\Users\\u61906\\Documents\\out" + i +
			// ".pdf"));//wp.getWpcTxTextControlContent());
			// process.waitFor();
			// process = Runtime.getRuntime().exec("C:\\Users\\u61906\\Downloads\\txtext.exe
			// " + wp.getWpcTxTextControlContent());
		}

	}

	public void GetPayerInfo() throws JAXBException {

		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		PayerListFilter plf = new PayerListFilter();
		// plf.set("7b558e66-1596-42fb-87a9-52f21aacb62c");
		// plf.setFirstName("config");
		PayerList pl = port.listPayers(plf);
		List<PayerType> lpt = pl.getPayer();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (PayerType pt : lpt) {
			JAXBElement<PayerType> jaxbpayer = of.createPayer(pt);
			ai.getAny().add(jaxbpayer);

		}
		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		Version v = port.showVersion();
		System.out.println(v.getVersion());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public void GetPayerLogin() throws JAXBException {

		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		UserLoginListFilter plf = new UserLoginListFilter();
		// plf.setFirstName("sys");
		UserLoginList pl = port.listUserLogins(plf);
		List<UserLoginType> lpt = pl.getUserLogin();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (UserLoginType pt : lpt) {
			JAXBElement<UserLoginType> jaxbpayer = of.createUserLogin(pt);
			ai.getAny().add(jaxbpayer);
			// System.out.println(pt.getUsername());

		}
		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public void GetAssessment() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		AssessmentListFilter alf = new AssessmentListFilter();
		// alf.setC4CId("016-10000000");
		AssessmentList al = port.listAssessments(alf);
		// AssessmentType at = al.getAssessment().get(0);
		AssessmentQuestionListFilter aqlf = new AssessmentQuestionListFilter();
		// aqlf.setAssessmentUniversalId(at.getUniversalId());
		AssessmentQuestionList aql = port.listQuestions(aqlf);
		List<AssessmentQuestionType> aqt = aql.getQuestions();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		JAXBContext jaxbContext = JAXBContext.newInstance(AssessmentQuestionType.class);
		ai.getAny().add(al);
		for (AssessmentQuestionType a : aql.getQuestions()) {
			System.out.println(a.getAssessmentId());
			// ai.getAny().add(of.createAssessmentQuestion(a));

		}
		// Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		// jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// jaxbMarshaller.marshal(ait, System.out);

	}

	public void GetUmEvent() throws JAXBException {
		/*
		ExternalAuthorizationNumber
		EmployeeId
		TypeOfAuthorization
		ReceivedDate
		DeterminationDate
		ServiceFromDate
		ServiceToDate
		AuthorizationStatus
		PlaceOfService
		Units
		DiagnosisCode1
		ProcedureCode1
		RequestingPhysicianTIN
		RequestingPhysicianNPI
		RequestingPhysicianAddress
		RequestingPhysicianCity
		RequestingPhysicianState
		RequestingPhysicianZip
		RequestedProviderID
		RequestedProviderTIN
		RequestedProviderNPI
		RequestingProviderGroupNPI
		RequestedProviderGroupNPI
		AuthClassCode
		AuthorizationType
		LineNumber
		EVOLENT_PA_FILE_NAME
		FILE_EXTRACT_DATE_TIME
		RECORD_TRANSMITTAL_NUM

		 */
		Map<String, String> payerInfo = GetPayers();
		Map<String, String> memberInfo = LoadMemberInfo();

		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		UmEventListFilter umlf = new UmEventListFilter();
		
		umlf.setC4CId("0010000461"); // 45
		UmEventList uel = port.listUmEvents(umlf);
		List<UmEventType> umpt = uel.getUmEvent();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (UmEventType ut : umpt) {
			System.out.println("ExternalAuthorizationNumber: " + ut.getC4CId());
			// get owner/employee ID
			PayerType pt = GetPayer(ut.getOwner());
			System.out.println("EmployeeId: " + pt.getC4CId());
			if(ut.getDetermination().toString().equalsIgnoreCase("denied")) {
				System.out.println("TYPEOFAUTHORIZATION: " + "N");
			}
			else {
				System.out.println("TYPEOFAUTHORIZATION: " + "C");
			}
			
			System.out.println("RECEIVEDDATE: " + GregToString(ut.getInitialContactDate()));

			UmDiagnoses diags = ut.getUmDiagnoses();
			for(UmDiagnosisType udt : diags.getUmDiagnosis()) {
				MedicalServices ms = udt.getMedicalServices();
				for(MedicalServiceType mst : ms.getMedicalService()) {
					System.out.println("REQUESTEDFROM: " + GregToString(mst.getRequestedDateFrom()));
					System.out.println("REQUESTEDTO: " + GregToString(mst.getRequestedDateTo()));
				}
			}
			System.out.println("DETERMINATIONDATE: " + GregToString(ut.getUmDiagnoses().getUmDiagnosis().get(0)
					.getMedicalServices().getMedicalService().get(0).getManuallyDeterminedDate()));
			
			
			UmProviderAssociations umpl = ut.getUmProviderAssociations();
			for (UmProviderAssociationType umpa : umpl.getUmProviderAssociation()) {
				System.out.println("Provider Univid: " + umpa.getProviderUniversalId());
			}

			 JAXBElement<UmEventType> jaxbpayer = of.createUmEvent(ut);
			 ai.getAny().add(jaxbpayer);
		}

		 JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		 Marshaller m = context.createMarshaller();
		 m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 m.marshal(ait, System.out);
	}

	public void GetProblemFormula() throws JAXBException {
		ProblemFormulaListFilter pflf = new ProblemFormulaListFilter();
		// pflf.set("25434b7a-4078-4c7b-b825-eed8bc06efd5");
		ProblemFormulaList pfl = port.listProblemFormulas(pflf);
		List<ProblemFormulaType> pft = pfl.getProblemFormulas();
		ObjectFactory of = new ObjectFactory();
		for (ProblemFormulaType p : pft) {
			JAXBElement<ProblemFormulaType> ait = of.createProblemFormula(p);
			JAXBContext jaxbContext = JAXBContext.newInstance(ProblemFormulaType.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(ait, System.out);
		}
	}

	public void GetMemberInfo() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		MemberListFilter plf = new MemberListFilter();
		plf.setFirstName("Fred");
		MemberList pl = port.listMembers(plf);
		List<MemberType> lpt = pl.getMember();

		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (MemberType pt : lpt) {

			JAXBElement<MemberType> jaxbpayer = of.createMember(pt);
			// pt.getContactInformation().getAddresses().getAddress().get(0).setCity("Powell");
			// pt.getContactInformation().getAddresses().getAddress().get(0).setCounty("Delaware");
			ai.getAny().add(jaxbpayer);
			// System.out.println(pt.getFirstName() + " " + pt.getLastName());
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);

		m.marshal(ait, System.out);
	}

	public void GetTasks() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		SentTaskListFilter umlf = new SentTaskListFilter();

		SentTaskList uel = port.listSentTasks(umlf);
		List<SentTaskType> umpt = uel.getSentTask();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (SentTaskType ut : umpt) {
			JAXBElement<SentTaskType> jaxbpayer = of.createSentTask(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public void GetCodes() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		Icd10DiagnosisCodeListFilter umlf = new Icd10DiagnosisCodeListFilter();
		umlf.setCode("Z95");
		Icd10DiagnosisCodeList uel = port.listIcd10DiagnosisCode(umlf);
		List<Icd10DiagnosisCodeType> umpt = uel.getIcd10DiagnosisCode();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (Icd10DiagnosisCodeType ut : umpt) {
			JAXBElement<Icd10DiagnosisCodeType> jaxbpayer = of.createIcd10DiagnosisCode(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public void GetFapProfile() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		FunctionalAccessProfileListFilter umlf = new FunctionalAccessProfileListFilter();
		FunctionalAccessProfileList uel = port.listFunctionalAccessProfile(umlf);
		List<FunctionalAccessProfileType> umpt = uel.getFunctionalAccessProfile();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (FunctionalAccessProfileType ut : umpt) {
			JAXBElement<FunctionalAccessProfileType> jaxbpayer = of.createFunctionalAccessProfile(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public void GetFapRights() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		FunctionalAccessProfileRightsListFilter umlf = new FunctionalAccessProfileRightsListFilter();
		FunctionalAccessProfileRightsList uel = port.listFunctionalAccessProfileRights(umlf);
		List<FunctionalAccessProfileRightsType> umpt = uel.getFunctionalAccessProfileRights();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (FunctionalAccessProfileRightsType ut : umpt) {
			JAXBElement<FunctionalAccessProfileRightsType> jaxbpayer = of.createFunctionalAccessProfileRights(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public void GetRoles() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		PayerRolesListFilter umlf = new PayerRolesListFilter();
		PayerRolesList uel = port.listPayerRoles(umlf);
		List<PayerRolesType> umpt = uel.getPayerRoles();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (PayerRolesType ut : umpt) {
			JAXBElement<PayerRolesType> jaxbpayer = of.createPayerRoles(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public void GetFap() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		UserRolesFunctionalAccessProfilesListFilter umlf = new UserRolesFunctionalAccessProfilesListFilter();
		UserRolesFunctionalAccessProfilesList uel = port.listUserRolesFunctionalAccessProfiles(umlf);
		List<UserRolesFunctionalAccessProfilesType> umpt = uel.getUserRolesFunctionalAccessProfiles();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (UserRolesFunctionalAccessProfilesType ut : umpt) {
			JAXBElement<UserRolesFunctionalAccessProfilesType> jaxbpayer = of
					.createUserRolesFunctionalAccessProfiles(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public void GetSentLetters() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		SentLetterListFilter umlf = new SentLetterListFilter();
		SentLetterList uel = port.listSentLetters(umlf);
		List<SentLetterType> umpt = uel.getSentLetter();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (SentLetterType ut : umpt) {
			JAXBElement<SentLetterType> jaxbpayer = of.createSentLetter(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public void GetHCodes() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		HcpcsCptProcedureCodeListFilter umlf = new HcpcsCptProcedureCodeListFilter();
		umlf.setCode("A0021");
		HcpcsCptProcedureCodeList uel = port.listHcpcsCptProcedureCode(umlf);
		List<HcpcscptCodeType> umpt = uel.getHcpcsCptProcedureCode();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (HcpcscptCodeType ut : umpt) {
			JAXBElement<HcpcscptCodeType> jaxbpayer = of.createHcpcsCptCode(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public void GetDDL() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		DdlListFilter umlf = new DdlListFilter();
		umlf.setDropDownListName("UMServicePlaceOfServiceType");

		// umlf.setDropDownListName("SubSpecialityDDL");
		DdlList uel = port.listDdl(umlf);
		System.out.println(uel.getQueryState());
		List<DropDownListType> umpt = uel.getDdl();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		Collections.sort(umpt, new Comparator<Object>() {
			public int compare(Object umpt, Object umpt2) {
				// use instanceof to verify the references are indeed of the type in question
				return ((DropDownListType) umpt).getName().compareTo(((DropDownListType) umpt2).getName());
			}
		});
		for (DropDownListType ut : umpt) {

			System.out.println(ut.getName());
		}
		// if(ut.getName().toLowerCase().contains("Priority")) {
		// JAXBElement<DropDownListType> jaxbpayer = of.createDropDownList(ut);
		// ai.getAny().add(jaxbpayer);
		// }

		// JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		// Marshaller m = context.createMarshaller();
		// m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		// m.marshal(ait, System.out);
	}

	public void GetDDLItems() throws JAXBException, ParseException, DatatypeConfigurationException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		DdlItemListFilter umlf = new DdlItemListFilter();
		//umlf.setDropDownListName("FfRelationshipToMemberDDL");

		// DateRange dr = new DateRange();
		// XMLGregorianCalendar start = StringToGreg("2018-01-09");
		// XMLGregorianCalendar end = StringToGreg("2018-03-15");
		// dr.setStartDate(start);
		// dr.setEndDate(end);

		// umlf.setCreatedDate(dr);
		DdlItemList uel = port.listDdlItems(umlf);
		// System.out.println(uel.getQueryState());
		List<DdlItemType> umpt = uel.getDdlItem();

		BigInteger uelvalue = uel.getQueryState();
		while (uelvalue != null && !uelvalue.equals(BigInteger.ZERO)) {

			umlf.setQueryState(uelvalue);
			DdlItemList uel1 = port.listDdlItems(umlf);
			// System.out.println(uelvalue);

			umpt.addAll(uel1.getDdlItem());
			System.out.println("Size: " + umpt.size());
			uelvalue = uel1.getQueryState();
		}

		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (DdlItemType ut : umpt) {
			JAXBElement<DdlItemType> jaxbpayer = of.createDropDownListItem(ut);
			// System.out.println(ut.getDropDownListName() + " " + ut.getLabel() + " " +
			// ut.getCreatedDate());
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, new File("C:\\Users\\u61906\\ALL_DDLs.xml"));
	}

	public void GetDDLItems2(String filter) throws JAXBException {

		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		DdlItemListFilter umlf = new DdlItemListFilter();
		umlf.setDropDownListName(filter);
		DdlItemList uel = port.listDdlItems(umlf);

		List<DdlItemType> umpt = uel.getDdlItem();

		BigInteger uelvalue = uel.getQueryState();
		while (uelvalue != null && !uelvalue.equals(BigInteger.ZERO)) {

			umlf.setQueryState(uelvalue);
			DdlItemList uel1 = port.listDdlItems(umlf);
			System.out.println(uelvalue);

			umpt.addAll(uel1.getDdlItem());
			System.out.println("Size: " + umpt.size());
			uelvalue = uel1.getQueryState();
		}

		// List<DdlItemType> umpt = uel.getDdlItem();
		System.out.println(umpt.size());
		for (DdlItemType ut : umpt) {
			//ut.setUniversalId(ut.getDropDownListName().concat("_").concat(ut.getLabel()));
			JAXBElement<DdlItemType> jaxbpayer = of.createDropDownListItem(ut);
			ai.getAny().add(jaxbpayer);
		}
		
		 
		 //port.addOrUpdate(ai);
		 //for (DdlItemType ut : umpt) { JAXBElement<DdlItemType> jaxbpayer =
		 //of.createDropDownListItem(ut); ai.getAny().add(jaxbpayer); }
		 JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		 JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		 
		 Marshaller m = context.createMarshaller();
		 m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		// m.marshal(umet, System.out);
		 m.marshal(ait, System.out);

	}

	public void GetTypesSubtypes() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		TypesListFilter umlf = new TypesListFilter();
		umlf.setType(Subtypes.LETTER_TYPE);
		TypesList uel = port.listTypes(umlf);
		List<LetterTypesubtype> umpt = uel.getLetterType();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (LetterTypesubtype ut : umpt) {
			JAXBElement<LetterTypesubtype> jaxbpayer = of.createLetterType(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public void GetLogin() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		UserLoginListFilter umlf = new UserLoginListFilter();
		// umlf.setType(Subtypes.UM_EVENT_NOTE_TYPE);

		UserLoginList uel = port.listUserLogins(umlf);
		List<UserLoginType> umpt = uel.getUserLogin();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (UserLoginType ut : umpt) {
			System.out.println(ut.getUsername());
			// JAXBElement<UserLoginType> jaxbpayer = of.createUserLogin(ut);
			// ai.getAny().add(jaxbpayer);
		}

		/*
		 * JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		 * 
		 * Marshaller m = context.createMarshaller();
		 * m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // m.marshal(umet,
		 * System.out); m.marshal(ait, System.out);
		 */
	}

	public void CreateUmEvent() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		UmEventType um = new UmEventType();

	}

	public void GetCustomFields() throws ParseException, DatatypeConfigurationException {
		// 10000265
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		CustomFieldsMetaDataListFilter umlf = new CustomFieldsMetaDataListFilter();
		// umlf.setType(Subtypes.UM_EVENT_NOTE_TYPE);
		// umlf.setRecordType(TypeOfCustomFieldRecordType.UM_EVENT);
		// 2018-01-30T14:05:36-05:00
		/*
		 * DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); Date date =
		 * format.parse("2018-01-29 00:00:00"); Date edate =
		 * format.parse("2018-01-30 23:59:00"); GregorianCalendar cal = new
		 * GregorianCalendar(); cal.setTime(date); GregorianCalendar ecal = new
		 * GregorianCalendar(); cal.setTime(edate); XMLGregorianCalendar xmlGregCal =
		 * DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		 * XMLGregorianCalendar exmlGregCal =
		 * DatatypeFactory.newInstance().newXMLGregorianCalendar(ecal); DateRange dr =
		 * new DateRange(); dr.setStartDate(xmlGregCal); dr.setEndDate(exmlGregCal);
		 * umlf.setCreatedDate(dr);
		 */
		CustomFieldsMetaDataList uel = port.listCustomFieldsMetaData(umlf);
		List<CustomFieldsMetadataType> umpt = uel.getCustomFieldsMetaData();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (CustomFieldsMetadataType ut : umpt) {
			System.out.println(ut.getName());
			// JAXBElement<UserLoginType> jaxbpayer = of.createUserLogin(ut);
			// ai.getAny().add(jaxbpayer);
		}
	}

	public void GetIcd10Diags() throws JAXBException {

		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		Icd10DiagnosisCodeListFilter umlf = new Icd10DiagnosisCodeListFilter();
		// umlf.setCode("Z95");

		Icd10DiagnosisCodeList uel = port.listIcd10DiagnosisCode(umlf);

		List<Icd10DiagnosisCodeType> umpt = uel.getIcd10DiagnosisCode();
		fixThese = new HashMap<String, String>();

		BigInteger uelvalue = uel.getQueryState();
		if (uelvalue == null) {

			// Icd10DiagnosisCodeList uel1 = port.listIcd10DiagnosisCode(umlf);
			// System.out.println(uelvalue);
			// umpt.addAll(uel.getIcd10DiagnosisCode());
			for (Icd10DiagnosisCodeType ut : umpt) {
				if (!ut.getCode().equalsIgnoreCase(ut.getUniversalId())) {
					fixThese.put(ut.getUniversalId(), ut.getCode());
				}
			}
		}

		while (uelvalue != null && !uelvalue.equals(BigInteger.ZERO)) {

			umlf.setQueryState(uelvalue);
			Icd10DiagnosisCodeList uel1 = port.listIcd10DiagnosisCode(umlf);
			System.out.println(uelvalue);

			umpt.addAll(uel1.getIcd10DiagnosisCode());
			for (Icd10DiagnosisCodeType ut : umpt) {
				if (!ut.getCode().equalsIgnoreCase(ut.getUniversalId())
						&& !ut.getObjectState().equals(TypeOfSimpleObjectState.DELETED)) {
					fixThese.put(ut.getUniversalId(), ut.getCode());
				}

			}
			umpt.clear();
			// System.out.println("Size: " + umpt.size());
			uelvalue = uel1.getQueryState();
		}

		System.out.println(fixThese.size());
		int z = 0;
		for (Map.Entry<String, String> entry : fixThese.entrySet()) {

			z++;
			Icd10DiagnosisCodeType ut = new Icd10DiagnosisCodeType();

			// Entry pair = it.next();

			ut.setCode((String) entry.getValue());
			ut.setUniversalId((String) entry.getKey());
			ut.setObjectState(TypeOfSimpleObjectState.DELETED);
			JAXBElement<Icd10DiagnosisCodeType> jaxbpayer = of.createIcd10DiagnosisCode(ut);
			ai.getAny().add(jaxbpayer);
			// System.out.println(pair.getKey() + " = " + pair.getValue());
			// it.remove(); // avoids a ConcurrentModificationException
			if (z >= 500) {
				System.out.println("processed 500");
				port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();

			} else if (z == fixThese.size()) {
				port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();
			}

		}

		/*
		 * JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		 * 
		 * for (DdlItemType ut : umpt) { JAXBElement<DdlItemType> jaxbpayer =
		 * of.createDropDownListItem(ut); ai.getAny().add(jaxbpayer); }
		 * 
		 * JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		 * 
		 * Marshaller m = context.createMarshaller();
		 * m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 */
		// m.marshal(umet, System.out);
		// m.marshal(ait, System.out);

	}

	public void UpdateNDC() throws JAXBException, ParseException, DatatypeConfigurationException {

		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		NdcCodeListFilter umlf = new NdcCodeListFilter();
		// umlf.setCode("Z95");

		NdcCodeList uel = port.listNdcCode(umlf);

		List<NdcCodeType> umpt = uel.getNdcCode();
		fixMe = new ArrayList<String>();

		BigInteger uelvalue = uel.getQueryState();
		if (uelvalue == null) {

			// Icd10DiagnosisCodeList uel1 = port.listIcd10DiagnosisCode(umlf);
			// System.out.println(uelvalue);
			// umpt.addAll(uel.getIcd10DiagnosisCode());
			for (NdcCodeType ut : umpt) {
				// if(!ut.getCode().equalsIgnoreCase(ut.getUniversalId())){
				fixMe.add(ut.getUniversalId());
				// }
			}
		}

		while (uelvalue != null && !uelvalue.equals(BigInteger.ZERO)) {

			umlf.setQueryState(uelvalue);
			NdcCodeList uel1 = port.listNdcCode(umlf);
			System.out.println(uelvalue);

			umpt.addAll(uel1.getNdcCode());
			for (NdcCodeType ut : umpt) {
				// if(!ut.getCode().equalsIgnoreCase(ut.getUniversalId()) &&
				// !ut.getObjectState().equals(TypeOfSimpleObjectState.DELETED)){
				fixMe.add(ut.getUniversalId());
				// }

			}
			umpt.clear();
			// System.out.println("Size: " + umpt.size());
			uelvalue = uel1.getQueryState();
		}

		System.out.println(fixMe.size());
		int z = 0;
		for (String s : fixMe) {

			z++;
			NdcCodeType ut = new NdcCodeType();

			// Entry pair = it.next();

			ut.setUniversalId(s);
			ut.setObjectState(TypeOfSimpleObjectState.DELETED);
			ut.setDeletedDate(StringToGreg("01/01/2017"));
			JAXBElement<NdcCodeType> jaxbpayer = of.createNdcCode(ut);
			ai.getAny().add(jaxbpayer);
			// System.out.println(pair.getKey() + " = " + pair.getValue());
			// it.remove(); // avoids a ConcurrentModificationException
			if (z >= 500) {
				System.out.println("processed 500");
				port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();

			}

		}
		port.addOrUpdate(ai);
		z = 0;
		ai.getAny().clear();

		/*
		 * JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		 * 
		 * for (DdlItemType ut : umpt) { JAXBElement<DdlItemType> jaxbpayer =
		 * of.createDropDownListItem(ut); ai.getAny().add(jaxbpayer); }
		 * 
		 * JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		 * 
		 * Marshaller m = context.createMarshaller();
		 * m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 */
		// m.marshal(umet, System.out);
		// m.marshal(ait, System.out);

	}

	public void GetLetterTypes() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		ConfiguredLetterListFilter umlf = new ConfiguredLetterListFilter();
		// umlf.setType(Subtypes.LETTER_TYPE);

		ConfiguredLetterList uel = port.listConfiguredLetters(umlf);
		List<ConfiguredLetterType> umpt = uel.getConfiguredLetter();

		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (ConfiguredLetterType ut : umpt) {
			JAXBElement<ConfiguredLetterType> jaxbpayer = of.createConfiguredLetter(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);

	}

	public void GetTaskTemplates() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();

		TaskTemplateListFilter umlf = new TaskTemplateListFilter();
		// umlf.setType(Subtypes.LETTER_TYPE);
		TaskTemplateList uel = port.listTaskTemplates(umlf);
		List<TaskTemplateType> umpt = uel.getTaskTemplate();

		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (TaskTemplateType ut : umpt) {
			JAXBElement<TaskTemplateType> jaxbpayer = of.createTaskTemplate(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);

	}

	public void GetNotices() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		NoticeListFilter umlf = new NoticeListFilter();

		NoticeList uel = port.listNotices(umlf);
		List<NoticeType> umpt = uel.getNotice();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (NoticeType ut : umpt) {
			JAXBElement<NoticeType> jaxbpayer = of.createNotice(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public void GetIPGMeta() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		IpgListFilter umlf = new IpgListFilter();
		IpgList uel = port.listIpg(umlf);
		List<InsurancePurchaserGroupType> umpt = uel.getIpg();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (InsurancePurchaserGroupType ut : umpt) {
			JAXBElement<InsurancePurchaserGroupType> jaxbpayer = of.createInsurancePurchaserGroup(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		Version v = port.showVersion();
		// System.out.println("THE VERSION: " + v.getVersion());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public void GetMS() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		MedicalServiceListFilter umlf = new MedicalServiceListFilter();
		MedicalServiceList uel = port.listMedicalServices(umlf);
		List<MedicalServiceType> umpt = uel.getMedicalService();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (MedicalServiceType ut : umpt) {
			JAXBElement<MedicalServiceType> jaxbpayer = of.createMedicalService(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		Version v = port.showVersion();
		// System.out.println("THE VERSION: " + v.getVersion());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public void GetBP() throws JAXBException, DatatypeConfigurationException, ParseException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		BenefitsPackageListFilter umlf = new BenefitsPackageListFilter();
		BenefitsPackageList uel = port.listBenefitsPackages(umlf);
		List<BenefitsPackageType> umpt = uel.getBenefitsPackage();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (BenefitsPackageType ut : umpt) {
			//if(!ut.getUniversalId().equalsIgnoreCase("companyname")) {
			//ut.setDeletedDate(StringToGreg("2030-01-01"));
			//ut.setObjectState(TypeOfSimpleObjectState.CREATED);
			JAXBElement<BenefitsPackageType> jaxbpayer = of.createBenefitsPackage(ut);
			ai.getAny().add(jaxbpayer);
			//}
			
		}
		//port.addOrUpdate(ai);
		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		//Version v = port.showVersion();
		// System.out.println("THE VERSION: " + v.getVersion());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}
	
	public void GetIPGPC() throws JAXBException, DatatypeConfigurationException, ParseException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		InsurancePurchaserGroupProductCategoryListFilter umlf = new InsurancePurchaserGroupProductCategoryListFilter();
		InsurancePurchaserGroupProductCategoryList uel = port.listInsurancePurchaserGroupProductCategories(umlf);
		List<InsurancePurchaserGroupProductCategoryType> umpt = uel.getInsurancePurchaserGroupProductCategory();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (InsurancePurchaserGroupProductCategoryType ut : umpt) {
			//if(!ut.getUniversalId().equalsIgnoreCase("companyname")) {
			//ut.setDeletedDate(StringToGreg("2017-01-01"));
			//ut.setObjectState(TypeOfSimpleObjectState.DELETED);
			JAXBElement<InsurancePurchaserGroupProductCategoryType> jaxbpayer = of.createInsurancePurchaserGroupProductCategory(ut);
			ai.getAny().add(jaxbpayer);
			//}
			
		}
		//port.addOrUpdate(ai);
		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		Version v = port.showVersion();
		// System.out.println("THE VERSION: " + v.getVersion());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}
	
	

	public void GetPC() throws JAXBException, ParseException, DatatypeConfigurationException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		ProductCategoryListFilter umlf = new ProductCategoryListFilter();
		ProductCategoryList uel = port.listProductCategories(umlf);
		List<ProductCategoryType> umpt = uel.getProductCategory();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (ProductCategoryType ut : umpt) {
			//if(!ut.getUniversalId().equalsIgnoreCase("companyname")) {
			//ut.setObjectState(TypeOfSimpleObjectState.CREATED);
			//ut.setDeletedDate(StringToGreg("2030-01-01"));
			
			JAXBElement<ProductCategoryType> jaxbpayer = of.createProductCategory(ut);
			ai.getAny().add(jaxbpayer);
			//}
		}
		//port.addOrUpdate(ai);
		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(ait, System.out);
	}

	public void GetRev() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		RevenueCodeListFilter umlf = new RevenueCodeListFilter();
		RevenueCodeList uel = port.listRevenueCodes(umlf);
		List<RevenueCodeType> umpt = uel.getRevenueCode();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (RevenueCodeType ut : umpt) {
			JAXBElement<RevenueCodeType> jaxbpayer = of.createRevenueCode(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		Version v = port.showVersion();
		// System.out.println("THE VERSION: " + v.getVersion());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public void GetConfLetters() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		ConfiguredLetterListFilter umlf = new ConfiguredLetterListFilter();
		ConfiguredLetterList uel = port.listConfiguredLetters(umlf);
		List<ConfiguredLetterType> umpt = uel.getConfiguredLetter();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (ConfiguredLetterType ut : umpt) {
			JAXBElement<ConfiguredLetterType> jaxbpayer = of.createConfiguredLetter(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		Version v = port.showVersion();
		// System.out.println("THE VERSION: " + v.getVersion());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public XMLGregorianCalendar StringToGreg(String date) throws ParseException, DatatypeConfigurationException {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date ndate = format.parse(date);
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(ndate);
		XMLGregorianCalendar xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		return xmlGregCal;

	}

	public Map<String, String> GetPayers() throws JAXBException {

		PayerListFilter plf = new PayerListFilter();

		PayerList pl = port.listPayers(plf);
		List<PayerType> lpt = pl.getPayer();
		Map<String, String> payerInfo = new HashMap<String, String>();
		for (PayerType pt : lpt) {
			payerInfo.put(pt.getUniversalId(), pt.getEmployeeId());
		}
		return payerInfo;

	}

	public MemberType GetMember(String c4cId) throws JAXBException {

		MemberListFilter mlf = new MemberListFilter();
		mlf.setFirstName("Fred");
		MemberList ml = port.listMembers(mlf);
		List<MemberType> lmt = ml.getMember();
		for(MemberType m : lmt) {
			//System.out.println(m.getId());
		}
		return lmt.get(0);

	}
	
	public PayerType GetPayer(BigInteger bigInteger) throws JAXBException {

		PayerListFilter mlf = new PayerListFilter();
		
		PayerList ml = port.listPayers(mlf);
		List<PayerType> lmt = ml.getPayer();
		for(PayerType m : lmt) {
			if(m.getId().compareTo(bigInteger) == 0) {
				return m;
			}
			//System.out.println(m.getId());
		}
		return null;
		

	}

	public Map<String, String> LoadMemberInfo() {
		Map<String, String> memberInfo = new HashMap<String, String>();
		MemberListFilter mlf = new MemberListFilter();

		MemberList ml = port.listMembers(mlf);
		List<MemberType> lmt = ml.getMember();
		BigInteger uelvalue = ml.getQueryState();
		if (uelvalue == null) {
			for (MemberType mt : lmt) {
				memberInfo.put(mt.getUniversalId(), mt.getC4CId());
			}
		} else {
			while (uelvalue != null && !uelvalue.equals(BigInteger.ZERO)) {
				mlf.setQueryState(uelvalue);
				MemberList ml1 = port.listMembers(mlf);
				List<MemberType> lmt1 = ml.getMember();
				System.out.println(uelvalue);
				for (MemberType mt : lmt1) {
					memberInfo.put(mt.getUniversalId(), mt.getC4CId());
				}
				uelvalue = ml1.getQueryState();
			}
		}

		return memberInfo;

	}

	public String GregToString(XMLGregorianCalendar cal) {
		Calendar gc = cal.toGregorianCalendar();
		Date date = gc.getTime();
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		String date1 = format.format(date);
		return date1;

	}

	public void ListUMEvents() throws JAXBException {
		ObjectFactory of = new ObjectFactory();
		AnyItemsType ai = new AnyItemsType();
		UmEventListFilter umlf = new UmEventListFilter();
		UmEventList ul = port.listUmEvents(umlf);
		List<UmEventType> uml = ul.getUmEvent();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		for (UmEventType ut : uml) {
			JAXBElement<UmEventType> jaxbpayer = of.createUmEvent(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, new File(
				"C:\\Users\\u61906\\Documents\\HEALTHEDGE_DOCS\\INTEGRATION_SERVICES\\IS_WORKING_EXAMPLES\\ALL_UM_EXPORT.xml"));
	}

	public void LoadDDLs() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		Integer i = 0;
		String f2 = "C:\\Users\\u61906\\Documents\\UST-GLOBAL-PROJECTS\\IUHP\\DDLS_TO_LOAD\\SANDBOX_ETHNICITY.csv";
		CSVReader reader = null;
		try {
			
			reader = new CSVReader(new FileReader(f2));
			String[] line;
			reader.readNext();
			while ((line = reader.readNext()) != null) {
				
				//System.out.println(line[0]);
				DdlItemType ut = new DdlItemType();
				ut.setDropDownListName(line[0]);
				ut.setLabel(line[1]);
				//ut.setComment(line[0]);
				ut.setStatus(TypeOfDdlItemState.ACTIVE);
				BigInteger bi = new BigInteger(String.valueOf(line[2]));
				
				ut.setValue(bi);
				ut.setComment("loaded");
				ut.setUniversalId(ut.getDropDownListName().concat("_").concat(ut.getLabel()));
				JAXBElement<DdlItemType> jaxbpayer = of.createDropDownListItem(ut);
				ai.getAny().add(jaxbpayer);
				i++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		port.addOrUpdate(ai);

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		
		// System.out.println("THE VERSION: " + v.getVersion());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}

	public void UpdateDDLs() {
		DdlItemListFilter ddls = new DdlItemListFilter();
		ddls.setDropDownListName("MemberRelationshipToSubscriberDDL");
		ObjectFactory of = new ObjectFactory();
		AnyItemsType ai = new AnyItemsType();
		DdlItemList ul = port.listDdlItems(ddls);
		List<DdlItemType> uml = ul.getDdlItem();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		
		for (DdlItemType pt : uml) {
			pt.setUniversalId("SUB-" + pt.getLabel());
			JAXBElement<DdlItemType> jaxbpayer = of.createDropDownListItem(pt);
			ai.getAny().add(jaxbpayer);
		}
		
		port.addOrUpdate(ai);
		
	}
	
	public void GetEnns() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		EnrollmentListFilter umlf = new EnrollmentListFilter();
		EnrollmentList uel = port.listEnrollments(umlf);
		List<EnrollmentType> umpt = uel.getEnrollment();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (EnrollmentType ut : umpt) {
			JAXBElement<EnrollmentType> jaxbpayer = of.createEnrollment(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		Version v = port.showVersion();
		// System.out.println("THE VERSION: " + v.getVersion());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}
	
	public void GetFF() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		FriendsAndFamilyListFilter umlf = new FriendsAndFamilyListFilter();
		FriendsAndFamilyList uel = port.listFriendsAndFamily(umlf);
		List<FriendsAndFamilyType> umpt = uel.getFriendsAndFamily();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (FriendsAndFamilyType ut : umpt) {
			JAXBElement<FriendsAndFamilyType> jaxbpayer = of.createFriendsAndFamily(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		
		// System.out.println("THE VERSION: " + v.getVersion());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}
	
	public void GetFFL() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		FriendsAndFamilyListListFilter umlf = new FriendsAndFamilyListListFilter();
		FriendsAndFamilyListList uel = port.listFriendsAndFamilyList(umlf);
		List<FriendsAndFamilyListType> umpt = uel.getFriendsAndFamilyList();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (FriendsAndFamilyListType ut : umpt) {
			JAXBElement<FriendsAndFamilyListType> jaxbpayer = of.createFriendsAndFamilyList(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		
		// System.out.println("THE VERSION: " + v.getVersion());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}
	
	public void GetIPG() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		IpgListFilter umlf = new IpgListFilter();
		IpgList uel = port.listIpg(umlf);
		List<InsurancePurchaserGroupType> umpt = uel.getIpg();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (InsurancePurchaserGroupType ut : umpt) {
			JAXBElement<InsurancePurchaserGroupType> jaxbpayer = of.createInsurancePurchaserGroup(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		Version v = port.showVersion();
		// System.out.println("THE VERSION: " + v.getVersion());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}
	
	public void UpdatePCMeta() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		ProductCategoryMetadataType pcm = new ProductCategoryMetadataType();
		pcm.setUniversalId("PCMetaData");
		pcm.setLevel1Label("Company");
		pcm.setLevel2Label("Sub Company Name");
		pcm.setLevel3Label("Line Of Business");
		pcm.setLevel4Label("Product");
		pcm.setLevel5Label("Benefit Plan");
		pcm.setNumberOfLevels(new BigInteger("5"));
		JAXBElement<ProductCategoryMetadataType> umet = of.createProductCategoryMetadata(pcm);
		//JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		ai.getAny().add(umet);
		port.addOrUpdate(ai);
		// System.out.println("THE VERSION: " + v.getVersion());
		//Marshaller m = context.createMarshaller();
		//m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		//m.marshal(ait, System.out);'IPGMetaData' 
	}
	
	public void SetFFL() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		//FriendsAndFamilyListListFilter umlf = new FriendsAndFamilyListListFilter();
		FriendsAndFamilyListType uel = new FriendsAndFamilyListType();
		uel.setMemberUniversalId("00012312301");
		uel.setFriendAndFamilyUserId(new BigInteger("10000170"));
		uel.setRelationshipCodeDropDownListItemLabel("Father");
		uel.setRelationshipCodeDropDownListName("MemberRelationshipToSubscriberDDL");
		
		
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		
			JAXBElement<FriendsAndFamilyListType> jaxbpayer = of.createFriendsAndFamilyList(uel);
			ai.getAny().add(jaxbpayer);
		

		//JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		port.addOrUpdate(ai);
		// System.out.println("THE VERSION: " + v.getVersion());
		//Marshaller m = context.createMarshaller();
		//m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		//m.marshal(ait, System.out);

}
	
	public void GetContactDetails() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		ContactDetailsListFilter umlf = new ContactDetailsListFilter();
		ContactDetailsList uel = port.listContactDetails(umlf);
		List<ContactDetailsType> umpt = uel.getContactDetails();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (ContactDetailsType ut : umpt) {
			JAXBElement<ContactDetailsType> jaxbpayer = of.createContactDetails(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		Version v = port.showVersion();
		// System.out.println("THE VERSION: " + v.getVersion());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}
	
	public void GetLL() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		LanguageListListFilter umlf = new LanguageListListFilter();
		LanguageListList uel = port.listLanguageLists(umlf);
		List<LanguageListType> umpt = uel.getLanguageListList();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (LanguageListType ut : umpt) {
			JAXBElement<LanguageListType> jaxbpayer = of.createLanguageList(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		Version v = port.showVersion();
		// System.out.println("THE VERSION: " + v.getVersion());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
		
		
	
	}
	
	public void GetProvider() throws JAXBException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		ProviderListFilter umlf = new ProviderListFilter();
		umlf.setLastName("Nourish Wellness Family Medicine");
		ProviderList uel = port.listProviders(umlf);
		List<ProviderType> umpt = uel.getProvider();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (ProviderType ut : umpt) {
			
			JAXBElement<ProviderType> jaxbpayer = of.createProvider(ut);
			ai.getAny().add(jaxbpayer);
		}

		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		Version v = port.showVersion();
		// System.out.println("THE VERSION: " + v.getVersion());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	
	}
	
	//ProviderLocationXrefType
	public void GetXref() throws JAXBException {
		
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		ProviderLocationXrefListFilter umlf = new ProviderLocationXrefListFilter();
		
		ProviderLocationXrefList uel = port.listProviderLocationXrefs(umlf);
		List<ProviderLocationXrefType> umpt = uel.getProviderLocationXref();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

		for (ProviderLocationXrefType ut : umpt) {
			//ut.setUniversalId(ut.getParentUniversalId() + "_" + ut.getChildUniversalId());
			JAXBElement<ProviderLocationXrefType> jaxbpayer = of.createProviderLocationXref(ut);
			ai.getAny().add(jaxbpayer);
			//InitIS.port.addOrUpdate(jaxbpayer);
		}
		
		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		//Version v = port.showVersion();
		// System.out.println("THE VERSION: " + v.getVersion());
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// m.marshal(umet, System.out);
		m.marshal(ait, System.out);
	}
	
	public void DeactiveAssessments() throws JAXBException, ParseException, DatatypeConfigurationException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		AssessmentListFilter alf = new AssessmentListFilter();
		// alf.setC4CId("016-10000000");
		AssessmentList al = port.listAssessments(alf);
		// AssessmentType at = al.getAssessment().get(0);
		
		List<AssessmentType> at = al.getAssessment();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		for (AssessmentType a : at) {
			a.setStatus(TypeOfAssessmentState.DELETED);
			a.setDeactivationDate(StringToGreg("2017-01-01"));
			a.setDeletedDate(StringToGreg("2017-01-01"));
		
			JAXBElement<AssessmentType> jaxbpayer = of.createAssessment(a);
			ai.getAny().add(jaxbpayer);

		}
		//port.addOrUpdate(ai);
		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		 Marshaller jaxbMarshaller = context.createMarshaller();
		 jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 jaxbMarshaller.marshal(ait, System.out);

	}
	
	public void DeactiveDCRs() throws JAXBException, ParseException, DatatypeConfigurationException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		ClinicalDataDefinitionListFilter alf = new ClinicalDataDefinitionListFilter();
		//alf.setCreatorId(new BigInteger("10000002"));
		// alf.setC4CId("016-10000000");
		ClinicalDataDefinitionList al = port.listClinicalDataDefinitions(alf);
		// AssessmentType at = al.getAssessment().get(0);
		
		List<ClinicalDataDefinitionType> at = al.getClinicalDataDefinition();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		for (ClinicalDataDefinitionType a : at) {
			//a.setStatus(TypeOfAssessmentState.DELETED);
			//a.setDeactivationDate(StringToGreg("2017-01-01"));
			//a.setDeletedDate(StringToGreg("2017-01-01"));
		    a.setEnabled(false);
			JAXBElement<ClinicalDataDefinitionType> jaxbpayer = of.createClinicalDataDefinition(a);
			ai.getAny().add(jaxbpayer);

		}
		//port.addOrUpdate(ai);
		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		 Marshaller jaxbMarshaller = context.createMarshaller();
		 jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 jaxbMarshaller.marshal(ait, System.out);

	}
	
	public void DeactiveCP() throws JAXBException, ParseException, DatatypeConfigurationException {
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		CareplanOpportunityTemplateListFilter alf = new CareplanOpportunityTemplateListFilter();
		alf.setName("Activity intolerance related to asthma");
		//alf.setCreatorId(new BigInteger("10000002"));
		// alf.setC4CId("016-10000000");
		CareplanOpportunityTemplateList al = port.listCareplanOpportunityTemplates(alf);
		// AssessmentType at = al.getAssessment().get(0);
		
		List<CareplanOpportunityTemplateType> at = al.getCareplanOpportunityTemplate();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		int i = 0;
		for (CareplanOpportunityTemplateType a : at) {
			//a.setDeletedDate(a.getCreatedDate());
			//a.setStatus(TypeOfAssessmentState.DELETED);
			//a.setDeactivationDate(StringToGreg("2017-01-01"));
			//a.setDeletedDate(StringToGreg("2017-01-01"));
		    
			JAXBElement<CareplanOpportunityTemplateType> jaxbpayer = of.createCareplanOpportunityTemplate(a);
			ai.getAny().add(jaxbpayer);
			i++;
			if(i >= 5) {
				//port.addOrUpdate(ai);
				System.out.println("Processed: " + i);
				ai.getAny().clear();
				i = 0;
			}

		}
		//port.addOrUpdate(ai);
		//System.out.println("Processed: " + i);
		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		 Marshaller jaxbMarshaller = context.createMarshaller();
		 jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 jaxbMarshaller.marshal(ait, System.out);

	}
	
	
}
