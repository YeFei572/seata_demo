package com.outsource.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableJpaAuditing
public class PresidentPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PresidentPaymentApplication.class, args);
    }

}
