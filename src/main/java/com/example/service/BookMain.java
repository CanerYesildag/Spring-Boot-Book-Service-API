package com.example.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.service.repository")
@SpringBootApplication
public class BookMain {

    public static void main(String[] args) {
        SpringApplication.run(BookMain.class, args);
    }
}
