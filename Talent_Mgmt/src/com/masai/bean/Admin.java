package com.masai.bean;

public class Admin {
	
	private int aId;
	private String name;
	
	private String email;
	private String password;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(int aId, String name, String email, String password) {
		super();
		this.aId = aId;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [aId=" + aId + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}

}
