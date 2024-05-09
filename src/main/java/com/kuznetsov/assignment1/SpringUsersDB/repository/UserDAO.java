package com.kuznetsov.assignment1.SpringUsersDB.repository;

import com.kuznetsov.assignment1.SpringUsersDB.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class UserDAO {

    private final List<User> USERS = new ArrayList<>();

    public List<User> findAllUsers() {
        return USERS;
    }

    public User saveUser(User user) {
        USERS.add(user);
        return user;
    }

    public User updateUser(User user) {
        var userIndex = IntStream.range(0, USERS.size())
                .filter(index -> USERS.get(index).getEmail().equals(user.getEmail()))
                .findFirst()
                .orElse(-1);
        if (userIndex > -1) {
            USERS.set(userIndex, user);
            return user;
        } else {
            return null;
        }
    }

    public User findUserByEmail(String email) {
        return USERS.stream()
                .filter(element -> element.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public void deleteUserByEmail(String email) {
        var user = findUserByEmail(email);
        if (user != null) {
            USERS.remove(user);
        }
    }

}
