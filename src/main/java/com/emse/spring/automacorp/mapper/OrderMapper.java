package com.emse.spring.automacorp.mapper;

import com.emse.spring.automacorp.dto.OrderDto;
import com.emse.spring.automacorp.model.Order;

public class OrderMapper {

    public static OrderDto toDto(Order order) {

        OrderDto dto = new OrderDto();
        dto.setOrderId(order.getOrderId());
        dto.setCustomerId(order.getCustomerId());
        dto.setDescription(order.getDescription());
        dto.setStatus(order.getStatus());
        dto.setTotal(order.getTotal());
        dto.setDate(order.getDate());
        dto.setDeliveryAddress(order.getDeliveryAddress());
        dto.setPaymentMethod(order.getPaymentMethod());
        dto.setPickupOrDelivery(order.getPickupOrDelivery());
        return dto;
    }

    public static Order toEntity(OrderDto dto) {
        Order order = new Order();
        order.setOrderId(dto.getOrderId());
        order.setCustomerId(dto.getCustomerId());
        order.setDescription(dto.getDescription());
        order.setStatus(dto.getStatus());
        order.setTotal(dto.getTotal());
        order.setDate(dto.getDate());
        order.setDeliveryAddress(dto.getDeliveryAddress());
        order.setPaymentMethod(dto.getPaymentMethod());
        order.setPickupOrDelivery(dto.getPickupOrDelivery());
        return order;
    }

    public static void updateEntity(Order order, OrderDto dto) {
            order.setCustomerId(dto.getCustomerId());
            order.setDescription(dto.getDescription());
            order.setStatus(dto.getStatus());
            order.setTotal(dto.getTotal());
            order.setDate(dto.getDate());
            order.setDeliveryAddress(dto.getDeliveryAddress());
            order.setPaymentMethod(dto.getPaymentMethod());
            order.setPickupOrDelivery(dto.getPickupOrDelivery());
        
    }

    
}
