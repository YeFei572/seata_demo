package com.outsource.user.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "mq", ignoreUnknownFields = false)
@PropertySource("application.yml")
public class RabbitProperties {
    private String exchangePayment;
    private String queuePayment;
    private String routeKeyPayment;
}
