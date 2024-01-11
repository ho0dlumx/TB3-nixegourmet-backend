package com.emse.spring.automacorp.dao;

import com.emse.spring.automacorp.model.Products;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import java.util.Optional;

@DataJpaTest
public class ProductsDaoTest {

    @Autowired
    private ProductsDao productsDao;

    @Test
    public void shouldFindAProductById() {
        Optional<Products> product = productsDao.findById(-1L); 
        Assertions.assertThat(product.isPresent()).isTrue();
        product.ifPresent(p -> {
            Assertions.assertThat(p.getName()).isEqualTo("Produto 1");
            Assertions.assertThat(p.getDescription()).isEqualTo("Descrição do Produto 1");
            Assertions.assertThat(p.getPrice()).isEqualTo(10.99);
            Assertions.assertThat(p.getImg()).isEqualTo("img_produto1.jpg");
        });
    }
}