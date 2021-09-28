package com.bridgelabz.addressbook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	
	@RequestMapping({"","/","/get"})
	public ResponseEntity<String> getAddressBook() {
		return new ResponseEntity<String>("Get call success",HttpStatus.OK);
	}
	
	
	@GetMapping("/get/{phoneNo}")
	public ResponseEntity<String> getAddressBookById(@PathVariable int phoneNo){
		return new ResponseEntity<String>("Get by Id success",HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> createAddressBook(){
		return new ResponseEntity<String>("Created Successfully",HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateAddressBook(){
		return new ResponseEntity<String>("Updated Successfully",HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteAddressBook(){
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
	}
	
}