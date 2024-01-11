package com.emse.spring.automacorp.service;

import com.emse.spring.automacorp.dao.OrderItemDao;
import com.emse.spring.automacorp.dto.OrderItemDto;
import com.emse.spring.automacorp.mapper.OrderItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emse.spring.automacorp.model.OrderItem;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemDao orderItemDao;

    public List<OrderItemDto> findAll() {
        return orderItemDao.findAll().stream()
                .map(OrderItemMapper::toDto)
                .collect(Collectors.toList());
    }

    public OrderItemDto findById(Long id) {
        OrderItem orderItem = orderItemDao.findById(id).orElseThrow(() -> new RuntimeException("OrderItem not found"));
        return OrderItemMapper.toDto(orderItem);
    }

    public OrderItemDto create(OrderItemDto orderItemDto) {
        OrderItem orderItem = OrderItemMapper.toEntity(orderItemDto);
        orderItem = orderItemDao.save(orderItem);
        return OrderItemMapper.toDto(orderItem);
    }

    public OrderItemDto update(Long id, OrderItemDto orderItemDto) {
        OrderItem orderItem = orderItemDao.findById(id).orElseThrow(() -> new RuntimeException("OrderItem not found"));
        OrderItemMapper.updateEntity(orderItem, orderItemDto);
        orderItem = orderItemDao.save(orderItem);
        return OrderItemMapper.toDto(orderItem);
    }

    public long countOrderItems() {
        return orderItemDao.count(); 
    }

    public void delete(Long id) {
        orderItemDao.deleteById(id);
    }

    public List<OrderItemDto> findOrderItemsByOrderId(Long orderId) {
        return orderItemDao.findByOrderId(orderId).stream()
                .map(OrderItemMapper::toDto)
                .collect(Collectors.toList());
    }
}
