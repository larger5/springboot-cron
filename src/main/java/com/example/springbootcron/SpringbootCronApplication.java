package com.example.springbootcron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author hongcunlin
 */
@EnableScheduling
@SpringBootApplication
public class SpringbootCronApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCronApplication.class, args);
    }

}
