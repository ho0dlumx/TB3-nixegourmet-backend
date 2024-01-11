package com.emse.spring.automacorp.dao;

import com.emse.spring.automacorp.model.Order;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class OrderDaoTest {

    @Autowired
    private OrderDao orderDao;

    @Test
    public void shouldFindAnOrderById() {

        Optional<Order> foundOrder = orderDao.findById(-1L);

        Assertions.assertThat(foundOrder.isPresent()).isTrue();
        foundOrder.ifPresent(order -> {
            Assertions.assertThat(order.getDescription()).isEqualTo("Pedido de exemplo 1");
            Assertions.assertThat(order.getStatus()).isEqualTo("Delivered");
            Assertions.assertThat(order.getTotal()).isEqualTo(37.97);
        });
    }
}
