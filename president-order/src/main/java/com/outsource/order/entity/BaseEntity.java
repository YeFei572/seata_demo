package com.outsource.order.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.outsource.common.util.DateUtility;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * id
     */
    private Long id;
    /**
     * create_time
     */
    @CreatedDate
    @JsonFormat(pattern = DateUtility.FULL_DATE_TIME_FORMAT)
    private LocalDateTime createAt;

    /**
     * modify_time
     */
    @LastModifiedDate
    @JsonFormat(pattern = DateUtility.FULL_DATE_TIME_FORMAT)
    private LocalDateTime updateAt;
}
