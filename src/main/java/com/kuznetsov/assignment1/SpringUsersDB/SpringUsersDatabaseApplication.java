package com.kuznetsov.assignment1.SpringUsersDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class SpringUsersDatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringUsersDatabaseApplication.class, args);
    }

}