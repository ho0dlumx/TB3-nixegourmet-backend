package com.emse.spring.automacorp.dao;

import com.emse.spring.automacorp.model.Customer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class CustomerDaoTest {

    @Autowired
    private CustomerDao customerDao;

    @Test
    public void shouldFindACustomerById() {

        Optional<Customer> foundCustomer = customerDao.findById(-1L);

        Assertions.assertThat(foundCustomer.isPresent()).isTrue();
        foundCustomer.ifPresent(customer -> {
            Assertions.assertThat(customer.getName()).isEqualTo("John Doe");

        });
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
