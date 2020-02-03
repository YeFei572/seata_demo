package com.outsource.order.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class PayOrder extends BaseEntity {

    private String orderNo;
    private String name;
}
