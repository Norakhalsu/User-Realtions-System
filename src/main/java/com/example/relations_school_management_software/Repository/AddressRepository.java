package com.example.relations_school_management_software.Repository;

import com.example.relations_school_management_software.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository  extends JpaRepository<Address, Integer> {
    Address findAddressById(Integer id);
}
