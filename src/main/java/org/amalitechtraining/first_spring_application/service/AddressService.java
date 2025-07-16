package org.amalitechtraining.first_spring_application.service;

import org.amalitechtraining.first_spring_application.entity.Address;
import org.amalitechtraining.first_spring_application.entity.User;

import java.util.List;

public interface AddressService {
    List<Address> getAllAddresses();
    Address getAddress(Long id);
    Address createAddress(Address address);
//    Address updateAddress(Long id, Address address);
    void deleteAddress(Long id);
    List<Address> getByUser(Long id);
}
