package com.outsource.payment.controller;

import com.outsource.payment.handler.PaymentRabbitSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitCtrl {

    @Autowired
    private PaymentRabbitSender paymentRabbitSender;

    @GetMapping(value = "/api/v1/sendMessage")
    public String sendMessage2Rabbit() {
        paymentRabbitSender.sendMessage();
        return "发送成功!";
    }
}
