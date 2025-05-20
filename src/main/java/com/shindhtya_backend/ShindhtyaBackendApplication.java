package com.shindhtya_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.shindhtya_backend.model")
public class ShindhtyaBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShindhtyaBackendApplication.class, args);
    }
}