package com.outsource.payment.dto;

import com.outsource.payment.entity.BaseEntity;
import lombok.Data;

@Data
public class PayOrder extends BaseEntity {
    private String orderNo;
    private String name;
}
