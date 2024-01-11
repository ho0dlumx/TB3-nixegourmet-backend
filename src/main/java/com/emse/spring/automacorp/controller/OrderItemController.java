package com.emse.spring.automacorp.controller;

import com.emse.spring.automacorp.dto.OrderItemDto;
import com.emse.spring.automacorp.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin()
@RestController
@RequestMapping("/api/order-items")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public List<OrderItemDto> getAllOrderItems() {
        return orderItemService.findAll();
    }

    @GetMapping("/{id}")
    public OrderItemDto getOrderItemById(@PathVariable Long id) {
        return orderItemService.findById(id);
    }

    @GetMapping("/by-order/{orderId}")
    public ResponseEntity<List<OrderItemDto>> getOrderItemsByOrderId(@PathVariable Long orderId) {
        List<OrderItemDto> orderItems = orderItemService.findOrderItemsByOrderId(orderId);
        return ResponseEntity.ok(orderItems);
    }

    @PostMapping
    public OrderItemDto createOrderItem(@RequestBody OrderItemDto orderItemDto) {
        return orderItemService.create(orderItemDto);
    }

    @PutMapping("/{id}")
    public OrderItemDto updateOrderItem(@PathVariable Long id, @RequestBody OrderItemDto orderItemDto) {
        return orderItemService.update(id, orderItemDto);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderItem(@PathVariable Long id) {
        orderItemService.delete(id);
    }
    @GetMapping("/count")
    public ResponseEntity<Long> countOrderItems() {
        long count = orderItemService.countOrderItems();
        return ResponseEntity.ok(count);
}
}


