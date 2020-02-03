package com.outsource.payment.feign.impl;

import com.outsource.common.entity.HttpResponse;
import com.outsource.payment.dto.PayOrder;
import com.outsource.payment.feign.OrderFeignService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderFeignServiceImpl implements FallbackFactory<OrderFeignService>, OrderFeignService  {
    @Override
    public OrderFeignService create(Throwable throwable) {
        return null;
    }

    @Override
    public HttpResponse saveInternalOrder(PayOrder payOrder) {
        return null;
    }
}
