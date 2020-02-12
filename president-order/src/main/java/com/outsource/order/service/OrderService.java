package com.outsource.order.service;

import com.outsource.common.exception.BusinessException;
import com.outsource.order.entity.PayOrder;
import com.outsource.order.entity.PayOrderRepository;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderService {

    @Autowired
    private PayOrderRepository payOrderRepository;


    public PayOrder saveOrder(PayOrder order) {
        String xid = RootContext.getXID();
        log.info("该条事务在order项目中的xid是： {}", xid);
        if (order.getName().equals("1")) {
            throw new BusinessException("远程异常", 4001);
        }
        return payOrderRepository.save(order);
    }
}
