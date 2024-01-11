package com.emse.spring.automacorp.dao;

import com.emse.spring.automacorp.model.OrderItem;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class OrderItemDaoTest {

    @Autowired
    private OrderItemDao orderItemDao;

    @Test
    public void shouldFindAnOrderItemById() {

        Optional<OrderItem> foundOrderItem = orderItemDao.findById(-1L);

        Assertions.assertThat(foundOrderItem.isPresent()).isTrue();
        foundOrderItem.ifPresent(orderItem -> {
            Assertions.assertThat(orderItem.getOrderId()).isEqualTo(-1L); 
            Assertions.assertThat(orderItem.getProductId()).isEqualTo(-1L);
            Assertions.assertThat(orderItem.getQuantity()).isEqualTo(2); 
            Assertions.assertThat(orderItem.getSubtotal()).isEqualTo(21.98); 
        });
    }
}
