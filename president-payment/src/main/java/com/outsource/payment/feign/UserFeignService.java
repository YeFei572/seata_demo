package com.outsource.payment.feign;

import com.outsource.common.entity.HttpResponse;
import com.outsource.payment.feign.impl.UserFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author: YeFei
 * @Date: 2020/2/11 13:43
 * @description:
 */
@FeignClient(name = "president-user", fallbackFactory = UserFeignServiceImpl.class)
public interface UserFeignService {

    @PostMapping(value = "/internal/user/save/{userName}")
    HttpResponse saveUser(@PathVariable("userName") String userName);
}
