package com.abc.model;

public class UserDetail {
	
	 private int     id;
	 private String  password ;
	 private String  firstName;
	 private String  lastName;
	 private String  phone; 
	 private Address address ;
	 private String  email ;
	 private boolean enable=true; 
	 private boolean isEmployee ;
	 private boolean isAffilate;
	public boolean isAffilate() {
		return isAffilate;
	}
	public void setAffilate(boolean isAffilate) {
		this.isAffilate = isAffilate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	public boolean isEmployee() {
		return isEmployee;
	}
	public void setEmployee(boolean isEmployee) {
		this.isEmployee = isEmployee;
	}
	 
	 
	 	 
}
