package com.bridgelabz.addressbook.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.List;

@NoArgsConstructor
public @Data class AddressBookDTO {
	@NotEmpty(message = "Name cannot be null")
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Address Book name Invalid")
	private String name;

	@NotEmpty(message = "address cannot be empty")
	private String address;

	@Min(10) @NotEmpty(message = "Number cannot be empty")
	private String phoneNumber;

	@NotEmpty(message = "city cannot be empty")
	private String city;

	@NotEmpty(message = "state cannot be empty")
	private String state;

	@NotNull(message="department cannot be empty")
	public List<String> department;

	
	
}
