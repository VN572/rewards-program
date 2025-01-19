package com.rewards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The main entry point for the Spring Boot application.
 * This class starts up the application by running the SpringApplication.run method.
 * It also enables the scanning of JPA repositories in the specified package.
 */

@SpringBootApplication
@EnableJpaRepositories("com.rewards.repository")  // Enable JPA repositories scanning
public class RewardSystemApplication {
    
    /**
     * The main method that starts the Spring Boot application.
     * 
     * @param args Command-line arguments passed during application startup.
     */
    public static void main(String[] args) {
        SpringApplication.run(RewardSystemApplication.class, args);
    }
}
