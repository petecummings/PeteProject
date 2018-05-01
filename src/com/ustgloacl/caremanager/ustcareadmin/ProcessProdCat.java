package com.ustgloacl.caremanager.ustcareadmin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.click4care.thinkhealth._6_5.dto.AnyItemsType;
import com.click4care.thinkhealth._6_5.dto.BenefitsPackageType;
import com.click4care.thinkhealth._6_5.dto.InsurancePurchaserGroupProductCategoryType;
import com.click4care.thinkhealth._6_5.dto.InsurancePurchaserGroupType;
import com.click4care.thinkhealth._6_5.dto.ObjectFactory;
import com.click4care.thinkhealth._6_5.dto.PayerType;
import com.click4care.thinkhealth._6_5.dto.ProductCategoryType;
import com.opencsv.CSVReader;
import com.ustglobal.caremanager.ustcareadmin.model.AccountIPGModel;
import com.ustglobal.caremanager.ustcareadmin.model.BatchLoaderModel;
import com.ustglobal.caremanager.ustcareadmin.model.ProdCatModel;
import com.ustglobal.caremanager.ustcareadmin.model.SuccessFail;

public class ProcessProdCat {
	static Map<String,ProdCatModel> the2Map = new HashMap<String,ProdCatModel>();
	static Map<String,ProdCatModel> the3Map = new HashMap<String,ProdCatModel>();
	static Map<String,ProdCatModel> the4Map = new HashMap<String,ProdCatModel>();
	static Map<String,ProdCatModel> the5Map = new HashMap<String,ProdCatModel>();
	static Map<String,ProdCatModel> the6Map = new HashMap<String,ProdCatModel>();
	BatchLoaderModel batch = new BatchLoaderModel();

	
	public ProcessProdCat() {
		
		/* QUERY TO USE
		 * select bp.benefit_plan_hcc_id, bp.benefit_plan_name, prod.product_hcc_id, prod.product_name from HR_DWH.BENEFIT_PLAN bp
join hr_dwh.product prod on bp.benefit_plan_product_key = prod.product_key 
order by bp.benefit_plan_hcc_id asc
****NEW**** with desc
*select acctp.account_hcc_id,acctp.account_name, prod.sub_company_hcc_id, nlob.line_of_business_name, bp.benefit_plan_hcc_id, bp.benefit_plan_name, prod.product_hcc_id, prod.product_name, bp.benefit_plan_desc from HR_DWH.BENEFIT_PLAN bp
inner join hr_dwh.product prod on bp.benefit_plan_product_key = prod.product_key 
inner join hr_dwh.product_to_line_of_business lob on prod.product_key = lob.PRODUCT_KEY
inner join hr_dwh.line_of_business nlob on lob.LINE_OF_BUSINESS_KEY = nlob.LINE_OF_BUSINESS_KEY
inner JOIN hr_dwh.Account_plan_select_fact ACCT
		         ON bp.benefit_plan_key = ACCT.BENEFIT_PLAN_KEY
		         inner JOIN hr_dwh.account ACCTP
		         ON ACCT.ACCOUNT_KEY = ACCTP.top_account_key
                 order by bp.benefit_plan_hcc_id asc

****MATCHES CAREADMIN?*****
*select acctp.account_hcc_id, acctp.account_name, prod.sub_company_hcc_id, nlob.line_of_business_name, bp.benefit_plan_hcc_id, bp.benefit_plan_name, prod.product_hcc_id, prod.product_name, bp.benefit_plan_desc from HR_DWH.BENEFIT_PLAN bp
inner join hr_dwh.product prod on bp.benefit_plan_product_key = prod.product_key 
inner join hr_dwh.product_to_line_of_business lob on prod.product_key = lob.PRODUCT_KEY
inner join hr_dwh.line_of_business nlob on lob.LINE_OF_BUSINESS_KEY = nlob.LINE_OF_BUSINESS_KEY
inner JOIN hr_dwh.Account_plan_select_fact ACCT
		         ON bp.benefit_plan_key = ACCT.BENEFIT_PLAN_KEY
		         inner JOIN hr_dwh.account ACCTP
		         ON ACCT.ACCOUNT_KEY = ACCTP.top_account_key
                 order by bp.benefit_plan_hcc_id asc
                 
***********FROM SOGEN*********
*SELECT acctp.account_name,
  prod.sub_company_hcc_id,
  bp_lob.FundingMethod,
  bp_lob.Market,
  bp_lob.GroupSize,
  bp_lob.ServiceArea,
  bp.benefit_plan_hcc_id,
  bp.benefit_plan_name,
  prod.product_hcc_id,
  prod.product_name,
  bp.benefit_plan_desc
FROM hr_dwh.BENEFIT_PLAN bp
INNER JOIN hr_dwh.product prod
ON bp.benefit_plan_product_key = prod.product_key
inner join (SELECT bp.benefit_plan_key,
    MAX (
    CASE
      WHEN lob_val.LOB_GROUP_NAME = 'Funding method'
      THEN lob_val.line_of_business_name
    END) AS FundingMethod,
    MAX (
    CASE
      WHEN lob_val.LOB_GROUP_NAME = 'Market'
      THEN lob_val.line_of_business_name
    END) AS Market,
    MAX (
    CASE
      WHEN lob_val.LOB_GROUP_NAME = 'Group size'
      THEN lob_val.line_of_business_name
    END) AS GroupSize,
    MAX (
    CASE
      WHEN lob_val.LOB_GROUP_NAME = 'Service Area'
      THEN lob_val.line_of_business_name
    END) AS ServiceArea
  FROM hr_dwh.benefit_plan bp
  INNER JOIN hr_dwh.product_to_line_of_business prod_lob
  ON bp.benefit_plan_product_key = prod_lob.product_key
  INNER JOIN hr_dwh.line_of_business lob_val
  ON prod_lob.line_of_business_key = lob_val.line_of_business_key
  GROUP BY bp.benefit_plan_key
  ) bp_lob ON bp.benefit_plan_key = bp_lob.benefit_plan_key
INNER JOIN hr_dwh.Account_plan_select_fact ACCT
ON bp.benefit_plan_key = ACCT.BENEFIT_PLAN_KEY
INNER JOIN hr_dwh.account ACCTP
ON ACCT.ACCOUNT_KEY = ACCTP.top_account_key
ORDER BY bp.benefit_plan_hcc_id ASC
*****************************WITH HASH*******************************
*select IACCTP.account_hcc_id, acctp.account_name, prod.sub_company_hcc_id, nlob.line_of_business_name, bp.benefit_plan_hcc_id, bp.benefit_plan_name, prod.product_hcc_id, prod.product_name, bp.benefit_plan_desc, ora_hash(IACCTP.account_hcc_id|| '~' ||  acctp.account_name|| '~' ||  prod.sub_company_hcc_id|| '~' ||  nlob.line_of_business_name|| '~' ||  bp.benefit_plan_hcc_id|| '~' ||  bp.benefit_plan_name|| '~' ||  prod.product_hcc_id|| '~' ||  prod.product_name|| '~' ||  bp.benefit_plan_desc) as test from HR_DWH.BENEFIT_PLAN bp
inner join hr_dwh.product prod on bp.benefit_plan_product_key = prod.product_key 
inner join hr_dwh.product_to_line_of_business lob on prod.product_key = lob.PRODUCT_KEY
inner join hr_dwh.line_of_business nlob on lob.LINE_OF_BUSINESS_KEY = nlob.LINE_OF_BUSINESS_KEY
inner JOIN hr_dwh.Account_plan_select_fact ACCT
		         ON bp.benefit_plan_key = ACCT.BENEFIT_PLAN_KEY
		         inner JOIN hr_dwh.account ACCTP
		         ON ACCT.ACCOUNT_KEY = ACCTP.top_account_key
                 inner join hr_dwh.account IACCTP
                 on acct.account_key = IACCTP.account_key
                 where acctp.account_hcc_id like 'IU2013%' 
*************FUNCTION TO CREATE HASH??:
create or replace FUNCTION SHA1(STRING_TO_ENCRYPT VARCHAR2) 
    RETURN VARCHAR2 IS 
    BEGIN 
    RETURN LOWER(TO_CHAR(RAWTOHEX(SYS.DBMS_CRYPTO.HASH(UTL_RAW.CAST_TO_RAW(STRING_TO_ENCRYPT), SYS.DBMS_CRYPTO.HASH_SH1))));
END SHA1;

***********DUP CHECKER:
*select md5hash, count(md5hash)
from subscriptions
group by md5hash
having count (md5hash) > 1;

**********SH1 HASH UPDATE
*update subscriptions set md5HASH = (select rawtohex(
    DBMS_CRYPTO.Hash (
        UTL_I18N.STRING_TO_RAW (SOCIAL_SECURITY_NUMBER || LAST_NAME || FIRST_NAME || MIDDLE_NAME || DATE_OF_BIRTH || GENDER_CODE || RESIDENTIAL_STREET_ADDRESS_ONE || RESIDENTIAL_CITY || RESIDENTIAL_STATE || RESIDENTIAL_ZIP_CODE || RESIDENTIAL_COUNTY_CODE || RESIDENTIAL_HOME_PHONE || BENEFIT_PLAN_HCC_ID || COVERAGE_EFFECTIVE_DATE || SUBSCRIBER_ID || ACCOUNT_ID || MEMBER_ID || STREET_ADDRESS_TWO || STREET_ADDRESS_THREE || ZIP_CODE_4 || COUNTRY_CODE || EMAIL_ADDRESS || MAILING_STREET_ADDRESS_ONE || MAILING_STREET_ADDRESS_TWO || MAILING_STREET_ADDRESS_THREE || MAILING_STREET_CITY || MAILING_STREET_STATE || MAILING_STREET_ZIP_CODE || MAILING_STREET_ZIP_CODE_4 || MAILING_STREET_COUNTY_CODE || MAILING_STREET_COUNTRY_CODE || COVERAGE_END_DATE, 'AL32UTF8'),
        2)
    ) from dual) where subscriptions.member_id in (select member_id from (select rownum rn, subscriptions.member_id from subscriptions));
    
    ***************MYSQL HASH*******************
    *select SHA2(concat(Name,CountryCode,District),256) from world.city

update table <table_name> set ORIGSHA2 = SHA2(concat(ISSUBSCRIBER,SOCIAL_SECURITY_NUMBER,LAST_NAME,FIRST_NAME,MIDDLE_NAME,DATE_OF_BIRTH,GENDER_CODE,RESIDENTIAL_STREET_ADDRESS_ONE,RESIDENTIAL_CITY,RESIDENTIAL_STATE,RESIDENTIAL_ZIP_CODE,RESIDENTIAL_COUNTY_CODE,RESIDENTIAL_HOME_PHONE,BENEFIT_PLAN_HCC_ID,COVERAGE_EFFECTIVE_DATE,SUBSCRIBER_ID,ACCOUNT_ID,MEMBER_ID,STREET_ADDRESS_TWO,STREET_ADDRESS_THREE,ZIP_CODE_4,COUNTRY_CODE,EMAIL_ADDRESS,MAILING_STREET_ADDRESS_ONE,MAILING_STREET_ADDRESS_TWO,MAILING_STREET_ADDRESS_THREE,MAILING_STREET_CITY,MAILING_STREET_STATE,MAILING_STREET_ZIP_CODE,MAILING_STREET_ZIP_CODE_4,MAILING_STREET_COUNTY_CODE,MAILING_STREET_COUNTRY_CODE,COVERAGE_END_DATE),256);

diff process mysql:
SELECT 
    ORIGSHA2
FROM
    integration.subscriptions_prevday
WHERE
    ORIGSHA2 NOT IN (SELECT 
            ORIGSHA2
        FROM
            integration.subscriptions_stage);
            
********************THIS SHOULD BE FINAL w/Deaconess/Commercial ONLY************************
SELECT prod.sub_company_hcc_id,
bp_lob.Market as LOB, prod.product_hcc_id, bp.BENEFIT_PLAN_HCC_ID, prod.product_name, bp.benefit_plan_name, acctp.account_hcc_id
FROM hr_dwh.BENEFIT_PLAN bp
INNER JOIN hr_dwh.product prod
ON bp.benefit_plan_product_key = prod.product_key
inner join (SELECT bp.benefit_plan_key,
    MAX (
    CASE
      WHEN lob_val.LOB_GROUP_NAME = 'Funding method'
      THEN lob_val.line_of_business_name
    END) AS FundingMethod,
    MAX (
    CASE
      WHEN lob_val.LOB_GROUP_NAME = 'Market'
      THEN lob_val.line_of_business_name
    END) AS Market,
    MAX (
    CASE
      WHEN lob_val.LOB_GROUP_NAME = 'Group size'
      THEN lob_val.line_of_business_name
    END) AS GroupSize,
    MAX (
    CASE
      WHEN lob_val.LOB_GROUP_NAME = 'Service Area'
      THEN lob_val.line_of_business_name
    END) AS ServiceArea
  FROM hr_dwh.benefit_plan bp
  INNER JOIN hr_dwh.product_to_line_of_business prod_lob
  ON bp.benefit_plan_product_key = prod_lob.product_key
  INNER JOIN hr_dwh.line_of_business lob_val
  ON prod_lob.line_of_business_key = lob_val.line_of_business_key
  GROUP BY bp.benefit_plan_key
  ) bp_lob ON bp.benefit_plan_key = bp_lob.benefit_plan_key
INNER JOIN hr_dwh.Account_plan_select_fact ACCT
ON bp.benefit_plan_key = ACCT.BENEFIT_PLAN_KEY
INNER JOIN hr_dwh.account ACCTP
ON ACCT.ACCOUNT_KEY = ACCTP.top_account_key
inner join hr_dwh.account acctc
on acct.account_key = acctc.account_key
where bp_lob.Market in ('Deaconess','Commercial')
ORDER BY bp.benefit_plan_hcc_id,prod.product_hcc_id ASC
                 
Level 5 – Product Name  REMOVED NOW ONLY 5 Levels

Level 5 – Benefit Plan Name
Level 4 – LOB Name
Level 3 – Account Name (topAccount)
Level 2 – Sub Company Name // NOW GOING WITH PRODUCT NAME PER GEO
Level 1** will always defaults to Customer Name, in this case, IUHP

producthccid	
		 */
		
	}
	
	public int LoadProdCat(String file) throws IOException, JAXBException {
		Date start = new Date();
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		JAXBElement<ProductCategoryType> umet = null;
		JAXBElement<InsurancePurchaserGroupProductCategoryType> ipgpcumet = null;
		JAXBElement<BenefitsPackageType> bumet = null;
		
		BufferedReader treader = new BufferedReader(new FileReader(file));
		int lines = 0;

		while (treader.readLine() != null)
			lines++;
		treader.close();
		ProdCatModel[] pcmodel = new ProdCatModel[lines];
		CSVReader reader = null;
		try {
			int i = 0;
			reader = new CSVReader(new FileReader(file));
			String[] line;
			reader.readNext();
			while ((line = reader.readNext()) != null) {
				
				pcmodel[i] = new ProdCatModel(line);
				//System.out.println(ipgmodel[i].getAccountHccId());
				//Files.write(Paths.get("c:\\users\\u61906\\myfile.txt"), ipgmodel[i].toString().getBytes(), StandardOpenOption.APPEND);
				
				the2Map.put(pcmodel[i].getSubCompanyName() + "-" + pcmodel[i].getLineOfBiz(),pcmodel[i]);
				the3Map.put(pcmodel[i].getBpHccId() + "-" + pcmodel[i].getProductHccId(), pcmodel[i]);
				the4Map.put(pcmodel[i].getAccountHccId() + "-" + pcmodel[i].getBpHccId(), pcmodel[i]);
				//the5Map.put(pcmodel[i].getSubCompanyName() + "-" + pcmodel[i].getAccountHccId() + "-" + pcmodel[i].getProductHccId() + "-" + pcmodel[i].getBpHccId(), pcmodel[i]);
				//the5Map.put(pcmodel[i].getProductHccId(), pcmodel[i]);
				//the6Map.put(pcmodel[i].getLineOfBiz() + "-" + pcmodel[i].getSubCompanyName() + "-" + pcmodel[i].getSubCompanyName() + pcmodel[i].get, pcmodel[i]);
				
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		
				
		List<ProductCategoryType> list2 = ProcessTopProdCat(the2Map);
		List<InsurancePurchaserGroupProductCategoryType> list1 = Process3ProdCat(the4Map);
		List<ProductCategoryType> list3 = ProcessLLPC(the3Map);
		List<BenefitsPackageType> list7 = ProcessBP(the3Map);
		for(ProductCategoryType p : list2) {
			umet = of.createProductCategory(p);
		ai.getAny().add(umet);
		}
		
		for(ProductCategoryType p : list3) {
			umet = of.createProductCategory(p);
		ai.getAny().add(umet);
		}
		
		for(BenefitsPackageType p : list7) {
			bumet = of.createBenefitsPackage(p);
		ai.getAny().add(bumet);
		}
		
		for(InsurancePurchaserGroupProductCategoryType p : list1) {
			ipgpcumet = of.createInsurancePurchaserGroupProductCategory(p);
		ai.getAny().add(ipgpcumet);
		}
		
		
		SuccessFail results = new SuccessFail();
		
		try {
			InitIS.port.addOrUpdate(ai);
			//JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);
			//Marshaller m = context.createMarshaller();
			//m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			//m.marshal(ait, System.out); 
			results.setSuccessfulRecords(lines-1);
		
		}
		catch(Exception e) {
			//results = db.DeBatchAndProcessSingle(batch, file,ai, results);
		}
		finally {
		Date end = new Date();
		//db.AddBatchLogging(start, end, file, results.getSuccessfulRecords(), results.getFailedRecords(), (lines-1));
		}
		
		return lines;
		
	}

	
	public int OldLoadProdCat(String file) throws IOException, JAXBException {
		Map<String,String> theTopMap = new HashMap<String,String>();
		Map<String, ProdCatModel> theChildMap = new HashMap<String, ProdCatModel>();
		JAXBElement<ProductCategoryType> umet = null;
		Path filePath = new File(file).toPath();
		Charset charset = Charset.defaultCharset();
		List<String> stringList = Files.readAllLines(filePath, charset);
		String[] stringArray = stringList.toArray(new String[] {});
		ProdCatModel[] prodmodel = new ProdCatModel[stringArray.length];
		AnyItemsType ai = new AnyItemsType();
		ObjectFactory of = new ObjectFactory();
		int i;
		JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);
		for (i = 1; i < stringArray.length; i++) {
			//prodmodel[i] = new ProdCatModel(stringArray[i]);
			//System.out.println(prodmodel[i].getProductHccId() + " " + prodmodel[i].getProductName());
		theTopMap.put(prodmodel[i].getProductHccId(), prodmodel[i].getProductName());
		theChildMap.put(prodmodel[i].getBpHccId(), prodmodel[i]);
		}
		/*List<ProductCategoryType> lpt = ProcessTopProdCat(theTopMap);
		
		for (ProductCategoryType pt : lpt) {
			JAXBElement<ProductCategoryType> jaxbpayer = of.createProductCategory(pt);
			ai.getAny().add(jaxbpayer);
			
		}
		
		lpt.clear();
		lpt = ProcessChildAccount(theChildMap);
		for (ProductCategoryType pt : lpt) {
			JAXBElement<ProductCategoryType> jaxbpayer = of.createProductCategory(pt);
			ai.getAny().add(jaxbpayer);
			
		}
		
		lpt.clear();
		List<BenefitsPackageType> bpl = ProcessBP(theChildMap);
		for(BenefitsPackageType bt : bpl) {
			JAXBElement<BenefitsPackageType> jaxbpayer = of.createBenefitsPackage(bt);
			ai.getAny().add(jaxbpayer);
		}
		
		bpl.clear();
		
		
		JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(umet, System.out);
		//m.marshal(ait,  new File("C://Users/u61906/productCat.output"));
		
		return 0;*/
		return i;
		
		
			
		
	}
	
	public List<ProductCategoryType> ProcessTopProdCat(Map<String,ProdCatModel> pcmodel) {
		java.util.Iterator<Entry<String, ProdCatModel>> it = pcmodel.entrySet().iterator();
		List<ProductCategoryType> lpct = new ArrayList<ProductCategoryType>();
		ProductCategoryType top = new ProductCategoryType();
		top.setUniversalId("CompanyName");
		top.setName("IU Health Plans");
		lpct.add(top);
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	       //System.out.println(pair.getKey() + " = " + pair.getValue());
	        //it.remove(); // avoids a ConcurrentModificationException
	        ProductCategoryType pc = new ProductCategoryType();
	        ProductCategoryType pc1 = new ProductCategoryType();
	        ProductCategoryType pc2 = new ProductCategoryType();
	        ProductCategoryType pc3 = new ProductCategoryType();
	        
	    pc.setName(pcmodel.get(pair.getKey()).getSubCompanyName());
		pc.setUniversalId(pcmodel.get(pair.getKey()).getSubCompanyName());
		pc.setParentUniversalId("CompanyName");    
		
		pc1.setName(pcmodel.get(pair.getKey()).getLineOfBiz());
		pc1.setUniversalId(pcmodel.get(pair.getKey()).getSubCompanyName() + "-" + pcmodel.get(pair.getKey()).getLineOfBiz());
		pc1.setParentUniversalId(pcmodel.get(pair.getKey()).getSubCompanyName());
		
		
		pc2.setName(pcmodel.get(pair.getKey()).getProductName());
		pc2.setUniversalId(pcmodel.get(pair.getKey()).getProductHccId());
		pc2.setParentUniversalId(pcmodel.get(pair.getKey()).getSubCompanyName() + "-" + pcmodel.get(pair.getKey()).getLineOfBiz());
		
		
		
		
		lpct.add(pc);
		lpct.add(pc1);
		lpct.add(pc2);
		//lpct.add(pc3);
		
		
		
	    }
		//ipg.setParentGroupUniversalId(ipgmodel.getAccountName());
		return lpct;
	}
	
	public List<InsurancePurchaserGroupProductCategoryType> Process3ProdCat(Map<String,ProdCatModel> pcmodel) {
		java.util.Iterator<Entry<String, ProdCatModel>> it = pcmodel.entrySet().iterator();
		//account
		List<InsurancePurchaserGroupProductCategoryType> lpct = new ArrayList<InsurancePurchaserGroupProductCategoryType>();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	       //System.out.println(pair.getKey() + " = " + pair.getValue());
	        //it.remove(); // avoids a ConcurrentModificationException
	        InsurancePurchaserGroupProductCategoryType ipgpc = new InsurancePurchaserGroupProductCategoryType();
			ipgpc.setInsurancePurchaserGroupUniversalId(pcmodel.get(pair.getKey()).getAccountHccId());
			ipgpc.setProductCategoryUniversalId(pcmodel.get(pair.getKey()).getBpHccId());
			ipgpc.setUniversalId(pcmodel.get(pair.getKey()).getBpHccId() + "-" + pcmodel.get(pair.getKey()).getAccountHccId());
		lpct.add(ipgpc);
	    }
		//ipg.setParentGroupUniversalId(ipgmodel.getAccountName());
		return lpct;
	}
	
	public List<ProductCategoryType> Process4ProdCat(Map<String,ProdCatModel> pcmodel) {
		java.util.Iterator<Entry<String, ProdCatModel>> it = pcmodel.entrySet().iterator();
		
		List<ProductCategoryType> lpct = new ArrayList<ProductCategoryType>();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	       //System.out.println(pair.getKey() + " = " + pair.getValue());
	        //it.remove(); // avoids a ConcurrentModificationException
	        ProductCategoryType pc = new ProductCategoryType();
		
		pc.setParentUniversalId("CompanyName" + "-" + pcmodel.get(pair.getKey()).getSubCompanyName() + "-" + pcmodel.get(pair.getKey()).getLineOfBiz());
		pc.setName(pcmodel.get(pair.getKey()).getProductName());
		pc.setUniversalId("L4-" + "CompanyName" + "-" + pcmodel.get(pair.getKey()).getSubCompanyName() + "-" + pcmodel.get(pair.getKey()).getLineOfBiz() + "-" + pcmodel.get(pair.getKey()).getProductHccId());
		lpct.add(pc);
		
	    }
		//ipg.setParentGroupUniversalId(ipgmodel.getAccountName());
		return lpct;
	}
	
	public List<ProductCategoryType> Process5ProdCat(Map<String,ProdCatModel> pcmodel) {
		java.util.Iterator<Entry<String, ProdCatModel>> it = pcmodel.entrySet().iterator();
		
		List<ProductCategoryType> lpct = new ArrayList<ProductCategoryType>();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	       //System.out.println(pair.getKey() + " = " + pair.getValue());
	        //it.remove(); // avoids a ConcurrentModificationException
	        ProductCategoryType pc = new ProductCategoryType();
		//System.out.println(pair.getKey());
		pc.setParentUniversalId("CompanyName" + "-" + pcmodel.get(pair.getKey()).getSubCompanyName() + "-" + pcmodel.get(pair.getKey()).getLineOfBiz() + "-" + pcmodel.get(pair.getKey()).getProductHccId());
		pc.setName(pcmodel.get(pair.getKey()).getBpName());
		pc.setUniversalId("L5-" + "CompanyName" + "-" + pcmodel.get(pair.getKey()).getSubCompanyName() + "-" + pcmodel.get(pair.getKey()).getLineOfBiz() + "-" + pcmodel.get(pair.getKey()).getProductHccId() + "-" + pcmodel.get(pair.getKey()).getBpName());
		lpct.add(pc);
		
	    }
		//ipg.setParentGroupUniversalId(ipgmodel.getAccountName());
		return lpct;
	}
	
	public List<ProductCategoryType> Process6ProdCat(Map<String,ProdCatModel> pcmodel) {
		java.util.Iterator<Entry<String, ProdCatModel>> it = pcmodel.entrySet().iterator();
		
		List<ProductCategoryType> lpct = new ArrayList<ProductCategoryType>();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	       //System.out.println(pair.getKey() + " = " + pair.getValue());
	        //it.remove(); // avoids a ConcurrentModificationException
	        ProductCategoryType pc = new ProductCategoryType();
		
		pc.setParentUniversalId(pcmodel.get(pair.getKey()).getAccountHccId());
		pc.setName(pcmodel.get(pair.getKey()).getBpName());
		pc.setUniversalId(pcmodel.get(pair.getKey()).getBpHccId());
		lpct.add(pc);
		
	    }
		//ipg.setParentGroupUniversalId(ipgmodel.getAccountName());
		return lpct;
	}
	
	public List<ProductCategoryType> ProcessChildAccount(Map<String,ProdCatModel> pcmodel) {
		java.util.Iterator<Entry<String, ProdCatModel>> it = pcmodel.entrySet().iterator();
		List<ProductCategoryType> lpct = new ArrayList<ProductCategoryType>();
		 while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		ProductCategoryType pc = new ProductCategoryType();
		pc.setName(pcmodel.get(pair.getKey()).getBpName().toString().replace("\"", ""));
		pc.setUniversalId(pair.getKey().toString().replace("\"", ""));
		pc.setParentUniversalId(pcmodel.get(pair.getKey()).getProductHccId().toString().replace("\"", ""));
		lpct.add(pc);
		 }
		return lpct;
	}
	
	public List<BenefitsPackageType> ProcessBP(Map<String,ProdCatModel> pcmodel) {
		java.util.Iterator<Entry<String, ProdCatModel>> it = pcmodel.entrySet().iterator();
		List<BenefitsPackageType> lpct = new ArrayList<BenefitsPackageType>();
		 while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        BenefitsPackageType pc = new BenefitsPackageType();
		pc.setName(pcmodel.get(pair.getKey()).getBpDesc());
		pc.setDescription(pcmodel.get(pair.getKey()).getBpDesc().replace("/", "\\"));
		pc.setUniversalId(pcmodel.get(pair.getKey()).getBpHccId());
		pc.setProductCategoryUniversalId(pcmodel.get(pair.getKey()).getBpHccId());
		
		lpct.add(pc);
		 }
		return lpct;
	}
	
	public List<ProductCategoryType> ProcessLLPC(Map<String,ProdCatModel> pcmodel) {
		java.util.Iterator<Entry<String, ProdCatModel>> it = pcmodel.entrySet().iterator();
		List<ProductCategoryType> lpct = new ArrayList<ProductCategoryType>();
		 while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        ProductCategoryType pc = new ProductCategoryType();
		        pc.setName(pcmodel.get(pair.getKey()).getBpDesc().replace("/", "\\"));
		    	pc.setUniversalId(pcmodel.get(pair.getKey()).getBpHccId());
		    	pc.setParentUniversalId(pcmodel.get(pair.getKey()).getProductHccId());
		
		    	lpct.add(pc);
		 }
		return lpct;
	}
	
	
	
	
	public List<InsurancePurchaserGroupProductCategoryType> ProcessIpgToPc(Map<String,ProdCatModel> pcmodel) {
		java.util.Iterator<Entry<String, ProdCatModel>> it = pcmodel.entrySet().iterator();
		
		List<InsurancePurchaserGroupProductCategoryType> lpct = new ArrayList<InsurancePurchaserGroupProductCategoryType>();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	       //System.out.println(pair.getKey() + " = " + pair.getValue());
	        //it.remove(); // avoids a ConcurrentModificationException
	        InsurancePurchaserGroupProductCategoryType pc = new InsurancePurchaserGroupProductCategoryType();
		
		pc.setInsurancePurchaserGroupUniversalId(pcmodel.get(pair.getKey()).getAccountHccId());
		pc.setProductCategoryUniversalId(pcmodel.get(pair.getKey()).getProductHccId() + "-" + pcmodel.get(pair.getKey()).getLineOfBiz() + "-" + pcmodel.get(pair.getKey()).getBpHccId());
		pc.setUniversalId(pcmodel.get(pair.getKey()).getProductHccId() + "-" + pcmodel.get(pair.getKey()).getLineOfBiz() + "-" + pcmodel.get(pair.getKey()).getBpHccId());
		lpct.add(pc);
		
	    }
		//ipg.setParentGroupUniversalId(ipgmodel.getAccountName());
		return lpct;
	}
	

}
