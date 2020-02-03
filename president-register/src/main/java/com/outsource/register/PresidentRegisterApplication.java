package com.outsource.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PresidentRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(PresidentRegisterApplication.class, args);
    }

}
