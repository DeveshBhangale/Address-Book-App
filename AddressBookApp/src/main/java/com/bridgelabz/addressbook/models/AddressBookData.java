package com.bridgelabz.addressbook.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="address_book1")
public @Data class AddressBookData {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	private String name;
	private String address;
	private String phoneNumber;
	
	public AddressBookData(Integer id,AddressBookDTO addressBookDTO) {
		super();
		this.id = id;
		this.name = addressBookDTO.getName();
		this.address = addressBookDTO.getAddress();
		this.phoneNumber = addressBookDTO.getPhoneNumber();
	}

	
}