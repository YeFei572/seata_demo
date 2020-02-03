package com.outsource.order.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Autowired
    private RabbitProperties properties;

    @Bean
    FanoutExchange paymentExchange() {
        return ExchangeBuilder.fanoutExchange(properties.getExchangePayment()).durable(true).build();
    }

    @Bean
    public Queue paymentQueue() {
        return new Queue(properties.getQueuePayment());
    }

    @Bean
    Binding paymentBinding(FanoutExchange paymentExchange, Queue paymentQueue) {
        return BindingBuilder
                .bind(paymentQueue)
                .to(paymentExchange);
    }
}
