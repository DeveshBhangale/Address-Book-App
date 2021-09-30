package com.bridgelabz.addressbook.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@NoArgsConstructor
public @Data class AddressBookDTO {
	@NotEmpty(message = "Name cannot be null")
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Address Book name Invalid")
	private String name;

	@NotEmpty(message = "address cannot be empty")
	private String address;

	@Min(10)
	private String phoneNumber;
	
	
	public AddressBookDTO(String name, String address, String phoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	
	
}
