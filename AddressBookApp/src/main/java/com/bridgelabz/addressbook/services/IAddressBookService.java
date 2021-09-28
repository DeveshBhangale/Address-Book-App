package com.bridgelabz.addressbook.services;

import java.util.List;

import com.bridgelabz.addressbook.models.AddressBookDTO;
import com.bridgelabz.addressbook.models.AddressBookData;

public interface IAddressBookService {
	List<AddressBookData> getAll();
	AddressBookData getById(int id);
	AddressBookData addData(AddressBookDTO addressBookDTO);
	AddressBookData updateData(int id, AddressBookDTO addressBookDTO);
	void deleteData(int id);
}
