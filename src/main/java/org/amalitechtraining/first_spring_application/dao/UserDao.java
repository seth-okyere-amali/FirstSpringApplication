package org.amalitechtraining.first_spring_application.dao;

import org.amalitechtraining.first_spring_application.entity.Gender;
import org.amalitechtraining.first_spring_application.entity.User;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserDao {
    private List<User> users = new ArrayList<>();

    public UserDao (){
        initializeUsers();
    }
    public List<User> findAll() {
        return this.users;
    }

    public Optional<User> findById(Long id) {
        for (var user : this.users) {
            if(user.getId().equals(id))
                return Optional.of(user);
        }
        return Optional.empty();
    }

    public User save(User user) {
        users.add(user);
        return users.getLast();
    }

    private void initializeUsers() {
        var user = new User(
            "Seth",
            "Okyere",
            Gender.Male,
            "2002-09-15",
            "eskay.dev7@gmail.com",
            "demoPassword"
        );
        var user1 = new User(
                "Elijah",
                "Okyere",
                Gender.Male,
                "1999-10-21",
                "yaw.sam@gmail.com",
                "demoPassword"
        );
        var user2 = new User(
                "Sandra",
                "Okyere",
                Gender.Female,
                "1997-02-14",
                "akua.sandy@gmail.com",
                "demoPassword"
        );

       this.users.add(user);
       this.users.add(user1);
       this.users.add(user2);
    }
}
