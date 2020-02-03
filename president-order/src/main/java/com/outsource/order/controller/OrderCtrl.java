package com.outsource.order.controller;

import com.outsource.common.entity.HttpResponse;
import com.outsource.order.entity.PayOrder;
import com.outsource.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderCtrl {

    @Autowired
    private OrderService orderService;


    @PostMapping(value = "/api/v1/order/save")
    public HttpResponse saveOrder(@RequestBody PayOrder payOrder) {
        PayOrder res = orderService.saveOrder(payOrder);
        return new HttpResponse(200, "success", res);
    }

    @PostMapping(value = "/internal/order/save")
    public HttpResponse saveInternalOrder(@RequestBody PayOrder payOrder) {
        PayOrder res = orderService.saveOrder(payOrder);
        return new HttpResponse(200, "success", res);
    }
}
