package com.outsource.user.service;

import com.outsource.user.entity.User;
import com.outsource.user.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @Author: YeFei
 * @Date: 2020/2/11 13:38
 * @description:
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(String userName) {
        User user = new User();
        user.setUserName(userName);
        user.setCreateAt(LocalDateTime.now());
        user.setUpdateAt(LocalDateTime.now());
        return userRepository.save(user);
    }
}
