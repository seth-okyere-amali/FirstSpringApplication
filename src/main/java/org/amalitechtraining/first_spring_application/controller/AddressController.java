package org.amalitechtraining.first_spring_application.controller;

import org.amalitechtraining.first_spring_application.entity.Address;
import org.amalitechtraining.first_spring_application.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public ResponseEntity<List<Address>> getAllAddresses() {
        var allAddresses = addressService.getAllAddresses();
        return ResponseEntity.ok(allAddresses);
    }

    @GetMapping("{id}")
    public ResponseEntity<Address> getAddress(@PathVariable Long id) {
        return ResponseEntity.ok(addressService.getAddress(id));
    }

    @PostMapping
    public ResponseEntity<Address> createAddress(@RequestBody Address address) {
        var createdAddress = addressService.createAddress(address);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAddress);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteAddress(@PathVariable Long id) {
        addressService.deleteAddress(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<List<Address>> getByUser(@PathVariable Long id) {
        var userAddresses = addressService.getByUser(id);
        return ResponseEntity.ok(userAddresses);
    }
}
