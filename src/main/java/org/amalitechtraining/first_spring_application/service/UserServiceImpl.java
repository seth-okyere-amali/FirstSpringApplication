package org.amalitechtraining.first_spring_application.service;

import org.amalitechtraining.first_spring_application.entity.User;
import org.amalitechtraining.first_spring_application.exception.ResourceNotFoundException;
import org.amalitechtraining.first_spring_application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Long id) {
        return userRepository.
                findById(id).
                orElseThrow(() -> new ResourceNotFoundException(
                        "User with id %d does not exist".formatted(id)));
    }

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.
                findById(id).
                orElseThrow(() -> new ResourceNotFoundException(
                        "User with id %d does not exist".formatted(id)));
        userRepository.deleteById(id);
    }
}
