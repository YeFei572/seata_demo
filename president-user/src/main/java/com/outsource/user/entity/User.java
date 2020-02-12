package com.outsource.user.entity;

import lombok.Data;

import javax.persistence.Entity;

/**
 * @Author: YeFei
 * @Date: 2020/2/11 13:31
 * @description:
 */
@Data
@Entity
public class User extends BaseEntity {
    private String userName;
}
