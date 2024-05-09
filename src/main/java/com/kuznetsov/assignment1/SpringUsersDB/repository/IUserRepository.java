package com.kuznetsov.assignment1.SpringUsersDB.repository;

import com.kuznetsov.assignment1.SpringUsersDB.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {

    void deleteUserByEmail(String email);

    User findUserByEmail(String email);

}
