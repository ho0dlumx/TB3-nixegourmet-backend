package com.emse.spring.automacorp.dto;

import java.time.LocalDate;

import com.emse.spring.automacorp.model.Customer;

public class OrderDto {

    private Long orderId;
    private Customer customer_id;
    private String description;
    private String status;
    private Double total;
    private LocalDate date;
    private String deliveryAddress;
    private String paymentMethod;
    private String pickupOrDelivery;

    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }
    public Customer getCustomerId() { return customer_id; }
    public void setCustomerId(Customer customer_id) { this.customer_id = customer_id; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    public String getDeliveryAddress() { return deliveryAddress; }
    public void setDeliveryAddress(String deliveryAddress) { this.deliveryAddress = deliveryAddress; }
    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
    public String getPickupOrDelivery() { return pickupOrDelivery; }
    public void setPickupOrDelivery(String pickupOrDelivery) { this.pickupOrDelivery = pickupOrDelivery; }
}
