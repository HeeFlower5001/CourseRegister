package com.kau.network.courseregister.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kau.network.courseregister.model.User;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        User user;

        user = new User(
            2022125077,
            "khs",
            "khs",
            "김희승"
        );

        users.add(user);

        user = new User(
            2020000001,
            "sjs",
            "sjs",
            "송준수"
        );

        users.add(user);

        user = new User(
            2021000001,
            "shj",
            "shj",
            "신희주"
        );

        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public User findById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }

        return null;
    }
}