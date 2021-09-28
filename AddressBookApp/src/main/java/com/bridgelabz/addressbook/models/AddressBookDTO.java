package com.bridgelabz.addressbook.models;

public class AddressBookDTO {
	private String name;
	private String address;
	private long phoneNumber;
	
	
	public AddressBookDTO(String name, String address, long phonenumber) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phonenumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getPhonenumber() {
		return phoneNumber;
	}


	public void setPhonenumber(long phonenumber) {
		this.phoneNumber = phonenumber;
	} 
	
	
	
}
