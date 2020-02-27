package com.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Launcher.
 *
 * @author Kong, created on 2020-02-27T11:58.
 * @since 1.0.0-SNAPSHOT
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(new Object[]{App.class}, args);
    }

}
