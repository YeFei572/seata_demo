package com.outsource.user.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: YeFei
 * @Date: 2020/2/11 13:36
 * @description:
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
