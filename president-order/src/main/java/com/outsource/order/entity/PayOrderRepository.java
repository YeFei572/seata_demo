package com.outsource.order.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayOrderRepository extends JpaRepository<PayOrder, Long> {
}
