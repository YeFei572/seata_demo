package com.outsource.payment.controller;

import com.outsource.common.entity.HttpResponse;
import com.outsource.payment.entity.Payment;
import com.outsource.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class PaymentCtrl {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/save")
    public HttpResponse savePayment(@RequestBody Payment payment) throws Exception {
        Payment res = paymentService.savePayment(payment);
        return new HttpResponse(200, "success", res);
    }
}
