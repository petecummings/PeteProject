package com.ustglobal.caremanager.ustcareadmin.model;

public class SuccessFail {

	private int successfulRecords;
	private int failedRecords;
	
	public SuccessFail(){
		
	}
	
	SuccessFail(int successfulRecords, int failedRecords){
		this.successfulRecords = successfulRecords;
		this.failedRecords = failedRecords;
	}

	public int getSuccessfulRecords() {
		return successfulRecords;
	}

	public void setSuccessfulRecords(int successfulRecords) {
		this.successfulRecords = successfulRecords;
	}

	public int getFailedRecords() {
		return failedRecords;
	}

	public void setFailedRecords(int failedRecords) {
		this.failedRecords = failedRecords;
	}
	
	
}
