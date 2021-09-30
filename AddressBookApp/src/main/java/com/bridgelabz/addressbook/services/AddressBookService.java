package com.bridgelabz.addressbook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbook.models.AddressBookDTO;
import com.bridgelabz.addressbook.models.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService{
	
	List<AddressBookData> addressBookDataList = new ArrayList<>();
	
	@Override
	public List<AddressBookData> getAll() {
		return addressBookDataList;
	}

	@Override
	public AddressBookData getById(int id) {
		return addressBookDataList.get(id-1);
	}

	@Override
	public AddressBookData addData(AddressBookDTO addressBookDTO) {
		int id = addressBookDataList.size()+1;
		AddressBookData addressBookData = new AddressBookData(id, addressBookDTO);
		addressBookDataList.add(addressBookData);
		return addressBookData;
	}

	@Override
	public AddressBookData updateData(int id, AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = addressBookDataList.get(id-1);
		addressBookData.setAddress(addressBookDTO.getAddress());
		addressBookData.setName(addressBookDTO.getName());
		addressBookData.setPhoneNumber(addressBookDTO.getPhoneNumber());
		addressBookDataList.set(id-1, addressBookData);
		return addressBookData;
	}

	@Override
	public void deleteData(int id) {
		addressBookDataList.remove(id-1);
	}
	
}