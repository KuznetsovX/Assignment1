package com.kuznetsov.assignment1.SpringUsersDB.service;

import com.kuznetsov.assignment1.SpringUsersDB.model.User;

import java.util.List;

public interface IUserService {

    List<User> findAllUsers();

    User saveUser(User user);//createUser

    User updateUser(User user);

    User findUserByEmail(String email);

    void deleteUserByEmail(String email);

}
