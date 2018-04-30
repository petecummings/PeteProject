package com.ustglobal.base;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import com.click4care.thinkhealth._6_5.dto.AnyItemsType;
import com.click4care.thinkhealth._6_5.dto.HcpcscptCodeType;
import com.click4care.thinkhealth._6_5.dto.Icd10DiagnosisCodeType;
import com.click4care.thinkhealth._6_5.dto.Icd10ProcedureCodeType;
import com.click4care.thinkhealth._6_5.dto.NdcCodeType;
import com.click4care.thinkhealth._6_5.dto.ObjectFactory;
import com.click4care.thinkhealth.core.dto.TypeOfRxOtc;
import com.click4care.thinkhealth.core.dto.TypeOfSimpleObjectState;
import com.click4care.wsdl._6_5.integrationservices.IntegrationServicesPortType;
import com.click4care.wsdl._6_5.integrationservices.IntegrationServicesService;
import com.click4care.wsdl._6_5.integrationservices.TaskManagementServicesPortType;
import com.ustglobal.caremanager.model.codes.CPTModel;
import com.ustglobal.caremanager.model.codes.HCPCSModel;
import com.ustglobal.caremanager.model.codes.ICD10CMModel;
import com.ustglobal.caremanager.model.codes.ICD10PCSModel;
import com.ustglobal.caremanager.model.codes.NDCPackageModel;
import com.ustglobal.caremanager.model.codes.NDCProductModel;

//BE SURE TO SET XmlRootElement on AnyItemsType UNTIL I CAN FIX THE JAXB Impl

public class ProcessCodes {

	protected static TaskManagementServicesPortType taskPort = null;
	protected static IntegrationServicesPortType port = null;

	static {
		IntegrationServicesService service = null;
		 Authenticator.setDefault (new Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication (Environment.getCmusr(), Environment.getCmpwd().toCharArray());
	            }
	        });
		try {
			service = new IntegrationServicesService(new URL(Environment.getIsurl()),
					new QName(Environment.getQname1(), Environment.getQname2()));
		} catch (MalformedURLException ex) {
			Logger.getLogger(ProcessCodes.class.getName()).log(Level.SEVERE, null, ex);
		}

		port = service.getIntegrationServicesPort();
		((BindingProvider) port).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, Environment.getCmusr());
		((BindingProvider) port).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, Environment.getCmpwd());

		// Wait up to 5 minutes (300,000 ms) for a response
		// TODO: Determine if these timeout settings help
		((BindingProvider) port).getRequestContext().put("com.sun.xml.ws.connect.timeout", (5 * 60) * 1000);
		((BindingProvider) port).getRequestContext().put("com.sun.xml.internal.ws.connect.timeout", (5 * 60) * 1000);

		((BindingProvider) port).getRequestContext().put("com.sun.xml.ws.request.timeout", 5 * 60 * 1000);
		((BindingProvider) port).getRequestContext().put("com.sun.xml.internal.ws.request.timeout", (5 * 60) * 1000);

		System.setProperty("sun.net.client.defaultReadTimeout", String.valueOf((5 * 60) * 1000));
		System.setProperty("sun.net.client.defaultConnectTimeout", String.valueOf((5 * 60) * 1000));

		taskPort = service.getTaskManagementServicesPort();
		((BindingProvider) taskPort).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, Environment.getCmusr());
		((BindingProvider) taskPort).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, Environment.getCmpwd());

	}

	public ProcessCodes() {

	}

	public int processCPT(String file)
			throws FileNotFoundException, IOException, ParseException, DatatypeConfigurationException {
		Path filePath = new File(file).toPath();
		Charset charset = Charset.defaultCharset();
		List<String> stringList = Files.readAllLines(filePath, charset);
		String[] stringArray = stringList.toArray(new String[] {});
		int i;
		int z = 0;
		CPTModel[] cptCodes = new CPTModel[stringArray.length];
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		for (i = 1; i < stringArray.length; i++) {
			z++;
			cptCodes[i] = new CPTModel(stringArray[i]);
			// System.out.println(cptCodes[i].getCode() + " Count: " + i);
			HcpcscptCodeType t = new HcpcscptCodeType();
			t.setCode(cptCodes[i].getCode());
			t.setUniversalId(cptCodes[i].getCode());
			t.setDescription(cptCodes[i].getLongDescription());
			t.setLongDescription(cptCodes[i].getLongDescription());
			t.setShortDescription(cptCodes[i].getFulldescription());
			
			// System.out.println("CODE: " + t.getCode() + " DESCRPTION: " +
			// t.getDescription() + " SHORTDESC:" + t.getShortDescription() + " LONGDESC:" +
			// t.getLongDescription());

			JAXBElement<HcpcscptCodeType> umet = of.createHcpcsCptCode(t);
			 
			ai.getAny().add(umet);
			if(z >= 100) {
				System.out.println(System.lineSeparator() + "Processed " + i + " out of " + stringArray.length);
				 port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();
							
			}
			else if(i == stringArray.length - 1) {
				port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();
			}
		}
		return i;

	}

	public NDCProductModel[] processNDCProduct(String file)
			throws FileNotFoundException, IOException, ParseException, DatatypeConfigurationException {
		Path filePath = new File(file).toPath();
		Charset charset = Charset.defaultCharset();
		List<String> stringList = Files.readAllLines(filePath, charset);
		String[] stringArray = stringList.toArray(new String[] {});
		int i;
		int z = 0;
		NDCProductModel[] ndcProductCodes = new NDCProductModel[stringArray.length];
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		for (i = 1; i < stringArray.length; i++) {
			z++;
			ndcProductCodes[i] = new NDCProductModel(stringArray[i]);
			// System.out.println(cptCodes[i].getCode() + " Count: " + i);
			NdcCodeType t = new NdcCodeType();
			t.setProductCode(ndcProductCodes[i].getProductNDC());
			t.setUniversalId(ndcProductCodes[i].getProductID().concat("-").concat(ndcProductCodes[i].getProductNDC()));
			t.setDosageForm(ndcProductCodes[i].getDosageFormName());
			t.setGenericName(ndcProductCodes[i].getNonProprietaryName());
			t.setLabelCode(ndcProductCodes[i].getLabelerName());
			t.setObjectState(TypeOfSimpleObjectState.CREATED);
			t.setProductCode(ndcProductCodes[i].getProductTypeNameOTC());
			// t.set
			if (ndcProductCodes[i].getProductTypeNameOTC().toLowerCase().contains("otc")) {
				t.setRxOtc(TypeOfRxOtc.O);
			} else {
				t.setRxOtc(TypeOfRxOtc.R);
			}
			
			// System.out.println("CODE: " + t.getProductCode() + " DESCRPTION: " +
			// t.getUniversalId() + " SHORTDESC:" + t.getRxOtc() + " LONGDESC:" +
			// t.getLabelCode());

			JAXBElement<NdcCodeType> umet = of.createNdcCode(t);
			 
			ai.getAny().add(umet);
			if(z >= 100) {
				System.out.println(System.lineSeparator() + "Processed " + i + " out of " + stringArray.length);
				 port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();
							
			}
			else if(i == stringArray.length - 1) {
				port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();
			}
		}
		return ndcProductCodes;

	}

	public NDCPackageModel[] processNDCPackage(String file)
			throws FileNotFoundException, IOException, ParseException, DatatypeConfigurationException {
		Path filePath = new File(file).toPath();
		Charset charset = Charset.defaultCharset();
		List<String> stringList = Files.readAllLines(filePath, charset);
		String[] stringArray = stringList.toArray(new String[] {});
		int i;
		int z = 0;
		NDCPackageModel[] ndcPackageCodes = new NDCPackageModel[stringArray.length];
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		for (i = 1; i < stringArray.length; i++) {
			z++;
			ndcPackageCodes[i] = new NDCPackageModel(stringArray[i]);
			// System.out.println(cptCodes[i].getCode() + " Count: " + i);
			NdcCodeType t = new NdcCodeType();
			t.setProductCode(ndcPackageCodes[i].getProductNDC());
			t.setUniversalId(ndcPackageCodes[i].getProductID().concat("-").concat(ndcPackageCodes[i].getProductNDC()));

			// System.out.println("CODE: " + t.getProductCode() + " DESCRPTION: " +
			// t.getUniversalId() + " SHORTDESC:" + t.getRxOtc() + " LONGDESC:" +
			// t.getLabelCode());

			JAXBElement<NdcCodeType> umet = of.createNdcCode(t);
			 
			ai.getAny().add(umet);
			if(z >= 100) {
				System.out.println(System.lineSeparator() + "Processed " + i + " out of " + stringArray.length);
				 port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();
							
			}
			else if(i == stringArray.length - 1) {
				port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();
			}
		}
		return ndcPackageCodes;

	}

	public int processHCPCS(String file)
			throws FileNotFoundException, IOException, ParseException, DatatypeConfigurationException {
		Path filePath = new File(file).toPath();
		Charset charset = Charset.defaultCharset();
		List<String> stringList = Files.readAllLines(filePath, charset);
		String[] stringArray = stringList.toArray(new String[] {});
		int i;
		HCPCSModel[] hcpcsCodes = new HCPCSModel[stringArray.length];
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		int z = 0;
		for (i = 1; i < stringArray.length; i++) {
			z++;
			hcpcsCodes[i] = new HCPCSModel(stringArray[i]);
			// System.out.println(hcpcsCodes[i].getCode() + " Count: " + i);
			HcpcscptCodeType t = new HcpcscptCodeType();
			t.setCode(hcpcsCodes[i].getCode());
			t.setUniversalId(hcpcsCodes[i].getCode());
			t.setDescription(hcpcsCodes[i].getLongDescription());
			t.setLongDescription(hcpcsCodes[i].getLongDescription());
			t.setShortDescription(hcpcsCodes[i].getFulldescription());
			// System.out.println("CODE: " + t.getCode() + " DESCRPTION: " +
			// t.getDescription() + " SHORTDESC:" + t.getShortDescription() + " LONGDESC:" +
			// t.getLongDescription());
			JAXBElement<HcpcscptCodeType> umet = of.createHcpcsCptCode(t);
			 
			ai.getAny().add(umet);
			if(z >= 100) {
				System.out.println(System.lineSeparator() + "Processed " + i + " out of " + stringArray.length);
				 port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();
							
			}
			else if(i == stringArray.length - 1) {
				port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();
			}
		}
		
		return i;

	}

	public int processICD10CM(String file)
			throws FileNotFoundException, IOException, ParseException, DatatypeConfigurationException {
		Path filePath = new File(file).toPath();
		Charset charset = Charset.defaultCharset();
		List<String> stringList = Files.readAllLines(filePath, charset);
		String[] stringArray = stringList.toArray(new String[] {});
		int i;
		int z = 0;
		ICD10CMModel[] icd10cmCodes = new ICD10CMModel[stringArray.length];
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		for (i = 1; i < stringArray.length; i++) {
			z++;
			icd10cmCodes[i] = new ICD10CMModel(stringArray[i]);
			// System.out.println(hcpcsCodes[i].getCode() + " Count: " + i);

			Icd10DiagnosisCodeType t = new Icd10DiagnosisCodeType();
			t.setCode(icd10cmCodes[i].getCode());
			t.setUniversalId(icd10cmCodes[i].getCode());
			// t.setDescription(icd10cmCodes[i].getFulldescription());
			t.setLongDescription(icd10cmCodes[i].getLongDescription());
			t.setShortDescription(icd10cmCodes[i].getShortDescription());
			t.setSpecific(true);
			// System.out.println("CODE: " + t.getCode() + " SHORTDESC:" +
			// t.getShortDescription() + " LONGDESC:" + t.getLongDescription());
			//port.addOrUpdate(t);
			JAXBElement<Icd10DiagnosisCodeType> umet = of.createIcd10DiagnosisCode(t);
			 
			ai.getAny().add(umet);
			if(z >= 100) {
				System.out.println(System.lineSeparator() + "Processed " + i + " out of " + stringArray.length);
				 port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();
							
			}
			else if(i == stringArray.length - 1) {
				port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();
			}
			
		}
		return i;

	}
	
	public int processICD10CMBulk(String file)
			throws FileNotFoundException, IOException, ParseException, DatatypeConfigurationException, JAXBException {
		Path filePath = new File(file).toPath();
		Charset charset = Charset.defaultCharset();
		List<String> stringList = Files.readAllLines(filePath, charset);
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		//JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		String[] stringArray = stringList.toArray(new String[] {});
		//JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
		int i;
		int z = 0;
		ICD10CMModel[] icd10cmCodes = new ICD10CMModel[stringArray.length];
		for (i = 1; i < stringArray.length; i++) {
			z++;
			icd10cmCodes[i] = new ICD10CMModel(stringArray[i]);
			// System.out.println(hcpcsCodes[i].getCode() + " Count: " + i);

			Icd10DiagnosisCodeType t = new Icd10DiagnosisCodeType();
			t.setCode(icd10cmCodes[i].getCode());
			t.setUniversalId(icd10cmCodes[i].getCode());
			// t.setDescription(icd10cmCodes[i].getFulldescription());
			t.setLongDescription(icd10cmCodes[i].getLongDescription());
			t.setShortDescription(icd10cmCodes[i].getShortDescription());
			t.setSpecific(true);
			// System.out.println("CODE: " + t.getCode() + " SHORTDESC:" +
			// t.getShortDescription() + " LONGDESC:" + t.getLongDescription());
			//port.addOrUpdate(t);
			
			
			
			JAXBElement<Icd10DiagnosisCodeType> umet = of.createIcd10DiagnosisCode(t);
			 
			ai.getAny().add(umet);
			if(z >= 100) {
				System.out.println(System.lineSeparator() + "Processed " + i + " out of " + stringArray.length);
				//System.out.println(ai.toString());
				//port.addOrUpdate(ait);
				// Marshaller m = context.createMarshaller();
				// m.marshal(ai, System.out);
				 port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();
							
			}
			else if(i == stringArray.length - 1) {
				port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();
			}
		}
		return i;

	}

	public int processICD10PCS(String file)
			throws FileNotFoundException, IOException, ParseException, DatatypeConfigurationException {
		Path filePath = new File(file).toPath();
		Charset charset = Charset.defaultCharset();
		List<String> stringList = Files.readAllLines(filePath, charset);
		String[] stringArray = stringList.toArray(new String[] {});
		int i;
		int z = 0;
		ICD10PCSModel[] icd10pcsCodes = new ICD10PCSModel[stringArray.length];
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		for (i = 1; i < stringArray.length; i++) {
			z++;
			icd10pcsCodes[i] = new ICD10PCSModel(stringArray[i]);
			// System.out.println(hcpcsCodes[i].getCode() + " Count: " + i);
			Icd10ProcedureCodeType t = new Icd10ProcedureCodeType();
			t.setCode(icd10pcsCodes[i].getCode());
			t.setUniversalId(icd10pcsCodes[i].getCode());
			
			// t.setDescription(icd10cmCodes[i].getFulldescription());
			t.setLongDescription(icd10pcsCodes[i].getLongDescription());
			t.setShortDescription(icd10pcsCodes[i].getFulldescription());
			// System.out.println("CODE: " + t.getCode() + " SHORTDESC:" +
			// t.getShortDescription() + " LONGDESC:" + t.getLongDescription());
			
			JAXBElement<Icd10ProcedureCodeType> umet = of.createIcd10ProcedureCode(t);
			 
			ai.getAny().add(umet);
			if(z >= 100) {
				System.out.println(System.lineSeparator() + "Processed " + i + " out of " + stringArray.length);
				//System.out.println(ai.toString());
				//port.addOrUpdate(ait);
				// Marshaller m = context.createMarshaller();
				// m.marshal(ai, System.out);
				 port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();
							
			}
			else if(i == stringArray.length - 1) {
				port.addOrUpdate(ai);
				z = 0;
				ai.getAny().clear();
			}
		}
		return i;
	}

	public int combine(NDCPackageModel[] ndcpackage, NDCProductModel[] productmode) {
		ArrayList<String> outputArrayList = new ArrayList();
		int i = 0;
		int loc = 0;
		outerloop: for (NDCProductModel prod : productmode) {
			innerloop: for (NDCPackageModel pack : ndcpackage)
				if (prod.getProductID().toString().equals(pack.getProductID().toString())) {
					System.out.println(pack.getProductID() + " " + pack.getPackageDescription() + " "
							+ prod.getNonProprietaryName() + " " + pack.getNdcPackageCode());
					i++;
				}

		}
		System.out.println("DID: " + i);
		return 0;

	}

	public int combine2(NDCPackageModel[] ndcpackage, NDCProductModel[] productmode) {
		// ArrayList<String> outputArrayList = new ArrayList();
		int c = 0;
		int i = 0;
		int prodloc = 0;
		int packloc = 0;
		boolean skipped = false;
		int counter = 0;
		int z = 0;
		System.out.println("Product Length:" + productmode.length);
		System.out.println("Package Length:" + ndcpackage.length);
		outerloop: for (i = 0; i < productmode.length; i++) {
			prodloc++;
			innerloop: for (z = packloc; z < ndcpackage.length; z++)
				// packloc++;
				if (productmode[i].getProductNDC().toString().equals(ndcpackage[z].getProductNDC().toString())) {
					System.out.println(ndcpackage[z].getProductID() + " " + ndcpackage[z].getPackageDescription() + " "
							+ productmode[i].getNonProprietaryName() + " " + ndcpackage[z].getNdcPackageCode());
					c++;

				} else if (counter == 1) {
					packloc = z + 1;
					counter = 0;
					// break innerloop;
				} else {
					// System.out.println(ndcpackage[z].getProductID() + " " +
					// ndcpackage[z].getPackageDescription() + " " +
					// productmode[i].getNonProprietaryName());
					packloc = z;
					counter = counter + 1;
					break innerloop;
				}

		}
		System.out.println("DID: " + i + " With z: " + z + " with counter: " + counter);
		return 0;

	}

	public int combine3(NDCPackageModel[] ndcpackage, NDCProductModel[] productmode) {
		// ArrayList<String> outputArrayList = new ArrayList();
		int c = 0;
		int i = 0;
		int prodloc = 0;
		int packloc = 0;
		boolean skipped = false;
		int counter = 0;
		int z = 0;
		System.out.println("Product Length:" + productmode.length + 1);
		System.out.println("Package Length:" + ndcpackage.length + 1);
		outerloop: for (i = 0; i < productmode.length; i++) {
			prodloc++;
			innerloop: for (z = packloc; z < ndcpackage.length; z++)
				 //packloc++;
				if (productmode[i].getProductNDC().toString().equals(ndcpackage[z].getProductNDC().toString())) {
					System.out.println(ndcpackage[z].getProductID() + " " + ndcpackage[z].getPackageDescription() + " "
							+ productmode[i].getNonProprietaryName() + " " + ndcpackage[z].getNdcPackageCode());
					c++;

				}
				else {
					packloc = z+1;
					break innerloop;
				}

		}
		System.out.println("DID: " + i + " With z: " + z + " with counter: " + counter);
		return 0;

	}

}
