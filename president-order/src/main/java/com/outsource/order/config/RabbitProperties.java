package com.outsource.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "mq")
public class RabbitProperties {
    private String exchangePayment;
    private String queuePayment;
    private String routeKeyPayment;
}
