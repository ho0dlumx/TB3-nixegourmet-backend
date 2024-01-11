package com.emse.spring.automacorp.dao;

import com.emse.spring.automacorp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderDao extends JpaRepository<Order, Long> {
    List<Order> findByStatus(String status);

    @Query("SELECT SUM(o.total) FROM Order o")
    Double sumTotal();
}