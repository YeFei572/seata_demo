package com.outsource.payment.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class RabbitConfig {

    @Autowired
    private RabbitProperties properties;

    @Bean
    FanoutExchange paymentExchange() {
        return (FanoutExchange) ExchangeBuilder.fanoutExchange(properties.getExchangePayment()).durable(true).build();
    }

    @Bean
    public Queue paymentQueue() {
        return QueueBuilder.durable(properties.getQueuePayment()).build();
    }

    @Bean
    Binding paymentBinding(FanoutExchange paymentExchange, Queue paymentQueue) {
        String routingKey = BindingBuilder.bind(paymentQueue).to(paymentExchange).getRoutingKey();
        log.info(routingKey);
        return BindingBuilder
                .bind(paymentQueue)
                .to(paymentExchange);
    }
}
