package com.kuznetsov.assignment1.SpringUsersDB.service;

import com.kuznetsov.assignment1.SpringUsersDB.model.User;
import com.kuznetsov.assignment1.SpringUsersDB.repository.IUserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class UserServiceRepository implements IUserService {

    private final IUserRepository repository;

    @Override
    public List<User> findAllUsers() {
        return repository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return repository.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return repository.findUserByEmail(email);
    }

    @Override
    @Transactional
    public void deleteUserByEmail(String email) {
        repository.deleteUserByEmail(email);
    }
}
