package com.bridgelabz.addressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbook.models.AddressBookDTO;
import com.bridgelabz.addressbook.models.ResponseDTO;
import com.bridgelabz.addressbook.services.IAddressBookService;

import javax.validation.Valid;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	
	@Autowired
	public IAddressBookService addressBookService;
	
	@RequestMapping({"","/","/get"})
	public ResponseEntity<ResponseDTO> getAddressBook() {
		ResponseDTO responseDTO = new ResponseDTO("Address Book success", addressBookService.getAll());
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getAddressBookById(@PathVariable int id){
		ResponseDTO responseDTO = new ResponseDTO("Address Book by Id success",addressBookService.getById(id));
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createAddressBook( @RequestBody AddressBookDTO addressBookDTO){
		ResponseDTO responseDTO = new ResponseDTO("Created Successfully",addressBookService.addData(addressBookDTO));
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateAddressBook(@PathVariable int id,@RequestBody AddressBookDTO addressBookDTO){
		ResponseDTO responseDTO = new ResponseDTO("Updated Successfully",addressBookService.updateData(id,addressBookDTO));
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseDTO> deleteAddressBook(@RequestParam int id){
		addressBookService.deleteData(id);
		ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully",id);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
}