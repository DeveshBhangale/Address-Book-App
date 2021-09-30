package com.bridgelabz.addressbook.models;

import lombok.Data;

public @Data class AddressBookDTO {
	private String name;
	private String address;
	private long phoneNumber;
	
	
	public AddressBookDTO(String name, String address, long phonenumber) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phonenumber;
	}

	
	
}
