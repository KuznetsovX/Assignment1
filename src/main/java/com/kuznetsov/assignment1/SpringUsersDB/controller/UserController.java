package com.kuznetsov.assignment1.SpringUsersDB.controller;

import com.kuznetsov.assignment1.SpringUsersDB.model.User;
import com.kuznetsov.assignment1.SpringUsersDB.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping
    public List<User> findAllUsers() {
        return service.findAllUsers();
    }

    @PostMapping("save_user")
    public String saveUser(@RequestBody User user) {
        service.saveUser(user);
        return "User saved";
    }

    @GetMapping("/{email}")
    public User findUserByEmail(@PathVariable String email) {
        return service.findUserByEmail(email);
    }

    @PutMapping("update_user")
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    @DeleteMapping("delete_user/{email}")
    public void deleteUser(@PathVariable String email) {
        service.deleteUserByEmail(email);
    }

}
