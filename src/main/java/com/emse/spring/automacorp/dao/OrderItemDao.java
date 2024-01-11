package com.emse.spring.automacorp.dao;

import com.emse.spring.automacorp.model.OrderItem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemDao extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findByOrderId(Long orderId);
}