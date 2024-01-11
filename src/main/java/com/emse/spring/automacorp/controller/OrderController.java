package com.emse.spring.automacorp.controller;

import com.emse.spring.automacorp.dto.OrderDto;
import com.emse.spring.automacorp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin()
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<OrderDto> getAllOrders() {
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    public OrderDto getOrderById(@PathVariable Long id) {
        return orderService.findById(id);
    }

    @GetMapping("/status/{status}")
    public List<OrderDto> getOrdersByStatus(@PathVariable String status) {
        return orderService.findByStatus(status);
    }


    @PostMapping
    public OrderDto createOrder(@RequestBody OrderDto orderDto) {
        return orderService.create(orderDto);
    }

    @PutMapping("/{id}")
    public OrderDto updateOrder(@PathVariable Long id, @RequestBody OrderDto orderDto) {
        return orderService.update(id, orderDto);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.delete(id);
    }
    
    @GetMapping("/totalRevenue")
    public ResponseEntity<Double> getTotalRevenue() {
        double totalRevenue = orderService.getTotalRevenue();
        return ResponseEntity.ok(totalRevenue);
    }

    @GetMapping("/salesAmount")
    public ResponseEntity<Long> getSalesAmount() {
        long salesAmount = orderService.getSalesAmount();
        return ResponseEntity.ok(salesAmount);
    }
}

