package org.amalitechtraining.first_spring_application.repository;

import org.amalitechtraining.first_spring_application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
