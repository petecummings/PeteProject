package com.ustglobal.caremanager.ustcareadmin.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountIPGModel {
	
	
	private String topAccountKey;
	private String accountKey;
	private String accountHccId;
	private String accountName;
	private String parentAccountNames;
	private String accountLevel;
	private String theParent;
	public String getTheParent() {
		return theParent;
	}

	public void setTheParent(String theParent) {
		this.theParent = theParent;
	}

	public String getParentAccountNames() {
		return parentAccountNames;
	}

	public void setParentAccountNames(String parentAccountNames) {
		this.parentAccountNames = parentAccountNames;
	}

	
	
	public String getAccountLevel() {
		return accountLevel;
	}

	public void setAccountLevel(String accountLevel) {
		this.accountLevel = accountLevel;
	}

	public AccountIPGModel(String[] split) {
        topAccountKey = split[0];
        accountKey = split[1];
        accountHccId = split[2];
        accountName = split[3];
        parentAccountNames = split[4];
        accountLevel =split[5];
        theParent = split[6];
        }
	
	@Override
	public String toString() {
		return "AccountIPGModel [topAccountKey=" + topAccountKey + ", accountKey=" + accountKey + ", accountHccId="
				+ accountHccId + ", accountName=" + accountName + ", parentAccountNames=" + parentAccountNames
				+ ", accountLevel=" + accountLevel + "]";
	}

	public AccountIPGModel(ResultSet line) throws SQLException {
        topAccountKey = line.getString(0);
        accountKey = line.getString(1);
        accountHccId = line.getString(2);
        accountName = line.getString(3);
        parentAccountNames = line.getString(4);
        accountLevel = line.getString(5);
    }

	public AccountIPGModel() {
		
	}
	
	
	public String getTopAccountKey() {
		return topAccountKey;
	}

	public void setTopAccountKey(String topAccountKey) {
		this.topAccountKey = topAccountKey;
	}

	public String getAccountKey() {
		return accountKey;
	}

	public void setAccountKey(String accountKey) {
		this.accountKey = accountKey;
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

	
	
}
