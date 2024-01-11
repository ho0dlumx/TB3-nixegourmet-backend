package com.emse.spring.automacorp.mapper;

import com.emse.spring.automacorp.dto.OrderItemDto;
import com.emse.spring.automacorp.model.OrderItem;

public class OrderItemMapper {

    public static OrderItemDto toDto(OrderItem orderItem) {
        OrderItemDto dto = new OrderItemDto();
        dto.setId(orderItem.getId());
        dto.setOrderId(orderItem.getOrderId());
        dto.setProductId(orderItem.getProductId());
        dto.setQuantity(orderItem.getQuantity());
        dto.setSubtotal(orderItem.getSubtotal());
        return dto;
    }

    public static OrderItem toEntity(OrderItemDto dto) {
        OrderItem orderItem = new OrderItem();
        orderItem.setId(dto.getId());
        orderItem.setOrderId(dto.getOrderId());
        orderItem.setProductId(dto.getProductId());
        orderItem.setQuantity(dto.getQuantity());
        orderItem.setSubtotal(dto.getSubtotal());
        return orderItem;
    }

    public static void updateEntity(OrderItem orderItem, OrderItemDto dto) {
        orderItem.setOrderId(dto.getOrderId());
        orderItem.setProductId(dto.getProductId());
        orderItem.setQuantity(dto.getQuantity());
        orderItem.setSubtotal(dto.getSubtotal());
        
    }
}
