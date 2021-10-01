package com.bridgelabz.addressbook.services;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.addressbook.exceptions.AddressBookException;
import com.bridgelabz.addressbook.repo.AddressBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbook.models.AddressBookDTO;
import com.bridgelabz.addressbook.models.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService{

	@Autowired
	private AddressBookRepo addressBookRepo;
	
	List<AddressBookData> addressBookDataList = new ArrayList<>();
	
	@Override
	public List<AddressBookData> getAll() {
		return addressBookRepo.findAll();
	}

	@Override
	public AddressBookData getById(int id) {
		return addressBookRepo.findById(id).orElseThrow(()->new AddressBookException("contact not found"));
	}

	@Override
	public AddressBookData addData(AddressBookDTO addressBookDTO) {
		int id = addressBookDataList.size()+1;
		AddressBookData addressBookData = new AddressBookData(addressBookDTO);
		addressBookDataList.add(addressBookData);
		return addressBookRepo.save(addressBookData);
	}

	@Override
	public AddressBookData updateData(int id, AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = addressBookRepo.getById(id);
		addressBookData.setName(addressBookDTO.getName());
		addressBookData.setAddress(addressBookDTO.getAddress());
		addressBookData.setPhoneNumber(addressBookDTO.getPhoneNumber());
		addressBookData.setCity(addressBookDTO.getCity());
		addressBookData.setState(addressBookDTO.getState());
		addressBookData.setDepartment(addressBookDTO.getDepartment());
		return addressBookRepo.save(addressBookData);
	}

	@Override
	public void deleteData(int id) {
		addressBookRepo.deleteById(id);
	}
	
}