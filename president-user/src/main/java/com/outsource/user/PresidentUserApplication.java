package com.outsource.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PresidentUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(PresidentUserApplication.class, args);
    }

}
