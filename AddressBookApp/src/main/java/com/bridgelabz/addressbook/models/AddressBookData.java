package com.bridgelabz.addressbook.models;

import javax.persistence.Table;

@Table(name="address_book1")
public class AddressBookData {
	
	private Integer id;
	private String name;
	private String address;
	private long phoneNumber;
	
	public AddressBookData(Integer id,AddressBookDTO addressBookDTO) {
		super();
		this.id = id;
		this.name = addressBookDTO.getName();
		this.address = addressBookDTO.getAddress();
		this.phoneNumber = addressBookDTO.getPhonenumber();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}