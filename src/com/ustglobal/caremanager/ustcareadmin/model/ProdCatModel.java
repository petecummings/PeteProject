package com.ustglobal.caremanager.ustcareadmin.model;

public class ProdCatModel {
	private String topAccountName;
	private String accountHccId;
	private String accountName;
	private String subCompanyName;
	private String lineOfBiz;
	private String bpHccId;
	private String bpName;
	private String productHccId;
	private String productName;
	private String benefitPlanDesc;
	private String bpDesc;
	
	public String getBpDesc() {
		return bpDesc;
	}

	public void setBpDesc(String bpDesc) {
		this.bpDesc = bpDesc;
	}

	public ProdCatModel(String[] line) {
		//line.split(Pattern.quote("."));
		//line.split(Pattern.quote(","));
        //String[] split = line.split(",");
		//topAccountName = line[0];
		//accountName = line[1];
		//accountHccId = line[2];
		subCompanyName = line[0];
		lineOfBiz = line[1];
		productHccId = line[2];
        bpHccId = line[3];
        productName = line[4];
        bpName = line[5];
        accountHccId = line[6];
        bpDesc = line[7];
        //bpDesc = line[9];
        
    }



	public String getTopAccountName() {
		return topAccountName;
	}

	public void setTopAccountName(String topAccountName) {
		this.topAccountName = topAccountName;
	}

	public String getAccountHccId() {
		return accountHccId;
	}

	public void setAccountHccId(String accountHccId) {
		this.accountHccId = accountHccId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getSubCompanyName() {
		return subCompanyName;
	}

	public void setSubCompanyName(String subCompanyName) {
		this.subCompanyName = subCompanyName;
	}

	public String getLineOfBiz() {
		return lineOfBiz;
	}

	public void setLineOfBiz(String lineOfBiz) {
		this.lineOfBiz = lineOfBiz;
	}

	public String getBenefitPlanDesc() {
		return benefitPlanDesc;
	}

	public void setBenefitPlanDesc(String benefitPlanDesc) {
		this.benefitPlanDesc = benefitPlanDesc;
	}

	public String getProductHccId() {
		return productHccId;
	}

	public void setProductHccId(String productHccId) {
		this.productHccId = productHccId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBpHccId() {
		return bpHccId;
	}

	public void setBpHccId(String bpHccId) {
		this.bpHccId = bpHccId;
	}

	public String getBpName() {
		return bpName;
	}

	public void setBpName(String bpName) {
		this.bpName = bpName;
	}
}
