package com.bridgelabz.addressbook.repo;


import com.bridgelabz.addressbook.models.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepo extends JpaRepository<AddressBookData,Integer> {
}
