package com.emse.spring.automacorp.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer_id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private Double total;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = true)
    private String deliveryAddress;

    @Column(nullable = false)
    private String paymentMethod;

    @Column(nullable = false)
    private String pickupOrDelivery;

    public Order() {
    }

    // Getters
    public Long getOrderId() {
        return orderId;
    }

    public Customer getCustomerId() {
        return customer_id;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public Double getTotal() {
        return total;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPickupOrDelivery() {
        return pickupOrDelivery;
    }

    // Setters
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setCustomerId(Customer customer_id) {
        this.customer_id = customer_id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPickupOrDelivery(String pickupOrDelivery) {
        this.pickupOrDelivery = pickupOrDelivery;
    }
}
