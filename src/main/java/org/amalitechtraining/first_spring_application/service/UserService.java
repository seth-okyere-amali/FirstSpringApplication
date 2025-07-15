package org.amalitechtraining.first_spring_application.service;

import org.amalitechtraining.first_spring_application.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(Long id);

    User register(User user);

    void deleteUser(Long id);
}
