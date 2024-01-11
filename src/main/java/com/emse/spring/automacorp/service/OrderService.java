package com.emse.spring.automacorp.service;

import com.emse.spring.automacorp.dao.OrderDao;
import com.emse.spring.automacorp.dto.OrderDto;
import com.emse.spring.automacorp.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emse.spring.automacorp.model.Order;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public List<OrderDto> findAll() {
        return orderDao.findAll().stream()
                .map(OrderMapper::toDto)
                .collect(Collectors.toList());
    }

    public OrderDto findById(Long id) {
        Order order = orderDao.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        return OrderMapper.toDto(order);
    }

    public List<OrderDto> findByStatus(String status) {
        return orderDao.findByStatus(status).stream()
                .map(OrderMapper::toDto)
                .collect(Collectors.toList());
    }

    public OrderDto create(OrderDto orderDto) {
        Order order = OrderMapper.toEntity(orderDto);
        order = orderDao.save(order);
        return OrderMapper.toDto(order);
    }

    public OrderDto update(Long id, OrderDto orderDto) {
        Order order = orderDao.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        OrderMapper.updateEntity(order, orderDto);
        order = orderDao.save(order);
        return OrderMapper.toDto(order);
    }

    public void delete(Long id) {
        orderDao.deleteById(id);
    }
    public double getTotalRevenue() {
        return orderDao.sumTotal();
    }
    
    public long getSalesAmount() {
        return orderDao.count();
    }

}

