package org.amalitechtraining.first_spring_application.repository;

import org.amalitechtraining.first_spring_application.entity.Address;
import org.amalitechtraining.first_spring_application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByUser(User user);
}
