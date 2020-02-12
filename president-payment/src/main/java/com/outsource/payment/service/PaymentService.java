package com.outsource.payment.service;

import com.outsource.common.entity.HttpResponse;
import com.outsource.common.exception.BusinessException;
import com.outsource.payment.dto.PayOrder;
import com.outsource.payment.entity.Payment;
import com.outsource.payment.entity.PaymentRepository;
import com.outsource.payment.feign.OrderFeignService;
import com.outsource.payment.feign.UserFeignService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private OrderFeignService orderFeignService;
    @Autowired
    private UserFeignService userFeignService;

    @GlobalTransactional
    public Payment savePayment(Payment payment) {
        PayOrder order = new PayOrder();
        order.setName(payment.getOrderId().toString());
        order.setOrderNo("KEPELFEI2003");
        HttpResponse httpResponse = orderFeignService.saveInternalOrder(order);
        HttpResponse res2 = userFeignService.saveUser(payment.getOrderId().toString());
        String xid = RootContext.getXID();
        log.info("该条事务的xid：{}", xid);
        if (payment.getOrderId() == 2) {
            throw new BusinessException("调用段异常", 4002);
        }
        if (httpResponse.getStatus() == 200 && res2.getStatus() == 200) {
            return paymentRepository.save(payment);
        }
        throw new BusinessException("异常拉", 4003);
    }
}
