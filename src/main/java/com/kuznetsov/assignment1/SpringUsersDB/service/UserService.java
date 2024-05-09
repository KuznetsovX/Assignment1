package com.kuznetsov.assignment1.SpringUsersDB.service;

import com.kuznetsov.assignment1.SpringUsersDB.model.User;
import com.kuznetsov.assignment1.SpringUsersDB.repository.UserDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    private final UserDAO repository;

    @Override
    public List<User> findAllUsers() {
        return repository.findAllUsers();
    }

    @Override
    public User saveUser(User user) {
        return repository.saveUser(user);
    }

    @Override
    public User updateUser(User user) {
        return repository.updateUser(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return repository.findUserByEmail(email);
    }

    @Override
    public void deleteUserByEmail(String email) {
        repository.deleteUserByEmail(email);
    }

}
