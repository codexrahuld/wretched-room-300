package com.masai.bean;

public class Department {
	
	private int did;
	private String dName;
	private String branch;
	
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(int did, String dName, String branch) {
		super();
		this.did = did;
		this.dName = dName;
		this.branch = branch;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dName=" + dName + ", branch=" + branch + "]";
	}
	
	
	
	
	
	
	
	

}
