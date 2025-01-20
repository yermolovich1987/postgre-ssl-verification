package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class DatabaseChecker implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("###   Executing SQL query to check connectivity...");

        // Example SQL query to check connectivity
        Integer result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);

        // Output the result
        if (result != null && result == 1) {
            System.out.println("###   Successfully connected to the database!");
        } else {
            System.out.println("###   Failed to connect to the database.");
        }
    }
}
