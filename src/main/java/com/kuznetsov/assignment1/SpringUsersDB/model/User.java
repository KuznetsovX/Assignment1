package com.kuznetsov.assignment1.SpringUsersDB.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    //required fields
    @NonNull
    @Column(unique = true)
    private String email;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private LocalDate dateOfBirth;

    //optional fields
    private String address;
    private long phoneNumber;

    public User() {}

}
