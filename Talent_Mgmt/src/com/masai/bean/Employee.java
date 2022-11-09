package com.masai.bean;

public class Employee {
	
	private int eId;
	private String eName;
	
	private String eEmail;
	private String ePassword;
	private int eSalary;
	private String eAddress;
	
	private Department dept;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}

	public String getePassword() {
		return ePassword;
	}

	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}

	public int geteSalary() {
		return eSalary;
	}

	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}

	public String geteAddress() {
		return eAddress;
	}

	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Employee(int eId, String eName, String eEmail, String ePassword, int eSalary, String eAddress,
			Department dept) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eEmail = eEmail;
		this.ePassword = ePassword;
		this.eSalary = eSalary;
		this.eAddress = eAddress;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eEmail=" + eEmail + ", ePassword=" + ePassword
				+ ", eSalary=" + eSalary + ", eAddress=" + eAddress + ", dept=" + dept + "]";
	}
	
	
	

}
