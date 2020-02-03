package com.outsource.payment.handler;

import com.outsource.payment.config.RabbitProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PaymentRabbitSender {

    @Autowired
    private RabbitProperties rabbitProperties;
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMessage() {
        amqpTemplate.convertAndSend(rabbitProperties.getExchangePayment(), null, "这是一条来自rabbitmq的消息!");
    }

}
