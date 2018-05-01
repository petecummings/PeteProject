package com.ustglobal.caremanager.ustcareadmin.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="ERROR_LOG")
public class ErrorToMysqlModel {

	   
	   
	    @Id
	    @GeneratedValue
	    @Column(name="error_id")
	    private int error_id;

	    @ManyToOne(cascade=CascadeType.ALL)
	    @JoinColumn(name = "batch_id")
	    private BatchLoaderModel model;
	   
	   @Column(name = "source")
	   private String source;  //HRCM or HRPAYOR
	   
	   @Column(name = "loadTime")
	   private String loadTime;
	   
	   @Column(name = "sourceRecord")
	   private String sourceRecord; 
	   
	   @Column(name = "errorText")
	   private String errorText;   
	   
	   
	   public ErrorToMysqlModel() {}

	

	public int getError_id() {
		return error_id;
	}



	public void setError_id(int error_id) {
		this.error_id = error_id;
	}



	public BatchLoaderModel getModel() {
		return model;
	}



	public void setModel(BatchLoaderModel model) {
		this.model = model;
	}



	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getLoadTime() {
		return loadTime;
	}

	public void setLoadTime(String currentTime) {
		this.loadTime = currentTime;
	}

	public String getSourceRecord() {
		return sourceRecord;
	}

	public void setSourceRecord(String sourceRecord) {
		this.sourceRecord = sourceRecord;
	}

	public String getErrorText() {
		return errorText;
	}

	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}
	   
	   
	  
	   
	   
	}