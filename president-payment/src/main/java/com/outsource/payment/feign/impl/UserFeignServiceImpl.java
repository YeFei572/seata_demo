package com.outsource.payment.feign.impl;

import com.outsource.common.entity.HttpResponse;
import com.outsource.payment.feign.UserFeignService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Service;

/**
 * @Author: YeFei
 * @Date: 2020/2/11 13:44
 * @description:
 */
@Service
public class UserFeignServiceImpl implements FallbackFactory<UserFeignService>, UserFeignService {
    @Override
    public UserFeignService create(Throwable throwable) {
        return null;
    }

    @Override
    public HttpResponse saveUser(String userName) {
        return null;
    }
}
