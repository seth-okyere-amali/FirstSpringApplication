package org.amalitechtraining.first_spring_application.service;

import org.amalitechtraining.first_spring_application.entity.Address;
import org.amalitechtraining.first_spring_application.entity.User;
import org.amalitechtraining.first_spring_application.exception.ResourceNotFoundException;
import org.amalitechtraining.first_spring_application.repository.AddressRepository;
import org.amalitechtraining.first_spring_application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final UserRepository userRepository;

    public AddressServiceImpl(AddressRepository addressRepository, UserRepository userRepository) {
        this.addressRepository = addressRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddress(Long id) {
        return addressRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Address with id %d not found, check and try again".formatted(id)));
    }

    @Override
    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

//    @Override
//    public Address updateAddress(Long id, Address address) {
//        return addressRepository
//    }

    @Override
    public void deleteAddress(Long id) {
        addressRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Address with id %d not found, check and try again".formatted(id)));
        addressRepository.deleteById(id);
    }

    @Override
    public List<Address> getByUser(Long id) {
        var user = userRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "User with id %d not found, check and try again".formatted(id)));
        return addressRepository.findByUser(user);
    }
}
