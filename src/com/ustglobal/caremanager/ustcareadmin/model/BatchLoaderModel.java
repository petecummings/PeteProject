package com.ustglobal.caremanager.ustcareadmin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BATCH_LOG")
public class BatchLoaderModel {
	
		   @Id @GeneratedValue
		   @Column(name = "batch_id")
		   private int batch_id;
		   
		   @Column(name = "startDate")
		   private String startDate;
		   
		   @Column(name = "endDate")
		   private String endDate;
		   
		   @Column(name = "fileName")
		   private String fileName;
		   
		   @Column(name = "successfulRecords")
		   private int successfulRecords;
		   
		   @Column(name = "failedRecords")
		   private int failedRecords;
		   
		   @Column(name = "totalRecords")
		   private int totalRecords;

		public int getTotalRecords() {
			return totalRecords;
		}

		public void setTotalRecords(int totalRecords) {
			this.totalRecords = totalRecords;
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

		public int getBatch_id() {
			return batch_id;
		}

		public void setBatch_id(int batch_id) {
			this.batch_id = batch_id;
		}

		public String getStartDate() {
			return startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getEndDate() {
			return endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		   
		  
		  }
