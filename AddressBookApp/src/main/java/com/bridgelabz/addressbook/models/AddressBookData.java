package com.bridgelabz.addressbook.models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="address_book1")
public @Data @ToString
class AddressBookData {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "address")
	private String address;
	@Column(name = "phoneNumber")
	private String phoneNumber;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;

	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "address_book_dept",joinColumns =@JoinColumn(name = "id"))
	@Column(name = "department")
	private List<String> department;

	public AddressBookData() {
	}

	public AddressBookData(AddressBookDTO addressBookDTO) {
		super();
		this.name = addressBookDTO.getName();
		this.address = addressBookDTO.getAddress();
		this.phoneNumber = addressBookDTO.getPhoneNumber();
		this.city = addressBookDTO.getCity();
		this.state = addressBookDTO.getState();
		this.department = addressBookDTO.getDepartment();
	}

	
}