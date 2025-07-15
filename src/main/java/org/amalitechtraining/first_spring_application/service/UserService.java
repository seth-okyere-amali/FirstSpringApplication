package org.amalitechtraining.first_spring_application.service;

import org.amalitechtraining.first_spring_application.dao.UserDao;
import org.amalitechtraining.first_spring_application.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public User getUser(Long id) {
        return userDao.findById(id).orElseThrow();
    }

    public User register(User user) {
        return userDao.save(user);
    }
}
