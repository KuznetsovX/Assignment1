package com.kuznetsov.assignment1.SpringUsersDB.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;
import java.time.Period;

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

    //auto
    @Transient
    @NonNull
    private int age;

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public User() {}

}
