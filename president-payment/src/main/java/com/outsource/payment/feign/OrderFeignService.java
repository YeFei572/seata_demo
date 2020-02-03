package com.outsource.payment.feign;

import com.outsource.common.entity.HttpResponse;
import com.outsource.payment.dto.PayOrder;
import com.outsource.payment.feign.impl.OrderFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "president-order", fallbackFactory = OrderFeignServiceImpl.class)
public interface OrderFeignService {

    @PostMapping(value = "/internal/order/save")
    HttpResponse saveInternalOrder(@RequestBody PayOrder payOrder);
}
