package com.outsource.order.service;

import com.outsource.common.exception.BusinessException;
import com.outsource.order.entity.PayOrder;
import com.outsource.order.entity.PayOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private PayOrderRepository payOrderRepository;


    public PayOrder saveOrder(PayOrder order) {
        if (order.getName().equals("1")) {
            throw new BusinessException("远程异常", 4001);
        }
        return payOrderRepository.save(order);
    }
}
