package com.outsource.user.contoller;

import com.outsource.common.entity.HttpResponse;
import com.outsource.user.entity.User;
import com.outsource.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: YeFei
 * @Date: 2020/2/11 13:37
 * @description:
 */
@RestController
public class UserCtrl {


    @Autowired
    private UserService userService;

    @PostMapping(value = "/internal/user/save/{userName}")
    public HttpResponse saveUser(
            @PathVariable("userName")String userName
    ) {
        User user = userService.saveUser(userName);
        HttpResponse httpResponse = new HttpResponse(200, "success", user);
        return httpResponse;
    }
}
