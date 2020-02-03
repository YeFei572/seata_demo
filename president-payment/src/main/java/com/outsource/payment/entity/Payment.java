package com.outsource.payment.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Data
@Entity
public class Payment extends BaseEntity {

    private BigDecimal amount;
    @JsonSerialize(using = ToStringSerializer.class)
    private Long orderId;

}
